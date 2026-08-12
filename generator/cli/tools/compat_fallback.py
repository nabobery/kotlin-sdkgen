#!/usr/bin/env python3
"""Compare complete emitted Kotlin public-API projections for an exceptional compat run.

The regular `sdkgen compat` command cannot read projections larger than its 64 MiB
input limit. This fallback compares the full `kotlin-public-api/v2` declaration
shape and fails closed on every change that is not an ADR-0020 glue removal.
"""

import argparse
import hashlib
import io
import json
import re
import subprocess
import sys
import tarfile
import tempfile
from collections import Counter
from contextlib import contextmanager
from pathlib import Path

DECLARATION_FIELDS = (
    "kind",
    "visibility",
    "modifiers",
    "typeParameters",
    "superTypes",
    "enumEntries",
)
DECLARATION_MEMBER_FIELDS = ("properties", "functions")
REQUIRED_DECLARATION_FIELDS = ("qualifiedName",) + DECLARATION_FIELDS + DECLARATION_MEMBER_FIELDS
EXPECTED_CATEGORIES = (
    "codec_holders",
    "codec_id_constants",
    "form_and_multipart_codecs",
    "media_type_codec_registries",
    "operation_metadata_values",
    "serializer_declarations",
)
TOOLING_LENSES = ("without-companion-traversal", "with-companion-traversal")
EMITTED_API_PROJECTION_PATH = (
    "generator/engine/src/main/kotlin/com/nabobery/sdkgen/engine/emit/EmittedApiProjection.kt"
)
COMPANION_PROPERTY_TRAVERSAL = "companionObjects(type).flatMap(TypeSpec::propertySpecs)"
COMPANION_FUNCTION_TRAVERSAL = "companionObjects(type).flatMap(TypeSpec::funSpecs)"
COMPANION_OBJECT = re.compile(r"\bcompanion\s+object\b")
FUNCTION_DECLARATION = re.compile(
    r"\b(?:public\s+)?(?:internal\s+)?(?:private\s+)?(?:protected\s+)?(?:override\s+)?fun\s+"
    r"([A-Za-z_][A-Za-z0-9_]*)\s*(?:<[^>{}]*>\s*)?\(",
)


def canonical(value):
    return json.dumps(value, sort_keys=True, separators=(",", ":"))


def read_projection(path):
    contents = path.read_bytes()
    projection = json.loads(contents)
    if projection.get("schemaVersion") != "kotlin-public-api/v2":
        raise ValueError(f"{path} is not a kotlin-public-api/v2 projection")
    if not isinstance(projection.get("declarations"), list):
        raise ValueError(f"{path} does not contain a declarations array")
    return projection, hashlib.sha256(contents).hexdigest()


def run_git(repository_root, arguments):
    completed = subprocess.run(
        ["git", "-C", str(repository_root), *arguments],
        check=False,
        capture_output=True,
    )
    if completed.returncode != 0:
        message = completed.stderr.decode().strip() or completed.stdout.decode().strip()
        raise ValueError(f"git {' '.join(arguments)} failed: {message}")
    return completed.stdout


def derive_companion_traversal(repository_root, reference):
    contents = run_git(repository_root, ["show", f"{reference}:{EMITTED_API_PROJECTION_PATH}"])
    source = contents.decode()
    markers = {
        "companionObjects": "private fun companionObjects(type: TypeSpec)" in source,
        "properties": COMPANION_PROPERTY_TRAVERSAL in source,
        "functions": COMPANION_FUNCTION_TRAVERSAL in source,
    }
    return {
        "ref": reference,
        "sha256": hashlib.sha256(contents).hexdigest(),
        "derivedCompanionTraversal": all(markers.values()),
        "detection": markers,
    }


def validate_provenance(
    repository_root,
    before_lens,
    after_lens,
    before_ref,
    after_ref,
    before_sha256,
    after_sha256,
):
    provenance = {
        "before": derive_companion_traversal(repository_root, before_ref),
        "after": derive_companion_traversal(repository_root, after_ref),
    }
    declared = {
        "before": before_lens == "with-companion-traversal",
        "after": after_lens == "with-companion-traversal",
    }
    declared_sha256 = {"before": before_sha256, "after": after_sha256}
    for label, value in provenance.items():
        value["declaredCompanionTraversal"] = declared[label]
        value["declaredSha256"] = declared_sha256[label]
        if value["sha256"] != declared_sha256[label]:
            raise ValueError(
                f"{label} tooling content hash contradicts {value['ref']}: declared "
                f"{declared_sha256[label]}, derived {value['sha256']}",
            )
        if value["derivedCompanionTraversal"] != declared[label]:
            raise ValueError(
                f"{label} tooling lens contradicts {value['ref']}: declared companion traversal "
                f"{declared[label]}, derived {value['derivedCompanionTraversal']}",
            )
    return provenance


@contextmanager
def materialized_snapshot(repository_root, reference, snapshot_path):
    """Materialize exactly one historic generated snapshot outside the worktree."""
    archive = run_git(repository_root, ["archive", "--format=tar", reference, snapshot_path])
    with tempfile.TemporaryDirectory(prefix="kotlin-sdkgen-compat-pre-") as temporary_directory:
        temporary_root = Path(temporary_directory)
        with tarfile.open(fileobj=io.BytesIO(archive), mode="r:") as contents:
            for member in contents.getmembers():
                destination = temporary_root / member.name
                if not destination.resolve().is_relative_to(temporary_root.resolve()):
                    raise ValueError(f"historic snapshot archive contains unsafe path {member.name}")
            contents.extractall(temporary_root, filter="data")
        source_root = temporary_root / snapshot_path
        if not source_root.is_dir():
            raise ValueError(f"git archive did not materialize {snapshot_path} from {reference}")
        yield source_root


def declaration_index(projection, label):
    index = {}
    for declaration in projection["declarations"]:
        missing = [field for field in REQUIRED_DECLARATION_FIELDS if field not in declaration]
        if missing:
            raise ValueError(
                f"{label} declaration {declaration.get('qualifiedName', '<unnamed>')} is missing {missing}",
            )
        qualified_name = declaration["qualifiedName"]
        if qualified_name in index:
            raise ValueError(f"{label} has duplicate declaration {qualified_name}")
        index[qualified_name] = declaration
    return index


def property_index(declaration, label):
    index = {}
    for property_value in declaration["properties"]:
        name = property_value.get("name")
        if not name:
            raise ValueError(f"{label} property in {declaration['qualifiedName']} has no name")
        if name in index:
            raise ValueError(f"{label} has duplicate property {declaration['qualifiedName']}.{name}")
        index[name] = property_value
    return index


def function_identity(function):
    return canonical(
        {
            "name": function.get("name"),
            "receiverType": function.get("receiverType"),
            "parameters": function.get("parameters"),
        },
    )


def function_index(declaration, label):
    index = {}
    for function in declaration["functions"]:
        identity = function_identity(function)
        if identity in index:
            raise ValueError(f"{label} has duplicate function {declaration['qualifiedName']}.{function.get('name')}")
        index[identity] = function
    return index


def masked_brace_depths(contents, start, end):
    """Yield indexes and brace depths while ignoring Kotlin comments and strings."""
    depth = 0
    index = start
    state = "code"
    while index < end:
        character = contents[index]
        following = contents[index + 1] if index + 1 < end else ""
        triple = contents[index : index + 3]
        if state == "line-comment":
            if character == "\n":
                state = "code"
        elif state == "block-comment":
            if character == "*" and following == "/":
                state = "code"
                index += 1
        elif state == "string":
            if character == "\\":
                index += 1
            elif character == '"':
                state = "code"
        elif state == "triple-string":
            if triple == '\"\"\"':
                state = "code"
                index += 2
        elif state == "character":
            if character == "\\":
                index += 1
            elif character == "'":
                state = "code"
        else:
            if character == "/" and following == "/":
                state = "line-comment"
                index += 1
            elif character == "/" and following == "*":
                state = "block-comment"
                index += 1
            elif triple == '\"\"\"':
                state = "triple-string"
                index += 2
            elif character == '"':
                state = "string"
            elif character == "'":
                state = "character"
            elif character == "{":
                depth += 1
            elif character == "}":
                depth -= 1
        yield index, depth
        index += 1


def matching_delimiter(contents, opening_index, closing_character, limit):
    depth = 0
    opening_character = contents[opening_index]
    for index, _ in masked_brace_depths(contents, opening_index, limit):
        character = contents[index]
        if character == opening_character:
            depth += 1
        elif character == closing_character:
            depth -= 1
            if depth == 0:
                return index
    return None


def first_opening_brace(contents, start, end):
    for index, _ in masked_brace_depths(contents, start, end):
        if contents[index] == "{":
            return index
    return None


def direct_block(contents, start, end, expression):
    depth = 0
    for index, current_depth in masked_brace_depths(contents, start, end):
        depth = current_depth
        if depth != 0:
            continue
        match = expression.match(contents, index)
        if match is None:
            continue
        opening = first_opening_brace(contents, match.end(), end)
        if opening is None:
            return None
        closing = matching_delimiter(contents, opening, "}", end)
        if closing is None:
            return None
        return match, opening, closing
    return None


def type_block(contents, type_names):
    start = 0
    end = len(contents)
    for type_name in type_names:
        expression = re.compile(rf"\b(?:class|interface|object)\s+{re.escape(type_name)}\b")
        match = expression.search(contents, start, end)
        if match is None:
            return None
        opening = first_opening_brace(contents, match.end(), end)
        if opening is None:
            return None
        closing = matching_delimiter(contents, opening, "}", end)
        if closing is None:
            return None
        start = opening + 1
        end = closing
    return start, end


def type_declaration(contents, type_names):
    start = 0
    match = None
    for type_name in type_names:
        expression = re.compile(rf"\b(?:class|interface|object)\s+{re.escape(type_name)}\b")
        match = expression.search(contents, start)
        if match is None:
            return None
        start = match.end()
    return match


def top_level_parameters(contents):
    parameters = []
    segment_start = 0
    parentheses = brackets = angles = 0
    for index, character in enumerate(contents):
        if character == "(":
            parentheses += 1
        elif character == ")":
            parentheses -= 1
        elif character == "[":
            brackets += 1
        elif character == "]":
            brackets -= 1
        elif character == "<":
            angles += 1
        elif character == ">":
            angles -= 1
        elif character == "," and parentheses == brackets == angles == 0:
            parameters.append(contents[segment_start:index].strip())
            segment_start = index + 1
    final = contents[segment_start:].strip()
    return parameters + ([final] if final else [])


def function_header(contents, match, end):
    opening = contents.find("(", match.start(), match.end() + 1)
    closing = matching_delimiter(contents, opening, ")", end)
    if closing is None:
        return None
    signature_end = closing + 1
    while signature_end < end and contents[signature_end].isspace():
        signature_end += 1
    return_type = None
    if signature_end < end and contents[signature_end] == ":":
        return_start = signature_end + 1
        signature_end = return_start
        while signature_end < end and contents[signature_end] not in "={\n":
            signature_end += 1
        return_type = contents[return_start:signature_end].strip()
    return contents[match.start() : signature_end].strip(), contents[opening + 1 : closing], return_type


def top_level_before_default(contents):
    parentheses = brackets = angles = 0
    for index, character in enumerate(contents):
        if character == "(":
            parentheses += 1
        elif character == ")":
            parentheses -= 1
        elif character == "[":
            brackets += 1
        elif character == "]":
            brackets -= 1
        elif character == "<":
            angles += 1
        elif character == ">":
            angles -= 1
        elif character == "=" and parentheses == brackets == angles == 0:
            return contents[:index].strip()
    return contents.strip()


def has_top_level_default(contents):
    return top_level_before_default(contents) != contents.strip()


def type_fingerprint(contents):
    unqualified = re.sub(r"(?:[A-Za-z_][A-Za-z0-9_]*\.)+([A-Za-z_][A-Za-z0-9_]*)", r"\1", contents)
    return re.sub(r"\s+", "", unqualified)


def projected_type_text(type_value):
    base = type_value["simpleName"]
    if type_value["packageName"]:
        base = f"{type_value['packageName']}.{base}"
    arguments = type_value["arguments"]
    if arguments:
        base += "<" + ", ".join(projected_type_text(argument) for argument in arguments) + ">"
    return base + ("?" if type_value["nullable"] else "")


def source_parameter_type(parameter, name):
    match = re.search(rf"`?{re.escape(name)}`?\s*:\s*(.*)", parameter, re.DOTALL)
    return None if match is None else top_level_before_default(match.group(1))


def source_declared_visibility(source_modifiers):
    found = re.search(r"\b(public|internal|private|protected)\b", source_modifiers)
    return found.group(1) if found else "public"


def matches_projected_signature(projected, source_modifiers, source_parameters, source_return_type):
    if projected["typeParameters"] or len(projected["parameters"]) != len(source_parameters):
        return False
    if projected.get("receiverType") is not None:
        # FUNCTION_DECLARATION cannot locate receiver functions, so a projected
        # receiver function must never claim a receiver-less source match.
        return False
    if projected.get("visibility", "public") != source_declared_visibility(source_modifiers):
        return False
    if bool(projected.get("isSuspend")) != bool(re.search(r"\bsuspend\b", source_modifiers)):
        return False
    for expected, actual in zip(projected["parameters"], source_parameters):
        name = expected["name"]
        source_type = source_parameter_type(actual, name)
        if source_type is None:
            return False
        if expected["hasDefaultValue"] != has_top_level_default(actual):
            return False
        if expected["isVararg"] != actual.lstrip().startswith("vararg "):
            return False
        if type_fingerprint(source_type) != type_fingerprint(projected_type_text(expected["type"])):
            return False
    return (
        source_return_type is not None
        and type_fingerprint(source_return_type) == type_fingerprint(projected_type_text(projected["returnType"]))
    )


def source_path_for_declaration(source_root, qualified_name):
    segments = qualified_name.split(".")
    for type_start in range(1, len(segments)):
        path = source_root / Path(*segments[:type_start]) / f"{segments[type_start]}.kt"
        if path.is_file():
            return path, ".".join(segments[:type_start]), segments[type_start:]
    return None


def line_number(contents, offset):
    return contents.count("\n", 0, offset) + 1


def verify_preexisting_companion_member(source_root, qualified_name, function, contents_cache):
    location = source_path_for_declaration(source_root, qualified_name)
    if location is None:
        return {"result": "unmatched", "reason": "declaring generated file was not found"}
    path, package_name, type_names = location
    contents = contents_cache.setdefault(path, path.read_text())
    if re.search(rf"^package\s+{re.escape(package_name)}\s*$", contents, re.MULTILINE) is None:
        return {"result": "unmatched", "reason": "declaring generated file has a different package"}
    declaration = type_declaration(contents, type_names)
    if declaration is None:
        return {"result": "unmatched", "reason": "declaring type was not found in its generated file"}
    block = type_block(contents, type_names)
    companion = direct_block(contents, block[0], block[1], COMPANION_OBJECT) if block is not None else None
    if companion is None:
        companion_match = COMPANION_OBJECT.search(contents, declaration.end())
        if companion_match is None:
            return {"result": "unmatched", "reason": "declaring type has no companion object"}
        companion_opening = first_opening_brace(contents, companion_match.end(), len(contents))
        if companion_opening is None:
            return {"result": "unmatched", "reason": "declaring type companion object has no body"}
        companion_closing = matching_delimiter(contents, companion_opening, "}", len(contents))
        if companion_closing is None:
            return {"result": "unmatched", "reason": "declaring type companion object body is unbalanced"}
        companion = companion_match, companion_opening, companion_closing
    companion_start, companion_end = companion[1] + 1, companion[2]
    for match in FUNCTION_DECLARATION.finditer(contents, companion_start, companion_end):
        if match.group(1) != function["name"]:
            continue
        header = function_header(contents, match, companion_end)
        line_start = contents.rfind("\n", 0, match.start()) + 1
        fun_keyword = re.search(r"\bfun\b", contents[line_start : match.end()])
        source_modifiers = contents[line_start : line_start + fun_keyword.start()] if fun_keyword else ""
        if header is None or not matches_projected_signature(
            function,
            source_modifiers,
            top_level_parameters(header[1]),
            header[2],
        ):
            continue
        offset = match.start()
        return {
            "result": "matched",
            "source": {
                "file": path.relative_to(source_root).as_posix(),
                "line": line_number(contents, offset),
                "offset": offset,
                "signature": header[0],
            },
        }
    return {
        "result": "unmatched",
        "reason": "exact projected member signature was not found in the declaring type companion object",
    }


def normalize_companion_lens(before, after, before_lens, after_lens, source_root, snapshot_provenance):
    """Return lens-symmetric projections and exhaustive pre-existence evidence.

    A post-only function is stripped only after its exact declaring type and
    companion-object member have been located in the historic generated source.
    Candidate names are not trusted: every post-only function is checked, and an
    unmatched function remains in the normalized diff as an API addition.
    """
    if before_lens == after_lens:
        return before, after, {
            "status": "not applied, lenses were already symmetric",
            "reason": "Both projections use the same derived companion-traversal behavior.",
            "strippedEntries": {"before": 0, "after": 0},
            "evidence": {"candidateEntries": [], "perCategory": {}},
        }
    if (before_lens, after_lens) != ("without-companion-traversal", "with-companion-traversal"):
        raise ValueError(
            "cannot safely normalize projections with this companion-traversal ordering: "
            f"before={before_lens}, after={after_lens}",
        )

    before_declarations = declaration_index(before, "before")
    after_declarations = declaration_index(after, "after")
    source_contents = {}
    verified_members = set()
    candidate_entries = []
    per_category = {}
    for qualified_name in sorted(before_declarations.keys() & after_declarations.keys()):
        previous_functions = function_index(before_declarations[qualified_name], "before")
        current_functions = function_index(after_declarations[qualified_name], "after")
        for identity in sorted(current_functions.keys() - previous_functions.keys()):
            function = current_functions[identity]
            evidence = verify_preexisting_companion_member(
                source_root,
                qualified_name,
                function,
                source_contents,
            )
            category = function["name"]
            counts = per_category.setdefault(category, {"matched": 0, "unmatched": 0})
            counts[evidence["result"]] += 1
            entry = {
                "container": qualified_name,
                "projectedSignature": function,
                "result": evidence["result"],
            }
            if evidence["result"] == "matched":
                entry["source"] = evidence["source"]
                verified_members.add(canonical({"container": qualified_name, "function": function}))
            else:
                entry["reason"] = evidence["reason"]
            candidate_entries.append(entry)

    def strip(projection):
        normalized = json.loads(json.dumps(projection))
        stripped = 0
        for declaration in normalized["declarations"]:
            qualified_name = declaration["qualifiedName"]
            original_functions = declaration["functions"]
            declaration["functions"] = [
                function
                for function in original_functions
                if canonical({"container": qualified_name, "function": function}) not in verified_members
            ]
            stripped += len(original_functions) - len(declaration["functions"])
        return normalized, stripped

    normalized_before, before_stripped = strip(before)
    normalized_after, after_stripped = strip(after)
    matched = sum(counts["matched"] for counts in per_category.values())
    unmatched = sum(counts["unmatched"] for counts in per_category.values())
    return normalized_before, normalized_after, {
        "status": "applied",
        "reason": (
            "The before projection predates companion traversal while the after projection includes it; "
            "only post-only functions verified verbatim in the historic declaring type companion object are removed."
        ),
        "strippedEntries": {"before": before_stripped, "after": after_stripped},
        "evidence": {
            "preSnapshot": snapshot_provenance,
            "candidateCount": len(candidate_entries),
            "matchedCount": matched,
            "unmatchedCount": unmatched,
            "perCategory": dict(sorted(per_category.items())),
            "candidateEntries": candidate_entries,
        },
    }


def member_event(container, member_name, before=None, after=None):
    event = {"container": container, member_name: before if before is not None else after}
    if before is not None and after is not None:
        event["before"] = before
        event["after"] = after
    return event


def simple_type_name(property_value):
    type_value = property_value.get("type", {})
    return type_value.get("simpleName", "")


def expected_removed_declaration(declaration):
    qualified_name = declaration["qualifiedName"]
    if qualified_name.endswith(".Serializer") or qualified_name.endswith("Serializer"):
        return "serializer_declarations"
    if "Codecs" in qualified_name:
        return "codec_holders"
    return None


def expected_removed_property(container, property_value):
    name = property_value["name"]
    lower_name = name.lower()
    if "formcodec" in lower_name or "multipartcodec" in lower_name:
        return "form_and_multipart_codecs"
    if "codecid" in lower_name or "codec_id" in lower_name:
        return "codec_id_constants"
    if "registry" in lower_name:
        return "media_type_codec_registries"
    if simple_type_name(property_value) == "OperationMetadata":
        return "operation_metadata_values"
    if "Codecs" in container:
        return "codec_holders"
    return None


def append_event(events, unexpected, category_counts, event_type, event, category=None):
    events[event_type].append(event)
    if category is None:
        unexpected.append({"type": event_type, **event})
    else:
        category_counts[category] += 1


def compare(before, after):
    before_declarations = declaration_index(before, "before")
    after_declarations = declaration_index(after, "after")
    events = {
        "removedDeclarations": [],
        "addedDeclarations": [],
        "changedDeclarationFields": [],
        "removedProperties": [],
        "addedProperties": [],
        "changedProperties": [],
        "removedFunctions": [],
        "addedFunctions": [],
        "changedFunctions": [],
    }
    unexpected = []
    category_counts = Counter()

    for qualified_name in sorted(before_declarations.keys() - after_declarations.keys()):
        declaration = before_declarations[qualified_name]
        append_event(
            events,
            unexpected,
            category_counts,
            "removedDeclarations",
            declaration,
            expected_removed_declaration(declaration),
        )

    for qualified_name in sorted(after_declarations.keys() - before_declarations.keys()):
        declaration = after_declarations[qualified_name]
        append_event(events, unexpected, category_counts, "addedDeclarations", declaration)

    for qualified_name in sorted(before_declarations.keys() & after_declarations.keys()):
        previous = before_declarations[qualified_name]
        current = after_declarations[qualified_name]
        for field in DECLARATION_FIELDS:
            if previous[field] != current[field]:
                append_event(
                    events,
                    unexpected,
                    category_counts,
                    "changedDeclarationFields",
                    {
                        "qualifiedName": qualified_name,
                        "field": field,
                        "before": previous[field],
                        "after": current[field],
                    },
                )

        previous_properties = property_index(previous, "before")
        current_properties = property_index(current, "after")
        for name in sorted(previous_properties.keys() - current_properties.keys()):
            property_value = previous_properties[name]
            append_event(
                events,
                unexpected,
                category_counts,
                "removedProperties",
                member_event(qualified_name, "property", before=property_value),
                expected_removed_property(qualified_name, property_value),
            )
        for name in sorted(current_properties.keys() - previous_properties.keys()):
            append_event(
                events,
                unexpected,
                category_counts,
                "addedProperties",
                member_event(qualified_name, "property", after=current_properties[name]),
            )
        for name in sorted(previous_properties.keys() & current_properties.keys()):
            if previous_properties[name] != current_properties[name]:
                append_event(
                    events,
                    unexpected,
                    category_counts,
                    "changedProperties",
                    member_event(
                        qualified_name,
                        "property",
                        before=previous_properties[name],
                        after=current_properties[name],
                    ),
                )

        previous_functions = function_index(previous, "before")
        current_functions = function_index(current, "after")
        for identity in sorted(previous_functions.keys() - current_functions.keys()):
            append_event(
                events,
                unexpected,
                category_counts,
                "removedFunctions",
                member_event(qualified_name, "function", before=previous_functions[identity]),
            )
        for identity in sorted(current_functions.keys() - previous_functions.keys()):
            append_event(
                events,
                unexpected,
                category_counts,
                "addedFunctions",
                member_event(qualified_name, "function", after=current_functions[identity]),
            )
        for identity in sorted(previous_functions.keys() & current_functions.keys()):
            if previous_functions[identity] != current_functions[identity]:
                append_event(
                    events,
                    unexpected,
                    category_counts,
                    "changedFunctions",
                    member_event(
                        qualified_name,
                        "function",
                        before=previous_functions[identity],
                        after=current_functions[identity],
                    ),
                )

    return events, unexpected, category_counts


def projection_with_functions(functions):
    return {
        "schemaVersion": "kotlin-public-api/v2",
        "declarations": [
            {
                "qualifiedName": "example.Widget",
                "kind": "class",
                "visibility": "public",
                "modifiers": [],
                "typeParameters": [],
                "superTypes": [],
                "enumEntries": [],
                "properties": [],
                "functions": functions,
            },
        ],
    }


def synthetic_build_function():
    return {
        "name": "build",
        "visibility": "public",
        "receiverType": None,
        "parameters": [],
        "returnType": {"packageName": "example", "simpleName": "Widget", "arguments": [], "nullable": False},
        "isSuspend": False,
        "typeParameters": [],
    }


def synthetic_mask_function():
    return {
        **synthetic_build_function(),
        "name": "mask",
    }


def synthetic_of_function():
    return {
        **synthetic_build_function(),
        "name": "of",
        "parameters": [
            {
                "name": "value",
                "type": {"packageName": "kotlin", "simpleName": "String", "arguments": [], "nullable": False},
                "hasDefaultValue": False,
                "isVararg": False,
            },
        ],
    }


def write_text(path, contents):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(contents)


def selftest_git(repository_root, *arguments):
    completed = subprocess.run(["git", "-C", str(repository_root), *arguments], check=False, capture_output=True)
    if completed.returncode != 0:
        raise AssertionError(completed.stderr.decode())


def run_selftest():
    with tempfile.TemporaryDirectory(prefix="compat-fallback-selftest-") as temporary_directory:
        repository_root = Path(temporary_directory)
        selftest_git(repository_root, "init")
        selftest_git(repository_root, "config", "user.email", "compat-selftest@example.invalid")
        selftest_git(repository_root, "config", "user.name", "compat fallback selftest")
        projection_path = repository_root / EMITTED_API_PROJECTION_PATH
        legacy_projection = "private fun declaration(type: TypeSpec) = type.funSpecs\n"
        write_text(projection_path, legacy_projection)
        write_text(
            repository_root / "snapshots/pre/example/Widget.kt",
            """package example

public class Widget {
  public companion object {
    public fun of(value: String): Widget = Widget()

    internal fun mask(): Widget = Widget()
  }
}
""",
        )
        preexisting = verify_preexisting_companion_member(
            repository_root / "snapshots/pre",
            "example.Widget",
            synthetic_of_function(),
            {},
        )
        if preexisting["result"] != "matched":
            raise AssertionError(f"synthetic companion source did not verify an exact member signature: {preexisting}")
        write_text(
            repository_root / "snapshots/pre/example/Narrowed.kt",
            """package example

public class Narrowed {
  public companion object {
    internal fun of(value: String): Narrowed = Narrowed()
  }
}
""",
        )
        narrowed_projection = dict(synthetic_of_function())
        narrowed_projection["returnType"] = {
            "packageName": "example",
            "simpleName": "Narrowed",
            "arguments": [],
            "nullable": False,
        }
        near_match = verify_preexisting_companion_member(
            repository_root / "snapshots/pre",
            "example.Narrowed",
            narrowed_projection,
            {},
        )
        if near_match["result"] != "unmatched":
            raise AssertionError(
                f"visibility near-match must not verify: projected public vs source internal gave {near_match}",
            )
        selftest_git(repository_root, "add", ".")
        selftest_git(repository_root, "commit", "-m", "legacy projection")
        selftest_git(repository_root, "tag", "legacy")
        write_text(
            projection_path,
            "\n".join(
                (
                    "private fun companionObjects(type: TypeSpec) = type.typeSpecs",
                    f"val properties = type.propertySpecs + {COMPANION_PROPERTY_TRAVERSAL}",
                    f"val functions = type.funSpecs + {COMPANION_FUNCTION_TRAVERSAL}",
                    "",
                ),
            ),
        )
        selftest_git(repository_root, "add", ".")
        selftest_git(repository_root, "commit", "-m", "companion projection")
        selftest_git(repository_root, "tag", "current")
        before = repository_root / "before.json"
        after = repository_root / "after.json"
        before.write_text(json.dumps(projection_with_functions([])))
        after.write_text(
            json.dumps(projection_with_functions([synthetic_build_function(), synthetic_mask_function()])),
        )
        legacy_sha256 = derive_companion_traversal(repository_root, "legacy")["sha256"]
        current_sha256 = derive_companion_traversal(repository_root, "current")["sha256"]
        unmatched_report = repository_root / "unmatched-report.json"
        command = [
            sys.executable,
            str(Path(__file__).resolve()),
            str(before),
            str(after),
            str(unmatched_report),
            "--before-tooling-lens",
            "without-companion-traversal",
            "--after-tooling-lens",
            "with-companion-traversal",
            "--before-tooling-ref",
            "legacy",
            "--after-tooling-ref",
            "current",
            "--before-tooling-sha256",
            legacy_sha256,
            "--after-tooling-sha256",
            current_sha256,
            "--pre-snapshot-ref",
            "legacy",
            "--pre-snapshot-path",
            "snapshots/pre",
            "--repository-root",
            str(repository_root),
        ]
        unmatched = subprocess.run(command, check=False, capture_output=True, text=True)
        if unmatched.returncode != 1:
            raise AssertionError(f"unmatched candidate should fail the gate: {unmatched.stderr}{unmatched.stdout}")
        unmatched_evidence = json.loads(unmatched_report.read_text())
        candidates = {
            entry["projectedSignature"]["name"]: entry
            for entry in unmatched_evidence["normalization"]["evidence"]["candidateEntries"]
        }
        if unmatched_evidence["result"] != "unexpected-diff" or candidates["build"]["result"] != "unmatched":
            raise AssertionError("unmatched build candidate was incorrectly stripped")
        if candidates["mask"]["result"] != "unmatched":
            raise AssertionError(
                "visibility-mismatched mask candidate must survive normalization end-to-end: "
                f"{candidates['mask']}",
            )
        surviving = {
            function["name"]
            for function in json.loads(after.read_text())["declarations"][0]["functions"]
        }
        added_names = {
            event["function"]["name"]
            for event in unmatched_evidence.get("addedFunctions", [])
        }
        if added_names != surviving:
            raise AssertionError(
                f"both unmatched candidates must report as added functions: {added_names} != {surviving}",
            )
        contradiction_report = repository_root / "contradiction-report.json"
        contradiction_command = command.copy()
        contradiction_command[contradiction_command.index(str(unmatched_report))] = str(contradiction_report)
        lens_index = contradiction_command.index("--before-tooling-lens") + 1
        contradiction_command[lens_index] = "with-companion-traversal"
        contradiction = subprocess.run(
            contradiction_command,
            check=False,
            capture_output=True,
            text=True,
        )
        if (
            contradiction.returncode != 2
            or contradiction_report.exists()
            or "tooling lens contradicts" not in contradiction.stderr
        ):
            raise AssertionError("mislabeled companion traversal provenance did not fail closed")
        tampered_report = repository_root / "tampered-report.json"
        tampered_command = command.copy()
        tampered_command[tampered_command.index(str(unmatched_report))] = str(tampered_report)
        sha_index = tampered_command.index("--before-tooling-sha256") + 1
        tampered_command[sha_index] = "0" * 64
        tampered = subprocess.run(tampered_command, check=False, capture_output=True, text=True)
        if (
            tampered.returncode != 2
            or tampered_report.exists()
            or "content hash contradicts" not in tampered.stderr
        ):
            raise AssertionError("tampered declared tooling hash did not fail closed")
    print(
        "selftest passed: unmatched and visibility-mismatched companion candidates survive normalization "
        "end-to-end; visibility near-match rejected; mislabeled provenance and tampered tooling hash fail closed",
    )
    return 0


def main():
    if sys.argv[1:] == ["--selftest"]:
        return run_selftest()
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("before", type=Path)
    parser.add_argument("after", type=Path)
    parser.add_argument("output", type=Path)
    parser.add_argument("--before-tooling-lens", choices=TOOLING_LENSES, required=True)
    parser.add_argument("--after-tooling-lens", choices=TOOLING_LENSES, required=True)
    parser.add_argument("--before-tooling-ref", required=True)
    parser.add_argument("--after-tooling-ref", required=True)
    parser.add_argument("--before-tooling-sha256", required=True)
    parser.add_argument("--after-tooling-sha256", required=True)
    parser.add_argument("--pre-snapshot-ref", required=True)
    parser.add_argument("--pre-snapshot-path", required=True)
    parser.add_argument("--repository-root", type=Path, default=Path.cwd())
    arguments = parser.parse_args()

    repository_root = arguments.repository_root.resolve()
    if not repository_root.is_dir():
        raise ValueError(f"repository root does not exist: {repository_root}")
    provenance = validate_provenance(
        repository_root,
        arguments.before_tooling_lens,
        arguments.after_tooling_lens,
        arguments.before_tooling_ref,
        arguments.after_tooling_ref,
        arguments.before_tooling_sha256,
        arguments.after_tooling_sha256,
    )
    before, before_hash = read_projection(arguments.before)
    after, after_hash = read_projection(arguments.after)
    raw_events, raw_unexpected, raw_category_counts = compare(before, after)
    snapshot_provenance = {
        "ref": arguments.pre_snapshot_ref,
        "path": arguments.pre_snapshot_path,
        "materialization": "git archive into a temporary directory",
    }
    with materialized_snapshot(
        repository_root,
        arguments.pre_snapshot_ref,
        arguments.pre_snapshot_path,
    ) as source_root:
        normalized_before, normalized_after, normalization = normalize_companion_lens(
            before,
            after,
            arguments.before_tooling_lens,
            arguments.after_tooling_lens,
            source_root,
            snapshot_provenance,
        )
    events, unexpected, category_counts = compare(normalized_before, normalized_after)
    report = {
        "method": "fallback complete emitted-source API diff",
        "schemaVersion": "kotlin-public-api/v2",
        "expectedRemovalCategories": list(EXPECTED_CATEGORIES),
        "inputs": {
            "before": {
                "path": str(arguments.before),
                "sha256": before_hash,
                "generation": before.get("generation"),
                "toolingProvenance": provenance["before"],
            },
            "after": {
                "path": str(arguments.after),
                "sha256": after_hash,
                "generation": after.get("generation"),
                "toolingProvenance": provenance["after"],
            },
        },
        "unnormalizedLensDiff": {
            "unexpectedDiffs": len(raw_unexpected),
            "expectedRemovalCategoriesFound": dict(sorted(raw_category_counts.items())),
            "eventCounts": {event_type: len(entries) for event_type, entries in raw_events.items() if entries},
        },
        "normalization": normalization,
        "caveat": (
            "Comparisons that cross be1c45105 must use lens-symmetric projection tooling; otherwise companion "
            "members produce spurious compatibility differences. This emitted-source lens remains distinct from "
            "the compiler-plugin-synthesized Model.Companion.serializer() visible to JVM ABI tooling."
        ),
        "result": "only-expected-adr-0020-removals" if not unexpected else "unexpected-diff",
        "expectedRemovalCategoriesFound": dict(sorted(category_counts.items())),
        "unexpectedDiffs": unexpected,
        **events,
    }
    arguments.output.write_text(json.dumps(report, indent=2) + "\n")
    print(
        json.dumps(
            {
                "result": report["result"],
                "expectedRemovalCategoriesFound": report["expectedRemovalCategoriesFound"],
                "unexpectedDiffs": len(unexpected),
            },
            sort_keys=True,
        ),
    )
    return 0 if not unexpected else 1


if __name__ == "__main__":
    try:
        sys.exit(main())
    except (OSError, ValueError, json.JSONDecodeError, tarfile.TarError) as error:
        print(f"compat fallback failed: {error}", file=sys.stderr)
        sys.exit(2)

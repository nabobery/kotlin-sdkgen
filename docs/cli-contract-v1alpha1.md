# SDKGen CLI `diff` and `explain` contract

Phase 2 adds two read-only commands to the Phase 1 CLI contract:

```shell
sdkgen diff --from manifest-old.json --to manifest-new.json --format json
sdkgen diff --from sdkgen.lock --to sdkgen.lock --format human
sdkgen explain ChatRequest --config sdkgen.yaml --format json
sdkgen explain --config sdkgen.yaml --pointer '#/components/schemas/ProviderOptions'
```

Both commands emit one document per invocation when `--format json` is selected.
`contractVersion` is always `v1alpha1`. Set-like JSON arrays are sorted before emission, while
`overlays` retain their declared order because overlay application is ordered. Repeating a command
over the same inputs produces byte-identical output. Human output
is intended for review and is not a parsing contract.

## Exit codes

| Code | Meaning                                                                                                 |
| ---: | ------------------------------------------------------------------------------------------------------- |
|    0 | The command completed and found no differences, or a requested explanation was found.                   |
|    1 | The command completed but reported differences, an unmatched explanation, or an input diagnostic.       |
|    2 | Command-line usage is invalid (missing `--from`/`--to`, unknown option, or missing explanation target). |

When a parser-level usage error includes `--format json` (or `--format=json`), the CLI emits one
`v1alpha1` diagnostics document with `SDKGEN-CLI-USAGE`, severity `error`, and exit code `2`; it
does not mix human usage text into stdout.

## `diff` JSON

```json
{
    "contractVersion": "v1alpha1",
    "status": "ok|changes",
    "command": "diff",
    "fromKind": "manifest|config|lock",
    "toKind": "manifest|config|lock",
    "semanticComparison": "unchanged|changed|unavailable",
    "apiImpact": "none|non-breaking|potentially-breaking|breaking",
    "warningsAsErrors": false,
    "warningAllowlist": [],
    "truncated": false,
    "unavailableDimensions": [],
    "changes": [
        {
            "kind": "configuration|effective-contract|generated-semantic|kotlin-api",
            "subject": "declarationModelSha256|source|...",
            "status": "added|removed|changed",
            "impact": "non-breaking|potentially-breaking|breaking",
            "from": "optional previous value",
            "to": "optional next value"
        }
    ],
    "diagnostics": [
        {
            "code": "SDKGEN-WARNING",
            "rule": "SDKGEN-WARNING",
            "severity": "warning",
            "message": "optional warning",
            "sourcePointer": {
                "documentUri": "sdkgen://source/openapi.yaml",
                "pointer": "/paths"
            }
        }
    ]
}
```

`--from` and `--to` accept a generated `manifest.json`, an `sdkgen.lock`, or a
configuration file. Configuration inputs are resolved and generated in isolated temporary
outputs using the same engine and lock model as `check`; they are never rewritten. Manifest
inputs compare the effective contract identity (`source`, references, overlays, generator,
KotlinPoet version, compatibility profiles, plugins, tools, and targets), and the declaration-model
digest. The generated manifest records tool identities as `tools: [{"id":"kotlinpoet","version":"2.3.0"}]`;
lock and manifest operands compare this set ordered by tool identity rather than treating tools as unavailable.
The Kotlin file paths/hashes declared by the manifest are also compared. Manifest files and declared file
entries are bounded (at most 10,000 file entries and 16 MiB per manifest); paths must be relative,
canonical, unique, and traversal-free. The CLI does not
walk the manifest's parent
directory or follow undeclared files. Lock inputs compare the same typed dimensions where the lock
contains them; dimensions absent from either operand are reported in `unavailableDimensions` rather
than being coerced to empty strings or empty collections. Semantic/API comparison is `unavailable`
because a lock intentionally does not contain generated declarations.

The diff report is bounded for automation: at most 100 changes and 100 diagnostics are emitted.
When more data exists, `truncated` is `true`. `--warnings-as-errors` (or an effective config policy
when comparing a config snapshot) escalates only diagnostics whose severity is `warning`; a config
warning allowlist remains effective unless the explicit flag is supplied. Errors remain errors and
unknown severities are not promoted. The JSON report's `warningAllowlist` is the sorted union of
allowlists available on the two operands; an unavailable operand contributes no entries.

The `kotlin-api` classification is conservative: removed Kotlin files are breaking, added files
are non-breaking, and changed files are potentially breaking. A changed effective contract or
declaration model is also reported as potentially breaking because the CLI does not infer source
compatibility from a hash alone.

## `explain` JSON

```json
{
    "contractVersion": "v1alpha1",
    "status": "ok",
    "command": "explain",
    "query": "SDKGEN-PROJECTION-UNSUPPORTED-DOCUMENT",
    "warningsAsErrors": false,
    "traces": [
        {
            "kind": "diagnostic|symbol",
            "name": "diagnostic code or symbol id",
            "diagnosticCode": "optional diagnostic code",
            "reason": "engine explanation",
            "naming": {
                "requested": "ChatRequest",
                "resolved": "ChatRequest",
                "strategy": "declaration|diagnostic"
            },
            "origin": {
                "documentUri": "file:///...",
                "jsonPointer": "/components/schemas/ProviderOptions"
            },
            "overlays": [{ "id": "overlay-id", "canonicalUri": "file:///..." }]
        }
    ],
    "diagnostics": []
}
```

`explain` uses the engine's read-only analysis result. A diagnostic code, projected Kotlin symbol,
generated exclusion symbol, or exact source JSON pointer can be queried. Each symbol trace reports
the actual resolved Kotlin declaration name and the source pointer returned by projection. Overlay
provenance is limited to overlays whose applied actions affect that pointer: an action is attached
when its matched JSON Pointer is the pointer, an ancestor of it, or a descendant of it, using RFC 6901
token boundaries. Unrelated configured overlays are not attached. `--warnings-as-errors` is an explicit
output-policy marker; the
configuration's `diagnostics.warningsAsErrors` setting is also reported. Unmatched queries are
diagnostics and return exit code 1.

The `diagnostics` arrays are retained in both documents for forward-compatible additions. They
are sorted by phase, path, pointer, code, and message, matching the Phase 1 output contract.

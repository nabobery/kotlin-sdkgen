# ADR 0012: Use structured identity-tagged names for inline schemas and freeze the current optionality policy

## Status

Accepted for the pre-1.0 generated API.

## Context

Declaration-worthy inline schemas are public top-level Kotlin declarations. Their previous names were produced by sanitizing an entire JSON Pointer. Those names exposed OpenAPI plumbing, became pathological on deep schemas, lost semantic tails when truncated, and used document-order numeric suffixes after lossy sanitization. They were not insertion-stable.

The semantic model already separates requiredness, nullability, and the concrete `ABSENT`/`NULL`/`VALUE` states. The current emitter preserves those states only for selected whole models. T8 must document and freeze that behavior, not redesign the generated ABI or serializers.

## Decision

### Inline schema naming

- Keep every canonical `SchemaId` and source pointer unchanged.
- Keep declaration-worthy inline schemas as public top-level types/files.
- Keep component-schema names derived from their configured component names.
- Parse the `SchemaId` fragment once as RFC 6901. Decode each pointer segment once; a decoded `~1` produced by source text `~01` is not decoded a second time.
- Classify known OpenAPI locations structurally: path request bodies, responses, operation parameters, response headers, component schemas, and reusable request-body/response/parameter/header components. Unknown locations use a deterministic generic fallback.
- Treat the decoded OpenAPI path key as one pointer segment, then split the path template. Omit route segments consisting only of `{parameter}` from the readable anchor while retaining the complete `SchemaId` in the identity tag.
- Preserve the path/owner anchor, HTTP method, request/response/parameter/header role, response status, media token, and final semantic property/item/additional-properties/composition context.
- Use one-based composition tokens: `OneOf1`, `AnyOf1`, and `AllOf1` for source branch index zero. Use `Item` and `AdditionalValue` for array items and typed additional-property values.
- Normalize common media types to `Json`, `ProblemJson`, `MergePatchJson`, `EventStream`, `Multipart`, `Form`, and `Binary`. Sanitize unknown media types into deterministic readable tokens.
- End every synthesized inline public name with `X` plus the first eight lowercase SHA-256 hex characters of the full `SchemaId`.
- When a complete candidate collides with another candidate or a reserved name, lengthen only the involved tags to 12, 16, and further four-character increments until unique. Inline declarations never use document-order numeric suffixes.
- Target at most 80 characters. Remove low-value middle ancestry first. Preserve `Inline`, the useful owner/role context, the final leaf/composition token, and the identity tag. Pathological individual user tokens may be shortened with a token-local hash.
- Append a separate `Source: <canonical SchemaId>` paragraph to KDoc for every generated top-level model, open enum, oneOf, and anyOf declaration, whether or not the source schema has a description.

Component, operation, local/member, and derived helper allocation retain their existing behavior. Their numeric suffixes remain insertion-sensitive; changing those allocators is outside T8.

### Optionality

The semantic contract remains:

- optional non-null: `ABSENT` or `VALUE`;
- required nullable: `NULL` or `VALUE`;
- optional nullable: `ABSENT`, `NULL`, or `VALUE`.

Whole-model field state remains activated for:

- request graphs reachable recursively from PATCH operations;
- request graphs reachable recursively from `application/merge-patch+json` bodies;
- schemas with `x-sdkgen-field-state: true` and their reachable graphs;
- any model containing a required-nullable field.

No universal `FieldState`, directional request/response model split, per-field internal state selection, or serializer behavior change is introduced.

## Known limitations frozen by T8

- A required-nullable field currently enables field state for every optional field in that model, including unrelated optional fields.
- A schema shared by PATCH input and response output is represented by one stateful declaration.
- A stateless pure-response optional-nullable property decodes absent and explicit null to the same Kotlin `null`, then omits that value when serialized.
- A stateless optional-non-null property rejects explicit JSON null during decoding; omission remains represented by Kotlin `null` at the public property boundary.
- Per-field state and directional request/response projections require a future generated-ABI and compatibility design.

## Compatibility

This is an intentional generated API rename before 1.0. Inline Kotlin type names, filenames, references, serializer descriptors, and generated source KDoc change. Canonical semantic identity does not.

The focused inventory is `docs/conformance/evidence/openrouter-renames.tsv`. It maps current semantic identities to a legacy-algorithm candidate and a new naming candidate; it is not a proven historical migration map.

The checked-in OpenRouter generated tree contains 880 legacy `Inline*.kt` files, but projection of the current pinned `conformance/openrouter/openapi.yaml` produces 933 declaration-worthy inline schemas: 879 current legacy candidates are present in the checked-in tree, 54 are absent, and one checked-in legacy inline file no longer has a current candidate. This pre-existing baseline/spec drift makes the requested “880 remains 880” regeneration metric impossible without suppressing current declarations or reverting the pin. The production `GenerationPipeline` also blocks the current pin on 38 pre-existing blocking diagnostics/exclusions: conflicting `allOf`, primitive `oneOf`, cascading missing declarations, and incompatible multipart/request media schemas. T8 therefore records the discrepancy rather than weakening diagnostics, silently dropping 53 declarations, or changing unrelated schema support. Compilation of the stale checked-in consumer does not validate the new names.

W3/OpenRouter conformance owns the migration boundary: resolve or formally waive every blocker, regenerate through the full real pipeline twice byte-identically, replace the complete generated tree, compile and test the regenerated consumer, and verify complete source-identity mapping against the applied rename map.

## Consequences

### Positive

- Inline names remain readable while becoming insertion-stable.
- Lossy path sanitization cannot merge identities silently.
- Deep names retain their final semantic leaf.
- Generated documentation exposes exact source identity.
- Current optionality behavior and its ABI limitations are explicit and testable.

### Negative

- Every existing inline generated public name changes.
- SHA-derived suffixes add visual noise.
- The 80-character policy may shorten pathological owner tokens.
- Component/member numeric suffix insertion instability remains.
- The stale OpenRouter checked-in baseline cannot be truthfully regenerated as an 880-inline-only rename from the current pin until its unrelated 38 blockers and 54-added/1-removed drift are resolved.

# ADR 0001: Use swagger-parser behind a generator-owned parser seam

## Status

Accepted.

The source-location condition from the parser bake-off is discharged by the semantic-model prototype.

## Context

Kotlin SDKGen needs OpenAPI 3.1 parsing, local and external reference resolution, recursive graph handling, source-linked diagnostics, composition fidelity, and stable identity without exposing parser-library types to later phases. No evaluated parser supplied all of those capabilities directly.

Direct swagger-parser preserved the required OpenAPI structures and reference behavior, but its model exposes no stable line/column API. OpenAPI Generator added an older embedded parser and default normalization that erased tested `oneOf` provenance. Fabrikt's compatibility layer rewrote 3.1 null unions and lost a `$ref` sibling. Litote had no resolver or source-location layer and silently discarded a tested JSON Schema keyword.

## Decision

Use `io.swagger.parser.v3:swagger-parser:2.1.45` directly inside a generator-owned JVM parser adapter.

The adapter uses two views:

1. an unresolved view for canonical references, `$ref` siblings, extensions, original composition shape, and provenance;
2. a separately resolved view for shared target identity and recursion behavior.

Join both views by a durable generator-owned node identity: canonical acquisition URI plus JSON Pointer. JVM object identity is supporting evidence only and must never become a persisted ID.

Build a generator-owned Jackson 2.22.0 token index for every YAML or JSON source document, including external documents. The index maps canonical URI plus JSON Pointer to line, column, and byte offset. Missing provenance is an adapter error unless a later phase explicitly creates a synthetic node and records synthetic provenance.

Immediately adapt parser values into immutable SDKGen semantic types. No `io.swagger.*`, OpenAPI Generator, Fabrikt/Kaizen, Litote, Jackson, or other parser implementation type may cross the seam.

Normalization occurs only in named SDKGen passes that retain provenance. Do not invoke OpenAPI Generator's default normalizer. Reference retrieval policy, offline behavior, allowlists, limits, caching, and digests remain SDKGen-owned.

## Evidence

The parser bake-off found:

> “swagger-parser 2.1.45, resolution enabled” parsed the pinned OpenRouter document with a **722 ms median**, **356.3 MiB** maximum observed heap-pool peak, **0 errors**, **0 warnings**, and **708 schemas**.

It also demonstrated why the seam must own normalization:

> OpenAPI Generator's default normalizer changed `SingleBranchOneOf.oneOf.size == 1` into an empty `oneOf` with `types == [string]`, losing the original composition provenance.

The semantic-model prototype discharged the source-map condition:

> The component target `sdkgen://source/root.yaml#/components/schemas/Shared` was recovered at **38:7**, byte **744**; two reference occurrences at **52:11** and **54:11** shared one `SchemaId`.

> The external target was recovered at **4:7**, byte **48**; a node inside a recursive cycle at **66:11**, byte **1431**; and an invalid-reference diagnostic at **12:17**, byte **183**.

The full OpenRouter adaptation represented **708/708 component schemas** and **89/89 operations**, with **0 diagnosed omissions** and **0 silent omissions**.

## Consequences

### Positive

- Parser replacement remains possible because later phases depend only on SDKGen types.
- Source coordinates do not depend on undocumented parser-object behavior.
- Stable IDs survive relocation and recursive graph traversal.
- Original reference and composition provenance remains available for diagnostics and compatibility reports.

### Negative

- Intake performs additional indexing and two parser passes. The Foundation Evaluation parse-plus-adapt median was **1298.474 ms**, with a **696.849 MiB** maximum observed heap-pool peak.
- The acquisition layer must maintain canonical identities across local and external documents.
- Parser messages still require SDKGen-owned classification and pointer attachment.

## Conditions and re-evaluation triggers

- Re-run the parser and source-map fixture suites whenever swagger-parser or Jackson is upgraded.
- Re-evaluate the parser if a pinned corpus construct cannot be represented without loss, if reference resolution becomes nondeterministic, or if source indexing cannot attach a material node to provenance.
- Keep remote acquisition disabled or explicitly policy-bound until allowlists, byte limits, redirect rules, caching, offline mode, and content digests are implemented.
- Expand JSON Schema 2020-12 keyword coverage before claiming complete dialect support; the Foundation Evaluation model did not exhaustively cover every keyword.

# OpenRouter OpenAPI corpus

This directory contains an immutable OpenRouter OpenAPI snapshot, a narrowly scoped compatibility overlay, generated
Kotlin snapshots, and an executable Kotlin Multiplatform consumer. It is a conformance fixture for Kotlin SDKGen, not
a published OpenRouter SDK.

## Snapshot

- **OpenAPI operations:** 89
- **Generated operations:** 89
- **OpenAPI SHA-256:** `b901d462e355e54b90ee2320bf7f18d0cb8edea857d5cdd8623d704f77a9eb47`
- **Overlay SHA-256 (`overlays/allof-resolution-audit.yaml`):** `f8bc7a924cf9bc0af7ac54abc8a933037d0c30631b7bf690884ba3dfcd5cb6d0`
- **Overlay SHA-256 (`overlays/full-spec-compat.yaml`):** `0ced3f18aa83e29f6aadc41d82d302e0312f3736c5c4914e27250dab964fb5c5`
- **Generated files:** 1,671
- **Generated snapshot SHA-256:** `1c1f75a48aeafba27a45a3c86e43d89811d043d1c9460d6187ddd598e9bbebbd`

[`SHA256SUMS`](SHA256SUMS), [`sdkgen.yaml`](sdkgen.yaml), and [`sdkgen.lock`](sdkgen.lock) bind generation to the
checked-in inputs. Conformance tests do not fetch the OpenAPI document from the network.

## Supported surface

The generated consumer covers typed requests and responses, authentication, retries, errors, streaming, and
pagination across JVM and JavaScript test lanes.

- Chat-completion and image generation expose buffered, `WithResponse`, and server-sent event stream methods. The
  caller supplies `stream = true`; generated code preserves the request instead of changing it.
- All 17 annotated pagination operations expose `Pages` and `Items` flows. Sixteen use offset/limit pagination and
  `listFiles` uses cursor pagination.
- `createEmbeddings` and `createRerank` do not expose streaming because the pinned descriptions explicitly state that
  those operations do not stream.
- `createAudioTranscriptions` (`POST /audio/transcriptions`) accepts audio two ways, so it now generates one callable
  per compatible request-media group: `createAudioTranscriptions` (the normalized `application/json` variant keeps the
  unsuffixed name) and `createAudioTranscriptionsMultipart` (`multipart/form-data`), each with its `WithResponse`
  mirror. See [ADR 0021](../../docs/adr/0021-schema-intersection-and-request-media-variants.md).

## Full coverage (formerly "Known coverage gaps")

This corpus generates all **89 of 89** operations with zero blockers (direct and dependent closure). The three
operations previously excluded at `0.2.0` — `createMessages` (`POST /messages`), `createResponses`
(`POST /responses`), and `createAudioTranscriptions` (`POST /audio/transcriptions`) — are now generated. This is a
released generator capability in Kotlin SDKGen `0.3.0`. Historical evidence records referencing this section's former
name, "Known coverage gaps", describe the pre-0.3.0 state it documented.)

`/messages` and `/responses` compose their response schemas with `allOf`, which is a logical AND: a value must satisfy
every branch at once, and their branches redeclare the same property with different types and nullability. The
[strict intersection algebra](../../docs/adr/0021-schema-intersection-and-request-media-variants.md) resolves each
duplicate property to its well-defined common Kotlin projection (or refuses, rather than guessing). Where the correct
resolution is a contract judgment rather than a mechanical one, the audited `x-sdkgen-allof-resolution` overlay
([`overlays/allof-resolution-audit.yaml`](overlays/allof-resolution-audit.yaml)) elects the winning property schema;
that election fails closed if it ever drifts from the schema graph. The proven boundary of the algebra is committed
as evidence in `docs/conformance/evidence/schema-intersection-proof-table.tsv`.

`/audio/transcriptions` declares two incompatible request schemas — an `application/json` base64 `input_audio` object
and a `multipart/form-data` binary `file` part — and is now represented by media-specific request variants (see
"Supported surface" above) rather than one guessed request value.

The remaining `SDKGEN-LEGACY-NULLABLE-COMPOSITION` diagnostics describe OpenAPI 3.0-style null-only branches. They
are warnings and do not exclude operations. A degenerate `{nullable/type: null}`-only `anyOf` member now canonicalizes
into property nullability rather than a `JsonElement?` catch-all branch, so such unions are strict; a payload matching
no branch throws the union's `NoMatchException` and explicit JSON `null` decodes to Kotlin `null` (ADR 0021).

## Verify locally

Run one resource-safe Gradle lane at a time:

```bash
JAVA_TOOL_OPTIONS=-Xmx4g ./gradlew \
  :conformance:openrouter:consumer:jvmTest \
  :conformance:openrouter:checkCorpusDrift \
  --no-daemon --max-workers=1 \
  -Dorg.gradle.parallel=false \
  -Pkotlin.compiler.execution.strategy=in-process
```

The JavaScript consumer lane requires Node.js on `PATH`:

```bash
JAVA_TOOL_OPTIONS=-Xmx4g ./gradlew \
  :conformance:openrouter:consumer:jsNodeTest \
  --no-daemon --max-workers=1 \
  -Dorg.gradle.parallel=false \
  -Pkotlin.compiler.execution.strategy=in-process
```

The full consumer suite is green on the JVM, `jsNode`, and `macosArm64` lanes; the
`:conformance:openrouter:consumer:macosArm64Test` lane runs on an Apple-silicon host.

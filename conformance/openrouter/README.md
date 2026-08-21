# OpenRouter OpenAPI corpus

This directory contains an immutable OpenRouter OpenAPI snapshot, a narrowly scoped compatibility overlay, generated
Kotlin snapshots, and an executable Kotlin Multiplatform consumer. It is a conformance fixture for Kotlin SDKGen, not
a published OpenRouter SDK.

## Snapshot

- **OpenAPI operations:** 89
- **Generated operations:** 86
- **OpenAPI SHA-256:** `b901d462e355e54b90ee2320bf7f18d0cb8edea857d5cdd8623d704f77a9eb47`
- **Overlay SHA-256:** `f6f1916254474e974484ab516e3cd29f81902783f617a48f3034652b6628f8c2`
- **Generated files:** 1,569
- **Generated snapshot SHA-256:** `c62dfca137bc04cdabdfca822d5f9dac7d6ca8e077481f41f601fb32c27a2c59`

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

## Known coverage gaps

Three operations are not generated in version 0.2.0:

| Operation                   | Path                         | Generator limitation                                     |
| --------------------------- | ---------------------------- | -------------------------------------------------------- |
| `createMessages`            | `POST /messages`             | Conflicting `allOf` properties across branches.          |
| `createResponses`           | `POST /responses`            | Same conflicting `allOf` pattern.                        |
| `createAudioTranscriptions` | `POST /audio/transcriptions` | JSON and multipart requests declare incompatible schemas. |

`/messages` and `/responses` compose their response schemas with `allOf`, which is a logical AND: a value must
satisfy every branch at once. These branches redeclare the same property with conflicting types and nullability, so
no single Kotlin property can satisfy both declarations and the generator refuses to guess one. (The upstream spec
author appears to intend inheritance-style property replacement at these points, but the document still expresses it
as a strict intersection.) For `/responses`, two request fields that reach the same graph are additionally removed by
the compatibility overlay.

`/audio/transcriptions` accepts audio two ways: its `application/json` request sends a base64 `input_audio` object,
while its `multipart/form-data` request sends a binary `file` part. The two media types therefore declare incompatible
request schemas, and the generator emits one request value per operation rather than media-type-specific variants, so
it cannot represent the operation.

The generator reports these as `SDKGEN-PROJECTION-UNREPRESENTABLE-OPERATION` (and related `-SCHEMA`) diagnostics.
`incompatible-request-media` is not a generator diagnostic id; it is a category this corpus's blocker-inventory test
synthesizes from the diagnostic message to track the audio case.

These operations are excluded rather than generated with guessed or lossy types. Resolving conflicting `allOf`
properties and supporting media-specific request variants would restore all three operations and raise this corpus
from 86/89 to 89/89.

The remaining `SDKGEN-LEGACY-NULLABLE-COMPOSITION` diagnostics describe OpenAPI 3.0-style null-only branches. They
are warnings and do not exclude operations.

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

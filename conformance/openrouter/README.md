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

| Operation                   | Path                         | Generator limitation                                                                                                            |
| --------------------------- | ---------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `createMessages`            | `POST /messages`             | The response uses divergent `allOf` properties that cannot yet be projected into one faithful Kotlin type.                      |
| `createResponses`           | `POST /responses`            | The response uses the same divergent `allOf` pattern; two request fields that reach this graph are also removed by the overlay. |
| `createAudioTranscriptions` | `POST /audio/transcriptions` | Multipart emission currently assumes a binary property named `file`; this request names it `inputAudio`.                        |

These operations are excluded rather than generated with guessed or lossy types. Closing both root generator
limitations—divergent `allOf` projection and multipart binary-property selection—is expected to restore all three
operations and raise this corpus from 86/89 to 89/89.

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

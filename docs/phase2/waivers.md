# OpenRouter full-spec generation waivers (0.2.0)

**Source:** `conformance/openrouter/openapi.yaml` (sha256
`b901d462e355e54b90ee2320bf7f18d0cb8edea857d5cdd8623d704f77a9eb47`), 89 `operationId`s total.
**Overlay:** `conformance/openrouter/overlays/full-spec-compat.yaml` (sha256
`f6f1916254474e974484ab516e3cd29f81902783f617a48f3034652b6628f8c2`), applied with
`StandardProjection` through the CLI.

Latest validation:

```text
validate: ok diagnostics=21 exclusions=0
BUILD SUCCESSFUL
```

Latest generation after OpenRouter SSE and pagination activation:

```text
generate: ok files=1569 snapshotSha256=c62dfca137bc04cdabdfca822d5f9dac7d6ca8e077481f41f601fb32c27a2c59
BUILD SUCCESSFUL
```

The generated client contains 86 operation metadata entries: three operations are waived entirely. All 86 generated
operations retain their full operation-level surface; one reuses a request schema with two waived fields. The two
streaming operations now expose both their buffered and `text/event-stream` surfaces.

## Operation waivers

| Operation | Path | Diagnostic/reason | Disposition |
| --- | --- | --- | --- |
| `createMessages` | `POST /messages` | `SDKGEN-PROJECTION-MIXED-RESPONSE-MODES` plus genuinely conflicting `allOf` properties in `MessagesResult` | needs-extension |
| `createResponses` | `POST /responses` | `SDKGEN-PROJECTION-MIXED-RESPONSE-MODES` plus genuinely conflicting `allOf` properties in `OpenResponsesResult` | needs-extension |
| `createAudioTranscriptions` | `POST /audio/transcriptions` | Generated multipart codec hardcodes `request.file`; the actual binary property is `SttRequest.inputAudio` | waived-for-phase2; needs generator fix |

`createPresetsMessages` and `createPresetsResponses` remain generated because their responses are representable even
though they reuse request schemas from the waived inference operations.

## Closed partial operation waivers

The 0.1.x partial waivers for `sendChatCompletionRequest` (`POST /chat/completions`) and `createImages`
(`POST /images`) are closed in 0.2.0. The corpus overlay retains each operation's `text/event-stream` response,
translates it to canonical `x-sdkgen-streaming` metadata, and removes the legacy Speakeasy sentinel. Each generated
client now exposes the buffered method, `WithResponse` method, and `Stream` method. The caller supplies
`stream = true`; the generated stream method preserves the request body byte-for-byte.

## Pagination enablement

All 17 OpenRouter pagination operations are enabled in 0.2.0 through canonical overlay metadata: 16 operations use
`offsetLimit` with `offset`/`limit` query parameters and `/data` response items, while `listFiles` uses `cursor` with
`cursor`/`limit` query parameters, `/data` items, and `/cursor` continuation. The pinned OpenAPI source declares a
`limit` parameter on `listFiles`, so the overlay carries `requestLimit: limit` and generated cursor walks preserve the
caller's page size.

The generated clients expose `Pages` and `Items` flows for each operation. Executed OpenRouter consumer tests cover
models offset progression and short-page termination plus files cursor threading against captured request URIs.

The vestigial `text/event-stream` responses on `createEmbeddings` and `createRerank` remain removed as upstream-spec
issues: their own descriptions say those operations do not stream. No real capability is lost.

## Field-level waivers

| Symbol | Reason | Disposition |
| --- | --- | --- |
| `ResponsesRequest.input` | Reaches the unrepresentable OpenAI Responses content-block graph | waived-for-phase2 |
| `ResponsesRequest.text` | Reaches `TextExtendedConfig` in the same graph | waived-for-phase2 |

## Resolved overlay workarounds

The overlay no longer removes `ProviderOptions.properties['01ai']`; `KotlinNameResolver` now emits `_01ai`. Both old
`PublicEndpoint.properties.throughput_last_30m` actions are also gone because transparent-`allOf` nullability is now
preserved consistently. During this takeover, four additional annotation-only branch rewrites were removed from the
overlay (`PreferredMaxLatency`, `PreferredMinThroughput`, and the two `ProviderSortConfig` branches). Validation remains
at 0 exclusions. The generated-source lint issue encountered during that generation was subsequently resolved as
described below.

The remaining 21 `SDKGEN-LEGACY-NULLABLE-COMPOSITION` diagnostics are warnings for OpenAPI-3.0-style null-only branches.
They are not exclusions or waivers.

## Resolved generator blocker: empty referenced-branch Views

The prior cross-file View redeclarations remain fixed: shared referenced Views are emitted once in the referenced schema's
file. The follow-up empty-View defect is also resolved in the generator. Referenced object branches now keep required-only
fields for branch discrimination while carrying the complete property set in their public View projection. Optional View
properties are nullable and default to `null`.

The 0.2.0 regeneration contains 1,569 files with snapshot
`c62dfca137bc04cdabdfca822d5f9dac7d6ca8e077481f41f601fb32c27a2c59`. The formerly invalid declarations now contain
their optional properties, and the focused consumer JVM compile completed successfully.

No conformance overlay workaround or operation waiver was added for this generator defect.

## Resolved runtime blocker: retry delayer recursion

The prior `CoroutineSdkDelayer.delay` recursion is resolved by qualifying the `kotlinx.coroutines.delay` call. Consumer
fault injection now reaches attempt two after a retryable 429 and proves the caller-supplied `Idempotency-Key` value is
identical on both physical requests (`OpenRouterFixtureConformanceTest#retryReusesCallerIdempotencyKey`). No conformance
waiver remains for retry behavior.

## Resolved generator-output blocker: generated-source ktlint

The consumer build initially failed `ktlintCommonTestSourceSetCheck` because freshly generated Kotlin was included in
the consumer's ktlint source set. The consumer build now excludes generated sources from ktlint, matching the Gradle
plugin's generated-source treatment. The focused OpenRouter consumer ktlint gate completed successfully; no operation
waiver, overlay workaround, or hand-formatting of generated files was required.

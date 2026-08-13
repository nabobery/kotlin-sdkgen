# ADR 0006: Use a transport-neutral runtime SPI with explicit stream ownership

## Status

Accepted. Ordinary JSON, incremental SSE, and multipart execution are proven through the SPI as of Runtime and Integrations (see
Resolution below). The canonical OpenRouter `createAudioTranscriptions` generation waiver remains active because its
JSON and multipart media types use incompatible request schemas that the current single-request-type API cannot express.

## Context

Generated common APIs must execute through Ktor, OkHttp, Java `HttpClient`, fake, and custom transports without exposing engine types. The SPI must preserve repeated headers, non-success responses, cancellation, incremental bodies, deadlines, replayability, and resource ownership.

The Foundation Evaluation task exercised ordinary JSON and SSE through fake and real Ktor/CIO transports. The broader technical-spec row also listed multipart, but no multipart operation or acceptance criterion was present in the executable task.

## Decision

Generated operations depend only on common runtime types and `SdkTransport`. One `SdkTransport.execute` call represents one physical request; retries, authentication, decoding, SSE policy, and typed API errors remain above the adapter.

`SdkRequest` must include protocol-neutral HTTP facts plus mandatory:

- expected response mode, distinguishing buffered/ordinary from streaming behavior;
- semantic deadline fields, including the runtime's total, attempt, and idle deadline intent;
- ordered repeated headers;
- body ownership and replayability metadata;
- operation-safe attributes needed by adapters.

Model request-body replayability as three distinct capabilities, not a Boolean:

1. replayable immutable bytes;
2. a replay factory that can create a fresh body per execution;
3. a one-shot stream.

`SdkByteStream` is a suspending pull abstraction with bounded reads and `close(cause: Throwable? = null)`. The stable API may use a caller-provided buffer or sink if measurement justifies it, but close-with-cause and pull-based ownership are normative.

Every response body must close on ordinary success, decode failure, HTTP error, end of stream, terminal sentinel, cancellation, and any escaping exception. Adapters must preserve `CancellationException` unchanged and promptly cancel underlying I/O.

For Ktor, a streaming body remains valid only inside a retained `HttpStatement.execute` scope. The adapter must keep that scope alive until neutral EOF, failure, or `SdkByteStream.close(cause)`; it must not return a `ByteReadChannel` from an already-ended execution scope.

Publish the fake transport and lifecycle/SSE matrix as the initial adapter contract kit.

## Evidence

The same generated-style `ModelsApi` ran through the fake and Ktor/CIO adapters:

> **10 tests passed**: six fake-transport tests and four real Ktor tests covering ordinary success, typed non-2xx status and repeated headers, split-boundary SSE, multi-line data, comments, `[DONE]`, cancellation, and failure.

Incrementality was directly observed:

> Both SSE tests received the first decoded event while the producer was still gated and before response completion.

Cancellation ownership was directly observed:

> The fake recorded the original `CancellationException` as close cause, and the Ktor server observed real request closure after collection cancellation.

The key Ktor failure established the retained-scope rule:

> Returning a channel from `client.request(...)` caused `SdkStreamException` with `HttpRequestTimeoutException`; `prepareRequest(...).execute { ... }` worked when the callback remained alive until neutral stream close.

Common code compiled for JVM and Linux x64 and contained no `Any`, Ktor, JVM, or OkHttp references.

## Consequences

### Positive

- Generated common APIs remain engine-neutral and KMP-compatible.
- Cancellation and close causes retain their meaning through adapters.
- Streaming backpressure and ownership are explicit.
- Retry safety can distinguish immutable, reproducible, and one-shot bodies.
- Adapter behavior is testable through one shared contract kit.

### Negative

- Adapter implementations must manage response scopes carefully.
- Pull-by-`ByteArray` may allocate per read unless the stable API adopts a sink/buffer form.
- Deadline mapping differs across engines and needs capability checks.
- Multipart execution was not proven by this spike.

## Conditions and re-evaluation triggers

- Extend the SPI contract kit with multipart before claiming that Foundation Evaluation executed multipart through the neutral SPI.
- Specify header restrictions, casing, comma-join rules, redirect forwarding, bounded error-body capture, and SSE size/UTF-8 limits.
- Benchmark chunk allocation before freezing the stable read signature.
- Re-run the contract kit for every adapter and engine-version upgrade.
- Re-evaluate the SPI only if a required engine capability cannot be represented without leaking platform types; adapter-specific configuration remains outside the common contract.

## Resolution (Runtime and Integrations)

`runtime/core`, the three transport adapters, and the adapter contract kit resolved the open items
listed above. Each is now a shipped, KDoc'd contract rather than a deferred question:

- **Header restrictions, casing, and comma-join rules.** `SdkHeader` (`Transport.kt`) compares names case-insensitively
  everywhere (`firstValue`, codec content-type lookups) per RFC 9110 §5.1, while preserving the caller-supplied casing on
  the wire whenever the transport allows it. Repeated header names (e.g. multiple `Set-Cookie` values) are kept as
  separate `SdkHeader` entries — the runtime never comma-joins on a caller's behalf, since not every header is safe to
  join that way (`Set-Cookie` notably is not); a caller that needs RFC 9110 §5.3 comma-joined semantics for a
  single-valued header joins the matching entries itself.
- **Credential-header ownership.** The final auth stage owns credential-bearing headers outright: it replaces every
  case-insensitive instance of a final credential-owned header with exactly one generated value
  (`SecuritySchemeAuthentication`, `Auth.kt:19`), so a caller-supplied duplicate can never leak alongside — or instead
  of — the authenticated value.
- **Redirect posture.** Full runtime redirect handling was explicitly deferred. What shipped instead: redirects are a
  typed _unsupported_
  capability. Adapters disable native redirect-following, `TransportCapabilities.redirects` reports
  `RedirectCapability.UNSUPPORTED`, and a 3xx response surfaces as a declared response alternative or a typed
  `SdkApiException` rather than being silently followed (`Transport.kt`, `SdkResponse` KDoc). No credentials are ever
  forwarded to a redirect target, because no redirect loop is entered in this release. Contract tests for all three JVM
  transports confirm `redirects: UNSUPPORTED` at runtime.
- **Bounded error-body capture.** `UnknownApiException.redactedBodyPreview` caps captured error-body content at
  `MAX_BODY_PREVIEW_BYTES = 64 * 1024` (64 KiB) measured in UTF-8 bytes, truncating and appending a `"…[truncated]"`
  marker rather than rejecting oversized input, and applies the same redaction rules as everywhere else in the runtime
  (`Errors.kt`). Unbounded buffering of an error body was explicitly rejected as a design option — error bodies are
  exactly as attacker-influenced as success bodies.
- **SSE size/UTF-8 limits.** The SSE line splitter and event parser enforce `StreamingDescriptor.DEFAULT_MAX_EVENT_BYTES`
  per line and per accumulated event, throwing a typed `SdkStreamingException` when either bound is exceeded
  (`streaming/SseParser.kt`); diagnostic previews of event data/`lastEventId` are separately bounded and truncated
  (`streaming/StreamingFlows.kt`).
- **Stream-idle deadline enforcement** (an item identified during Runtime and Integrations remediation, not originally listed above but
  resolved alongside the others): a neutral `SdkByteStream` decorator wraps every `readChunk()` call with the resolved
  idle-deadline timeout, throwing `SdkTimeoutException` classified as a stream-idle timeout and closing the delegate
  stream with that cause on expiry — applied uniformly to raw streaming bodies and streaming flows regardless of
  adapter, so idle-connection ("slow-loris") stalls are caught by the runtime even on adapters whose native HTTP client
  has no idle-read timeout of its own.

The multipart contract-kit gap is resolved: `runtime/testing`'s adapter contract kit exercises multipart execution
through the SPI for all three adapters, with fixture coverage for FakeTransport and all three JVM adapters. Multipart
accessors are bound to the exact resolved request-model fields, and unsupported arrays and nullable binary/text parts are
diagnosed at their property or encoding source rather than assigned an implicit wire representation.

The canonical OpenRouter `createAudioTranscriptions` waiver remains active. Its `application/json` alternative uses
`STTRequest`, where `input_audio` is a JSON `STTInputAudio`, while its `multipart/form-data` alternative uses a separate
inline object with a binary `file` property. The generated operation API currently accepts one request type, so this
media-specific schema pair is emitted as a source-linked `UNREPRESENTABLE_OPERATION` diagnostic instead of binding the
multipart `file` part to the JSON request model. The waiver can be reconsidered only after media-type-specific request
values are represented and the canonical operation generates and compiles. The underlying multipart SPI machinery
remains proven independently by the runtime fixture tests.

Chunk-allocation benchmarking and per-upgrade contract-kit re-runs remain open, ongoing engineering practice rather than
one-time Runtime and Integrations deliverables; they are not blockers for this ADR's status.

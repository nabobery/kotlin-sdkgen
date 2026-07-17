# ADR 0006: Use a transport-neutral runtime SPI with explicit stream ownership

## Status

Accepted for ordinary JSON and incremental SSE; multipart SPI execution remains a scheduled extension.

## Context

Generated common APIs must execute through Ktor, OkHttp, Java `HttpClient`, fake, and custom transports without exposing engine types. The SPI must preserve repeated headers, non-success responses, cancellation, incremental bodies, deadlines, replayability, and resource ownership.

The Phase 0 task exercised ordinary JSON and SSE through fake and real Ktor/CIO transports. The broader technical-spec row also listed multipart, but no multipart operation or acceptance criterion was present in the executable task.

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

Primary evidence:

- [Phase 0 runtime SPI report](../phase0/results/runtime-spi/REPORT.md)

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

- Extend the SPI contract kit with multipart before claiming that Phase 0 executed multipart through the neutral SPI.
- Specify header restrictions, casing, comma-join rules, redirect forwarding, bounded error-body capture, and SSE size/UTF-8 limits.
- Benchmark chunk allocation before freezing the stable read signature.
- Re-run the contract kit for every adapter and engine-version upgrade.
- Re-evaluate the SPI only if a required engine capability cannot be represented without leaking platform types; adapter-specific configuration remains outside the common contract.

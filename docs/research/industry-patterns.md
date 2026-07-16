# Kotlin SDKGen: Industry Patterns and Research

| Field | Value |
| --- | --- |
| Status | Living research companion |
| Last reviewed | 2026-07-16 |
| Scope | SDK generators and language SDK runtimes relevant to Kotlin SDKGen |

## How to use this document

This document preserves the reasoning behind [Kotlin SDKGen's design decisions](../design-decisions.md). It is not a raw chat transcript. A transcript repeats intermediate uncertainty and becomes difficult to maintain; this document instead records:

- the question being evaluated;
- representative industry implementations;
- the conclusion drawn for Kotlin SDKGen;
- intentional differences from existing tools;
- primary sources that can be rechecked when upstream behavior changes.

The comparison is representative rather than a statistical survey of every SDK generator. Speakeasy, Fern, Stainless, Smithy/AWS, Kiota, Swift OpenAPI Generator, Azure SDK, Ktor, and Kotlin coroutines were selected because together they cover modern generated SDK ergonomics, model-driven runtimes, transport abstraction, Kotlin behavior, and multiplatform concerns.

## Executive findings

Modern production SDK generation is not a direct OpenAPI-to-template transformation. The recurring architecture is:

```text
API contract
  + contract-local annotations or overlays
  + generator configuration
  -> normalized semantic model
  -> generated service-specific code
  + shared runtime
  -> language-native SDK
```

The strongest cross-tool patterns are:

1. Keep API semantics close to the contract through focused extensions, native traits, or overlays.
2. Keep publication, language targets, and local runtime defaults in generator configuration.
3. Generate operation metadata and execute it through a shared runtime.
4. Use native async abstractions: Kotlin `suspend` and `Flow`, TypeScript async iterables, and Java publishers or streams.
5. Preserve raw response and protocol metadata through an explicit detailed API rather than making it the default return type.
6. Treat retries, idempotency, streaming, and pagination as semantic features rather than templates.
7. Separate concrete HTTP engines from generated public APIs.
8. Make exceptional or unsafe behavior explicit: retrying non-idempotent requests, reconnecting streams, following cross-origin URLs, and buffering one-shot bodies.

## Product architecture

### Observed approaches

| Tool | Primary architecture | Relevant lesson |
| --- | --- | --- |
| Speakeasy | Generated SDK per language with shared generated runtime conventions and OpenAPI extensions | Feature-complete SDK generation needs more than models and endpoint interfaces |
| Fern | API-definition pipeline, generator-specific IR, language generators, and runtime libraries | Normalize source contracts into a language-neutral semantic model |
| Stainless | OpenAPI plus a rich SDK configuration that describes resources, models, and behaviors | Public SDK organization sometimes needs explicit information beyond raw OpenAPI |
| Smithy/AWS | Modeled service traits compiled into operation metadata and a shared runtime | Runtime behavior should be metadata-driven |
| Kiota | Generated request builders over a request-adapter and serialization abstraction | Transport and serialization boundaries can remain replaceable |
| Swift OpenAPI Generator | Generated code depends on a runtime-owned protocol and pluggable transports | A small runtime SPI can support multiple transports without leaking engine types |

### Kotlin SDKGen conclusion

Kotlin SDKGen should generate a complete public SDK and use a small shared runtime. The semantic model must be generator-owned and immutable. Generated API-specific descriptors carry contract facts; the runtime owns transport execution, retries, streaming, authentication, serialization coordination, and observability hooks.

The project intentionally differs from hosted generators by keeping generation local, open source, reproducible, and usable without a vendor control plane.

## Contract extensions, overlays, and configuration

### Focused extensions are the common pattern

Speakeasy uses focused names including `x-speakeasy-retries`, `x-speakeasy-pagination`, and streaming-specific extensions. Fern uses `x-fern-idempotent`, `x-fern-idempotency-headers`, `x-fern-retries`, `x-fern-pagination`, and `x-fern-streaming`. Stainless likewise defines operation-, schema-, parameter-, media-type-, and language-specific `x-stainless-*` extensions.

This is preferable to one catch-all object because each extension:

- attaches to the closest relevant OpenAPI object;
- has an independently documentable schema;
- can be added by a targeted overlay;
- can evolve additively;
- can be translated independently by a compatibility profile.

### Overlays are increasingly standard

Fern recommends OpenAPI Overlays for modifying immutable or generated specifications. Speakeasy provides commands to validate, compare, and apply overlays. Stainless calls the equivalent mechanism transforms, configured separately and applied to the effective OpenAPI document.

Kotlin SDKGen should use standard OpenAPI Overlays rather than inventing a second patch language. `sdkgen.yaml` selects inputs, overlays, generators, targets, and runtime defaults; it should not become a shadow API contract.

### Strict validation

Speakeasy provides generator-specific extension validation. OpenAPI Generator accepts arbitrary vendor extensions more permissively. Kotlin SDKGen adopts a split policy:

- strict for the namespace it owns;
- tolerant and preserving for unrelated `x-*` fields;
- report-only compatibility inspection when an older generator encounters newer SDKGen metadata;
- no source generation when owned semantics are unknown.

This prevents a misspelled retry or idempotency extension from silently generating unsafe behavior while preserving interoperability with documentation and gateway tooling.

## Compatibility profiles

Kotlin SDKGen uses canonical `x-sdkgen-*` semantics internally. An explicitly enabled profile translates supported vendor metadata.

### Why profiles are opt-in

Automatically interpreting every familiar extension would make a specification's meaning depend on which generator happened to read it. Explicit profiles provide:

- deterministic behavior;
- a translation report;
- clear unsupported-field diagnostics;
- stable conflict rules;
- a migration path from another generator.

### Conflict handling

Equivalent values deduplicate. Complementary values merge only where the canonical extension schema defines a safe merge. Contradictions fail. Silent last-wins behavior remains available only through a deliberately named compatibility policy, never as the default.

## Retry architecture

### Smithy and AWS

Smithy models retry safety, error fault, throttling, and service-suggested delay. Its retry guidance uses exponential backoff, jitter, attempt limits, and a token bucket. AWS SDK for Kotlin adds service-specific error-code classification.

Important observations:

- the generated/model layer knows whether an operation or error is retryable;
- the runtime owns the retry loop;
- retry quota protects a failing service from retry storms;
- the final service or transport exception remains visible after exhaustion;
- cancellation and validation failures are not retry candidates.

### Speakeasy

Speakeasy supports global, operation, and per-request retry configuration. It supports connection-error retrying, status-code rules, exponential backoff, elapsed-time bounds, jitter, and `Retry-After`.

### Kotlin SDKGen conclusion

Use generated `OperationMetadata` plus one runtime retry engine. A retry decision considers:

1. whether the request was definitely unsent, maybe sent, or produced a response;
2. safe, idempotent, conditional, or unsafe operation classification;
3. replayable or one-shot request body;
4. throttling, timeout, server, transport, or explicit error classification;
5. attempt, elapsed-time, and retry-quota budgets.

This is more robust than a list of retryable status codes.

## Idempotency

OpenAPI 3.1 has no standard keyword that means a client should generate an idempotency key. Header-name heuristics are unsafe.

Fern explicitly models idempotent operations and idempotency headers. Smithy has native idempotency traits and idempotency-token members. Speakeasy reuses the original idempotency key across retries when the endpoint defines one.

Kotlin SDKGen therefore generates a key only when canonical metadata declares client generation. The key is generated once per logical call, reused across attempts, and replaced by an explicit caller value. Contract semantics live in an extension or overlay; runtime limits stay in runtime configuration.

## Runtime configuration layering

### Industry patterns

- Speakeasy uses omission to inherit and explicit strategies such as `none` to disable retries.
- AWS Kotlin exposes explicit no-retry strategies rather than assigning special meaning to partial objects.
- Ktor distinguishes merge from replacement where client defaults compose.

### Kotlin SDKGen conclusion

Use a typed `CallOptions` aggregate. Each optional policy uses:

- absence for inheritance;
- `Disabled` for explicit disabling;
- `Replace(value)` for complete replacement.

Do not introduce a generic public tri-state wrapper with implicit policy-specific field merging. The public surface should be explicit and Kotlin-friendly even if the internal resolver represents more detailed provenance.

## Pagination

### API shape

AWS SDK for Kotlin exposes cold `Flow<ResponsePage>` paginators. Azure provides both page-level and item-level iteration. Speakeasy offers first-page calls, page streams, and flattened item streams in its Java generator.

Kotlin SDKGen combines these patterns:

- the normal operation returns the first page;
- a page flow preserves response structure and continuation metadata;
- an item flow provides the common ergonomic path.

### Demand and prefetch

Kotlin Flow is sequential by default. `buffer()` explicitly separates producer and consumer execution. AWS paginators lazily load pages while the flow is collected and stop on cancellation. Reactive Streams pagination similarly expresses demand through subscription.

Kotlin SDKGen therefore performs no hidden prefetch. Users can opt into buffering with normal Flow operators. This keeps request counts, rate-limit consumption, and cancellation predictable.

### Failure behavior

Mature pagers apply normal request retries to the current page. They do not restart from the beginning after a later-page failure because doing so can duplicate items or observe a changed dataset. Azure exposes continuation tokens for caller-managed resumption rather than persisting checkpoints automatically.

Kotlin SDKGen retries only the failed page, then terminates with the typed exception and safe pagination context.

### Pagination declarations

Speakeasy and Fern require explicit pagination metadata. Field names such as `next`, `cursor`, `page`, and `offset` are too ambiguous to enable behavior safely. Kotlin SDKGen may suggest mappings during analysis, but only accepted metadata affects generated code.

### Next URLs and credentials

Microsoft Graph instructs callers to use the complete `@odata.nextLink`. Kiota authentication providers bind tokens to allowed hosts. HTTP authentication credentials belong to an origin's protection space.

Kotlin SDKGen follows next URLs while independently re-evaluating authentication. Relative and same-origin targets are allowed; cross-origin targets require a trusted-host rule. Sensitive headers are never copied blindly.

## Timeout semantics

### Industry patterns

Ktor distinguishes request, connect, and socket timeouts. Its engine support matrix is important: JavaScript and Darwin do not support every low-level phase consistently. This makes it unsafe for a transport-neutral SDK to promise identical DNS, connect, TLS, and socket controls everywhere.

Speakeasy exposes global, operation, and per-request timeouts, but presents a comparatively simple request-timeout model. Retry elapsed time is configured separately.

AWS and Smithy runtimes distinguish logical call measurements from individual attempt measurements, and concrete HTTP engines expose their own connect and socket controls. Retry classification determines whether a timeout may safely produce another attempt.

### Kotlin SDKGen conclusion

The portable core uses semantic deadlines rather than pretending every engine has the same phases:

- a total deadline spans the logical call and its retries;
- a per-attempt deadline bounds one request attempt;
- stream idle timeout bounds inactivity without imposing a default maximum stream lifetime;
- upload idle timeout bounds stalled writes;
- pagination retains its own elapsed-time budget.

For a streaming flow, an explicitly configured total deadline includes collection. Long-lived streams default to no finite total deadline. Connect, DNS, TLS, socket, proxy, and pool tuning remain adapter-specific and capability-checked.

This is intentionally more expressive than Speakeasy's single timeout while remaining more portable than directly copying Ktor's engine phases into common code.

## Authentication architecture

### OpenAPI semantics

OpenAPI Security Requirement objects define logic that generators must preserve. Multiple schemes inside one object are an AND requirement; multiple objects in the security array are OR alternatives. An empty object makes anonymous access an alternative. OAuth2 and OpenID entries also carry required scopes.

A generator that flattens all configured credentials into every request can violate the contract, leak credentials, or fail an AND combination. The normalized semantic model must retain the alternatives and combinations explicitly.

### Provider patterns

Kiota separates generated request construction from an `AuthenticationProvider`. Its access-token provider is asynchronous and includes allowed-host validation, allowing token caching or refresh without coupling generated clients to one identity library.

Speakeasy generates typed security configuration from OpenAPI and supports security callbacks for dynamically retrieving or refreshing secrets. Its generated operation security types demonstrate that API keys and OAuth credentials can remain type-safe instead of becoming an untyped header map.

### Kotlin SDKGen conclusion

Generated code describes required security alternatives, while a transport-neutral suspending provider applies credentials just before sending. Providers are host-scoped and are invoked again when the target URL changes. This design supports static API keys, rotating bearer tokens, OAuth providers, secret stores, and custom schemes without embedding credential logic in every operation.

Secrets are values supplied at runtime, never generated descriptor metadata. They must be redacted from logs and telemetry and excluded from equality, hashing, and string representations.

Mutual TLS is a special case: OpenAPI can declare it, but certificate selection and TLS configuration belong to the HTTP transport. SDKGen records the requirement and validates adapter capability rather than pretending it is an ordinary authentication header.

OAuth2 and OpenID are also split deliberately. Generated/core code retains scheme, flow, scope, and discovery metadata and consumes credentials through a suspending provider. Browser interaction, authorization redirects, secure token persistence, and identity-library-specific refresh behavior belong in optional integrations. This resembles Kiota's use of external identity providers while avoiding a lowest-common-denominator OAuth implementation in core.

## Transport-neutral streaming

### Runtime-owned body types

Swift OpenAPI Generator uses `OpenAPIRuntime.HTTPBody` as the common streaming currency between generated code, middleware, and transports. AWS Kotlin owns `ByteStream`. Ktor uses `ByteReadChannel` for suspending network reads and increasingly interoperates with `kotlinx-io` for buffered I/O.

These implementations validate a runtime-owned body abstraction. Kotlin SDKGen should not expose Ktor, OkHttp, Okio, Java I/O, or another engine type from common generated APIs.

### Pull stream rather than byte-array flow

A `Flow<ByteArray>` makes arbitrary engine chunk boundaries observable and can allocate a new array per emission. A minimal suspending pull API allows decoders and copy routines to control buffer reuse. Adapter modules can bridge the neutral stream to ecosystem-specific I/O types.

`kotlinx-io` remains valuable internally and through adapters. It is not used as the mandatory public asynchronous network-body contract because its `Source` API is synchronous.

### Scoped response lifetime

AWS Kotlin scopes streaming response consumption to a callback. Ktor's prepared request execution similarly cleans up response resources when the block exits. Kotlin SDKGen adopts this pattern for raw downloads while typed Flow collection owns and closes the session automatically.

## Streaming declaration and generated behavior

### Standard media types

Speakeasy recognizes `text/event-stream`, `application/jsonl`, and `application/x-ndjson`. The media-type schema supplies the decoded event type. Multiple event shapes can use a discriminated `oneOf`.

OpenAPI does not completely describe:

- a special terminal sentinel such as `[DONE]`;
- request-field-controlled streaming versus non-streaming responses;
- automatic SSE reconnection;
- which in-band events are fatal errors;
- control-event filtering;
- protocol-level versus data-level discriminators.

Kotlin SDKGen recognizes unambiguous standard formats and uses `x-sdkgen-streaming` only for those extra semantics.

### Speakeasy features

- Typed SSE iteration in language-native forms.
- JSONL/NDJSON streaming.
- Multiple event types through schema unions.
- `x-speakeasy-sse-sentinel` to hide a terminal event.
- Streaming/non-streaming overloads based on an explicit configuration or request discriminator.
- Closable stream types in languages where deterministic closing is necessary.

Lessons adopted: typed iteration, standard media types, sentinels, dual-mode APIs, and deterministic closing.

### Fern features

- `x-fern-streaming` for JSON chunks or SSE.
- Explicit `format`, `terminator`, `stream-condition`, ordinary response, and stream response.
- SSE protocol metadata including event ID, event type, and retry interval.
- Protocol-level discriminator support.
- Opt-in resumable streams using `Last-Event-ID` and SSE `retry:` guidance (re-verify against current Fern documentation before citing as a locked competitive fact; a 2026-07 audit could not fully source automatic reconnect behavior).

Lessons adopted: preserve protocol metadata, make conditional streaming explicit, distinguish protocol discriminators, and separate resumable SSE from ordinary retries.

### Stainless features

- Dedicated streaming and non-streaming parameter types.
- Dedicated stream event models.
- Ordered event rules matching event type or data prefix.
- `yield`, `error`, `continue`, `done`, and `break` actions.
- Inline `error_property` handling.
- A forward-compatible fallthrough rule.
- Different semantics for draining after `done` and closing immediately after `break`.

Lessons adopted: typed event routing, explicit control actions, terminal behavior, and forward-compatible fallthrough. Kotlin SDKGen limits matchers to declarative, bounded forms and does not execute arbitrary expressions.

## In-band streaming errors

### Evidence

Stainless explicitly maps selected event types or error properties to an `error` action that raises an exception. Other events use `yield`, including a final fallthrough for future variants. Fern distinguishes protocol-level event discrimination from discriminators inside JSON data, enabling an event union to include completion and error-shaped domain variants. Speakeasy generates typed errors for modeled HTTP failures, while its stream schemas and unions determine decoded stream values.

### Kotlin SDKGen conclusion

An HTTP 200 does not imply that every subsequent frame is successful, but SDKGen must not guess that any field called `error` is fatal.

- A declared terminal error rule maps the frame to a generated typed stream exception.
- The exception terminates normal and detailed flows identically.
- An error-shaped variant deliberately included in the event union remains an ordinary value unless the contract classifies it as terminal.
- Transport, framing, and decoding failures terminate with their corresponding typed runtime exceptions.
- Exceptions retain bounded and redacted event/protocol context.
- The low-level raw byte stream remains available for APIs whose framing cannot be modeled.

This combines Stainless's explicit error actions with schema-driven domain unions and avoids surprising name-based inference.

## Resumable SSE versus retries

Ordinary retrying after events have been emitted can duplicate data. Fern's opt-in resumable SSE support demonstrates the safe exception: reconnect with `Last-Event-ID` only when the server contract supports resumption.

Kotlin SDKGen keeps two engines separate:

- request retries operate before any stream data is emitted;
- resumable SSE reconnection operates after interruption and requires explicit metadata, replay-safe request construction, event IDs, bounded attempts, and terminal-sentinel semantics.

The SSE `retry:` field may guide delay but remains bounded by client policy. Cancellation and declared terminal errors never reconnect automatically.

## Serialization and media-type codecs

### Kotlin foundation

`kotlinx.serialization` is Kotlin Multiplatform, compiler-generated, and supports custom, contextual, and polymorphic serializers. Its JSON format exposes the strictness controls SDKGen needs for defaults, unknown keys, explicit nulls, coercion, and discriminators.

Ktor demonstrates media-type converter registration through ContentNegotiation. Kiota goes further by keeping parse-node and serialization-writer factories in content-type registries independent of generated request builders and HTTP adapters.

### Kotlin SDKGen conclusion

Use `kotlinx.serialization` for public model integration and the default JSON implementation, but dispatch wire formats through an SDK-owned codec registry. This allows one generated operation path to support JSON, text, XML, form data, multipart, binary bodies, and vendor codecs.

Unlike Kiota's global singleton registries, SDKGen registries are immutable and client-scoped. This avoids cross-test contamination, application-wide mutation, and initialization-order bugs. Unlike directly delegating to Ktor ContentNegotiation, the same codec behavior works with OkHttp, Java `HttpClient`, and user transports.

Custom generated serializers remain necessary for OpenAPI unions, open enums, discriminators, additional-property capture, and absent-versus-null semantics. The default codec configuration is SDK-controlled so an application-wide permissive `Json` object cannot silently alter wire behavior.

For response evolution, SDKGen ignores unknown properties on otherwise closed generated models while validating every known field strictly. Models explicitly permitting additional properties preserve them as `JsonElement` values. Request models expose extra fields only when generated intentionally, preventing response-tolerance settings from becoming accidental request output.

### Enum evolution

Stainless avoids plain Java enums because a newly introduced server value can cause runtime failure, and its Python generator prefers literal/string-oriented representations for forward compatibility. Speakeasy supports explicit open enums: TypeScript wraps unrecognized strings, Python passes them through, and Java uses a concrete class rather than `enum` when unknown values are allowed.

Kotlin SDKGen uses a Kotlin value type with documented companion constants and an accessible raw value. This provides autocomplete and nominal type safety while preserving new server values. A closed `enum class` is generated only by explicit policy. This default is intentionally more evolution-tolerant than generators that require an extension to opt into open enums.

### Missing versus explicit null

Stainless preserves field-set information and exposes raw field state so users can distinguish missing, null, and value. Speakeasy uses three-state nullable wrappers where the target language otherwise collapses those states; its Java generation uses `JsonNullable`, and new Go SDKs enable an optional-nullable wrapper by default.

`kotlinx.serialization` demonstrates why `explicitNulls` alone is insufficient: omitting nulls can produce asymmetric round trips when a property also has a default.

Kotlin SDKGen therefore preserves a three-state wire representation internally. Builders track assignment, allowing `field = null` to mean present-null and no assignment to mean absent. Normal getters remain ergonomic, while generated presence accessors expose exact state when required. Custom serializers consume the stored state directly rather than relying on global JSON defaults.

## Multipart uploads

Multipart encoding belongs above the concrete HTTP engine when an SDK supports multiple transports. The industry examples converge on that boundary even though their public types differ:

- Speakeasy generates multipart upload operations from OpenAPI and recommends streaming large file content rather than materializing it in memory. It also exposes a generator setting for standards-compliant repeated multipart array field names versus a legacy `[]` convention.
- Ktor's client multipart builder accepts streaming `InputProvider` bodies and explicit per-part `Content-Type` and `Content-Disposition` headers, including filenames. The engine receives an already-described streaming request body.
- Swift OpenAPI Generator generates a typed enum for declared multipart parts, models OpenAPI `encoding` headers and content types, supports both buffered and `AsyncStream`-produced multipart bodies, and represents unknown parts with a raw headers-plus-`HTTPBody` form. That body abstraction is owned by the shared OpenAPI runtime and then consumed by pluggable transports.

Kotlin SDKGen therefore generates typed part models and performs boundary/header framing in its neutral runtime. The Ktor, OkHttp, Java HTTP, and custom adapters transmit the encoded body instead of independently recreating multipart semantics. This guarantees identical wire output across transports and keeps OpenAPI `encoding` behavior testable with transport-independent fixtures.

Streaming is the default for binary parts; the complete request is never buffered merely to construct multipart framing. Common code uses `SdkByteStream`, not `File`, `Path`, `InputStream`, `ByteReadChannel`, or OkHttp request bodies. Platform modules can provide convenience conversions without contaminating generated APIs.

Replayability is compositional: a multipart body is replayable only when every part can be recreated. Known lengths permit a deterministic `Content-Length`; otherwise adapters use their supported streaming transfer mode. This is an SDKGen-specific explicit rule worth adding because mainstream generator documentation usually demonstrates streaming but does not expose replay safety as a portable public contract.

## Transfer progress

Progress APIs are generally observational rather than an additional operation result:

- OkHttp's official upload-progress recipe wraps a `RequestBody`, counts bytes as they are written to the sink, reports an optional/unknown content length, and sends completion through a listener. `EventListener` observes call phases and final request/response byte counts, but incremental byte progress requires observing the body itself.
- Ktor demonstrates progress in the context of an individual client request and streaming body rather than changing the endpoint's return type. Its multipart example streams a provider-backed part, which lets byte observation remain independent of whole-body buffering.
- AWS SDK for Java's S3 Transfer Manager attaches one or more `TransferListener`s to a request. Listener contexts provide lifecycle events and a `TransferProgress` snapshot with total bytes transferred, optional total size, percentage, rate, and estimated remaining time.

These patterns support a transport-neutral listener attached through per-call options. Kotlin SDKGen observes its own `SdkByteStream` abstraction, so the feature is available to every adapter without exposing Ktor or OkHttp body classes. A `Flow` bridge is useful for UI state, but making a second flow part of each generated operation would complicate start, cancellation, and ownership semantics.

SDKGen adds an explicit attempt number and attempt-local counters because transparent retries can resend bytes. This prevents misleading percentages and lets consumers distinguish transfer progress from retry history. Callback work must be fast and non-suspending because body observers execute on the data path; asynchronous UI or telemetry processing should use a bounded bridge. Observer failures are isolated from the request.

## Interceptors and lifecycle observation

Mature HTTP clients and SDK runtimes distinguish one logical operation from its physical network exchanges:

- OkHttp application interceptors run once, observe the caller's original intent, and wrap redirects or retries. Network interceptors observe individual exchanges and may run multiple times for one call.
- AWS SDK for Java v2 exposes execution phases before and after marshaling, transmission, unmarshalling, completion, and failure. Its execution-listener design explicitly marks request-level events as once per logical request and transmission events as once per physical request, including retry attempts.
- Kiota places generated request builders above a request adapter and an ordered middleware stack containing redirect, retry, authorization, inspection, and the final HTTP call. The generated surface remains separated from the concrete client.

Kotlin SDKGen follows the same conceptual split while deliberately avoiding AWS's very broad public hook matrix. A logical-call middleware layer runs once around the retry engine; an attempt layer runs for every physical request. A separate read-only lifecycle observer handles tracing and metrics so an observer cannot accidentally mutate requests or change control flow.

The runtime owns retry repetition, so public middleware can invoke its continuation at most once. This differs intentionally from OkHttp application interceptors, which may invoke `proceed` multiple times: allowing that in SDKGen would bypass retry quotas, idempotency rules, replayability checks, and attempt accounting. Explicit short-circuiting remains useful for tests, caches, and policy enforcement.

Ordering is contractual rather than adapter-dependent. User mutation occurs before final authentication or signing, while observer views are redacted and cannot consume streaming bodies. Adapter-native Ktor or OkHttp hooks remain available below the portable runtime for advanced engine-specific needs.

## Telemetry, logging, and redaction

OpenTelemetry defines cross-language propagation and semantic conventions, while its Java implementation is a JVM library. Micrometer provides an observation facade and deliberately distinguishes low-cardinality keys suitable for metrics from high-cardinality context more suitable for traces. SLF4J is likewise a JVM logging facade whose provider is selected by the application.

A KMP generator runtime therefore should not depend directly on any of them. SDKGen emits neutral, read-only lifecycle events and optional JVM modules translate those events into OpenTelemetry spans and metrics, Micrometer observations, or parameterized SLF4J messages. This keeps backend selection with the application and avoids dragging JVM dependencies into iOS, native, or JavaScript artifacts.

HTTP method, normalized route/operation ID, status class, retry outcome, and SDK version are bounded dimensions. Raw URLs, path and query values, request IDs, arbitrary headers, and payloads are not metric labels. Trace propagation is supplied by an integration and runs before final request signing. Bodies and secrets remain denied by default, and observer failures cannot affect request execution.

## Generator plugin boundary

OpenAPI Generator permits custom generators and template-directory overrides. That offers broad freedom but makes semantic validation and compatibility reporting dependent on arbitrary templates. Smithy Build instead applies ordered model transforms and generator plugins to projections, discovers JVM plugins through Java SPI, and produces artifacts from typed models.

Kotlin SDKGen follows the Smithy-style typed model boundary, not free-form template replacement. Plugins receive immutable, phase-specific inputs and return values that the core validates before continuing. Plugin order and identity are explicit in configuration and manifests. Conflicts are errors rather than last-writer-wins behavior.

The public SPI remains experimental in `0.x`, and third-party loading follows only after built-in plugins prove the boundary. Gradle execution should use declared, relocatable inputs/outputs and Worker API isolation where practical. Isolation controls classpaths and cache behavior; it is not a security sandbox. Third-party JVM plugins are trusted code and must be pinned like build dependencies.

Arbitrary templates and post-generation rewriting are intentionally excluded from 1.0 because they bypass the semantic IR, centralized KotlinPoet emission, deterministic formatting, and compatibility reports. Overlays and typed declaration augmentation cover the supported customization path.

## Compatibility, conformance, and release gates

Industry tooling covers different layers rather than one universal compatibility check:

- Oasdiff classifies consumer-visible and breaking changes between OpenAPI documents and emits machine-readable reports with source locations and fingerprints.
- Kotlin Gradle plugin ABI validation compares JVM class and KMP `klib` surfaces and can derive dumps from actual Maven publications.
- Gradle build-cache correctness requires complete declared inputs and outputs, path sensitivity, relocatable tasks, and deterministic output; code generators are specifically vulnerable to timestamps and unordered collections.
- Property-based test frameworks such as Kotest support deterministic seeds, explicit edge cases, and multiplatform execution.

SDKGen therefore gates five independent surfaces: source-contract semantics, normalized semantic IR, generated Kotlin source/API, runtime behavior, and published runtime ABI. OpenAPI compatibility does not predict Kotlin renames, overload changes, nullability representation, package moves, or binary breakage, so it cannot be the only gate.

The test pyramid combines small semantic fixtures, readable golden files, generated compilation, serialization properties, neutral runtime contracts executed against every adapter, full OpenRouter generation, and clean consumer builds from staged publications. PR checks remain focused; main and release workflows widen the target matrix and provenance checks. Scheduled schema drift may open a tested review change but never merge or publish it.

## Remaining choice research

### Mixed primitive and object unions

Union representation is language-specific across generators. Speakeasy uses native unions where a language has them and a tagged supporting object with constructors in Go. Swift OpenAPI Generator emits enums and, without a discriminator, tries candidate decoders. Forward-compatible generators preserve an unknown raw variant only when the contract is intentionally open.

Locked decision: use an adaptive typed representation and direct discriminator dispatch where available. Closed structural `oneOf` uses generated case wrappers and unique-match validation; first-match decoding is order-sensitive, and multiple matches are an ambiguity error unless contract metadata resolves them. Structural `anyOf` is different: all successful branches are semantically relevant, so Phase 0 must compare composite, raw-preserving, and typed-view representations that retain exact wire data instead of narrowing lossily to one case. A raw unknown case belongs only to an intentionally open union, not every `oneOf`.

### Kotlin baseline and portable formats

Kotlin 2.4.10 is the current stable release as of 2026-07-16, but it was released only two days before this audit. `kotlin.time.Instant` became stable in Kotlin 2.3, while `kotlin.uuid.Uuid` became stable in Kotlin 2.4. `kotlin.time.Duration` is already stable and serializes as an ISO duration. Current `kotlinx-datetime` recommends standard-library `Instant` while continuing to provide KMP civil-time types such as `LocalDate`, `LocalTime`, and `LocalDateTime`.

Locked decision: use Kotlin 2.3.20 across the generator, published runtime, and generated output, avoiding Kotlin 2.4-only APIs until the surrounding KMP ecosystem has had time to adopt the release. Use `kotlin.time.Instant` and `Duration`, use `kotlinx-datetime` local civil-time types, and provide SDK-owned string-backed value types for UUID, URI, and exact decimal values. Binary payloads use `ByteArray` when materialized and `SdkByteStream` at streaming operation boundaries. Every format mapping remains configurable.

This avoids adopting Kotlin 2.4-only UUID APIs immediately after release while avoiding lossy `Double` decimals and JVM-only `URI` or `BigDecimal` types.

### Secondary API corpora

GitHub and Stripe are complementary candidates:

- GitHub publishes bundled and dereferenced OpenAPI 3.0 and 3.1 descriptions under MIT. Its corpus exercises a very large operation surface, `$ref` graphs, vendor extensions, multi-segment parameters, custom media types, Link-header pagination, versioned products, and documented specification limitations.
- Stripe publishes current GA and preview OpenAPI specifications, including an SDK-oriented variant and fixtures. Its corpus exercises form-oriented requests, idempotency, cursor pagination, expandable resource unions, extensive vendor extensions, very large schemas, and frequent drift.

Locked decision: use GitHub REST and Stripe. Together they cover substantially different shapes from OpenRouter without adding product-specific logic to the core. Fixtures are pinned by commit and used offline; live credentials are not required.

## Requirements open-question audit

| Original question | Status after interview |
| --- | --- |
| Parser and OpenAPI 3.1 fidelity | Phase 0 benchmark, not a preference decision |
| Litote reuse | Phase 0 benchmark |
| Fabrikt reuse | Phase 0 benchmark |
| Overlay versus Kotlin metadata file | Resolved: standard overlays plus canonical `x-sdkgen-*` extension schemas |
| Semantic-model/plugin boundary | Resolved: generator-owned immutable IR and typed validated phases |
| KotlinPoet emitter | Phase 0 benchmark; KotlinPoet remains the recommended final emitter |
| Missing versus null | Resolved: exact three-state wire presence |
| Mixed primitive/object unions | Partially resolved: closed `oneOf` uses adaptive sealed cases and strict unique matching; Phase 0 selects a lossless representation for multi-match `anyOf` |
| Portable format types | Resolved: Kotlin 2.3.20 baseline and portable semantic types with configurable mappings |
| Descriptor ownership | Resolved: generated by core, consumed by optional adapters |
| Request-driven streaming annotation | Resolved: explicit `x-sdkgen-streaming` metadata or overlay |
| Minimum `0.x` plugin surface | Resolved: experimental typed phases, built-in validation first, third-party loading later |
| Two secondary API corpora | Resolved: GitHub REST and Stripe |
| Quantitative performance budgets | Set from Phase 0 measurements |
| Artifact split | Architectural split resolved; exact publication granularity validated in Phase 0 |
| Published ABI validation tool | Phase 0 comparison of the experimental KGP DSL and maintenance-mode standalone validator against actual JVM/KMP publications |

## Detailed response and event projections

Several generators provide raw-response or metadata access without making it the normal return shape. Kotlin SDKGen applies the same idea consistently:

- body-first ordinary operations;
- `withResponse()` for status and header metadata;
- decoded `Flow<T>` for ordinary stream consumption;
- a detailed stream projection for SSE ID, type, retry interval, comments/control classification, and bounded raw data.

Both projections use the same generated descriptor and throw the same typed exceptions.

## Intentional differences from other generators

| Area | Kotlin SDKGen decision | Reason |
| --- | --- | --- |
| Hosting | Local open-source generator | Reproducibility and community ownership |
| Transport | Neutral SPI plus adapters | KMP and JVM ecosystem choice |
| Retrofit | Not the core transport | Retrofit remains Android/JVM and does not itself consume OpenAPI |
| Extension parsing | Strict inside `x-sdkgen-*` | Prevent silent semantic loss |
| Vendor extensions | Explicit compatibility profiles | Avoid surprising implicit behavior |
| Pagination inference | Suggestions only | Names do not establish semantics |
| Prefetch | None by default | Predictable cancellation and request counts |
| Stream retry | Separate resumable SSE engine | Prevent duplicate events |
| Raw bytes | Suspending pull stream | Buffer reuse and neutral adapters |
| Runtime options | Typed sealed overrides | Kotlin clarity without partial-merge ambiguity |

## Primary sources

### Specifications

- [OpenAPI Specification 3.1.1](https://spec.openapis.org/oas/v3.1.1.html)
- [OpenAPI Overlay Specification](https://spec.openapis.org/overlay/latest.html)
- [RFC 9110: HTTP Semantics](https://www.rfc-editor.org/rfc/rfc9110.html)

### Generators

- [Speakeasy extension reference](https://www.speakeasy.com/docs/speakeasy-reference/extensions)
- [Speakeasy retries](https://www.speakeasy.com/docs/sdks/customize/runtime/retries)
- [Speakeasy pagination](https://www.speakeasy.com/docs/runtime/pagination)
- [Speakeasy SSE](https://www.speakeasy.com/docs/customize-sdks/server-sent-events/)
- [Speakeasy JSONL](https://www.speakeasy.com/docs/sdks/customize/runtime/jsonl-events)
- [Fern extension reference](https://buildwithfern.com/learn/api-definitions/openapi/extensions/overview)
- [Fern overlays](https://buildwithfern.com/learn/api-definitions/openapi/overlays)
- [Fern streaming](https://buildwithfern.com/learn/api-definitions/openapi/endpoints/sse)
- [Stainless extensions](https://www.stainless.com/docs/openapi/extensions/)
- [Stainless streaming](https://www.stainless.com/docs/sdks/configure/streaming/)
- [Swift OpenAPI Generator streaming body design](https://github.com/apple/swift-openapi-generator/blob/main/Sources/swift-openapi-generator/Documentation.docc/Proposals/SOAR-0004.md)
- [Swift OpenAPI Generator multipart design](https://github.com/apple/swift-openapi-generator/blob/main/Sources/swift-openapi-generator/Documentation.docc/Proposals/SOAR-0009.md)

### Kotlin and runtime behavior

- [AWS SDK for Kotlin pagination](https://docs.aws.amazon.com/sdk-for-kotlin/latest/developer-guide/pagination.html)
- [AWS SDK for Kotlin retries](https://docs.aws.amazon.com/sdk-for-kotlin/latest/developer-guide/retries.html)
- [Ktor client streaming responses](https://ktor.io/docs/client-responses.html)
- [Ktor client upload progress and multipart example](https://github.com/ktorio/ktor-documentation/tree/main/codeSnippets/snippets/client-upload-progress)
- [OkHttp upload progress recipe](https://square.github.io/okhttp/recipes/#upload-progress-kotlin)
- [OkHttp interceptors](https://square.github.io/okhttp/features/interceptors/)
- [AWS SDK for Java S3 Transfer Manager](https://github.com/aws/aws-sdk-java-v2/tree/master/services-custom/s3-transfer-manager)
- [AWS SDK for Java transfer-listener design](https://github.com/aws/aws-sdk-java-v2/blob/master/docs/design/services/s3/transfermanager/listener/README.md)
- [AWS SDK for Java execution interceptors](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/interceptors.html)
- [Kiota Java architecture](https://github.com/microsoft/kiota-java/blob/main/_autodocs/ARCHITECTURE.md)
- [OpenTelemetry specification](https://github.com/open-telemetry/opentelemetry-specification)
- [Micrometer Observation](https://docs.micrometer.io/micrometer/reference/observation.html)
- [SLF4J manual](https://www.slf4j.org/manual.html)
- [OpenAPI Generator customization](https://openapi-generator.tech/docs/customization/)
- [Smithy Build configuration](https://smithy.io/2.0/guides/smithy-build-json.html)
- [Gradle build cache](https://docs.gradle.org/current/userguide/build_cache.html)
- [Kotlin binary compatibility validation](https://kotlinlang.org/docs/gradle-binary-compatibility-validation.html)
- [Oasdiff](https://github.com/oasdiff/oasdiff)
- [Kotest property testing](https://kotest.io/docs/proptest/property-based-testing.html)
- [Ktor client timeouts](https://ktor.io/docs/client-timeout.html)
- [Ktor I/O interoperability](https://ktor.io/docs/io-interoperability.html)
- [Kotlin Flow](https://kotlinlang.org/docs/flow.html)
- [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization)

### Additional SDK patterns

- [Azure SDK for Java pagination](https://learn.microsoft.com/en-us/azure/developer/java/sdk/pagination)
- [Microsoft Graph pagination](https://learn.microsoft.com/en-us/graph/paging)
- [Kiota-generated Microsoft Graph clients](https://learn.microsoft.com/en-us/graph/sdks/generate-with-kiota)

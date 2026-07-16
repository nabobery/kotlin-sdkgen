# Kotlin SDKGen: Design Decisions and Research

| Field | Value |
| --- | --- |
| Status | Living decision record |
| Last updated | 2026-07-16 |
| Product | Open-source OpenAPI 3.1 Kotlin and Kotlin Multiplatform SDK generator |
| Relationship to `requirements.md` | Locked decisions here refine or supersede earlier proposals; the requirements will be reconciled after the design interview |

## Purpose

This document records decisions made during the Kotlin SDKGen design interview and the evidence used to validate them. It is intentionally updated before implementation so architectural decisions do not remain only in chat history.

Detailed comparisons, rejected alternatives, and source notes live in [Industry Patterns and Research](research/industry-patterns.md). This file remains the authoritative statement of what Kotlin SDKGen will do.

The target is broader than a wire-model generator. Kotlin SDKGen should generate a complete, usable, Kotlin-first SDK while retaining stable extension points for handwritten Kotlin APIs. Its ambition is comparable to modern SDK generators such as Speakeasy, Fern, and Stainless, while remaining local, open source, transport-neutral, and Kotlin Multiplatform-first.

## Product boundary

- Build a local open-source SDK factory, not a hosted platform.
- Generate complete public SDKs and support optional handwritten facades and extensions.
- Keep generated and handwritten source trees separate.
- Prefer composition: public interfaces, wrappers, decorators, extension functions, and DSLs.
- Do not depend on editable generated regions or inheritance hooks.
- Use a thin shared runtime plus generated API-specific protocol glue.
- Keep the runtime SPI small and stable; runtime implementations remain internal where possible.

## Platforms and publication

### Tier 1 release-blocking targets

- JVM with JDK 17 compatibility.
- Android.
- iOS device and simulator.
- macOS.
- JavaScript browser and Node.js.

### Tier 2 compile and contract-test targets

- Linux x64 and arm64.
- Windows `mingwX64`.

### Experimental or deferred

- WasmJS is experimental.
- watchOS, tvOS, and WasmWASI are deferred to keep the initial support and CI matrix bounded. This is a product-scope decision: supported watchOS/tvOS ARM device and simulator targets remain Kotlin/Native Tier 2, while their legacy x64 simulator variants are deprecated.

The generator uses one shared JVM engine. The CLI ships in early alpha; the Gradle plugin must exist before beta. CLI and Gradle are equal front ends over the same engine.

## Configuration and workspace model

- Use a versioned, format-neutral typed configuration model.
- The conventional file is `sdkgen.yaml`; JSON is also accepted.
- Start at `schemaVersion: v1alpha1`.
- Publish a JSON Schema for configuration.
- Unknown configuration keys are errors, with explicit migrations between incompatible versions.
- Use `sdkgen.lock` for input locations, versions, and digests.
- Keep API-contract corrections in standard OpenAPI Overlay documents, not generator configuration.
- Use one simple `sdkgen.yaml` per SDK.
- Optionally support `sdkgen.workspace.yaml` to orchestrate named SDK configurations and target order.
- Workspace configuration does not introduce inheritance or change per-SDK semantics.
- Keep per-SDK lock files; an aggregate workspace report is optional.

## OpenAPI intake and composition

- Basic generation starts from one root OpenAPI document plus its `$ref` graph and ordered overlays.
- Add an explicit first-class `compose` stage after the one-root pipeline is working.
- Composition produces one effective root before overlays and generation.
- Composition conflicts fail by default.
- Identical definitions deduplicate; explicitly compatible, non-overlapping definitions may merge.
- Meaningful conflicts require namespaces, overlays, or a per-conflict policy.
- An opt-in named `speakeasy-compatible` last-wins mode may be supported, but is never the default.

## Naming and generated client organization

- Use package namespaces by default.
- Support explicit optional type-name prefixes.
- Never add prefixes automatically after a collision because doing so would silently rename public API types.
- Fail with an actionable diagnostic and require explicit naming configuration.
- Canonical schema identity is namespace-qualified; wire names never change.
- Group resource clients from OpenAPI tags.
- Permit explicit grouping through configuration, overlays, or `x-sdkgen-group`.
- Untagged operations remain on the root client.
- Support nested groups but diagnose excessive depth.
- Multi-tag operations appear in every matching resource group while sharing one internal operation descriptor and implementation.
- An optional `primaryGroup` controls canonical documentation placement.

## Request and response API shape

- Every operation has one canonical immutable request object.
- Kotlin receives a builder-lambda convenience API.
- Java receives a conventional builder in the JVM interop artifact.
- Optional fields extend builders without automatically removing convenience APIs.
- The normal client is body-first.
- A mirrored `withResponse()` projection returns `SdkResponse<T>` with status and headers. Doubling every operation's method surface is an accepted, deliberate cost paid for autocomplete discoverability, matching Speakeasy and Stainless precedent.
- Normal and detailed views execute the same operation descriptor and throw identical typed exceptions for non-success responses.
- A separate low-level transport API is available when callers need all HTTP statuses as values.

## Transport-neutral runtime

- The common SDK API is genuinely transport-neutral.
- Provide adapter artifacts for Ktor, OkHttp, Java `HttpClient`, and user-defined transports.
- Each adapter must prove streaming, cancellation, timeout, and resource-lifetime semantics.
- Publish a neutral core plus separate convenience artifacts such as `-ktor`, `-okhttp`, and `-java-http`.
- The common async API uses `suspend` and cold `Flow`.
- An optional JVM interop artifact provides `CompletableFuture` and Java `Flow.Publisher` projections.

## Call options

- Generated operations accept one typed `CallOptions` aggregate rather than growing independent parameters for retries, timeouts, pagination, headers, and observability.
- `CallOptions` receives the same Kotlin builder-lambda treatment as generated request objects, so per-call policy reads as `options { timeout = 30.seconds; retries = Disabled }` rather than nested constructor calls.
- Client defaults and per-call overrides use the same typed policy structures.
- Wire request models never contain local execution policy.
- Each policy override is nullable:
  - absence means inherit;
  - `Disabled` explicitly disables the policy;
  - `Replace(value)` replaces the complete resolved policy.
- Per-call runtime policies do not perform implicit field-level merging.
- Contract-level extensions may define explicit merge behavior during generation.

## Timeouts

- Define portable semantic timeouts in the core runtime and keep engine-specific network tuning in adapter artifacts.
- Core timeout policies include:
  - total logical-call deadline across retries;
  - per-attempt deadline;
  - streaming idle timeout between received bytes or decoded events;
  - upload idle timeout between successful writes;
  - pagination elapsed-time budget.
- A configured total deadline covers the whole logical operation; for a stream it covers collection until completion or cancellation.
- Long-lived streaming operations have no finite total deadline by default and instead use an explicit idle policy when configured.
- Adapter-specific options may expose connect, DNS, TLS, socket, pool, and engine settings.
- Every adapter declares supported capabilities. Unsupported transport tuning fails configuration validation rather than being ignored.
- Timeout failures use typed exceptions that identify the semantic phase and participate in retry classification only when operation safety and replayability allow it.

## Authentication

- Generate typed security configuration from OpenAPI Security Scheme and Security Requirement objects.
- Preserve OpenAPI authorization logic exactly:
  - schemes inside one Security Requirement are all required;
  - entries in the Security Requirement array are alternatives;
  - an empty requirement permits anonymous access.
- Execute authentication through a transport-neutral suspending provider SPI.
- Generate first-class support for API keys in headers, queries, and cookies; HTTP basic and bearer schemes; OAuth2; OpenID Connect; and mutual TLS metadata.
- Permit custom providers for schemes or credential acquisition that OpenAPI cannot fully describe.
- Providers may retrieve, cache, and refresh credentials asynchronously.
- Scope providers to explicit trusted hosts and re-evaluate them for redirects, pagination URLs, and other absolute targets.
- Never blindly forward authorization, cookies, or API keys across origins.
- Allow a per-call authentication override through `CallOptions` without changing the wire request model.
- Exclude secrets from generated operation descriptors, equality, hashes, diagnostics, logs, telemetry attributes, and `toString()`.
- Treat mutual TLS and other transport-bound authentication as adapter capabilities rather than ordinary header providers.
- Keep OAuth2 and OpenID scheme, flow, scope, and discovery metadata in generated/core contracts.
- Provide simple static API-key, basic, and bearer credentials in core.
- Do not implement browser interaction, authorization redirects, platform token storage, or a universal OAuth session manager in core.
- Acquire and refresh OAuth/OpenID credentials through pluggable providers and optional identity-library integration artifacts.

## Serialization architecture

- Use `kotlinx.serialization` as the standard Kotlin Multiplatform model and JSON codec foundation.
- Generate immutable public models with `@Serializable` where the wire shape is representable directly.
- Generate custom serializers for unions, open enums, presence semantics, discriminators, additional properties, and other non-trivial wire shapes.
- Dispatch serialization and deserialization through an SDK-owned media-type codec registry.
- Register JSON as the standard codec; support XML, form, multipart, text, binary, and vendor media types through additional codecs.
- Keep the codec registry immutable and scoped to a client; do not use mutable global singleton registration.
- Let users add codecs through client construction without replacing generated operation logic.
- Keep HTTP transports responsible only for request/response metadata and byte bodies; transports do not own model serialization.
- Keep wire-critical JSON behavior controlled by the generated SDK runtime rather than inheriting an arbitrary application-wide `Json` instance.
- Permit adapter modules to integrate with Ktor content negotiation or other ecosystem facilities without making them the common runtime contract.
- Decode unknown response properties tolerantly by default while retaining strict type validation for known fields.
- Preserve unknown properties as `JsonElement` values when the contract explicitly models additional properties or enables a controlled SDKGen extensibility escape hatch.
- Never serialize undeclared request fields unless the generated request model exposes an explicit `extraFields` escape hatch.
- When typed and extra fields share a wire name, the typed field wins deterministically.
- Preserve explicit additional-property maps during round trips.
- Use strict fixtures and OpenAPI drift reports to reveal newly observed fields without making production decoding brittle.
- Generate string enums as forward-compatible value types by default.
- Provide named constants for documented values while preserving and round-tripping unknown wire values.
- Generate a closed Kotlin `enum class` only when an explicit SDKGen policy or contract annotation requests closed behavior.
- Keep the raw wire value accessible and stable for logging, persistence, equality, Java interop, and future SDK upgrades.
- Do not map unknown values to a single `UNKNOWN` constant because doing so loses the original server value.
- Open enums can never give the compiler exhaustive `when` checking; that is inherent to forward compatibility, and documentation plus optional lint tooling are the intended mitigation, not a closed representation.
- Phase 0 compares the `@JvmInline value class` shape against an AWS-style sealed hierarchy with an unknown-value case, because value-class members are name-mangled and awkward from Java; the unknown-value round-trip semantics are locked, the vehicle is not.
- Preserve absent, present-null, and present-value as distinct wire states.
- Cross presence with `required` per property: OpenAPI 3.1 permits a required property whose type includes `null`, where present-null is legal but absence is a contract violation; request-model validation must distinguish those cases even though decode-time presence tracking treats them uniformly.
- Ordinary generated property access returns an ergonomic `T?`; explicit presence inspection is a separately named opt-in API. Generated code never forces `Optional`-style wrappers onto plain field reads.
- Generated builders track whether a field was assigned, so assigning `null` emits an explicit JSON null while never assigning the field omits it.
- Keep the immutable model's presence state exact while exposing ergonomic nullable value accessors and generated presence inspection.
- Do not rely on global `explicitNulls` or default-value settings to infer presence because doing so can make encoding and decoding asymmetric.
- Preserve presence for PATCH/update requests, defaulted properties, response round-tripping, and additional-field precedence.

## Multipart uploads

- Generate typed multipart request models from the OpenAPI schema and each media type's `encoding` metadata.
- Support typed text, JSON, binary, and nested structured parts, plus a controlled raw-part escape hatch for explicitly extensible contracts.
- Preserve per-part field name, filename, content type, declared headers, and other encoding directives.
- Encode multipart bodies in the transport-neutral runtime into the common streaming request-body abstraction; concrete HTTP adapters only transmit the resulting headers and bytes.
- Stream part bodies and multipart boundaries incrementally without buffering the whole request.
- Do not expose JVM-only `File`, `Path`, `InputStream`, OkHttp, or Ktor types in common generated APIs.
- Provide adapter or platform convenience functions that convert files and ecosystem stream types into the neutral `SdkByteStream` body contract.
- Derive whole-request replayability from every constituent part. One one-shot part makes the multipart request one-shot unless the caller explicitly enables bounded spooling or supplies a replayable source.
- Compute `Content-Length` only when every encoded part length and the generated boundary overhead are known; otherwise use the transport's supported streaming transfer mode.
- Keep multipart array encoding standards-compliant by default, while allowing an explicit compatibility policy for APIs that require legacy field-name conventions.
- Keep upload progress separate from multipart encoding semantics.

## Transfer progress

- Expose upload and download progress through a transport-neutral `TransferObserver` supplied through `CallOptions`.
- Observe the neutral request and response byte streams above concrete HTTP adapters so progress semantics remain identical for Ktor, OkHttp, Java `HttpClient`, and custom transports.
- Emit structured lifecycle events for transfer start, byte progress, completion, and failure.
- Include direction, logical call ID, retry attempt number, bytes transferred in the current attempt, optional content length, and completion state.
- Reset attempt-local counters when a retry starts; never present retransmitted bytes as more than 100 percent of one logical payload.
- Treat total length as optional because streaming and dynamically encoded bodies frequently have no known length.
- Keep observer callbacks non-suspending and require them to return quickly because byte observations occur on the I/O path.
- Contain observer failures so telemetry or UI code cannot fail the network operation.
- Permit bounded event coalescing to avoid invoking observers for every tiny network chunk while guaranteeing initial and terminal events and monotonic attempt-local counts.
- Provide optional convenience bridges to callback, `Flow`, or `StateFlow` usage without making a second flow part of every generated operation signature.
- Keep progress observation independent of multipart, serialization, and concrete engine body types.

## Interceptors and lifecycle observation

- Expose two explicitly scoped transport-neutral middleware layers: logical-call middleware and HTTP-attempt middleware.
- Run logical-call middleware once around request preparation, the retry engine, response decoding, and final completion or failure.
- Run attempt middleware for every physical HTTP attempt, including retry attempts and explicitly followed redirects governed by the runtime.
- Give logical middleware immutable operation metadata, generated input, effective `CallOptions`, and the eventual typed outcome.
- Give attempt middleware immutable neutral HTTP request/response metadata and neutral streaming bodies; do not expose concrete engine types.
- Allow sanctioned request replacement or stream wrapping while requiring middleware to preserve body ownership, cancellation, replayability, and content-length invariants.
- Keep retries owned by the runtime. A middleware chain may proceed at most once; middleware cannot create hidden retry loops by invoking `proceed` repeatedly.
- Permit an explicit short-circuit outcome for testing, caching, or policy enforcement, with the same typed success/error contracts as an executed call.
- Provide a separate read-only lifecycle observer for tracing, metrics, diagnostics, and audit events.
- Contain lifecycle-observer failures so observability cannot fail an SDK operation.
- Publish deterministic ordering for user middleware and reserved runtime stages such as validation, serialization, retry, authentication/signing, transport, decoding, and redaction.
- Apply final authentication or request signing after user request mutation so credentials cover the transmitted request.
- Expose only redacted views to ordinary lifecycle observers; privileged raw-body inspection requires an explicit unsafe diagnostic facility and is never enabled by default.
- Keep adapter-native interceptors and plugins available as advanced escape hatches, but do not make their behavior part of the portable SDK contract.

## Telemetry, logging, and redaction

- Keep the core runtime independent of OpenTelemetry, Micrometer, SLF4J, and any telemetry backend.
- Use the read-only lifecycle observer as the transport-neutral telemetry SPI and publish stable structured event fields.
- Provide optional JVM integration artifacts for OpenTelemetry, Micrometer, and SLF4J; do not make JVM observability libraries dependencies of common KMP code.
- Follow OpenTelemetry HTTP client semantic conventions where they apply and keep SDK-specific attributes in a documented namespace.
- Use low-cardinality metric dimensions such as SDK name/version, generated operation ID, HTTP method, normalized route, status class, retry outcome, and transport adapter.
- Provide a documented SDK-identification policy with generated SDK name/version, generator version, and platform. Adapters that can control `User-Agent` apply it in the reserved runtime stage after user middleware. Browser transports must not promise control that Fetch implementations may ignore; they may use an explicitly configured companion header when CORS permits it, and omission is never a request failure.
- Never use raw URLs, path parameters, query values, request IDs, user IDs, model input, or arbitrary header values as metric labels.
- Let the selected telemetry integration inject propagation headers. Injection occurs after user mutation and before final authentication or signing.
- Record typed exception class and bounded status metadata; do not record stack traces, messages, or bodies unless the application's integration explicitly enables them.
- Deny request and response bodies, authentication data, cookies, query values, and headers by default.
- Permit explicit allowlists for non-secret headers and bounded diagnostic fields; built-in secret names remain non-overridable redactions.
- Keep core logging silent except for structured diagnostics returned or emitted through configured observers.
- Provide an optional SLF4J bridge without selecting or transitively installing a logging provider.
- Contain telemetry and logging integration failures so they never alter call success, retry, or cancellation semantics.

## Generator plugin boundary

- Keep the generator fully useful without third-party plugins; overlays, canonical `x-sdkgen-*` extensions, and built-in rules remain the primary customization mechanisms.
- Expose a typed, phase-specific plugin SPI over generator-owned immutable representations rather than arbitrary templates or emitted source text.
- Support bounded phases for validation, normalized semantic-model transformation, naming/type mapping, declaration augmentation, and output verification.
- A transforming plugin returns a new validated value; it does not mutate shared model state.
- Resolve plugin order explicitly from configuration. Duplicate claims, incompatible transformations, and naming/type conflicts fail with source-linked diagnostics.
- Require plugin ID, version, SDKGen SPI version range, configuration digest, and ordered phase participation in the generation manifest.
- Keep the SPI experimental throughout `0.x`; require explicit version compatibility and permit breaking SPI changes only with migration notes. Do not promise binary stability before 1.0.
- Introduce third-party JVM plugin discovery only after built-in plugins validate the SPI; Java `ServiceLoader` is an implementation option, not part of generated SDK APIs.
- Isolate third-party plugins in the CLI and Gradle execution classpath where practical, including Gradle Worker API classloader isolation.
- Treat third-party plugins as trusted build-time code. A narrow API reduces accidental access but cannot securely sandbox arbitrary JVM code.
- Forbid plugins from silently fetching network resources, depending on undeclared files, writing outside declared outputs, adding timestamps, or observing host-specific paths. Such behavior violates the deterministic plugin contract and disables caching.
- Do not support arbitrary user templates or post-emission text rewriting in 1.0; they bypass semantic validation, formatting, compatibility analysis, and reproducibility.

## Compatibility, conformance, and release gates

- Treat OpenAPI contract diff, normalized semantic IR diff, generated Kotlin API diff, runtime behavior, and published binary ABI as five separate compatibility surfaces; no single diff replaces the others.
- Emit a deterministic manifest containing all source, overlay, configuration, generator, plugin, semantic-model, and generated-file digests without timestamps or absolute paths.
- Require semantic-model fixtures, focused readable goldens, generated-source compilation, serialization property tests, and runtime adapter contract tests.
- Run the same neutral transport contract suite against Ktor, OkHttp, Java `HttpClient`, and a reference fake transport.
- Make OpenRouter the first full stress and behavioral conformance suite, not a conditional code path in the generator.
- Add two unrelated real-world API corpora before 1.0 to catch assumptions accidentally optimized for OpenRouter; their selection remains a product decision.
- Use reproducible property-test seeds in CI and print failing seeds for local replay.
- Verify deterministic output across repeated runs, clean directories, path relocation, locale, timezone, and supported host operating systems.
- Validate the generator's published JVM and KMP ABI against the actual Maven publications. Phase 0 compares the experimental KGP ABI validation DSL with the maintenance-mode standalone `Kotlin/binary-compatibility-validator`, whose KLib support is also experimental. Select the tool or combination from publication-level evidence; neither implementation is locked in advance.
- Classify generated API additions, removals, renames, type changes, presence/nullability changes, and operation moves independently of OpenAPI breaking-change classification.
- On pull requests, run unit, semantic, golden, deterministic, JVM compile, representative KMP compile, and focused conformance tests.
- On the main branch, run the complete stable-target compile matrix, all adapter contracts, full OpenRouter generation, and compatibility reports.
- Before release, additionally run secondary target-family checks, clean consumer builds from staged publications, Maven metadata/signature verification, SBOM and provenance generation, and a reproducibility check from a clean checkout.
- Never auto-merge a drift update or auto-publish from a spec-update workflow.
- Set quantitative generation-time, memory, and output-size budgets only after Phase 0 establishes reproducible baselines.

## Mixed primitive and object unions

- Generate an adaptive typed representation for composed schemas. Closed `oneOf` schemas use one sealed case per declared variant; multi-match `anyOf` is not assumed to be an exclusive union.
- Use discriminator dispatch when the effective contract declares a valid discriminator mapping.
- Distinguish `oneOf` from `anyOf`; JSON Schema 2020-12 gives them different validation semantics and one decoding rule cannot serve both.
- For non-discriminated `oneOf`, evaluate every candidate and require exactly one successful match.
- Treat zero matches as a typed union-decoding failure with bounded candidate diagnostics.
- For `oneOf`, treat multiple matches as an ambiguity error rather than selecting the first schema by document order.
- For non-discriminated `anyOf`, a payload matching multiple candidates is valid per JSON Schema and MUST NOT be rejected. Phase 0 selects a representation that preserves exact wire round trips and the semantics of every successful branch. A deterministic preferred view may improve ergonomics, but it cannot silently discard other matched data or annotations.
- Union ambiguity diagnostics SHOULD emit a ready-to-apply overlay or `x-sdkgen-*` snippet that resolves the ambiguity, so strictness stays a workflow rather than a wall.
- Permit an explicit contract extension or overlay to define priority only when the API's behavior is intentionally order-dependent and cannot be described structurally.
- Generate a raw unknown case only when the effective schema intentionally models an open union; closed `oneOf` schemas remain closed.
- Provide Kotlin constructors/factories, exhaustive `when` support, Java-friendly case inspection, and exact round-trip serialization.

## Kotlin baseline and portable format types

- Use Kotlin 2.3.20 as the initial compiler, language, API, runtime, and generated-output baseline.
- Do not expose Kotlin 2.4-only APIs in the initial published runtime or generated SDKs.
- Map instants to stable `kotlin.time.Instant` and durations to `kotlin.time.Duration`.
- Map civil date/time formats to `kotlinx.datetime.LocalDate`, `LocalTime`, and `LocalDateTime`.
- Generate SDK-owned string-backed value types for UUID, URI, and exact decimal formats so common code remains portable and numeric precision is preserved.
- Use `ByteArray` for explicitly materialized binary values and `SdkByteStream` for streaming request or response bodies.
- Keep every format mapping configurable and record non-default mappings in the generation manifest and compatibility report.
- Re-evaluate the baseline on a documented release cadence rather than automatically adopting each new Kotlin release.

## Secondary conformance corpora

- Use the official GitHub REST OpenAPI description and Stripe OpenAPI specification as the two non-OpenRouter corpora required before 1.0.
- Pin each corpus by immutable commit and digest and run it entirely offline in normal CI.
- Exercise both bundled/reference-preserving inputs and supported dereferenced inputs where the upstream project provides them.
- Use GitHub to stress large operation surfaces, OpenAPI 3.0/3.1 ingestion, reference graphs, vendor extensions, custom media types, multi-segment parameters, and Link-header pagination.
- Use Stripe to stress form-oriented requests, idempotency, cursor pagination, expandable unions, extensive vendor extensions, fixtures, and frequent schema drift.
- Do not add GitHub- or Stripe-specific branches to generator core; compatibility corrections live in pinned overlays or explicit compatibility profiles.

## Errors

- Generated APIs throw typed exceptions rather than returning `Result<T>`.
- Runtime base exceptions are abstract or open, not sealed, because generated API-specific exceptions live in other modules.
- Generate concrete typed exceptions from modeled API errors.
- Preserve status, headers, request ID, operation ID, retry metadata, and cause.
- Bound and redact retained raw response bodies.
- Wrap engine failures in `SdkTransportException`.
- Never wrap or swallow `CancellationException`.
- Retry exhaustion retains the final error and attempt history.
- Use `UnknownApiException` as the typed fallback; it captures the status, headers, declared content type, and a bounded, redacted copy of the raw response body so undocumented error shapes remain diagnosable.
- `withResponse()` does not convert non-success responses into successful values.

## Retry and idempotency

### Retry engine

- Use a metadata-driven retry engine.
- Generated operation descriptors declare request safety, body replayability, throttling, retryable classifications, and idempotency semantics.
- The shared runtime evaluates transport phase, operation safety, body replayability, error classification, and retry budget.
- Retry connection failures only when the request is known not to have reached the server or when replay is safe.
- Retry idempotent methods only with replayable bodies.
- Honor `Retry-After` within configured bounds.
- Use bounded exponential backoff with full jitter.
- Use a retry quota or token bucket to prevent retry storms.
- Do not retry cancellation, validation, authentication, or serialization errors.
- Do not restart an ordinary stream after it has emitted data.
- Generated metadata, client defaults, and per-call overrides layer deterministically.

### Idempotency keys

- Generate an idempotency key only when the effective API contract declares client generation.
- Generate it once per logical call and reuse it across every attempt.
- An explicit caller value always wins.
- Never infer idempotency-key support from a header name, operation ID, or description.
- Put idempotency semantics in `x-sdkgen-*` extensions, directly or through an OpenAPI Overlay.
- Keep runtime retry limits in `sdkgen.yaml` or runtime configuration.

## SDKGen extension model

- Use focused extensions such as `x-sdkgen-retries`, `x-sdkgen-idempotency`, `x-sdkgen-pagination`, and `x-sdkgen-streaming`.
- Reserve a narrow document-level `x-sdkgen` object; do not turn it into a catch-all.
- Keep extension names stable and unversioned.
- Evolve extension schemas additively; use a new extension name only for an unavoidable semantic break.
- Publish schemas and examples for every canonical extension.
- Canonical `x-sdkgen-*` semantics are the internal source of truth.
- Provide explicit opt-in compatibility profiles such as `speakeasy` and `fern`.
- Profiles translate supported vendor extensions into the canonical semantic model and report every translation.
- Equivalent translated metadata deduplicates.
- Complementary values merge only where the extension schema explicitly permits it.
- Contradictory values fail until an overlay or explicit policy resolves them.
- Unknown `x-sdkgen-*` extensions and unknown fields inside known SDKGen extensions are errors.
- Unrelated vendor extensions are preserved in the semantic model.
- A report-only compatibility mode may inventory unknown SDKGen extensions, but source generation remains blocking.

## Pagination

### Public API

- Preserve the ordinary first-page operation.
- Generate a cold `Flow<Page>` view.
- Generate a flattened cold `Flow<Item>` view.
- Both flows share the same operation descriptor, error mapping, retries, and cancellation path.
- Preserve page-level cursors, totals, response metadata, and other fields.

### Contract and runtime behavior

- Require explicit pagination semantics for generation.
- An analysis command may suggest likely mappings, but suggestions never affect code until accepted in an extension or overlay.
- Compatibility profiles translate supported Speakeasy and Fern pagination extensions.
- Provide typed strategies for cursor/token, offset/limit, page number/page size, response-provided next URL, and response-provided next token.
- Compile strategies into one common transition model using constrained schema/property paths, not executable expressions.
- Fetch pages sequentially by default with one request in flight.
- Do not hide prefetching; callers may explicitly use Flow buffering.
- Retry only the failed page under the operation retry policy.
- Never restart from the first page after a later-page failure.
- After exhaustion, terminate with the typed exception and safe pagination context.
- Do not automatically persist checkpoints.
- Detect repeated tokens, repeated next URLs, and non-advancing offset/page state.
- Support optional `maxPages`, `maxItems`, and elapsed-time limits through runtime pagination options.
- Keep pagination execution controls outside wire request models.

### URL and credential safety

- Resolve relative next URLs against the current request.
- Allow absolute same-origin next URLs.
- Require an explicit trusted-host rule for cross-origin next URLs.
- Re-evaluate authentication for every next request.
- Never blindly copy authorization or sensitive headers across origins.
- Apply the same host-scoped credential policy to redirects, uploads, downloads, and user-provided absolute URLs.

## Streaming

### Raw and typed layers

- Use two transport-neutral layers:
  - an SDK-owned scoped byte-stream abstraction for raw request and response bodies;
  - generated typed `Flow<Event>` APIs for framed protocols.
- Do not expose Ktor `ByteReadChannel`, Okio `Source`, Java `InputStream`, or another engine type from common generated APIs.
- Define a minimal suspending pull-based `SdkByteStream` with bounded `copyTo` and `toByteArray(maxBytes)` conveniences.
- Adapter artifacts may provide bridges to Ktor, `kotlinx-io`, Okio, Java I/O, and engine-native types.
- Scope raw response bodies so network resources close on return, failure, or cancellation.

### Replayability

- Model request bodies explicitly as replayable or one-shot.
- Byte arrays, strings, and repeatable factories are replayable.
- Live streams are one-shot.
- Buffering a one-shot body is explicit, bounded, and disabled by default.
- Retry and redirect decisions consume replayability metadata.

### Protocol recognition

- Recognize unambiguous well-known media types:
  - `text/event-stream` for SSE (IANA-registered);
  - `application/jsonl` and `application/x-ndjson` for line-delimited JSON (de facto community conventions; neither is IANA-registered as of 2026, so they live in the same extensible recognized-media-type table rather than being treated as standards).
- Use the media-type schema for decoded event types, including discriminated unions.
- Require `x-sdkgen-streaming` for conditional modes, terminators, in-band errors, resumability, or ambiguous/non-standard framing.
- Do not infer conditional streaming solely from a request property named `stream`.

### SSE behavior

- Decode application values as the default `Flow<T>` API.
- Provide a mirrored detailed projection with event ID, event type, retry interval, comments/control classification, and bounded raw data.
- Support typed event unions, keepalive/control-event handling, explicit terminal sentinels, and typed in-band error classification.
- Follow WHATWG dispatch semantics: an event block whose accumulated data buffer is empty produces no application event; keepalives and comments never surface as spurious empty events.
- Classify in-band errors only through explicit contract metadata.
- Convert events declared as terminal errors into generated typed stream exceptions and terminate both normal and detailed projections identically.
- Keep error-shaped domain events as ordinary typed values when the declared event union models them that way.
- Do not infer fatal behavior from a property merely named `error`.
- Retain bounded, redacted event and protocol metadata on stream exceptions; use the low-level raw stream as the escape hatch.
- Distinguish graceful `done`, which may drain the connection, from immediate `break`, which closes it.
- Allow only bounded declarative event matchers such as event type, data prefix, or typed property; do not execute arbitrary expressions.
- Ordinary request retries never restart a stream after an emitted event.
- An explicitly resumable SSE operation may reconnect using `Last-Event-ID`, server `retry:` guidance, bounded reconnect limits, and replay-safety metadata.
- Resumable SSE uses a separate protocol engine from ordinary request retries.

## Industry research and lessons

| Source | Observed pattern | Applied decision |
| --- | --- | --- |
| Smithy and AWS SDKs | Generated retry safety/throttling metadata, retry token bucket, replayability, typed errors | Metadata-driven retry engine and quota |
| Speakeasy | OpenAPI extensions and overlays, per-call overrides, pagination page/item projections, typed SSE/JSONL, sentinels | Compatibility profile and ergonomic generated API |
| Fern | Focused extensions for idempotency, retries, pagination, streaming, terminators, conditional and resumable SSE | Canonical focused extensions and resumable SSE metadata |
| Stainless | Config-plus-contract SDK design, typed streaming variants, ordered event actions including yield/error/continue/done/break | Bounded declarative stream event rules |
| AWS SDK for Kotlin | Cold `Flow` paginators, scoped streaming bodies, runtime-owned `ByteStream` | Kotlin-native lazy pagination and scoped raw streams |
| Swift OpenAPI Generator | Runtime-owned `HTTPBody` shared by generated code, middleware, and pluggable transports | Neutral runtime body currency instead of engine types |
| Microsoft Kiota | Request-adapter architecture and host-scoped authentication | Small transport SPI and trusted-host credential rules |
| Azure SDK for Java | Separate page and item iteration, continuation-token access, reactive error channel | Page/item projections and caller-managed resumption |
| Ktor and kotlinx.coroutines | Structured cancellation, cold Flow, explicit buffering, streaming channels | No hidden prefetch and cancellation-safe adapters |

## Primary references

- [OpenAPI Specification 3.1.1](https://spec.openapis.org/oas/v3.1.1.html)
- [OpenAPI Overlay Specification](https://spec.openapis.org/overlay/latest.html)
- [Speakeasy extensions](https://www.speakeasy.com/docs/speakeasy-reference/extensions)
- [Speakeasy retries](https://www.speakeasy.com/docs/sdks/customize/runtime/retries)
- [Speakeasy pagination](https://www.speakeasy.com/docs/runtime/pagination)
- [Speakeasy SSE](https://www.speakeasy.com/docs/customize-sdks/server-sent-events/)
- [Speakeasy JSONL](https://www.speakeasy.com/docs/sdks/customize/runtime/jsonl-events)
- [Fern OpenAPI extensions](https://buildwithfern.com/learn/api-definitions/openapi/extensions/overview)
- [Fern overlays](https://buildwithfern.com/learn/api-definitions/openapi/overlays)
- [Fern streaming](https://buildwithfern.com/learn/api-definitions/openapi/endpoints/sse)
- [Stainless OpenAPI extensions](https://www.stainless.com/docs/openapi/extensions/)
- [Stainless streaming](https://www.stainless.com/docs/sdks/configure/streaming/)
- [AWS SDK for Kotlin pagination](https://docs.aws.amazon.com/sdk-for-kotlin/latest/developer-guide/pagination.html)
- [AWS SDK for Kotlin retries](https://docs.aws.amazon.com/sdk-for-kotlin/latest/developer-guide/retries.html)
- [Ktor streaming responses](https://ktor.io/docs/client-responses.html)
- [Ktor I/O interoperability](https://ktor.io/docs/io-interoperability.html)
- [Swift OpenAPI Generator streaming body proposal](https://github.com/apple/swift-openapi-generator/blob/main/Sources/swift-openapi-generator/Documentation.docc/Proposals/SOAR-0004.md)
- [Azure SDK for Java pagination](https://learn.microsoft.com/en-us/azure/developer/java/sdk/pagination)
- [Microsoft Graph pagination](https://learn.microsoft.com/en-us/graph/paging)

## Remaining high-impact decisions

The broad architecture interview is complete. No unresolved product-preference questions remain. Parser selection, candidate reuse, lossless multi-match `anyOf` representation, emitter benchmarking, published-ABI validation tooling, exact artifact granularity, and quantitative performance budgets are Phase 0 experiments with acceptance criteria, not questionnaire decisions.

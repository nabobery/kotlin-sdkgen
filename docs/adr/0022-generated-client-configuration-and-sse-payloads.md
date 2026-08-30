# ADR 0022: Client-scoped configuration, compatible constructors, explicit SSE payload projection, and Gradle consumer wiring

## Status

Accepted for the 0.4.0 development line. Extends [ADR 0006](0006-runtime-spi.md) (runtime pipeline and
`User-Agent` stage), [ADR 0009](0009-gradle-plugin-direction.md) (lazy cacheable Gradle plugin), and the
`x-sdkgen-streaming` extension contract; measured against [ADR 0013](0013-five-layer-compatibility-reports.md).

## Context

Consumers of 0.3.0 generated SDKs had to work around four gaps, each of which pushed generator concerns into
handwritten wrapper code:

1. **No client-scoped runtime policy.** `CallOptions` is per call. A consumer that wanted one retry policy, one
   deadline set, one `User-Agent`, or one set of middleware/observers for every operation had to wrap every generated
   method and merge options by hand, and each generated resource client built its own `SdkExecutor` with its own
   `RetryBudget`, so a facade's resource clients did not share a retry quota.
2. **SSE envelope schemas.** Several real contracts (OpenRouter's Speakeasy-authored `text/event-stream` responses,
   for example) describe the SSE *envelope* — `{ "event": ..., "data": <payload> }` — as the response schema, while the
   bytes on the wire carry only the payload JSON in each `data:` field. 0.3.0 projected the envelope as the
   `Flow<T>` element type, so real streams failed to decode unless the consumer rewrote the schema through an overlay.
3. **Android and Kotlin/Native consumers of the Gradle plugin** hit
   `Querying the mapped value of flatmap(provider(task 'generate…Sdk')) before task … has completed is not supported`
   because generated sources were wired as `task.flatMap { outputDirectory }`, and the same provider capture broke
   configuration-cache serialization of `KotlinCompile.javaSourceFiles` even on plain JVM builds.
4. **Reflective ktlint integration** selected `KtlintExtension.filter` by name and arity and failed with
   `argument type mismatch` on ktlint-gradle 14.x.

## Decision

### D1 — `SdkClientConfig` is the client-scoped configuration value

`com.nabobery.sdkgen.runtime.SdkClientConfig` is an immutable value carrying `retry: PolicyOverride<RetryDescriptor>`,
`deadlines: SdkDeadlines?`, `requestHook`, `logicalMiddleware`, `attemptMiddleware`, `observers`, `retryBudget`, and
`productToken`. It is a runtime type, not generated code, so every generated SDK on the same runtime shares one
definition and one set of semantics. It does no environment loading and creates no transport; those remain the
consumer's responsibility.

### D2 — Precedence is layered, and only retry and deadlines fold into `CallOptions`

- `SdkClientConfig.resolveCallOptions(options)` fills `retry` only when the call left it at `Inherit`, and `deadlines`
  only when the call supplied none. Per-call `Disabled`/`Replace` always win. No field-level merging is performed,
  matching the existing `CallOptions` contract.
- Hooks, middleware, observers, the retry budget, and the product token are passed **once**, to the client's
  `SdkExecutor`, and compose with per-call values through the executor's existing layering: client hook before call
  hook; client middleware and observers outermost; per-call `User-Agent` headers still win over the product token.
- One `RetryBudget` instance travels with the configuration, so a root facade and every lazily-built resource client
  constructed from it share one retry quota.
- `productToken` is validated at construction (non-blank, no CR/LF) so a configuration can never inject a header
  line; the generator's `runtime.userAgentSuffix` and `runtime.defaultServer` are validated with the same intent
  (no line breaks; absolute `http`/`https` URL with a host).

### D3 — The 0.3.0 constructor descriptor is preserved; the configured constructor is additive

Every generated client (root facade and resource clients) has a private primary constructor and two public
secondary constructors:

```kotlin
public constructor(transport, baseUri, credentialProviders = emptyMap(), trustedHosts = null, authentication = null)
public constructor(transport, baseUri, clientConfig: SdkClientConfig, credentialProviders = emptyMap(), trustedHosts = null, authentication = null)
```

The first is byte-for-byte the 0.3.0 signature, including its JVM default-argument bridge, so callers compiled
against 0.3.0 keep linking and executing. `clientConfig` is the third parameter, without a default, so the two
overloads cannot be ambiguous and the compiler resolves a legacy call to the legacy constructor. The facade passes
its `SdkClientConfig` instance to each resource client. `runtime.defaultServer`, when configured, becomes the
`baseUri` default on both constructors.

### D4 — SSE payload selection is explicit, projection-only, and fails closed

`x-sdkgen-streaming.payloadProperty` names the property of the declared `text/event-stream` schema whose schema
describes the JSON carried by each `data:` field. When present, the generated `Flow<T>` element type (and the
typed in-band error surface) is that property's type; when absent, 0.3.0 behavior is unchanged. The selection is a
declaration-time projection: the runtime `StreamingDescriptor` never sees it, and the envelope model is still
generated because other schemas may reference it. A `payloadProperty` that names a missing property, or whose
envelope has no schema or is not an object, is an `UNREPRESENTABLE_OPERATION` diagnostic with an SSE-specific
message and remediation, never a silent fallback to the envelope type.

The selection is explicit rather than inferred from vendor extensions or from a property "looking like" a payload:
an inferred rule would make the element type of a public API depend on heuristics that a contract change could
flip without any overlay diff to review.

### D5 — Generated sources are wired through a stable path with task provenance

The Gradle plugin adds generated sources to Kotlin source sets as
`project.files(configuration.outputDirectory.dir("sources")).builtBy(generateTask)` — a path derived from the
extension's `outputDirectory` alone, with the generation task attached as a build dependency. Nothing derives the
path from a task output provider, so no compile task queries a task output early and no task provider is captured
in the configuration cache. The same collection is exposed as `SdkGenConfiguration.generatedSources` so consumers
can attach it to Android or custom KMP source sets without `afterEvaluate`, `dependsOn`, or task-name matching.

### D6 — ktlint integration uses the one supported entry point, typed on Gradle core API

The plugin excludes each output root from ktlint through `KtlintExtension.filter(Action<PatternFilterable>)`, the
only `filter` overload ktlint-gradle exposes. The filter action, the `PatternFilterable`, the `Spec`, and the
`FileTreeElement` are Gradle core types; only the entry point is looked up on the extension's runtime class, by that
exact signature, because ktlint is not a dependency of the plugin and the two plugins may live in different class
loaders (a convention plugin plus a `plugins {}` block, or Gradle TestKit). The signature is pinned against
ktlint-gradle 14.2.0 by a test that compiles against ktlint, and both plugin-application orders are proven by
TestKit.

## Consequences

- **Compatibility** (ADR 0013): the runtime API is additive; generated constructor descriptors are preserved and
  extended additively. Where a contract adopts `payloadProperty`, the stream element type changes from the envelope
  model to the payload model — an intended source-API correction that is opt-in per operation and called out in the
  release evidence. The semantic model's `StreamingModel.Sse` gained a fourth field (its generated `copy`
  descriptor changes; a three-argument secondary constructor is retained).
- Consumers can delete downstream options-merging wrappers and SSE schema-rewrite overlays after adopting 0.4.0.
- The plugin's `SdkGenConfiguration` gains one public member (`generatedSources`); no existing member changes.

## Limitations (deliberate non-goals for 0.4.0)

- No environment or file loading into `SdkClientConfig`, and no transport construction.
- No inference of `payloadProperty` from vendor extensions or property names; no automatic pruning of envelope
  models that become unreferenced.
- No change to closed-union no-match semantics. Unknown discriminated variants continue to fail closed; a
  raw-preserving fallback branch and its strictness policy require a separate public-surface compatibility ADR.
- No generated `@RequiresOptIn` markers and no new publication target families such as `wasmJs`.
- No SSE metadata wrapper on the default `Flow<T>`; the detailed projection remains the place for event names.
- ktlint integration is limited to excluding SDKGen output roots; it configures nothing else about ktlint.

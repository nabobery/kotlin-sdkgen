# Changelog

All notable changes to Kotlin SDKGen are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/), and this project
follows [Semantic Versioning](https://semver.org/spec/v2.0.0.html) for published artifacts.

## [Unreleased]

## [0.4.0] - 2026-08-30

### Added

- `SdkClientConfig`: a client-scoped runtime configuration value carrying retry and deadline defaults, a request
  hook, logical/attempt middleware, lifecycle observers, a shared `RetryBudget`, and a `User-Agent` product token.
  Every generated client (root facade and resource clients) gained an additive constructor overload that takes it as
  the third parameter; resource clients built from one facade share one configuration and one retry budget. Per-call
  `CallOptions` keep final precedence (`Disabled`/`Replace` win; `Inherit` falls back to the client value). See
  ADR 0022.
- `runtime.defaultServer` and `runtime.userAgentSuffix` in `sdkgen.yaml` now reach generated code: the former becomes
  the `baseUri` default of every generated constructor, the latter the default `User-Agent` product token. Both are
  validated (absolute `http`/`https` URL with a host; no line breaks).
- `x-sdkgen-streaming.payloadProperty`: names the property of an SSE envelope schema whose type describes the JSON
  carried by each `data:` field, so the generated `Flow<T>` element type is the wire payload rather than the
  envelope. Omission preserves 0.3.0 behavior; a missing property or non-object envelope fails closed with an
  `UNREPRESENTABLE_OPERATION` diagnostic.
- Gradle plugin: `SdkGenConfiguration.generatedSources`, a file collection built by the generation task, for wiring
  generated sources into Android or custom Kotlin Multiplatform source sets.

### Changed

- OpenRouter conformance overlay: the `/chat/completions`, `/images`, `/messages`, and `/responses` streaming
  operations declare `payloadProperty: data`, so their generated stream element types are now the payload models
  (`ChatStreamChunk`, the image stream union, `MessagesStreamEvents`, `StreamEvents`) instead of the
  `…StreamingResponse` envelopes. This is an intended source-API correction for consumers of the conformance SDK;
  envelope models are still generated.
- `StreamingModel.Sse` (generator semantic model) gained a `payloadProperty` field; its generated `copy` descriptor
  changed and a three-argument secondary constructor is retained for source compatibility.
- Generated union branch predicates and query/header parameter encoding no longer emit redundant casts, statically
  decided `is`/`!is` checks, or `toString()` on `String` values; a clean OpenRouter JVM compile drops from 3,562
  compiler warnings in these categories to zero. Acceptance semantics are unchanged.

### Fixed

- Generated clients bind enum-typed path, query, and header parameters by the enum case's documented wire `value`
  instead of its `toString()` (the Kotlin case name), so `interval=daily` and `direction=asc` reach the server rather
  than `Daily`/`Asc`. Covers scalar, repeated, comma-joined, Stripe-indexed, and deepObject-property parameters; the
  projection records the encoding as `ParameterValueEncoding` so the emitter no longer guesses from the Kotlin type.
- `oneOf` branch predicates accept an explicit JSON `null` for a nullable property (`type: [string, 'null']`) nested
  in a branch, so a real terminal page such as `{"_shape":"openrouter","cursor":null,…}` decodes to its branch
  instead of raising the union's `NoMatchException`. The streaming-fixture corpus gained `/files/{bucket}` to prove
  both fixes through the generated SDK.
- Gradle plugin: generated sources are wired through a stable path derived from `outputDirectory` with the
  generation task as a build dependency instead of a task-output provider, fixing
  `Querying the mapped value of flatmap(provider(task 'generate…Sdk')) … is not supported` with the Android Gradle
  Plugin and restoring configuration-cache reuse for Kotlin compile tasks (`KotlinCompile.javaSourceFiles`).
- Gradle plugin: ktlint integration uses ktlint-gradle's supported `filter(Action<PatternFilterable>)` entry point
  with Gradle-core types instead of reflective member scanning, fixing `argument type mismatch` on ktlint-gradle
  14.x in either plugin-application order and across plugin class loaders.

## [0.3.0] - 2026-08-23

### Added

- Strict `allOf` intersection algebra with audited overrides: duplicate `allOf` properties resolve through a
  proven set-theoretic algebra, and contract-judgment cases are recorded explicitly via the new
  `x-sdkgen-allof-resolution` canonical extension (per-property branch election by `$ref` or resolved-content
  digest, fail-closed on drift). See ADR 0021 and the committed schema-intersection proof table.
- Media-specific request variants: an operation whose request body declares several incompatible media types now
  emits one callable method per compatible media group (`…Multipart`, `…Form`, sanitized-subtype suffixes) with
  deterministic naming that fails closed on collisions, instead of rejecting the operation.
- Explicit request-body wire encodings: JSON (`application/json`, aliases, `+json`), raw text (`text/*` over
  string schemas, via the new `RawTextCodec` runtime codec), raw byte streams, form, and multipart. Unsupported
  representations fail closed with a waivable diagnostic instead of silently JSON-encoding.
- Full OpenRouter conformance surface: all 89 of 89 operations generate with zero blockers, including the
  `/messages` and `/responses` streaming operations and both `/audio/transcriptions` media variants.
- GitHub webhook payload reclamation through the audited overlays: 10 payload schemas (+10 inline sub-schemas)
  now project; the accepted-waiver ledger shrank from 139 to 119.

### Changed

- **Wire contract**: a degenerate null-only `anyOf` member now canonicalizes into property nullability instead
  of a `JsonElement?` catch-all branch; affected unions become strict two-branch unions whose non-matching
  payloads throw the union's `NoMatchException` (previously they were silently absorbed).
- **Wire correctness**: plain-text request bodies (GitHub `markdown/render-raw`) transmit raw UTF-8 text instead
  of a JSON-quoted string; the Stripe multipart enum `purpose` field is emitted as bare text instead of a
  JSON-quoted string; string-enum multipart parts and `[]`-named repeated parts encode per their contracts.
- **Public model API (breaking)**: the semantic model — public API tracked by the generator's API dumps — gained
  composition/audit types and fields (`SchemaModel` compositions, `AllOfPropertyResolution` with a now-required
  `winningPropertySchemaId`, audit sources), breaking source and binary compatibility of the
  `generator-model`/`generator-openapi` surface. Generated SDK surfaces are additive except for the wire-contract
  changes above.
- Oversized union inspection carriers (beyond a 200-JVM-slot synthetic-descriptor threshold) switch to a no-arg
  mutable internal carrier to stay within the JVM's 255-slot method descriptor limit; behavior is unchanged.
- Parity provenance binds each corpus's ordered configured overlay set (audit overlays included), so an
  overlay-only edit can no longer escape parity input hashing.

## [0.2.0] - 2026-08-19

### Added

- Server-sent event streaming for the OpenRouter conformance SDK: chat-completion and image operations now
  expose generated buffered, `WithResponse`, and `Stream` methods, with `[DONE]` sentinel handling.
- `offsetLimit` pagination generation (`x-sdkgen-pagination` with `offset`/`limit` request parameters and an
  optional total field), producing `Pages`/`Items` flows alongside the existing cursor and header-URL styles.
- Activation of all 17 OpenRouter paginated operations — 16 `offsetLimit` and one cursor — through canonical
  overlay metadata.
- `iosX64` and `macosX64` publication for the `runtime-core`, `runtime-testing`, and `transport-ktor` KMP
  modules, adding the `-runtime-iosx64`, `-runtime-macosx64`, `-testing-iosx64`, `-testing-macosx64`,
  `-transport-ktor-iosx64`, and `-transport-ktor-macosx64` coordinates under `io.github.nabobery`.

### Changed

- Updated Ktor to `3.5.2` and refreshed the reproducible Kotlin/JS dependency lock.

## [0.1.0] - 2026-08-14

### Added

- OpenAPI 3.1 parsing and normalization into a typed semantic model, with RFC 9535 overlays and
  explicit support boundaries for OpenAPI 3.0 inputs.
- Deterministic Kotlin and Kotlin Multiplatform client generation through KotlinPoet, including
  typed models, resource clients, authentication, pagination, streaming, multipart requests, and
  compatibility reporting.
- A portable runtime with Ktor, OkHttp, and Java HTTP transport adapters, plus a transport contract
  test kit for generated SDKs.
- A command-line interface for validation, generation, drift detection, contract comparison, and
  diagnostic explanation.
- A cacheable Gradle integration that wires generated sources into Kotlin/JVM and Kotlin
  Multiplatform projects.
- Reproducible Maven publications with sources, Dokka documentation, signed metadata, SBOMs, and
  provenance attestations.
- Corpus-scale conformance coverage using pinned OpenRouter, GitHub REST, and Stripe inputs.

### Security

- Updated the Kotlin/JS dependency lock to resolve known vulnerable transitive packages before the
  initial publication.

[Unreleased]: https://github.com/nabobery/kotlin-sdkgen/compare/v0.4.0...HEAD
[0.4.0]: https://github.com/nabobery/kotlin-sdkgen/compare/v0.3.0...v0.4.0
[0.3.0]: https://github.com/nabobery/kotlin-sdkgen/compare/v0.2.0...v0.3.0
[0.2.0]: https://github.com/nabobery/kotlin-sdkgen/compare/v0.1.0...v0.2.0
[0.1.0]: https://github.com/nabobery/kotlin-sdkgen/tree/v0.1.0

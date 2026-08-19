# Changelog

All notable changes to Kotlin SDKGen are documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/), and this project
follows [Semantic Versioning](https://semver.org/spec/v2.0.0.html) for published artifacts.

## [Unreleased]

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

[Unreleased]: https://github.com/nabobery/kotlin-sdkgen/compare/v0.1.0...HEAD
[0.1.0]: https://github.com/nabobery/kotlin-sdkgen/tree/v0.1.0

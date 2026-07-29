# Security policy (draft)

**Status: DRAFT.** This file is not finalized. It becomes the effective security policy only
after a maintainer verifies a real private reporting channel (see "Reporting a vulnerability"
below) and removes the TODO markers in this file. Until then, treat every statement here as
provisional project intent, not a guaranteed commitment.

Kotlin SDKGen is currently pre-release (`0.1.0-SNAPSHOT`). No
artifact has been published to Maven Central or the Gradle Plugin Portal. There is no supported
released version yet, so there is no version-support matrix to publish.

## Reporting a vulnerability

**TODO (blocked on maintainer action):** this project does not yet have a verified private
vulnerability-reporting channel. Do not assume either of the following is available until a
maintainer confirms it in writing and this file is updated:

- that GitHub's private vulnerability reporting feature is enabled for this repository, or
- that any specific email address or contact form is monitored for security reports.

The maintainer must do one of the following before this section can be finalized:

1. Enable GitHub private vulnerability reporting (Settings → Security → "Private vulnerability
   reporting") for this repository and confirm it is active, or
2. Designate and publish a real, monitored contact channel (for example a dedicated mailbox or a
   security@ alias under a domain the project controls) and confirm it is monitored.

Until one of those is confirmed, **do not** file security-sensitive reports through a public
GitHub issue. If you believe you have found a vulnerability and no verified channel exists yet,
open a regular issue that states only that you have a security concern to report, without
exploit details, and ask a maintainer to open a private channel with you before the technical
report is shared.

## What Kotlin SDKGen does and does not do today

Understanding the current architecture is necessary to reason about its security posture:

- **Local-only input acquisition.** The generation engine (`generator/engine/src/main/kotlin/
  com/nabobery/sdkgen/engine/input/LocalInputResolver.kt`) currently supports only
  `AcquisitionMode.LOCAL`. `AcquisitionMode.HTTPS` exists in the config schema for forward
  compatibility (`generator/engine/src/main/kotlin/com/nabobery/sdkgen/engine/config/
  ConfigModel.kt`) but any config that selects it fails deterministically with
  `SDKGEN-ACQUISITION-MODE-UNSUPPORTED`. **There is no remote/network specification retrieval
  today.** Any future claim of "HTTPS-only remote acquisition" is not yet true and must not be
  advertised as implemented until that mode ships with its own conformance evidence.
- **Path-traversal containment for local inputs.** Local source and overlay files, and every
  file reachable from `$ref`/overlay closures, are resolved to real paths and checked against an
  explicit allow-list of trusted roots (`LocalReferenceClosure`, `enforceAllowed` in
  `LocalInputResolver.kt`). A reference that escapes every configured root fails closed with
  `SDKGEN-ACQUISITION-OUTSIDE-ROOT`.
- **No dynamic code execution during generation.** Kotlin source is emitted through KotlinPoet's
  typed AST builders, not string templates evaluated against untrusted spec content. There is no
  script engine, reflection-based `eval`, or subprocess execution anywhere in the generation
  pipeline.
- **Plugin trust boundary.** The generator-extension SPI
  (`generator/engine/src/main/kotlin/com/nabobery/sdkgen/engine/spi/`) is preview-only
  (`@ExperimentalSdkGenApi`) and runs entirely in-process. `SdkGenPluginEngine` executes phases
  "in configured list order, without implicit discovery" — there is no classpath scanning or
  `ServiceLoader`-based auto-loading of third-party jars. A plugin is, however, ordinary Kotlin
  code that runs with the same privileges as the generator process: treat any third-party plugin
  as a build dependency and review it accordingly, exactly as you would any other compile-time
  dependency.
- **Secret handling in the generated runtime.** `runtime/core/src/commonMain/kotlin/com/nabobery/
  sdkgen/runtime/auth/Secret.kt` wraps credential material so it cannot surface through
  `toString()`, `equals()`, `hashCode()`, or accidental logging; `Credential.kt` and
  `SecuritySchemeAuthentication.kt` route every bearer/API-key/basic-auth value through `Secret`.
  This is covered by `runtime/core/src/commonTest/kotlin/com/nabobery/sdkgen/runtime/
  RedactionTest.kt`.

See [`docs/threat-model.md`](docs/threat-model.md) for the full threat model.

## Supply chain and releases

- Releases will be published to Maven Central and the Gradle Plugin Portal. **Maven Central
  releases are immutable**: once a coordinate/version is published it cannot be replaced or
  deleted, only superseded by a new version. See
  [`docs/release-runbook.md`](docs/release-runbook.md) for the staged rehearsal and the explicit
  human-authorized publication step; publication is never an automatic side effect of CI.
- Full signing, checksums, SBOM, and provenance evidence are tracked under publication readiness and are
  **not yet complete**; do not assume a published artifact today carries that evidence until the
  runbook and traceability table say otherwise.

## Scope

This policy covers the Kotlin SDKGen generator, CLI, Gradle plugin, and runtime/transport
libraries in this repository. It does not cover generated SDK output for a specific consumer's
OpenAPI document, which inherits the security posture of that consumer's own API and their choice
of transport/auth configuration.

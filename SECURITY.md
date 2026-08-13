# Security policy

Kotlin SDKGen is currently pre-release (`0.1.0-SNAPSHOT`). No
artifact has been published to Maven Central or the Gradle Plugin Portal. There is no supported
released version yet, so there is no version-support matrix to publish.

## Reporting a vulnerability

Report suspected vulnerabilities through
[GitHub private vulnerability reporting](https://github.com/nabobery/kotlin-sdkgen/security/advisories/new).
Do not disclose vulnerability details in a public issue, pull request, discussion, or commit.

Include the affected version or commit, the impacted component, reproduction steps, expected
impact, and any suggested mitigation. Remove API credentials, private specifications, and other
unrelated sensitive data from the report.

The project will acknowledge the report, investigate it privately, and coordinate disclosure
through the private advisory. Response and remediation times depend on severity and maintainer
availability; this project does not currently promise a service-level agreement.

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
- Signing, checksums, CycloneDX SBOM generation, and GitHub provenance attestation are implemented and
  exercised by the protected release rehearsal. No artifact has been published yet; verify the runbook,
  attestation, and portal records for the specific version once a real release exists.

## Scope

This policy covers the Kotlin SDKGen generator, CLI, Gradle plugin, and runtime/transport
libraries in this repository. It does not cover generated SDK output for a specific consumer's
OpenAPI document, which inherits the security posture of that consumer's own API and their choice
of transport/auth configuration.

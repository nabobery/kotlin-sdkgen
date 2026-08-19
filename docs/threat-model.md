# Threat model

**Status:** current as of security review. Grounded in the implementation at the time of writing;
re-verify against the code before relying on any claim here, and update this file
whenever compatibility reporting/publication rehearsal/release automation change the acquisition, publication, or automation surface described below.

## System summary

Kotlin SDKGen has three trust-relevant surfaces:

1. **Generation-time input handling** — reading an OpenAPI document (and its `$ref`/overlay
   closure) from local disk and turning it into a semantic model, declarations, and emitted
   Kotlin source (`generator/openapi`, `generator/engine`).
2. **Generated-runtime execution** — the shared runtime (`runtime/core`) and transport adapters
   that a _generated_ SDK uses at the consumer's own runtime, including credential handling.
3. **Release and distribution** — building, signing, and publishing SDKGen's own artifacts
   (`build-logic/.../sdkgen.publishing.gradle.kts`), and any future scheduled automation that
   opens pull requests from upstream spec drift (release automation, not yet built).

Each is analyzed separately because they have different actors, different trust boundaries, and
different current implementation status.

## Assets

- Integrity of generated Kotlin source (a compromised generator could inject code into every
  downstream consumer's build).
- Confidentiality of credentials passed through the generated runtime (API keys, bearer tokens,
  basic-auth secrets) at the SDK consumer's runtime.
- Integrity and authenticity of SDKGen's own published Maven/Gradle-Plugin-Portal artifacts.
- Availability/correctness of the local filesystem outside the project's intended input roots
  (a malicious `$ref` should not let generation read or write arbitrary host files).

## Threat 1: Malicious or malformed OpenAPI input escapes its trusted root

**Actor:** an untrusted or compromised OpenAPI document, or a `$ref`/overlay chain that points
outside the intended project.

**Vector:** a `$ref` or overlay URI that resolves to `../../../etc/passwd`-style paths, a
symlink, or an absolute path outside the configured project.

**Current control (implemented):** `LocalInputResolver` resolves every candidate to its real
path (`toRealPath()`, which also follows symlinks) and rejects anything outside the resolved
`allowedLocalRoots` allow-list with `SDKGEN-ACQUISITION-OUTSIDE-ROOT`
(`generator/engine/src/main/kotlin/com/nabobery/sdkgen/engine/input/LocalInputResolver.kt`).
`LocalReferenceClosure` applies the same containment to every transitively referenced document,
not just the root spec, and separately rejects non-regular files
(`ReferenceNotRegularFileException`). Each staged file is also digest-recorded (SHA-256) and
size-bounded (`maxBytes`) during staging.

**Residual exposure:** the allow-list is directory-based; a misconfigured `allowedLocalRoots`
that is too broad (for example the filesystem root) would defeat the containment. This is a
configuration risk, not a code defect, and is not separately enforced by the tool today.

**Owner / 1.0 disposition:** engine maintainers; keep as an implemented, load-bearing control.
Consider a P1 follow-up that warns when a configured allowed root is suspiciously broad (e.g. a
filesystem root or home directory).

## Threat 2: Remote specification retrieval (not yet built)

**Actor:** a network attacker (on-path or DNS-spoofing) between the generator host and an
upstream spec host, or a malicious upstream host itself.

**Vector:** unauthenticated HTTP fetch, missing digest verification, unbounded redirects, or
unbounded response size during a hypothetical remote-spec fetch.

**Current status: not implemented.** `AcquisitionMode.HTTPS` is defined in the config schema
(`generator/engine/src/main/kotlin/com/nabobery/sdkgen/engine/config/ConfigModel.kt`) "for
forward compatibility" per its own doc comment, but `LocalInputResolver.resolve()` throws
`SDKGEN-ACQUISITION-MODE-UNSUPPORTED` for any mode other than `LOCAL`. The `AcquisitionPolicy`
fields that would matter for this threat (`allowedHosts`, `followRedirects`, `maxRedirects`,
`timeoutSeconds`) are parsed into the config model but have no runtime consumer today. **Do not
represent remote acquisition as implemented, partially hardened, or "coming soon with the
existing config fields already enforced."** It does not exist yet.

**Owner / 1.0 disposition:** whichever future task implements remote acquisition must design and
land HTTPS-only fetching, mandatory digest verification/pinning, and the host/redirect/size/
timeout limits (SEC-001, SEC-004) together, with dedicated conformance tests, before the
`AcquisitionMode.HTTPS` schema value is accepted at runtime.

## Threat 3: Credential leakage through generated-runtime diagnostics or logs

**Actor:** an operator of a consuming application who reads logs, exception messages, or crash
reports produced by a generated SDK.

**Vector:** a bearer token, API key, or basic-auth secret ending up in a stack trace, a `data
class` `toString()`, a structural equality/hash-based cache key, or a log line.

**Current control (implemented):** `runtime/core/.../auth/Secret.kt` wraps every credential
value; `toString()` always returns `"Secret(redacted)"`, and `equals`/`hashCode` are deliberately
left as reference identity so no structural comparison, `Set`/cache key, or digest can leak
equality/prefix information about two secrets. `Credential.kt` and
`SecuritySchemeAuthentication.kt` route bearer/API-key/basic-auth values exclusively through
`Secret`. Covered by `runtime/core/src/commonTest/kotlin/com/nabobery/sdkgen/runtime/
RedactionTest.kt` and `auth/SecretTest.kt`.

**Residual exposure:** this covers the runtime's own types. A generated SDK consumer who
explicitly calls `secret.reveal()` and then logs the plain string themselves is outside the
runtime's control; this is a documented API contract (`reveal()` is "the only supported way to
read it back out"), not a defect.

**Owner / 1.0 disposition:** runtime maintainers; keep as implemented. Document the
`reveal()`-then-log footgun in generated-SDK usage guidance when that guidance is written.

## Threat 4: In-process plugin code execution

**Actor:** a third-party generator-plugin author, or a compromised plugin dependency.

**Vector:** a plugin registered through the preview SPI (`generator/engine/.../spi/`) runs in
the same JVM/process as the generator with the same privileges, and can observe or mutate the
semantic model, declarations, and diagnostics it is given.

**Current control (partial):** `SdkGenPluginEngine` runs only explicitly configured, compiled
plugins "in configured list order, without implicit discovery" — there is no `ServiceLoader` or
classpath-scanning auto-load of arbitrary jars found in the plugin SPI sources. The SPI itself is
gated behind `@ExperimentalSdkGenApi` (`RequiresOptIn.Level.WARNING`), signaling it is preview and
subject to change.

**Residual exposure:** once a plugin is explicitly configured, it has full in-process access;
there is no sandboxing, permission model, or resource limiting. This is being treated as an
accepted trust model (same as any compile-time dependency), not a gap to close with sandboxing,
per SEC-007's wording ("plugins execute with documented trust assumptions ... must be treated as
build dependencies"). This document plus `SECURITY.md`'s "plugin trust boundary" section is the
current documentation of that trust assumption.

**Owner / 1.0 disposition:** engine maintainers; keep the "no implicit discovery, explicit trust"
model, and re-review before removing the `@ExperimentalSdkGenApi` gate at 1.0.

## Threat 5: Compromised or tampered published SDKGen artifacts

**Actor:** an attacker able to intercept, substitute, or tamper with SDKGen's own published Maven
Central / Gradle Plugin Portal artifacts, or inject an internal-only project coordinate into
public metadata.

**Vector:** missing signatures/checksums, an unpinned/leaked publishing credential, or
unpublished internal coordinates (`generator:model`, `generator:openapi`) leaking into POM/module
metadata and being resolved against an attacker-controlled repository.

**Current status:** release-mode signing, complete POM metadata, per-publication sources and Dokka
artifacts, checksums, an aggregate CycloneDX SBOM, and coordinate-leakage verification are implemented.
The protected release workflow builds and verifies the signed repository before publishing to Maven
Central, and GitHub attests its deterministic release bundle. Remote credentials are available only
to the protected publication job; ordinary CI and release verification cannot read them.

**Owner / 1.0 disposition:** release maintainers; preserve the signed-artifact, SBOM, provenance,
isolated-consumer, and coordinate-leakage gates for every release. Verify each portal independently
by resolving all eight root product coordinates and expected KMP variants from Maven Central, and the
plugin ID and version from the Gradle Plugin Portal.

## Threat 6: Untrusted code execution from an automated drift/update pull request

**Actor:** an attacker who can influence an upstream spec that a future scheduled drift workflow
(release automation) regenerates from, or who can influence the generated diff itself.

**Vector:** a privileged CI job checking out and running generated/regenerated code with
repository write or secret access.

**Current status:** `.github/workflows/drift.yml` separates unprivileged detection from the
write-capable pull-request job, scope-checks the generated patch, and pins actions by full SHA.
`.github/workflows/release-verification.yml` has read-only repository permissions and no release
credentials. It runs Gradle publication only against an isolated local repository and never invokes
remote Central or Plugin Portal publication. Each release must retain its own successful workflow evidence.

**Owner / 1.0 disposition:** release owner; the initial operational-evidence gap is closed. Preserve
the same unprivileged verification and protected-publication boundaries for subsequent releases.

## Out of scope for this document

- Security properties of a specific consumer's own OpenAPI document or upstream API (the
  generator processes API descriptions; it should not require production API keys, and live
  conformance tests requiring secrets must stay optional, isolated, and redacted per
  `docs/requirements.md` §14).
- Android and Kotlin/JS browser target security review beyond "these targets now compile and run
  contract tests" (ADR-0011); no additional platform-specific runtime security review has been
  performed here.

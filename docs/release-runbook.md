# Release runbook (draft)

**Status:** draft. Kotlin SDKGen has never published a release. This runbook describes the
intended procedure and the current implementation gaps against it; it is not a record of a real
release.

## Core invariant: Maven Central releases are immutable

Once a `groupId:artifactId:version` coordinate is published to Maven Central, **it cannot be
replaced, overwritten, or deleted** — only superseded by publishing a new version. The same is
effectively true for the Gradle Plugin Portal. This means:

- Never reuse a version number, even to fix a publishing mistake. A bad release must be followed
  by a new patch version, not a re-upload.
- Rehearse every release against an isolated local/file-repository target first (see "Rehearsal"
  below) so mistakes are caught before anything irreversible happens.
- Treat publication as a deliberate, explicitly authorized action distinct from ordinary CI. It
  must never be a side effect of merging to `main` or of a scheduled workflow.

## Current publication status (as of this document)

- ADR-0008 fixes eight public coordinates (`kotlin-sdkgen-engine`, `-cli`, `-gradle-plugin`,
  `-runtime`, `-transport-ktor`, `-transport-okhttp`, `-transport-java-http`, `-testing`).
  `build-logic/src/main/kotlin/sdkgen.publishing.gradle.kts` creates Maven publications for
  plain-`java-library` modules and rewrites artifact IDs to those names, and adds sources jars.
- The isolated rehearsal verifies the exact eight ADR-0008 coordinates, rejects internal
  (`generator:model`, `generator:openapi`) coordinate leakage, validates staged metadata and
  checksums, and resolves clean external consumers from the staged repository.
- **Not yet implemented:** signing, full POM metadata (license, developers, SCM), javadoc/Dokka
  artifacts, SBOM (CycloneDX), Central Portal aggregation, and release provenance.
- Remote repository credentials are intentionally not configured yet
  (`sdkgen.publishing.gradle.kts`: "Remote repositories and credentials are intentionally
  deferred until release automation exists").
- Drift and release-verification workflows exist, but neither has been proven by a GitHub-hosted
  run and neither publishes artifacts.

## Rehearsal (required before any real publication)

1. Build a non-SNAPSHOT release-candidate version into an isolated local file repository (never
   directly to Maven Central).
2. Verify exactly the eight ADR-0008 coordinates are produced, with the expected physical KMP
   variants, and **no** unpublished internal project coordinate is present in POM or Gradle
   Module Metadata.
3. Verify POM and module metadata, sources/docs artifacts, and (once implemented) signatures,
   checksums, and the aggregated SBOM.
4. Consume every published coordinate from a clean, isolated external build (no Maven Local
   fallback, no composite/project substitution, no undeclared repository) to prove the artifact
   graph resolves independently.
5. Run `validatePlugins` and `publishPlugins --validate-only` for the Gradle plugin; never run
   the real `publishPlugins` outside an explicitly authorized release.
6. Use a throwaway signing key for rehearsal. Never rehearse with production release credentials.

Only after every rehearsal check above passes, with evidence recorded, does a real release
become eligible.

## Real release (requires explicit human authorization — never automatic)

This section describes the target procedure; it is not yet exercised end-to-end in this
repository.

1. Confirm the target commit is the reviewed, merged tip intended for release (never a task or
   integration worktree branch).
2. Bump `sdkgenVersion` (root Gradle property) to the release version. Do not reuse a version
   number that was ever pushed, even privately, to a shared remote.
3. Run the full verification gate: `./gradlew build check ktlintCheck apiCheck` plus the staged
   ABI/BCV checks from ADR-0007, plus the cross-corpus parity gate and any then-current compatibility
   report for the release diff.
4. Run the rehearsal steps above against the release version specifically (not just a prior
   SNAPSHOT), since artifact identity, signing, and SBOM contents are version-specific.
5. Obtain explicit human authorization (this project has no auto-publish path; a human must run
   the publish command with real, scoped, short-lived-where-possible credentials).
6. Publish to the Maven Central Portal (Nmcp aggregation) and, for the Gradle plugin, the Gradle
   Plugin Portal.
7. Tag the release commit and publish release notes summarizing the effective contract diff
   (`sdkgen diff`/`sdkgen explain` output where applicable — see `generator/cli/.../
   DiffCommand.kt` and `ExplainCommand.kt`), the applied-overlay report, the conformance/waiver
   summary, and the target compile matrix.
8. Generate and publish GitHub artifact attestations for the release artifacts (release automation scope;
   not yet implemented).

## What this runbook explicitly does not authorize

- It does not authorize pushing to a shared remote, opening a PR, merging to `main`, or uploading
  to Maven Central / the Gradle Plugin Portal as a byproduct of documentation or routine
  development work. Every one of those remains a separate, explicitly authorized action.
- It does not claim any of the "not yet implemented" items above are done.

## Rollback / incident response

Because Maven Central publication is immutable:

- A defective release cannot be deleted or overwritten. Publish a new patch version with the fix
  and mark the defective version deprecated in release notes and (once a real security channel
  exists per `SECURITY.md`) any relevant security advisory.
- If a credential used for publication is suspected compromised, rotate it immediately and treat
  any artifact published with it as needing independent integrity verification, even though the
  artifact itself cannot be removed from Central.

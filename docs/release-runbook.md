# Release runbook

Kotlin SDKGen has not yet published a release. This runbook is the operational procedure for the
first and subsequent releases; it is not evidence that a particular release occurred.

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
- Signing, full POM metadata, reproducible Dokka documentation jars, CycloneDX SBOM generation, Central Portal
  aggregation, Gradle Plugin Portal publication, and GitHub provenance attestation are implemented.
- Remote credentials are scoped to the protected `release` environment and are never read by ordinary CI.
- The credential-free `release-verification.yml` workflow is the rehearsal path. The tag-bound,
  protected `release.yml` workflow is the only workflow capable of remote publication. Link the
  exact successful rehearsal from each release record rather than hard-coding a run here, so this
  runbook does not become stale.

## Rehearsal (required before any real publication)

1. Build a non-SNAPSHOT release-candidate version into an isolated local file repository (never
   directly to Maven Central).
2. Verify exactly the eight ADR-0008 coordinates are produced, with the expected physical KMP
   variants, and **no** unpublished internal project coordinate is present in POM or Gradle
   Module Metadata.
3. Verify POM and module metadata, sources/docs artifacts, signatures, checksums, and the
   aggregated SBOM.
4. Consume every published coordinate from a clean, isolated external build (no Maven Local
   fallback, no composite/project substitution, no undeclared repository) to prove the artifact
   graph resolves independently.
5. Run `validatePlugins` and `publishPlugins --validate-only` for the Gradle plugin; never run
   the real `publishPlugins` outside an explicitly authorized release.
6. For local or contributor signed rehearsals, use a throwaway signing key. The credential-free CI
   rehearsal deliberately does not sign; the release key is exposed only to the protected publish job.

Only after every rehearsal check above passes, with evidence recorded, does a real release
become eligible.

## Real release (requires explicit human authorization — never automatic)

This section describes the target procedure; it is not yet exercised end-to-end in this
repository.

1. Confirm the target commit is the reviewed, merged commit on `main` intended for release (never a task or
   integration worktree branch), then create the protected `v<version>` tag at that exact commit.
2. Dispatch `release.yml` from that tag and pass the tag's version without the leading `v` through
   the required `version` input. The workflow rejects any ref/version mismatch and any tagged commit
   that is not on `origin/main`. Do not reuse a version published to either portal.
3. The workflow calls `release-verification.yml` for that exact SHA. It must complete the full
   build/check/ktlint/API, ABI/BCV, cross-corpus parity, benchmark, compatibility, and isolated
   publication gates before the protected publish job becomes eligible.
4. Obtain the required `release` Environment reviewer approval. Only the publish job can read release
   credentials, and each credential pair is exposed only to the step that needs it.
5. The protected job builds and verifies the signed release repository, SBOM, clean external consumer,
   and plugin metadata, then publishes to Central (Nmcp aggregation) and the Gradle Plugin Portal.
6. Confirm both portals accepted the version and retain the GitHub provenance attestation.
7. Publish release notes summarizing the effective contract diff
   (`sdkgen diff`/`sdkgen explain` output where applicable — see `generator/cli/.../
   DiffCommand.kt` and `ExplainCommand.kt`), the applied-overlay report, the conformance/waiver
   summary, and the target compile matrix.
8. Record the protected tag, portal records, release notes, and attestation together as release evidence.

## What this runbook explicitly does not authorize

- It does not authorize pushing to a shared remote, opening a PR, merging to `main`, or uploading
  to Maven Central / the Gradle Plugin Portal as a byproduct of documentation or routine
  development work. Every one of those remains a separate, explicitly authorized action.
- It does not claim a publication occurred until both portals and the GitHub release record confirm it.

## Rollback / incident response

Because Maven Central publication is immutable:

- A defective release cannot be deleted or overwritten. Publish a new patch version with the fix
  and mark the defective version deprecated in release notes and any relevant security advisory.
- If a credential used for publication is suspected compromised, rotate it immediately and treat
  any artifact published with it as needing independent integrity verification, even though the
  artifact itself cannot be removed from Central.

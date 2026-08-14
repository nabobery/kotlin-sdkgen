# Release readiness results

## Implemented

- Generated protocol glue is internal and covered by projection, rendering, compilation, and cross-module tests.
- OpenRouter, GitHub, and Stripe outputs and compatibility evidence were regenerated from pinned inputs.
- The release workflow is bound to an immutable reviewed tag and invokes the complete verification workflow for
  the same commit before protected publication can begin.
- Publication inventory verification checks every expected physical coordinate independently, including its POM,
  Dokka documentation, and release signatures.
- Each Maven publication owns a distinct reproducible Dokka archive, preventing cross-publication signing output
  collisions.
- Central publication is configured to wait for availability before Gradle Plugin Portal publication.

## Verification evidence

- The signed two-publication regression rehearsal completed successfully for the JavaScript and JVM variants of
  `runtime:core`.
- The complete signed isolated publication and aggregate SBOM rehearsal completed successfully across 526 Gradle
  tasks.
- Release-mode metadata, inventory, signature, and clean-consumer verification completed successfully against the
  resulting repository.

## Repository controls

- GitHub private vulnerability reporting, Dependabot security updates, secret scanning, and push protection are enabled.
- The default branch requires a pull request, the complete CI check, resolved review conversations, and linear history;
  release tags cannot be updated or deleted after creation.
- The `release` environment is restricted to `main` and `v*`, requires explicit maintainer approval, and does not allow
  administrator bypass. Self-review remains enabled because the repository currently has one maintainer.
- Run the protected workflow from the reviewed commit after it is committed and available to GitHub Actions.

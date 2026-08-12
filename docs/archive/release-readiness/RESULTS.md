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

## External controls still required

- Enable GitHub private vulnerability reporting before declaring the private security channel operational.
- Configure required reviewers and the intended tag policy on the `release` environment.
- Run the protected workflow from the reviewed commit after it is committed and available to GitHub Actions.

These controls change repository state and require explicit repository-owner authorization.

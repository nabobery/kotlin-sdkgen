# ADR 0011: Defer Android and Kotlin/JS browser targets to Phase 2

## Status

Accepted.

## Context

`docs/design-decisions.md` lists Android and JavaScript browser as Tier 1 release-blocking targets, and `docs/requirements.md` §16 listed "JVM, Android, iOS, macOS, and JS compile gates" as a Phase 1 deliverable. Phase 1 review round 2 (build-system taste review) found a live contradiction: `build-logic/src/main/kotlin/sdkgen.kotlin-kmp.gradle.kts` declares no `androidTarget()` and no Android Gradle Plugin (AGP) dependency anywhere in the repository, and the KMP convention configures `js { nodejs() }` only, with no `browser()`. `AGENTS.md` already documented the omission as intentional, but the locked requirements and design-decision documents were never updated to match, so the written contract disagreed with the implemented build.

Kotlin SDKGen's Phase 1 scope is the core generator alpha: local intake, semantic model, declaration emission, an initial runtime SPI, and CLI commands, proven against selected OpenRouter schemas on JVM, iOS, macOS, and Kotlin/JS Node. Adding a fifth (Android) and sixth (JS browser) compile target changes the build's dependency surface and CI matrix without changing anything about the generator, semantic model, or runtime contracts under test in Phase 1.

## Decision

Defer both targets to Phase 2, as an explicit user decision (2026-07-17):

- Do not add `androidTarget()` or the Android Gradle Plugin to `sdkgen.kotlin-kmp.gradle.kts` or any module in Phase 1.
- Do not add `js { browser() }` to the KMP convention in Phase 1; keep `js { nodejs() }` only.
- Update `docs/requirements.md` §16 Phase 1 deliverables and NFR-PORT-002, and `docs/design-decisions.md`'s Tier 1 target list, to state the deferral and point back to this ADR, so the written contract matches the implemented build.
- Re-add both targets in Phase 2 as part of the Gradle-beta milestone, alongside the cacheable Gradle plugin and adapter work already scheduled there.

## Drivers

- **No AGP dependency in Phase 1.** Phase 1 has no Android-specific consumer, adapter, or build integration to justify pulling the Android Gradle Plugin, `google()` repositories, and an Android SDK/NDK toolchain requirement into the build for every contributor and CI runner. Phase 2's Gradle plugin and adapter work is the natural point to add that dependency once there is an Android-facing surface (the Gradle plugin itself, or an OkHttp/Ktor Android adapter) to validate against.
- **Browser adds no semantic coverage in Phase 1.** Phase 1's KMP contract tests exercise the shared runtime SPI and generated models; none of that logic is browser/DOM-specific. `js { nodejs() }` already exercises the Kotlin/JS target family (JS interop, serialization, and the generated declaration surface) that Phase 1 needs to prove. A browser target would add CI time (Karma/browser launcher provisioning) without adding a construct that Node.js does not already cover. Browser-specific concerns (fetch-based transport, CORS-safe headers, SDK-identification behavior) belong to the runtime adapter work explicitly scheduled for Phase 2 (see `docs/design-decisions.md`'s replayability and transport sections).

## Consequences

### Positive

- The written Phase 1 gate and the implemented build now agree; no reader can conclude Phase 1 already proves Android or browser compilation.
- Contributors and CI do not need an Android SDK/NDK or a browser test-runner toolchain to build and test Phase 1.
- Phase 2 scope (Gradle plugin, adapters) is the natural, already-planned place to add both targets alongside their first real consumers.

### Negative

- The Tier 1 release-blocking matrix in `docs/design-decisions.md` is not fully proven until Phase 2 completes; anyone reading only the Tier 1 list without this ADR could overestimate current coverage.
- Any Phase 1 generated-code assumption that happens to be Android- or browser-incompatible will only surface once Phase 2 adds those targets, rather than being caught immediately.

## Conditions and re-evaluation triggers

- Re-open this decision only in Phase 2, when `androidTarget()` plus AGP and `js { browser() }` are added back to the KMP convention and to CI.
- Phase 2 re-entry criteria: an Android Gradle Plugin version is pinned in the version catalog; `androidTarget()` compiles and passes shared contract tests for the runtime and a representative generated module; `js { browser() }` compiles and passes shared contract tests using a provisioned browser launcher; both targets are added to the compile-matrix and CI verification commands in the Phase 2 remediation/results record.
- If a Phase 1-only consumer need for Android or browser emerges before Phase 2 begins (for example, an external contribution), re-evaluate this ADR explicitly rather than silently expanding scope.

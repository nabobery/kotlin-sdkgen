# ADR 0011: Defer Android and Kotlin/JS browser targets to Phase 2

## Status

Accepted for the Phase 1 deferral. **Phase 2 re-entry criteria met** (2026-07-19); see Phase 2 re-entry below.

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

## Phase 2 re-entry

Phase 2 re-entry began 2026-07-17 (W1-T1) and is complete as of Wave 6 (2026-07-19). All four re-entry criteria stated
above are met:

1. **AGP pinned in the version catalog.** `agp = "9.2.1"` in `gradle/libs.versions.toml`, consumed through the
   `com.android.kotlin.multiplatform.library` plugin alias — the Android-KMP plugin, not the classic `com.android.library`
    - `androidTarget()` combination (which fails to configure under Kotlin 2.3 + AGP 9).
2. **`androidLibrary` compiles and passes shared contract tests for the runtime and a representative generated module.**
   Two new convention plugins carry this: `sdkgen.kotlin-kmp-android` (opt-in Android target for full KMP modules:
   `runtime:core`, `runtime:testing`, `runtime:transport-ktor`, and `conformance:openrouter:consumer` — the representative
   generated module) and `sdkgen.kotlin-kmp-jvm-android` (JVM+Android-only modules: `runtime:transport-okhttp`).
   `namespace`, `compileSdk = 36`, `minSdk = 21`, and `jvmTarget = 17` are set uniformly.
3. **`js { browser() }` compiles and passes shared contract tests using a provisioned browser launcher.** Added to
   `sdkgen.kotlin-kmp.gradle.kts` alongside the existing `nodejs()` target, with `useKarma { useChromeHeadless() }`
   wired for the browser test task. The target passes as part of the full `build apiCheck ktlintCheck` gate;
   `CHROME_BIN` is documented alongside the existing node-on-PATH note in `AGENTS.md`.
4. **Both targets are covered by the compile matrix and verification commands.** Android compilation and JS-browser
   tests are included in the standard full-build gate for every opted-in KMP module.

### What remains deferred

This re-entry closes only the Android and JS-browser scope named in this ADR's Decision section. The following remain
explicitly out of scope:

- **Wasm, watchOS, and tvOS targets.** Never in scope for Phase 2; no convention-plugin or catalog work was done toward
  them. A future ADR should open this decision explicitly rather than let it expand silently, per this ADR's own
  re-evaluation discipline.
- **Native "secondary matrix" targets** (`linuxArm64`, `mingwX64`) are compile-gate only, not full contract-test
  targets. This scope is separate from the Android/JS-browser re-entry this ADR tracks.
- **iOS simulator ARM64** contract tests remain environment-gated (disabled with a loud warning, not silently skipped,
  when the host lacks the Xcode simulator runtime) — this was already true before Phase 2 and is unrelated to the
  Android/browser deferral this ADR covers.

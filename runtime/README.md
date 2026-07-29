# Runtime modules

`core` and `testing` apply the shared `sdkgen.kotlin-kmp` convention plus the opt-in
`sdkgen.kotlin-kmp-android` convention (`build.gradle.kts` for each module), and therefore target:

- JVM
- Kotlin/JS, both Node.js and browser (`useKarma { useChromeHeadless() }`)
- Android (`com.android.kotlin.multiplatform.library`, opt-in via `sdkgen.kotlin-kmp-android`)
- iOS ARM64 and iOS simulator ARM64
- macOS ARM64
- Linux x64 and Linux ARM64 (secondary/compile-gate matrix — see below)
- mingw x64 (secondary/compile-gate matrix — see below)

Android was intentionally deferred for Phase 1 repository scaffolding, but Phase 2 re-entry is
complete (see [ADR 0011](../docs/adr/0011-android-browser-target-deferral.md)): `androidTarget()`
work is carried by the `com.android.kotlin.multiplatform.library` plugin alias, not the classic
`androidTarget()` + `com.android.library` combination, and `runtime:core` / `runtime:testing` /
`runtime:transport-ktor` already apply it. Do not put Android-specific APIs in `commonMain`;
platform code belongs only in the Android source set.

`linuxArm64` and `mingw x64` are compile-gate targets only, not full shared-contract-test targets,
per ADR-0011's "what remains deferred" note. `iosSimulatorArm64` contract tests are
environment-gated (loudly disabled, not silently skipped, when the host lacks the Xcode simulator
runtime). Wasm, watchOS, and tvOS are not in scope and have no convention-plugin or version-catalog
support.

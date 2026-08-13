# ADR 0011: Support Android and Kotlin/JS browser targets through opt-in conventions

## Status

Accepted and implemented as of 2026-07-19.

## Context

Kotlin SDKGen's portable runtime must cover Android and Kotlin/JS browser without forcing every
module to apply Android tooling or introducing platform APIs into `commonMain`. The initial KMP
convention covered JVM, Apple, Linux, Windows, and Kotlin/JS Node.js, while Android and browser
support required additional toolchains and target-specific test infrastructure.

## Decision

- Keep the base `sdkgen.kotlin-kmp` convention platform-neutral and include Kotlin/JS Node.js and
  browser targets.
- Add Android through the opt-in `sdkgen.kotlin-kmp-android` convention using
  `com.android.kotlin.multiplatform.library`.
- Use the `sdkgen.kotlin-kmp-jvm-android` convention for modules that require only JVM and Android.
- Compile and run shared contract tests on Android and Kotlin/JS browser for representative runtime
  and generated-SDK modules.
- Keep Android-specific APIs in Android source sets; `commonMain` remains platform-neutral.

## Implementation

- AGP is pinned in the version catalog and configured uniformly with `compileSdk = 36`,
  `minSdk = 21`, and JVM target 17.
- `runtime:core`, `runtime:testing`, `runtime:transport-ktor`, and the representative OpenRouter
  consumer opt into the Android KMP convention.
- `runtime:transport-okhttp` uses the JVM-and-Android convention.
- Kotlin/JS browser tests use Karma with Chrome Headless; CI provisions Chrome explicitly.

## Consequences

- Android and browser behavior is exercised without leaking platform dependencies into common APIs.
- Contributors running the complete matrix need the Android SDK and Chrome in addition to JDK 17
  and Node.js.
- `linuxArm64` and `mingwX64` remain compile-gate-only targets.
- iOS simulator tests remain environment-gated when the required Xcode runtime is unavailable.
- Wasm, watchOS, and tvOS remain outside the supported target matrix and require a separate decision.

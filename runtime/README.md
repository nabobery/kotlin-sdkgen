# Runtime modules

## Client-scoped configuration

Generated clients accept an immutable `SdkClientConfig` in addition to their original constructor. One instance is
shared by a generated root client and all of its resource clients, including its `RetryBudget`. It can provide retry
and deadline defaults, a request hook, logical and attempt middleware, lifecycle observers, and the `User-Agent`
product token without creating transports or reading environment state:

```kotlin
val config =
    SdkClientConfig(
        retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 2)),
        deadlines = SdkDeadlines(totalMillis = 30_000, attemptMillis = 10_000, idleMillis = null),
        productToken = "acme-app/1.2.3",
    )

val client = PetstoreClient(transport, "https://api.example.com", config)
```

Per-call `CallOptions` retain final precedence: `PolicyOverride.Disabled` or `Replace` overrides the client retry
decision, and a non-null per-call deadline replaces the client deadline. Client hooks and middleware are composed
with, rather than copied into, per-call options so they execute exactly once. Generated defaults from
`runtime.defaultServer` and `runtime.userAgentSuffix` supply constructor defaults; explicit constructor arguments and
`SdkClientConfig.productToken` can override them. See
[ADR 0022](../docs/adr/0022-generated-client-configuration-and-sse-payloads.md) for the complete resolution and
constructor-compatibility contract.

## Target matrix

`core` and `testing` apply the shared `sdkgen.kotlin-kmp` convention plus the opt-in
`sdkgen.kotlin-kmp-android` convention (`build.gradle.kts` for each module), and therefore target:

- JVM
- Kotlin/JS, both Node.js and browser (`useKarma { useChromeHeadless() }`)
- Android (`com.android.kotlin.multiplatform.library`, opt-in via `sdkgen.kotlin-kmp-android`)
- iOS ARM64, iOS simulator ARM64, and iOS x64 (Intel; cross-compiled, compile/link evidence only — not
  executed by the arm64 Apple verification lane)
- macOS ARM64 and macOS x64 (Intel; cross-compiled, compile/link evidence only — not executed by the
  arm64 Apple verification lane)
- Linux x64 and Linux ARM64 (secondary/compile-gate matrix — see below)
- mingw x64 (secondary/compile-gate matrix — see below)

Android and browser support are now part of the target matrix (see
[ADR 0011](../docs/adr/0011-android-browser-target-deferral.md)). Android `androidTarget()`
work is carried by the `com.android.kotlin.multiplatform.library` plugin alias, not the classic
`androidTarget()` + `com.android.library` combination, and `runtime:core` / `runtime:testing` /
`runtime:transport-ktor` already apply it. Do not put Android-specific APIs in `commonMain`;
platform code belongs only in the Android source set.

`linuxArm64` and `mingw x64` are compile-gate targets only, not full shared-contract-test targets,
per ADR-0011's "what remains deferred" note. `iosSimulatorArm64` contract tests are
environment-gated (loudly disabled, not silently skipped, when the host lacks the Xcode simulator
runtime). Wasm, watchOS, and tvOS are not in scope and have no convention-plugin or version-catalog
support.

# Runtime modules

`core` and `testing` currently target JVM, JS, iOS ARM64, iOS simulator ARM64, macOS ARM64, and Linux x64.

Android is intentionally deferred for Phase 1 repository scaffolding. When Android support is activated, add AGP to the
version catalog and build logic, then add `androidTarget()` to `sdkgen.kotlin-kmp.gradle.kts`; do not put Android-specific
APIs in `commonMain`.

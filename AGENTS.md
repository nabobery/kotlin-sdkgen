# PROJECT KNOWLEDGE BASE

**Updated:** 2026-07-29 for the cross-corpus conformance and release-readiness changes

## OVERVIEW

Open-source OpenAPI 3.1 Kotlin/KMP SDK generator. Parses OpenAPI specs, transforms through a semantic model, and emits Kotlin SDK code via KotlinPoet. JVM engine + KMP runtime (JVM, JS, iOS, macOS, Linux).

## STRUCTURE

```
kotlin-sdkgen/
├── build-logic/             # Convention plugins (kotlin-jvm, kotlin-kmp, serialization, publishing, ktlint)
├── generator/
│   ├── model/               # Semantic model types
│   ├── openapi/             # OpenAPI parsing, overlays, JSONPath (RFC 9535)
│   ├── engine/              # Core pipeline: config, declarations, emitter
│   └── cli/                 # CLI frontend
├── runtime/
│   ├── core/                # Shared runtime for generated SDKs (executor, auth, retry, pagination, streaming, middleware)
│   ├── testing/             # Test utilities + transport contract kit for generated SDKs
│   ├── transport-ktor/      # Ktor client transport adapter (KMP)
│   ├── transport-okhttp/    # OkHttp transport adapter (JVM)
│   └── transport-java-http/ # java.net.http transport adapter (JVM)
├── integrations/
│   └── gradle-plugin/       # Gradle plugin for code generation
├── conformance/
│   └── openrouter/consumer/ # Generated SDK conformance test
├── experiments-import/      # Config contract experiment (archived)
└── docs/
    ├── adr/                 # 19 ADRs
    └── phase0/              # Phase 0 research & results
```

## WHERE TO LOOK

| Task                              | Location                                            |
| --------------------------------- | --------------------------------------------------- |
| Generation pipeline orchestration | `generator/engine/GenerationPipeline.kt`            |
| Config model & validation         | `generator/engine/src/main/kotlin/engine/config/`   |
| OpenAPI → semantic model          | `generator/openapi/SemanticAdapter.kt`              |
| JSONPath (RFC 9535)               | `generator/openapi/jsonpath/`                       |
| Overlay application               | `generator/openapi/overlays/`                       |
| Declaration model                 | `generator/engine/declarations/DeclarationModel.kt` |
| Kotlin source emission            | `generator/engine/emit/KotlinPoetEmitter.kt`        |
| Runtime library                   | `runtime/core/`                                     |
| Build convention plugins          | `build-logic/src/main/kotlin/`                      |
| CLI entry point                   | `generator/cli/CliModule.kt`                        |
| CLI diff/explain commands         | `generator/cli/DiffCommand.kt`, `ExplainCommand.kt` |
| Generator plugin SPI (preview)    | `generator/engine/src/main/kotlin/engine/spi/`      |
| Transport adapters                | `runtime/transport-{ktor,okhttp,java-http}/`        |
| Transport contract kit            | `runtime/testing/SdkTransportContractKit.kt`        |
| SDK conformance tests             | `conformance/openrouter/consumer/`                  |
| ADR index                         | `docs/adr/`                                         |
| Live cross-corpus parity gate       | `./gradlew :conformance:parity:liveParity`          |

## CONVENTIONS

- **Kotlin style**: ktlint_official, max 120 chars, trailing commas required
- **Package**: `com.nabobery.sdkgen.*`
- **explicitApi()** enabled on all modules (public API must be explicit)
- **JVM target**: 17
- **Gradle**: Configuration cache on, `org.gradle.configuration-cache.problems=fail`
- **Ktlint**: formatting and linting enforced via convention plugins
- **Testing**: JUnit 5 (JVM), kotlin.test (KMP), golden file tests for emitter
- **Architecture decisions**: Documented in `docs/adr/` as numbered ADRs (0001-0019)
- **Build**: Convention plugins under `build-logic/` rather than direct plugin application

## ANTI-PATTERNS (THIS PROJECT)

- **No `as any` / `@Suppress("UNCHECKED_CAST")`** - strict typing required
- **No Android-specific APIs in `commonMain`** - Android deferred; put platform code in platform source sets only
- **No inline generated regions** - prefer composition over inheritance hooks
- **No editable generated regions** (generated + handwritten source trees are separate)

## UNIQUE STYLES

- Uses JSONPath RFC 9535 for overlay seam (not JSON Patch)
- Semantic model acts as the hub: OpenAPI → SemanticModel → Declarations → KotlinPoet
- Output publishing uses `AtomicOutputPublisher` for atomic file writes
- Golden test pattern: generate → diff against committed golden files
- KMP targets: JVM, JS (nodejs + browser), iOS ARM64, iOS simulator ARM64, macOS ARM64, Linux x64/ARM64, mingw x64; Android via opt-in `sdkgen.kotlin-kmp-android` convention

## COMMANDS

```bash
./gradlew build                 # Full build
./gradlew check                 # Tests + lint
./gradlew ktlintCheck           # Lint every Kotlin source set
./gradlew ktlintFormat          # Auto-format every Kotlin source set
./gradlew :generator:cli:run    # Run CLI
```

## RESOURCE-SAFE CONFORMANCE

- Run only one Gradle or corpus-generation lane at a time.
- Use `--no-daemon --max-workers=1 -Dorg.gradle.parallel=false`
  and `-Pkotlin.compiler.execution.strategy=in-process`.
- Set `JAVA_TOOL_OPTIONS=-Xmx2g` for focused checks and raise deliberately: 3–4 GiB for generation or emitter
  work; up to 8 GiB only for a clean full Stripe compile, with no concurrent build.
- Prefer focused tests and configuration-cache reuse. Never run generated-source formatting over committed corpus
  snapshots.

## NOTES

- Node.js download is DISABLED in KMP builds - must have node on PATH
- JS browser tests use Karma + ChromeHeadless - Chrome must be installed (set `CHROME_BIN` if it is not auto-discoverable)
- Android compilation requires the Android SDK (set `ANDROID_HOME`, e.g. `$HOME/Library/Android/sdk`)
- iOS simulator ARM64 tests run only when the host has the Xcode simulator runtime; otherwise they are disabled with a loud warning (see `sdkgen.kotlin-kmp.gradle.kts`)
- Version published via `sdkgenVersion` gradle property (currently `0.1.0-SNAPSHOT`)
- Root `build.gradle.kts` is minimal (only `base` plugin + version propagation)
- ~121 production Kotlin source files across all modules (tests excluded)

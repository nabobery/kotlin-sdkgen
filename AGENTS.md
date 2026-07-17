# PROJECT KNOWLEDGE BASE

**Generated:** 2026-07-17
**Commit:** `818f106`
**Branch:** `main`

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
│   ├── core/                # Shared runtime for generated SDKs
│   └── testing/             # Test utilities for generated SDKs
├── integrations/
│   └── gradle-plugin/       # Gradle plugin for code generation
├── conformance/
│   └── openrouter/consumer/ # Generated SDK conformance test
├── experiments-import/      # Config contract experiment (archived)
└── docs/
    ├── adr/                 # 10 ADRs
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
| SDK conformance tests             | `conformance/openrouter/consumer/`                  |
| ADR index                         | `docs/adr/`                                         |

## CONVENTIONS

- **Kotlin style**: ktlint_official, max 120 chars, trailing commas required
- **Package**: `com.nabobery.sdkgen.*`
- **explicitApi()** enabled on all modules (public API must be explicit)
- **JVM target**: 17
- **Gradle**: Configuration cache on, `org.gradle.configuration-cache.problems=fail`
- **Ktlint**: formatting and linting enforced via convention plugins
- **Testing**: JUnit 5 (JVM), kotlin.test (KMP), golden file tests for emitter
- **Architecture decisions**: Documented in `docs/adr/` as numbered ADRs (0001-0010)
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
- KMP targets: JVM, JS (nodejs), iOS ARM64, iOS simulator ARM64, macOS ARM64, Linux x64

## COMMANDS

```bash
./gradlew build                 # Full build
./gradlew check                 # Tests + lint
./gradlew ktlintCheck           # Lint every Kotlin source set
./gradlew ktlintFormat          # Auto-format every Kotlin source set
./gradlew :generator:cli:run    # Run CLI
```

## NOTES

- Node.js download is DISABLED in KMP builds - must have node on PATH
- iOS simulator ARM64 tests disabled (`iosSimulatorArm64Test` - `enabled = false`)
- Version published via `sdkgenVersion` gradle property (currently `0.1.0-SNAPSHOT`)
- Root `build.gradle.kts` is minimal (only `base` plugin + version propagation)
- 122 Kotlin source files, ~17K lines of production code across all modules

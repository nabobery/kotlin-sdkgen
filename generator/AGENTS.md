# generator

**Location:** `generator/`
**4 modules, 76 source files, ~17K lines**

## OVERVIEW

Generation pipeline API: parses OpenAPI specs, transforms through a semantic model, and emits Kotlin SDK code. The core value of the project lives here.

## STRUCTURE

```
generator/
├── model/        # Semantic model types (SemanticModel.kt, SdkSpec.kt - 4 files)
├── openapi/      # OpenAPI 3.1 parsing, JSONPath, overlays, source indexing
├── engine/       # Config, declarations, emission, output, orchestration
└── cli/          # CLI entry point (Clikt-based)
```

## WHERE TO LOOK

| Module     | Entry Point             | Purpose                                          |
| ---------- | ----------------------- | ------------------------------------------------ |
| `model/`   | `SemanticModel.kt`      | Shared semantic types between parser and emitter |
| `openapi/` | `SemanticAdapter.kt`    | OpenAPI → SemanticModel conversion               |
| `engine/`  | `GenerationPipeline.kt` | Pipeline orchestration + KotlinPoet emission     |
| `cli/`     | `CliModule.kt`          | CLI frontend + argument parsing                  |

## CONVENTIONS

- Each sub-module has its own `build.gradle.kts` with `explicitApi()` enabled
- `model/` has zero dependencies on `openapi/` or `engine/` - strict layering
- `openapi/` must not depend on KotlinPoet - emission belongs in `engine/`
- `cli/` is a thin wrapper; all logic lives in `engine/`

## ANTI-PATTERNS

- **Don't add dependencies from `model/` to `openapi/` or `engine/`** - model is the central hub
- **Don't bypass the pipeline** - always go through `GenerationPipeline`
- **Don't add CLI-specific logic here** - delegate to engine modules

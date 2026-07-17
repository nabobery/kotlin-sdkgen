# engine

**Location:** `generator/engine/`
**13 source files, ~8K lines**

## OVERVIEW

Core generation pipeline: config loading, validation, semantic-to-declaration transform, and KotlinPoet emission. The orchestrator that ties OpenAPI parsing to code output.

## STRUCTURE

```
engine/src/main/kotlin/engine/
├── config/          # Config model, loader, validator, lock contract
├── declarations/    # DeclarationModel + SemanticToDeclarations transform
├── emit/            # KotlinPoetEmitter (~1909 lines)
├── input/           # LocalInputResolver (file resolution)
├── output/          # AtomicOutputPublisher (atomic file writes)
├── EngineModule.kt  # DI wiring
└── GenerationPipeline.kt  # Top-level orchestration
```

## WHERE TO LOOK

| Task                             | File                                     |
| -------------------------------- | ---------------------------------------- |
| Pipeline flow                    | `GenerationPipeline.kt`                  |
| Config model                     | `config/ConfigModel.kt`                  |
| Config validation                | `config/ConfigValidator.kt`              |
| Config lock contract             | `config/LockContract.kt`                 |
| Declaration model                | `declarations/DeclarationModel.kt`       |
| Semantic → declaration transform | `declarations/SemanticToDeclarations.kt` |
| Code emission                    | `emit/KotlinPoetEmitter.kt`              |
| Atomic output                    | `output/AtomicOutputPublisher.kt`        |

## CONVENTIONS

- `ConfigModel` is the single source of truth for generation parameters
- `LockContract` encodes the config schema version + structural guarantees
- Tests use golden files under `src/test/resources/goldens/`
- `explicitApi()` enforced - all public API must be annotated
- No inline generated regions; composition over inheritance

## ANTI-PATTERNS

- **Don't bypass `ConfigValidator`** - all configs must pass validation before use
- **Don't emit directly to filesystem** - use `AtomicOutputPublisher` for atomicity
- **Don't depend on OpenAPI types in emit/** - declarations are the sole bridge

## COMMANDS

```bash
# Run engine tests only
./gradlew :generator:engine:test

# Run specific golden test
./gradlew :generator:engine:test --tests "*GoldenTest*"

# Update golden files (delete and regenerate)
rm -rf generator/engine/src/test/resources/goldens/
./gradlew :generator:engine:test
```

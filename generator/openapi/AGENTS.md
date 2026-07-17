# openapi

**Location:** `generator/openapi/`
**12 source files, ~6K lines**

## OVERVIEW

OpenAPI 3.1 parsing, semantic model adaptation, JSONPath (RFC 9535) evaluation, and overlay application. The front-end of the generation pipeline.

## STRUCTURE

```
openapi/src/main/kotlin/openapi/
├── jsonpath/        # RFC 9535 evaluator + grammar validator
├── overlays/        # Overlay applicator, model, codecs, selectors
├── SemanticAdapter.kt  # OpenAPI → SemanticModel transform (~1121 lines)
└── SourceIndex.kt   # Source map for parse result indexing
```

## WHERE TO LOOK

| Task                          | File                                  |
| ----------------------------- | ------------------------------------- |
| OpenAPI → semantic transform  | `SemanticAdapter.kt`                  |
| JSONPath evaluation           | `jsonpath/Rfc9535Evaluator.kt`        |
| JSONPath grammar validation   | `jsonpath/Rfc9535GrammarValidator.kt` |
| Overlay application           | `overlays/OverlayApplicator.kt`       |
| Overlay model                 | `overlays/OverlayModel.kt`            |
| RFC 9535 selector compilation | `overlays/Rfc9535Selector.kt`         |
| Effective diff computation    | `overlays/EffectiveDiff.kt`           |
| Source index                  | `SourceIndex.kt`                      |

## CONVENTIONS

- `SemanticAdapter` is the single entry point for OpenAPI → semantic model
- JSONPath implementation follows RFC 9535 exactly (not JSON Patch)
- Overlays use JSONPath selectors, not JSON pointers
- Tests use the OpenRouter spec (`conformance/openrouter/openapi.yaml`) as the primary test corpus + stress YAMLs (`conformance/stress/`)

## ANTI-PATTERNS

- **Don't mix overlay logic with semantic adaptation** - overlays apply before adaptation
- **Don't write custom JSONPath** - use the RFC 9535 evaluator
- **Don't skip grammar validation** - `Rfc9535GrammarValidator` must run before evaluation
- **No direct KotlinPoet dependencies** in this module - emit belongs in engine

## COMMANDS

```bash
# Run openapi module tests
./gradlew :generator:openapi:test

# Run overlay-specific tests
./gradlew :generator:openapi:test --tests "*Overlay*"

# Run JSONPath tests
./gradlew :generator:openapi:test --tests "*JsonPath*"
```

# build-logic

**Location:** `build-logic/`
**5 convention plugins, 172 lines total**

## OVERVIEW

Pre-compiled Gradle convention plugins shared across all modules. Defines the project's build conventions, rather than applying plugins directly in each `build.gradle.kts`.

## STRUCTURE

```
build-logic/src/main/kotlin/
├── sdkgen.kotlin-jvm.gradle.kts          # JVM-targeted modules
├── sdkgen.kotlin-kmp.gradle.kts          # KMP multi-platform modules
├── sdkgen.kotlin-serialization.gradle.kts # kotlinx-serialization config
├── sdkgen.ktlint.gradle.kts              # Ktlint formatting + linting
└── sdkgen.publishing.gradle.kts          # Maven publishing config
```

## WHERE TO LOOK

| Task                      | File                                     |
| ------------------------- | ---------------------------------------- |
| Add JVM module convention | `sdkgen.kotlin-jvm.gradle.kts`           |
| Add KMP module convention | `sdkgen.kotlin-kmp.gradle.kts`           |
| Enable serialization      | `sdkgen.kotlin-serialization.gradle.kts` |
| Configure linting         | `sdkgen.ktlint.gradle.kts`               |
| Configure publishing      | `sdkgen.publishing.gradle.kts`           |

## CONVENTIONS

- Plugin IDs are auto-generated from filenames: `sdkgen.${name}` via `gradlePlugin` block
- `kotlin-jvm` targets JVM 17 with explicit API
- `kotlin-kmp` configures targets (JVM, JS, iOS, macOS, Linux) + disables node download
- `ktlint` enforces `ktlint_official` style, max 120 chars, trailing commas
- Publishing uses the Central Portal through Nmcp and requires in-memory signing plus Central user-token credentials

## ANTI-PATTERNS

- **Don't apply plugins directly in sub-modules** - always use `id("sdkgen.${name}")`
- **Don't duplicate convention settings** - extend the existing plugin instead
- **Don't add version constraints here** - managed by the root `gradle.properties`

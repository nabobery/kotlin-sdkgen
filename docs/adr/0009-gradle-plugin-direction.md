# ADR 0009: Implement a lazy cacheable Gradle plugin over the shared engine

## Status

Accepted with engine cacheability constraints.

## Context

The Gradle plugin must invoke the same generator engine as the CLI, wire generated sources lazily into JVM and KMP builds, support configuration cache and build cache, relocate across directories, and avoid generation during configuration-only commands.

Cacheability depends on the production engine behaving as a deterministic function of declared inputs. A cacheable task annotation cannot compensate for undeclared files, environment state, network access, unstable ordering, or partial output.

## Decision

Publish a thin `com.nabobery.kotlin-sdkgen` Gradle plugin backed by the same immutable engine request/API as the CLI.

Register one lazy `@CacheableTask` per named SDK configuration. Model files and scalars with typed Gradle properties, use relocatable path sensitivity, own a unique build-directory output, and register the task provider directly with the selected Kotlin source set after the relevant Kotlin plugin is present.

Remote acquisition is a separate declared, digest-verifying task; ordinary generation consumes pinned local inputs. Gradle types do not cross into the engine.

The production engine and plugin must preserve all twelve cacheability constraints proven by Phase 0:

1. **Declare every semantic input.** Specs, overlays, configuration, plugin classpaths, generator/runtime versions, feature flags, formatting options, and environment-derived semantics are typed task properties. The task action reads no undeclared files, environment variables, system properties, or network state.
2. **Use relocatable path normalization.** Use relative path sensitivity where layout is semantic and name-only sensitivity only when directories are not semantic. Never emit absolute input paths or include them in manifests, diagnostics, cache keys, or source headers.
3. **Own a unique output directory.** Every named generation configuration has a distinct output directory; the task cleans only that directory and never mutates handwritten sources.
4. **Keep output deterministic.** Sort maps, sets, files, operations, schemas, diagnostics, and plugin results; pin UTF-8 and LF; exclude locale, timezone, timestamps, randomness, users, machine paths, and unstable iteration order.
5. **Keep configuration lazy.** Compose values with `Provider`, `Property`, `RegularFileProperty`, `DirectoryProperty`, and collection properties; do not call `get()` during plugin application or source-set configuration.
6. **Do not access `Project` from task actions.** Use declared properties, JDK APIs, and injected Gradle services instead of `getProject()` or captured project objects.
7. **Treat the engine as a pure library boundary.** Resolve Gradle properties into an immutable engine request, call the same engine used by the CLI, and write only declared outputs. Gradle types do not leak into core code.
8. **Model plugin execution classpaths.** Declare extension artifacts as normalized classpath inputs and include plugin identity, version, and configuration in semantic inputs and manifests.
9. **Separate remote retrieval.** Fetching is an explicit cacheable acquisition task with URL/policy inputs and digest-verified local output; `GenerateSdkTask` performs no network access.
10. **Preserve task-provider source wiring.** Attach generated directories through supported Kotlin source-set APIs using the generation task provider so compilation dependencies remain lazy and explicit.
11. **Use atomic output strategy carefully.** Temporary files stay under task-owned space, leave no nondeterministic residue, and failed generation never leaves a partially valid output tree or replaces prior good output.
12. **Report cacheability violations.** Use Gradle Problems API diagnostics for shared outputs, undeclared/remote inputs, non-relocatable configuration, and unsupported source-set wiring.

Worker API isolation is optional and does not weaken these constraints. Prefer classloader isolation when measured extension/parser workloads justify it; use process isolation only for a demonstrated heap or JVM-state need.

## Evidence

Primary evidence:

- [Phase 0 Gradle-cache report](../phase0/results/gradle-cache/REPORT.md)

All required behaviors passed on Gradle 9.6.1, KGP 2.3.20, and JDK 17:

> The second configuration-cache build printed `Reusing configuration cache.` and completed in **262 ms** with no reported problems.

> After `clean`, both generation tasks restored `FROM-CACHE`; the build completed in **320 ms**.

> A relocated source-only project restored both generation tasks `FROM-CACHE`, and both recursive generated-output diffs were exactly **0 bytes**.

Unchanged inputs produced `UP-TO-DATE`; changing `packageName` re-executed generation with Gradle reporting that input property change. Running `help` after deleting generated directories did not execute generation or recreate outputs. `validatePlugins` passed, and `--warning-mode=all` emitted no Gradle 9.6.1 or KGP 2.3.20 warnings.

## Consequences

### Positive

- CLI and Gradle generation share one deterministic engine.
- JVM and KMP consumers receive lazy source wiring and correct task dependencies.
- Build outputs are relocatable and reusable from local or remote caches.
- IDE/configuration-only use does not trigger generation.

### Negative

- Every semantic influence must be modeled explicitly as task input.
- Remote intake requires a separate workflow and artifact boundary.
- Multiple named SDK configurations require strict output isolation and DSL validation.

## Conditions and re-evaluation triggers

- Add TestKit coverage for JVM and representative KMP consumers, multiple named configurations, plugin-classpath invalidation, clean-cache restore, relocation, and configuration-cache reuse when the public DSL stabilizes.
- Validate cache behavior after every Gradle or KGP baseline upgrade.
- Reject plugin features that require undeclared ambient state in ordinary generation.
- Re-evaluate Worker API isolation only from measured parser/plugin concurrency or memory evidence.

## Amendment (2026-08-03)

The plugin ID above, `com.nabobery.kotlin-sdkgen`, is superseded by `io.github.nabobery.kotlin-sdkgen`. Maven
Central namespace verification for the `com.nabobery` Maven group would require proving ownership of the
`nabobery.com` domain via a DNS TXT record, and the project owner does not control that domain. The
`io.github.nabobery` namespace, verified instead through GitHub account ownership, does not have that
requirement. Since nothing had been published under the original plugin ID at the time of this change, this
is a plain rename with no relocation shim. See ADR-0008's own amendment for the full rationale, which applies
identically here since the Gradle plugin ID and the Maven group move together.

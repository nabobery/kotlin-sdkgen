# ADR 0008: Publish eight initial coordinates on one version train

## Status

Accepted.

## Context

Kotlin SDKGen has build-time generator code, KMP runtime code, transport-specific adapters, a CLI, a Gradle plugin, and test support. Publishing every internal source boundary would expose parser/model ABI without proving an independent consumer. Merging all runtime and adapter code would force unwanted engines into consumer graphs.

## Decision

Publish these eight initial coordinates:

1. `com.nabobery:kotlin-sdkgen-engine`
2. `com.nabobery:kotlin-sdkgen-cli`
3. `com.nabobery:kotlin-sdkgen-gradle-plugin`
4. `com.nabobery:kotlin-sdkgen-runtime`
5. `com.nabobery:kotlin-sdkgen-transport-ktor`
6. `com.nabobery:kotlin-sdkgen-transport-okhttp`
7. `com.nabobery:kotlin-sdkgen-transport-java-http`
8. `com.nabobery:kotlin-sdkgen-testing`

The initial engine coordinate absorbs the semantic/declaration model and OpenAPI intake implementation. Those may remain internal packages or source modules but are not independently versioned public artifacts.

Create a public coordinate only when at least one of these is demonstrated:

- an independent supported consumer;
- an independently omittable dependency graph;
- a distinct execution environment or publication channel.

Keep runtime transport-neutral. Each concrete transport is opt-in. Keep testing separate so production graphs do not inherit fake transports or fixtures. KMP consumers depend on root coordinates and select target variants through Gradle Module Metadata.

Use one coordinated version train initially. Revisit independent versioning only after real release cadence and compatibility policy justify it.

## Evidence

Primary evidence:

- [Phase 0 packaging report](../phase0/results/packaging/REPORT.md)

The nine-module prototype produced **21 physical Maven publications** and passed all isolated consumer rehearsals:

> JVM, KMP, and build-time engine consumers compiled; metadata verification reported **0 failures**.

Root-coordinate KMP resolution selected the correct target variants:

> `jvmCompileClasspath` selected `jvmApiElements-published`, `iosArm64CompileKlibraries` selected `iosArm64ApiElements-published`, and `linuxX64CompileKlibraries` selected `linuxX64ApiElements-published`.

Dependency-direction evidence was explicit:

> `Dependency directions verified: runtime is adapter-free; engine is runtime-free; adapters depend inward.`

The merge analysis found no demonstrated independent consumer for `sdkgen-model` or `sdkgen-openapi`, and splitting them did not let an engine consumer omit swagger-parser. The Gradle plugin was not built in this spike but has a distinct Gradle execution environment and Plugin Portal lifecycle, satisfying the boundary rule.

## Consequences

### Positive

- Runtime consumers install only the chosen transport.
- Build-time parser/emitter dependencies do not leak into SDK runtime graphs.
- Internal semantic and parser seams can evolve without premature public-coordinate compatibility commitments.
- Test utilities remain out of production dependencies.

### Negative

- Engine consumers receive parser and emitter dependencies together initially.
- One version train may release unchanged artifacts together.
- The Gradle plugin requires separate marker and Plugin Portal validation in addition to Maven publication.

## Conditions and re-evaluation triggers

- Re-open model or OpenAPI coordinates only when a supported parser-free, model-only, or intake-only consumer exists and the corresponding ABI is intentionally public.
- Add separate telemetry bridge artifacts only when concrete integrations exist.
- Release gates must include POM and Gradle Module Metadata, sources, documentation, signatures, checksums, no project-dependency leakage, and isolated root-coordinate rehearsals.
- Clarify that Kotlin 2.3.20 is the compiler/plugin and generated-source baseline; dependency resolution may select a compatible stdlib patch, as Ktor 3.5.1 selected 2.3.21 in the experiment.

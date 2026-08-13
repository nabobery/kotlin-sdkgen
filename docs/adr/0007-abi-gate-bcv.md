# ADR 0007: Gate published ABI with BCV and staged-artifact dumps

## Status

Accepted for the Kotlin 2.3.20 baseline.

## Context

Kotlin SDKGen must detect public ABI drift in the actual staged JVM and KMP publications. Kotlin 2.3.20's built-in ABI validator does not expose the current rolling-documentation DSL for Maven-publication inputs, and validator-generated KLib dumps are merged compilation outputs rather than direct inspection of every staged `.klib`.

## Decision

Pin `org.jetbrains.kotlinx.binary-compatibility-validator:0.18.1` as the baseline ABI-drift tool while the Kotlin compiler/plugin baseline remains 2.3.20.

For JVM publications:

- stage the Maven publication first;
- configure standalone BCV's `jvmApiBuild.inputJar` to the exact staged JVM JAR;
- compare its dump against the accepted baseline.

For KLib publications:

- enable BCV's experimental KLib validation with strict validation in the macOS release lane;
- stage every KMP publication;
- run Kotlin 2.3.20's `klib dump-abi` against every staged `.klib` independently;
- compare each target's normalized semantic ABI with its accepted publication baseline.

Do not run the KGP and standalone validators together in normal CI. Their tested JVM and merged KLib dumps were byte-identical, and KGP 2.3.20 adds no publication-source coverage.

Treat ABI drift detection separately from semantic compatibility classification: compatible additions still change the accepted dump but are not automatically breaking changes.

## Evidence

Publication-level JVM fidelity was proven by redirecting BCV to the staged JAR:

> Removing only `WidgetState.class` from a copied staged JAR, without changing source or compiled class directories, made `jvmApiCheck` fail and report the complete enum as removed.

The tested dump outputs were duplicates:

> KGP and standalone JVM dumps were both **47 lines / 2,560 bytes** and byte-identical; merged KLib dumps were both **56 lines / 4,761 bytes** and byte-identical.

Every public source scenario was detected by both tools, while the internal-only implementation change passed. Compatible additions also failed the exact-drift gate, confirming that compatibility classification is a separate concern.

The Kotlin baseline gap was reproduced verbatim:

> `Unresolved reference 'binariesSource'.`
>
> `Unresolved reference 'MAVEN_PUBLICATIONS'.`
>
> `Unresolved reference 'keepLocallyUnsupportedTargets'.`

At KGP 2.3.20, the available configuration is `abiValidation { klib { keepUnsupportedTargets.set(true) } }`; it validates compilation outputs, not Maven publications.

## Consequences

### Positive

- The JVM gate examines the binary actually staged for publication.
- Every KLib target receives an independent staged-artifact check.
- Duplicate validator failures and maintenance cost are avoided.
- Kotlin baseline changes have an explicit migration checkpoint.

### Negative

- BCV 0.18.1 is maintenance-mode and its KLib support is experimental.
- Staged KLib comparison requires custom Gradle orchestration and macOS release coverage for Apple targets.
- Exact ABI diffs need a separate human or automated compatibility classification step.

## Conditions and re-evaluation triggers

- Re-run the experiment on every Kotlin baseline bump.
- Migrate to KGP ABI validation only after the selected KGP version demonstrably supports staged JVM and per-publication KLib inputs for this KMP layout.
- Add a Linux-host fixture to observe unsupported Apple-target behavior; Foundation Evaluation could not exercise that path on macOS.
- Fail release CI if any supported publication is unstaged or omitted from the ABI comparison.
- Pin version-specific DSL examples; do not copy syntax from the rolling Kotlin documentation without verifying it against the baseline.

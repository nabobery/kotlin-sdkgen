# ADR 0004: Use KotlinPoet as the sole production source emitter

## Status

Accepted.

## Context

Kotlin SDKGen must emit deterministic, compilable Kotlin across a broad public API surface. The emitter needs reliable declaration rendering, imports, aliases, annotations, KDoc, and collision handling. Direct text emission is faster but shifts compiler-adjacent syntax and import responsibilities into the generator.

Neither emitter can repair semantically unordered input. Ordering, naming, and source placement must be resolved before rendering.

## Decision

Use `com.squareup:kotlinpoet:2.3.0` as the only production Kotlin source emitter, behind an internal emitter interface.

Permit a narrow generator-owned `CodeBlock` escape hatch for implementation bodies and expression syntax KotlinPoet does not structurally model. Escape-hatch code must use resolved KotlinPoet placeholders such as `%T`, `%M`, `%N`, `%S`, and `%L`; arbitrary user templates and post-emission rewriting are prohibited.

The immutable Kotlin declaration model owns:

- canonical file, declaration, and member ordering;
- package and file placement;
- resolved names and collision decisions;
- types, nullability, presence, modifiers, and annotations;
- KDoc content and sanitization;
- generated-to-source provenance.

KotlinPoet owns rendering mechanics, Kotlin syntax, imports, aliases, indentation, wrapping, and source-file construction. Direct text emission remains a benchmark or golden oracle only, not a second production path.

## Evidence

Both candidates emitted nine representative files, compiled with Kotlin 2.3.20/JDK 17, and passed invariant checks. KotlinPoet's decisive correctness benefit was automatic import collision handling:

> KotlinPoet emitted deterministic `AlphaMessage` and `BetaMessage` aliases for two colliding `Message` types; the direct emitter required a dedicated alias table and policy.

Determinism held across recursive shuffle, three fresh JVM processes, and two directories:

> KotlinPoet produced SHA-256 `da64289ad4211fe469686b7ad3fa47e94d3ca500f96c2f4188ad52b429875533` in all three runs, with an empty cross-directory diff.

The measured cost was real but acceptable:

> For **500** synthetic data classes, KotlinPoet's median render was **80.219 ms** with **333,671,176 allocated bytes**, versus direct text at **1.343 ms** and **4,771,352 bytes**.

The ordering probe showed that both emitters changed output when declaration-model normalization was bypassed, establishing that deterministic order belongs to the declaration model.

## Consequences

### Positive

- Imports, aliases, declarations, and syntax use a maintained structured library.
- The project has one emission path and one conformance surface.
- Collision and escaping logic is smaller and easier to review.
- Declaration semantics remain testable independently from formatting.

### Negative

- KotlinPoet is slower and allocates more than direct text in the isolated benchmark.
- KotlinPoet's formatting may differ from preferred handwritten style.
- Raw `CodeBlock` bodies are not fully reformatted and require focused tests.

## Conditions and re-evaluation triggers

- Compile and golden-test every escape-hatch construct, including serializer bodies, KDoc terminators, file annotations, expression bodies, and import collisions.
- Add a corpus-scale emitter performance regression gate once broad generation exists.
- Re-evaluate KotlinPoet only if render/compile cost becomes a measured project bottleneck or required Kotlin syntax cannot be represented safely through declarations plus the narrow escape hatch.
- Any replacement must preserve the declaration-model boundary and deterministic output guarantees.

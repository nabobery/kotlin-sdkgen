# ADR 0010: Represent open enums as an AWS-style sealed hierarchy

## Status

Accepted.

## Context

Open string enums must preserve future wire values rather than collapse them into `UNKNOWN`. The remaining design question was the public Kotlin vehicle: an `@JvmInline value class` or an AWS-style sealed hierarchy.

Both vehicles work in Kotlin and round-trip unknown values. Public generated SDKs also need coherent Java source signatures. Kotlin/JVM value-class mangling affects constructors, constants, methods, properties, data-class components, and copies whenever the type appears in a public signature.

## Decision

Generate each open enum as a sealed hierarchy:

- one singleton case per documented wire value;
- `SdkUnknown(val value: String)` for every other value;
- a public stable `value` property;
- `fromValue(String)` that canonicalizes documented values to their singleton cases and returns `SdkUnknown` otherwise;
- a serializer that emits and decodes the exact string without normalization or collapse.

The hierarchy is forward-compatible, not semantically closed. Kotlin `when` expressions must account for `SdkUnknown`.

Optional JVM interop helpers may expose Java-style static constants, factories, and overloads. They do not change the common representation.

Do not expose the value-class alternative in generated public signatures. If value classes remain for unrelated internal portable types, common source must explicitly use `import kotlin.jvm.JvmInline`; despite the package name, that annotation is common-compatible in the pinned toolchain.

## Evidence

Both enum vehicles preserved unknown values across the KMP matrix, but Java source compatibility diverged:

> The sealed vehicle supported ordinary construction, singleton constants, `instanceof`/wire-value dispatch, map keys, request properties, and typed method signatures.

The value-class negative Java fixture produced **six compiler errors**, including:

> `cannot find symbol: constructor ProviderSort(String)`
>
> `cannot find symbol: method getPrice()`
>
> `cannot find symbol: method echo(ProviderSort)`
>
> `ListModelsRequest(String,String) has private access`

Reflection showed the mangled ABI propagated through public APIs:

> `OpenEnumApi` exposed `echo-7GhXbU0(String):String`, and `ListModelsRequest` exposed `getSort-R_j6NQg():String` rather than ordinary Java methods using `ProviderSort`.

The shared golden API passed **10 common tests** on JVM, Node.js, and macOS Arm64, plus **3 Java interop tests**. iOS Arm64, iOS Simulator Arm64, and Linux x64 test executables compiled and linked.

## Consequences

### Positive

- Unknown wire values round-trip exactly and remain inspectable.
- Java callers receive ordinary constructors, getters, and typed signatures.
- Known values are canonical singleton instances.
- Common behavior is consistent across KMP targets.

### Negative

- Unknown cases allocate reference objects; known cases use singleton objects.
- The generated declaration surface is larger than a value class.
- Java callers use `.INSTANCE` for Kotlin singleton cases unless a JVM facade supplies friendlier statics.
- Kotlin exhaustiveness includes the unknown case by design.

## Conditions and re-evaluation triggers

- Keep raw value equality and serialization stable across releases.
- Add JVM facade helpers only as additive interop APIs.
- If allocation becomes a measured bottleneck, optimize internal protocol storage without changing the public sealed type.
- Re-evaluate only if Kotlin/JVM provides a value-like public type with ordinary Java source constructors and unmangled signatures across all containing APIs.

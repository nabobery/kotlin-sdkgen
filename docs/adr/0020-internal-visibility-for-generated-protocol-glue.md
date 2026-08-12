# ADR 0020: Keep generated protocol glue internal

## Status

Accepted. Amends [ADR 0015](0015-partition-codec-object-initializers.md).

## Context

[FR-KOT-014](../requirements.md) requires a public generated SDK surface while keeping generated protocol glue
internal. The emitter currently exposes protocol implementation details as generated API: per-operation retry and
security descriptors, codec registries and identifiers, request-body codecs, and serialization machinery. A
consumer can therefore bind to details the generator must be free to reorganize before 1.0.

ADR 0015 records why this is not a deliberately designed contract. Its first partitioning attempt placed nested
codec declarations below private partition holders and silently deleted 518 public symbols. The repair preserved
the accidental status quo: ADR 0015 describes codec-ID constants and nested form/multipart codec objects as
"public generated API" because they had to remain reachable during partitioning, not because they were selected as
a supported consumer surface.

The same problem extends beyond codecs. Public `OperationMetadata` values expose retry, security, and streaming
metadata; public serializers expose wire implementation details. None is a stable consumer contract.

## Decision

**Make generated protocol glue explicitly `internal`; retain an explicit public SDK surface.**

The following generated declarations are `internal`:

- Per-operation `OperationMetadata` values, including stream metadata.
- `<Group>Codecs` holder objects and their partition-forwarding accessors.
- Request and response codec-ID constants.
- `MediaTypeCodecRegistry` properties.
- Form and multipart codec objects.
- Model, enum, and union `KSerializer` objects named `Serializer`.

Every affected declaration carries an explicit `internal` modifier, including declarations enclosed by an internal
holder. Effective visibility and declared visibility must agree: an explicit modifier prevents the source from
claiming a public contract that its enclosing declaration does not actually provide. This follows the
effective-visibility discipline established by ADR 0019.

### Serializer placement

Kotlin does not permit internal members directly in an interface body (measured error: `modifier 'internal' is not
applicable inside 'interface'`). `OneOfDeclaration` and `PrimitiveOneOfDeclaration` emit public sealed interfaces,
so their serializers are emitted as top-level `internal object <Name>Serializer` declarations in the same generated
file. The existing top-level internal `<Name>Inspection` declaration is the placement precedent.

`StandardProjection.emitterDerivedNames` reserves `<name>Serializer` in its `ONE_OF` branch so a schema cannot
collide with the derived serializer name. AnyOf wrappers, models, and enums retain nested `Serializer` objects:
their class bodies can contain internal members. This changes no generated-file count; the projection continues to
place one declaration in each generated file.

### Consumer serialization contract

Generated models remain `@Serializable`. The concrete `Serializer` object is no longer nameable from another module
(measured error: `cannot access 'object Serializer': it is internal`).

The kotlinx-serialization compiler plugin synthesizes a public `Companion` with a public `serializer()` on every
`@Serializable` type, including when `with = <internal serializer>` is specified and on sealed interfaces with no
declared companion. `KSerializer<Model>` therefore remains reachable through `Model.Companion.serializer()`.
External-module `Json.encodeToString` and `decodeFromString` calls, and consumer-owned `@Serializable` types that
embed generated models, continue to compile and round-trip correctly.

The generated `KSerializer` implementation itself is never re-publicized by this path. Suppressing the synthesized
companion is explicitly out of scope: it belongs to the compiler plugin, and it is precisely what keeps consumer
serialization working. This contract was measured on the JVM. Non-JVM parity is expected because the synthesis is
frontend-level rather than backend-specific; a KMP cross-module guard test in the implementation task closes that
expectation.

### Module boundary

This contract relies on all generated declarations from one generation run compiling in one Kotlin module, where
`internal` visibility is available to the generated client and model code. The published coordinates enumerated by
[ADR 0008](0008-artifact-split-8-coordinates.md) do not publish generated output as a separate artifact.

### Enforcement

`EmittedApiProjection` walks the KotlinPoet declaration tree and cannot see the compiler-plugin-synthesized
companion. "The glue is unreachable" is therefore a claim about the emitted-API projection, not the compiled
artifact. BCV's JVM ABI dump will show `Model.Companion.serializer()`.

`GeneratedProtocolGlueVisibilityTest` will land with the implementation as a permanent regression guard. Using
`EmittedApiProjection`, it will assert both halves of the contract: protocol glue is internal and unreachable from
the emitted public API, while SDK types, case classes, `SdkUnknown`, `fromValue()`, `build()`, exceptions, and
views remain public.

`CodecPartitioningTest` currently contains literal `public object` assertions for form and multipart codec objects.
Those assertions will be updated to require `internal` visibility while preserving the test's purpose: partitioning
must keep the codec objects on the outer codecs holder rather than moving them into a private partition.

## Rejected alternatives

**Leave the declarations public and document them.** "Public API by accident is still a contract" is rejected.
No deliberate API decision offered these implementation details as a supported dependency surface.

**Gate the declarations with `@RequiresOptIn`.** Rejected because opt-in is consent, not a boundary. The generator
needs freedom to restructure protocol glue, not a population of consenting dependents.

**Nest interface serializers in companion objects.** Rejected because `interface X { companion object { internal
object Serializer } }` is legal Kotlin, but the `X.Serializer` shorthand does not resolve: only the longer
`X.Companion.Serializer` does. This alternative requires longer references everywhere it is used and adds companions
to declarations that previously lacked them, for no benefit over the chosen top-level internal-object form.

## Consequences

- This is an intentional breaking change made before the first publication of generated SDKs.
- The compatibility report's `kotlinApi` layer must name exactly these removals.
- Regeneration moves the complete generated-corpus trees.
- In the supported Gradle-plugin path, generated sources are added as a `srcDir` of the consumer's own module (see
  `SdkGenPlugin.kt:160-176`), so `internal` visibility does not hide the glue from that consumer's handwritten code
  in the same module. The flip removes the internal glue from the emitted-API projection and the BCV/ABI
  compatibility surface, while hiding it from downstream or dependent modules and wrapping libraries built on top
  of the generated SDK module. The compiler-synthesized `Model.Companion.serializer()` remains visible in the JVM
  ABI dump as described above.

## Re-evaluation trigger

A future split that compiles generated output into separately published artifacts breaks the single-module premise
of this decision. It requires a new ADR before implementation.

# ADR 0019: Derive the `kotlinApi` compatibility layer from a staged emitted-API projection

## Status

Accepted. Amends the "Evidence sources" section of [ADR 0013](0013-five-layer-compatibility-reports.md).

## Context

ADR 0013 made `kotlinApiSha256` — a digest recorded in the generation manifest — the entire evidence source
for the compatibility report's `kotlinApi` layer. That digest is computed by `KotlinApiProjectionDigest` over
the **declaration model**, which is upstream of emission.

The consequence is not subtle. A digest taken before emission cannot observe an API change that emission
itself introduces. ADR 0015's first partitioning attempt moved nested `public object <Op>FormCodec`
declarations inside `private object Partition<N>` holders, deleting 518 public symbols from the generated
API. `kotlinApiSha256` was byte-identical across both that regression and its repair. The layer named
"kotlinApi" was structurally incapable of failing for a change to the Kotlin API.

A second defect compounded it. `CompatibilityReport` fabricated a single declaration named
`manifest.KotlinApi` whose *type parameter list* was the digest string, and handed that to the classifier as
if it were a projection. Because the fake subject existed on both sides of every comparison, the classifier's
`before == null` branch never fired, and **every** digest delta reported as exactly one confident `breaking`
change. A purely additive SDK change and a genuinely breaking one produced identical output, and
`deriveAggregateOutcome` returned `changed` rather than `incomplete` — so the report read as a verdict where
there was no evidence at all.

## Decision

**Build the projection from emitted output, and stage it as evidence rather than publishing it.**

`EmittedApiProjection` walks the KotlinPoet `FileSpec` tree that `EmissionContext` is about to render and
produces a canonical, sorted, KDoc-free inventory of the public API. Two rules make it able to see what the
previous check could not:

- **Effective visibility.** Descent stops at the first non-public type, because a `public` member of a
  `private` enclosing type is not reachable. This is precisely the ADR 0015 defect class. A check reading each
  declaration's own modifiers — as the earlier `^  public (const )?val` grep did — reports the partitioned
  codecs as still public, which is why that regression shipped.
- **Top-level members.** Public top-level properties and functions compile into a synthetic `<FileName>Kt`
  facade and are projected under that qualified name. The generated SDK has at least one that matters:
  `SdkJson` is emitted as a top-level `public val`. A projection walking only nested types would drop it, and
  a change to it would be invisible.

`EmittedSources` returns the projection alongside the rendered files, so an emitter cannot produce sources
without also producing the projection describing them.

**The projection is staged, not published.** `sdkgen generate --kotlin-api-projection <path>` writes it beside
the run; `sdkgen compat --kotlin-api-from/--kotlin-api-to` consumes it. This is the same treatment ADR 0013
already gives the two other layers a manifest cannot establish: the parity behavior ledger and the staged ABI
dumps are both passed by flag and deliberately never committed. With the flags omitted the layer is
`unavailable`, which is the honest answer and which ADR 0013's fail-closed invariant already handles.

**The classifier reasons over typed values.** `classificationFor` no longer answers `breaking` for every
modification:

| Case | Classification | Why |
| --- | --- | --- |
| subject absent before | `additive` | nothing could have referenced it |
| subject absent after | `breaking` | every reference to it is now unresolved |
| property gained a setter | `additive` | a reader of the `val` still compiles |
| property lost its setter | `breaking` | every writer stops compiling |
| property type changed | `breaking` | a property is a read position for every consumer |
| declaration gained a super type | `additive` | no caller referenced it before |
| declaration lost a super type | `breaking` | every upcast to it breaks |
| declaration kind or type parameters changed | `breaking` | every use of the type breaks |
| function fingerprint moved | `breaking` | the canonical subject already carries the parameter list, so the return type, suspend-ness, or type parameters changed |
| super types both gained and lost | `unknown` | neither a provable widening nor a provable narrowing |

`unknown` is the rung that did not exist before. ADR 0013 already defines it as "the classifier could not
establish the required classification evidence", and an `unknown` change forces the aggregate outcome to
`incomplete`. Reporting `unknown` is correct where reporting `breaking` is actively wrong.

`kotlinApiSha256` stays in the manifest as declaration-model evidence. It simply stops feeding the `kotlinApi`
layer, so it can no longer masquerade as emitted-API evidence.

## Rejected alternatives

**Publish the projection into the generated output tree as a manifest-covered sidecar.** This was the original
plan. It is defensible — the projection would then be covered by the manifest's own digest list, and `compat`
would need no extra flags. It was rejected on cost and on fit. A new evidence dimension in the manifest
requires a `schemaVersion` bump under ADR 0013's own writer/reader rule, which moves every corpus manifest;
concretely that is regeneration of GitHub (7,169 files) and Stripe (10,616 files), new pinned manifest digests
in both consumer conformance tests, and lock-file churn — roughly 17,785 files moved for a document no
consumer compiles. It also fits badly: the projection is compatibility evidence, not generated SDK source, and
publishing it puts a second copy of the emitted API underneath the digest of the thing it describes.

**Keep `kotlinApiSha256` and downgrade the layer to permanently `unavailable`.** Honest, and a one-line
change. Rejected because ADR 0013 lists `kotlinApi` as one of five independent layers and a permanently
unavailable layer makes every report `incomplete` forever, which trains readers to ignore the field. The
evidence is cheap to produce correctly; there is no reason to give up on it.

**Use the BCV JVM ABI dumps as the only Kotlin API evidence.** Rejected because they require staged published
artifacts and therefore cannot run pre-publication, which is when a compatibility report is most useful. They
also cover only the JVM target. The `abi` layer already carries that evidence; duplicating it into `kotlinApi`
would collapse two independent layers into one.

## Consequences

- No corpus regeneration, no manifest `schemaVersion` bump, no pinned-digest or lock-file churn.
- `compat` invocations that want the `kotlinApi` layer must stage a projection from each side. The layer is
  `unavailable` — not silently `unchanged` — when they do not.
- The projection is a versioned artifact (`kotlin-public-api/v2`). It carries the declaration-model digest and
  complete generated-file `(path, sha256)` set. `KotlinApiProjectionReader` reads the bytes once, validates the
  strict schema, and rejects evidence that does not match the corresponding compatibility manifest.
- Its signatures include effective visibility, primary and implicit constructors, constructor defaults and
  varargs, extension receivers, API-significant type modifiers, and generic bounds and variance.
- `KotlinEmitter` now returns `EmittedSources` rather than a bare file list. This is a mechanical change at
  every call site and makes it impossible to emit without projecting.

## Re-evaluation trigger

If a consumer ever needs to verify the emitted API of a *published* SDK it did not itself generate, staging
stops being sufficient and the sidecar alternative above should be revisited — with the corpus-regeneration
cost paid deliberately rather than as a side effect.

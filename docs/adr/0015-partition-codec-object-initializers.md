# ADR 0015: Partition a large client's codecs object across nested initializer holders

## Status

Accepted for the pre-1.0 generated API.

## Context

Every operation client emits a companion `object <Name>Codecs` holding, per operation, the media-type codecs
and the `MediaTypeCodecRegistry` values the client's request path reads. Each of those is a stored `val`, and
Kotlin assigns every non-`const` property of an `object` in that object's `<clinit>`.

The JVM caps a single method's bytecode at 65535 bytes (JVMS §4.9.1). A codecs object therefore has a hard
ceiling on how many operations one client may contain — a ceiling nothing in the generator acknowledged, and
one that scales with operation count rather than with anything a spec author controls.

The Stripe corpus crossed it. After ADR-0014 reclaimed 93 previously-excluded operations, the corpus went from
426 to 519 generated operations and stopped compiling:

```
e: java.lang.RuntimeException: Error generating class file .../v1/V1Client.kt:
   Method too large: com/nabobery/sdkgen/generated/stripe/v1/V1Codecs.<clinit> ()V
```

`V1Codecs` held 3,116 stored properties. The 426-operation corpus had compiled, so this was a pre-existing
emitter ceiling that ADR-0014 crossed, not one it introduced.

Stripe reaches a single 519-operation client because it declares **no tags at all** (all 587 operations report
`<none>`), so the corpus's `resourceGrouping: tags` setting degenerates to one group and T3's client
partitioning is a no-op. That degeneration is a real and separate problem — a spec with no tags gets one
enormous client class — but it is a *grouping* decision that changes generated class names, package layout,
and every consumer import. It is not this ADR's subject, and fixing the compile ceiling by changing the public
API would be the wrong lever: a client with 519 operations should compile whether or not the grouping is good.

## Decision

When a client's codecs object would hold more than **400 stored (non-`const`) properties**, those properties
move into nested `private object Partition<N>` holders, each with its own `<clinit>`, and the public ones are
re-exposed from the outer object as forwarding accessors:

```kotlin
public object V1Codecs {
  public const val GETACCOUNTS_RESPONSE_CODEC_ID: String = "GetAccounts.response"

  public object PostAccountsFormCodec : MediaTypeCodec<JsonObject?> { /* ... */ }

  private object Partition0 {
    private val getAccountsResponseCodec: MediaTypeCodec<Account> =
        KotlinxSerializationCodec(V1Codecs.GETACCOUNTS_RESPONSE_CODEC_ID, Account.Serializer, SdkJson)
    public val getAccountsResponseCodecRegistry: MediaTypeCodecRegistry<Account> =
        MediaTypeCodecRegistry.of(getAccountsResponseCodec)
  }

  public val getAccountsResponseCodecRegistry: MediaTypeCodecRegistry<Account>
    get() = Partition0.getAccountsResponseCodecRegistry
}
```

Three consequences are load-bearing:

- **Only stored properties move.** `const val` codec ids and the nested `public object <Op>FormCodec` /
  `<Op>MultipartCodec` declarations stay on the codecs object. Neither costs `<clinit>` bytecode — a constant
  is inlined, and a nested `object` initializes lazily in its own `<clinit>` — and both are public generated
  API. A partition reaches them qualified (`V1Codecs.PostAccountsFormCodec`).
- **The public surface is unchanged, and that is tested at the level where it can break.** A public member of
  a `private object` is not reachable: `private` on the enclosing scope wins. So the guard must inventory
  public *nested types* as well as public properties. `CodecPartitioningTest` does both, and
  `partitioningKeepsPublicNestedCodecObjectsReachable` pins the specific case.
- **Partitions are bounded by stored-property count, not operation count.** One operation emits an unbounded
  number of stored properties — two per typed response alternative — so an operation-count bound would not
  bound initializer size at all.

Below the bound the emitter is byte-for-byte unchanged, so small SDKs pay no indirection and no existing
golden fixture moves.

## Why 400 stored properties

The measured failure was ~3,116 assignments in one `<clinit>` exceeding 65535 bytes, so more than 21 bytes per
assignment. Each assignment is a constructor call with a handful of arguments — on the order of 30 bytes — so
400 assignments is roughly 12 KB, a five-fold margin. Bounding the count bounds the initializer precisely
because each individual assignment's size is itself bounded and small.

One residual case is **not** structurally bounded: a single operation declaring more than 400 stored properties
cannot be split, because the private codec that a public registry wraps must remain its sibling. That needs on
the order of two thousand response alternatives on one operation, and no corpus approaches it. This is a known
gap, not a claim of universal safety.

The cost of the margin is one extra nesting level and one accessor per public member on clients above it.

## Alternatives considered

**Fix the grouping instead (fall back to path segments when a spec has no tags).** This is worth doing on its
own merits, and Stripe is the case that argues for it. But it changes the generated public API, it does not
help a genuinely large single tag (GitHub's `repos` tag has 393 operations and `actions` 370, both already
within a factor of the ceiling), and it leaves the ceiling itself undocumented and unenforced. Tracked
separately; not a substitute for this.

**Make the codec properties `by lazy`.** Each delegate is still an object allocated and assigned in `<clinit>`,
so the initializer keeps growing — this trades a smaller constant factor for the same asymptote, and adds a
per-access synchronization cost to every operation.

**Make them computed `get()` properties returning a fresh codec.** Zero `<clinit>` cost, but codecs stop being
singletons: every call allocates, and registry identity — which the executor compares — stops holding.

**Split the client class itself above a size threshold.** Same public-API objection as the grouping change,
with none of its design justification.

## Re-evaluation triggers

- A corpus client exceeding roughly 10,000 operations, where the *number of partitions* (not their contents)
  would begin to matter.
- Any other generated `object` reported as exceeding a JVM method or class limit — the fix here is specific to
  the codecs object and does not generalize on its own.
- Adoption of path-segment grouping fallback, which would reduce how often the threshold is crossed but not
  remove the need for it.

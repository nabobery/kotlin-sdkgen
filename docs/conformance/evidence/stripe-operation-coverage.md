# Stripe operation coverage — current boundary

**Purpose:** state, in one place and in present tense, exactly how much of Stripe's public API surface the
generated SDK covers as of this document, and reproduce every number so a reader can verify it without
trusting this page.

**Status:** current, as of ADR-0014 (2026-07-28). Supersedes this document's earlier parity revision, which
reported 426/161 (72.6%/27.4%). That revision is superseded on two counts — the numbers **and the stated
cause** — see [What the earlier revision got wrong](#what-the-earlier-revision-got-wrong).

The versioned [`stripe-waivers.tsv`](stripe-waivers.tsv) and
[`stripe-exclusion-delta.tsv`](stripe-exclusion-delta.tsv) inventories preserve the prior 157 + 4 = 161
boundary for comparison.

## The headline numbers

The pinned Stripe OpenAPI snapshot (`conformance/stripe/openapi.json`, SHA-256
`e24a26de4188fd64dec4c043d5d3726277fdcb07556a493ea481c305b0a223d8`) declares **587 operations**. Of those:

|                                             | Operations | Share of 587 |
| ------------------------------------------- | ---------: | -----------: |
| **Generated** (present in the typed client) |    **519** |    **88.4%** |
| **Excluded** (absent from the typed client) |     **68** |    **11.6%** |

The excluded 68 break down into three categories:

| Category                                              | Operations | Share of 587 | What it means                                                                                                                                                                                                                                                              |
| ----------------------------------------------------- | ---------: | -----------: | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `form-composition`                                    |         58 |         9.9% | The operation's form body is a union (`anyOf`) of shapes whose JSON wire kinds overlap, so the encoder cannot tell which branch a caller's value belongs to without guessing.                                                                                              |
| `form-object-no-declared-shape`                       |          6 |         1.0% | A nested form object declares no properties _and_ omits `additionalProperties`, so the source states no shape for it at all. Unlike a JSON body, which can degrade to `JsonObject`, a form body has no primitive for serializing an undeclared shape as `key=value` pairs. |
| `parameter-deep-object-nonprimitive-{array,property}` |          4 |         0.7% | A `deepObject`-style query parameter contains a nested array or property whose own schema is itself an object/array rather than a primitive scalar, which the bracket-indexed encoding contract does not cover.                                                            |
| **Total excluded**                                    |     **68** |    **11.6%** |                                                                                                                                                                                                                                                                            |

58 + 6 + 4 = 68, and 587 − 68 = 519. Reproduction commands are in [How to reproduce these
counts](#how-to-reproduce-these-counts) below.

### Why `form-composition` grew from 9 to 58

ADR-0014 did not break 49 operations. Those 49 always had an overlapping-`anyOf` form body; they were
previously reported under the stricter `additionalProperties` rejection, which fired first and masked them.
Removing that rejection let projection proceed far enough to reach the real blocker.

This is asserted, not asserted-by-hand: `StripeConformanceBlockerInventoryTest` checks that the current
excluded symbol set is a **subset** of the historical 161, so the change can only ever remove exclusions,
never add one. If any operation that generated before became blocked, that test fails.

## What "excluded" means

**An excluded operation is absent from the generated client. It is not present in a degraded or partially
typed form, and it is not present with an escape hatch such as `Map<String, Any>`.** There is no method, no
request builder, and no response type for it anywhere in the generated source tree. A consumer who needs that
operation cannot call it through this SDK at all — not today, not with a workaround, not by dropping to a
less-typed variant. The exclusion is enforced by `GenerationPipeline.generate` failing closed on every
unmatched blocker: the generator will not silently ignore the shape and emit something approximate.

## Not operation-equivalent to `stripe-java`

This SDK is **not operation-equivalent to `stripe-java`** or to Stripe's other official SDKs. Coverage here is
an operation count, not behavioral equivalence: an operation being present says nothing about whether its
semantics match another client's. Those SDKs also pair their typed parameter classes with an `extraParams`
escape hatch (`Map<String, Object>`) that this project does not ship. A consumer evaluating this SDK as a
`stripe-java` replacement should expect roughly one operation in nine to be unavailable, and should verify
behavior per operation rather than inferring it from the coverage figure.

## Why `Map<String, Any>` stays prohibited

`Map<String, Any>` (or `Any`/`@Suppress("UNCHECKED_CAST")` more generally) in a public generated signature is
listed under this project's anti-patterns in `AGENTS.md`: "No `as any` / `@Suppress("UNCHECKED_CAST")` -
strict typing required."

**ADR-0014 did not weaken this.** It reclaimed 93 operations without introducing a single untyped map, because
those operations never needed one: their schemas declare a complete, fixed property set and simply omit the
`additionalProperties` keyword. The generator now reads an omitted keyword as "the source said nothing" rather
than "the keys are open" — which is what the JSON-body path and the `deepObject` parameter path already did.

What remains prohibited, and therefore still excluded:

- `additionalProperties: true` — a genuinely open, untyped map. Representing it needs `Map<String, Any>` or a
  form-flattening encoder for arbitrary `JsonElement` values that the runtime does not have.
- a typed catch-all mixed with fixed properties — same problem, plus ambiguity about which keys are which.
- an object declaring no properties at all (the 6 `form-object-no-declared-shape` exclusions above).

Each carries its own diagnostic and its own reason hash, so they are waivable and countable independently
rather than collapsed into one bucket.

Where the generator _can_ express dynamic keys with a real type — a typed `Map<String, T>` for a schema whose
additional-property value has a declared shape, as with Stripe's `metadata` — it already does, and ADR-0014
leaves that path untouched.

## The typed escape hatch is deferred, not abandoned

ADR-0014 considered and deliberately declined to add an `extraParams`-style typed escape hatch
(`Map<String, JsonElement>` alongside the fixed fields). It would require a generic form-flattening encoder
for nested maps and lists in bracket notation, which does not exist in the runtime, and **no schema in either
corpus currently needs it** — every remaining exclusion fails for a different reason.

ADR-0014 records explicit re-evaluation triggers: a corpus schema appearing with `additionalProperties: true`
in a form body, a typed catch-all mixed with fixed properties, or a reported case of a server accepting a key
the closed projection cannot send.

## How to reproduce these counts

All counts below come from files committed at this HEAD; no code was modified to produce them.

**1. Total operations in the pinned spec (587):**

```bash
python3 -c "
import json
spec = json.load(open('conformance/stripe/openapi.json'))
methods = {'get','post','put','patch','delete','head','options','trace'}
count = sum(1 for item in spec['paths'].values() for k in item if k in methods)
print('paths:', len(spec['paths']))
print('operations:', count)
"
```

Expect `paths: 414` and `operations: 587`. Confirm the pinned bytes first:

```bash
shasum -a 256 conformance/stripe/openapi.json
# e24a26de4188fd64dec4c043d5d3726277fdcb07556a493ea481c305b0a223d8
```

**2. The current excluded set, by category (68):**

The authoritative source is the pipeline itself, not a checked-in TSV:

```bash
./gradlew --no-daemon :generator:engine:test --tests '*StripeConformanceBlockerInventoryTest*'
```

`StripeConformanceBlockerInventoryTest` asserts the exact category map
(`form-composition` 58, `form-object-no-declared-shape` 6,
`parameter-deep-object-nonprimitive-arrays` 2, `parameter-deep-object-nonprimitive-properties` 2) and the
68 total. It fails if any of them drifts, so a stale figure in this document cannot survive a green build.

The waiver ledger in `conformance/stripe/sdkgen.yaml` must cover exactly those 68:

```bash
grep -c "  - id: " conformance/stripe/sdkgen.yaml   # 68
```

`StripeConformanceGenerationTest.currentWaiverLedgerExactlyCoversCurrentStripeExclusions` asserts set
equality in both directions — no stale waiver, no uncovered exclusion.

**3. The historical historical/parity records (unchanged):**

```bash
awk -F'\t' 'NR>1{print $2}' docs/conformance/evidence/stripe-waivers.tsv | sort -u | wc -l   # 157
awk -F'\t' 'NR>1' docs/conformance/evidence/stripe-exclusion-delta.tsv | wc -l               # 4
```

These are dated records of the boundary at T11 and parity. They are deliberately not regenerated.

**4. No operation regressed:**

The current excluded symbol set must be a subset of the historical 161. This is asserted in
`StripeConformanceBlockerInventoryTest`, which also pins the reclaimed count at 93.

**5. The arithmetic:**

```bash
python3 -c "
print(58+6+4, '== 68')
print(587-68, '== 519')
print(161-68, '== 93 reclaimed')
print(round(519/587*100,1), '%% generated')
print(round(68/587*100,1),  '%% excluded')
"
```

## What the earlier revision got wrong

This document's parity revision reported 426/161 (72.6%/27.4%) and attributed the largest category, 148
`dynamic-object-keys` operations, to form bodies with "a property that accepts arbitrary/open keys."

**That attribution was factually wrong, not merely superseded.** Resolving all 148 blocked pointers against
`conformance/stripe/openapi.json` found that **none** of them declared open keys: every one declared a fixed,
named property set and simply omitted the `additionalProperties` keyword. Stripe's specification contains 587
occurrences of `additionalProperties: false` and **zero** of `additionalProperties: true`.

The exclusion was caused by `StandardProjection.validateClosedFormObject` demanding a literal
`additionalProperties: false` on every form object — a keyword essentially no real specification writes on
every nested object — while the JSON-body path and the `deepObject` parameter path in the same file already
treated an omitted keyword as closed. It was an unexamined asymmetry inside this generator, not a property of
Stripe's API and not a deliberate contract stance about dynamic keys.

The earlier revision also stated the boundary was "a deliberate contract stance, not an oversight ... made
with the cost fully known." That framing was mistaken: the cost was real but the cause was misdiagnosed, so
the tradeoff being described was not the one actually being made.

ADR-0014 corrects the rule. The 93 reclaimed operations were never a `Map<String, Any>` question.

The 25.2% figure carried in the release-readiness waiver ledger and the 27.4% figure in the earlier revision of this
document are both superseded. Neither should be quoted as the current boundary; the current figure is
**11.6% excluded (68/587)**.

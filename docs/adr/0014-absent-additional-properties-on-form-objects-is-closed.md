# ADR 0014: Treat an absent `additionalProperties` on a form object with declared properties as closed

## Status

Accepted for the pre-1.0 generated API.

## Context

`StandardProjection.validateClosedFormObject` required `AdditionalPropertiesModel.Closed` — a literal
`additionalProperties: false` in the source — for every form-urlencoded object, at both of its call sites: the
top-level form request body and each nested form object. Any other state, including an **absent** keyword,
failed the whole operation with `form object must declare additionalProperties: false; dynamic form keys are
unsupported`.

That diagnostic named a condition that does not occur in the corpus it excluded. Resolving all 148
`dynamic-object-keys` blockers in `docs/conformance/evidence/stripe-blockers.tsv` against
`conformance/stripe/openapi.json`:

| Resolved shape | Count |
| --- | ---: |
| omits `additionalProperties`, **declares `properties`** | **148** |
| `additionalProperties: true` (`FreeForm`) | 0 |
| `additionalProperties: <schema>` (`Typed`) | 0 |
| `additionalProperties: false` (`Closed`) | 0 |

Stripe's specification contains 587 occurrences of `additionalProperties: false` and **zero** occurrences of
`additionalProperties: true`. A representative excluded schema, `collection_options` on `/v1/account_links`,
declares two enum properties and no dynamic keys of any kind:

```json
{ "type": "object", "title": "collection_options_params",
  "properties": { "fields": {"enum": ["currently_due","eventually_due"], "type": "string"},
                  "future_requirements": {"enum": ["include","omit"], "type": "string"} } }
```

`SchemaAdapter.adaptAdditionalProperties` returns `null` when the keyword is absent, and
`SemanticModel.AdditionalPropertiesModel` documents that `null` is a fourth state distinct from
`Closed`/`FreeForm`/`Typed`: the source said nothing. The form rule collapsed "said nothing" into "open".

Two other object-shape decision points in this generator had already made the opposite choice:

- `StandardProjection.projectModel` (the JSON/model path) emits a catch-all field only when
  `properties.isNotEmpty() && additionalPropertiesModel != null && additionalPropertiesModel !is Closed`. An
  absent keyword with declared properties yields a **closed** data class. This is how both corpora's JSON
  models are generated today.
- `projectDeepObjectParameterAdditionalProperties` matches `null, is AdditionalPropertiesModel.Closed -> null`
  — treating absent identically to explicit `false` for `deepObject` query parameters, the closest wire-format
  sibling of form bodies.

So the form path was the sole outlier, and the cost of that asymmetry was 148 of Stripe's 587 operations —
25.2% of the surface — absent from the typed client.

The user-visible risk of closing is bounded by the server. Stripe's API rejects undocumented parameters on GA
endpoints with `400 Received unknown parameter`, so a caller could not successfully send an extra key into
these structures regardless of what this generator emits; and genuinely undocumented beta fields are by
construction absent from the public specification this generator consumes. Stripe's own reference client,
`stripe-java`, generates these same schemas as closed typed structs (`AccountLinkCreateParams.CollectionOptions`
exposes exactly `fields` and `futureRequirements`) paired with a separate, explicitly-labelled `extraParams`
escape hatch — not as open bags.

Against that, refusing the operation entirely denies a user the **documented** fields as well. Omitting the
method is the strictly worse failure.

## Decision

For form-urlencoded objects, at both call sites, branch on all four states explicitly with a distinct
diagnostic for each rejected case. No silent default.

- **`Closed`** — accepted, unchanged.
- **absent (`null`) with a non-empty flattened property set** — accepted as closed, matching `projectModel`
  and the `deepObject` parameter path. This is the change.
- **absent (`null`) with no declared properties** — **rejected**. An object with no declared shape has no form
  wire representation. Unlike the JSON path, which can degrade to `JsonObject`, a form body has no primitive
  for serializing an arbitrary shape as `key=value` pairs without inventing an encoding.
- **`FreeForm` (`additionalProperties: true`)** — **rejected**, unchanged. Representing it requires either
  `Map<String, Any>`, which this project prohibits, or a `Map<String, JsonElement>` catch-all plus a generic
  JsonElement-to-form flattening encoder that the runtime does not have.
- **`Typed` mixed with a non-empty property set** — **rejected**, unchanged. A `Typed` additionalProperties
  with *no* fixed properties continues to project to `FormValueDeclaration.Map`, which is how Stripe's
  `metadata` already works and must keep working.

Each rejected case gets its own message rather than one shared string, so waiver tooling can distinguish them
by reason hash.

Property emptiness is judged on the **flattened** property set (`context.flattenObjectProperties`), the same
definition `projectModel` uses, so `allOf` composition is accounted for identically in both paths.

No change is required to `DeclarationModel` or `OperationEmitter`: `FormValueDeclaration.Object` emission is
already exercised by existing `additionalProperties: false` fixtures.

## Consequences

- Approximately 148 Stripe operations become generatable. The exact figure must be **re-derived from the
  pipeline**, never assumed from this ADR; `StripeConformanceBlockerInventoryTest` freezes the category counts
  and must be updated deliberately.
- `Map<String, Any>` remains prohibited. This decision introduces no untyped map and no new runtime behavior.
- A form object that declares properties and omits `additionalProperties` will not transmit keys outside its
  declared set. For a server that silently accepts extra keys, that is a real, accepted limitation; it is the
  same limitation every JSON model in this generator already has.
- The three exclusion classes this ADR does **not** address are unchanged: 9 `form-composition` blockers,
  4 structured deep-object parameters, and any genuinely propertyless or mixed-`Typed` form object.
- Prior project documentation describing these 148 schemas as objects that "accept arbitrary/open keys" is
  **factually wrong**, not merely superseded, and is corrected alongside this change. The historical operation
  counts in T11 and parity evidence remain as dated historical records.

## Alternatives considered

**Keep the strict rule and publish the boundary as policy.** Rejected. The rule demanded a keyword that
essentially no real specification writes on every nested object, and it contradicted two established paths in
this same generator. Publishing it as policy would have documented an unexamined asymmetry as a deliberate
contract.

**Add a typed escape hatch now** — a `Map<String, JsonElement>` catch-all alongside the fixed fields, following
`stripe-java`'s `extraParams`. Deferred, not ruled out. It requires a generic form-flattening encoder for
nested maps and lists in bracket notation, which the runtime does not have, and **no schema in either corpus
needs it**: all 148 are flat, closed, fully-documented option structs. Building it now would be speculative
complexity against zero evidence of need.

## Re-evaluation triggers

Revisit this decision if any of the following appears:

- a corpus schema with `additionalProperties: true` in a form body;
- a corpus schema mixing a `Typed` additionalProperties with fixed properties in a form body;
- a reported case of a server accepting a documented-in-practice key that the closed projection cannot send.

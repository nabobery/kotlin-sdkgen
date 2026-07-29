# ADR 0016: Support `oneOf` over primitive scalars and arrays in path and query parameters

## Status

Accepted for the pre-1.0 generated API.

## Context

`StandardProjection.parameterSerialization` accepted only two parameter shapes: a primitive scalar, or an
array of primitive scalars. Anything else failed the whole operation. That rejected 18 GitHub operations whose
parameters use `oneOf` over primitives, and left the GitHub corpus unable to regenerate at all (L13), which in
turn blocked L10 and kept L3 open for that corpus.

The 18 are two idioms, and every one of them is a `oneOf` whose branches are all primitive:

| Parameter | Location | Schema | Operations |
| --- | --- | --- | ---: |
| `workflow-id` | path | `oneOf: [integer, string]` | 6 |
| `pages-deployment-id` | path | `oneOf: [integer, string]` | 2 |
| `fields` | query | `oneOf: [string, array<string>]` | 6 |
| `dependabot-alert-*-has` | query | `oneOf: [string, array<string enum>]` | 3 |
| `cwes` / `affects` | query | `oneOf: [string, array<string>]` | 2 |

"Pass an ID **or** a name" in paths, and "one value **or** a list" in queries.

Two facts make this tractable rather than a deep design problem.

**The generated type already exists.** `projectOneOf` routes a `oneOf` whose branches are not object-like to
`projectPrimitiveOneOf`, which emits a sealed union with one case per branch. `projectParameter` already takes
the parameter's Kotlin type from `context.typeFor(schemaRef, …)`, so these parameters were already *typed*
correctly. Only the serialization contract rejected them. The question was never "what Kotlin type is a path
parameter that is `integer | string`" — the generator had already answered that.

**The union is not observable on the wire.** A path segment is text (RFC 3986 §3.3); an `integer` branch and a
`string` branch produce the same segment. A query parameter with `style: form, explode: true` is a repeated
key; a scalar branch and a one-element array branch produce the same query string. So a parameter whose
branches are all primitive scalars or arrays of primitive scalars collapses to "a list of wire strings"
regardless of which branch the caller chose.

## Decision

A parameter schema that is a single `oneOf` whose every non-null branch is a primitive scalar or an array of
primitive scalars projects to `ParameterSerialization.PrimitiveUnion`, in **query `form`** position with
`explode: true`.

In **path** position the same rule applies, **restricted to unions whose branches are all scalars.** A union
carrying an array branch is rejected there. See "Array branches are query-only" below; this restriction was
added on 2026-07-29, after the original decision permitted a shape the runtime cannot render.

Its wire values come from the `raw: JsonElement` that every generated primitive-union case retains — a
`JsonPrimitive` contributes one value (`content`, the unquoted lexical form), a `JsonArray` one per element —
via the runtime function `sdkPrimitiveUnionParameterValues`.

Three consequences are load-bearing:

- **No branch narrowing.** The caller keeps the full union. `dependabot-alert-has` has a free-form `string`
  branch and an enum-constrained `array` branch; projecting to `List<Enum>` would have silently deleted the
  string branch, and projecting to `List<String>` would have deleted the enum. The sealed union keeps both.
- **Projecting from `raw`, not from a `when` over cases.** The generator does not need to know case names, so
  it cannot drift from the names `projectPrimitiveOneOf` allocates. `raw` is already documented on the union
  as "the serialization authority", which is exactly the role it plays here. One runtime function covers every
  primitive union, present and future.
- **`explode=false` is still rejected in query position.** A comma-joined union is ambiguous: a scalar branch
  whose value contains a comma is indistinguishable from a two-element array branch. The diagnostic says so.

Headers are deliberately **not** included. A header parameter is comma-joined by contract
(`style: simple, explode: false`), so it has the same ambiguity, and no corpus needs it.

## Array branches are query-only

The wire-collapse premise above has two halves, and only one of them reaches paths.

A query parameter with `style: form, explode: true` is a **repeated key**, so a scalar branch and an array
branch both serialize into it — one `?k=v` or several. That is the case the table above actually exercises:
every array branch in the corpus (`fields`, `dependabot-alert-*-has`, `cwes`, `affects`) is a query parameter.
A path segment is a **single value**. `RequestParameters.renderPathTemplate` requires exactly one, and
`sdkPrimitiveUnionParameterValues` expands a `JsonArray` branch to zero or many. The two path unions in the
corpus (`workflow-id`, `pages-deployment-id`) are `oneOf: [integer, string]` and are unaffected.

The Decision as originally written said "path and query `form`" for both branch shapes. Nothing justified the
array half of that for paths, and nothing in the corpus needed it, but the predicate permitted it: a caller who
selected the array case of such a union got an `IllegalArgumentException` from generated code that compiled
cleanly. Note the asymmetry it created — a bare `type: array` path parameter was already rejected as "only
supports scalar schema"; the identical shape wrapped in a `oneOf` was not.

Rejected alternative: **define a multi-segment serialization for an array branch in a path.** There is no
unambiguous contract to define (is `["a","b"]` one segment `a,b`, or two segments?), OpenAPI does not specify
one, and no corpus asks for it. Narrowing costs nothing today and can be revisited against a real demand.

## What this does not do

It does not make every `oneOf` parameter work. A union with an object or nested-array branch is still
rejected, because those do not collapse to a flat list of strings and would need a serialization contract this
ADR does not define. The predicate is deliberately narrow: `isPrimitiveParameterUnion` requires a *single*
composition, of kind `oneOf`, with no sibling `properties` or `additionalProperties`, and every non-null
branch primitive.

## Alternatives considered

**Add 18 exact-tuple waivers.** This was the standing recommendation, on the grounds that reproducibility is
more urgent than coverage. It restores regeneration immediately at a cost of 18 operations, and it is what
every other corpus omission does. Rejected here because the underlying support turned out to be small — the
types already existed and the wire collapse is a fact about URIs, not a design choice — and waiving would have
frozen a generator limitation into the corpus as though it were a property of GitHub's API. The waiver path
remains correct for shapes this ADR does not cover.

**Project to the array branch's element type as `List<T>`.** Simpler generated signatures, and wire-identical.
Rejected: it narrows. For `dependabot-alert-has` it deletes the free-form `string` branch, and a caller who
needs to send an undocumented value has no way to express it.

**Project path unions to `String`.** Honest about the wire — a path segment is text — but it makes every
caller stringify, and it discards a union the generator already models correctly.

**Emit a `when` over the union's cases in the client.** Equivalent output, but the emitter would have to
reconstruct the case names `projectPrimitiveOneOf` allocates, duplicating an allocation that is free to drift.

## Re-evaluation triggers

- A corpus parameter that is a `oneOf` including an object or nested-array branch, which would need a
  serialization contract this ADR does not define.
- A header parameter needing union support, which would need the comma ambiguity resolved first.
- A corpus path parameter that is a `oneOf` including an array branch, which would need the multi-segment
  serialization contract rejected above.
- Any report of a server distinguishing the branches of such a parameter — that would falsify the wire-collapse
  premise the whole decision rests on.

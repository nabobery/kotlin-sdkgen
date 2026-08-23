# ADR 0021: Strict `allOf` intersection algebra, audited overrides, and request-media variants

## Status

Accepted. Extends [ADR 0003](0003-anyof-raw-preserving-wrapper.md) (union representation) and
[ADR 0012](0012-synthesized-inline-naming-and-optionality-policy.md) (branch naming), and completes the
OpenRouter conformance surface for the 0.3.0 development line.

## Context

Three real-world corpora compose schemas in ways the pre-0.3.0 generator could not project. OpenRouter's
`/messages` and `/responses` operations compose response schemas with `allOf` whose branches redeclare the
same property with different types and nullability; `/audio/transcriptions` declares two incompatible request
schemas (a base64 JSON object vs. a binary multipart part). GitHub's webhook payloads compose base-plus-override
`allOf` pairs. The previous generator refused all of these rather than guess a lossy Kotlin projection, holding
the OpenRouter corpus at 86/89 and keeping a large GitHub waiver ledger.

`allOf` is a logical AND: a value must satisfy every branch simultaneously. The naive fixes — global last-wins
property merge, or a deep-merge heuristic — are unsound. Last-wins silently discards one branch's constraints;
deep-merge invents a shape neither branch declares. Both produce a Kotlin type that does not correspond to the
contract, which is exactly the failure mode the project forbids (`Map<String, Any>`-style escape hatches, guessed
types). The generator needs a projection whose semantics are provable, and an explicit, auditable seam for the
cases where the correct answer is a human contract judgment rather than a mechanical one.

Separately, an operation that accepts more than one request media type cannot be represented by a single request
value when those media types declare incompatible schemas. The generator needs media-specific callable variants
without silently renaming public API or guessing content types at runtime.

## Decision

### 1. Strict intersection algebra for `allOf`

`SchemaIntersectionResolver` resolves duplicate `allOf` properties by a **strict intersection algebra** — a
set-theoretic AND, never a merge-by-overwrite. The resolver is pure and **never synthesizes a schema node**:
every resolved outcome names an existing node (one operand, or a branch reachable from one operand). The
implemented rules (rule ids as recorded in provenance):

- `identical` — structurally equivalent operands (including ref-equal objects under different names);
- `narrow-any` — `X ∧ any = X`;
- `narrow-freeform-object` — named/structured object ∧ free-form `object` → the named object;
- `array-element` — `array<A> ∧ array<B> = array<A∧B>` when the element intersection is one operand's element;
- `format-narrow` — `T(format) ∧ T = T(format)`; two *different* formats on the same base type conflict;
- `format-identical` — same base type and same format → the constraint-dominant operand;
- `integer-number` — `integer ∧ number = integer`;
- `enum-narrow-scalar` — enum/const ∧ compatible plain scalar → the enum/const;
- `enum-intersect` — enum ∧ enum → the operand whose value set is the subset (empty intersection → `Unsupported`);
- `object-subsume` — two structured objects equal up to requiredness and format → the operand that dominates on
  *every* differing location (narrower format, required-er requiredness). Any value-set, nullability, or
  base-type difference — or locations favouring different operands (a true merge) — is `Unsupported`: that is
  the audited-override territory;
- `union-whole` / `union-collapse` — `oneOf`/`anyOf` intersection keeping only compatible branches. Because the
  resolver may not synthesize a union, a union∧union result must be exactly one whole operand's branch set
  (`union-whole`) or collapse to a single surviving branch (`union-collapse`); any other proper subset is
  `Unsupported`.

Every rule retains a node only when that node preserves the other operand's constraints: constraint subsumption
is checked (e.g. `array{maxItems:5} ∧ array` never drops `maxItems`), content encoding/media assertions must
match, array elements require exact AND-composed element nullability, and requiredness is reconciled, never
overwritten. When both branches match, nullability is **commutatively AND-composed**: the result is nullable only
if both branches admit null, and the composition is independent of branch order. The resolver source is the
authoritative statement of these guards.

When no rule covers a pair, the resolver **refuses** (emits `Unsupported`) rather than emit a wrong contract. It
never falls back to last-wins or deep-merge.

There is deliberately **no same-projected-type fast path**: every duplicate `allOf` declaration routes through
the resolver, even when both operands project to the same Kotlin type and nullability, because same-typed
operands can still differ in constraints, content contracts, or compositions, and short-circuiting on the
projected type would make the retained schema node depend on branch order. (An earlier gated bypass of this
kind was removed once the algebra's `object-subsume`, `format-identical`, and path-scoped structural-equality
rules proved every previously bypassed corpus pair strictly — the removal changed no generated code across any
corpus.)

The algebra's proven boundary is a committed evidence artifact:
`docs/conformance/evidence/schema-intersection-proof-table.tsv` — 124 rows (one per direct conflicting `allOf`
property across OpenRouter and GitHub; Stripe contributes no direct-conflict rows). 96 rows resolve strictly; 28
are audited overrides (see below). The table carries a judgment digest (`a6f88879…`) and a mechanism histogram;
both are enforced by `SchemaIntersectionProofTableTest`, and the table is regenerated only under
`-Dprooftable.regen=true` so no judgment can be edited silently. Two GitHub `webhook-status` commit
`author`/`committer` **email** intersections are pinned `RESOLVER_REFUSAL_EXCEPTIONS`: their intersection is
mechanically sound (`string(email)? ∧ string = string(email)`, non-null), but the only email-format node in the
schema graph is nullable and the resolver never synthesizes a node, so forcing that node non-null would be a lie.
The resolver correctly refuses, and the two properties stay soundly blocked and waived rather than forced.

### 2. Audited overrides via `x-sdkgen-allof-resolution`

Where the correct resolution is a contract judgment — GitHub's base-vs-override webhook pairs, where the override
branch redeclares a property as a structurally different object and a literal intersection would require an
out-of-scope distributive object merge — the decision is recorded explicitly, not inferred. The
`x-sdkgen-allof-resolution` overlay extension elects, per schema and per property, a `winningPropertySchemaId`.

This override is checked **before** the strict algebra. It is not a silent fallback: an override that names a
schema or property the pipeline no longer sees, or whose election no longer matches the schema graph, is a
**hard drift error (fail-closed)**, never ignored. This keeps the audit honest — a stale audit fails the build
rather than resolving to a quietly wrong contract. Audit overlays live at
`conformance/{openrouter,github}/overlays/allof-resolution-audit.yaml`.

### 3. Stable identity-addressed branch type names

Synthesized inline schema names — including the types behind `oneOf`/`anyOf` branches — are stable
**identity-addressed names** (for example `InlineChatRequestStopX9225cac3`): the disambiguation suffix is a
SHA-256 tag of the canonical `SchemaId` (its document location), per
[ADR 0012](0012-synthesized-inline-naming-and-optionality-policy.md). Because the identity is derived from the
schema's canonical id rather than mutable content, the generated public API keeps stable names across
regenerations. The audited overrides themselves address differently: an overlay action targets a *source* schema
path, and its election selects the winning branch by `$ref` or by a resolved-content digest
(`inlineSchemaSha256`), which the engine resolves to the winning property schema id. (The generated branch enum
values themselves remain positional `Branch1`/`Branch2`.)

### 4. `stop`-anyOf canonicalization (contract change in 0.3.0)

A degenerate `anyOf` member that carries only `{nullable/type: null}` now canonicalizes into **property
nullability** instead of becoming a `JsonElement?` catch-all branch. The consequences are deliberate and are a
**wire-contract change** for such unions:

- the union becomes a strict two-branch union;
- a payload matching no branch throws the union's `NoMatchException` ("matched 0 branches") rather than being
  silently absorbed by a catch-all;
- an explicit JSON `null` decodes to Kotlin `null`.

This is the ruled-correct behavior. The previous catch-all branch was an accident of legacy null-only handling
(the OpenAPI 3.0-style null-only branch), not a designed extension point, and it masked non-conforming payloads
that the contract does not actually permit.

### 5. Request-media variants and explicit body encodings

An operation with more than one compatible request-media group emits **one callable method per group**. Every
variant carries an **explicit wire-encoding commitment** on its declaration — never inferred from metadata
shape, so a valid zero-property form still encodes as a form and an empty multipart as multipart:

- **JSON** — `application/json`, legacy aliases such as `text/json`, and every `+json` structured syntax:
  a kotlinx-serialization JSON document;
- **TEXT** — `text/*` media whose schema resolves to a string: the string's raw UTF-8 bytes ARE the wire
  document (`text/plain`, `text/x-markdown`, `text/csv`, ...), transmitted via the runtime `RawTextCodec`;
- **BINARY** — a raw byte-stream body under any media type: the stream's bytes transfer verbatim with no
  serialization codec;
- **FORM** — `application/x-www-form-urlencoded` field encoding;
- **MULTIPART** — normalized `multipart/form-data` part encoding.

Any other representation — XML, non-form-data multipart subtypes, a text media over a non-string schema —
**fails closed** with an `UNREPRESENTABLE_OPERATION` diagnostic (waivable like every blocker) rather than
defaulting to a JSON representation the contract does not declare.

Naming is deterministic and never silently renames:

- the normalized JSON variant keeps the **unsuffixed** method name;
- normalized `multipart/form-data` → fixed suffix **`Multipart`**;
- `application/x-www-form-urlencoded` → fixed suffix **`Form`**;
- any other supported media type → a sanitized subtype suffix.

Name reservation is **document-scoped** and committed only on operation success. An intra-operation tie on the
same preferred suffix takes a deterministic fallback suffix so both encodings stay callable under stable names.
Any collision with an **external** reserved name fails closed with `NAME_COLLISION` — there is no silent renaming
of public API. Internal emitter-derived symbols (metadata properties, `WithResponse`/`Pages`/`Items`/`Stream`
members, codec properties, and codec-id constants — whose screaming-snake transform is lossy) are all allocated
through client-wide collision-checked name plans with deterministic disambiguation, so distinct member names can
never emit duplicate declarations. Grouping media types into one variant requires **full codec-metadata
equality** (multipart parts, form fields, and replayability), not merely a shared body type.

### 6. Replayability and streaming across variants

The generator classifies **body replayability** per variant. A request body that resolves to `SdkByteStream`
(any media family), or a multipart whose parts include a stream, is **non-replayable** and is emitted as
`SdkRequestBody.OneShot`; the runtime's `RetryPolicy` refuses to retry a one-shot body after send. Buffered
bodies remain replayable and are therefore *eligible* for retry — the actual retry decision still depends on the
policy's failure classification, connection phase, operation safety, and budget. This preserves the
[ADR 0006](0006-runtime-spi.md)/design-decisions replayability contract per variant rather than per operation.

Every variant of a `STREAMING`-mode operation receives the `Flow` surface; paginated secondaries stay buffered.
A `MIXED`-mode operation (buffered-or-streaming, selected by a request flag) emits its buffered surface per
variant but a single stream entry point bound to the primary body: a mixed operation with more than one
request-media variant cannot yet stream through a secondary encoding. No corpus currently declares that
cross-product; extending the mixed stream entry point per variant is future work.
`x-sdkgen-streaming` is a canonical extension (schema at
`generator/openapi/src/main/resources/schemas/x-sdkgen-streaming.schema.json`; `mode` and `responseContentType`
required, `requestFlag`/`sentinel` optional).

## Consequences

- **Emission consequence — union inspection carriers.** A union's flat inspection data class is emitted while
  its widest synthetic descriptor — the `copy$default` width of receiver + parameters + `Int` mask words +
  `DefaultConstructorMarker` — stays within `INSPECTION_CARRIER_SLOT_THRESHOLD = 200` JVM slots (so the switch
  can happen before the constructor itself reaches 200 parameters). Beyond that, a no-arg mutable `internal`
  carrier class is emitted instead, because the JVM caps a method descriptor at 255 slots and the widest
  OpenRouter union (`StreamEvents`) would need 388. Functional behavior is identical; only the carrier's internal
  shape changes.
- **OpenRouter surface.** The generator now generates all 89 of 89 operations with zero blockers (direct and
  closure). This is a *generator capability* on the development line; no released Kotlin SDKGen version ships it
  yet (see the OpenRouter corpus README — the corpus is a conformance fixture, not a published SDK). The
  distinction between "the current generator supports the full surface" and "a released Kotlin SDKGen version
  provides it" is deliberate.
- **GitHub.** The audited overlay reclaimed 10 webhook payload schemas (plus 10 inline sub-schemas); the waiver
  ledger shrank from 139 to 119. Separately, the explicit encoding contract fixes a live wire defect:
  `markdown/render-raw`'s `text/plain`/`text/x-markdown` body now transmits the markdown text raw (it was
  previously JSON-quoted, under a codec that could not even be selected for its declared media types).
- **Stripe.** One wire-format correctness fix: the multipart enum `purpose` is now emitted as bare text rather
  than JSON-quoted. Operation coverage is unchanged.
- **Audit integrity hardening.** An accepted `x-sdkgen-allof-resolution` entry binds exactly once or fails
  adaptation (a validated override can never silently do nothing); `$ref`-sibling digests preserve BOTH a
  shadowed target keyword and its sibling conjunctively, so mutating either always shifts the audit digest;
  canonical extension placement accepts every OpenAPI 3.1 Schema Object location (including callbacks,
  `components.pathItems`, Encoding Object headers, and `contentSchema`); and parity provenance binds each
  corpus's ordered configured overlay set, so an audit-overlay-only edit cannot escape input hashing.
- **Compatibility / future extension.** The audited-override seam and identity-addressed synthesized naming are
  the forward-compatible extension points: new base-vs-override conflicts are resolved by adding an audited
  election, not by loosening the algebra. The stop-anyOf canonicalization is a contract change and must be recorded in the
  compatibility report for affected unions.

## Rejected alternatives

- **Global last-wins property merge.** Rejected: it silently discards the losing branch's constraints, producing a
  Kotlin type that does not correspond to the `allOf` (which is an AND, not a precedence rule).
- **Deep-merge heuristics.** Rejected: recursively merging two structurally different object schemas invents a
  shape neither branch declares and has no sound, provable Kotlin projection. Where a human judges the override
  authoritative, the audited-override seam records that decision explicitly instead.
- **Runtime content-type guessing for request bodies.** Rejected: the generator emits one typed callable per
  media group with deterministic names and fails closed on collisions, rather than inspecting a value at runtime
  to decide how to encode it.

## Deferred (future work)

- **Raw-preserving arbitrary intersections.** Rejected for 0.3.0: audited overrides plus the strict algebra give
  provable semantics, whereas arbitrary raw-schema merging has no sound Kotlin projection.
- **A digest CLI helper** for computing overlay audit digests (today the digest is enforced by the proof-table
  test and regenerated under the `-Dprooftable.regen=true` gate).
- **A per-variant stream entry point for `MIXED`-mode multi-variant operations** (section 6's noted limit).

## Re-evaluation trigger

A corpus that requires distributive object merge for a property the maintainers judge *mechanically* resolvable —
rather than an audited contract judgment — would justify revisiting the algebra's scope gate. Until then, such
cases are resolved by an audited override or stay soundly blocked.

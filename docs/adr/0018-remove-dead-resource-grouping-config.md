# ADR 0018: Remove the `naming.resourceGrouping` configuration option

## Status

Accepted for the pre-1.0 configuration contract. **This is a breaking configuration change**: a
`sdkgen.yaml`/`sdkgen.json` that still declares `naming.resourceGrouping` is now rejected.

## Context

`SdkgenConfigV1Alpha1.naming.resourceGrouping` and its `ResourceGrouping` enum (`tags`, `operation-id`,
`single-client`) were declared, serialized, documented in the JSON Schema, and set in corpus configurations.
**No code ever read them.** `groupKeyFor` has always grouped by an operation's first tag, falling back to a
path segment — unconditionally, regardless of the setting.

A dead option would be merely untidy. This one was worse, because of one line in `CliModule.kt:478`:

```kotlin
configDigest = ConfigDigest.sha256(inputs.config)
```

`ConfigDigest.sha256` serializes the **whole parsed configuration**, so `resourceGrouping` was an input to the
digest recorded in every `v1alpha2` manifest. Changing `tags` to `single-client` therefore:

- produced **byte-identical generated output**, because nothing read the field; and
- produced a **different `configDigest`**, which the five-layer compatibility gate reads as an input change.

The option was inert exactly where it claimed to act, and load-bearing exactly where it claimed nothing. That
is a false signal inside the machinery ADR-0013 built to be trustworthy, which is what makes this worth fixing
rather than leaving.

Earlier internal notes and ADR-0015 described Stripe's single-client degeneration as
"`resourceGrouping: tags` degenerating", which implied the setting was in play. It never was. ADR-0017 fixed
the actual cause (a version-prefixed path fallback) without touching this field.

## Decision

Delete `naming.resourceGrouping` and the `ResourceGrouping` enum.

Grouping remains what it has always been in practice: first tag, else first non-version path segment, else the
default group (ADR-0017).

The removal is deliberately **loud, not silent**. Both decoding paths reject unknown keys —
`ConfigLoader`'s `Json { ignoreUnknownKeys = false }` and `Yaml(YamlConfiguration(strictMode = true))` — and
the JSON Schema sets `additionalProperties: false` on `naming`. A configuration still carrying the key fails
with a diagnostic rather than being quietly ignored.

That choice is the point. A silently ignored key would leave a user believing the option still does something,
which is precisely the failure being removed.
`SchemaValidationTest.removed resourceGrouping is rejected rather than silently ignored` pins both rejections.

## Consequences

- **Any configuration declaring `naming.resourceGrouping` must delete the line.** It is the only migration
  step, and every occurrence in this repository set it to the default `tags`, so no committed configuration
  changed meaning.
- **`configDigest` changes for every corpus**, because the serialized configuration lost a field. That
  cascades into `sdkgen.lock` (which records `configDigest`) and into each corpus manifest, so both corpora
  were regenerated and the consumer manifest pins and `ParityRegistry` input digests updated with it. The
  generated **source** is unaffected.
- The generated SDK's public API does not change.

## Alternatives considered

**Implement the enum.** `single-client` is exactly the pathology ADR-0017 just repaired — one client holding
an entire API — and `operation-id` would emit one client per operation. Neither has a caller. Worse,
implementing it would make correct behaviour opt-in: a specification with no tags would still degenerate
unless someone configured it, which is the failure ADR-0017 exists to prevent. Making the default right is
worth more than making the broken case configurable.

**Keep the field and reject any value but `tags`.** Honest about the one mode that exists, and preserves the
slot for a future grouping policy. Rejected because it keeps a field in the digest that still cannot affect
output, so the digest continues to move for a change that does nothing — a smaller version of the same lie.

**Keep it and exclude it from `configDigest`.** Removes the false signal without the breaking change, but
leaves a documented option that silently does nothing, and adds a special case to a digest whose value comes
from covering the configuration exhaustively.

## Re-evaluation triggers

- A concrete need for a grouping policy that the tag-then-path rule cannot express, which would justify
  reintroducing an option — designed against a real caller rather than speculatively.
- Any other configuration field found to feed `configDigest` without affecting generated output; the same
  argument applies to it.

## Correction (2026-07-30)

The fallback summary in this ADR's Decision section oversimplifies the actual behavior. When every named path
segment is version-shaped, such as an untagged API whose paths are only under `/v1`, the first version segment is
retained as the group rather than falling through to the default group. The default group is used only when the
path has no named segments at all; ADR-0017's Decision section records the precise rule so an untagged
`/v1`-only operation is not mistakenly understood to land in `default`.

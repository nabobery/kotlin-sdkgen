# ADR 0017: Skip API version segments when deriving a resource group from a path

## Status

Accepted for the pre-1.0 generated API. **This is an intentional public API change** for any specification
that declares no tags and versions its paths under a shared prefix.

## Context

T3 partitions a generated SDK into one client per resource, with a root facade exposing each as a lazily
initialized property (`client.accounts.get(…)`). `groupKeyFor` derives the group from an operation's first
tag, and falls back to the first path segment that is not a path parameter.

That fallback was already present. It nevertheless degenerated completely on Stripe:

```
$ python3 -c "…collections.Counter(p.split('/')[1] for p in spec['paths'])"
first segments: [('v1', 414)]
second segments (distinct): 76
```

**Every one of Stripe's 414 paths begins with `/v1`.** Stripe also declares no tags at all, so the fallback
ran, took the first named segment, and returned `v1` for all 587 operations. The result was a single group: one
`V1Client` with 519 operations in a 110,466-line file, one `V1Codecs`, and T3's partitioning reduced to a
no-op. It is also what pushed that codecs object past the JVM `<clinit>` limit (ADR-0015).

Two related corrections to the record, both of which this ADR's earlier framing got wrong:

- **`resourceGrouping` is dead configuration.** `SdkgenConfigV1Alpha1.resourceGrouping` and the
  `ResourceGrouping` enum are declared, serialized, and set in corpus configs — `conformance/stripe/sdkgen.yaml`
  says `resourceGrouping: tags` — but **no code reads them**. Grouping is always tag-then-path. Earlier
  internal descriptions of this limitation said "`resourceGrouping: tags` degenerates", implying the setting
  was in play. It was not. Whether to implement the enum or delete it is a separate decision this ADR does not
  make.
- **The fix was never "add path-segment grouping".** That existed. The defect was narrower: the fallback had
  no notion that a leading version segment is not a resource.

## Decision

When deriving a group from a path, skip segments that name an API version — `v1`, `v2beta`, `2024-01-01` —
and use the first segment that names something else. If every named segment is a version, group by it rather
than lose the path entirely; if there are none, fall back to the default group.

```kotlin
private val API_VERSION_SEGMENT = Regex("^(v\\d+[A-Za-z0-9]*|\\d{4}-\\d{2}-\\d{2})$", RegexOption.IGNORE_CASE)
```

**This is a heuristic, and the regex is deliberately broad.** `groupKeyFor` sees one operation at a time, so
it cannot verify that a matched segment is actually shared by every path — the motivating property is true of
Stripe but is not checked. The regex also matches more than conventional versions: `v1customers` and
`V123reports` match, as does any date-shaped segment whether or not it is a valid date. The trade is
deliberate: a false positive regroups an untagged operation, which is a naming change, while a false negative
leaves an entire API in one client. Nothing here is safe by construction.

**Tags win per operation, not per specification.** An operation that declares a tag is unaffected. An
*untagged* operation inside a specification that declares tags elsewhere still takes this fallback and can
therefore regroup. Verified: GitHub's group-key inventory is byte-identical across the change, and the
OpenRouter, pagination, and streaming fixtures do not move — but that is evidence about these corpora, not a
guarantee about every tagged specification.

## Consequences

**Stripe's generated public API changes shape.** One `V1Client` becomes roughly 76 resource clients reached
through the existing root facade: `stripe.accounts.…` instead of `stripe.v1.…`. Client class names, package
names, and every consumer import change. This is a deliberate break, taken pre-1.0, and it is the outcome T3
was designed to produce in the first place.

The 110,466-line file becomes many small ones, which also removes the pressure that made ADR-0015 necessary
for this corpus — though ADR-0015 stands on its own, since a single well-tagged resource can still be large
(GitHub's `repos` tag has 393 operations and partitions into 4).

## Alternatives considered

**Implement `resourceGrouping` and add a `path-segment` mode.** Larger, and it would make correct behaviour
opt-in — a specification with no tags would still degenerate by default, which is the failure being fixed.
Making the default sensible is worth more than making the broken case configurable.

**Group by the second path segment when the first is shared by all paths.** Equivalent for Stripe, but it
derives the rule from a property of the whole document rather than of the segment, so it would fire on any API
whose paths happen to share a first segment for a real reason (`/api/users`, `/api/orders` — where `api` is
genuinely the common prefix and the grouping *should* be by the second segment anyway, but for a different
reason). Version-shaped is the narrower and more defensible test.

**Leave it, and let consumers live with one enormous client.** This was the standing position, on the grounds
that it changes the public API. It is a real cost, but a 519-operation client in a six-figure-line file is not
a viable SDK, and pre-1.0 is exactly when this break is cheapest.

## Re-evaluation triggers

- A specification with a resource genuinely named `v1`, `v2`, or a date — which this rule would misgroup.
- A decision to implement or delete `resourceGrouping`, which would subsume this fallback.
- Any corpus where skipping the version segment still yields one group, meaning the paths carry no resource
  structure at all.

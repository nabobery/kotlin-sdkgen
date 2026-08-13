# ADR 0003: Represent `anyOf` with a raw-preserving wrapper and lazy typed views

## Status

Accepted.

## Context

JSON Schema `anyOf` is not an exclusive union. A value may match multiple branches, and every successful branch can remain semantically relevant. A generated representation must expose those matches without discarding unknown fields, inventing a misleading primary branch, or allowing typed copies to diverge from serialized data.

Closed `oneOf` has different semantics: exactly one branch must match, and zero or multiple matches are errors.

## Decision

Generate an ordinary reference-class wrapper for each non-discriminated `anyOf` shape.

The wrapper:

- retains the decoded `JsonElement` as the sole serialization authority;
- performs bounded structural inspection during decode;
- rejects only zero-match values;
- records every successful branch in a typed branch-kind set or list;
- exposes one nullable typed accessor per branch;
- decodes and caches each typed branch lazily on first access;
- controls construction so raw JSON and match metadata cannot disagree;
- has no core-model “primary” branch;
- supports explicit wire mutation only by replacing or transforming raw JSON and revalidating all branches, or by generated typed edit operations that rebuild raw JSON without dropping other matches or unknown fields.

This decision promises **lossless JSON value identity with stable key-order re-emission**, not preservation of arbitrary source whitespace or exact original wire bytes.

Continue to generate closed `oneOf` as sealed cases with exactly-one structural matching, typed no-match errors, and typed ambiguity errors.

## Evidence

The bake-off tested seven object payloads plus two mixed primitive/object payloads across three representations:

> Double- and triple-match `anyOf` payloads decoded and round-tripped for every candidate, while the same shapes produced typed `oneOf` ambiguity errors.

The selected wrapper preserved unknown fields and key order while avoiding eager branch decoding:

> For **10,000** triple-match decodes, raw-preserving structural inspection without typed access took **9.115 ms / 912 ns per operation**, compared with **33.700 ms / 3,370 ns per operation** for the eager composite candidate.

The decisive mutation invariant was:

> A detached typed branch copy re-encoded the original retained raw payload; the wrapper has no data-class `copy`, and `withRaw(...)` constructs and validates a fresh wrapper.

The identity boundary was measured explicitly:

> Minified fixture strings re-emitted byte-identically because retained `JsonObject` key iteration order was stable, but insignificant whitespace surrounding tokens was not retained.

The KMP proof compiled common code for JVM and Linux x64, with **12 JVM tests**, **0 failures**, and no forbidden common declarations.

## Consequences

### Positive

- Valid multi-match values remain valid and discoverable.
- Unknown fields and unmatched annotations survive serialization.
- Forwarding or logging a union does not force eager typed allocations.
- The public API does not imply exclusivity where the schema does not.
- Java sees ordinary getters rather than value-class-mangled methods.

### Negative

- Consumers cannot use one exhaustive union-level `when` for `anyOf`; that would misrepresent multi-match semantics.
- Generated wrappers and serializers are more verbose than a single preferred projection.
- Typed mutation must be explicit and may require per-union generated helpers.

## Conditions and re-evaluation triggers

- Keep diagnostics bounded by branch count and reason length, and add schema/source pointers in production.
- Benchmark with corpus-scale generated unions and allocation profiling before changing lazy behavior.
- Re-evaluate only if a new representation preserves all matches, unknown fields, JSON value identity, Java usability, and the raw-authority invariant without introducing an exclusive-union fiction.
- A preferred view may be added only as an opt-in policy helper; it must never affect validation, retained matches, or serialization.

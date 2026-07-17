# ADR 0005: Own overlay application and isolate JSONPath behind a seam

## Status

Accepted with Phase 1 conformance gates.

**Updated 2026-07-16 (Phase 1 wave 1, overlay-gates workstream):** the RFC 9535 conformance gate
was executed against the pinned 703-case official Compliance Test Suite. The owned applicator,
`JsonPathSelector` seam, strict grammar pre-validation, and standard `copy` action all passed.
**SnackJson 4.0.54 failed the evaluator gate**: 87 valid, Overlay-relevant selectors still fail
after pre-validation (the seam does correctly reject all 247 invalid selectors, 185 of which raw
SnackJson wrongly accepts). Consequence: SnackJson is REJECTED as the evaluator. The seam and the
generator-owned `Rfc9535GrammarValidator` are retained; a generator-owned RFC 9535 evaluator
replaces SnackJson during Phase 1 integration (step 5). Evidence:
`../phase1/results/overlay-gates/REPORT.md` and its machine-readable CTS matrix.

## Context

Kotlin SDKGen needs ordered overlays, strict project safety, conflict evidence, deterministic effective-contract diffs, and validation of canonical `x-sdkgen-*` extensions. Existing JVM Overlay processors do not expose the selected-node and action evidence required for those policies.

Overlay 1.1 uses RFC 9535 JSONPath and defines `update`, `remove`, and `copy`. The Phase 0 prototype proved `update` and `remove`; it did not implement `copy`. SnackJson provides an RFC-named mode but still accepts some non-standard operators.

## Decision

Implement a focused parser-independent overlay applicator over a generator-owned JSON tree.

The applicator must:

- apply overlays and actions in declared order;
- record stable overlay identity, SHA-256, semantic metadata, action count, and order;
- default to SDKGen strict mode, where zero matches are errors;
- provide an explicit compatibility mode matching Overlay 1.1 zero-match success;
- fail contradictory cross-overlay writes unless a named conflict policy is selected and recorded;
- emit a deterministic JSON Pointer diff with before/after values;
- strictly validate versioned canonical `x-sdkgen-*` schemas, rejecting unknown canonical names and fields while preserving unrelated vendor extensions;
- remain independent of swagger-parser model types.

Use `org.noear:snack4-jsonpath:4.0.54` initially behind a generator-owned `JsonPathSelector` seam. Validate the RFC 9535 grammar before engine execution rather than relying on a deny-list.

Do not claim complete Overlay 1.1 support until both `copy` and a pinned RFC 9535 conformance corpus pass.

## Evidence

Primary evidence:

- [Phase 0 overlays report](../phase0/results/overlays/REPORT.md)

The prototype passed **12 tests with 0 failures** and applied three overlays to the **1,203,455-byte** OpenRouter document:

> Ordered `update` and `remove` actions produced a three-entry deterministic diff; swagger-parser 2.1.45 parsed the effective document as OpenAPI 3.1 with zero messages.

The OpenRouter-only applicator time was **225 ms**. Repeated runs and `tr_TR` plus `Pacific/Auckland` runs produced identical effective-document, diff, and manifest digests.

The strict and compatibility policies were both proven:

> Strict mode failed with `Overlay 'missing' action 0 matched zero nodes: $['paths']['/gone']`; compatibility mode accepted the same zero-match action unchanged.

The JSONPath qualification is decisive:

> SnackJson 4.0.54's explicit IETF mode still accepted the non-RFC Jayway `in` operator, so the prototype rejected known extensions before evaluation and required a full grammar/corpus gate for Phase 1.

The report also records that Overlay 1.1 `copy` was deliberately rejected by the focused prototype.

## Consequences

### Positive

- Overlay evidence, conflict policy, strictness, and diagnostics remain SDKGen-owned.
- JSONPath engines can be replaced without changing overlay semantics.
- Effective-contract changes are deterministic and reviewable.
- Canonical extension validation is independent from unrelated vendor extensions.

### Negative

- SDKGen owns Overlay merge, conflict, and mutation correctness.
- SnackJson needs a grammar-validation front end and conformance tests.
- Complete `copy` semantics, difficult member names, and source-location propagation remain implementation work.

## Conditions and re-evaluation triggers

- Phase 1 must implement and test Overlay 1.1 `copy`, including zero-match, multiple source/target, conflict, and evidence behavior.
- Phase 1 must pin and pass an RFC 9535 corpus and reject non-standard grammar before evaluation.
- Add limits for JSONPath complexity, overlay size, action count, and selected-node count.
- Re-evaluate SnackJson on every version upgrade or if the conformance matrix exposes unsupported standard behavior.
- Existing processors may be used as comparison oracles, but become architectural candidates only if they expose deterministic selected-path/action evidence and satisfy SDKGen policy requirements.

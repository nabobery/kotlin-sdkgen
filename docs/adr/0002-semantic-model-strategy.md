# ADR 0002: Use an immutable generator-owned semantic model

## Status

Accepted with continuing schema-coverage work.

## Context

Kotlin SDKGen needs a parser-neutral representation that preserves source identity, requiredness, nullability, references, recursion, composition, operation metadata, and extensions. The model must be immutable, common-ready at its public seam, and suitable for deterministic plugins and emission.

The input corpus spans OpenAPI 3.0.x and 3.1.0. The pinned OpenRouter 3.1 document itself uses legacy OpenAPI 3.0-style `nullable: true` extensively, while focused fixtures carry explicit JSON Schema null unions. Treating either dialect form as optional support would make nullability behavior corpus-dependent.

## Decision

Create an immutable generator-owned semantic model and adapt parser data into it immediately after intake.

The model uses:

- canonical source URI plus JSON Pointer for stable node identity;
- source range and provenance on every material node;
- ID edges for references and recursion rather than recursively expanded object graphs;
- independent requiredness and nullability dimensions;
- normalized nullability derived from both legacy `nullable: true` and OpenAPI 3.1/JSON Schema explicit `null` alternatives;
- retention of original syntax, including explicit `null` members, so normalization does not erase input facts;
- distinct ordered representations for `oneOf`, `anyOf`, and `allOf`;
- branch ownership and constraints for `allOf` rather than silent flattening;
- explicit discriminator mappings and unmapped branches;
- immutable operation, parameter, response, security, streaming, multipart, extension, and source metadata.

Every normalization is a named transformation with provenance. Parser object identity, physical filesystem paths, and parser-specific classes are excluded from durable model state and plugin-visible APIs.

The production model must support both OpenAPI 3.0 and 3.1 nullability forms. Focused stress fixtures permanently own coverage gaps not currently present in production contracts, including explicit null unions, recursive component cycles, multipart encoding maps, and response header maps.

## Evidence

Primary evidence:

- [Phase 0 semantic-model report](../phase0/results/semantic-model/REPORT.md)
- [Phase 0 corpus report](../phase0/results/corpus/REPORT.md)

The semantic-model experiment reported:

> All **19 tests** passed, all **16 corpus stress fixtures** had byte-stable snapshots, and the public seam contained no `io.swagger` types, `Any`/`Any?`, `java.*`, or `javax.*` imports.

> The pinned OpenRouter document adapted with **708/708 component schemas**, **89/89 operations**, **0 diagnosed omissions**, and **0 silent omissions**; it produced **4,680 semantic schema nodes** and indexed **36,905 source nodes**.

Nullability was proven as two independent dimensions:

> `requiredNullable` was `REQUIRED` and `NULLABLE`; `optionalNonNull` was `OPTIONAL` and `NON_NULL`; `optionalNullable` was `OPTIONAL` and `NULLABLE`.

The corpus established the dual-dialect requirement:

> The 2026-07-16 OpenRouter pin contains **899 legacy `nullable: true` sites** and **0 explicit null unions**; focused fixtures 05 and 10 cover the missing explicit-null forms.

## Consequences

### Positive

- Parser upgrades and emitter changes do not alter the semantic contract automatically.
- Plugins receive immutable, deterministic, source-linked representations.
- Requiredness, nullability, and presence can be mapped without conflation.
- Recursive schemas remain finite and stable.
- Compatibility reports can explain both source facts and normalization steps.

### Negative

- The model duplicates some parser information and requires explicit adapters for every supported keyword.
- Full JSON Schema 2020-12 coverage remains substantial work.
- Transformation-history provenance and a stable serialized debug/manifest form still need production design.

## Conditions and re-evaluation triggers

- Add complete coverage for required JSON Schema 2020-12 keywords before production generation claims completeness.
- Add typed security-scheme definitions, callbacks, and richer link modeling before their generated/runtime phases.
- Re-run all semantic snapshots after parser, Jackson, corpus, or normalization-rule changes.
- Treat any material node without source or synthetic provenance as a generation defect.
- Revisit publication of the semantic model as an independent artifact only when a supported parser-free or model-only consumer exists; initially it remains inside the engine coordinate.

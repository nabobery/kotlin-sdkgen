# ADR 0013: Report generated-SDK compatibility through five independent evidence layers

## Status

Accepted for the pre-1.0 generated SDK compatibility contract.

## Context

The existing `diff` and `explain` commands compare the frozen `v1alpha1` snapshot contract. They provide useful
input diagnostics, but their generated-file hashes and declaration digest are not a complete compatibility decision.
In particular, a generated source-file change is not necessarily a Kotlin public-API change, behavior needs the
scenario and wire evidence established by parity, and ABI must come from the artifact that is actually staged.

Compatibility needs a deterministic report that can be consumed by humans and automation without allowing missing
evidence to become an inferred pass. It also needs to read the current manifests while the generator transitions to
richer evidence digests.

## Decision

### Five independent layers

A compatibility report contains exactly these five layers, in this canonical order:

1. `sourceContract`
2. `semanticModel`
3. `kotlinApi`
4. `behavior`
5. `abi`

These names supersede the `source`, `semantic`, and `binaryAbi` shorthand used by the 2026-07-27 execution plan's
Initial compatibility-report section. Provenance and configuration describe how evidence was obtained. They are report metadata and are
never a sixth compatibility layer.

Every report always contains one entry for every layer. A layer outcome is exactly one of:

- `unchanged` — the required evidence exists and the comparison found no layer change;
- `changed` — the required evidence exists and the comparison found one or more layer changes; or
- `unavailable` — the layer cannot be compared.

An `unavailable` entry always includes an `unavailableReason` object with a stable machine-readable `code` and an
optional diagnostic `detail`. Missing layer input is represented as `unavailable` with the code
`missing-layer-evidence`; a renderer must never omit the entry instead.

### Classification and aggregate outcome

Every reported change has one classification:

- `additive`;
- `behaviorallyRisky`;
- `breaking`; or
- `unknown`.

Severity order, from most to least severe, is `breaking`, `unknown`, `behaviorallyRisky`, then `additive`.
Ordering uses that severity order first and stable change ID second. `unknown` is not a low-risk classification: it
means the classifier could not establish the required classification evidence and is therefore retained ahead of
otherwise risk-classified or additive rows under a display budget.

`CompatibilityReport` has an internal or private primary constructor. `create` and `compare` are its only entry
points, so they can always enforce the exact five-layer set and derive rather than accept the aggregate outcome.

The report aggregate outcome is derived, never selected by a renderer:

1. `incomplete` if any required layer is `unavailable` or any reported change is `unknown`;
2. `compatible` if all five layers are `unchanged` and no changes are reported; otherwise
3. `changed`.

Thus an unavailable or unknown required input can never silently become `compatible` or `unchanged`. This
fail-closed invariant applies to every format, every `--fail-on` policy, and every future report consumer.

### Stable change identifiers, evidence, and truncation

A change ID is deterministic, sortable, and identical in the JSON and Markdown renderings. It has this form:

```text
compat-v1:<layer>:<subject-kind>:<digest16>
```

`<layer>` is one of the five canonical layer names; `<subject-kind>` is a lowercase ASCII kebab-case identifier; and
`<digest16>` is the first 16 lowercase hexadecimal characters of SHA-256 over UTF-8 bytes of this NUL-delimited
canonical key:

```text
compat-v1\0<layer>\0<subject-kind>\0<canonical-subject>\0<before-fingerprint-or->\0<after-fingerprint-or->
```

Each classifier documents its `(layer, subject-kind)` canonical-subject grammar with a worked example in its own
source file, and changing that grammar is an ID-stability-breaking event subject to the same re-versioning trigger
as a change to the ID key. The classifier also normalizes its evidence fingerprints before ID creation. The report
sorts changes by severity and then by the full change ID; a single input produces the same IDs and order across runs
and across renderers.

A rename is represented as an independent removal and addition, each with its own change ID. This contract does not
infer rename linkage from name similarity, consistent with the project's no-heuristics invariant.

Each change contains one or more evidence references. An evidence reference has `kind`, `identity`, and `sha256`
fields, plus an optional normalized `location`. `kind` identifies the evidence domain (for example,
`effective-contract`, `semantic-model`, `declaration-projection`, `parity-scenario`, `parity-wire`, `jvm-abi-dump`, or
`klib-abi-dump`). `identity` is a stable corpus, fixture, artifact, or scenario identity; it is not an absolute host
path. Although represented as a string, `kind` is a documented, centrally maintained append-only vocabulary. Each
classifier must reuse an existing kind before adding a new one.

`totalChangeCount`, `changeCountsByClassification`, and `mostSevereClassification` are always-present top-level
`CompatibilityReport` fields calculated from the full, untruncated change set; the derived aggregate outcome is also
a top-level report fact. `truncation` is only an optional display marker for hidden rows. Truncation limits displayed
change rows and therefore cannot hide a breaking, unknown, or incomplete aggregate result.

### Evidence sources

`sourceContract` compares pinned source inputs, references, overlays, and their normalized effective-contract
pointers.

`semanticModel` compares the effective semantic model evidence. `declarationModelSha256` remains useful declaration
evidence but is not silently reinterpreted as all semantic evidence.

`kotlinApi` compares a typed public-API projection from the staged emitted-API projection established by
[ADR 0019](0019-emitted-public-api-projection.md); it does not derive directly from the declaration model. It does
not compare generated file hashes. Formatting, KDoc, declaration ordering, and internal-codec changes must never
surface as Kotlin API changes.

`behavior` consumes only parity-scenario and parity-wire evidence. Every behavior evidence reference names the exact
fixture identity; no source-only inference or generated-file comparison can establish behavior compatibility.

`abi` consumes staged generated-SDK JVM and KLib dumps. Per ADR 0007, JVM dumps use BCV 0.18.1 against the exact
staged generated-SDK JAR. KLib dumps remain experimental and target-specific; each staged `.klib` is compared
independently and an unavailable target names its precise reason. ABI is never inferred from source API. This layer
compares generated SDK artifacts only: it is strictly separate from ABI evidence for the eight SDKGen product
publication coordinates in ADR 0008.

### Manifest transition and bounded input

The writer emits `v1alpha2` manifests and the CLI keeps reading `v1alpha1` manifests. `v1alpha2` retains
`declarationModelSha256` and adds distinct `effectiveContractSha256`, `semanticModelSha256`, and
`kotlinApiSha256` fields. The four fields have distinct meanings and must not be substituted for one another.

A `v1alpha1` manifest remains readable. It supplies incomplete evidence for a five-layer report because the
versioned reader cannot manufacture the new evidence dimensions. The frozen `v1alpha1` `diff` and `explain` JSON
shapes and text output do not change; the new compatibility report is an explicit versioned contract rather than a
reinterpretation of legacy output.

The `v1alpha1` manifest reader decodes with strict unknown-key rejection, and this is deliberate, not incidental:
the reader's typed model is the operational definition of what `v1alpha1` contains. Any field the writer adds to a
`v1alpha1`-labeled manifest must be typed into the reader in the same change that adds it to the writer; a writer
change that adds new `v1alpha1` wire content without a matching reader update is a contract violation by the
writer, not a defect in reader strictness, and the correct remedy is to teach the reader the field, never to relax
decoding. `acceptedWaivers` is compatibility-relevant governance evidence, not display-only metadata: each accepted
waiver names the exact excluded symbol, its diagnostic code, and the accepted rationale, owner, and disposition, so
a change to a manifest's accepted-waiver set means either a previously accepted deviation regressed or a new one
was accepted. `diff` compares `acceptedWaivers` as a `generated-semantic` dimension, the same way it already
compares `exclusions` and `diagnostics`; it is read, typed, and included in comparison, never ignored. `explain`
does not yet trace accepted waivers — `CliExplainTracing` matches only `validation.diagnostics` and
`validation.exclusions` — so a waiver identifier is currently unexplainable. That gap is recorded here rather than
implied away, and closing it is follow-up work outside this decision. This
is distinct from the `v1alpha2` transition above: introducing a genuinely new evidence dimension the current fields
cannot express — such as `effectiveContractSha256`, `semanticModelSha256`, or `kotlinApiSha256` — requires the
`schemaVersion` bump; a field that only extends already-modeled generated-semantic governance data does not.

Strict unknown-key rejection applies to **every** manifest schema version, not only `v1alpha1`. The rule above is
the enforcement mechanism for "a writer change ships with its typed reader field in the same change," and that
rule is not specific to the legacy version. `v1alpha2` is pre-1.0 and has no external consumers, so there is no
forward-compatibility debt to protect; buying optional-field flexibility now would reintroduce exactly the
writer/reader drift that strictness exists to catch. An unrecognised `schemaVersion` is itself rejected rather
than read on a best-effort basis. A `v1alpha1`-labelled manifest that carries any `v1alpha2` evidence field fails
closed naming the offending field, because silently honouring it would let a new evidence dimension bypass the
`schemaVersion` bump this section requires.

"Unknown" here means **not part of the declared manifest schema** — not merely "not consumed by this particular
reader," and the distinction is load-bearing. The manifest has many fields; a given reader consumes a subset. The
compatibility reader needs only the digests and `files`, while `diff` and `explain` read the governance and
provenance fields. A reader that rejected every field it did not itself consume would reject the manifests its own
engine writes, which is a defect, not strictness. Each reader therefore declares the **full** set of fields the
schema defines, consumes the subset it needs, and rejects anything outside that declared set. That preserves the
drift-detection property exactly — a genuinely new writer field still fails every reader until it is declared —
while keeping readers able to read real manifests. This clarification was written after the uniform-rejection rule
above was applied literally and rendered `sdkgen compat` unable to read any manifest the engine produced.

Every digest a manifest declares — `declarationModelSha256`, the three `v1alpha2` evidence digests, and each
per-file `sha256` — must be canonical lowercase hexadecimal SHA-256, and a non-canonical digest fails closed at
read time. This is load-bearing rather than cosmetic: the classifiers' own evidence validation rejects
non-canonical fingerprints, so a reader that accepted an arbitrary string and normalized it into well-formed hex
would launder invalid evidence into apparently valid evidence and could report `unchanged` for a manifest whose
declared digests are meaningless. Digests are therefore validated at the boundary and passed through unmodified,
never re-hashed to manufacture validity.

The CLI manifest reader accepts at most 20,000 declared files, matching the publisher's real file-count cap. Its
16 MiB manifest-byte cap is a pre-existing CLI reader bound, not a publisher promise. Because 20,000 paths of up to
4,096 characters could exceed 16 MiB, a publisher-valid manifest can still be rejected as too large and produce a
fail-closed `incomplete` availability result. Both limits are checked before expensive parsing or unbounded
allocation, and the file-count limit is enforced by counting `files` elements incrementally during a streaming
parse, so an over-count document is rejected without requiring the remainder of it to parse. Stripe's observed
10,616-file manifest is comfortably inside both bounds. Paths are normalized before use; empty, absolute,
drive-qualified (including drive-relative forms with no separator), NUL-containing, non-canonical, or
root-traversing paths fail closed, and backslash separators are normalized before segment analysis so that
traversal cannot hide behind a Windows-style separator on a POSIX host. Over-count and over-byte inputs produce
deterministic failures.

### CLI contract and exit policy

The compatibility command accepts:

- `--format human|json|markdown`;
- `--fail-on breaking|behaviorally-risky|any-change|never`, defaulting to `breaking`.

Exit codes are:

- `0` — complete evidence and no selected compatibility threshold reached;
- `1` — invalid input or incomplete required evidence;
- `2` — CLI usage error; and
- `3` — complete evidence and the selected compatibility threshold was reached.

For a complete report, `breaking` fails only on `breaking`; `behaviorally-risky` fails on `breaking` or
`behaviorallyRisky`; `any-change` fails on any reported change; and `never` does not select a compatibility
threshold. Invalid or incomplete evidence takes exit `1` before threshold evaluation, so `--fail-on never` cannot
mask incomplete evidence. The classification and exit decision are made before rendering. Human, JSON, and Markdown
renderers receive the same typed report and cannot change its classification or exit code.

## Consequences

### Positive

- Automation receives deterministic, stable IDs, classifications, evidence references, and exit semantics.
- Missing source, semantic, behavior, or ABI evidence is visible and fail-closed.
- Kotlin API compatibility is insulated from non-public generated-source churn.
- Legacy `v1alpha1` users retain their frozen `diff` and `explain` contracts while remaining honestly incomplete for
  the new report.
- Large generated SDKs, including Stripe, remain within the reader envelope.

### Negative

- Complete compatibility reports require more independent evidence than the existing snapshot diff.
- The generated-SDK ABI lane depends on staged artifacts and target-specific KLib availability.
- `v1alpha1` manifests can be consumed but cannot produce a complete five-layer result.
- Report consumers must handle `incomplete` explicitly rather than treating absence as compatibility.

## Conditions and re-evaluation triggers

- Re-evaluate the staged JVM/KLib dump mechanism whenever the Kotlin or BCV baseline changes, as required by ADR
  0007.
- Do not merge generated-SDK ABI evidence with product-publication ABI evidence from ADR 0008.
- Any new compatibility dimension requires a new ADR; provenance/configuration additions remain metadata unless that
  decision is explicitly revised.
- Once a version of this report format has been consumed by an external consumer, any change to the ID key, a
  classifier's canonical-subject grammar, severity order, manifest envelope, or CLI exit semantics requires a
  versioned report contract and migration plan.
- Any writer change to a `v1alpha1`-labeled manifest ships in the same change as the corresponding typed reader
  field and comparison; the reader's strict unknown-key decoding is the enforcement mechanism for this rule, not a
  substitute for it.
- One frozen contract-test value was corrected during Compatibility-report implementation: the `kotlinApiSha256` mutation fixture
  used `"g".repeat(64)`, which is not hexadecimal, and would only have passed against a reader that laundered
  invalid digests into valid ones. It is now `"0".repeat(64)`. The correction was authorized because it makes the
  system strictly more fail-closed; it is recorded here because amending a frozen fixture is otherwise exactly the
  move this ADR exists to prevent, and the distinction is that the fixture contradicted the contract rather than
  the contract proving inconvenient.

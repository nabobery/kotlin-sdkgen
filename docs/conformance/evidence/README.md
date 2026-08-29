# Conformance evidence

This directory contains public, reviewable evidence for Kotlin SDKGen's real-world corpora. Evidence is grouped by
what it proves; no artifact should be read more broadly than its own status and provenance allow.

## Release-bound comparisons

- [OpenRouter 0.2.0 to 0.3.0](releases/v0.2.0-to-v0.3.0/openrouter/): reconstructed source-contract,
  semantic-model, and emitted-Kotlin-API evidence. Behavior and generated-SDK ABI are explicitly unavailable.

Release-bound packets retain immutable tags and commits, release-bound manifests, generated compatibility reports,
evidence digests, and integrity checks. Adding or correcting an evidence packet does not change published binaries
and therefore does not require a new SDKGen version. A code or artifact defect discovered while producing evidence
must still be fixed in a new release; evidence must never rewrite an existing publication.
- [OpenRouter 0.3.0 to 0.4.0](releases/v0.3.0-to-v0.4.0/openrouter/): source-contract, semantic-model, and
  emitted-Kotlin-API comparison for the 0.4.0 line (four intended stream element-type corrections, one additive
  configured constructor per client); behavior and ABI layers remain `unavailable`; the `0.4.0` commit binding is
  completed at the release tag.

## Durable proof and inventory files

The TSV inventories and proof tables in this directory are checked inputs for focused conformance decisions such as
schema-intersection judgments, exclusions, waivers, and generated-name migrations. Their owning tests define how
they are regenerated and validated.

## Point-in-time parity matrices

`parity-matrices.json` and `parity-matrices.md` are rendered from the committed assessment and policy inputs. A row
marked `notRun` or `waived` is not evidence that the corresponding behavior passed, and these matrices are not a
substitute for the ephemeral `liveParity` gate executed by the release-verification workflow, either when dispatched
directly or when called by the protected release workflow. Use that workflow's record for a specific commit when
evaluating a release's live parity result.

## Integrity

Machine-readable release packets include `SHA256SUMS`. Verify a packet from its own directory with:

```bash
shasum -a 256 -c SHA256SUMS
```

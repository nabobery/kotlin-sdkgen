# OpenRouter compatibility evidence: 0.2.0 to 0.3.0

This directory records the reproducible OpenRouter corpus comparison between Kotlin SDKGen `0.2.0` and `0.3.0`.
It accompanies the released generator versions; it is not a new SDKGen release and does not change any published
artifact.

## Result and scope

The `0.3.0` generator restores the three operations omitted by `0.2.0`—`createMessages`, `createResponses`, and
`createAudioTranscriptions`—so the pinned corpus moves from 86 of 89 to 89 of 89 generated operations.

[`compatibility-report.json`](compatibility-report.json) is the exact JSON emitted by `sdkgen compat`. Three layers
were reconstructable from the immutable tags:

| Layer | Outcome | Evidence |
| --- | --- | --- |
| `sourceContract` | changed | Release-bound generation manifests |
| `semanticModel` | changed | Release-bound semantic-model digests |
| `kotlinApi` | changed | Staged emitted-API projections |
| `behavior` | unavailable | Neither tag retains completed, comparable parity behavior packets |
| `abi` | unavailable | Neither tag retains generated-SDK ABI evidence packets |

The aggregate outcome is therefore `incomplete`, as required by the fail-closed compatibility contract. The report
contains 3,360 changes: 47 breaking, 2 unknown, and 3,311 additive. These classifications describe the generated
corpus surface, including synthesized declaration names; they are not a migration guide for a previously published
OpenRouter SDK because this repository publishes the generator and runtime, not that SDK.

The release workflow separately verified SDKGen's own public API/ABI, cross-corpus parity, the committed benchmark
budget, isolated publication, and external consumption. Those successful gates do not substitute for the two
unavailable before/after evidence layers in this report.

## Files

- [`v0.2.0-manifest.json`](v0.2.0-manifest.json) is the manifest reproduced from tag `v0.2.0` at commit
  `4079e448bf7cc2683b723bd4381cf8ba20115533`.
- [`v0.3.0-manifest.json`](v0.3.0-manifest.json) is the manifest reproduced from tag `v0.3.0` at commit
  `827d47985b70941a3e8602413a80dcf4542747ed` with the packaged version `0.3.0`.
- [`evidence-metadata.json`](evidence-metadata.json) binds the tags, commits, coverage counts, report summary, and
  staged projection digests.
- [`SHA256SUMS`](SHA256SUMS) provides file-level integrity checks for this committed packet.

The emitted Kotlin API projections are intentionally not committed. They are staging artifacts under
[ADR 0019](../../../../../adr/0019-emitted-public-api-projection.md), total roughly 48 MB, and are deterministically
reconstructable from the two tags. Their SHA-256 digests are retained in `evidence-metadata.json` and referenced by
every applicable `kotlinApi` change in the compatibility report.

## Provenance notes

The `v0.2.0` manifest truthfully retains `generatorVersion: 0.1.0-alpha.1`. That release still used the old
hard-coded provenance value. Packaged-version stamping landed on `main` in commit `3e3cac82a` during subsequent
development and first shipped in `0.3.0`. Rewriting the historical manifest to say `0.2.0` would fabricate evidence.

The `v0.3.0` release-bound manifest differs from the snapshot committed at the tag only in
`generatorVersion` (`0.3.0` instead of the development value `0.3.0-SNAPSHOT`). Its generated file inventory and
all contract/model/API digests are identical to the tagged snapshot. The `v0.2.0` reconstruction is byte-identical
to its tagged snapshot.

## Reproduce

In the same shell, create a temporary evidence directory, then build each tag's CLI with the corresponding release
version and generate the pinned OpenRouter corpus plus an emitted-API projection:

```bash
evidence_dir="$(mktemp -d)"
v020_output="$evidence_dir/v0.2.0-output"
v020_projection="$evidence_dir/v0.2.0-kotlin-api.json"
v030_output="$evidence_dir/v0.3.0-output"
v030_projection="$evidence_dir/v0.3.0-kotlin-api.json"

git switch --detach v0.2.0
./gradlew :generator:cli:installDist -PsdkgenVersion=0.2.0
generator/cli/build/install/cli/bin/cli generate \
  --config conformance/openrouter/sdkgen.yaml \
  --output "$v020_output" \
  --kotlin-api-projection "$v020_projection"

git switch --detach v0.3.0
./gradlew :generator:cli:installDist -PsdkgenVersion=0.3.0
generator/cli/build/install/cli/bin/cli generate \
  --config conformance/openrouter/sdkgen.yaml \
  --output "$v030_output" \
  --kotlin-api-projection "$v030_projection"
```

Then run the `v0.3.0` CLI:

```bash
generator/cli/build/install/cli/bin/cli compat \
  --from "$v020_output/manifest.json" \
  --to "$v030_output/manifest.json" \
  --kotlin-api-from "$v020_projection" \
  --kotlin-api-to "$v030_projection" \
  --format json \
  --fail-on never
```

Exit code `1` is expected because behavior and ABI evidence are unavailable. The JSON output must match the
committed report byte for byte.

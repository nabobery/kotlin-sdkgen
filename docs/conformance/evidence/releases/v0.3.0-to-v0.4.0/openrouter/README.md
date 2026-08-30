# OpenRouter compatibility evidence: 0.3.0 to 0.4.0

This directory records the reproducible OpenRouter corpus comparison between Kotlin SDKGen `0.3.0` and the
`0.4.0` release line. It accompanies the generator versions; it is not a new SDKGen release and does not change any
published artifact.

## Result and scope

Both sides generate all 89 of 89 pinned operations into 1,670 files with no exclusions and an empty accepted-waiver
ledger. [`compatibility-report.json`](compatibility-report.json) is the exact JSON emitted by `sdkgen compat` and
contains 35 changes: 4 breaking, 2 unknown, and 29 additive.

| Layer | Outcome | Evidence |
| --- | --- | --- |
| `sourceContract` | changed | Release-bound generation manifests (the compatibility overlay gained `payloadProperty`) |
| `semanticModel` | changed | Release-bound semantic-model digests (`StreamingModel.Sse.payloadProperty`) |
| `kotlinApi` | changed | Staged emitted-API projections |
| `behavior` | unavailable | No comparable parity behavior packet is retained for `0.3.0` |
| `abi` | unavailable | No generated-SDK ABI evidence packet is retained for `0.3.0` |

The aggregate outcome is therefore `incomplete`, as required by the fail-closed compatibility contract
([ADR 0013](../../../../../adr/0013-five-layer-compatibility-reports.md)). The two `unknown` changes are the
digest-level source-contract and semantic-model deltas the classifier cannot attribute more precisely.

### What the 33 attributable changes are

- **29 additive**: one new public constructor per generated client (the root `OpenRouterClient` facade and all 28
  resource clients) that accepts `SdkClientConfig` as its third parameter. The 0.3.0 constructor signature is
  retained on every client, including its JVM default-argument bridge; the generator's own test suite proves a
  caller compiled against the 0.3.0 descriptor links and executes against 0.4.0 bytecode.
- **4 breaking**: the return types of `ChatClient.sendChatCompletionRequestStream`, `ImagesClient.createImagesStream`,
  `AnthropicMessagesClient.createMessagesStream`, and `BetaResponsesClient.createResponsesStream` change from
  `Flow<…StreamingResponse>` (the Speakeasy SSE envelope) to `Flow<payload>` (`ChatStreamChunk`, the image stream
  union, `MessagesStreamEvents`, `StreamEvents`). These are the only four operations whose overlay entry enables
  `x-sdkgen-streaming.payloadProperty: data`, and the change is an intended source-API correction: the 0.3.0 element
  type could not decode the documented wire form. See
  [ADR 0022](../../../../../adr/0022-generated-client-configuration-and-sse-payloads.md).

No other generated declaration changed shape. The remaining generated-source differences (constructor wiring,
parameter encoding without redundant `toString()`, union predicates without redundant casts) are not public-API
changes and do not appear in the report.

The runtime library's own public API is additive (`SdkClientConfig`, `SdkExecutor.DEFAULT_PRODUCT_TOKEN`), as
tracked by the committed `runtime/core` API dumps. The `generator-model` surface changed additively at source level
(`StreamingModel.Sse` gained a fourth field and keeps a three-argument secondary constructor); its generated `copy`
descriptor changed.

## Files

- [`v0.3.0-manifest.json`](v0.3.0-manifest.json) is the manifest reproduced from tag `v0.3.0` at commit
  `827d47985b70941a3e8602413a80dcf4542747ed` with the packaged version `0.3.0`.
- [`v0.4.0-manifest.json`](v0.4.0-manifest.json) is the manifest produced by the `0.4.0` generator with the packaged
  version `0.4.0`. Its commit binding is recorded as pending in `evidence-metadata.json` and must be rebound at the
  protected `v0.4.0` tag as part of the release procedure.
- [`evidence-metadata.json`](evidence-metadata.json) binds the tags, commits, coverage counts, report summary, and
  staged projection digests.
- [`SHA256SUMS`](SHA256SUMS) provides file-level integrity checks for this committed packet.

The emitted Kotlin API projections are staging artifacts under
[ADR 0019](../../../../../adr/0019-emitted-public-api-projection.md) and are not committed; their SHA-256 digests are
retained in `evidence-metadata.json`. The `v0.3.0` projection digest is byte-identical to the one recorded in the
[0.2.0-to-0.3.0 packet](../../v0.2.0-to-v0.3.0/openrouter/), which demonstrates that the baseline regeneration is
reproducible.

## Reproduce

Build each version's CLI with the corresponding packaged version and generate the pinned OpenRouter corpus plus an
emitted-API projection, then compare with the `0.4.0` CLI:

```bash
evidence_dir="$(mktemp -d)"

git switch --detach v0.3.0
./gradlew :generator:cli:installDist -PsdkgenVersion=0.3.0
generator/cli/build/install/cli/bin/cli generate \
  --config conformance/openrouter/sdkgen.yaml \
  --output "$evidence_dir/v0.3.0-output" \
  --kotlin-api-projection "$evidence_dir/v0.3.0-kotlin-api.json"

git switch --detach v0.4.0
./gradlew :generator:cli:installDist -PsdkgenVersion=0.4.0
generator/cli/build/install/cli/bin/cli generate \
  --config conformance/openrouter/sdkgen.yaml \
  --output "$evidence_dir/v0.4.0-output" \
  --kotlin-api-projection "$evidence_dir/v0.4.0-kotlin-api.json"

generator/cli/build/install/cli/bin/cli compat \
  --from "$evidence_dir/v0.3.0-output/manifest.json" \
  --to "$evidence_dir/v0.4.0-output/manifest.json" \
  --kotlin-api-from "$evidence_dir/v0.3.0-kotlin-api.json" \
  --kotlin-api-to "$evidence_dir/v0.4.0-kotlin-api.json" \
  --format json \
  --fail-on never
```

Exit code `1` is expected because behavior and ABI evidence are unavailable. The JSON output must match the
committed report byte for byte.

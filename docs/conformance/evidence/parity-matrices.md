# Cross-Corpus Parity & Matrices

This checkpoint aggregates checked evidence; it does not execute corpus or transport producers. Absent digest-bound executions from the current commit remain `notRun`.

## Executive Summary

| Metric | Value |
| --- | --- |
| Total Matrix Scenarios | 28 |
| Passed Scenarios | 0 |
| Waived Scenarios | 3 |
| Not Applicable Scenarios | 1 |
| Failed Scenarios | 0 |
| Not Run Scenarios | 24 |
| Overall Gate Status | **failed** |

## Input integrity

All declared corpus, config, and toolchain digests match the repository inputs.

## Fixture Behavior Parity Matrix

| Subject | Target / Category | Row ID | Scenario | Status | Requiredness | Level | Producer | Reason |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| `github` | `jvm` | `github.behavior.pagination` | Generated Link pagination and continuation trust | **notRun** | `required` | `generatedClient` | `parity-assessment` | The checked T10 snapshot predates parity emitter changes. |
| `github` | `jvm` | `github.behavior.auth` | Generated bearer authentication and pre-transport failure | **notRun** | `required` | `generatedClient` | `parity-assessment` | No current-head digest-bound producer result exists. |
| `github` | `jvm` | `github.behavior.typed-errors` | Generated typed 403 and 422 response alternatives | **notRun** | `required` | `generatedClient` | `parity-assessment` | No current-head digest-bound producer result exists. |
| `github` | `jvm` | `github.behavior.optionality` | Generated absent versus explicit-null request fields | **notRun** | `required` | `generatedClient` | `parity-assessment` | No current-head digest-bound producer result exists. |
| `github` | `jvm` | `github.behavior.unions` | Generated primitive and object union validation | **notRun** | `required` | `generatedClient` | `parity-assessment` | No current-head digest-bound producer result exists. |
| `stripe` | `jvm` | `stripe.behavior.form` | Generated indexed form arrays and typed dynamic maps | **notRun** | `required` | `generatedClient` | `parity-assessment` | The checked T11 snapshot does not match current parity projection. |
| `stripe` | `jvm` | `stripe.behavior.multipart` | Generated multipart indexed arrays and empty part | **notRun** | `required` | `generatedClient` | `parity-assessment` | No refreshed current-head producer result exists. |
| `stripe` | `jvm` | `stripe.behavior.auth-typed-errors` | Generated basic auth plus typed success and error alternatives | **notRun** | `required` | `generatedClient` | `parity-assessment` | No refreshed current-head producer result exists. |
| `openrouter` | `jvm` | `openrouter.behavior.typed-errors` | Generated withResponse typed non-success alternative | **notRun** | `required` | `generatedClient` | `parity-assessment` | OpenRouter has no checked manifest or current-head producer result. |
| `openrouter` | `jvm` | `openrouter.behavior.auth` | Generated required-auth preflight | **notRun** | `required` | `generatedClient` | `parity-assessment` | No current-head digest-bound producer result exists. |
| `openrouter` | `common` | `openrouter.behavior.model-contracts` | Generated optionality, additional properties, open enums, oneOf, and anyOf | **notRun** | `required` | `generatedClient` | `parity-assessment` | No current-head digest-bound producer result exists. |
| `openrouter` | `production-corpus` | `openrouter.behavior.production-sse` | Production generated SSE operation | **notApplicable** | `optional` | `sourceInvariant` | `parity-policy` | The compatibility overlay structurally removes production SSE operations; stress SSE is tracked separately. |
| `stress-streaming` | `jvm` | `stress.behavior.generated-sse` | Generated SSE method under hostile boundaries and cancellation | **notRun** | `required` | `generatedClient` | `parity-assessment` | No digest-bound current-head stress-fixture result exists. |
| `openrouter` | `production-corpus` | `openrouter.behavior.multipart-waiver` | Production generated multipart operation | **waived** | `optional` | `generatedClient` | `parity-policy` | The production OpenRouter corpus does not currently generate multipart request bodies. |
| `runtime-core` | `js-node` | `runtime.behavior.js-lone-surrogate` | Form URL encoding of a lone UTF-16 surrogate | **waived** | `optional` | `runtimeContract` | `parity-policy` | The JS engine rejects construction of the lone-surrogate fixture before runtime encoding. |
| `runtime-core` | `android-host` | `runtime.behavior.android-host` | Android execution of common runtime tests | **waived** | `optional` | `runtimeContract` | `parity-policy` | No Android host runner is available in the current resource-bounded execution lane. |

## Generated SDK Compile Parity Matrix

| Subject | Target / Category | Row ID | Scenario | Status | Requiredness | Level | Producer | Reason |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| `github` | `jvm` | `github.compile.jvm` | Current generated GitHub SDK JVM compilation | **notRun** | `required` | `generatedClient` | `parity-assessment` | No isolated current-head compile producer result exists. |
| `github` | `js-macos-android` | `github.compile.non-jvm` | Generated GitHub SDK non-JVM compilation | **notRun** | `optional` | `generatedClient` | `parity-assessment` | The current GitHub consumer is JVM-only. |
| `stripe` | `jvm` | `stripe.compile.jvm` | Current generated Stripe SDK JVM compilation | **notRun** | `required` | `generatedClient` | `parity-assessment` | No isolated current-head compile producer result exists. |
| `stripe` | `js-macos-android` | `stripe.compile.non-jvm` | Generated Stripe SDK non-JVM compilation | **notRun** | `optional` | `generatedClient` | `parity-assessment` | No representative non-JVM producer result exists. |
| `openrouter` | `jvm` | `openrouter.compile.jvm` | Current generated OpenRouter SDK JVM compilation | **notRun** | `required` | `generatedClient` | `parity-assessment` | No digest-bound current-head compile producer result exists. |
| `openrouter` | `js-android-native` | `openrouter.compile.representative-kmp` | Representative broad KMP and Android compilation | **notRun** | `required` | `generatedClient` | `parity-assessment` | No representative KMP producer result exists. |

## Runtime Transport Adapter Contract Matrix

| Subject | Target / Category | Row ID | Scenario | Status | Requiredness | Level | Producer | Reason |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| `transport-ktor` | `jvm` | `ktor.transport.contract` | Complete SdkTransportContractKit execution including skip report | **notRun** | `required` | `runtimeContract` | `parity-assessment` | No digest-bound adapter-suite producer result exists. |
| `transport-okhttp` | `jvm` | `okhttp.transport.contract` | Complete SdkTransportContractKit execution including skip report | **notRun** | `required` | `runtimeContract` | `parity-assessment` | No digest-bound adapter-suite producer result exists. |
| `transport-java-http` | `jvm` | `java-http.transport.contract` | Complete SdkTransportContractKit execution including skip report | **notRun** | `required` | `runtimeContract` | `parity-assessment` | No digest-bound adapter-suite producer result exists. |

## Portable Source-Invariant Matrix

| Subject | Target / Category | Row ID | Scenario | Status | Requiredness | Level | Producer | Reason |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| `github` | `portable-source` | `github.source.portable` | Generated source contains no forbidden platform APIs | **notRun** | `required` | `sourceInvariant` | `parity-assessment` | No current-head digest-bound source scan exists. |
| `stripe` | `portable-source` | `stripe.source.portable` | Generated source contains no forbidden platform APIs | **notRun** | `required` | `sourceInvariant` | `parity-assessment` | No current-head digest-bound source scan exists. |
| `openrouter` | `portable-source` | `openrouter.source.portable` | Generated source contains no forbidden platform APIs | **notRun** | `required` | `sourceInvariant` | `parity-assessment` | No current-head digest-bound source scan exists. |

## Waiver Ledger

| Corpus / Transport | Capability ID | Target / Category | Owner | Rationale | 1.0 Disposition |
| --- | --- | --- | --- | --- | --- |
| `openrouter` | `openrouter.behavior.multipart-waiver` | `production-corpus` | generator-engine | The production OpenRouter corpus does not currently generate multipart request bodies. | Implement production-corpus multipart generation or remove this operation from the 1.0 support claim. |
| `runtime-core` | `runtime.behavior.js-lone-surrogate` | `js-node` | runtime-core | The JS engine rejects construction of the lone-surrogate fixture before runtime encoding. | Add an engine-independent JS fixture or document the platform limitation before 1.0. |
| `runtime-core` | `runtime.behavior.android-host` | `android-host` | release-engineering | No Android host runner is available in the current resource-bounded execution lane. | Run the common runtime contract on an Android CI host before 1.0. |

## Evidence Provenance & Integrity

| Corpus / Transport | Capability ID | Commit SHA | Config Digest | Config File SHA | Evidence Digest |
| --- | --- | --- | --- | --- | --- |
| `github` | `github.behavior.pagination` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `github` | `github.behavior.auth` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `github` | `github.behavior.typed-errors` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `github` | `github.behavior.optionality` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `github` | `github.behavior.unions` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `stripe` | `stripe.behavior.form` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `stripe` | `stripe.behavior.multipart` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `stripe` | `stripe.behavior.auth-typed-errors` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.behavior.typed-errors` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.behavior.auth` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.behavior.model-contracts` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.behavior.production-sse` | `null` | `n/a` | `n/a` | `9c6d42ebede0...` |
| `stress-streaming` | `stress.behavior.generated-sse` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.behavior.multipart-waiver` | `null` | `n/a` | `n/a` | `9c6d42ebede0...` |
| `runtime-core` | `runtime.behavior.js-lone-surrogate` | `null` | `n/a` | `n/a` | `9c6d42ebede0...` |
| `runtime-core` | `runtime.behavior.android-host` | `null` | `n/a` | `n/a` | `9c6d42ebede0...` |
| `github` | `github.compile.jvm` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `github` | `github.compile.non-jvm` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `stripe` | `stripe.compile.jvm` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `stripe` | `stripe.compile.non-jvm` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.compile.jvm` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.compile.representative-kmp` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `transport-ktor` | `ktor.transport.contract` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `transport-okhttp` | `okhttp.transport.contract` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `transport-java-http` | `java-http.transport.contract` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `github` | `github.source.portable` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `stripe` | `stripe.source.portable` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |
| `openrouter` | `openrouter.source.portable` | `null` | `n/a` | `n/a` | `c3288a9eec37...` |

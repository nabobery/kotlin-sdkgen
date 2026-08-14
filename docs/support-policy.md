# Support policy

Kotlin SDKGen `0.1.0` is a production-oriented preview published to Maven Central. This policy
describes support for published versions while the project remains in preview.

## Current state

- Semantic versioning applies to published coordinates. Preview releases may evolve quickly, but
  breaking changes will be called out in the changelog and release notes.
- The most recent minor release line receives bug fixes. Older preview lines are supported on a
  best-effort basis until the project adopts a formal long-term-support policy, if any.
- There is no service-level agreement (SLA) for issue response or fix turnaround at this stage of
  the project. Triage is best-effort.
- General support is provided through the public issue tracker. Security vulnerabilities use the
  verified private reporting channel documented in `SECURITY.md`.

Published releases are backed by the five-layer compatibility report (`sourceContract`,
`semanticModel`, `kotlinApi`, `behavior`, and `abi`) for the applicable release diff. Security fixes
are prioritized according to impact and maintainer availability; see `SECURITY.md` for private
reporting.

## What issues to file where

- Bugs, feature requests, and general questions: open a public GitHub issue.
- Suspected security vulnerabilities: use the private channel in `SECURITY.md`; never include
  exploit details in a public issue.
- Generated-SDK behavior for a specific consumer's own OpenAPI document: file against this
  repository only if the issue is in Kotlin SDKGen's generation/runtime, not the consumer's API
  itself.

## Credentials and live conformance

Per `docs/requirements.md` §14, Kotlin SDKGen processes API descriptions and should not require
production API keys to function. Any conformance test that does require live secrets (for example
against a real third-party API) must remain optional, isolated, redacted in output, and must
never run for untrusted/external pull requests. If you are asked to supply credentials to file a
support request, treat that as a red flag and report it through the security channel described in
`SECURITY.md` instead of a public issue.

## Operation coverage notes

The generated Stripe SDK does not cover every operation in Stripe's public API: 519 of 587 operations
(88.4%) are generated today, with 68 (11.6%) excluded. [ADR-0014](adr/0014-absent-additional-properties-on-form-objects-is-closed.md)
corrected the form-object rule so that an object with declared properties and an absent
`additionalProperties` keyword is treated as closed; this made the affected typed operations generatable
without introducing `Map<String, Any>`. The remaining exclusions represent request shapes that the typed
public API does not model.

The generated Stripe SDK is organized into 75 resource clients. For untagged operations,
[ADR-0017](adr/0017-skip-api-version-path-segments-when-grouping.md) derives the resource group from the
first non-version path segment. This is the coverage represented by `0.1.0`; it does not imply that excluded
operations are supported.

## Target/platform support notes

Refer to `runtime/README.md` and ADR-0011 for the current, corrected list of Kotlin Multiplatform
targets the runtime supports and which of those are full contract-test targets versus
compile-gate-only. Support requests for a target not listed there (for example Wasm, watchOS, or
tvOS) are feature requests for future scope, not currently-supported-target bugs.

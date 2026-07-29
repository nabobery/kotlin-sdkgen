# Support policy (draft)

**Status:** draft. Kotlin SDKGen has not published any release; the only "version" in existence
today is the in-repository `0.1.0-SNAPSHOT`. This policy describes intended support once releases
exist, and is explicit about what does not apply yet.

## Current state

- No published version exists. There is no version-support matrix to publish, and no semantic
  versioning guarantee is in force yet — the public API can and does change between commits.
- There is no service-level agreement (SLA) for issue response or fix turnaround at this stage of
  the project. Triage is best-effort.
- There is no dedicated, verified support or security contact channel yet. See `SECURITY.md` for
  the explicit TODO on vulnerability reporting; the same gap applies to general support requests
  — use the repository's public issue tracker until a dedicated channel is confirmed.

## Once releases begin (target policy)

This section states intent for after the first published release; it is not yet in effect.

- Semantic versioning will apply to every published coordinate from ADR-0008's eight-coordinate
  set. Breaking changes will be called out in release notes and, once compatibility reporting is complete, backed by
  the five-layer compatibility report (`sourceContract`, `semanticModel`, `kotlinApi`,
  `behavior`, `abi`) for that release diff.
- The most recent minor release line will receive bug fixes; older lines will be supported on a
  best-effort basis until a formal long-term-support (LTS) policy, if any, is adopted.
- Security fixes will be prioritized over feature work once a verified reporting channel exists
  (see `SECURITY.md`).

## What issues to file where

- Bugs, feature requests, and general questions: open a public GitHub issue.
- Suspected security vulnerabilities: do **not** include exploit details in a public issue until
  `SECURITY.md`'s reporting-channel TODO is resolved. See that file for the current guidance.
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

The generated Stripe SDK does not cover every operation in Stripe's public API: 426 of 587 operations
(72.6%) are generated today, with 161 (27.4%) excluded — most because their request bodies use dynamic/open
form keys, which this project's typed public API contract does not represent (see the anti-pattern against
`Map<String, Any>` in `AGENTS.md`). See
[`docs/conformance/evidence/stripe-operation-coverage.md`](conformance/evidence/stripe-operation-coverage.md) for the
exact breakdown, what "excluded" means, and how to reproduce the counts. This is not currently a
version-scoped support commitment — see "Current state" above — but is disclosed here so a consumer
evaluating this SDK is not surprised by it.

## Target/platform support notes

Refer to `runtime/README.md` and ADR-0011 for the current, corrected list of Kotlin Multiplatform
targets the runtime supports and which of those are full contract-test targets versus
compile-gate-only. Support requests for a target not listed there (for example Wasm, watchOS, or
tvOS) are feature requests for future scope, not currently-supported-target bugs.

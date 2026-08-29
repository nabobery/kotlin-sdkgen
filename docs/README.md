# Documentation

Kotlin SDKGen's public documentation is organized by what you are trying to accomplish.

## Get started

- Start with the [project README](../README.md) to generate and validate the bundled OpenRouter example.
- Read the [0.3.0 release notes](https://github.com/nabobery/kotlin-sdkgen/releases/tag/v0.3.0) and
  [changelog](../CHANGELOG.md#030---2026-08-23) before upgrading across the preview API changes.
- Read [CONTRIBUTING.md](../CONTRIBUTING.md) before proposing or implementing a change.
- Use the [support policy](support-policy.md) to choose the right place for questions, bugs, and security reports.

## Use Kotlin SDKGen

- [CLI contract](cli-contract-v1alpha1.md): commands, configuration, output, and exit behavior.
- [Runtime guide](../runtime/README.md): transports, Kotlin targets, and platform verification levels.
- [Publishing guide](publishing-guide.md): maintainer setup for Maven Central and the Gradle Plugin Portal.
- [Release runbook](release-runbook.md): the protected, tag-bound release procedure.

## Understand the design

- [Requirements](requirements.md): product and compatibility requirements.
- [Architecture decision records](adr/): durable architectural decisions and their consequences.
- [Design decisions](design-decisions.md): cross-cutting implementation policies.
- [Schema intersections and request-media variants](adr/0021-schema-intersection-and-request-media-variants.md):
  the strict composition and wire-encoding contracts introduced in 0.3.0.
- [Client configuration, compatible constructors, SSE payload projection, and Gradle consumer wiring](adr/0022-generated-client-configuration-and-sse-payloads.md):
  the consumer-facing contracts introduced in 0.4.0.
- [Threat model](threat-model.md): trust boundaries and release-security controls.
- [Industry research](research/industry-patterns.md): external patterns considered by the project.

## Conformance and examples

The [`conformance`](../conformance/) directory contains pinned real-world OpenAPI corpora, generated snapshots,
and executable consumers. Each corpus README explains its source, supported surface, and known limitations:

- [OpenRouter](../conformance/openrouter/README.md)
- [GitHub REST](../conformance/github/README.md)
- [Stripe](../conformance/stripe/README.md)

Files under the [conformance evidence index](conformance/evidence/README.md) include durable conformance inputs,
proof tables, generated matrices, and release-bound evidence packets. Each artifact documents its own scope and
freshness; a point-in-time matrix or incomplete compatibility report must not be treated as proof for a layer it
marks `notRun` or `unavailable`. The
[OpenRouter 0.2.0-to-0.3.0 packet](conformance/evidence/releases/v0.2.0-to-v0.3.0/openrouter/) is the first
cross-release example.

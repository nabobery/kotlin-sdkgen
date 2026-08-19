# Documentation

Kotlin SDKGen's public documentation is organized by what you are trying to accomplish.

## Get started

- Start with the [project README](../README.md) to generate and validate the bundled OpenRouter example.
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
- [Threat model](threat-model.md): trust boundaries and release-security controls.
- [Industry research](research/industry-patterns.md): external patterns considered by the project.

## Conformance and examples

The [`conformance`](../conformance/) directory contains pinned real-world OpenAPI corpora, generated snapshots,
and executable consumers. Each corpus README explains its source, supported surface, and known limitations:

- [OpenRouter](../conformance/openrouter/README.md)
- [GitHub REST](../conformance/github/README.md)
- [Stripe](../conformance/stripe/README.md)

Files under [`docs/conformance/evidence`](conformance/evidence/) are versioned inputs to compatibility checks and
build verification. They are current reproducibility evidence, not release-planning records.

Internal implementation plans, review notes, and point-in-time run logs are intentionally excluded from the public
documentation tree.

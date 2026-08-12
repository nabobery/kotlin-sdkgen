# Release readiness brief

This record summarizes the work that made Kotlin SDKGen's generated API and publication pipeline suitable
for a reviewed release candidate. It is an engineering archive, not an operational authorization to publish.

## Objectives

- Keep generated protocol machinery out of the consumer-facing Kotlin API.
- Validate generated SDK behavior against the OpenRouter, GitHub, and Stripe corpora.
- Produce complete Maven publications for every supported physical target.
- Require compatibility, benchmark, provenance, signing, and isolated-consumer evidence before publication.
- Bind remote publication to an immutable reviewed tag and protected GitHub environment.

## Result

The generator now keeps serializers, codec registries, and operation metadata internal while preserving the
documented client and model contracts. Release automation builds signed publications with sources, real Dokka
documentation, POM metadata, checksums, an aggregate SBOM, and provenance. Publication verification checks the
exact physical coordinate matrix and resolves clean external consumers from the staged repository.

Remote publication remains subject to the repository-owner controls documented in
[`release-runbook.md`](../../release-runbook.md).

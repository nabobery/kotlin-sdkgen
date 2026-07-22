# Stripe OpenAPI corpus

This directory contains an immutable snapshot of Stripe's public OpenAPI description for offline conformance testing.

## Snapshot

- **Retrieval URL:** <https://raw.githubusercontent.com/stripe/openapi/2717b8badae820e0bd64b420b7d96fe963a0e495/openapi/spec3.json>
- **Pinned commit:** `2717b8badae820e0bd64b420b7d96fe963a0e495`
- **Retrieval date:** 2026-07-20
- **SHA-256:** `e24a26de4188fd64dec4c043d5d3726277fdcb07556a493ea481c305b0a223d8`
- **Size:** 7,866,866 bytes
- **License:** MIT; the same-commit snapshot is stored in [`LICENSE`](LICENSE)
- **OpenAPI version:** 3.0.0

The license snapshot was retrieved from <https://raw.githubusercontent.com/stripe/openapi/2717b8badae820e0bd64b420b7d96fe963a0e495/LICENSE>.

## Updating

Treat the retrieval URL, pinned commit, digest, size, and OpenAPI version as one atomic record. To update this corpus, select a new immutable commit-pinned URL, retrieve the specification and license from that commit, verify the specification locally, and change all recorded values together.

Conformance tests use only the checked-in snapshot and never fetch this corpus from the network.

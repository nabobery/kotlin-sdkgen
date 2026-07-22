# GitHub REST OpenAPI corpus

This directory contains an immutable snapshot of the bundled GitHub REST API description for offline conformance testing.

## Snapshot

- **Retrieval URL:** <https://raw.githubusercontent.com/github/rest-api-description/3ac56be088d6fcac6feb513c2b89540765f10981/descriptions/api.github.com/api.github.com.yaml>
- **Pinned commit:** `3ac56be088d6fcac6feb513c2b89540765f10981`
- **Retrieval date:** 2026-07-20
- **SHA-256:** `350102b39f8575f9ef0eb7db96fc2f80f5cbfefbfbaf64d243bc696348d00b63`
- **Size:** 9,718,738 bytes
- **License:** MIT; the same-commit snapshot is stored in [`LICENSE.md`](LICENSE.md)
- **OpenAPI version:** 3.0.3

The license snapshot was retrieved from <https://raw.githubusercontent.com/github/rest-api-description/3ac56be088d6fcac6feb513c2b89540765f10981/LICENSE.md>.

## Approved code-search runtime overlay

[`overlays/code-search-runtime-semantics.yaml`](overlays/code-search-runtime-semantics.yaml) is a narrow,
SHA-256-pinned OpenAPI Overlay 1.1.0 applied only to `GET /search/code`. Its two actions add the
`githubBearer` HTTP bearer scheme at `/components` and require that scheme while adding
`headerNextUrl` pagination with `responseItems: /items` at
`/paths/~1search~1code/get`. The raw `openapi.yaml` remains the byte-identical source snapshot above.

The source evidence is pinned to GitHub REST API description commit
[`3ac56be088d6fcac6feb513c2b89540765f10981`](https://raw.githubusercontent.com/github/rest-api-description/3ac56be088d6fcac6feb513c2b89540765f10981/descriptions/api.github.com/api.github.com.yaml):

- `/paths/~1search~1code/get/description` explicitly says that code search requires authentication,
  is limited to 10 requests per minute, and returns up to 100 results per page.
- `/paths/~1search~1code/get/responses/200/content/application~1json/schema/properties/items`
  supplies the returned result collection used by the `/items` pointer.

The overlay records only provider facts established by that pinned prose and response shape. GitHub's
[REST authentication guidance](https://docs.github.com/en/rest/authentication/authenticating-to-the-rest-api)
documents bearer-token authentication, and its
[pagination guidance](https://docs.github.com/en/rest/using-the-rest-api/using-pagination-in-the-rest-api)
documents following the response `Link` header's `rel="next"` URL.

## Updating

Treat the retrieval URL, pinned commit, digest, size, and OpenAPI version as one atomic record. To update this corpus, select a new immutable commit-pinned URL, retrieve the specification and license from that commit, verify the specification locally, and change all recorded values together.

Conformance tests use only the checked-in snapshot and never fetch this corpus from the network.

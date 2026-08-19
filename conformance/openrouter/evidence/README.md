# OpenRouter execution evidence

`consumer-execution-evidence.json` is a historical Phase 3 T3b artifact. It records a point-in-time consumer-suite
run against an earlier OpenRouter corpus snapshot and is retained for provenance only.

The repository has no producer task or reader for this JSON, so it is not refreshed as part of corpus regeneration.
Current execution evidence comes from the CI consumer-test lanes (`:conformance:openrouter:consumer:jvmTest` and
`:conformance:openrouter:consumer:jsNodeTest`) and the cross-corpus `:conformance:parity:liveParity` run records.
Those records are authoritative for the current pinned source, overlay, generated snapshot, and test results.

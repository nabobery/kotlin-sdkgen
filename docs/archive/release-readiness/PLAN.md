# Release readiness plan

## Delivery sequence

1. Freeze the intended generated Kotlin surface and record compatibility evidence.
2. Regenerate and execute the supported conformance corpora.
3. Establish ABI, benchmark, drift, and publication-verification gates.
4. Build and inspect the complete isolated Maven repository.
5. Rehearse signing, documentation, SBOM generation, and clean-consumer resolution.
6. Require an immutable release tag, the complete verification workflow, and protected-environment approval
   before any remote publication.

## Release boundary

The release workflow accepts only an exact semantic version whose `v<version>` tag resolves to the workflow's
commit and is contained in `main`. Verification is credential-free. Signing and registry credentials are
available only to the protected publication job and only to the steps that consume them.

## Completion criteria

- Generated API compatibility reports contain only reviewed changes.
- All supported corpora and target families pass their applicable gates.
- Every physical Maven coordinate has its expected binary, sources, Dokka documentation, POM, checksums, and
  signatures in release mode.
- The isolated consumer build resolves without project substitution, Maven Local, or undeclared repositories.
- Central publication completes before the dependent Gradle plugin is published.
- Repository security and environment protections are enabled by an authorized owner.

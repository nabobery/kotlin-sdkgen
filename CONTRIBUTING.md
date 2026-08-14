# Contributing to Kotlin SDKGen

Thank you for helping improve Kotlin SDKGen. Contributions should be focused, tested, and preserve
the generator's deterministic and strongly typed contracts.

## Before opening an issue

- Search existing issues and documentation.
- Use the bug report form for reproducible defects and include a minimal OpenAPI fixture whenever possible.
- Use the feature request form for a concrete user problem and the smallest proposed solution.
- Report vulnerabilities through
  [GitHub private vulnerability reporting](https://github.com/nabobery/kotlin-sdkgen/security/advisories/new),
  never in a public issue.

## Development setup

Kotlin SDKGen requires JDK 17. JavaScript checks use the Node.js 24 LTS line recorded in [`.nvmrc`](.nvmrc);
using the same major version keeps the npm lockfile reproducible. Some target-specific checks also require Chrome,
the Android SDK, or Xcode. Start with:

```bash
./gradlew check
./gradlew ktlintCheck
```

The complete conformance matrix is resource intensive. Follow the resource limits and focused
commands in [`AGENTS.md`](AGENTS.md) before running corpus-scale generation locally.

## Making a change

1. Keep the change limited to one problem.
2. Add a regression test before or alongside the implementation.
3. Preserve deterministic output and update golden files only when the contract change is intentional.
4. Document public APIs with KDoc when their purpose, invariants, failure behavior, or lifecycle is
   not self-evident.
5. Avoid untyped fallbacks, editable generated regions, platform APIs in `commonMain`, and fully
   qualified names where an import is clearer.
6. Run the narrowest relevant tests, then lint and API checks for affected public modules.

Formatting follows Kotlin's official style with a 120-character line limit and trailing commas.
Public APIs are compiled with explicit API mode.

## Pull requests

Pull requests should explain:

- the user-visible problem;
- the chosen behavior and relevant tradeoffs;
- the verification performed;
- any generated API, ABI, configuration, manifest, or publication impact.

CI checks production modules, formatting, and public API baselines. Corpus-scale conformance and
publication checks remain part of the release gate and may also be requested for changes that
affect generation semantics.

By contributing, you agree that your contribution is licensed under the repository's
[Apache License 2.0](LICENSE) and that you will follow the
[Code of Conduct](CODE_OF_CONDUCT.md).

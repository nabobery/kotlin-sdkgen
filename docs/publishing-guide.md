# Publishing guide

> **Implementation status:** Complete POM metadata, reproducible javadoc jars, in-memory PGP signing, CycloneDX
> SBOM generation, Central Portal aggregation, Gradle Plugin Portal publication, GitHub artifact attestation, and
> a protected manual release workflow are implemented. Release-specific status belongs in the corresponding
> GitHub Release and workflow record rather than this guide.

This is the guide for actually setting up credentials and publishing Kotlin SDKGen's artifacts. It is
written for the project owner, not for a contributor. It complements — and does not duplicate —
[`docs/release-runbook.md`](release-runbook.md), which is the procedural runbook for what a release does
once everything below is in place. Read this document first if nothing has ever been published; read the
runbook for the step-by-step mechanics of cutting a release once it has.

**Standard:** every step below either works today (and says so, with the exact command) or is explicitly
marked as blocked on code that does not exist yet, with a link to the evidence. Nothing here describes a
step as ready when it is not.

## 0. The honest starting point

The build-side publication stack is present. A real publish still fails closed until the protected release
environment supplies Central, signing, and Plugin Portal credentials. `release-verification.yml` remains
credential-free and never publishes; `.github/workflows/release.yml` is the only remote-publication path.

- `-PsdkgenRelease=true` requires `GPG_SIGNING_KEY` and `GPG_SIGNING_PASSPHRASE`.
- The protected workflow opts Nmcp into an `AUTOMATIC` Central deployment and waits up to 30 minutes for
  `PUBLISHED` before the Gradle Plugin Portal step can start. Other invocations retain the safer
  `USER_MANAGED` default.
- `com.gradle.plugin-publish` provides `validatePlugins` and `publishPlugins` for the Gradle plugin.
- CycloneDX generates the SBOM and GitHub attests the staged release artifacts in the protected workflow.

The safest first step is the isolated local-repository staging rehearsal. It verifies the eight ADR-0008 coordinates
and Gradle plugin marker, rejects internal-coordinate leakage, and validates publication metadata and the staged
artifact inventory. Section 5 contains the reproducible commands.

The structure of the rest of this guide: what must be true before a first publish (§1), how to set up each
credential (§2), the recommended release mechanism and why (§3), the version/release flow (§4), the dry-run
commands that work right now (§5), and the release checklist (§6).

## 1. Prerequisites checklist

In dependency order. "Code" means a change to this repository; "account" means something the owner does
externally (no code change).

| #   | Prerequisite                                                                        | Type               | Status                                 | Blocked on                                                                                                                                                                         |
| --- | ----------------------------------------------------------------------------------- | ------------------ | -------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1   | `ANDROID_HOME` set (Android SDK installed)                                          | account/env        | required today                         | The publish graph pulls in `runtime:core`'s Android variant. CI provisions it with `android-actions/setup-android`; a human running this locally must set it themselves.           |
| 2   | POM metadata (`pom { }` block: license, developers, SCM URL)                        | code               | complete                               | Applied to every ADR-0008 Maven publication                                                                                                                                        |
| 3   | GPG signing wired into the build (`signing` plugin)                                 | code               | complete                               | In-memory signing; release mode fails closed without credentials                                                                                                                   |
| 4   | Dokka documentation jar task                                                        | code               | complete                               | Reproducible, non-empty Dokka HTML jar attached with the `javadoc` classifier to every product publication                                                                         |
| 5   | Central Portal namespace verification (`io.github.nabobery`, decision already made) | account            | maintainer verified                    | See §2, "Maven Central"                                                                                                                                                            |
| 6   | Central Portal user token generated                                                 | account/credential | required for publication               | Depends on #5                                                                                                                                                                      |
| 7   | GPG key pair generated, public key published to a keyserver                         | account/credential | maintainer verified; signing rehearsed | The protected rehearsal proves the private key and passphrase pair works                                                                                                           |
| 8   | Central Portal publishing plugin applied (Nmcp)                                     | code               | complete                               | Nmcp 1.6.1; `USER_MANAGED` by default, with tag-bound release opting into `AUTOMATIC` and a bounded wait                                                                           |
| 9   | `com.gradle.plugin-publish` applied to `integrations/gradle-plugin`                 | code               | complete                               | Plugin Portal 2.1.1; `validatePlugins` is rehearsed                                                                                                                                |
| 10  | Gradle Plugin Portal account + API key/secret                                       | account/credential | required for publication               | Verify each released version independently                                                                                                                                         |
| 11  | SBOM (CycloneDX)                                                                    | code               | complete                               | CycloneDX 3.3.0 aggregate BOM                                                                                                                                                      |
| 12  | Provenance attestation wiring (`actions/attest-build-provenance`)                   | code               | complete                               | Immutable v4.1.0 action SHA in `release.yml`                                                                                                                                       |
| 13  | GitHub Environment with required reviewer, scoped publish secrets                   | account/CI config  | complete                               | The maintainer is the required reviewer with self-review allowed for solo operation; administrator bypass is disabled, the `main`/`v*` policy is active, and all six secrets exist |

The remaining unchecked items are release-specific verification and publication steps.

## 2. Credential setup

**Never write a real secret value into this repository, a commit message, an issue, a PR, or any file under
version control.** Every value below is a placeholder. Store real values only in GitHub Environment
secrets (for CI) or in `~/.gradle/gradle.properties` (for local testing), which is outside the repo and
already gitignored by convention (verify it is not accidentally tracked before pasting anything into it).

### Maven Central (Central Portal, `central.sonatype.com`)

OSSRH is dead (sunset 2025-06-30); Central Portal is the only path now.

**Namespace decision — already made, recorded here for the credential-setup step:**

The group is `io.github.nabobery` (see ADR-0008's amendment and ADR-0009's amendment for the full
rationale). `com.nabobery` — a reverse-DNS group — would have required proving ownership of the
`nabobery.com`/`nabobery.dev`/etc. domain to Central Portal via a DNS TXT record, and the owner does not
control a matching domain. `io.github.nabobery` is verified instead through GitHub account ownership, which
the owner already has. `sdkgen.publishing.gradle.kts` now sets `group = "io.github.nabobery"`, and every
published coordinate is `io.github.nabobery:kotlin-sdkgen-*`. Nothing had been published under the old
`com.nabobery` group when this changed, so there is no existing consumer to migrate and no relocation POM to
maintain.

1. Create an account at `central.sonatype.com`.
2. Add and verify the `io.github.nabobery` namespace (GitHub verification).
3. Generate a **user token** (Account → Generate User Token). This produces a token username and token
   password pair — distinct from your Central Portal login password.
4. Store it:
    - **GitHub secret names:** `MAVEN_CENTRAL_USERNAME`, `MAVEN_CENTRAL_PASSWORD`
    - **Local testing** (`~/.gradle/gradle.properties`, outside this repo):

        ```properties
        mavenCentralUsername=<PLACEHOLDER_TOKEN_USERNAME>
        mavenCentralPassword=<PLACEHOLDER_TOKEN_PASSWORD>
        ```

    These property names match the applied Nmcp plugin and the protected workflow's environment-variable bridge.

### GPG signing key

1. Generate a dedicated release key (do not reuse a personal email key for this if avoidable):

    ```bash
    gpg --full-generate-key
    ```

    Choose RSA 4096, and **set an expiration date** (e.g. 2 years) rather than "never" — an expiring key
    forces a deliberate rotation decision instead of an indefinite standing credential.
2. Publish the public key to a keyserver so Central can verify signatures against it:

    ```bash
    gpg --keyserver keyserver.ubuntu.com --send-keys <KEY_ID>
    ```

3. Export the armored private key for use as a CI secret:

    ```bash
    gpg --export-secret-keys --armor <KEY_ID> > release-signing-key.asc
    ```

    Treat `release-signing-key.asc` as a secret file the moment it is created. Delete it from local disk once
    it is loaded into the GitHub Environment secret store; never commit it, attach it to an issue, or paste it
    into chat.
4. Passphrase handling: choose a strong passphrase when generating the key. It is a second secret, stored
   separately from the key material — never derive it from, or store it alongside, the same value as the
   key export.
5. Store both:
    - **GitHub secret names:** `GPG_SIGNING_KEY` (the full armored private key contents), `GPG_SIGNING_PASSPHRASE`
    - **Local testing** (`~/.gradle/gradle.properties`):

        ```properties
        signing.keyId=<PLACEHOLDER_LAST_8_HEX_OF_KEY_ID>
        signing.password=<PLACEHOLDER_PASSPHRASE>
        signing.secretKeyRingFile=<PLACEHOLDER_PATH_TO_LOCAL_SECRING>
        ```

        or, using Gradle's in-memory signing form (works without a keyring file, which fits CI better):

        ```properties
        signingInMemoryKey=<PLACEHOLDER_ARMORED_PRIVATE_KEY>
        signingInMemoryKeyPassword=<PLACEHOLDER_PASSPHRASE>
        ```

    These are the conventional Gradle `signing` plugin property names. The applied publishing convention also
    accepts the `GPG_SIGNING_KEY` and `GPG_SIGNING_PASSPHRASE` environment variables used by CI.
6. The private key and passphrase must never enter the repository at any point — not in a commit, not in a
   throwaway branch, not in a `.gitignore`d file that gets force-added, not in a build script default. Per
   `docs/release-runbook.md`, only ever rehearse with a separate throwaway key, never this one.

### Gradle Plugin Portal

Prerequisite #9 (`com.gradle.plugin-publish`) is applied. A real `publishPlugins` invocation requires these
credentials and the tag-bound protected-workflow authorization described in §3.

1. Create an account at `plugins.gradle.org` and register as a publisher.
2. Generate an API key/secret pair from the portal's account settings.
3. Store it:
    - **GitHub secret names:** `GRADLE_PUBLISH_KEY`, `GRADLE_PUBLISH_SECRET`
    - **Local testing** (`~/.gradle/gradle.properties`):

        ```properties
        gradle.publish.key=<PLACEHOLDER_API_KEY>
        gradle.publish.secret=<PLACEHOLDER_API_SECRET>
        ```

    These are the exact property names `com.gradle.plugin-publish` reads by convention.

### Credential summary

| Credential           | GitHub secret name(s)                              | Local property (in `~/.gradle/gradle.properties`)  |
| -------------------- | -------------------------------------------------- | -------------------------------------------------- |
| Central Portal token | `MAVEN_CENTRAL_USERNAME`, `MAVEN_CENTRAL_PASSWORD` | `mavenCentralUsername`, `mavenCentralPassword`     |
| GPG signing key      | `GPG_SIGNING_KEY`, `GPG_SIGNING_PASSPHRASE`        | `signingInMemoryKey`, `signingInMemoryKeyPassword` |
| Gradle Plugin Portal | `GRADLE_PUBLISH_KEY`, `GRADLE_PUBLISH_SECRET`      | `gradle.publish.key`, `gradle.publish.secret`      |

## 3. The recommended release mechanism

**Implemented mechanism: credential-free rehearsal plus tag-bound publication through a protected GitHub
Environment.** `release-verification.yml` is the manual rehearsal path. `release.yml` has no dry-run switch:
it accepts only a dispatch from the matching `v<version>` tag on `main`, calls the complete verification
workflow for that exact SHA, and only then makes the Environment-protected publish job eligible.

Reasoning, so you can disagree with an informed view:

- **Maven Central is immutable.** A published `groupId:artifactId:version` can never be replaced or
  withdrawn (`docs/release-runbook.md`, "Core invariant"). The trigger for an irreversible action must be
  deliberate and hard to fire by accident. A tag push is a deliberate, named act ("I am releasing 1.2.0");
  a branch push (including to `main`) happens as a side effect of routine merges and is exactly the kind of
  accidental trigger this invariant rules out.
- **A separate credential-free rehearsal workflow** lets the owner exercise the full verification pipeline
  against an isolated local repository without any release secret or remote-upload step in its graph.
- **A GitHub Environment with a required reviewer** means the publish credentials are not even exposed to
  the job until a human explicitly approves the run. This is the last gate before an irreversible action,
  and it is enforced by GitHub itself, not by application logic that could have a bug.
- **Publish credentials scoped to the publish job and consuming step only**, with `contents: read` at workflow level (matching
  the least-privilege pattern already used in `.github/workflows/drift.yml` and
  `release-verification.yml`). No other job in the workflow should be able to read the signing key or
  Central token.
- **Provenance via `actions/attest-build-provenance`** needs `id-token: write` plus `attestations: write`,
  granted only to the publish job — the same narrow-scoping principle.
- **Honest caveat:** Maven Central does not currently support OIDC trusted publishing the way PyPI and npm
  do. There is no way to avoid a long-lived token entirely; a protected Environment with a required reviewer
  is the available mitigation, not a full replacement for short-lived credentials.

**Why not publish-on-every-merge:** irreversibility. A bad merge to `main` would become a permanent, unfixable
Central release. There is no "revert and republish the old version" — only "publish a new patch," which
still leaves the bad version live forever. Automatic-on-merge removes the deliberate-action property that
makes an immutable-publish system survivable.

**Why not fully-manual-local:** three concrete losses — (1) no provenance attestation, since that requires
the CI identity/OIDC context a laptop run does not have; (2) no reproducibility guarantee, since a laptop
build depends on whatever is locally checked out, cached, or configured, not a clean checkout of an
immutable tag; (3) signing key material ends up on a developer laptop rather than a scoped CI secret store,
which is a materially worse blast radius if that laptop is compromised.

The workflow is implemented in `.github/workflows/release.yml`. Before the first real publication, add a
required reviewer to the `release` environment and confirm its `main`/`v*` deployment policy.
Create the protected `v<version>` tag from the reviewed `main` commit before dispatching the workflow; the
workflow refuses a branch ref, a mismatched version, or a tag whose commit is not on `origin/main`.

## 4. Version and release flow

The default development version is stored in `gradle.properties` as `sdkgenVersion`.

- **SNAPSHOT versions** (`-SNAPSHOT` suffix) are for local/CI iteration only. Maven Central **rejects
  SNAPSHOT publications** outright — a real release must bump `sdkgenVersion` to a plain release version
  (for example, `0.2.1`) before publishing.
- **Version validation:** `release.yml` validates its required version input against the strict
  `^[0-9]+\.[0-9]+\.[0-9]+(-[0-9A-Za-z][0-9A-Za-z.-]*)?$` grammar and rejects SNAPSHOT versions before
  using the quoted value in any Gradle argument. It also requires the selected ref to be the matching
  `v<version>` tag and verifies that tag's SHA is on `origin/main` before invoking the release gate.
- Never reuse a version number, even privately pushed to a shared remote, even to "fix" a bad release
  (`docs/release-runbook.md`, "Core invariant" and "Rollback").

## 5. Dry-run and verification — what actually works today

These commands staged 1,190 artifacts, verified exactly the eight ADR-0008 coordinates plus the plugin
marker, detected no internal-coordinate leakage, and passed both verification tasks.

```bash
# ANDROID_HOME must be set first — the publish graph pulls in runtime:core's Android variant.
export ANDROID_HOME="$HOME/Library/Android/sdk"   # adjust to your local SDK install

# 1. Publish every ADR-0008 coordinate to an isolated local file repository — never a remote one.
#    The init script redirects maven-publish away from any remote target entirely.
./gradlew --no-daemon --max-workers=1 -Dorg.gradle.parallel=false \
  -Pkotlin.compiler.execution.strategy=in-process \
  -PpublicationRepository=build/publication-repository \
  --init-script conformance/publication/publish-to-isolated-repository.init.gradle.kts \
  publish

# 2. Verify POM/module metadata: exactly the eight ADR-0008 coordinates, no leaked internal
#    (generator:model, generator:openapi, build-logic) project coordinate anywhere.
./gradlew --no-daemon --max-workers=1 -Dorg.gradle.parallel=false \
  -Pkotlin.compiler.execution.strategy=in-process \
  -PpublicationRepository=build/publication-repository \
  :conformance:publication:verifyPublicationMetadata

# 3. Generate and verify the staged-artifact inventory (SHA-256 recomputed from disk for every
#    staged file; fails closed on a missing coordinate, missing file, or checksum mismatch).
./gradlew --no-daemon --max-workers=1 -Dorg.gradle.parallel=false \
  -Pkotlin.compiler.execution.strategy=in-process \
  -PpublicationRepository=build/publication-repository \
  :conformance:publication:generateStagedArtifactInventory \
  :conformance:publication:verifyStagedArtifactInventory
```

To rehearse a specific release-candidate version rather than the development SNAPSHOT, add
`-PsdkgenVersion=<version>` to every one of the three commands above (all three must agree — each
`./gradlew` invocation is a fresh process with `--no-daemon`, so the property does not carry over between
them).

Everything above can also be dispatched as a single run via the existing manual-only workflow:

```bash
gh workflow run release-verification.yml -f release_candidate_version=<version-or-blank>
```

`.github/workflows/release-verification.yml` composes these same steps (plus the full build/check/ktlint/
`apiCheck` gate, the cross-corpus parity gate, and the benchmark-budget check) for direct `workflow_dispatch`
rehearsals and as the reusable gate called by `release.yml`. It never touches a credential, never signs anything,
and never targets a remote repository — confirmed by its own
header comment and by `permissions: contents: read` at both workflow and job scope.

The credential-free rehearsal does not sign or attest artifacts. After that same gate passes for a tagged
release SHA, the protected `release.yml` job adds release-mode signing, per-coordinate Dokka/POM validation,
the aggregate SBOM, deterministic bundle creation, artifact upload, and provenance attestation before it
reaches either portal. Only an explicitly authorized publication can prove those external boundaries for a version.

## 6. Release checklist

Ordered; each step assumes the previous ones are done.

1. [x] Verify the `io.github.nabobery` Central Portal namespace (GitHub verification; already decided) — §2.
2. [x] Add complete POM metadata to every publication.
3. [x] Produce a reproducible `-javadoc.jar` for every publication.
4. [x] Apply release-gated in-memory signing so every publication is signed.
5. [x] Confirm the working GPG release key's public key is on a keyserver. The protected rehearsal has
       verified the private-key/passphrase secrets without exposing them.
6. [x] Verify and register the chosen Central Portal namespace; generate the user token (§2).
7. [x] Make the protected release opt into Nmcp `AUTOMATIC` mode and wait for `PUBLISHED` before publishing the plugin.
8. [x] Generate an aggregate CycloneDX SBOM.
9. [x] Confirm Plugin Portal publisher ownership and credential availability.
10. [x] Add a required reviewer to the existing GitHub `release` Environment and confirm its `main`/`v*`
        deployment policy.
11. [x] Choose the real release version for the protected workflow's `version` input (§4); never reuse a
        version already published to either portal.
12. [x] Run the full verification gate: `./gradlew build check ktlintCheck apiCheck`, the cross-corpus parity gate,
        and the current compatibility report for the release diff (`docs/release-runbook.md`, "Real
        release" step 3).
13. [x] Run the §5 rehearsal against the release version specifically (not a prior SNAPSHOT) — artifact
        identity, signatures, and any SBOM are version-specific.
14. [x] Consume every published coordinate from a clean, isolated external build (no Maven Local fallback,
        no project substitution) to prove the graph resolves independently.
15. [x] Create the protected `v<version>` tag on the reviewed `main` commit, dispatch `release.yml` from
        that tag with the matching `version`, then obtain the required-reviewer approval on the Environment.
16. [ ] Confirm the Maven Central deployment and Gradle Plugin Portal publication succeed for this version.
17. [x] Verify the workflow's GitHub provenance attestation and confirm the matching protected tag.
18. [ ] Publish release notes summarizing the effective contract diff (`sdkgen diff`/`sdkgen explain`), the
        applied-overlay report, and the conformance/waiver summary (`docs/release-runbook.md` step 7).
19. [ ] **Post-publish verification:** resolve every published coordinate from a fresh, unrelated project
        (not this repository) against the real Central repository, confirm the version and checksums match what
        was staged, and confirm the artifact is visible on `central.sonatype.com` and (if published) on
        `plugins.gradle.org`.
20. [ ] Publish the version's release record and retain links to the successful workflows and attestations.

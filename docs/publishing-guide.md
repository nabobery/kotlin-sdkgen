# Publishing guide

This is the guide for actually setting up credentials and publishing Kotlin SDKGen's artifacts. It is
written for the project owner, not for a contributor. It complements — and does not duplicate —
[`docs/release-runbook.md`](release-runbook.md), which is the procedural runbook for what a release does
once everything below is in place. Read this document first if nothing has ever been published; read the
runbook for the step-by-step mechanics of cutting a release once it has.

**Standard:** every step below either works today (and says so, with the exact command) or is explicitly
marked as blocked on code that does not exist yet, with a link to the evidence. Nothing here describes a
step as ready when it is not.

## 0. The honest starting point

If you run a real publish today, it will fail, and it should — the required inputs do not exist yet. Before
following any credential-setup step below, understand what is missing:

- **No signing.** `grep -rni signing build-logic/src/main/kotlin` returns nothing. There is no `signing`
  plugin application anywhere in the build. Maven Central requires every artifact to carry a GPG/PGP
  signature (`.asc`); without this, upload is rejected outright.
- **No POM metadata.** `sdkgen.publishing.gradle.kts` has no `pom { }` block — no license, no developers, no
  SCM URL. Central **rejects** publications missing license, developer, and SCM info. This is a hard
  blocker, not a nicety.
- **No javadoc/Dokka jar.** Central also requires a `-javadoc.jar` (it does not have to contain real API
  docs, but it must exist) alongside every `-sources.jar`. Nothing in `build-logic` produces one.
- **No SBOM, no provenance attestation.** Both remain explicit release blockers.
- **No Central Portal publishing plugin wired.** The plan referenced Nmcp (`gradleup.com/nmcp`) as the
  intended aggregator for `central.sonatype.com`, but it is not applied anywhere in this tree today.
- **`com.gradle.plugin-publish` is not applied.** `integrations/gradle-plugin/build.gradle.kts` only applies
  `java-gradle-plugin` and `sdkgen.publishing`, so `validatePlugins` and `publishPlugins` — the Gradle Plugin
  Portal tasks — do not exist as tasks in this tree.

**What does work today**, and is the most useful part of this guide: the isolated local-repository staging
rehearsal. It was executed for real during release readiness closure — 1,190 artifacts staged, exactly the 8 ADR-0008
coordinates (plus the Gradle plugin marker), zero internal-coordinate leakage, `verifyPublicationMetadata`
and `verifyStagedArtifactInventory` both green. Section 5 contains the reproducible commands.

The structure of the rest of this guide: what must be true before a first publish (§1), how to set up each
credential (§2), the recommended release mechanism and why (§3), the version/release flow (§4), the dry-run
commands that work right now (§5), and a first-release checklist (§6).

## 1. Prerequisites checklist

In dependency order. "Code" means a change to this repository; "account" means something the owner does
externally (no code change).

| # | Prerequisite | Type | Status | Blocked on |
| - | --- | --- | --- | --- |
| 1 | `ANDROID_HOME` set (Android SDK installed) | account/env | required today | The publish graph pulls in `runtime:core`'s Android variant. The first release readiness rehearsal attempt failed with `SDK location not found` before this was set. CI already provisions it (`android-actions/setup-android` in `release-verification.yml`); a human running this locally must set it themselves. |
| 2 | POM metadata (`pom { }` block: license, developers, SCM URL) | code | missing | `sdkgen.publishing.gradle.kts` — no `pom { }` block exists |
| 3 | GPG signing wired into the build (`signing` plugin) | code | missing | `sdkgen.publishing.gradle.kts` — no `signing` plugin application |
| 4 | Javadoc/Dokka jar task | code | missing | No Dokka application anywhere in `build-logic` |
| 5 | Central Portal namespace decision + verification | account | not started | See §2, "Maven Central" — a real decision with a domain-proof trade-off |
| 6 | Central Portal user token generated | account/credential | not started | Depends on #5 |
| 7 | GPG key pair generated, public key published to a keyserver | account/credential | not started | Independent of the others; can be done any time |
| 8 | Central Portal publishing plugin applied (e.g. Nmcp) | code | missing | No Central Portal publishing plugin is applied |
| 9 | `com.gradle.plugin-publish` applied to `integrations/gradle-plugin` | code | missing | Needed only for the Gradle plugin coordinate, not the other seven |
| 10 | Gradle Plugin Portal account + API key/secret | account/credential | not started | Only needed once #9 lands |
| 11 | SBOM decision (CycloneDX plugin, or an explicit decision not to ship one) | code + decision | deferred, flagged | Decide explicitly before the first public release |
| 12 | Provenance attestation wiring (`actions/attest-build-provenance`) | code | missing | No SLSA/attestation tooling anywhere in `build-logic` or `.github/workflows` |
| 13 | GitHub Environment with required reviewer, scoped publish secrets | account/CI config | not started | See §3 |

Items 1 and 7 can be done today without touching code. Everything else that is marked "code" blocks a real
publish and has no workaround — do not attempt to publish to Maven Central until items 2–4 exist, or Central
will reject the upload.

## 2. Credential setup

**Never write a real secret value into this repository, a commit message, an issue, a PR, or any file under
version control.** Every value below is a placeholder. Store real values only in GitHub Environment
secrets (for CI) or in `~/.gradle/gradle.properties` (for local testing), which is outside the repo and
already gitignored by convention (verify it is not accidentally tracked before pasting anything into it).

### Maven Central (Central Portal, `central.sonatype.com`)

OSSRH is dead (sunset 2025-06-30); Central Portal is the only path now.

**Namespace decision — a real trade-off, not a formality:**

- **`com.nabobery`** (what ADR-0008 and the current `group = "com.nabobery"` in `sdkgen.publishing.gradle.kts`
  already assume): requires proving ownership of the `nabobery.com`/`nabobery.dev`/etc. domain to Central
  Portal, typically via a DNS TXT record. If the owner does not control a domain matching this reverse-DNS
  namespace, this path is not available without acquiring one.
- **`io.github.<username>`** (e.g. `io.github.nabobery`, if that's the owner's GitHub handle): verified by
  proving control of the GitHub account instead of DNS — much faster to set up, no domain purchase needed.
  The trade-off: every published coordinate changes from `com.nabobery:kotlin-sdkgen-*` to
  `io.github.<username>:kotlin-sdkgen-*`, which is a breaking coordinate change for any consumer who already
  depends on the `com.nabobery` group (there are none yet, since nothing has been published, so this is the
  cheapest possible time to make this decision).

Decide before generating a token, since the token is scoped to a verified namespace.

1. Create an account at `central.sonatype.com`.
2. Add and verify the chosen namespace (DNS TXT record for a domain, or GitHub verification for
   `io.github.<username>`).
3. Generate a **user token** (Account → Generate User Token). This produces a token username and token
   password pair — distinct from your Central Portal login password.
4. Store it:
   - **GitHub secret names:** `MAVEN_CENTRAL_USERNAME`, `MAVEN_CENTRAL_PASSWORD`
   - **Local testing** (`~/.gradle/gradle.properties`, outside this repo):
     ```properties
     mavenCentralUsername=<PLACEHOLDER_TOKEN_USERNAME>
     mavenCentralPassword=<PLACEHOLDER_TOKEN_PASSWORD>
     ```
   These property names match what the Nmcp plugin (the aggregator referenced in the publishing configuration) expects
   by convention; confirm against whichever plugin actually gets applied when item 8 above lands, since the
   plugin is not wired yet and the exact property names are not yet load-bearing anywhere in this build.

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
   These are the conventional Gradle `signing` plugin property names; they become load-bearing only once the
   `signing` plugin is actually applied (prerequisite #3), which has not happened yet.
6. The private key and passphrase must never enter the repository at any point — not in a commit, not in a
   throwaway branch, not in a `.gitignore`d file that gets force-added, not in a build script default. Per
   `docs/release-runbook.md`, only ever rehearse with a separate throwaway key, never this one.

### Gradle Plugin Portal

Only needed once prerequisite #9 (`com.gradle.plugin-publish`) is applied — until then there is no
`publishPlugins` task to authenticate for.

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

| Credential | GitHub secret name(s) | Local property (in `~/.gradle/gradle.properties`) |
| --- | --- | --- |
| Central Portal token | `MAVEN_CENTRAL_USERNAME`, `MAVEN_CENTRAL_PASSWORD` | `mavenCentralUsername`, `mavenCentralPassword` |
| GPG signing key | `GPG_SIGNING_KEY`, `GPG_SIGNING_PASSPHRASE` | `signingInMemoryKey`, `signingInMemoryKeyPassword` |
| Gradle Plugin Portal | `GRADLE_PUBLISH_KEY`, `GRADLE_PUBLISH_SECRET` | `gradle.publish.key`, `gradle.publish.secret` |

## 3. The recommended release mechanism

**Recommendation: tag-triggered release, plus `workflow_dispatch` for rehearsal, publishing through a
protected GitHub Environment with a required reviewer.**

Reasoning, so you can disagree with an informed view:

- **Maven Central is immutable.** A published `groupId:artifactId:version` can never be replaced or
  withdrawn (`docs/release-runbook.md`, "Core invariant"). The trigger for an irreversible action must be
  deliberate and hard to fire by accident. A tag push is a deliberate, named act ("I am releasing 1.2.0");
  a branch push (including to `main`) happens as a side effect of routine merges and is exactly the kind of
  accidental trigger this invariant rules out.
- **A tag is an immutable ref**, so the release is reproducible from exactly what was tagged — no ambiguity
  about "which commit did we actually publish" months later.
- **`workflow_dispatch` with a `dry_run` input defaulting to `true`** lets the owner rehearse the full
  pipeline against the isolated local repository (the same mechanics `release-verification.yml` already
  exercises) without any risk of a real upload — the dry-run path should structurally never touch a
  credential-gated step.
- **A GitHub Environment with a required reviewer** means the publish credentials are not even exposed to
  the job until a human explicitly approves the run. This is the last gate before an irreversible action,
  and it is enforced by GitHub itself, not by application logic that could have a bug.
- **Publish credentials scoped to the publish job only**, with `contents: read` at workflow level (matching
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

This recommendation is not implemented anywhere in this tree yet — there is no tag-triggered publish
workflow, no `dry_run` input, and no GitHub Environment configured. `release-verification.yml` today is
`workflow_dispatch`-only and never touches credentials at all (see its own header comment). Building the
credentialed publish job described here is future work, layered on top of what already exists.

## 4. Version and release flow

`sdkgenVersion` is currently `0.1.0-SNAPSHOT` (`gradle.properties:9`).

- **SNAPSHOT versions** (`-SNAPSHOT` suffix) are for local/CI iteration only. Maven Central **rejects
  SNAPSHOT publications** outright — a real release must bump `sdkgenVersion` to a plain release version
  (e.g. `0.1.0`) before publishing.
- **Tag → version relationship:** the recommended flow (§3) is that a release tag (e.g. `v0.1.0`) is the
  trigger, and the workflow derives or validates the version from the tag rather than trusting an
  independently-typed value. `release-verification.yml` already demonstrates the validation half of this:
  its `RC_VERSION` input is checked against a strict `^[0-9]+\.[0-9]+\.[0-9]+(-[0-9A-Za-z][0-9A-Za-z.-]*)?$`
  grammar, rejects embedded newlines, and is passed only as a quoted shell variable — never spliced into
  script text (`.github/workflows/release-verification.yml`, "Validate release_candidate_version" step).
  A real tag-triggered release workflow should apply the same grammar check to the tag-derived version
  before using it in any `-PsdkgenVersion=...` argument.
- Never reuse a version number, even privately pushed to a shared remote, even to "fix" a bad release
  (`docs/release-runbook.md`, "Core invariant" and "Rollback").

## 5. Dry-run and verification — what actually works today

These commands staged 1,190 artifacts, verified exactly the eight ADR-0008 coordinates plus the plugin
marker, detected no internal-coordinate leakage, and passed both verification tasks.

```bash
# ANDROID_HOME must be set first — the publish graph pulls in runtime:core's Android variant.
# The first release readiness rehearsal attempt failed with "SDK location not found" without this.
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

To rehearse a specific release-candidate version rather than the default `0.1.0-SNAPSHOT`, add
`-PsdkgenVersion=<version>` to every one of the three commands above (all three must agree — each
`./gradlew` invocation is a fresh process with `--no-daemon`, so the property does not carry over between
them).

Everything above can also be dispatched as a single run via the existing manual-only workflow:

```bash
gh workflow run release-verification.yml -f release_candidate_version=<version-or-blank>
```

`.github/workflows/release-verification.yml` composes these same steps (plus the full build/check/ktlint/
`apiCheck` gate, the cross-corpus parity gate, and the benchmark-budget check) on `workflow_dispatch` only. It never
touches a credential, never signs anything, and never targets a remote repository — confirmed by its own
header comment and by `permissions: contents: read` at both workflow and job scope.

**What this rehearsal does not and cannot prove:** signatures, javadoc jars, POM license/developer/SCM
content, an SBOM, or provenance — none of that exists to verify yet (§0). It proves the artifact-ID
rewriting, the coordinate set, and the checksums are correct; it does not prove Central would accept the
result, because Central would reject it today on the missing-signature and missing-POM-metadata grounds
alone.

## 6. First-release checklist

Ordered; each step assumes the previous ones are done.

1. [ ] Decide the Central Portal namespace (`com.nabobery` with DNS proof, or `io.github.<user>`) — §2.
2. [ ] Add the `pom { }` block to `sdkgen.publishing.gradle.kts` (license, developers, SCM URL).
3. [ ] Apply a Dokka (or equivalent) task producing a `-javadoc.jar` for every published coordinate.
4. [ ] Apply the `signing` Gradle plugin, wired to read `signingInMemoryKey`/`signingInMemoryKeyPassword`
   (or the keyring-file equivalent) so every publication is signed.
5. [ ] Generate the GPG release key; publish the public key to a keyserver; store the private key and
   passphrase only as GitHub Environment secrets (§2) — never in the repository.
6. [ ] Verify and register the chosen Central Portal namespace; generate the user token (§2).
7. [ ] Apply a Central Portal aggregation plugin (e.g. Nmcp) and wire it to the two Central secrets.
8. [ ] Decide the SBOM question (adopt CycloneDX, or record an explicit decision not to) — do not leave it
   silently unresolved past this point.
9. [ ] Decide whether to apply `com.gradle.plugin-publish` for this release or defer the Gradle plugin
   coordinate to a later train; if applying it now, set up the Plugin Portal account and secrets (§2).
10. [ ] Build the tag-triggered + `workflow_dispatch`(`dry_run` default `true`) release workflow behind a
    GitHub Environment with a required reviewer, scoped publish secrets, `contents: read` at workflow level,
    and `id-token: write`/`attestations: write` only on the publish job (§3).
11. [ ] Bump `sdkgenVersion` off `-SNAPSHOT` to the real release version (§4); never reuse a version number.
12. [ ] Run the full verification gate: `./gradlew build check ktlintCheck apiCheck`, the cross-corpus parity gate,
    and the current compatibility report for the release diff (`docs/release-runbook.md`, "Real
    release" step 3).
13. [ ] Run the §5 rehearsal against the release version specifically (not a prior SNAPSHOT) — artifact
    identity, signatures, and any SBOM are version-specific.
14. [ ] Consume every published coordinate from a clean, isolated external build (no Maven Local fallback,
    no project substitution) to prove the graph resolves independently.
15. [ ] Push the release tag. Obtain the required-reviewer approval on the Environment.
16. [ ] Publish to the Maven Central Portal, and to the Gradle Plugin Portal if step 9 opted in.
17. [ ] Generate and publish the GitHub artifact attestation (`actions/attest-build-provenance`) for the
    release artifacts.
18. [ ] Publish release notes summarizing the effective contract diff (`sdkgen diff`/`sdkgen explain`), the
    applied-overlay report, and the conformance/waiver summary (`docs/release-runbook.md` step 7).
19. [ ] **Post-publish verification:** resolve every published coordinate from a fresh, unrelated project
    (not this repository) against the real Central repository, confirm the version and checksums match what
    was staged, and confirm the artifact is visible on `central.sonatype.com` and (if published) on
    `plugins.gradle.org`.
20. [ ] Update `docs/release-runbook.md`'s "Current publication status" section to reflect the real, now
    "yes it happened" state — it is currently written as a draft that has never seen a real release.

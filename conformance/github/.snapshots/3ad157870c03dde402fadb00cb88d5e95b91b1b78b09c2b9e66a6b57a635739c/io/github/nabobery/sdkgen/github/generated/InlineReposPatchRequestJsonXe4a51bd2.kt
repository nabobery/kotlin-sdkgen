package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposPatchRequestJsonXe4a51bd2.Serializer::class)
public class InlineReposPatchRequestJsonXe4a51bd2 internal constructor(
  private val allowAutoMergeState: FieldState<Boolean>,
  private val allowForkingState: FieldState<Boolean>,
  private val allowMergeCommitState: FieldState<Boolean>,
  private val allowRebaseMergeState: FieldState<Boolean>,
  private val allowSquashMergeState: FieldState<Boolean>,
  private val allowUpdateBranchState: FieldState<Boolean>,
  private val archivedState: FieldState<Boolean>,
  private val defaultBranchState: FieldState<String>,
  private val deleteBranchOnMergeState: FieldState<Boolean>,
  private val descriptionState: FieldState<String>,
  private val hasIssuesState: FieldState<Boolean>,
  private val hasProjectsState: FieldState<Boolean>,
  private val hasPullRequestsState: FieldState<Boolean>,
  private val hasWikiState: FieldState<Boolean>,
  private val homepageState: FieldState<String>,
  private val isTemplateState: FieldState<Boolean>,
  private val mergeCommitMessageState:
      FieldState<InlineReposPatchRequestJsonMergeCommitMessageX5456f66a>,
  private val mergeCommitTitleState:
      FieldState<InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563>,
  private val nameState: FieldState<String>,
  private val privateState: FieldState<Boolean>,
  private val pullRequestCreationPolicyState:
      FieldState<InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3>,
  private val securityAndAnalysisState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19?>,
  private val squashMergeCommitMessageState:
      FieldState<InlineReposPatchRequestJsonSquashMergeCommitMessageX921e72c2>,
  private val squashMergeCommitTitleState:
      FieldState<InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb>,
  private val useSquashPrTitleAsDefaultState: FieldState<Boolean>,
  private val visibilityState: FieldState<InlineReposPatchRequestJsonVisibilityX2dc97274>,
  private val webCommitSignoffRequiredState: FieldState<Boolean>,
) {
  /**
   * Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
   */
  public val allowAutoMerge: Boolean?
    get() = allowAutoMergeState.valueOrNull()

  /**
   * Either `true` to allow private forks, or `false` to prevent private forks.
   */
  public val allowForking: Boolean?
    get() = allowForkingState.valueOrNull()

  /**
   * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with
   * merge commits.
   */
  public val allowMergeCommit: Boolean?
    get() = allowMergeCommitState.valueOrNull()

  /**
   * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
   */
  public val allowRebaseMerge: Boolean?
    get() = allowRebaseMergeState.valueOrNull()

  /**
   * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
   */
  public val allowSquashMerge: Boolean?
    get() = allowSquashMergeState.valueOrNull()

  /**
   * Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it is
   * not required to be up to date before merging, or false otherwise.
   */
  public val allowUpdateBranch: Boolean?
    get() = allowUpdateBranchState.valueOrNull()

  /**
   * Whether to archive this repository. `false` will unarchive a previously archived repository.
   */
  public val archived: Boolean?
    get() = archivedState.valueOrNull()

  /**
   * Updates the default branch for this repository.
   */
  public val defaultBranch: String?
    get() = defaultBranchState.valueOrNull()

  /**
   * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent
   * automatic deletion.
   */
  public val deleteBranchOnMerge: Boolean?
    get() = deleteBranchOnMergeState.valueOrNull()

  /**
   * A short description of the repository.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Either `true` to enable issues for this repository or `false` to disable them.
   */
  public val hasIssues: Boolean?
    get() = hasIssuesState.valueOrNull()

  /**
   * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a
   * repository in an organization that has disabled repository projects, the default is `false`, and if you pass
   * `true`, the API returns an error.
   */
  public val hasProjects: Boolean?
    get() = hasProjectsState.valueOrNull()

  /**
   * Either `true` to allow pull requests for this repository or `false` to prevent pull requests.
   */
  public val hasPullRequests: Boolean?
    get() = hasPullRequestsState.valueOrNull()

  /**
   * Either `true` to enable the wiki for this repository or `false` to disable it.
   */
  public val hasWiki: Boolean?
    get() = hasWikiState.valueOrNull()

  /**
   * A URL with more information about the repository.
   */
  public val homepage: String?
    get() = homepageState.valueOrNull()

  /**
   * Either `true` to make this repo available as a template repository or `false` to prevent it.
   */
  public val isTemplate: Boolean?
    get() = isTemplateState.valueOrNull()

  /**
   * The default value for a merge commit message.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `PR_BODY` - default to the pull request's body.
   * - `BLANK` - default to a blank commit message.
   */
  public val mergeCommitMessage: InlineReposPatchRequestJsonMergeCommitMessageX5456f66a?
    get() = mergeCommitMessageState.valueOrNull()

  /**
   * Required when using `merge_commit_message`.
   *
   * The default value for a merge commit title.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
   * branch-name).
   */
  public val mergeCommitTitle: InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563?
    get() = mergeCommitTitleState.valueOrNull()

  /**
   * The name of the repository.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * Either `true` to make the repository private or `false` to make it public. Default: `false`.
   * **Note**: You will get a `422` error if the organization restricts [changing repository
   * visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibili
   * ty-of-repositories) to organization owners and a non-owner tries to change the value of private.
   */
  public val `private`: Boolean?
    get() = privateState.valueOrNull()

  /**
   * The policy that controls who can create pull requests for this repository: `all` or `collaborators_only`.
   */
  public val pullRequestCreationPolicy:
      InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3?
    get() = pullRequestCreationPolicyState.valueOrNull()

  /**
   * Specify which security and analysis features to enable or disable for the repository.
   *
   * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
   * the organization that owns the repository. For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * For example, to enable GitHub Advanced Security, use this data in the body of the `PATCH` request:
   * `{ "security_and_analysis": {"advanced_security": { "status": "enabled" } } }`.
   *
   * You can check which security and analysis features are currently enabled by using a `GET /repos/{owner}/{repo}`
   * request.
   */
  public val securityAndAnalysis: InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19?
    get() = securityAndAnalysisState.valueOrNull()

  /**
   * The default value for a squash merge commit message:
   *
   * - `PR_BODY` - default to the pull request's body.
   * - `COMMIT_MESSAGES` - default to the branch's commit messages.
   * - `BLANK` - default to a blank commit message.
   */
  public val squashMergeCommitMessage: InlineReposPatchRequestJsonSquashMergeCommitMessageX921e72c2?
    get() = squashMergeCommitMessageState.valueOrNull()

  /**
   * Required when using `squash_merge_commit_message`.
   *
   * The default value for a squash merge commit title:
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
   * than one commit).
   */
  public val squashMergeCommitTitle: InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb?
    get() = squashMergeCommitTitleState.valueOrNull()

  /**
   * Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This
   * property is closing down. Please use `squash_merge_commit_title` instead.
   */
  public val useSquashPrTitleAsDefault: Boolean?
    get() = useSquashPrTitleAsDefaultState.valueOrNull()

  /**
   * The visibility of the repository.
   */
  public val visibility: InlineReposPatchRequestJsonVisibilityX2dc97274?
    get() = visibilityState.valueOrNull()

  /**
   * Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to
   * sign off on web-based commits.
   */
  public val webCommitSignoffRequired: Boolean?
    get() = webCommitSignoffRequiredState.valueOrNull()

  public constructor() : this(allowAutoMergeState = FieldState.Absent,
  allowForkingState = FieldState.Absent,
  allowMergeCommitState = FieldState.Absent,
  allowRebaseMergeState = FieldState.Absent,
  allowSquashMergeState = FieldState.Absent,
  allowUpdateBranchState = FieldState.Absent,
  archivedState = FieldState.Absent,
  defaultBranchState = FieldState.Absent,
  deleteBranchOnMergeState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  hasIssuesState = FieldState.Absent,
  hasProjectsState = FieldState.Absent,
  hasPullRequestsState = FieldState.Absent,
  hasWikiState = FieldState.Absent,
  homepageState = FieldState.Absent,
  isTemplateState = FieldState.Absent,
  mergeCommitMessageState = FieldState.Absent,
  mergeCommitTitleState = FieldState.Absent,
  nameState = FieldState.Absent,
  privateState = FieldState.Absent,
  pullRequestCreationPolicyState = FieldState.Absent,
  securityAndAnalysisState = FieldState.Absent,
  squashMergeCommitMessageState = FieldState.Absent,
  squashMergeCommitTitleState = FieldState.Absent,
  useSquashPrTitleAsDefaultState = FieldState.Absent,
  visibilityState = FieldState.Absent,
  webCommitSignoffRequiredState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allow_auto_merge`.
   */
  public fun allowAutoMergePresence(): FieldPresence = allowAutoMergeState.presence

  /**
   * Returns the wire presence of `allow_forking`.
   */
  public fun allowForkingPresence(): FieldPresence = allowForkingState.presence

  /**
   * Returns the wire presence of `allow_merge_commit`.
   */
  public fun allowMergeCommitPresence(): FieldPresence = allowMergeCommitState.presence

  /**
   * Returns the wire presence of `allow_rebase_merge`.
   */
  public fun allowRebaseMergePresence(): FieldPresence = allowRebaseMergeState.presence

  /**
   * Returns the wire presence of `allow_squash_merge`.
   */
  public fun allowSquashMergePresence(): FieldPresence = allowSquashMergeState.presence

  /**
   * Returns the wire presence of `allow_update_branch`.
   */
  public fun allowUpdateBranchPresence(): FieldPresence = allowUpdateBranchState.presence

  /**
   * Returns the wire presence of `archived`.
   */
  public fun archivedPresence(): FieldPresence = archivedState.presence

  /**
   * Returns the wire presence of `default_branch`.
   */
  public fun defaultBranchPresence(): FieldPresence = defaultBranchState.presence

  /**
   * Returns the wire presence of `delete_branch_on_merge`.
   */
  public fun deleteBranchOnMergePresence(): FieldPresence = deleteBranchOnMergeState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `has_issues`.
   */
  public fun hasIssuesPresence(): FieldPresence = hasIssuesState.presence

  /**
   * Returns the wire presence of `has_projects`.
   */
  public fun hasProjectsPresence(): FieldPresence = hasProjectsState.presence

  /**
   * Returns the wire presence of `has_pull_requests`.
   */
  public fun hasPullRequestsPresence(): FieldPresence = hasPullRequestsState.presence

  /**
   * Returns the wire presence of `has_wiki`.
   */
  public fun hasWikiPresence(): FieldPresence = hasWikiState.presence

  /**
   * Returns the wire presence of `homepage`.
   */
  public fun homepagePresence(): FieldPresence = homepageState.presence

  /**
   * Returns the wire presence of `is_template`.
   */
  public fun isTemplatePresence(): FieldPresence = isTemplateState.presence

  /**
   * Returns the wire presence of `merge_commit_message`.
   */
  public fun mergeCommitMessagePresence(): FieldPresence = mergeCommitMessageState.presence

  /**
   * Returns the wire presence of `merge_commit_title`.
   */
  public fun mergeCommitTitlePresence(): FieldPresence = mergeCommitTitleState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `private`.
   */
  public fun privatePresence(): FieldPresence = privateState.presence

  /**
   * Returns the wire presence of `pull_request_creation_policy`.
   */
  public fun pullRequestCreationPolicyPresence(): FieldPresence = pullRequestCreationPolicyState.presence

  /**
   * Returns the wire presence of `security_and_analysis`.
   */
  public fun securityAndAnalysisPresence(): FieldPresence = securityAndAnalysisState.presence

  /**
   * Returns the wire presence of `squash_merge_commit_message`.
   */
  public fun squashMergeCommitMessagePresence(): FieldPresence = squashMergeCommitMessageState.presence

  /**
   * Returns the wire presence of `squash_merge_commit_title`.
   */
  public fun squashMergeCommitTitlePresence(): FieldPresence = squashMergeCommitTitleState.presence

  /**
   * Returns the wire presence of `use_squash_pr_title_as_default`.
   */
  public fun useSquashPrTitleAsDefaultPresence(): FieldPresence = useSquashPrTitleAsDefaultState.presence

  /**
   * Returns the wire presence of `visibility`.
   */
  public fun visibilityPresence(): FieldPresence = visibilityState.presence

  /**
   * Returns the wire presence of `web_commit_signoff_required`.
   */
  public fun webCommitSignoffRequiredPresence(): FieldPresence = webCommitSignoffRequiredState.presence

  public class Builder {
    private var allowAutoMergeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowAutoMerge: Boolean?
      get() = allowAutoMergeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowAutoMerge is not nullable; call unsetAllowAutoMerge() to omit it" }
        allowAutoMergeState = FieldState.Value(present)
      }

    private var allowForkingState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow private forks, or `false` to prevent private forks.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowForking: Boolean?
      get() = allowForkingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowForking is not nullable; call unsetAllowForking() to omit it" }
        allowForkingState = FieldState.Value(present)
      }

    private var allowMergeCommitState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests
     * with merge commits.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowMergeCommit: Boolean?
      get() = allowMergeCommitState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowMergeCommit is not nullable; call unsetAllowMergeCommit() to omit it" }
        allowMergeCommitState = FieldState.Value(present)
      }

    private var allowRebaseMergeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowRebaseMerge: Boolean?
      get() = allowRebaseMergeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowRebaseMerge is not nullable; call unsetAllowRebaseMerge() to omit it" }
        allowRebaseMergeState = FieldState.Value(present)
      }

    private var allowSquashMergeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowSquashMerge: Boolean?
      get() = allowSquashMergeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowSquashMerge is not nullable; call unsetAllowSquashMerge() to omit it" }
        allowSquashMergeState = FieldState.Value(present)
      }

    private var allowUpdateBranchState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it
     * is not required to be up to date before merging, or false otherwise.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowUpdateBranch: Boolean?
      get() = allowUpdateBranchState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowUpdateBranch is not nullable; call unsetAllowUpdateBranch() to omit it" }
        allowUpdateBranchState = FieldState.Value(present)
      }

    private var archivedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to archive this repository. `false` will unarchive a previously archived repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var archived: Boolean?
      get() = archivedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "archived is not nullable; call unsetArchived() to omit it" }
        archivedState = FieldState.Value(present)
      }

    private var defaultBranchState: FieldState<String> = FieldState.Absent

    /**
     * Updates the default branch for this repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var defaultBranch: String?
      get() = defaultBranchState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "defaultBranch is not nullable; call unsetDefaultBranch() to omit it" }
        defaultBranchState = FieldState.Value(present)
      }

    private var deleteBranchOnMergeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent
     * automatic deletion.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var deleteBranchOnMerge: Boolean?
      get() = deleteBranchOnMergeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "deleteBranchOnMerge is not nullable; call unsetDeleteBranchOnMerge() to omit it" }
        deleteBranchOnMergeState = FieldState.Value(present)
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * A short description of the repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var hasIssuesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to enable issues for this repository or `false` to disable them.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasIssues: Boolean?
      get() = hasIssuesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasIssues is not nullable; call unsetHasIssues() to omit it" }
        hasIssuesState = FieldState.Value(present)
      }

    private var hasProjectsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a
     * repository in an organization that has disabled repository projects, the default is `false`, and if you pass
     * `true`, the API returns an error.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasProjects: Boolean?
      get() = hasProjectsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasProjects is not nullable; call unsetHasProjects() to omit it" }
        hasProjectsState = FieldState.Value(present)
      }

    private var hasPullRequestsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow pull requests for this repository or `false` to prevent pull requests.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasPullRequests: Boolean?
      get() = hasPullRequestsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasPullRequests is not nullable; call unsetHasPullRequests() to omit it" }
        hasPullRequestsState = FieldState.Value(present)
      }

    private var hasWikiState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to enable the wiki for this repository or `false` to disable it.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasWiki: Boolean?
      get() = hasWikiState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasWiki is not nullable; call unsetHasWiki() to omit it" }
        hasWikiState = FieldState.Value(present)
      }

    private var homepageState: FieldState<String> = FieldState.Absent

    /**
     * A URL with more information about the repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var homepage: String?
      get() = homepageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "homepage is not nullable; call unsetHomepage() to omit it" }
        homepageState = FieldState.Value(present)
      }

    private var isTemplateState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to make this repo available as a template repository or `false` to prevent it.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isTemplate: Boolean?
      get() = isTemplateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isTemplate is not nullable; call unsetIsTemplate() to omit it" }
        isTemplateState = FieldState.Value(present)
      }

    private var mergeCommitMessageState:
        FieldState<InlineReposPatchRequestJsonMergeCommitMessageX5456f66a> = FieldState.Absent

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var mergeCommitMessage: InlineReposPatchRequestJsonMergeCommitMessageX5456f66a?
      get() = mergeCommitMessageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "mergeCommitMessage is not nullable; call unsetMergeCommitMessage() to omit it" }
        mergeCommitMessageState = FieldState.Value(present)
      }

    private var mergeCommitTitleState:
        FieldState<InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563> = FieldState.Absent

    /**
     * Required when using `merge_commit_message`.
     *
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
     * branch-name).
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var mergeCommitTitle: InlineReposPatchRequestJsonMergeCommitTitleXcdb6e563?
      get() = mergeCommitTitleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "mergeCommitTitle is not nullable; call unsetMergeCommitTitle() to omit it" }
        mergeCommitTitleState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var privateState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to make the repository private or `false` to make it public. Default: `false`.
     * **Note**: You will get a `422` error if the organization restricts [changing repository
     * visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibi
     * lity-of-repositories) to organization owners and a non-owner tries to change the value of private.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var `private`: Boolean?
      get() = privateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "private is not nullable; call unsetPrivate() to omit it" }
        privateState = FieldState.Value(present)
      }

    private var pullRequestCreationPolicyState:
        FieldState<InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3> =
        FieldState.Absent

    /**
     * The policy that controls who can create pull requests for this repository: `all` or `collaborators_only`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pullRequestCreationPolicy:
        InlineReposPatchRequestJsonPullRequestCreationPolicyX4f3d9dd3?
      get() = pullRequestCreationPolicyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pullRequestCreationPolicy is not nullable; call unsetPullRequestCreationPolicy() to omit it" }
        pullRequestCreationPolicyState = FieldState.Value(present)
      }

    private var securityAndAnalysisState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19?> = FieldState.Absent

    /**
     * Specify which security and analysis features to enable or disable for the repository.
     *
     * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
     * the organization that owns the repository. For more information, see "[Managing security managers in your
     * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/manag
     * ing-security-managers-in-your-organization)."
     *
     * For example, to enable GitHub Advanced Security, use this data in the body of the `PATCH` request:
     * `{ "security_and_analysis": {"advanced_security": { "status": "enabled" } } }`.
     *
     * You can check which security and analysis features are currently enabled by using a `GET /repos/{owner}/{repo}`
     * request.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var securityAndAnalysis: InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19?
      get() = securityAndAnalysisState.valueOrNull()
      set(`value`) {
        securityAndAnalysisState = value.toNullableFieldState()
      }

    private var squashMergeCommitMessageState:
        FieldState<InlineReposPatchRequestJsonSquashMergeCommitMessageX921e72c2> = FieldState.Absent

    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var squashMergeCommitMessage:
        InlineReposPatchRequestJsonSquashMergeCommitMessageX921e72c2?
      get() = squashMergeCommitMessageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "squashMergeCommitMessage is not nullable; call unsetSquashMergeCommitMessage() to omit it" }
        squashMergeCommitMessageState = FieldState.Value(present)
      }

    private var squashMergeCommitTitleState:
        FieldState<InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb> = FieldState.Absent

    /**
     * Required when using `squash_merge_commit_message`.
     *
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when
     * more than one commit).
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var squashMergeCommitTitle: InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb?
      get() = squashMergeCommitTitleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "squashMergeCommitTitle is not nullable; call unsetSquashMergeCommitTitle() to omit it" }
        squashMergeCommitTitleState = FieldState.Value(present)
      }

    private var useSquashPrTitleAsDefaultState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This
     * property is closing down. Please use `squash_merge_commit_title` instead.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var useSquashPrTitleAsDefault: Boolean?
      get() = useSquashPrTitleAsDefaultState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "useSquashPrTitleAsDefault is not nullable; call unsetUseSquashPrTitleAsDefault() to omit it" }
        useSquashPrTitleAsDefaultState = FieldState.Value(present)
      }

    private var visibilityState: FieldState<InlineReposPatchRequestJsonVisibilityX2dc97274> =
        FieldState.Absent

    /**
     * The visibility of the repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var visibility: InlineReposPatchRequestJsonVisibilityX2dc97274?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "visibility is not nullable; call unsetVisibility() to omit it" }
        visibilityState = FieldState.Value(present)
      }

    private var webCommitSignoffRequiredState: FieldState<Boolean> = FieldState.Absent

    /**
     * Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to
     * sign off on web-based commits.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var webCommitSignoffRequired: Boolean?
      get() = webCommitSignoffRequiredState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "webCommitSignoffRequired is not nullable; call unsetWebCommitSignoffRequired() to omit it" }
        webCommitSignoffRequiredState = FieldState.Value(present)
      }

    /**
     * Omits `allow_auto_merge` from serialized output.
     */
    public fun unsetAllowAutoMerge() {
      allowAutoMergeState = FieldState.Absent
    }

    /**
     * Omits `allow_forking` from serialized output.
     */
    public fun unsetAllowForking() {
      allowForkingState = FieldState.Absent
    }

    /**
     * Omits `allow_merge_commit` from serialized output.
     */
    public fun unsetAllowMergeCommit() {
      allowMergeCommitState = FieldState.Absent
    }

    /**
     * Omits `allow_rebase_merge` from serialized output.
     */
    public fun unsetAllowRebaseMerge() {
      allowRebaseMergeState = FieldState.Absent
    }

    /**
     * Omits `allow_squash_merge` from serialized output.
     */
    public fun unsetAllowSquashMerge() {
      allowSquashMergeState = FieldState.Absent
    }

    /**
     * Omits `allow_update_branch` from serialized output.
     */
    public fun unsetAllowUpdateBranch() {
      allowUpdateBranchState = FieldState.Absent
    }

    /**
     * Omits `archived` from serialized output.
     */
    public fun unsetArchived() {
      archivedState = FieldState.Absent
    }

    /**
     * Omits `default_branch` from serialized output.
     */
    public fun unsetDefaultBranch() {
      defaultBranchState = FieldState.Absent
    }

    /**
     * Omits `delete_branch_on_merge` from serialized output.
     */
    public fun unsetDeleteBranchOnMerge() {
      deleteBranchOnMergeState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `has_issues` from serialized output.
     */
    public fun unsetHasIssues() {
      hasIssuesState = FieldState.Absent
    }

    /**
     * Omits `has_projects` from serialized output.
     */
    public fun unsetHasProjects() {
      hasProjectsState = FieldState.Absent
    }

    /**
     * Omits `has_pull_requests` from serialized output.
     */
    public fun unsetHasPullRequests() {
      hasPullRequestsState = FieldState.Absent
    }

    /**
     * Omits `has_wiki` from serialized output.
     */
    public fun unsetHasWiki() {
      hasWikiState = FieldState.Absent
    }

    /**
     * Omits `homepage` from serialized output.
     */
    public fun unsetHomepage() {
      homepageState = FieldState.Absent
    }

    /**
     * Omits `is_template` from serialized output.
     */
    public fun unsetIsTemplate() {
      isTemplateState = FieldState.Absent
    }

    /**
     * Omits `merge_commit_message` from serialized output.
     */
    public fun unsetMergeCommitMessage() {
      mergeCommitMessageState = FieldState.Absent
    }

    /**
     * Omits `merge_commit_title` from serialized output.
     */
    public fun unsetMergeCommitTitle() {
      mergeCommitTitleState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `private` from serialized output.
     */
    public fun unsetPrivate() {
      privateState = FieldState.Absent
    }

    /**
     * Omits `pull_request_creation_policy` from serialized output.
     */
    public fun unsetPullRequestCreationPolicy() {
      pullRequestCreationPolicyState = FieldState.Absent
    }

    /**
     * Omits `security_and_analysis` from serialized output.
     */
    public fun unsetSecurityAndAnalysis() {
      securityAndAnalysisState = FieldState.Absent
    }

    /**
     * Omits `squash_merge_commit_message` from serialized output.
     */
    public fun unsetSquashMergeCommitMessage() {
      squashMergeCommitMessageState = FieldState.Absent
    }

    /**
     * Omits `squash_merge_commit_title` from serialized output.
     */
    public fun unsetSquashMergeCommitTitle() {
      squashMergeCommitTitleState = FieldState.Absent
    }

    /**
     * Omits `use_squash_pr_title_as_default` from serialized output.
     */
    public fun unsetUseSquashPrTitleAsDefault() {
      useSquashPrTitleAsDefaultState = FieldState.Absent
    }

    /**
     * Omits `visibility` from serialized output.
     */
    public fun unsetVisibility() {
      visibilityState = FieldState.Absent
    }

    /**
     * Omits `web_commit_signoff_required` from serialized output.
     */
    public fun unsetWebCommitSignoffRequired() {
      webCommitSignoffRequiredState = FieldState.Absent
    }

    public fun build(): InlineReposPatchRequestJsonXe4a51bd2 = InlineReposPatchRequestJsonXe4a51bd2(
      allowAutoMergeState = allowAutoMergeState,
      allowForkingState = allowForkingState,
      allowMergeCommitState = allowMergeCommitState,
      allowRebaseMergeState = allowRebaseMergeState,
      allowSquashMergeState = allowSquashMergeState,
      allowUpdateBranchState = allowUpdateBranchState,
      archivedState = archivedState,
      defaultBranchState = defaultBranchState,
      deleteBranchOnMergeState = deleteBranchOnMergeState,
      descriptionState = descriptionState,
      hasIssuesState = hasIssuesState,
      hasProjectsState = hasProjectsState,
      hasPullRequestsState = hasPullRequestsState,
      hasWikiState = hasWikiState,
      homepageState = homepageState,
      isTemplateState = isTemplateState,
      mergeCommitMessageState = mergeCommitMessageState,
      mergeCommitTitleState = mergeCommitTitleState,
      nameState = nameState,
      privateState = privateState,
      pullRequestCreationPolicyState = pullRequestCreationPolicyState,
      securityAndAnalysisState = securityAndAnalysisState,
      squashMergeCommitMessageState = squashMergeCommitMessageState,
      squashMergeCommitTitleState = squashMergeCommitTitleState,
      useSquashPrTitleAsDefaultState = useSquashPrTitleAsDefaultState,
      visibilityState = visibilityState,
      webCommitSignoffRequiredState = webCommitSignoffRequiredState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPatchRequestJsonXe4a51bd2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonXe4a51bd2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonXe4a51bd2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPatchRequestJsonXe4a51bd2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPatchRequestJsonXe4a51bd2 must be a JSON object")
      return InlineReposPatchRequestJsonXe4a51bd2(
        allowAutoMergeState = json.decodeOptional(rawObject, "allow_auto_merge", nullable = false),
        allowForkingState = json.decodeOptional(rawObject, "allow_forking", nullable = false),
        allowMergeCommitState = json.decodeOptional(rawObject, "allow_merge_commit", nullable = false),
        allowRebaseMergeState = json.decodeOptional(rawObject, "allow_rebase_merge", nullable = false),
        allowSquashMergeState = json.decodeOptional(rawObject, "allow_squash_merge", nullable = false),
        allowUpdateBranchState = json.decodeOptional(rawObject, "allow_update_branch", nullable = false),
        archivedState = json.decodeOptional(rawObject, "archived", nullable = false),
        defaultBranchState = json.decodeOptional(rawObject, "default_branch", nullable = false),
        deleteBranchOnMergeState = json.decodeOptional(rawObject, "delete_branch_on_merge", nullable = false),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        hasIssuesState = json.decodeOptional(rawObject, "has_issues", nullable = false),
        hasProjectsState = json.decodeOptional(rawObject, "has_projects", nullable = false),
        hasPullRequestsState = json.decodeOptional(rawObject, "has_pull_requests", nullable = false),
        hasWikiState = json.decodeOptional(rawObject, "has_wiki", nullable = false),
        homepageState = json.decodeOptional(rawObject, "homepage", nullable = false),
        isTemplateState = json.decodeOptional(rawObject, "is_template", nullable = false),
        mergeCommitMessageState = json.decodeOptional(rawObject, "merge_commit_message", nullable = false),
        mergeCommitTitleState = json.decodeOptional(rawObject, "merge_commit_title", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        privateState = json.decodeOptional(rawObject, "private", nullable = false),
        pullRequestCreationPolicyState = json.decodeOptional(rawObject, "pull_request_creation_policy", nullable = false),
        securityAndAnalysisState = json.decodeOptional(rawObject, "security_and_analysis", nullable = true),
        squashMergeCommitMessageState = json.decodeOptional(rawObject, "squash_merge_commit_message", nullable = false),
        squashMergeCommitTitleState = json.decodeOptional(rawObject, "squash_merge_commit_title", nullable = false),
        useSquashPrTitleAsDefaultState = json.decodeOptional(rawObject, "use_squash_pr_title_as_default", nullable = false),
        visibilityState = json.decodeOptional(rawObject, "visibility", nullable = false),
        webCommitSignoffRequiredState = json.decodeOptional(rawObject, "web_commit_signoff_required", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonXe4a51bd2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPatchRequestJsonXe4a51bd2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("allow_auto_merge", value.allowAutoMergeState, json::encodeToJsonElement)
        putState("allow_forking", value.allowForkingState, json::encodeToJsonElement)
        putState("allow_merge_commit", value.allowMergeCommitState, json::encodeToJsonElement)
        putState("allow_rebase_merge", value.allowRebaseMergeState, json::encodeToJsonElement)
        putState("allow_squash_merge", value.allowSquashMergeState, json::encodeToJsonElement)
        putState("allow_update_branch", value.allowUpdateBranchState, json::encodeToJsonElement)
        putState("archived", value.archivedState, json::encodeToJsonElement)
        putState("default_branch", value.defaultBranchState, json::encodeToJsonElement)
        putState("delete_branch_on_merge", value.deleteBranchOnMergeState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("has_issues", value.hasIssuesState, json::encodeToJsonElement)
        putState("has_projects", value.hasProjectsState, json::encodeToJsonElement)
        putState("has_pull_requests", value.hasPullRequestsState, json::encodeToJsonElement)
        putState("has_wiki", value.hasWikiState, json::encodeToJsonElement)
        putState("homepage", value.homepageState, json::encodeToJsonElement)
        putState("is_template", value.isTemplateState, json::encodeToJsonElement)
        putState("merge_commit_message", value.mergeCommitMessageState, json::encodeToJsonElement)
        putState("merge_commit_title", value.mergeCommitTitleState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("private", value.privateState, json::encodeToJsonElement)
        putState("pull_request_creation_policy", value.pullRequestCreationPolicyState, json::encodeToJsonElement)
        putState("security_and_analysis", value.securityAndAnalysisState, json::encodeToJsonElement)
        putState("squash_merge_commit_message", value.squashMergeCommitMessageState, json::encodeToJsonElement)
        putState("squash_merge_commit_title", value.squashMergeCommitTitleState, json::encodeToJsonElement)
        putState("use_squash_pr_title_as_default", value.useSquashPrTitleAsDefaultState, json::encodeToJsonElement)
        putState("visibility", value.visibilityState, json::encodeToJsonElement)
        putState("web_commit_signoff_required", value.webCommitSignoffRequiredState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPatchRequestJsonXe4a51bd2(block: InlineReposPatchRequestJsonXe4a51bd2.Builder.() -> Unit): InlineReposPatchRequestJsonXe4a51bd2 = InlineReposPatchRequestJsonXe4a51bd2.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposPatchRequestJsonXe4a51bd2 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}

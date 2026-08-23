package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Full Repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/full-repository
 */
@Serializable(with = FullRepository.Serializer::class)
public class FullRepository internal constructor(
  public val archiveUrl: String,
  public val archived: Boolean,
  public val assigneesUrl: String,
  public val blobsUrl: String,
  public val branchesUrl: String,
  public val cloneUrl: String,
  public val collaboratorsUrl: String,
  public val commentsUrl: String,
  public val commitsUrl: String,
  public val compareUrl: String,
  public val contentsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val contributorsUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val defaultBranch: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deploymentsUrl: String,
  public val description: String?,
  /**
   * Returns whether or not this repository disabled.
   */
  public val disabled: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val downloadsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val eventsUrl: String,
  public val fork: Boolean,
  public val forks: Int,
  public val forksCount: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val forksUrl: String,
  public val fullName: String,
  public val gitCommitsUrl: String,
  public val gitRefsUrl: String,
  public val gitTagsUrl: String,
  public val gitUrl: String,
  public val hasDiscussions: Boolean,
  public val hasIssues: Boolean,
  public val hasPages: Boolean,
  public val hasProjects: Boolean,
  public val hasWiki: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val homepage: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val hooksUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  public val issueCommentUrl: String,
  public val issueEventsUrl: String,
  public val issuesUrl: String,
  public val keysUrl: String,
  public val labelsUrl: String,
  public val language: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val languagesUrl: String,
  public val license: NullableLicenseSimple?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val mergesUrl: String,
  public val milestonesUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val mirrorUrl: String?,
  public val name: String,
  public val networkCount: Int,
  public val nodeId: String,
  public val notificationsUrl: String,
  public val openIssues: Int,
  public val openIssuesCount: Int,
  public val owner: SimpleUser,
  public val `private`: Boolean,
  public val pullsUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pushedAt: String,
  public val releasesUrl: String,
  /**
   * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the
   * size is 0.
   */
  public val size: Int,
  public val sshUrl: String,
  public val stargazersCount: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val stargazersUrl: String,
  public val statusesUrl: String,
  public val subscribersCount: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val subscribersUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val subscriptionUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val svnUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val tagsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val teamsUrl: String,
  public val treesUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val watchers: Int,
  public val watchersCount: Int,
  private val allowAutoMergeState: FieldState<Boolean>,
  private val allowForkingState: FieldState<Boolean>,
  private val allowMergeCommitState: FieldState<Boolean>,
  private val allowRebaseMergeState: FieldState<Boolean>,
  private val allowSquashMergeState: FieldState<Boolean>,
  private val allowUpdateBranchState: FieldState<Boolean>,
  private val anonymousAccessEnabledState: FieldState<Boolean>,
  private val codeOfConductState: FieldState<CodeOfConductSimple>,
  private val customPropertiesState: FieldState<JsonObject>,
  private val deleteBranchOnMergeState: FieldState<Boolean>,
  private val hasDownloadsState: FieldState<Boolean>,
  private val hasPullRequestsState: FieldState<Boolean>,
  private val isTemplateState: FieldState<Boolean>,
  private val masterBranchState: FieldState<String>,
  private val mergeCommitMessageState: FieldState<InlineFullRepositoryMergeCommitMessageX0baec2f1>,
  private val mergeCommitTitleState: FieldState<InlineFullRepositoryMergeCommitTitleXb8572949>,
  private val organizationState: FieldState<NullableSimpleUser?>,
  private val parentState: FieldState<Repository>,
  private val permissionsState: FieldState<InlineFullRepositoryPermissionsX8e042fdd>,
  private val pullRequestCreationPolicyState:
      FieldState<InlineFullRepositoryPullRequestCreationPolicyX8abb9658>,
  private val securityAndAnalysisState: FieldState<SecurityAndAnalysis?>,
  private val sourceState: FieldState<Repository>,
  private val squashMergeCommitMessageState:
      FieldState<InlineFullRepositorySquashMergeCommitMessageX17602f43>,
  private val squashMergeCommitTitleState:
      FieldState<InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5>,
  private val tempCloneTokenState: FieldState<String?>,
  private val templateRepositoryState: FieldState<NullableRepository?>,
  topicsState: FieldState<List<String>>,
  private val useSquashPrTitleAsDefaultState: FieldState<Boolean>,
  private val visibilityState: FieldState<String>,
  private val webCommitSignoffRequiredState: FieldState<Boolean>,
) {
  private val topicsState: FieldState<List<String>> =
      topicsState.copyValue { fieldValue -> fieldValue.toList() }

  public val allowAutoMerge: Boolean?
    get() = allowAutoMergeState.valueOrNull()

  public val allowForking: Boolean?
    get() = allowForkingState.valueOrNull()

  public val allowMergeCommit: Boolean?
    get() = allowMergeCommitState.valueOrNull()

  public val allowRebaseMerge: Boolean?
    get() = allowRebaseMergeState.valueOrNull()

  public val allowSquashMerge: Boolean?
    get() = allowSquashMergeState.valueOrNull()

  public val allowUpdateBranch: Boolean?
    get() = allowUpdateBranchState.valueOrNull()

  /**
   * Whether anonymous git access is allowed.
   */
  public val anonymousAccessEnabled: Boolean?
    get() = anonymousAccessEnabledState.valueOrNull()

  public val codeOfConduct: CodeOfConductSimple?
    get() = codeOfConductState.valueOrNull()

  /**
   * The custom properties that were defined for the repository. The keys are the custom property names, and the values
   * are the corresponding custom property values.
   */
  public val customProperties: JsonObject?
    get() = customPropertiesState.valueOrNull()

  public val deleteBranchOnMerge: Boolean?
    get() = deleteBranchOnMergeState.valueOrNull()

  public val hasDownloads: Boolean?
    get() = hasDownloadsState.valueOrNull()

  public val hasPullRequests: Boolean?
    get() = hasPullRequestsState.valueOrNull()

  public val isTemplate: Boolean?
    get() = isTemplateState.valueOrNull()

  public val masterBranch: String?
    get() = masterBranchState.valueOrNull()

  /**
   * The default value for a merge commit message.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `PR_BODY` - default to the pull request's body.
   * - `BLANK` - default to a blank commit message.
   */
  public val mergeCommitMessage: InlineFullRepositoryMergeCommitMessageX0baec2f1?
    get() = mergeCommitMessageState.valueOrNull()

  /**
   * The default value for a merge commit title.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
   * branch-name).
   */
  public val mergeCommitTitle: InlineFullRepositoryMergeCommitTitleXb8572949?
    get() = mergeCommitTitleState.valueOrNull()

  public val organization: NullableSimpleUser?
    get() = organizationState.valueOrNull()

  public val parent: Repository?
    get() = parentState.valueOrNull()

  public val permissions: InlineFullRepositoryPermissionsX8e042fdd?
    get() = permissionsState.valueOrNull()

  /**
   * The policy controlling who can create pull requests: all or collaborators_only.
   */
  public val pullRequestCreationPolicy: InlineFullRepositoryPullRequestCreationPolicyX8abb9658?
    get() = pullRequestCreationPolicyState.valueOrNull()

  public val securityAndAnalysis: SecurityAndAnalysis?
    get() = securityAndAnalysisState.valueOrNull()

  public val source: Repository?
    get() = sourceState.valueOrNull()

  /**
   * The default value for a squash merge commit message:
   *
   * - `PR_BODY` - default to the pull request's body.
   * - `COMMIT_MESSAGES` - default to the branch's commit messages.
   * - `BLANK` - default to a blank commit message.
   */
  public val squashMergeCommitMessage: InlineFullRepositorySquashMergeCommitMessageX17602f43?
    get() = squashMergeCommitMessageState.valueOrNull()

  /**
   * The default value for a squash merge commit title:
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
   * than one commit).
   */
  public val squashMergeCommitTitle: InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5?
    get() = squashMergeCommitTitleState.valueOrNull()

  public val tempCloneToken: String?
    get() = tempCloneTokenState.valueOrNull()

  public val templateRepository: NullableRepository?
    get() = templateRepositoryState.valueOrNull()

  public val topics: List<String>?
    get() = topicsState.valueOrNull()

  public val useSquashPrTitleAsDefault: Boolean?
    get() = useSquashPrTitleAsDefaultState.valueOrNull()

  /**
   * The repository visibility: public, private, or internal.
   */
  public val visibility: String?
    get() = visibilityState.valueOrNull()

  public val webCommitSignoffRequired: Boolean?
    get() = webCommitSignoffRequiredState.valueOrNull()

  public constructor(
    archiveUrl: String,
    archived: Boolean,
    assigneesUrl: String,
    blobsUrl: String,
    branchesUrl: String,
    cloneUrl: String,
    collaboratorsUrl: String,
    commentsUrl: String,
    commitsUrl: String,
    compareUrl: String,
    contentsUrl: String,
    contributorsUrl: String,
    createdAt: String,
    defaultBranch: String,
    deploymentsUrl: String,
    description: String?,
    disabled: Boolean,
    downloadsUrl: String,
    eventsUrl: String,
    fork: Boolean,
    forks: Int,
    forksCount: Int,
    forksUrl: String,
    fullName: String,
    gitCommitsUrl: String,
    gitRefsUrl: String,
    gitTagsUrl: String,
    gitUrl: String,
    hasDiscussions: Boolean,
    hasIssues: Boolean,
    hasPages: Boolean,
    hasProjects: Boolean,
    hasWiki: Boolean,
    homepage: String?,
    hooksUrl: String,
    htmlUrl: String,
    id: Long,
    issueCommentUrl: String,
    issueEventsUrl: String,
    issuesUrl: String,
    keysUrl: String,
    labelsUrl: String,
    language: String?,
    languagesUrl: String,
    license: NullableLicenseSimple?,
    mergesUrl: String,
    milestonesUrl: String,
    mirrorUrl: String?,
    name: String,
    networkCount: Int,
    nodeId: String,
    notificationsUrl: String,
    openIssues: Int,
    openIssuesCount: Int,
    owner: SimpleUser,
    `private`: Boolean,
    pullsUrl: String,
    pushedAt: String,
    releasesUrl: String,
    size: Int,
    sshUrl: String,
    stargazersCount: Int,
    stargazersUrl: String,
    statusesUrl: String,
    subscribersCount: Int,
    subscribersUrl: String,
    subscriptionUrl: String,
    svnUrl: String,
    tagsUrl: String,
    teamsUrl: String,
    treesUrl: String,
    updatedAt: String,
    url: String,
    watchers: Int,
    watchersCount: Int,
  ) : this(archiveUrl = archiveUrl,
  archived = archived,
  assigneesUrl = assigneesUrl,
  blobsUrl = blobsUrl,
  branchesUrl = branchesUrl,
  cloneUrl = cloneUrl,
  collaboratorsUrl = collaboratorsUrl,
  commentsUrl = commentsUrl,
  commitsUrl = commitsUrl,
  compareUrl = compareUrl,
  contentsUrl = contentsUrl,
  contributorsUrl = contributorsUrl,
  createdAt = createdAt,
  defaultBranch = defaultBranch,
  deploymentsUrl = deploymentsUrl,
  description = description,
  disabled = disabled,
  downloadsUrl = downloadsUrl,
  eventsUrl = eventsUrl,
  fork = fork,
  forks = forks,
  forksCount = forksCount,
  forksUrl = forksUrl,
  fullName = fullName,
  gitCommitsUrl = gitCommitsUrl,
  gitRefsUrl = gitRefsUrl,
  gitTagsUrl = gitTagsUrl,
  gitUrl = gitUrl,
  hasDiscussions = hasDiscussions,
  hasIssues = hasIssues,
  hasPages = hasPages,
  hasProjects = hasProjects,
  hasWiki = hasWiki,
  homepage = homepage,
  hooksUrl = hooksUrl,
  htmlUrl = htmlUrl,
  id = id,
  issueCommentUrl = issueCommentUrl,
  issueEventsUrl = issueEventsUrl,
  issuesUrl = issuesUrl,
  keysUrl = keysUrl,
  labelsUrl = labelsUrl,
  language = language,
  languagesUrl = languagesUrl,
  license = license,
  mergesUrl = mergesUrl,
  milestonesUrl = milestonesUrl,
  mirrorUrl = mirrorUrl,
  name = name,
  networkCount = networkCount,
  nodeId = nodeId,
  notificationsUrl = notificationsUrl,
  openIssues = openIssues,
  openIssuesCount = openIssuesCount,
  owner = owner,
  private = private,
  pullsUrl = pullsUrl,
  pushedAt = pushedAt,
  releasesUrl = releasesUrl,
  size = size,
  sshUrl = sshUrl,
  stargazersCount = stargazersCount,
  stargazersUrl = stargazersUrl,
  statusesUrl = statusesUrl,
  subscribersCount = subscribersCount,
  subscribersUrl = subscribersUrl,
  subscriptionUrl = subscriptionUrl,
  svnUrl = svnUrl,
  tagsUrl = tagsUrl,
  teamsUrl = teamsUrl,
  treesUrl = treesUrl,
  updatedAt = updatedAt,
  url = url,
  watchers = watchers,
  watchersCount = watchersCount,
  allowAutoMergeState = FieldState.Absent,
  allowForkingState = FieldState.Absent,
  allowMergeCommitState = FieldState.Absent,
  allowRebaseMergeState = FieldState.Absent,
  allowSquashMergeState = FieldState.Absent,
  allowUpdateBranchState = FieldState.Absent,
  anonymousAccessEnabledState = FieldState.Absent,
  codeOfConductState = FieldState.Absent,
  customPropertiesState = FieldState.Absent,
  deleteBranchOnMergeState = FieldState.Absent,
  hasDownloadsState = FieldState.Absent,
  hasPullRequestsState = FieldState.Absent,
  isTemplateState = FieldState.Absent,
  masterBranchState = FieldState.Absent,
  mergeCommitMessageState = FieldState.Absent,
  mergeCommitTitleState = FieldState.Absent,
  organizationState = FieldState.Absent,
  parentState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  pullRequestCreationPolicyState = FieldState.Absent,
  securityAndAnalysisState = FieldState.Absent,
  sourceState = FieldState.Absent,
  squashMergeCommitMessageState = FieldState.Absent,
  squashMergeCommitTitleState = FieldState.Absent,
  tempCloneTokenState = FieldState.Absent,
  templateRepositoryState = FieldState.Absent,
  topicsState = FieldState.Absent,
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
   * Returns the wire presence of `anonymous_access_enabled`.
   */
  public fun anonymousAccessEnabledPresence(): FieldPresence = anonymousAccessEnabledState.presence

  /**
   * Returns the wire presence of `code_of_conduct`.
   */
  public fun codeOfConductPresence(): FieldPresence = codeOfConductState.presence

  /**
   * Returns the wire presence of `custom_properties`.
   */
  public fun customPropertiesPresence(): FieldPresence = customPropertiesState.presence

  /**
   * Returns the wire presence of `delete_branch_on_merge`.
   */
  public fun deleteBranchOnMergePresence(): FieldPresence = deleteBranchOnMergeState.presence

  /**
   * Returns the wire presence of `has_downloads`.
   */
  public fun hasDownloadsPresence(): FieldPresence = hasDownloadsState.presence

  /**
   * Returns the wire presence of `has_pull_requests`.
   */
  public fun hasPullRequestsPresence(): FieldPresence = hasPullRequestsState.presence

  /**
   * Returns the wire presence of `is_template`.
   */
  public fun isTemplatePresence(): FieldPresence = isTemplateState.presence

  /**
   * Returns the wire presence of `master_branch`.
   */
  public fun masterBranchPresence(): FieldPresence = masterBranchState.presence

  /**
   * Returns the wire presence of `merge_commit_message`.
   */
  public fun mergeCommitMessagePresence(): FieldPresence = mergeCommitMessageState.presence

  /**
   * Returns the wire presence of `merge_commit_title`.
   */
  public fun mergeCommitTitlePresence(): FieldPresence = mergeCommitTitleState.presence

  /**
   * Returns the wire presence of `organization`.
   */
  public fun organizationPresence(): FieldPresence = organizationState.presence

  /**
   * Returns the wire presence of `parent`.
   */
  public fun parentPresence(): FieldPresence = parentState.presence

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  /**
   * Returns the wire presence of `pull_request_creation_policy`.
   */
  public fun pullRequestCreationPolicyPresence(): FieldPresence = pullRequestCreationPolicyState.presence

  /**
   * Returns the wire presence of `security_and_analysis`.
   */
  public fun securityAndAnalysisPresence(): FieldPresence = securityAndAnalysisState.presence

  /**
   * Returns the wire presence of `source`.
   */
  public fun sourcePresence(): FieldPresence = sourceState.presence

  /**
   * Returns the wire presence of `squash_merge_commit_message`.
   */
  public fun squashMergeCommitMessagePresence(): FieldPresence = squashMergeCommitMessageState.presence

  /**
   * Returns the wire presence of `squash_merge_commit_title`.
   */
  public fun squashMergeCommitTitlePresence(): FieldPresence = squashMergeCommitTitleState.presence

  /**
   * Returns the wire presence of `temp_clone_token`.
   */
  public fun tempCloneTokenPresence(): FieldPresence = tempCloneTokenState.presence

  /**
   * Returns the wire presence of `template_repository`.
   */
  public fun templateRepositoryPresence(): FieldPresence = templateRepositoryState.presence

  /**
   * Returns the wire presence of `topics`.
   */
  public fun topicsPresence(): FieldPresence = topicsState.presence

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
    private var archiveUrlValue: String? = null

    public var archiveUrl: String
      get() = requireNotNull(archiveUrlValue) { "archiveUrl is required" }
      set(`value`) {
        archiveUrlValue = value
      }

    private var archivedValue: Boolean? = null

    public var archived: Boolean
      get() = requireNotNull(archivedValue) { "archived is required" }
      set(`value`) {
        archivedValue = value
      }

    private var assigneesUrlValue: String? = null

    public var assigneesUrl: String
      get() = requireNotNull(assigneesUrlValue) { "assigneesUrl is required" }
      set(`value`) {
        assigneesUrlValue = value
      }

    private var blobsUrlValue: String? = null

    public var blobsUrl: String
      get() = requireNotNull(blobsUrlValue) { "blobsUrl is required" }
      set(`value`) {
        blobsUrlValue = value
      }

    private var branchesUrlValue: String? = null

    public var branchesUrl: String
      get() = requireNotNull(branchesUrlValue) { "branchesUrl is required" }
      set(`value`) {
        branchesUrlValue = value
      }

    private var cloneUrlValue: String? = null

    public var cloneUrl: String
      get() = requireNotNull(cloneUrlValue) { "cloneUrl is required" }
      set(`value`) {
        cloneUrlValue = value
      }

    private var collaboratorsUrlValue: String? = null

    public var collaboratorsUrl: String
      get() = requireNotNull(collaboratorsUrlValue) { "collaboratorsUrl is required" }
      set(`value`) {
        collaboratorsUrlValue = value
      }

    private var commentsUrlValue: String? = null

    public var commentsUrl: String
      get() = requireNotNull(commentsUrlValue) { "commentsUrl is required" }
      set(`value`) {
        commentsUrlValue = value
      }

    private var commitsUrlValue: String? = null

    public var commitsUrl: String
      get() = requireNotNull(commitsUrlValue) { "commitsUrl is required" }
      set(`value`) {
        commitsUrlValue = value
      }

    private var compareUrlValue: String? = null

    public var compareUrl: String
      get() = requireNotNull(compareUrlValue) { "compareUrl is required" }
      set(`value`) {
        compareUrlValue = value
      }

    private var contentsUrlValue: String? = null

    public var contentsUrl: String
      get() = requireNotNull(contentsUrlValue) { "contentsUrl is required" }
      set(`value`) {
        contentsUrlValue = value
      }

    private var contributorsUrlValue: String? = null

    public var contributorsUrl: String
      get() = requireNotNull(contributorsUrlValue) { "contributorsUrl is required" }
      set(`value`) {
        contributorsUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var defaultBranchValue: String? = null

    public var defaultBranch: String
      get() = requireNotNull(defaultBranchValue) { "defaultBranch is required" }
      set(`value`) {
        defaultBranchValue = value
      }

    private var deploymentsUrlValue: String? = null

    public var deploymentsUrl: String
      get() = requireNotNull(deploymentsUrlValue) { "deploymentsUrl is required" }
      set(`value`) {
        deploymentsUrlValue = value
      }

    private var disabledValue: Boolean? = null

    public var disabled: Boolean
      get() = requireNotNull(disabledValue) { "disabled is required" }
      set(`value`) {
        disabledValue = value
      }

    private var downloadsUrlValue: String? = null

    public var downloadsUrl: String
      get() = requireNotNull(downloadsUrlValue) { "downloadsUrl is required" }
      set(`value`) {
        downloadsUrlValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var forkValue: Boolean? = null

    public var fork: Boolean
      get() = requireNotNull(forkValue) { "fork is required" }
      set(`value`) {
        forkValue = value
      }

    private var forksValue: Int? = null

    public var forks: Int
      get() = requireNotNull(forksValue) { "forks is required" }
      set(`value`) {
        forksValue = value
      }

    private var forksCountValue: Int? = null

    public var forksCount: Int
      get() = requireNotNull(forksCountValue) { "forksCount is required" }
      set(`value`) {
        forksCountValue = value
      }

    private var forksUrlValue: String? = null

    public var forksUrl: String
      get() = requireNotNull(forksUrlValue) { "forksUrl is required" }
      set(`value`) {
        forksUrlValue = value
      }

    private var fullNameValue: String? = null

    public var fullName: String
      get() = requireNotNull(fullNameValue) { "fullName is required" }
      set(`value`) {
        fullNameValue = value
      }

    private var gitCommitsUrlValue: String? = null

    public var gitCommitsUrl: String
      get() = requireNotNull(gitCommitsUrlValue) { "gitCommitsUrl is required" }
      set(`value`) {
        gitCommitsUrlValue = value
      }

    private var gitRefsUrlValue: String? = null

    public var gitRefsUrl: String
      get() = requireNotNull(gitRefsUrlValue) { "gitRefsUrl is required" }
      set(`value`) {
        gitRefsUrlValue = value
      }

    private var gitTagsUrlValue: String? = null

    public var gitTagsUrl: String
      get() = requireNotNull(gitTagsUrlValue) { "gitTagsUrl is required" }
      set(`value`) {
        gitTagsUrlValue = value
      }

    private var gitUrlValue: String? = null

    public var gitUrl: String
      get() = requireNotNull(gitUrlValue) { "gitUrl is required" }
      set(`value`) {
        gitUrlValue = value
      }

    private var hasDiscussionsValue: Boolean? = null

    public var hasDiscussions: Boolean
      get() = requireNotNull(hasDiscussionsValue) { "hasDiscussions is required" }
      set(`value`) {
        hasDiscussionsValue = value
      }

    private var hasIssuesValue: Boolean? = null

    public var hasIssues: Boolean
      get() = requireNotNull(hasIssuesValue) { "hasIssues is required" }
      set(`value`) {
        hasIssuesValue = value
      }

    private var hasPagesValue: Boolean? = null

    public var hasPages: Boolean
      get() = requireNotNull(hasPagesValue) { "hasPages is required" }
      set(`value`) {
        hasPagesValue = value
      }

    private var hasProjectsValue: Boolean? = null

    public var hasProjects: Boolean
      get() = requireNotNull(hasProjectsValue) { "hasProjects is required" }
      set(`value`) {
        hasProjectsValue = value
      }

    private var hasWikiValue: Boolean? = null

    public var hasWiki: Boolean
      get() = requireNotNull(hasWikiValue) { "hasWiki is required" }
      set(`value`) {
        hasWikiValue = value
      }

    private var hooksUrlValue: String? = null

    public var hooksUrl: String
      get() = requireNotNull(hooksUrlValue) { "hooksUrl is required" }
      set(`value`) {
        hooksUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var issueCommentUrlValue: String? = null

    public var issueCommentUrl: String
      get() = requireNotNull(issueCommentUrlValue) { "issueCommentUrl is required" }
      set(`value`) {
        issueCommentUrlValue = value
      }

    private var issueEventsUrlValue: String? = null

    public var issueEventsUrl: String
      get() = requireNotNull(issueEventsUrlValue) { "issueEventsUrl is required" }
      set(`value`) {
        issueEventsUrlValue = value
      }

    private var issuesUrlValue: String? = null

    public var issuesUrl: String
      get() = requireNotNull(issuesUrlValue) { "issuesUrl is required" }
      set(`value`) {
        issuesUrlValue = value
      }

    private var keysUrlValue: String? = null

    public var keysUrl: String
      get() = requireNotNull(keysUrlValue) { "keysUrl is required" }
      set(`value`) {
        keysUrlValue = value
      }

    private var labelsUrlValue: String? = null

    public var labelsUrl: String
      get() = requireNotNull(labelsUrlValue) { "labelsUrl is required" }
      set(`value`) {
        labelsUrlValue = value
      }

    private var languagesUrlValue: String? = null

    public var languagesUrl: String
      get() = requireNotNull(languagesUrlValue) { "languagesUrl is required" }
      set(`value`) {
        languagesUrlValue = value
      }

    private var mergesUrlValue: String? = null

    public var mergesUrl: String
      get() = requireNotNull(mergesUrlValue) { "mergesUrl is required" }
      set(`value`) {
        mergesUrlValue = value
      }

    private var milestonesUrlValue: String? = null

    public var milestonesUrl: String
      get() = requireNotNull(milestonesUrlValue) { "milestonesUrl is required" }
      set(`value`) {
        milestonesUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var networkCountValue: Int? = null

    public var networkCount: Int
      get() = requireNotNull(networkCountValue) { "networkCount is required" }
      set(`value`) {
        networkCountValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var notificationsUrlValue: String? = null

    public var notificationsUrl: String
      get() = requireNotNull(notificationsUrlValue) { "notificationsUrl is required" }
      set(`value`) {
        notificationsUrlValue = value
      }

    private var openIssuesValue: Int? = null

    public var openIssues: Int
      get() = requireNotNull(openIssuesValue) { "openIssues is required" }
      set(`value`) {
        openIssuesValue = value
      }

    private var openIssuesCountValue: Int? = null

    public var openIssuesCount: Int
      get() = requireNotNull(openIssuesCountValue) { "openIssuesCount is required" }
      set(`value`) {
        openIssuesCountValue = value
      }

    private var ownerValue: SimpleUser? = null

    public var owner: SimpleUser
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    private var privateValue: Boolean? = null

    public var `private`: Boolean
      get() = requireNotNull(privateValue) { "private is required" }
      set(`value`) {
        privateValue = value
      }

    private var pullsUrlValue: String? = null

    public var pullsUrl: String
      get() = requireNotNull(pullsUrlValue) { "pullsUrl is required" }
      set(`value`) {
        pullsUrlValue = value
      }

    private var pushedAtValue: String? = null

    public var pushedAt: String
      get() = requireNotNull(pushedAtValue) { "pushedAt is required" }
      set(`value`) {
        pushedAtValue = value
      }

    private var releasesUrlValue: String? = null

    public var releasesUrl: String
      get() = requireNotNull(releasesUrlValue) { "releasesUrl is required" }
      set(`value`) {
        releasesUrlValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    private var sshUrlValue: String? = null

    public var sshUrl: String
      get() = requireNotNull(sshUrlValue) { "sshUrl is required" }
      set(`value`) {
        sshUrlValue = value
      }

    private var stargazersCountValue: Int? = null

    public var stargazersCount: Int
      get() = requireNotNull(stargazersCountValue) { "stargazersCount is required" }
      set(`value`) {
        stargazersCountValue = value
      }

    private var stargazersUrlValue: String? = null

    public var stargazersUrl: String
      get() = requireNotNull(stargazersUrlValue) { "stargazersUrl is required" }
      set(`value`) {
        stargazersUrlValue = value
      }

    private var statusesUrlValue: String? = null

    public var statusesUrl: String
      get() = requireNotNull(statusesUrlValue) { "statusesUrl is required" }
      set(`value`) {
        statusesUrlValue = value
      }

    private var subscribersCountValue: Int? = null

    public var subscribersCount: Int
      get() = requireNotNull(subscribersCountValue) { "subscribersCount is required" }
      set(`value`) {
        subscribersCountValue = value
      }

    private var subscribersUrlValue: String? = null

    public var subscribersUrl: String
      get() = requireNotNull(subscribersUrlValue) { "subscribersUrl is required" }
      set(`value`) {
        subscribersUrlValue = value
      }

    private var subscriptionUrlValue: String? = null

    public var subscriptionUrl: String
      get() = requireNotNull(subscriptionUrlValue) { "subscriptionUrl is required" }
      set(`value`) {
        subscriptionUrlValue = value
      }

    private var svnUrlValue: String? = null

    public var svnUrl: String
      get() = requireNotNull(svnUrlValue) { "svnUrl is required" }
      set(`value`) {
        svnUrlValue = value
      }

    private var tagsUrlValue: String? = null

    public var tagsUrl: String
      get() = requireNotNull(tagsUrlValue) { "tagsUrl is required" }
      set(`value`) {
        tagsUrlValue = value
      }

    private var teamsUrlValue: String? = null

    public var teamsUrl: String
      get() = requireNotNull(teamsUrlValue) { "teamsUrl is required" }
      set(`value`) {
        teamsUrlValue = value
      }

    private var treesUrlValue: String? = null

    public var treesUrl: String
      get() = requireNotNull(treesUrlValue) { "treesUrl is required" }
      set(`value`) {
        treesUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var watchersValue: Int? = null

    public var watchers: Int
      get() = requireNotNull(watchersValue) { "watchers is required" }
      set(`value`) {
        watchersValue = value
      }

    private var watchersCountValue: Int? = null

    public var watchersCount: Int
      get() = requireNotNull(watchersCountValue) { "watchersCount is required" }
      set(`value`) {
        watchersCountValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var homepageState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var homepage: String?
      get() = homepageState.valueOrNull()
      set(`value`) {
        homepageState = value.toNullableFieldState()
      }

    private var languageState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var language: String?
      get() = languageState.valueOrNull()
      set(`value`) {
        languageState = value.toNullableFieldState()
      }

    private var licenseState: FieldState<NullableLicenseSimple?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var license: NullableLicenseSimple?
      get() = licenseState.valueOrNull()
      set(`value`) {
        licenseState = value.toNullableFieldState()
      }

    private var mirrorUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var mirrorUrl: String?
      get() = mirrorUrlState.valueOrNull()
      set(`value`) {
        mirrorUrlState = value.toNullableFieldState()
      }

    private var allowAutoMergeState: FieldState<Boolean> = FieldState.Absent

    /**
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
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var allowUpdateBranch: Boolean?
      get() = allowUpdateBranchState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "allowUpdateBranch is not nullable; call unsetAllowUpdateBranch() to omit it" }
        allowUpdateBranchState = FieldState.Value(present)
      }

    private var anonymousAccessEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether anonymous git access is allowed.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var anonymousAccessEnabled: Boolean?
      get() = anonymousAccessEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "anonymousAccessEnabled is not nullable; call unsetAnonymousAccessEnabled() to omit it" }
        anonymousAccessEnabledState = FieldState.Value(present)
      }

    private var codeOfConductState: FieldState<CodeOfConductSimple> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeOfConduct: CodeOfConductSimple?
      get() = codeOfConductState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "codeOfConduct is not nullable; call unsetCodeOfConduct() to omit it" }
        codeOfConductState = FieldState.Value(present)
      }

    private var customPropertiesState: FieldState<JsonObject> = FieldState.Absent

    /**
     * The custom properties that were defined for the repository. The keys are the custom property names, and the
     * values are the corresponding custom property values.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var customProperties: JsonObject?
      get() = customPropertiesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "customProperties is not nullable; call unsetCustomProperties() to omit it" }
        customPropertiesState = FieldState.Value(present)
      }

    private var deleteBranchOnMergeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var deleteBranchOnMerge: Boolean?
      get() = deleteBranchOnMergeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "deleteBranchOnMerge is not nullable; call unsetDeleteBranchOnMerge() to omit it" }
        deleteBranchOnMergeState = FieldState.Value(present)
      }

    private var hasDownloadsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasDownloads: Boolean?
      get() = hasDownloadsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasDownloads is not nullable; call unsetHasDownloads() to omit it" }
        hasDownloadsState = FieldState.Value(present)
      }

    private var hasPullRequestsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasPullRequests: Boolean?
      get() = hasPullRequestsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasPullRequests is not nullable; call unsetHasPullRequests() to omit it" }
        hasPullRequestsState = FieldState.Value(present)
      }

    private var isTemplateState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isTemplate: Boolean?
      get() = isTemplateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isTemplate is not nullable; call unsetIsTemplate() to omit it" }
        isTemplateState = FieldState.Value(present)
      }

    private var masterBranchState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var masterBranch: String?
      get() = masterBranchState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "masterBranch is not nullable; call unsetMasterBranch() to omit it" }
        masterBranchState = FieldState.Value(present)
      }

    private var mergeCommitMessageState: FieldState<InlineFullRepositoryMergeCommitMessageX0baec2f1>
        = FieldState.Absent

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var mergeCommitMessage: InlineFullRepositoryMergeCommitMessageX0baec2f1?
      get() = mergeCommitMessageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "mergeCommitMessage is not nullable; call unsetMergeCommitMessage() to omit it" }
        mergeCommitMessageState = FieldState.Value(present)
      }

    private var mergeCommitTitleState: FieldState<InlineFullRepositoryMergeCommitTitleXb8572949> =
        FieldState.Absent

    /**
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
     * branch-name).
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var mergeCommitTitle: InlineFullRepositoryMergeCommitTitleXb8572949?
      get() = mergeCommitTitleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "mergeCommitTitle is not nullable; call unsetMergeCommitTitle() to omit it" }
        mergeCommitTitleState = FieldState.Value(present)
      }

    private var organizationState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var organization: NullableSimpleUser?
      get() = organizationState.valueOrNull()
      set(`value`) {
        organizationState = value.toNullableFieldState()
      }

    private var parentState: FieldState<Repository> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var parent: Repository?
      get() = parentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "parent is not nullable; call unsetParent() to omit it" }
        parentState = FieldState.Value(present)
      }

    private var permissionsState: FieldState<InlineFullRepositoryPermissionsX8e042fdd> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineFullRepositoryPermissionsX8e042fdd?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    private var pullRequestCreationPolicyState:
        FieldState<InlineFullRepositoryPullRequestCreationPolicyX8abb9658> = FieldState.Absent

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pullRequestCreationPolicy: InlineFullRepositoryPullRequestCreationPolicyX8abb9658?
      get() = pullRequestCreationPolicyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pullRequestCreationPolicy is not nullable; call unsetPullRequestCreationPolicy() to omit it" }
        pullRequestCreationPolicyState = FieldState.Value(present)
      }

    private var securityAndAnalysisState: FieldState<SecurityAndAnalysis?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var securityAndAnalysis: SecurityAndAnalysis?
      get() = securityAndAnalysisState.valueOrNull()
      set(`value`) {
        securityAndAnalysisState = value.toNullableFieldState()
      }

    private var sourceState: FieldState<Repository> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var source: Repository?
      get() = sourceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "source is not nullable; call unsetSource() to omit it" }
        sourceState = FieldState.Value(present)
      }

    private var squashMergeCommitMessageState:
        FieldState<InlineFullRepositorySquashMergeCommitMessageX17602f43> = FieldState.Absent

    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var squashMergeCommitMessage: InlineFullRepositorySquashMergeCommitMessageX17602f43?
      get() = squashMergeCommitMessageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "squashMergeCommitMessage is not nullable; call unsetSquashMergeCommitMessage() to omit it" }
        squashMergeCommitMessageState = FieldState.Value(present)
      }

    private var squashMergeCommitTitleState:
        FieldState<InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5> = FieldState.Absent

    /**
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when
     * more than one commit).
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var squashMergeCommitTitle: InlineFullRepositorySquashMergeCommitTitleX0b9c4fd5?
      get() = squashMergeCommitTitleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "squashMergeCommitTitle is not nullable; call unsetSquashMergeCommitTitle() to omit it" }
        squashMergeCommitTitleState = FieldState.Value(present)
      }

    private var tempCloneTokenState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var tempCloneToken: String?
      get() = tempCloneTokenState.valueOrNull()
      set(`value`) {
        tempCloneTokenState = value.toNullableFieldState()
      }

    private var templateRepositoryState: FieldState<NullableRepository?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var templateRepository: NullableRepository?
      get() = templateRepositoryState.valueOrNull()
      set(`value`) {
        templateRepositoryState = value.toNullableFieldState()
      }

    private var topicsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var topics: List<String>?
      get() = topicsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "topics is not nullable; call unsetTopics() to omit it" }
        topicsState = FieldState.Value(present.toList())
      }

    private var useSquashPrTitleAsDefaultState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var useSquashPrTitleAsDefault: Boolean?
      get() = useSquashPrTitleAsDefaultState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "useSquashPrTitleAsDefault is not nullable; call unsetUseSquashPrTitleAsDefault() to omit it" }
        useSquashPrTitleAsDefaultState = FieldState.Value(present)
      }

    private var visibilityState: FieldState<String> = FieldState.Absent

    /**
     * The repository visibility: public, private, or internal.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var visibility: String?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "visibility is not nullable; call unsetVisibility() to omit it" }
        visibilityState = FieldState.Value(present)
      }

    private var webCommitSignoffRequiredState: FieldState<Boolean> = FieldState.Absent

    /**
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
     * Omits `anonymous_access_enabled` from serialized output.
     */
    public fun unsetAnonymousAccessEnabled() {
      anonymousAccessEnabledState = FieldState.Absent
    }

    /**
     * Omits `code_of_conduct` from serialized output.
     */
    public fun unsetCodeOfConduct() {
      codeOfConductState = FieldState.Absent
    }

    /**
     * Omits `custom_properties` from serialized output.
     */
    public fun unsetCustomProperties() {
      customPropertiesState = FieldState.Absent
    }

    /**
     * Omits `delete_branch_on_merge` from serialized output.
     */
    public fun unsetDeleteBranchOnMerge() {
      deleteBranchOnMergeState = FieldState.Absent
    }

    /**
     * Omits `has_downloads` from serialized output.
     */
    public fun unsetHasDownloads() {
      hasDownloadsState = FieldState.Absent
    }

    /**
     * Omits `has_pull_requests` from serialized output.
     */
    public fun unsetHasPullRequests() {
      hasPullRequestsState = FieldState.Absent
    }

    /**
     * Omits `is_template` from serialized output.
     */
    public fun unsetIsTemplate() {
      isTemplateState = FieldState.Absent
    }

    /**
     * Omits `master_branch` from serialized output.
     */
    public fun unsetMasterBranch() {
      masterBranchState = FieldState.Absent
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
     * Omits `organization` from serialized output.
     */
    public fun unsetOrganization() {
      organizationState = FieldState.Absent
    }

    /**
     * Omits `parent` from serialized output.
     */
    public fun unsetParent() {
      parentState = FieldState.Absent
    }

    /**
     * Omits `permissions` from serialized output.
     */
    public fun unsetPermissions() {
      permissionsState = FieldState.Absent
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
     * Omits `source` from serialized output.
     */
    public fun unsetSource() {
      sourceState = FieldState.Absent
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
     * Omits `temp_clone_token` from serialized output.
     */
    public fun unsetTempCloneToken() {
      tempCloneTokenState = FieldState.Absent
    }

    /**
     * Omits `template_repository` from serialized output.
     */
    public fun unsetTemplateRepository() {
      templateRepositoryState = FieldState.Absent
    }

    /**
     * Omits `topics` from serialized output.
     */
    public fun unsetTopics() {
      topicsState = FieldState.Absent
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

    public fun build(): FullRepository {
      check(archiveUrlValue != null) { "archiveUrl is required" }
      check(archivedValue != null) { "archived is required" }
      check(assigneesUrlValue != null) { "assigneesUrl is required" }
      check(blobsUrlValue != null) { "blobsUrl is required" }
      check(branchesUrlValue != null) { "branchesUrl is required" }
      check(cloneUrlValue != null) { "cloneUrl is required" }
      check(collaboratorsUrlValue != null) { "collaboratorsUrl is required" }
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(commitsUrlValue != null) { "commitsUrl is required" }
      check(compareUrlValue != null) { "compareUrl is required" }
      check(contentsUrlValue != null) { "contentsUrl is required" }
      check(contributorsUrlValue != null) { "contributorsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(defaultBranchValue != null) { "defaultBranch is required" }
      check(deploymentsUrlValue != null) { "deploymentsUrl is required" }
      check(disabledValue != null) { "disabled is required" }
      check(downloadsUrlValue != null) { "downloadsUrl is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(forkValue != null) { "fork is required" }
      check(forksValue != null) { "forks is required" }
      check(forksCountValue != null) { "forksCount is required" }
      check(forksUrlValue != null) { "forksUrl is required" }
      check(fullNameValue != null) { "fullName is required" }
      check(gitCommitsUrlValue != null) { "gitCommitsUrl is required" }
      check(gitRefsUrlValue != null) { "gitRefsUrl is required" }
      check(gitTagsUrlValue != null) { "gitTagsUrl is required" }
      check(gitUrlValue != null) { "gitUrl is required" }
      check(hasDiscussionsValue != null) { "hasDiscussions is required" }
      check(hasIssuesValue != null) { "hasIssues is required" }
      check(hasPagesValue != null) { "hasPages is required" }
      check(hasProjectsValue != null) { "hasProjects is required" }
      check(hasWikiValue != null) { "hasWiki is required" }
      check(hooksUrlValue != null) { "hooksUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(issueCommentUrlValue != null) { "issueCommentUrl is required" }
      check(issueEventsUrlValue != null) { "issueEventsUrl is required" }
      check(issuesUrlValue != null) { "issuesUrl is required" }
      check(keysUrlValue != null) { "keysUrl is required" }
      check(labelsUrlValue != null) { "labelsUrl is required" }
      check(languagesUrlValue != null) { "languagesUrl is required" }
      check(mergesUrlValue != null) { "mergesUrl is required" }
      check(milestonesUrlValue != null) { "milestonesUrl is required" }
      check(nameValue != null) { "name is required" }
      check(networkCountValue != null) { "networkCount is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(notificationsUrlValue != null) { "notificationsUrl is required" }
      check(openIssuesValue != null) { "openIssues is required" }
      check(openIssuesCountValue != null) { "openIssuesCount is required" }
      check(ownerValue != null) { "owner is required" }
      check(privateValue != null) { "private is required" }
      check(pullsUrlValue != null) { "pullsUrl is required" }
      check(pushedAtValue != null) { "pushedAt is required" }
      check(releasesUrlValue != null) { "releasesUrl is required" }
      check(sizeValue != null) { "size is required" }
      check(sshUrlValue != null) { "sshUrl is required" }
      check(stargazersCountValue != null) { "stargazersCount is required" }
      check(stargazersUrlValue != null) { "stargazersUrl is required" }
      check(statusesUrlValue != null) { "statusesUrl is required" }
      check(subscribersCountValue != null) { "subscribersCount is required" }
      check(subscribersUrlValue != null) { "subscribersUrl is required" }
      check(subscriptionUrlValue != null) { "subscriptionUrl is required" }
      check(svnUrlValue != null) { "svnUrl is required" }
      check(tagsUrlValue != null) { "tagsUrl is required" }
      check(teamsUrlValue != null) { "teamsUrl is required" }
      check(treesUrlValue != null) { "treesUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(watchersValue != null) { "watchers is required" }
      check(watchersCountValue != null) { "watchersCount is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(homepageState !== FieldState.Absent) { "homepage is required, even when null" }
      check(languageState !== FieldState.Absent) { "language is required, even when null" }
      check(licenseState !== FieldState.Absent) { "license is required, even when null" }
      check(mirrorUrlState !== FieldState.Absent) { "mirrorUrl is required, even when null" }
      return FullRepository(
        archiveUrl = archiveUrl,
        archived = archived,
        assigneesUrl = assigneesUrl,
        blobsUrl = blobsUrl,
        branchesUrl = branchesUrl,
        cloneUrl = cloneUrl,
        collaboratorsUrl = collaboratorsUrl,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        compareUrl = compareUrl,
        contentsUrl = contentsUrl,
        contributorsUrl = contributorsUrl,
        createdAt = createdAt,
        defaultBranch = defaultBranch,
        deploymentsUrl = deploymentsUrl,
        description = descriptionState.valueOrNull(),
        disabled = disabled,
        downloadsUrl = downloadsUrl,
        eventsUrl = eventsUrl,
        fork = fork,
        forks = forks,
        forksCount = forksCount,
        forksUrl = forksUrl,
        fullName = fullName,
        gitCommitsUrl = gitCommitsUrl,
        gitRefsUrl = gitRefsUrl,
        gitTagsUrl = gitTagsUrl,
        gitUrl = gitUrl,
        hasDiscussions = hasDiscussions,
        hasIssues = hasIssues,
        hasPages = hasPages,
        hasProjects = hasProjects,
        hasWiki = hasWiki,
        homepage = homepageState.valueOrNull(),
        hooksUrl = hooksUrl,
        htmlUrl = htmlUrl,
        id = id,
        issueCommentUrl = issueCommentUrl,
        issueEventsUrl = issueEventsUrl,
        issuesUrl = issuesUrl,
        keysUrl = keysUrl,
        labelsUrl = labelsUrl,
        language = languageState.valueOrNull(),
        languagesUrl = languagesUrl,
        license = licenseState.valueOrNull(),
        mergesUrl = mergesUrl,
        milestonesUrl = milestonesUrl,
        mirrorUrl = mirrorUrlState.valueOrNull(),
        name = name,
        networkCount = networkCount,
        nodeId = nodeId,
        notificationsUrl = notificationsUrl,
        openIssues = openIssues,
        openIssuesCount = openIssuesCount,
        owner = owner,
        private = private,
        pullsUrl = pullsUrl,
        pushedAt = pushedAt,
        releasesUrl = releasesUrl,
        size = size,
        sshUrl = sshUrl,
        stargazersCount = stargazersCount,
        stargazersUrl = stargazersUrl,
        statusesUrl = statusesUrl,
        subscribersCount = subscribersCount,
        subscribersUrl = subscribersUrl,
        subscriptionUrl = subscriptionUrl,
        svnUrl = svnUrl,
        tagsUrl = tagsUrl,
        teamsUrl = teamsUrl,
        treesUrl = treesUrl,
        updatedAt = updatedAt,
        url = url,
        watchers = watchers,
        watchersCount = watchersCount,
        allowAutoMergeState = allowAutoMergeState,
        allowForkingState = allowForkingState,
        allowMergeCommitState = allowMergeCommitState,
        allowRebaseMergeState = allowRebaseMergeState,
        allowSquashMergeState = allowSquashMergeState,
        allowUpdateBranchState = allowUpdateBranchState,
        anonymousAccessEnabledState = anonymousAccessEnabledState,
        codeOfConductState = codeOfConductState,
        customPropertiesState = customPropertiesState,
        deleteBranchOnMergeState = deleteBranchOnMergeState,
        hasDownloadsState = hasDownloadsState,
        hasPullRequestsState = hasPullRequestsState,
        isTemplateState = isTemplateState,
        masterBranchState = masterBranchState,
        mergeCommitMessageState = mergeCommitMessageState,
        mergeCommitTitleState = mergeCommitTitleState,
        organizationState = organizationState,
        parentState = parentState,
        permissionsState = permissionsState,
        pullRequestCreationPolicyState = pullRequestCreationPolicyState,
        securityAndAnalysisState = securityAndAnalysisState,
        sourceState = sourceState,
        squashMergeCommitMessageState = squashMergeCommitMessageState,
        squashMergeCommitTitleState = squashMergeCommitTitleState,
        tempCloneTokenState = tempCloneTokenState,
        templateRepositoryState = templateRepositoryState,
        topicsState = topicsState,
        useSquashPrTitleAsDefaultState = useSquashPrTitleAsDefaultState,
        visibilityState = visibilityState,
        webCommitSignoffRequiredState = webCommitSignoffRequiredState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FullRepository = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FullRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FullRepository {
      val jsonDecoder = decoder.requireJsonDecoder("FullRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FullRepository must be a JSON object")
      val archiveUrl = json.decodeRequired<String>(rawObject, "archive_url")
      val archived = json.decodeRequired<Boolean>(rawObject, "archived")
      val assigneesUrl = json.decodeRequired<String>(rawObject, "assignees_url")
      val blobsUrl = json.decodeRequired<String>(rawObject, "blobs_url")
      val branchesUrl = json.decodeRequired<String>(rawObject, "branches_url")
      val cloneUrl = json.decodeRequired<String>(rawObject, "clone_url")
      val collaboratorsUrl = json.decodeRequired<String>(rawObject, "collaborators_url")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commitsUrl = json.decodeRequired<String>(rawObject, "commits_url")
      val compareUrl = json.decodeRequired<String>(rawObject, "compare_url")
      val contentsUrl = json.decodeRequired<String>(rawObject, "contents_url")
      val contributorsUrl = json.decodeRequired<String>(rawObject, "contributors_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val defaultBranch = json.decodeRequired<String>(rawObject, "default_branch")
      val deploymentsUrl = json.decodeRequired<String>(rawObject, "deployments_url")
      val disabled = json.decodeRequired<Boolean>(rawObject, "disabled")
      val downloadsUrl = json.decodeRequired<String>(rawObject, "downloads_url")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val fork = json.decodeRequired<Boolean>(rawObject, "fork")
      val forks = json.decodeRequired<Int>(rawObject, "forks")
      val forksCount = json.decodeRequired<Int>(rawObject, "forks_count")
      val forksUrl = json.decodeRequired<String>(rawObject, "forks_url")
      val fullName = json.decodeRequired<String>(rawObject, "full_name")
      val gitCommitsUrl = json.decodeRequired<String>(rawObject, "git_commits_url")
      val gitRefsUrl = json.decodeRequired<String>(rawObject, "git_refs_url")
      val gitTagsUrl = json.decodeRequired<String>(rawObject, "git_tags_url")
      val gitUrl = json.decodeRequired<String>(rawObject, "git_url")
      val hasDiscussions = json.decodeRequired<Boolean>(rawObject, "has_discussions")
      val hasIssues = json.decodeRequired<Boolean>(rawObject, "has_issues")
      val hasPages = json.decodeRequired<Boolean>(rawObject, "has_pages")
      val hasProjects = json.decodeRequired<Boolean>(rawObject, "has_projects")
      val hasWiki = json.decodeRequired<Boolean>(rawObject, "has_wiki")
      val hooksUrl = json.decodeRequired<String>(rawObject, "hooks_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val issueCommentUrl = json.decodeRequired<String>(rawObject, "issue_comment_url")
      val issueEventsUrl = json.decodeRequired<String>(rawObject, "issue_events_url")
      val issuesUrl = json.decodeRequired<String>(rawObject, "issues_url")
      val keysUrl = json.decodeRequired<String>(rawObject, "keys_url")
      val labelsUrl = json.decodeRequired<String>(rawObject, "labels_url")
      val languagesUrl = json.decodeRequired<String>(rawObject, "languages_url")
      val mergesUrl = json.decodeRequired<String>(rawObject, "merges_url")
      val milestonesUrl = json.decodeRequired<String>(rawObject, "milestones_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val networkCount = json.decodeRequired<Int>(rawObject, "network_count")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val notificationsUrl = json.decodeRequired<String>(rawObject, "notifications_url")
      val openIssues = json.decodeRequired<Int>(rawObject, "open_issues")
      val openIssuesCount = json.decodeRequired<Int>(rawObject, "open_issues_count")
      val owner = json.decodeRequired<SimpleUser>(rawObject, "owner")
      val private = json.decodeRequired<Boolean>(rawObject, "private")
      val pullsUrl = json.decodeRequired<String>(rawObject, "pulls_url")
      val pushedAt = json.decodeRequired<String>(rawObject, "pushed_at")
      val releasesUrl = json.decodeRequired<String>(rawObject, "releases_url")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val sshUrl = json.decodeRequired<String>(rawObject, "ssh_url")
      val stargazersCount = json.decodeRequired<Int>(rawObject, "stargazers_count")
      val stargazersUrl = json.decodeRequired<String>(rawObject, "stargazers_url")
      val statusesUrl = json.decodeRequired<String>(rawObject, "statuses_url")
      val subscribersCount = json.decodeRequired<Int>(rawObject, "subscribers_count")
      val subscribersUrl = json.decodeRequired<String>(rawObject, "subscribers_url")
      val subscriptionUrl = json.decodeRequired<String>(rawObject, "subscription_url")
      val svnUrl = json.decodeRequired<String>(rawObject, "svn_url")
      val tagsUrl = json.decodeRequired<String>(rawObject, "tags_url")
      val teamsUrl = json.decodeRequired<String>(rawObject, "teams_url")
      val treesUrl = json.decodeRequired<String>(rawObject, "trees_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val watchers = json.decodeRequired<Int>(rawObject, "watchers")
      val watchersCount = json.decodeRequired<Int>(rawObject, "watchers_count")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("FullRepository is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("homepage")) {
        throw SerializationException("FullRepository is missing required property 'homepage'")
      }
      val homepage = rawObject["homepage"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("language")) {
        throw SerializationException("FullRepository is missing required property 'language'")
      }
      val language = rawObject["language"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("license")) {
        throw SerializationException("FullRepository is missing required property 'license'")
      }
      val license = rawObject["license"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableLicenseSimple?>(requireNotNull(element)) }
      if (!rawObject.containsKey("mirror_url")) {
        throw SerializationException("FullRepository is missing required property 'mirror_url'")
      }
      val mirrorUrl = rawObject["mirror_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return FullRepository(
        archiveUrl = archiveUrl,
        archived = archived,
        assigneesUrl = assigneesUrl,
        blobsUrl = blobsUrl,
        branchesUrl = branchesUrl,
        cloneUrl = cloneUrl,
        collaboratorsUrl = collaboratorsUrl,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        compareUrl = compareUrl,
        contentsUrl = contentsUrl,
        contributorsUrl = contributorsUrl,
        createdAt = createdAt,
        defaultBranch = defaultBranch,
        deploymentsUrl = deploymentsUrl,
        description = description,
        disabled = disabled,
        downloadsUrl = downloadsUrl,
        eventsUrl = eventsUrl,
        fork = fork,
        forks = forks,
        forksCount = forksCount,
        forksUrl = forksUrl,
        fullName = fullName,
        gitCommitsUrl = gitCommitsUrl,
        gitRefsUrl = gitRefsUrl,
        gitTagsUrl = gitTagsUrl,
        gitUrl = gitUrl,
        hasDiscussions = hasDiscussions,
        hasIssues = hasIssues,
        hasPages = hasPages,
        hasProjects = hasProjects,
        hasWiki = hasWiki,
        homepage = homepage,
        hooksUrl = hooksUrl,
        htmlUrl = htmlUrl,
        id = id,
        issueCommentUrl = issueCommentUrl,
        issueEventsUrl = issueEventsUrl,
        issuesUrl = issuesUrl,
        keysUrl = keysUrl,
        labelsUrl = labelsUrl,
        language = language,
        languagesUrl = languagesUrl,
        license = license,
        mergesUrl = mergesUrl,
        milestonesUrl = milestonesUrl,
        mirrorUrl = mirrorUrl,
        name = name,
        networkCount = networkCount,
        nodeId = nodeId,
        notificationsUrl = notificationsUrl,
        openIssues = openIssues,
        openIssuesCount = openIssuesCount,
        owner = owner,
        private = private,
        pullsUrl = pullsUrl,
        pushedAt = pushedAt,
        releasesUrl = releasesUrl,
        size = size,
        sshUrl = sshUrl,
        stargazersCount = stargazersCount,
        stargazersUrl = stargazersUrl,
        statusesUrl = statusesUrl,
        subscribersCount = subscribersCount,
        subscribersUrl = subscribersUrl,
        subscriptionUrl = subscriptionUrl,
        svnUrl = svnUrl,
        tagsUrl = tagsUrl,
        teamsUrl = teamsUrl,
        treesUrl = treesUrl,
        updatedAt = updatedAt,
        url = url,
        watchers = watchers,
        watchersCount = watchersCount,
        allowAutoMergeState = json.decodeOptional(rawObject, "allow_auto_merge", nullable = false),
        allowForkingState = json.decodeOptional(rawObject, "allow_forking", nullable = false),
        allowMergeCommitState = json.decodeOptional(rawObject, "allow_merge_commit", nullable = false),
        allowRebaseMergeState = json.decodeOptional(rawObject, "allow_rebase_merge", nullable = false),
        allowSquashMergeState = json.decodeOptional(rawObject, "allow_squash_merge", nullable = false),
        allowUpdateBranchState = json.decodeOptional(rawObject, "allow_update_branch", nullable = false),
        anonymousAccessEnabledState = json.decodeOptional(rawObject, "anonymous_access_enabled", nullable = false),
        codeOfConductState = json.decodeOptional(rawObject, "code_of_conduct", nullable = false),
        customPropertiesState = json.decodeOptional(rawObject, "custom_properties", nullable = false),
        deleteBranchOnMergeState = json.decodeOptional(rawObject, "delete_branch_on_merge", nullable = false),
        hasDownloadsState = json.decodeOptional(rawObject, "has_downloads", nullable = false),
        hasPullRequestsState = json.decodeOptional(rawObject, "has_pull_requests", nullable = false),
        isTemplateState = json.decodeOptional(rawObject, "is_template", nullable = false),
        masterBranchState = json.decodeOptional(rawObject, "master_branch", nullable = false),
        mergeCommitMessageState = json.decodeOptional(rawObject, "merge_commit_message", nullable = false),
        mergeCommitTitleState = json.decodeOptional(rawObject, "merge_commit_title", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = true),
        parentState = json.decodeOptional(rawObject, "parent", nullable = false),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
        pullRequestCreationPolicyState = json.decodeOptional(rawObject, "pull_request_creation_policy", nullable = false),
        securityAndAnalysisState = json.decodeOptional(rawObject, "security_and_analysis", nullable = true),
        sourceState = json.decodeOptional(rawObject, "source", nullable = false),
        squashMergeCommitMessageState = json.decodeOptional(rawObject, "squash_merge_commit_message", nullable = false),
        squashMergeCommitTitleState = json.decodeOptional(rawObject, "squash_merge_commit_title", nullable = false),
        tempCloneTokenState = json.decodeOptional(rawObject, "temp_clone_token", nullable = true),
        templateRepositoryState = json.decodeOptional(rawObject, "template_repository", nullable = true),
        topicsState = json.decodeOptional(rawObject, "topics", nullable = false),
        useSquashPrTitleAsDefaultState = json.decodeOptional(rawObject, "use_squash_pr_title_as_default", nullable = false),
        visibilityState = json.decodeOptional(rawObject, "visibility", nullable = false),
        webCommitSignoffRequiredState = json.decodeOptional(rawObject, "web_commit_signoff_required", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: FullRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("FullRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archive_url", value.archiveUrl)
        put("archived", json.encodeToJsonElement(value.archived))
        put("assignees_url", value.assigneesUrl)
        put("blobs_url", value.blobsUrl)
        put("branches_url", value.branchesUrl)
        put("clone_url", value.cloneUrl)
        put("collaborators_url", value.collaboratorsUrl)
        put("comments_url", value.commentsUrl)
        put("commits_url", value.commitsUrl)
        put("compare_url", value.compareUrl)
        put("contents_url", value.contentsUrl)
        put("contributors_url", value.contributorsUrl)
        put("created_at", value.createdAt)
        put("default_branch", value.defaultBranch)
        put("deployments_url", value.deploymentsUrl)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("disabled", json.encodeToJsonElement(value.disabled))
        put("downloads_url", value.downloadsUrl)
        put("events_url", value.eventsUrl)
        put("fork", json.encodeToJsonElement(value.fork))
        put("forks", json.encodeToJsonElement(value.forks))
        put("forks_count", json.encodeToJsonElement(value.forksCount))
        put("forks_url", value.forksUrl)
        put("full_name", value.fullName)
        put("git_commits_url", value.gitCommitsUrl)
        put("git_refs_url", value.gitRefsUrl)
        put("git_tags_url", value.gitTagsUrl)
        put("git_url", value.gitUrl)
        put("has_discussions", json.encodeToJsonElement(value.hasDiscussions))
        put("has_issues", json.encodeToJsonElement(value.hasIssues))
        put("has_pages", json.encodeToJsonElement(value.hasPages))
        put("has_projects", json.encodeToJsonElement(value.hasProjects))
        put("has_wiki", json.encodeToJsonElement(value.hasWiki))
        put("homepage", value.homepage?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("hooks_url", value.hooksUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issue_comment_url", value.issueCommentUrl)
        put("issue_events_url", value.issueEventsUrl)
        put("issues_url", value.issuesUrl)
        put("keys_url", value.keysUrl)
        put("labels_url", value.labelsUrl)
        put("language", value.language?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("languages_url", value.languagesUrl)
        put("license", value.license?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("merges_url", value.mergesUrl)
        put("milestones_url", value.milestonesUrl)
        put("mirror_url", value.mirrorUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("network_count", json.encodeToJsonElement(value.networkCount))
        put("node_id", value.nodeId)
        put("notifications_url", value.notificationsUrl)
        put("open_issues", json.encodeToJsonElement(value.openIssues))
        put("open_issues_count", json.encodeToJsonElement(value.openIssuesCount))
        put("owner", json.encodeToJsonElement(value.owner))
        put("private", json.encodeToJsonElement(value.private))
        put("pulls_url", value.pullsUrl)
        put("pushed_at", value.pushedAt)
        put("releases_url", value.releasesUrl)
        put("size", json.encodeToJsonElement(value.size))
        put("ssh_url", value.sshUrl)
        put("stargazers_count", json.encodeToJsonElement(value.stargazersCount))
        put("stargazers_url", value.stargazersUrl)
        put("statuses_url", value.statusesUrl)
        put("subscribers_count", json.encodeToJsonElement(value.subscribersCount))
        put("subscribers_url", value.subscribersUrl)
        put("subscription_url", value.subscriptionUrl)
        put("svn_url", value.svnUrl)
        put("tags_url", value.tagsUrl)
        put("teams_url", value.teamsUrl)
        put("trees_url", value.treesUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("watchers", json.encodeToJsonElement(value.watchers))
        put("watchers_count", json.encodeToJsonElement(value.watchersCount))
        putState("allow_auto_merge", value.allowAutoMergeState, json::encodeToJsonElement)
        putState("allow_forking", value.allowForkingState, json::encodeToJsonElement)
        putState("allow_merge_commit", value.allowMergeCommitState, json::encodeToJsonElement)
        putState("allow_rebase_merge", value.allowRebaseMergeState, json::encodeToJsonElement)
        putState("allow_squash_merge", value.allowSquashMergeState, json::encodeToJsonElement)
        putState("allow_update_branch", value.allowUpdateBranchState, json::encodeToJsonElement)
        putState("anonymous_access_enabled", value.anonymousAccessEnabledState, json::encodeToJsonElement)
        putState("code_of_conduct", value.codeOfConductState, json::encodeToJsonElement)
        putState("custom_properties", value.customPropertiesState, json::encodeToJsonElement)
        putState("delete_branch_on_merge", value.deleteBranchOnMergeState, json::encodeToJsonElement)
        putState("has_downloads", value.hasDownloadsState, json::encodeToJsonElement)
        putState("has_pull_requests", value.hasPullRequestsState, json::encodeToJsonElement)
        putState("is_template", value.isTemplateState, json::encodeToJsonElement)
        putState("master_branch", value.masterBranchState, json::encodeToJsonElement)
        putState("merge_commit_message", value.mergeCommitMessageState, json::encodeToJsonElement)
        putState("merge_commit_title", value.mergeCommitTitleState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
        putState("parent", value.parentState, json::encodeToJsonElement)
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
        putState("pull_request_creation_policy", value.pullRequestCreationPolicyState, json::encodeToJsonElement)
        putState("security_and_analysis", value.securityAndAnalysisState, json::encodeToJsonElement)
        putState("source", value.sourceState, json::encodeToJsonElement)
        putState("squash_merge_commit_message", value.squashMergeCommitMessageState, json::encodeToJsonElement)
        putState("squash_merge_commit_title", value.squashMergeCommitTitleState, json::encodeToJsonElement)
        putState("temp_clone_token", value.tempCloneTokenState, json::encodeToJsonElement)
        putState("template_repository", value.templateRepositoryState, json::encodeToJsonElement)
        putState("topics", value.topicsState, json::encodeToJsonElement)
        putState("use_squash_pr_title_as_default", value.useSquashPrTitleAsDefaultState, json::encodeToJsonElement)
        putState("visibility", value.visibilityState, json::encodeToJsonElement)
        putState("web_commit_signoff_required", value.webCommitSignoffRequiredState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fullRepository(block: FullRepository.Builder.() -> Unit): FullRepository = FullRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FullRepository is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("FullRepository property '" + name + "' is not nullable")
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

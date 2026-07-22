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
 * A git repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-removed-from-repository/properties/repository
 */
@Serializable(with = InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587.Serializer::class)
public class InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 internal constructor(
  public val archiveUrl: String,
  /**
   * Whether the repository is archived.
   */
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
  public val contributorsUrl: String,
  public val createdAt: InlineWebhookTeamRemovedFromRepositoryRepositoryCreatedAtXea63da4d,
  /**
   * The default branch of the repository.
   */
  public val defaultBranch: String,
  public val deploymentsUrl: String,
  public val description: String?,
  public val downloadsUrl: String,
  public val eventsUrl: String,
  public val fork: Boolean,
  public val forks: Int,
  public val forksCount: Int,
  public val forksUrl: String,
  public val fullName: String,
  public val gitCommitsUrl: String,
  public val gitRefsUrl: String,
  public val gitTagsUrl: String,
  public val gitUrl: String,
  /**
   * Whether downloads are enabled.
   */
  public val hasDownloads: Boolean,
  /**
   * Whether issues are enabled.
   */
  public val hasIssues: Boolean,
  public val hasPages: Boolean,
  /**
   * Whether projects are enabled.
   */
  public val hasProjects: Boolean,
  /**
   * Whether the wiki is enabled.
   */
  public val hasWiki: Boolean,
  public val homepage: String?,
  public val hooksUrl: String,
  public val htmlUrl: String,
  /**
   * Unique identifier of the repository
   */
  public val id: Long,
  public val issueCommentUrl: String,
  public val issueEventsUrl: String,
  public val issuesUrl: String,
  public val keysUrl: String,
  public val labelsUrl: String,
  public val language: String?,
  public val languagesUrl: String,
  public val license: InlineWebhookTeamRemovedFromRepositoryRepositoryLicenseX0428f242?,
  public val mergesUrl: String,
  public val milestonesUrl: String,
  public val mirrorUrl: String?,
  /**
   * The name of the repository.
   */
  public val name: String,
  public val nodeId: String,
  public val notificationsUrl: String,
  public val openIssues: Int,
  public val openIssuesCount: Int,
  public val owner: InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerX27355215?,
  /**
   * Whether the repository is private or public.
   */
  public val `private`: Boolean,
  public val pullsUrl: String,
  public val pushedAt: InlineWebhookTeamRemovedFromRepositoryRepositoryPushedAtX90503963?,
  public val releasesUrl: String,
  public val size: Int,
  public val sshUrl: String,
  public val stargazersCount: Int,
  public val stargazersUrl: String,
  public val statusesUrl: String,
  public val subscribersUrl: String,
  public val subscriptionUrl: String,
  public val svnUrl: String,
  public val tagsUrl: String,
  public val teamsUrl: String,
  topics: List<String>,
  public val treesUrl: String,
  public val updatedAt: String,
  public val url: String,
  public val visibility: InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4,
  public val watchers: Int,
  public val watchersCount: Int,
  private val allowAutoMergeState: FieldState<Boolean>,
  private val allowForkingState: FieldState<Boolean>,
  private val allowMergeCommitState: FieldState<Boolean>,
  private val allowRebaseMergeState: FieldState<Boolean>,
  private val allowSquashMergeState: FieldState<Boolean>,
  private val allowUpdateBranchState: FieldState<Boolean>,
  private val customPropertiesState: FieldState<JsonObject>,
  private val deleteBranchOnMergeState: FieldState<Boolean>,
  private val disabledState: FieldState<Boolean>,
  private val isTemplateState: FieldState<Boolean>,
  private val masterBranchState: FieldState<String>,
  private val organizationState: FieldState<String>,
  private val permissionsState:
      FieldState<InlineWebhookTeamRemovedFromRepositoryRepositoryPermissionsX6a62ba08>,
  private val publicState: FieldState<Boolean>,
  private val roleNameState: FieldState<String?>,
  private val stargazersState: FieldState<Int>,
) {
  public val topics: List<String> = topics.toList()

  /**
   * Whether to allow auto-merge for pull requests.
   */
  public val allowAutoMerge: Boolean?
    get() = allowAutoMergeState.valueOrNull()

  /**
   * Whether to allow private forks
   */
  public val allowForking: Boolean?
    get() = allowForkingState.valueOrNull()

  /**
   * Whether to allow merge commits for pull requests.
   */
  public val allowMergeCommit: Boolean?
    get() = allowMergeCommitState.valueOrNull()

  /**
   * Whether to allow rebase merges for pull requests.
   */
  public val allowRebaseMerge: Boolean?
    get() = allowRebaseMergeState.valueOrNull()

  /**
   * Whether to allow squash merges for pull requests.
   */
  public val allowSquashMerge: Boolean?
    get() = allowSquashMergeState.valueOrNull()

  public val allowUpdateBranch: Boolean?
    get() = allowUpdateBranchState.valueOrNull()

  /**
   * The custom properties that were defined for the repository. The keys are the custom property names, and the values
   * are the corresponding custom property values.
   */
  public val customProperties: JsonObject?
    get() = customPropertiesState.valueOrNull()

  /**
   * Whether to delete head branches when pull requests are merged
   */
  public val deleteBranchOnMerge: Boolean?
    get() = deleteBranchOnMergeState.valueOrNull()

  /**
   * Returns whether or not this repository is disabled.
   */
  public val disabled: Boolean?
    get() = disabledState.valueOrNull()

  public val isTemplate: Boolean?
    get() = isTemplateState.valueOrNull()

  public val masterBranch: String?
    get() = masterBranchState.valueOrNull()

  public val organization: String?
    get() = organizationState.valueOrNull()

  public val permissions: InlineWebhookTeamRemovedFromRepositoryRepositoryPermissionsX6a62ba08?
    get() = permissionsState.valueOrNull()

  public val `public`: Boolean?
    get() = publicState.valueOrNull()

  public val roleName: String?
    get() = roleNameState.valueOrNull()

  public val stargazers: Int?
    get() = stargazersState.valueOrNull()

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
    createdAt: InlineWebhookTeamRemovedFromRepositoryRepositoryCreatedAtXea63da4d,
    defaultBranch: String,
    deploymentsUrl: String,
    description: String?,
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
    hasDownloads: Boolean,
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
    license: InlineWebhookTeamRemovedFromRepositoryRepositoryLicenseX0428f242?,
    mergesUrl: String,
    milestonesUrl: String,
    mirrorUrl: String?,
    name: String,
    nodeId: String,
    notificationsUrl: String,
    openIssues: Int,
    openIssuesCount: Int,
    owner: InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerX27355215?,
    `private`: Boolean,
    pullsUrl: String,
    pushedAt: InlineWebhookTeamRemovedFromRepositoryRepositoryPushedAtX90503963?,
    releasesUrl: String,
    size: Int,
    sshUrl: String,
    stargazersCount: Int,
    stargazersUrl: String,
    statusesUrl: String,
    subscribersUrl: String,
    subscriptionUrl: String,
    svnUrl: String,
    tagsUrl: String,
    teamsUrl: String,
    topics: List<String>,
    treesUrl: String,
    updatedAt: String,
    url: String,
    visibility: InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4,
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
  hasDownloads = hasDownloads,
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
  subscribersUrl = subscribersUrl,
  subscriptionUrl = subscriptionUrl,
  svnUrl = svnUrl,
  tagsUrl = tagsUrl,
  teamsUrl = teamsUrl,
  topics = topics,
  treesUrl = treesUrl,
  updatedAt = updatedAt,
  url = url,
  visibility = visibility,
  watchers = watchers,
  watchersCount = watchersCount,
  allowAutoMergeState = FieldState.Absent,
  allowForkingState = FieldState.Absent,
  allowMergeCommitState = FieldState.Absent,
  allowRebaseMergeState = FieldState.Absent,
  allowSquashMergeState = FieldState.Absent,
  allowUpdateBranchState = FieldState.Absent,
  customPropertiesState = FieldState.Absent,
  deleteBranchOnMergeState = FieldState.Absent,
  disabledState = FieldState.Absent,
  isTemplateState = FieldState.Absent,
  masterBranchState = FieldState.Absent,
  organizationState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  publicState = FieldState.Absent,
  roleNameState = FieldState.Absent,
  stargazersState = FieldState.Absent,
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
   * Returns the wire presence of `custom_properties`.
   */
  public fun customPropertiesPresence(): FieldPresence = customPropertiesState.presence

  /**
   * Returns the wire presence of `delete_branch_on_merge`.
   */
  public fun deleteBranchOnMergePresence(): FieldPresence = deleteBranchOnMergeState.presence

  /**
   * Returns the wire presence of `disabled`.
   */
  public fun disabledPresence(): FieldPresence = disabledState.presence

  /**
   * Returns the wire presence of `is_template`.
   */
  public fun isTemplatePresence(): FieldPresence = isTemplateState.presence

  /**
   * Returns the wire presence of `master_branch`.
   */
  public fun masterBranchPresence(): FieldPresence = masterBranchState.presence

  /**
   * Returns the wire presence of `organization`.
   */
  public fun organizationPresence(): FieldPresence = organizationState.presence

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  /**
   * Returns the wire presence of `public`.
   */
  public fun publicPresence(): FieldPresence = publicState.presence

  /**
   * Returns the wire presence of `role_name`.
   */
  public fun roleNamePresence(): FieldPresence = roleNameState.presence

  /**
   * Returns the wire presence of `stargazers`.
   */
  public fun stargazersPresence(): FieldPresence = stargazersState.presence

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

    private var createdAtValue: InlineWebhookTeamRemovedFromRepositoryRepositoryCreatedAtXea63da4d?
        = null

    public var createdAt: InlineWebhookTeamRemovedFromRepositoryRepositoryCreatedAtXea63da4d
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

    private var hasDownloadsValue: Boolean? = null

    public var hasDownloads: Boolean
      get() = requireNotNull(hasDownloadsValue) { "hasDownloads is required" }
      set(`value`) {
        hasDownloadsValue = value
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

    private var topicsValue: List<String>? = null

    public var topics: List<String>
      get() = requireNotNull(topicsValue) { "topics is required" }
      set(`value`) {
        topicsValue = value
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

    private var visibilityValue:
        InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4? = null

    public var visibility: InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
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

    private var licenseState:
        FieldState<InlineWebhookTeamRemovedFromRepositoryRepositoryLicenseX0428f242?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var license: InlineWebhookTeamRemovedFromRepositoryRepositoryLicenseX0428f242?
      get() = licenseState.valueOrNull()
      set(`value`) {
        licenseState = value.toNullableFieldState()
      }

    private var mirrorUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var mirrorUrl: String?
      get() = mirrorUrlState.valueOrNull()
      set(`value`) {
        mirrorUrlState = value.toNullableFieldState()
      }

    private var ownerState:
        FieldState<InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerX27355215?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var owner: InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerX27355215?
      get() = ownerState.valueOrNull()
      set(`value`) {
        ownerState = value.toNullableFieldState()
      }

    private var pushedAtState:
        FieldState<InlineWebhookTeamRemovedFromRepositoryRepositoryPushedAtX90503963?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pushedAt: InlineWebhookTeamRemovedFromRepositoryRepositoryPushedAtX90503963?
      get() = pushedAtState.valueOrNull()
      set(`value`) {
        pushedAtState = value.toNullableFieldState()
      }

    private var allowAutoMergeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to allow auto-merge for pull requests.
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
     * Whether to allow private forks
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
     * Whether to allow merge commits for pull requests.
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
     * Whether to allow rebase merges for pull requests.
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
     * Whether to allow squash merges for pull requests.
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
     * Whether to delete head branches when pull requests are merged
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var deleteBranchOnMerge: Boolean?
      get() = deleteBranchOnMergeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "deleteBranchOnMerge is not nullable; call unsetDeleteBranchOnMerge() to omit it" }
        deleteBranchOnMergeState = FieldState.Value(present)
      }

    private var disabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Returns whether or not this repository is disabled.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var disabled: Boolean?
      get() = disabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "disabled is not nullable; call unsetDisabled() to omit it" }
        disabledState = FieldState.Value(present)
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

    private var organizationState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organization: String?
      get() = organizationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organization is not nullable; call unsetOrganization() to omit it" }
        organizationState = FieldState.Value(present)
      }

    private var permissionsState:
        FieldState<InlineWebhookTeamRemovedFromRepositoryRepositoryPermissionsX6a62ba08> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineWebhookTeamRemovedFromRepositoryRepositoryPermissionsX6a62ba08?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    private var publicState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var `public`: Boolean?
      get() = publicState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "public is not nullable; call unsetPublic() to omit it" }
        publicState = FieldState.Value(present)
      }

    private var roleNameState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var roleName: String?
      get() = roleNameState.valueOrNull()
      set(`value`) {
        roleNameState = value.toNullableFieldState()
      }

    private var stargazersState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var stargazers: Int?
      get() = stargazersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "stargazers is not nullable; call unsetStargazers() to omit it" }
        stargazersState = FieldState.Value(present)
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
     * Omits `disabled` from serialized output.
     */
    public fun unsetDisabled() {
      disabledState = FieldState.Absent
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
     * Omits `organization` from serialized output.
     */
    public fun unsetOrganization() {
      organizationState = FieldState.Absent
    }

    /**
     * Omits `permissions` from serialized output.
     */
    public fun unsetPermissions() {
      permissionsState = FieldState.Absent
    }

    /**
     * Omits `public` from serialized output.
     */
    public fun unsetPublic() {
      publicState = FieldState.Absent
    }

    /**
     * Omits `role_name` from serialized output.
     */
    public fun unsetRoleName() {
      roleNameState = FieldState.Absent
    }

    /**
     * Omits `stargazers` from serialized output.
     */
    public fun unsetStargazers() {
      stargazersState = FieldState.Absent
    }

    public fun build(): InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 {
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
      check(hasDownloadsValue != null) { "hasDownloads is required" }
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
      check(nodeIdValue != null) { "nodeId is required" }
      check(notificationsUrlValue != null) { "notificationsUrl is required" }
      check(openIssuesValue != null) { "openIssues is required" }
      check(openIssuesCountValue != null) { "openIssuesCount is required" }
      check(privateValue != null) { "private is required" }
      check(pullsUrlValue != null) { "pullsUrl is required" }
      check(releasesUrlValue != null) { "releasesUrl is required" }
      check(sizeValue != null) { "size is required" }
      check(sshUrlValue != null) { "sshUrl is required" }
      check(stargazersCountValue != null) { "stargazersCount is required" }
      check(stargazersUrlValue != null) { "stargazersUrl is required" }
      check(statusesUrlValue != null) { "statusesUrl is required" }
      check(subscribersUrlValue != null) { "subscribersUrl is required" }
      check(subscriptionUrlValue != null) { "subscriptionUrl is required" }
      check(svnUrlValue != null) { "svnUrl is required" }
      check(tagsUrlValue != null) { "tagsUrl is required" }
      check(teamsUrlValue != null) { "teamsUrl is required" }
      check(topicsValue != null) { "topics is required" }
      check(treesUrlValue != null) { "treesUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(visibilityValue != null) { "visibility is required" }
      check(watchersValue != null) { "watchers is required" }
      check(watchersCountValue != null) { "watchersCount is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(homepageState !== FieldState.Absent) { "homepage is required, even when null" }
      check(languageState !== FieldState.Absent) { "language is required, even when null" }
      check(licenseState !== FieldState.Absent) { "license is required, even when null" }
      check(mirrorUrlState !== FieldState.Absent) { "mirrorUrl is required, even when null" }
      check(ownerState !== FieldState.Absent) { "owner is required, even when null" }
      check(pushedAtState !== FieldState.Absent) { "pushedAt is required, even when null" }
      return InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587(
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
        hasDownloads = hasDownloads,
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
        nodeId = nodeId,
        notificationsUrl = notificationsUrl,
        openIssues = openIssues,
        openIssuesCount = openIssuesCount,
        owner = ownerState.valueOrNull(),
        private = private,
        pullsUrl = pullsUrl,
        pushedAt = pushedAtState.valueOrNull(),
        releasesUrl = releasesUrl,
        size = size,
        sshUrl = sshUrl,
        stargazersCount = stargazersCount,
        stargazersUrl = stargazersUrl,
        statusesUrl = statusesUrl,
        subscribersUrl = subscribersUrl,
        subscriptionUrl = subscriptionUrl,
        svnUrl = svnUrl,
        tagsUrl = tagsUrl,
        teamsUrl = teamsUrl,
        topics = topics,
        treesUrl = treesUrl,
        updatedAt = updatedAt,
        url = url,
        visibility = visibility,
        watchers = watchers,
        watchersCount = watchersCount,
        allowAutoMergeState = allowAutoMergeState,
        allowForkingState = allowForkingState,
        allowMergeCommitState = allowMergeCommitState,
        allowRebaseMergeState = allowRebaseMergeState,
        allowSquashMergeState = allowSquashMergeState,
        allowUpdateBranchState = allowUpdateBranchState,
        customPropertiesState = customPropertiesState,
        deleteBranchOnMergeState = deleteBranchOnMergeState,
        disabledState = disabledState,
        isTemplateState = isTemplateState,
        masterBranchState = masterBranchState,
        organizationState = organizationState,
        permissionsState = permissionsState,
        publicState = publicState,
        roleNameState = roleNameState,
        stargazersState = stargazersState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 must be a JSON object")
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
      val createdAt = json.decodeRequired<InlineWebhookTeamRemovedFromRepositoryRepositoryCreatedAtXea63da4d>(rawObject, "created_at")
      val defaultBranch = json.decodeRequired<String>(rawObject, "default_branch")
      val deploymentsUrl = json.decodeRequired<String>(rawObject, "deployments_url")
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
      val hasDownloads = json.decodeRequired<Boolean>(rawObject, "has_downloads")
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
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val notificationsUrl = json.decodeRequired<String>(rawObject, "notifications_url")
      val openIssues = json.decodeRequired<Int>(rawObject, "open_issues")
      val openIssuesCount = json.decodeRequired<Int>(rawObject, "open_issues_count")
      val private = json.decodeRequired<Boolean>(rawObject, "private")
      val pullsUrl = json.decodeRequired<String>(rawObject, "pulls_url")
      val releasesUrl = json.decodeRequired<String>(rawObject, "releases_url")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val sshUrl = json.decodeRequired<String>(rawObject, "ssh_url")
      val stargazersCount = json.decodeRequired<Int>(rawObject, "stargazers_count")
      val stargazersUrl = json.decodeRequired<String>(rawObject, "stargazers_url")
      val statusesUrl = json.decodeRequired<String>(rawObject, "statuses_url")
      val subscribersUrl = json.decodeRequired<String>(rawObject, "subscribers_url")
      val subscriptionUrl = json.decodeRequired<String>(rawObject, "subscription_url")
      val svnUrl = json.decodeRequired<String>(rawObject, "svn_url")
      val tagsUrl = json.decodeRequired<String>(rawObject, "tags_url")
      val teamsUrl = json.decodeRequired<String>(rawObject, "teams_url")
      val topics = json.decodeRequired<List<String>>(rawObject, "topics")
      val treesUrl = json.decodeRequired<String>(rawObject, "trees_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val visibility = json.decodeRequired<InlineWebhookTeamRemovedFromRepositoryRepositoryVisibilityX5e30c2a4>(rawObject, "visibility")
      val watchers = json.decodeRequired<Int>(rawObject, "watchers")
      val watchersCount = json.decodeRequired<Int>(rawObject, "watchers_count")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("homepage")) {
        throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property 'homepage'")
      }
      val homepage = rawObject["homepage"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("language")) {
        throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property 'language'")
      }
      val language = rawObject["language"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("license")) {
        throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property 'license'")
      }
      val license = rawObject["license"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookTeamRemovedFromRepositoryRepositoryLicenseX0428f242?>(requireNotNull(element)) }
      if (!rawObject.containsKey("mirror_url")) {
        throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property 'mirror_url'")
      }
      val mirrorUrl = rawObject["mirror_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("owner")) {
        throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property 'owner'")
      }
      val owner = rawObject["owner"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookTeamRemovedFromRepositoryRepositoryOwnerX27355215?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pushed_at")) {
        throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property 'pushed_at'")
      }
      val pushedAt = rawObject["pushed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookTeamRemovedFromRepositoryRepositoryPushedAtX90503963?>(requireNotNull(element)) }
      return InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587(
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
        hasDownloads = hasDownloads,
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
        subscribersUrl = subscribersUrl,
        subscriptionUrl = subscriptionUrl,
        svnUrl = svnUrl,
        tagsUrl = tagsUrl,
        teamsUrl = teamsUrl,
        topics = topics,
        treesUrl = treesUrl,
        updatedAt = updatedAt,
        url = url,
        visibility = visibility,
        watchers = watchers,
        watchersCount = watchersCount,
        allowAutoMergeState = json.decodeOptional(rawObject, "allow_auto_merge", nullable = false),
        allowForkingState = json.decodeOptional(rawObject, "allow_forking", nullable = false),
        allowMergeCommitState = json.decodeOptional(rawObject, "allow_merge_commit", nullable = false),
        allowRebaseMergeState = json.decodeOptional(rawObject, "allow_rebase_merge", nullable = false),
        allowSquashMergeState = json.decodeOptional(rawObject, "allow_squash_merge", nullable = false),
        allowUpdateBranchState = json.decodeOptional(rawObject, "allow_update_branch", nullable = false),
        customPropertiesState = json.decodeOptional(rawObject, "custom_properties", nullable = false),
        deleteBranchOnMergeState = json.decodeOptional(rawObject, "delete_branch_on_merge", nullable = false),
        disabledState = json.decodeOptional(rawObject, "disabled", nullable = false),
        isTemplateState = json.decodeOptional(rawObject, "is_template", nullable = false),
        masterBranchState = json.decodeOptional(rawObject, "master_branch", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
        publicState = json.decodeOptional(rawObject, "public", nullable = false),
        roleNameState = json.decodeOptional(rawObject, "role_name", nullable = true),
        stargazersState = json.decodeOptional(rawObject, "stargazers", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587")
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
        put("created_at", json.encodeToJsonElement(value.createdAt))
        put("default_branch", value.defaultBranch)
        put("deployments_url", value.deploymentsUrl)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
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
        put("has_downloads", json.encodeToJsonElement(value.hasDownloads))
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
        put("node_id", value.nodeId)
        put("notifications_url", value.notificationsUrl)
        put("open_issues", json.encodeToJsonElement(value.openIssues))
        put("open_issues_count", json.encodeToJsonElement(value.openIssuesCount))
        put("owner", value.owner?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("private", json.encodeToJsonElement(value.private))
        put("pulls_url", value.pullsUrl)
        put("pushed_at", value.pushedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("releases_url", value.releasesUrl)
        put("size", json.encodeToJsonElement(value.size))
        put("ssh_url", value.sshUrl)
        put("stargazers_count", json.encodeToJsonElement(value.stargazersCount))
        put("stargazers_url", value.stargazersUrl)
        put("statuses_url", value.statusesUrl)
        put("subscribers_url", value.subscribersUrl)
        put("subscription_url", value.subscriptionUrl)
        put("svn_url", value.svnUrl)
        put("tags_url", value.tagsUrl)
        put("teams_url", value.teamsUrl)
        put("topics", json.encodeToJsonElement(value.topics))
        put("trees_url", value.treesUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("visibility", json.encodeToJsonElement(value.visibility))
        put("watchers", json.encodeToJsonElement(value.watchers))
        put("watchers_count", json.encodeToJsonElement(value.watchersCount))
        putState("allow_auto_merge", value.allowAutoMergeState, json::encodeToJsonElement)
        putState("allow_forking", value.allowForkingState, json::encodeToJsonElement)
        putState("allow_merge_commit", value.allowMergeCommitState, json::encodeToJsonElement)
        putState("allow_rebase_merge", value.allowRebaseMergeState, json::encodeToJsonElement)
        putState("allow_squash_merge", value.allowSquashMergeState, json::encodeToJsonElement)
        putState("allow_update_branch", value.allowUpdateBranchState, json::encodeToJsonElement)
        putState("custom_properties", value.customPropertiesState, json::encodeToJsonElement)
        putState("delete_branch_on_merge", value.deleteBranchOnMergeState, json::encodeToJsonElement)
        putState("disabled", value.disabledState, json::encodeToJsonElement)
        putState("is_template", value.isTemplateState, json::encodeToJsonElement)
        putState("master_branch", value.masterBranchState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
        putState("public", value.publicState, json::encodeToJsonElement)
        putState("role_name", value.roleNameState, json::encodeToJsonElement)
        putState("stargazers", value.stargazersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587(block: InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587.Builder.() -> Unit): InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 = InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookTeamRemovedFromRepositoryRepositoryX1d656587 property '" + name + "' is not nullable")
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

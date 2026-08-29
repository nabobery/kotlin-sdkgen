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
 * Minimal Repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/minimal-repository
 */
@Serializable(with = MinimalRepository.Serializer::class)
public class MinimalRepository internal constructor(
  public val archiveUrl: String,
  public val assigneesUrl: String,
  public val blobsUrl: String,
  public val branchesUrl: String,
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
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val deploymentsUrl: String,
  public val description: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val downloadsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val eventsUrl: String,
  public val fork: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val forksUrl: String,
  public val fullName: String,
  public val gitCommitsUrl: String,
  public val gitRefsUrl: String,
  public val gitTagsUrl: String,
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
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val languagesUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val mergesUrl: String,
  public val milestonesUrl: String,
  public val name: String,
  public val nodeId: String,
  public val notificationsUrl: String,
  public val owner: SimpleUser,
  public val `private`: Boolean,
  public val pullsUrl: String,
  public val releasesUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val stargazersUrl: String,
  public val statusesUrl: String,
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
  public val tagsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val teamsUrl: String,
  public val treesUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val allowForkingState: FieldState<Boolean>,
  private val archivedState: FieldState<Boolean>,
  private val cloneUrlState: FieldState<String>,
  private val codeOfConductState: FieldState<CodeOfConduct>,
  private val createdAtState: FieldState<String?>,
  private val customPropertiesState: FieldState<JsonObject>,
  private val defaultBranchState: FieldState<String>,
  private val deleteBranchOnMergeState: FieldState<Boolean>,
  private val disabledState: FieldState<Boolean>,
  private val forksState: FieldState<Int>,
  private val forksCountState: FieldState<Int>,
  private val gitUrlState: FieldState<String>,
  private val hasDiscussionsState: FieldState<Boolean>,
  private val hasDownloadsState: FieldState<Boolean>,
  private val hasIssuesState: FieldState<Boolean>,
  private val hasPagesState: FieldState<Boolean>,
  private val hasProjectsState: FieldState<Boolean>,
  private val hasPullRequestsState: FieldState<Boolean>,
  private val hasWikiState: FieldState<Boolean>,
  private val homepageState: FieldState<String?>,
  private val isTemplateState: FieldState<Boolean>,
  private val languageState: FieldState<String?>,
  private val licenseState: FieldState<InlineMinimalRepositoryLicenseX5778c2e1?>,
  private val mirrorUrlState: FieldState<String?>,
  private val networkCountState: FieldState<Int>,
  private val openIssuesState: FieldState<Int>,
  private val openIssuesCountState: FieldState<Int>,
  private val permissionsState: FieldState<InlineMinimalRepositoryPermissionsX331017ed>,
  private val pullRequestCreationPolicyState:
      FieldState<InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3>,
  private val pushedAtState: FieldState<String?>,
  private val roleNameState: FieldState<String>,
  private val securityAndAnalysisState: FieldState<SecurityAndAnalysis?>,
  private val sizeState: FieldState<Int>,
  private val sshUrlState: FieldState<String>,
  private val stargazersCountState: FieldState<Int>,
  private val subscribersCountState: FieldState<Int>,
  private val svnUrlState: FieldState<String>,
  private val tempCloneTokenState: FieldState<String>,
  topicsState: FieldState<List<String>>,
  private val updatedAtState: FieldState<String?>,
  private val visibilityState: FieldState<String>,
  private val watchersState: FieldState<Int>,
  private val watchersCountState: FieldState<Int>,
  private val webCommitSignoffRequiredState: FieldState<Boolean>,
) {
  private val topicsState: FieldState<List<String>> =
      topicsState.copyValue { fieldValue -> fieldValue.toList() }

  public val allowForking: Boolean?
    get() = allowForkingState.valueOrNull()

  public val archived: Boolean?
    get() = archivedState.valueOrNull()

  public val cloneUrl: String?
    get() = cloneUrlState.valueOrNull()

  public val codeOfConduct: CodeOfConduct?
    get() = codeOfConductState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?
    get() = createdAtState.valueOrNull()

  /**
   * The custom properties that were defined for the repository. The keys are the custom property names, and the values
   * are the corresponding custom property values.
   */
  public val customProperties: JsonObject?
    get() = customPropertiesState.valueOrNull()

  public val defaultBranch: String?
    get() = defaultBranchState.valueOrNull()

  public val deleteBranchOnMerge: Boolean?
    get() = deleteBranchOnMergeState.valueOrNull()

  public val disabled: Boolean?
    get() = disabledState.valueOrNull()

  public val forks: Int?
    get() = forksState.valueOrNull()

  public val forksCount: Int?
    get() = forksCountState.valueOrNull()

  public val gitUrl: String?
    get() = gitUrlState.valueOrNull()

  public val hasDiscussions: Boolean?
    get() = hasDiscussionsState.valueOrNull()

  public val hasDownloads: Boolean?
    get() = hasDownloadsState.valueOrNull()

  public val hasIssues: Boolean?
    get() = hasIssuesState.valueOrNull()

  public val hasPages: Boolean?
    get() = hasPagesState.valueOrNull()

  public val hasProjects: Boolean?
    get() = hasProjectsState.valueOrNull()

  public val hasPullRequests: Boolean?
    get() = hasPullRequestsState.valueOrNull()

  public val hasWiki: Boolean?
    get() = hasWikiState.valueOrNull()

  public val homepage: String?
    get() = homepageState.valueOrNull()

  public val isTemplate: Boolean?
    get() = isTemplateState.valueOrNull()

  public val language: String?
    get() = languageState.valueOrNull()

  public val license: InlineMinimalRepositoryLicenseX5778c2e1?
    get() = licenseState.valueOrNull()

  public val mirrorUrl: String?
    get() = mirrorUrlState.valueOrNull()

  public val networkCount: Int?
    get() = networkCountState.valueOrNull()

  public val openIssues: Int?
    get() = openIssuesState.valueOrNull()

  public val openIssuesCount: Int?
    get() = openIssuesCountState.valueOrNull()

  public val permissions: InlineMinimalRepositoryPermissionsX331017ed?
    get() = permissionsState.valueOrNull()

  /**
   * The policy controlling who can create pull requests: all or collaborators_only.
   */
  public val pullRequestCreationPolicy: InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3?
    get() = pullRequestCreationPolicyState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pushedAt: String?
    get() = pushedAtState.valueOrNull()

  public val roleName: String?
    get() = roleNameState.valueOrNull()

  public val securityAndAnalysis: SecurityAndAnalysis?
    get() = securityAndAnalysisState.valueOrNull()

  /**
   * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the
   * size is 0.
   */
  public val size: Int?
    get() = sizeState.valueOrNull()

  public val sshUrl: String?
    get() = sshUrlState.valueOrNull()

  public val stargazersCount: Int?
    get() = stargazersCountState.valueOrNull()

  public val subscribersCount: Int?
    get() = subscribersCountState.valueOrNull()

  public val svnUrl: String?
    get() = svnUrlState.valueOrNull()

  public val tempCloneToken: String?
    get() = tempCloneTokenState.valueOrNull()

  public val topics: List<String>?
    get() = topicsState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public val visibility: String?
    get() = visibilityState.valueOrNull()

  public val watchers: Int?
    get() = watchersState.valueOrNull()

  public val watchersCount: Int?
    get() = watchersCountState.valueOrNull()

  public val webCommitSignoffRequired: Boolean?
    get() = webCommitSignoffRequiredState.valueOrNull()

  public constructor(
    archiveUrl: String,
    assigneesUrl: String,
    blobsUrl: String,
    branchesUrl: String,
    collaboratorsUrl: String,
    commentsUrl: String,
    commitsUrl: String,
    compareUrl: String,
    contentsUrl: String,
    contributorsUrl: String,
    deploymentsUrl: String,
    description: String?,
    downloadsUrl: String,
    eventsUrl: String,
    fork: Boolean,
    forksUrl: String,
    fullName: String,
    gitCommitsUrl: String,
    gitRefsUrl: String,
    gitTagsUrl: String,
    hooksUrl: String,
    htmlUrl: String,
    id: Long,
    issueCommentUrl: String,
    issueEventsUrl: String,
    issuesUrl: String,
    keysUrl: String,
    labelsUrl: String,
    languagesUrl: String,
    mergesUrl: String,
    milestonesUrl: String,
    name: String,
    nodeId: String,
    notificationsUrl: String,
    owner: SimpleUser,
    `private`: Boolean,
    pullsUrl: String,
    releasesUrl: String,
    stargazersUrl: String,
    statusesUrl: String,
    subscribersUrl: String,
    subscriptionUrl: String,
    tagsUrl: String,
    teamsUrl: String,
    treesUrl: String,
    url: String,
  ) : this(archiveUrl = archiveUrl,
  assigneesUrl = assigneesUrl,
  blobsUrl = blobsUrl,
  branchesUrl = branchesUrl,
  collaboratorsUrl = collaboratorsUrl,
  commentsUrl = commentsUrl,
  commitsUrl = commitsUrl,
  compareUrl = compareUrl,
  contentsUrl = contentsUrl,
  contributorsUrl = contributorsUrl,
  deploymentsUrl = deploymentsUrl,
  description = description,
  downloadsUrl = downloadsUrl,
  eventsUrl = eventsUrl,
  fork = fork,
  forksUrl = forksUrl,
  fullName = fullName,
  gitCommitsUrl = gitCommitsUrl,
  gitRefsUrl = gitRefsUrl,
  gitTagsUrl = gitTagsUrl,
  hooksUrl = hooksUrl,
  htmlUrl = htmlUrl,
  id = id,
  issueCommentUrl = issueCommentUrl,
  issueEventsUrl = issueEventsUrl,
  issuesUrl = issuesUrl,
  keysUrl = keysUrl,
  labelsUrl = labelsUrl,
  languagesUrl = languagesUrl,
  mergesUrl = mergesUrl,
  milestonesUrl = milestonesUrl,
  name = name,
  nodeId = nodeId,
  notificationsUrl = notificationsUrl,
  owner = owner,
  private = private,
  pullsUrl = pullsUrl,
  releasesUrl = releasesUrl,
  stargazersUrl = stargazersUrl,
  statusesUrl = statusesUrl,
  subscribersUrl = subscribersUrl,
  subscriptionUrl = subscriptionUrl,
  tagsUrl = tagsUrl,
  teamsUrl = teamsUrl,
  treesUrl = treesUrl,
  url = url,
  allowForkingState = FieldState.Absent,
  archivedState = FieldState.Absent,
  cloneUrlState = FieldState.Absent,
  codeOfConductState = FieldState.Absent,
  createdAtState = FieldState.Absent,
  customPropertiesState = FieldState.Absent,
  defaultBranchState = FieldState.Absent,
  deleteBranchOnMergeState = FieldState.Absent,
  disabledState = FieldState.Absent,
  forksState = FieldState.Absent,
  forksCountState = FieldState.Absent,
  gitUrlState = FieldState.Absent,
  hasDiscussionsState = FieldState.Absent,
  hasDownloadsState = FieldState.Absent,
  hasIssuesState = FieldState.Absent,
  hasPagesState = FieldState.Absent,
  hasProjectsState = FieldState.Absent,
  hasPullRequestsState = FieldState.Absent,
  hasWikiState = FieldState.Absent,
  homepageState = FieldState.Absent,
  isTemplateState = FieldState.Absent,
  languageState = FieldState.Absent,
  licenseState = FieldState.Absent,
  mirrorUrlState = FieldState.Absent,
  networkCountState = FieldState.Absent,
  openIssuesState = FieldState.Absent,
  openIssuesCountState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  pullRequestCreationPolicyState = FieldState.Absent,
  pushedAtState = FieldState.Absent,
  roleNameState = FieldState.Absent,
  securityAndAnalysisState = FieldState.Absent,
  sizeState = FieldState.Absent,
  sshUrlState = FieldState.Absent,
  stargazersCountState = FieldState.Absent,
  subscribersCountState = FieldState.Absent,
  svnUrlState = FieldState.Absent,
  tempCloneTokenState = FieldState.Absent,
  topicsState = FieldState.Absent,
  updatedAtState = FieldState.Absent,
  visibilityState = FieldState.Absent,
  watchersState = FieldState.Absent,
  watchersCountState = FieldState.Absent,
  webCommitSignoffRequiredState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allow_forking`.
   */
  public fun allowForkingPresence(): FieldPresence = allowForkingState.presence

  /**
   * Returns the wire presence of `archived`.
   */
  public fun archivedPresence(): FieldPresence = archivedState.presence

  /**
   * Returns the wire presence of `clone_url`.
   */
  public fun cloneUrlPresence(): FieldPresence = cloneUrlState.presence

  /**
   * Returns the wire presence of `code_of_conduct`.
   */
  public fun codeOfConductPresence(): FieldPresence = codeOfConductState.presence

  /**
   * Returns the wire presence of `created_at`.
   */
  public fun createdAtPresence(): FieldPresence = createdAtState.presence

  /**
   * Returns the wire presence of `custom_properties`.
   */
  public fun customPropertiesPresence(): FieldPresence = customPropertiesState.presence

  /**
   * Returns the wire presence of `default_branch`.
   */
  public fun defaultBranchPresence(): FieldPresence = defaultBranchState.presence

  /**
   * Returns the wire presence of `delete_branch_on_merge`.
   */
  public fun deleteBranchOnMergePresence(): FieldPresence = deleteBranchOnMergeState.presence

  /**
   * Returns the wire presence of `disabled`.
   */
  public fun disabledPresence(): FieldPresence = disabledState.presence

  /**
   * Returns the wire presence of `forks`.
   */
  public fun forksPresence(): FieldPresence = forksState.presence

  /**
   * Returns the wire presence of `forks_count`.
   */
  public fun forksCountPresence(): FieldPresence = forksCountState.presence

  /**
   * Returns the wire presence of `git_url`.
   */
  public fun gitUrlPresence(): FieldPresence = gitUrlState.presence

  /**
   * Returns the wire presence of `has_discussions`.
   */
  public fun hasDiscussionsPresence(): FieldPresence = hasDiscussionsState.presence

  /**
   * Returns the wire presence of `has_downloads`.
   */
  public fun hasDownloadsPresence(): FieldPresence = hasDownloadsState.presence

  /**
   * Returns the wire presence of `has_issues`.
   */
  public fun hasIssuesPresence(): FieldPresence = hasIssuesState.presence

  /**
   * Returns the wire presence of `has_pages`.
   */
  public fun hasPagesPresence(): FieldPresence = hasPagesState.presence

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
   * Returns the wire presence of `language`.
   */
  public fun languagePresence(): FieldPresence = languageState.presence

  /**
   * Returns the wire presence of `license`.
   */
  public fun licensePresence(): FieldPresence = licenseState.presence

  /**
   * Returns the wire presence of `mirror_url`.
   */
  public fun mirrorUrlPresence(): FieldPresence = mirrorUrlState.presence

  /**
   * Returns the wire presence of `network_count`.
   */
  public fun networkCountPresence(): FieldPresence = networkCountState.presence

  /**
   * Returns the wire presence of `open_issues`.
   */
  public fun openIssuesPresence(): FieldPresence = openIssuesState.presence

  /**
   * Returns the wire presence of `open_issues_count`.
   */
  public fun openIssuesCountPresence(): FieldPresence = openIssuesCountState.presence

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  /**
   * Returns the wire presence of `pull_request_creation_policy`.
   */
  public fun pullRequestCreationPolicyPresence(): FieldPresence = pullRequestCreationPolicyState.presence

  /**
   * Returns the wire presence of `pushed_at`.
   */
  public fun pushedAtPresence(): FieldPresence = pushedAtState.presence

  /**
   * Returns the wire presence of `role_name`.
   */
  public fun roleNamePresence(): FieldPresence = roleNameState.presence

  /**
   * Returns the wire presence of `security_and_analysis`.
   */
  public fun securityAndAnalysisPresence(): FieldPresence = securityAndAnalysisState.presence

  /**
   * Returns the wire presence of `size`.
   */
  public fun sizePresence(): FieldPresence = sizeState.presence

  /**
   * Returns the wire presence of `ssh_url`.
   */
  public fun sshUrlPresence(): FieldPresence = sshUrlState.presence

  /**
   * Returns the wire presence of `stargazers_count`.
   */
  public fun stargazersCountPresence(): FieldPresence = stargazersCountState.presence

  /**
   * Returns the wire presence of `subscribers_count`.
   */
  public fun subscribersCountPresence(): FieldPresence = subscribersCountState.presence

  /**
   * Returns the wire presence of `svn_url`.
   */
  public fun svnUrlPresence(): FieldPresence = svnUrlState.presence

  /**
   * Returns the wire presence of `temp_clone_token`.
   */
  public fun tempCloneTokenPresence(): FieldPresence = tempCloneTokenState.presence

  /**
   * Returns the wire presence of `topics`.
   */
  public fun topicsPresence(): FieldPresence = topicsState.presence

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  /**
   * Returns the wire presence of `visibility`.
   */
  public fun visibilityPresence(): FieldPresence = visibilityState.presence

  /**
   * Returns the wire presence of `watchers`.
   */
  public fun watchersPresence(): FieldPresence = watchersState.presence

  /**
   * Returns the wire presence of `watchers_count`.
   */
  public fun watchersCountPresence(): FieldPresence = watchersCountState.presence

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

    private var releasesUrlValue: String? = null

    public var releasesUrl: String
      get() = requireNotNull(releasesUrlValue) { "releasesUrl is required" }
      set(`value`) {
        releasesUrlValue = value
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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
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

    private var archivedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var archived: Boolean?
      get() = archivedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "archived is not nullable; call unsetArchived() to omit it" }
        archivedState = FieldState.Value(present)
      }

    private var cloneUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var cloneUrl: String?
      get() = cloneUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "cloneUrl is not nullable; call unsetCloneUrl() to omit it" }
        cloneUrlState = FieldState.Value(present)
      }

    private var codeOfConductState: FieldState<CodeOfConduct> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeOfConduct: CodeOfConduct?
      get() = codeOfConductState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "codeOfConduct is not nullable; call unsetCodeOfConduct() to omit it" }
        codeOfConductState = FieldState.Value(present)
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
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

    private var defaultBranchState: FieldState<String> = FieldState.Absent

    /**
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
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var disabled: Boolean?
      get() = disabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "disabled is not nullable; call unsetDisabled() to omit it" }
        disabledState = FieldState.Value(present)
      }

    private var forksState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var forks: Int?
      get() = forksState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "forks is not nullable; call unsetForks() to omit it" }
        forksState = FieldState.Value(present)
      }

    private var forksCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var forksCount: Int?
      get() = forksCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "forksCount is not nullable; call unsetForksCount() to omit it" }
        forksCountState = FieldState.Value(present)
      }

    private var gitUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var gitUrl: String?
      get() = gitUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "gitUrl is not nullable; call unsetGitUrl() to omit it" }
        gitUrlState = FieldState.Value(present)
      }

    private var hasDiscussionsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasDiscussions: Boolean?
      get() = hasDiscussionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasDiscussions is not nullable; call unsetHasDiscussions() to omit it" }
        hasDiscussionsState = FieldState.Value(present)
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

    private var hasIssuesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasIssues: Boolean?
      get() = hasIssuesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasIssues is not nullable; call unsetHasIssues() to omit it" }
        hasIssuesState = FieldState.Value(present)
      }

    private var hasPagesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasPages: Boolean?
      get() = hasPagesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasPages is not nullable; call unsetHasPages() to omit it" }
        hasPagesState = FieldState.Value(present)
      }

    private var hasProjectsState: FieldState<Boolean> = FieldState.Absent

    /**
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
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasWiki: Boolean?
      get() = hasWikiState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasWiki is not nullable; call unsetHasWiki() to omit it" }
        hasWikiState = FieldState.Value(present)
      }

    private var homepageState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var homepage: String?
      get() = homepageState.valueOrNull()
      set(`value`) {
        homepageState = value.toNullableFieldState()
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

    private var languageState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var language: String?
      get() = languageState.valueOrNull()
      set(`value`) {
        languageState = value.toNullableFieldState()
      }

    private var licenseState: FieldState<InlineMinimalRepositoryLicenseX5778c2e1?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var license: InlineMinimalRepositoryLicenseX5778c2e1?
      get() = licenseState.valueOrNull()
      set(`value`) {
        licenseState = value.toNullableFieldState()
      }

    private var mirrorUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var mirrorUrl: String?
      get() = mirrorUrlState.valueOrNull()
      set(`value`) {
        mirrorUrlState = value.toNullableFieldState()
      }

    private var networkCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var networkCount: Int?
      get() = networkCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "networkCount is not nullable; call unsetNetworkCount() to omit it" }
        networkCountState = FieldState.Value(present)
      }

    private var openIssuesState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var openIssues: Int?
      get() = openIssuesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "openIssues is not nullable; call unsetOpenIssues() to omit it" }
        openIssuesState = FieldState.Value(present)
      }

    private var openIssuesCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var openIssuesCount: Int?
      get() = openIssuesCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "openIssuesCount is not nullable; call unsetOpenIssuesCount() to omit it" }
        openIssuesCountState = FieldState.Value(present)
      }

    private var permissionsState: FieldState<InlineMinimalRepositoryPermissionsX331017ed> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineMinimalRepositoryPermissionsX331017ed?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    private var pullRequestCreationPolicyState:
        FieldState<InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3> = FieldState.Absent

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pullRequestCreationPolicy: InlineMinimalRepositoryPullRequestCreationPolicyXbd2b97c3?
      get() = pullRequestCreationPolicyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pullRequestCreationPolicy is not nullable; call unsetPullRequestCreationPolicy() to omit it" }
        pullRequestCreationPolicyState = FieldState.Value(present)
      }

    private var pushedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pushedAt: String?
      get() = pushedAtState.valueOrNull()
      set(`value`) {
        pushedAtState = value.toNullableFieldState()
      }

    private var roleNameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var roleName: String?
      get() = roleNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "roleName is not nullable; call unsetRoleName() to omit it" }
        roleNameState = FieldState.Value(present)
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

    private var sizeState: FieldState<Int> = FieldState.Absent

    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the
     * size is 0.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var size: Int?
      get() = sizeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "size is not nullable; call unsetSize() to omit it" }
        sizeState = FieldState.Value(present)
      }

    private var sshUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var sshUrl: String?
      get() = sshUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "sshUrl is not nullable; call unsetSshUrl() to omit it" }
        sshUrlState = FieldState.Value(present)
      }

    private var stargazersCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var stargazersCount: Int?
      get() = stargazersCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "stargazersCount is not nullable; call unsetStargazersCount() to omit it" }
        stargazersCountState = FieldState.Value(present)
      }

    private var subscribersCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var subscribersCount: Int?
      get() = subscribersCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "subscribersCount is not nullable; call unsetSubscribersCount() to omit it" }
        subscribersCountState = FieldState.Value(present)
      }

    private var svnUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var svnUrl: String?
      get() = svnUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "svnUrl is not nullable; call unsetSvnUrl() to omit it" }
        svnUrlState = FieldState.Value(present)
      }

    private var tempCloneTokenState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tempCloneToken: String?
      get() = tempCloneTokenState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tempCloneToken is not nullable; call unsetTempCloneToken() to omit it" }
        tempCloneTokenState = FieldState.Value(present)
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

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    private var visibilityState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var visibility: String?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "visibility is not nullable; call unsetVisibility() to omit it" }
        visibilityState = FieldState.Value(present)
      }

    private var watchersState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var watchers: Int?
      get() = watchersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "watchers is not nullable; call unsetWatchers() to omit it" }
        watchersState = FieldState.Value(present)
      }

    private var watchersCountState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var watchersCount: Int?
      get() = watchersCountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "watchersCount is not nullable; call unsetWatchersCount() to omit it" }
        watchersCountState = FieldState.Value(present)
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
     * Omits `allow_forking` from serialized output.
     */
    public fun unsetAllowForking() {
      allowForkingState = FieldState.Absent
    }

    /**
     * Omits `archived` from serialized output.
     */
    public fun unsetArchived() {
      archivedState = FieldState.Absent
    }

    /**
     * Omits `clone_url` from serialized output.
     */
    public fun unsetCloneUrl() {
      cloneUrlState = FieldState.Absent
    }

    /**
     * Omits `code_of_conduct` from serialized output.
     */
    public fun unsetCodeOfConduct() {
      codeOfConductState = FieldState.Absent
    }

    /**
     * Omits `created_at` from serialized output.
     */
    public fun unsetCreatedAt() {
      createdAtState = FieldState.Absent
    }

    /**
     * Omits `custom_properties` from serialized output.
     */
    public fun unsetCustomProperties() {
      customPropertiesState = FieldState.Absent
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
     * Omits `disabled` from serialized output.
     */
    public fun unsetDisabled() {
      disabledState = FieldState.Absent
    }

    /**
     * Omits `forks` from serialized output.
     */
    public fun unsetForks() {
      forksState = FieldState.Absent
    }

    /**
     * Omits `forks_count` from serialized output.
     */
    public fun unsetForksCount() {
      forksCountState = FieldState.Absent
    }

    /**
     * Omits `git_url` from serialized output.
     */
    public fun unsetGitUrl() {
      gitUrlState = FieldState.Absent
    }

    /**
     * Omits `has_discussions` from serialized output.
     */
    public fun unsetHasDiscussions() {
      hasDiscussionsState = FieldState.Absent
    }

    /**
     * Omits `has_downloads` from serialized output.
     */
    public fun unsetHasDownloads() {
      hasDownloadsState = FieldState.Absent
    }

    /**
     * Omits `has_issues` from serialized output.
     */
    public fun unsetHasIssues() {
      hasIssuesState = FieldState.Absent
    }

    /**
     * Omits `has_pages` from serialized output.
     */
    public fun unsetHasPages() {
      hasPagesState = FieldState.Absent
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
     * Omits `language` from serialized output.
     */
    public fun unsetLanguage() {
      languageState = FieldState.Absent
    }

    /**
     * Omits `license` from serialized output.
     */
    public fun unsetLicense() {
      licenseState = FieldState.Absent
    }

    /**
     * Omits `mirror_url` from serialized output.
     */
    public fun unsetMirrorUrl() {
      mirrorUrlState = FieldState.Absent
    }

    /**
     * Omits `network_count` from serialized output.
     */
    public fun unsetNetworkCount() {
      networkCountState = FieldState.Absent
    }

    /**
     * Omits `open_issues` from serialized output.
     */
    public fun unsetOpenIssues() {
      openIssuesState = FieldState.Absent
    }

    /**
     * Omits `open_issues_count` from serialized output.
     */
    public fun unsetOpenIssuesCount() {
      openIssuesCountState = FieldState.Absent
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
     * Omits `pushed_at` from serialized output.
     */
    public fun unsetPushedAt() {
      pushedAtState = FieldState.Absent
    }

    /**
     * Omits `role_name` from serialized output.
     */
    public fun unsetRoleName() {
      roleNameState = FieldState.Absent
    }

    /**
     * Omits `security_and_analysis` from serialized output.
     */
    public fun unsetSecurityAndAnalysis() {
      securityAndAnalysisState = FieldState.Absent
    }

    /**
     * Omits `size` from serialized output.
     */
    public fun unsetSize() {
      sizeState = FieldState.Absent
    }

    /**
     * Omits `ssh_url` from serialized output.
     */
    public fun unsetSshUrl() {
      sshUrlState = FieldState.Absent
    }

    /**
     * Omits `stargazers_count` from serialized output.
     */
    public fun unsetStargazersCount() {
      stargazersCountState = FieldState.Absent
    }

    /**
     * Omits `subscribers_count` from serialized output.
     */
    public fun unsetSubscribersCount() {
      subscribersCountState = FieldState.Absent
    }

    /**
     * Omits `svn_url` from serialized output.
     */
    public fun unsetSvnUrl() {
      svnUrlState = FieldState.Absent
    }

    /**
     * Omits `temp_clone_token` from serialized output.
     */
    public fun unsetTempCloneToken() {
      tempCloneTokenState = FieldState.Absent
    }

    /**
     * Omits `topics` from serialized output.
     */
    public fun unsetTopics() {
      topicsState = FieldState.Absent
    }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    /**
     * Omits `visibility` from serialized output.
     */
    public fun unsetVisibility() {
      visibilityState = FieldState.Absent
    }

    /**
     * Omits `watchers` from serialized output.
     */
    public fun unsetWatchers() {
      watchersState = FieldState.Absent
    }

    /**
     * Omits `watchers_count` from serialized output.
     */
    public fun unsetWatchersCount() {
      watchersCountState = FieldState.Absent
    }

    /**
     * Omits `web_commit_signoff_required` from serialized output.
     */
    public fun unsetWebCommitSignoffRequired() {
      webCommitSignoffRequiredState = FieldState.Absent
    }

    public fun build(): MinimalRepository {
      check(archiveUrlValue != null) { "archiveUrl is required" }
      check(assigneesUrlValue != null) { "assigneesUrl is required" }
      check(blobsUrlValue != null) { "blobsUrl is required" }
      check(branchesUrlValue != null) { "branchesUrl is required" }
      check(collaboratorsUrlValue != null) { "collaboratorsUrl is required" }
      check(commentsUrlValue != null) { "commentsUrl is required" }
      check(commitsUrlValue != null) { "commitsUrl is required" }
      check(compareUrlValue != null) { "compareUrl is required" }
      check(contentsUrlValue != null) { "contentsUrl is required" }
      check(contributorsUrlValue != null) { "contributorsUrl is required" }
      check(deploymentsUrlValue != null) { "deploymentsUrl is required" }
      check(downloadsUrlValue != null) { "downloadsUrl is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(forkValue != null) { "fork is required" }
      check(forksUrlValue != null) { "forksUrl is required" }
      check(fullNameValue != null) { "fullName is required" }
      check(gitCommitsUrlValue != null) { "gitCommitsUrl is required" }
      check(gitRefsUrlValue != null) { "gitRefsUrl is required" }
      check(gitTagsUrlValue != null) { "gitTagsUrl is required" }
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
      check(ownerValue != null) { "owner is required" }
      check(privateValue != null) { "private is required" }
      check(pullsUrlValue != null) { "pullsUrl is required" }
      check(releasesUrlValue != null) { "releasesUrl is required" }
      check(stargazersUrlValue != null) { "stargazersUrl is required" }
      check(statusesUrlValue != null) { "statusesUrl is required" }
      check(subscribersUrlValue != null) { "subscribersUrl is required" }
      check(subscriptionUrlValue != null) { "subscriptionUrl is required" }
      check(tagsUrlValue != null) { "tagsUrl is required" }
      check(teamsUrlValue != null) { "teamsUrl is required" }
      check(treesUrlValue != null) { "treesUrl is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return MinimalRepository(
        archiveUrl = archiveUrl,
        assigneesUrl = assigneesUrl,
        blobsUrl = blobsUrl,
        branchesUrl = branchesUrl,
        collaboratorsUrl = collaboratorsUrl,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        compareUrl = compareUrl,
        contentsUrl = contentsUrl,
        contributorsUrl = contributorsUrl,
        deploymentsUrl = deploymentsUrl,
        description = descriptionState.valueOrNull(),
        downloadsUrl = downloadsUrl,
        eventsUrl = eventsUrl,
        fork = fork,
        forksUrl = forksUrl,
        fullName = fullName,
        gitCommitsUrl = gitCommitsUrl,
        gitRefsUrl = gitRefsUrl,
        gitTagsUrl = gitTagsUrl,
        hooksUrl = hooksUrl,
        htmlUrl = htmlUrl,
        id = id,
        issueCommentUrl = issueCommentUrl,
        issueEventsUrl = issueEventsUrl,
        issuesUrl = issuesUrl,
        keysUrl = keysUrl,
        labelsUrl = labelsUrl,
        languagesUrl = languagesUrl,
        mergesUrl = mergesUrl,
        milestonesUrl = milestonesUrl,
        name = name,
        nodeId = nodeId,
        notificationsUrl = notificationsUrl,
        owner = owner,
        private = private,
        pullsUrl = pullsUrl,
        releasesUrl = releasesUrl,
        stargazersUrl = stargazersUrl,
        statusesUrl = statusesUrl,
        subscribersUrl = subscribersUrl,
        subscriptionUrl = subscriptionUrl,
        tagsUrl = tagsUrl,
        teamsUrl = teamsUrl,
        treesUrl = treesUrl,
        url = url,
        allowForkingState = allowForkingState,
        archivedState = archivedState,
        cloneUrlState = cloneUrlState,
        codeOfConductState = codeOfConductState,
        createdAtState = createdAtState,
        customPropertiesState = customPropertiesState,
        defaultBranchState = defaultBranchState,
        deleteBranchOnMergeState = deleteBranchOnMergeState,
        disabledState = disabledState,
        forksState = forksState,
        forksCountState = forksCountState,
        gitUrlState = gitUrlState,
        hasDiscussionsState = hasDiscussionsState,
        hasDownloadsState = hasDownloadsState,
        hasIssuesState = hasIssuesState,
        hasPagesState = hasPagesState,
        hasProjectsState = hasProjectsState,
        hasPullRequestsState = hasPullRequestsState,
        hasWikiState = hasWikiState,
        homepageState = homepageState,
        isTemplateState = isTemplateState,
        languageState = languageState,
        licenseState = licenseState,
        mirrorUrlState = mirrorUrlState,
        networkCountState = networkCountState,
        openIssuesState = openIssuesState,
        openIssuesCountState = openIssuesCountState,
        permissionsState = permissionsState,
        pullRequestCreationPolicyState = pullRequestCreationPolicyState,
        pushedAtState = pushedAtState,
        roleNameState = roleNameState,
        securityAndAnalysisState = securityAndAnalysisState,
        sizeState = sizeState,
        sshUrlState = sshUrlState,
        stargazersCountState = stargazersCountState,
        subscribersCountState = subscribersCountState,
        svnUrlState = svnUrlState,
        tempCloneTokenState = tempCloneTokenState,
        topicsState = topicsState,
        updatedAtState = updatedAtState,
        visibilityState = visibilityState,
        watchersState = watchersState,
        watchersCountState = watchersCountState,
        webCommitSignoffRequiredState = webCommitSignoffRequiredState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MinimalRepository = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MinimalRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MinimalRepository {
      val jsonDecoder = decoder.requireJsonDecoder("MinimalRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MinimalRepository must be a JSON object")
      val archiveUrl = json.decodeRequired<String>(rawObject, "archive_url")
      val assigneesUrl = json.decodeRequired<String>(rawObject, "assignees_url")
      val blobsUrl = json.decodeRequired<String>(rawObject, "blobs_url")
      val branchesUrl = json.decodeRequired<String>(rawObject, "branches_url")
      val collaboratorsUrl = json.decodeRequired<String>(rawObject, "collaborators_url")
      val commentsUrl = json.decodeRequired<String>(rawObject, "comments_url")
      val commitsUrl = json.decodeRequired<String>(rawObject, "commits_url")
      val compareUrl = json.decodeRequired<String>(rawObject, "compare_url")
      val contentsUrl = json.decodeRequired<String>(rawObject, "contents_url")
      val contributorsUrl = json.decodeRequired<String>(rawObject, "contributors_url")
      val deploymentsUrl = json.decodeRequired<String>(rawObject, "deployments_url")
      val downloadsUrl = json.decodeRequired<String>(rawObject, "downloads_url")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val fork = json.decodeRequired<Boolean>(rawObject, "fork")
      val forksUrl = json.decodeRequired<String>(rawObject, "forks_url")
      val fullName = json.decodeRequired<String>(rawObject, "full_name")
      val gitCommitsUrl = json.decodeRequired<String>(rawObject, "git_commits_url")
      val gitRefsUrl = json.decodeRequired<String>(rawObject, "git_refs_url")
      val gitTagsUrl = json.decodeRequired<String>(rawObject, "git_tags_url")
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
      val owner = json.decodeRequired<SimpleUser>(rawObject, "owner")
      val private = json.decodeRequired<Boolean>(rawObject, "private")
      val pullsUrl = json.decodeRequired<String>(rawObject, "pulls_url")
      val releasesUrl = json.decodeRequired<String>(rawObject, "releases_url")
      val stargazersUrl = json.decodeRequired<String>(rawObject, "stargazers_url")
      val statusesUrl = json.decodeRequired<String>(rawObject, "statuses_url")
      val subscribersUrl = json.decodeRequired<String>(rawObject, "subscribers_url")
      val subscriptionUrl = json.decodeRequired<String>(rawObject, "subscription_url")
      val tagsUrl = json.decodeRequired<String>(rawObject, "tags_url")
      val teamsUrl = json.decodeRequired<String>(rawObject, "teams_url")
      val treesUrl = json.decodeRequired<String>(rawObject, "trees_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("MinimalRepository is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return MinimalRepository(
        archiveUrl = archiveUrl,
        assigneesUrl = assigneesUrl,
        blobsUrl = blobsUrl,
        branchesUrl = branchesUrl,
        collaboratorsUrl = collaboratorsUrl,
        commentsUrl = commentsUrl,
        commitsUrl = commitsUrl,
        compareUrl = compareUrl,
        contentsUrl = contentsUrl,
        contributorsUrl = contributorsUrl,
        deploymentsUrl = deploymentsUrl,
        description = description,
        downloadsUrl = downloadsUrl,
        eventsUrl = eventsUrl,
        fork = fork,
        forksUrl = forksUrl,
        fullName = fullName,
        gitCommitsUrl = gitCommitsUrl,
        gitRefsUrl = gitRefsUrl,
        gitTagsUrl = gitTagsUrl,
        hooksUrl = hooksUrl,
        htmlUrl = htmlUrl,
        id = id,
        issueCommentUrl = issueCommentUrl,
        issueEventsUrl = issueEventsUrl,
        issuesUrl = issuesUrl,
        keysUrl = keysUrl,
        labelsUrl = labelsUrl,
        languagesUrl = languagesUrl,
        mergesUrl = mergesUrl,
        milestonesUrl = milestonesUrl,
        name = name,
        nodeId = nodeId,
        notificationsUrl = notificationsUrl,
        owner = owner,
        private = private,
        pullsUrl = pullsUrl,
        releasesUrl = releasesUrl,
        stargazersUrl = stargazersUrl,
        statusesUrl = statusesUrl,
        subscribersUrl = subscribersUrl,
        subscriptionUrl = subscriptionUrl,
        tagsUrl = tagsUrl,
        teamsUrl = teamsUrl,
        treesUrl = treesUrl,
        url = url,
        allowForkingState = json.decodeOptional(rawObject, "allow_forking", nullable = false),
        archivedState = json.decodeOptional(rawObject, "archived", nullable = false),
        cloneUrlState = json.decodeOptional(rawObject, "clone_url", nullable = false),
        codeOfConductState = json.decodeOptional(rawObject, "code_of_conduct", nullable = false),
        createdAtState = json.decodeOptional(rawObject, "created_at", nullable = true),
        customPropertiesState = json.decodeOptional(rawObject, "custom_properties", nullable = false),
        defaultBranchState = json.decodeOptional(rawObject, "default_branch", nullable = false),
        deleteBranchOnMergeState = json.decodeOptional(rawObject, "delete_branch_on_merge", nullable = false),
        disabledState = json.decodeOptional(rawObject, "disabled", nullable = false),
        forksState = json.decodeOptional(rawObject, "forks", nullable = false),
        forksCountState = json.decodeOptional(rawObject, "forks_count", nullable = false),
        gitUrlState = json.decodeOptional(rawObject, "git_url", nullable = false),
        hasDiscussionsState = json.decodeOptional(rawObject, "has_discussions", nullable = false),
        hasDownloadsState = json.decodeOptional(rawObject, "has_downloads", nullable = false),
        hasIssuesState = json.decodeOptional(rawObject, "has_issues", nullable = false),
        hasPagesState = json.decodeOptional(rawObject, "has_pages", nullable = false),
        hasProjectsState = json.decodeOptional(rawObject, "has_projects", nullable = false),
        hasPullRequestsState = json.decodeOptional(rawObject, "has_pull_requests", nullable = false),
        hasWikiState = json.decodeOptional(rawObject, "has_wiki", nullable = false),
        homepageState = json.decodeOptional(rawObject, "homepage", nullable = true),
        isTemplateState = json.decodeOptional(rawObject, "is_template", nullable = false),
        languageState = json.decodeOptional(rawObject, "language", nullable = true),
        licenseState = json.decodeOptional(rawObject, "license", nullable = true),
        mirrorUrlState = json.decodeOptional(rawObject, "mirror_url", nullable = true),
        networkCountState = json.decodeOptional(rawObject, "network_count", nullable = false),
        openIssuesState = json.decodeOptional(rawObject, "open_issues", nullable = false),
        openIssuesCountState = json.decodeOptional(rawObject, "open_issues_count", nullable = false),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
        pullRequestCreationPolicyState = json.decodeOptional(rawObject, "pull_request_creation_policy", nullable = false),
        pushedAtState = json.decodeOptional(rawObject, "pushed_at", nullable = true),
        roleNameState = json.decodeOptional(rawObject, "role_name", nullable = false),
        securityAndAnalysisState = json.decodeOptional(rawObject, "security_and_analysis", nullable = true),
        sizeState = json.decodeOptional(rawObject, "size", nullable = false),
        sshUrlState = json.decodeOptional(rawObject, "ssh_url", nullable = false),
        stargazersCountState = json.decodeOptional(rawObject, "stargazers_count", nullable = false),
        subscribersCountState = json.decodeOptional(rawObject, "subscribers_count", nullable = false),
        svnUrlState = json.decodeOptional(rawObject, "svn_url", nullable = false),
        tempCloneTokenState = json.decodeOptional(rawObject, "temp_clone_token", nullable = false),
        topicsState = json.decodeOptional(rawObject, "topics", nullable = false),
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = true),
        visibilityState = json.decodeOptional(rawObject, "visibility", nullable = false),
        watchersState = json.decodeOptional(rawObject, "watchers", nullable = false),
        watchersCountState = json.decodeOptional(rawObject, "watchers_count", nullable = false),
        webCommitSignoffRequiredState = json.decodeOptional(rawObject, "web_commit_signoff_required", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: MinimalRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("MinimalRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archive_url", value.archiveUrl)
        put("assignees_url", value.assigneesUrl)
        put("blobs_url", value.blobsUrl)
        put("branches_url", value.branchesUrl)
        put("collaborators_url", value.collaboratorsUrl)
        put("comments_url", value.commentsUrl)
        put("commits_url", value.commitsUrl)
        put("compare_url", value.compareUrl)
        put("contents_url", value.contentsUrl)
        put("contributors_url", value.contributorsUrl)
        put("deployments_url", value.deploymentsUrl)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("downloads_url", value.downloadsUrl)
        put("events_url", value.eventsUrl)
        put("fork", json.encodeToJsonElement(value.fork))
        put("forks_url", value.forksUrl)
        put("full_name", value.fullName)
        put("git_commits_url", value.gitCommitsUrl)
        put("git_refs_url", value.gitRefsUrl)
        put("git_tags_url", value.gitTagsUrl)
        put("hooks_url", value.hooksUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issue_comment_url", value.issueCommentUrl)
        put("issue_events_url", value.issueEventsUrl)
        put("issues_url", value.issuesUrl)
        put("keys_url", value.keysUrl)
        put("labels_url", value.labelsUrl)
        put("languages_url", value.languagesUrl)
        put("merges_url", value.mergesUrl)
        put("milestones_url", value.milestonesUrl)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("notifications_url", value.notificationsUrl)
        put("owner", json.encodeToJsonElement(value.owner))
        put("private", json.encodeToJsonElement(value.private))
        put("pulls_url", value.pullsUrl)
        put("releases_url", value.releasesUrl)
        put("stargazers_url", value.stargazersUrl)
        put("statuses_url", value.statusesUrl)
        put("subscribers_url", value.subscribersUrl)
        put("subscription_url", value.subscriptionUrl)
        put("tags_url", value.tagsUrl)
        put("teams_url", value.teamsUrl)
        put("trees_url", value.treesUrl)
        put("url", value.url)
        putState("allow_forking", value.allowForkingState, json::encodeToJsonElement)
        putState("archived", value.archivedState, json::encodeToJsonElement)
        putState("clone_url", value.cloneUrlState, json::encodeToJsonElement)
        putState("code_of_conduct", value.codeOfConductState, json::encodeToJsonElement)
        putState("created_at", value.createdAtState, json::encodeToJsonElement)
        putState("custom_properties", value.customPropertiesState, json::encodeToJsonElement)
        putState("default_branch", value.defaultBranchState, json::encodeToJsonElement)
        putState("delete_branch_on_merge", value.deleteBranchOnMergeState, json::encodeToJsonElement)
        putState("disabled", value.disabledState, json::encodeToJsonElement)
        putState("forks", value.forksState, json::encodeToJsonElement)
        putState("forks_count", value.forksCountState, json::encodeToJsonElement)
        putState("git_url", value.gitUrlState, json::encodeToJsonElement)
        putState("has_discussions", value.hasDiscussionsState, json::encodeToJsonElement)
        putState("has_downloads", value.hasDownloadsState, json::encodeToJsonElement)
        putState("has_issues", value.hasIssuesState, json::encodeToJsonElement)
        putState("has_pages", value.hasPagesState, json::encodeToJsonElement)
        putState("has_projects", value.hasProjectsState, json::encodeToJsonElement)
        putState("has_pull_requests", value.hasPullRequestsState, json::encodeToJsonElement)
        putState("has_wiki", value.hasWikiState, json::encodeToJsonElement)
        putState("homepage", value.homepageState, json::encodeToJsonElement)
        putState("is_template", value.isTemplateState, json::encodeToJsonElement)
        putState("language", value.languageState, json::encodeToJsonElement)
        putState("license", value.licenseState, json::encodeToJsonElement)
        putState("mirror_url", value.mirrorUrlState, json::encodeToJsonElement)
        putState("network_count", value.networkCountState, json::encodeToJsonElement)
        putState("open_issues", value.openIssuesState, json::encodeToJsonElement)
        putState("open_issues_count", value.openIssuesCountState, json::encodeToJsonElement)
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
        putState("pull_request_creation_policy", value.pullRequestCreationPolicyState, json::encodeToJsonElement)
        putState("pushed_at", value.pushedAtState, json::encodeToJsonElement)
        putState("role_name", value.roleNameState, json::encodeToJsonElement)
        putState("security_and_analysis", value.securityAndAnalysisState, json::encodeToJsonElement)
        putState("size", value.sizeState, json::encodeToJsonElement)
        putState("ssh_url", value.sshUrlState, json::encodeToJsonElement)
        putState("stargazers_count", value.stargazersCountState, json::encodeToJsonElement)
        putState("subscribers_count", value.subscribersCountState, json::encodeToJsonElement)
        putState("svn_url", value.svnUrlState, json::encodeToJsonElement)
        putState("temp_clone_token", value.tempCloneTokenState, json::encodeToJsonElement)
        putState("topics", value.topicsState, json::encodeToJsonElement)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
        putState("visibility", value.visibilityState, json::encodeToJsonElement)
        putState("watchers", value.watchersState, json::encodeToJsonElement)
        putState("watchers_count", value.watchersCountState, json::encodeToJsonElement)
        putState("web_commit_signoff_required", value.webCommitSignoffRequiredState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun minimalRepository(block: MinimalRepository.Builder.() -> Unit): MinimalRepository = MinimalRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MinimalRepository is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("MinimalRepository property '" + name + "' is not nullable")
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

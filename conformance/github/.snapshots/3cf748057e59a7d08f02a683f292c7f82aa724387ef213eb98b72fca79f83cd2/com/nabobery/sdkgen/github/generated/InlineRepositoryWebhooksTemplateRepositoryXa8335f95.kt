package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/template_repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/template_repository
 */
@Serializable(with = InlineRepositoryWebhooksTemplateRepositoryXa8335f95.Serializer::class)
public class InlineRepositoryWebhooksTemplateRepositoryXa8335f95(
  public val allowAutoMerge: Boolean? = null,
  public val allowMergeCommit: Boolean? = null,
  public val allowRebaseMerge: Boolean? = null,
  public val allowSquashMerge: Boolean? = null,
  public val allowUpdateBranch: Boolean? = null,
  public val archiveUrl: String? = null,
  public val archived: Boolean? = null,
  public val assigneesUrl: String? = null,
  public val blobsUrl: String? = null,
  public val branchesUrl: String? = null,
  public val cloneUrl: String? = null,
  public val collaboratorsUrl: String? = null,
  public val commentsUrl: String? = null,
  public val commitsUrl: String? = null,
  public val compareUrl: String? = null,
  public val contentsUrl: String? = null,
  public val contributorsUrl: String? = null,
  public val createdAt: String? = null,
  public val defaultBranch: String? = null,
  public val deleteBranchOnMerge: Boolean? = null,
  public val deploymentsUrl: String? = null,
  public val description: String? = null,
  public val disabled: Boolean? = null,
  public val downloadsUrl: String? = null,
  public val eventsUrl: String? = null,
  public val fork: Boolean? = null,
  public val forksCount: Int? = null,
  public val forksUrl: String? = null,
  public val fullName: String? = null,
  public val gitCommitsUrl: String? = null,
  public val gitRefsUrl: String? = null,
  public val gitTagsUrl: String? = null,
  public val gitUrl: String? = null,
  public val hasDownloads: Boolean? = null,
  public val hasIssues: Boolean? = null,
  public val hasPages: Boolean? = null,
  public val hasProjects: Boolean? = null,
  public val hasWiki: Boolean? = null,
  public val homepage: String? = null,
  public val hooksUrl: String? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val isTemplate: Boolean? = null,
  public val issueCommentUrl: String? = null,
  public val issueEventsUrl: String? = null,
  public val issuesUrl: String? = null,
  public val keysUrl: String? = null,
  public val labelsUrl: String? = null,
  public val language: String? = null,
  public val languagesUrl: String? = null,
  /**
   * The default value for a merge commit message.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `PR_BODY` - default to the pull request's body.
   * - `BLANK` - default to a blank commit message.
   */
  public val mergeCommitMessage:
      InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55? = null,
  /**
   * The default value for a merge commit title.
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
   * branch-name).
   */
  public val mergeCommitTitle:
      InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19? = null,
  public val mergesUrl: String? = null,
  public val milestonesUrl: String? = null,
  public val mirrorUrl: String? = null,
  public val name: String? = null,
  public val networkCount: Int? = null,
  public val nodeId: String? = null,
  public val notificationsUrl: String? = null,
  public val openIssuesCount: Int? = null,
  public val owner: InlineRepositoryWebhooksTemplateRepositoryOwnerX90dcb0b7? = null,
  public val permissions: InlineRepositoryWebhooksTemplateRepositoryPermissionsX8124936b? = null,
  public val `private`: Boolean? = null,
  public val pullsUrl: String? = null,
  public val pushedAt: String? = null,
  public val releasesUrl: String? = null,
  public val size: Int? = null,
  /**
   * The default value for a squash merge commit message:
   *
   * - `PR_BODY` - default to the pull request's body.
   * - `COMMIT_MESSAGES` - default to the branch's commit messages.
   * - `BLANK` - default to a blank commit message.
   */
  public val squashMergeCommitMessage:
      InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8? = null,
  /**
   * The default value for a squash merge commit title:
   *
   * - `PR_TITLE` - default to the pull request's title.
   * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
   * than one commit).
   */
  public val squashMergeCommitTitle:
      InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e? = null,
  public val sshUrl: String? = null,
  public val stargazersCount: Int? = null,
  public val stargazersUrl: String? = null,
  public val statusesUrl: String? = null,
  public val subscribersCount: Int? = null,
  public val subscribersUrl: String? = null,
  public val subscriptionUrl: String? = null,
  public val svnUrl: String? = null,
  public val tagsUrl: String? = null,
  public val teamsUrl: String? = null,
  public val tempCloneToken: String? = null,
  public val topics: List<String>? = null,
  public val treesUrl: String? = null,
  public val updatedAt: String? = null,
  public val url: String? = null,
  public val useSquashPrTitleAsDefault: Boolean? = null,
  public val visibility: String? = null,
  public val watchersCount: Int? = null,
) {
  public class Builder {
    public var allowAutoMerge: Boolean? = null

    public var allowMergeCommit: Boolean? = null

    public var allowRebaseMerge: Boolean? = null

    public var allowSquashMerge: Boolean? = null

    public var allowUpdateBranch: Boolean? = null

    public var archiveUrl: String? = null

    public var archived: Boolean? = null

    public var assigneesUrl: String? = null

    public var blobsUrl: String? = null

    public var branchesUrl: String? = null

    public var cloneUrl: String? = null

    public var collaboratorsUrl: String? = null

    public var commentsUrl: String? = null

    public var commitsUrl: String? = null

    public var compareUrl: String? = null

    public var contentsUrl: String? = null

    public var contributorsUrl: String? = null

    public var createdAt: String? = null

    public var defaultBranch: String? = null

    public var deleteBranchOnMerge: Boolean? = null

    public var deploymentsUrl: String? = null

    public var description: String? = null

    public var disabled: Boolean? = null

    public var downloadsUrl: String? = null

    public var eventsUrl: String? = null

    public var fork: Boolean? = null

    public var forksCount: Int? = null

    public var forksUrl: String? = null

    public var fullName: String? = null

    public var gitCommitsUrl: String? = null

    public var gitRefsUrl: String? = null

    public var gitTagsUrl: String? = null

    public var gitUrl: String? = null

    public var hasDownloads: Boolean? = null

    public var hasIssues: Boolean? = null

    public var hasPages: Boolean? = null

    public var hasProjects: Boolean? = null

    public var hasWiki: Boolean? = null

    public var homepage: String? = null

    public var hooksUrl: String? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var isTemplate: Boolean? = null

    public var issueCommentUrl: String? = null

    public var issueEventsUrl: String? = null

    public var issuesUrl: String? = null

    public var keysUrl: String? = null

    public var labelsUrl: String? = null

    public var language: String? = null

    public var languagesUrl: String? = null

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     */
    public var mergeCommitMessage:
        InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55? = null

    /**
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
     * branch-name).
     */
    public var mergeCommitTitle:
        InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19? = null

    public var mergesUrl: String? = null

    public var milestonesUrl: String? = null

    public var mirrorUrl: String? = null

    public var name: String? = null

    public var networkCount: Int? = null

    public var nodeId: String? = null

    public var notificationsUrl: String? = null

    public var openIssuesCount: Int? = null

    public var owner: InlineRepositoryWebhooksTemplateRepositoryOwnerX90dcb0b7? = null

    public var permissions: InlineRepositoryWebhooksTemplateRepositoryPermissionsX8124936b? = null

    public var `private`: Boolean? = null

    public var pullsUrl: String? = null

    public var pushedAt: String? = null

    public var releasesUrl: String? = null

    public var size: Int? = null

    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     */
    public var squashMergeCommitMessage:
        InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8? = null

    /**
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when
     * more than one commit).
     */
    public var squashMergeCommitTitle:
        InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e? = null

    public var sshUrl: String? = null

    public var stargazersCount: Int? = null

    public var stargazersUrl: String? = null

    public var statusesUrl: String? = null

    public var subscribersCount: Int? = null

    public var subscribersUrl: String? = null

    public var subscriptionUrl: String? = null

    public var svnUrl: String? = null

    public var tagsUrl: String? = null

    public var teamsUrl: String? = null

    public var tempCloneToken: String? = null

    public var topics: List<String>? = null

    public var treesUrl: String? = null

    public var updatedAt: String? = null

    public var url: String? = null

    public var useSquashPrTitleAsDefault: Boolean? = null

    public var visibility: String? = null

    public var watchersCount: Int? = null

    public fun build(): InlineRepositoryWebhooksTemplateRepositoryXa8335f95 = InlineRepositoryWebhooksTemplateRepositoryXa8335f95(
      allowAutoMerge = allowAutoMerge,
      allowMergeCommit = allowMergeCommit,
      allowRebaseMerge = allowRebaseMerge,
      allowSquashMerge = allowSquashMerge,
      allowUpdateBranch = allowUpdateBranch,
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
      deleteBranchOnMerge = deleteBranchOnMerge,
      deploymentsUrl = deploymentsUrl,
      description = description,
      disabled = disabled,
      downloadsUrl = downloadsUrl,
      eventsUrl = eventsUrl,
      fork = fork,
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
      isTemplate = isTemplate,
      issueCommentUrl = issueCommentUrl,
      issueEventsUrl = issueEventsUrl,
      issuesUrl = issuesUrl,
      keysUrl = keysUrl,
      labelsUrl = labelsUrl,
      language = language,
      languagesUrl = languagesUrl,
      mergeCommitMessage = mergeCommitMessage,
      mergeCommitTitle = mergeCommitTitle,
      mergesUrl = mergesUrl,
      milestonesUrl = milestonesUrl,
      mirrorUrl = mirrorUrl,
      name = name,
      networkCount = networkCount,
      nodeId = nodeId,
      notificationsUrl = notificationsUrl,
      openIssuesCount = openIssuesCount,
      owner = owner,
      permissions = permissions,
      private = private,
      pullsUrl = pullsUrl,
      pushedAt = pushedAt,
      releasesUrl = releasesUrl,
      size = size,
      squashMergeCommitMessage = squashMergeCommitMessage,
      squashMergeCommitTitle = squashMergeCommitTitle,
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
      tempCloneToken = tempCloneToken,
      topics = topics,
      treesUrl = treesUrl,
      updatedAt = updatedAt,
      url = url,
      useSquashPrTitleAsDefault = useSquashPrTitleAsDefault,
      visibility = visibility,
      watchersCount = watchersCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryWebhooksTemplateRepositoryXa8335f95 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryWebhooksTemplateRepositoryXa8335f95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksTemplateRepositoryXa8335f95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryWebhooksTemplateRepositoryXa8335f95")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryWebhooksTemplateRepositoryXa8335f95 must be a JSON object")
      return InlineRepositoryWebhooksTemplateRepositoryXa8335f95(
        allowAutoMerge = rawObject["allow_auto_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowMergeCommit = rawObject["allow_merge_commit"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowRebaseMerge = rawObject["allow_rebase_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowSquashMerge = rawObject["allow_squash_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        allowUpdateBranch = rawObject["allow_update_branch"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        archiveUrl = rawObject["archive_url"]?.let { json.decodeFromJsonElement<String>(it) },
        archived = rawObject["archived"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        assigneesUrl = rawObject["assignees_url"]?.let { json.decodeFromJsonElement<String>(it) },
        blobsUrl = rawObject["blobs_url"]?.let { json.decodeFromJsonElement<String>(it) },
        branchesUrl = rawObject["branches_url"]?.let { json.decodeFromJsonElement<String>(it) },
        cloneUrl = rawObject["clone_url"]?.let { json.decodeFromJsonElement<String>(it) },
        collaboratorsUrl = rawObject["collaborators_url"]?.let { json.decodeFromJsonElement<String>(it) },
        commentsUrl = rawObject["comments_url"]?.let { json.decodeFromJsonElement<String>(it) },
        commitsUrl = rawObject["commits_url"]?.let { json.decodeFromJsonElement<String>(it) },
        compareUrl = rawObject["compare_url"]?.let { json.decodeFromJsonElement<String>(it) },
        contentsUrl = rawObject["contents_url"]?.let { json.decodeFromJsonElement<String>(it) },
        contributorsUrl = rawObject["contributors_url"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultBranch = rawObject["default_branch"]?.let { json.decodeFromJsonElement<String>(it) },
        deleteBranchOnMerge = rawObject["delete_branch_on_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        deploymentsUrl = rawObject["deployments_url"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        disabled = rawObject["disabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        downloadsUrl = rawObject["downloads_url"]?.let { json.decodeFromJsonElement<String>(it) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        fork = rawObject["fork"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        forksCount = rawObject["forks_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        forksUrl = rawObject["forks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        fullName = rawObject["full_name"]?.let { json.decodeFromJsonElement<String>(it) },
        gitCommitsUrl = rawObject["git_commits_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitRefsUrl = rawObject["git_refs_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitTagsUrl = rawObject["git_tags_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitUrl = rawObject["git_url"]?.let { json.decodeFromJsonElement<String>(it) },
        hasDownloads = rawObject["has_downloads"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasIssues = rawObject["has_issues"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasPages = rawObject["has_pages"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasProjects = rawObject["has_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasWiki = rawObject["has_wiki"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        homepage = rawObject["homepage"]?.let { json.decodeFromJsonElement<String>(it) },
        hooksUrl = rawObject["hooks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        isTemplate = rawObject["is_template"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        issueCommentUrl = rawObject["issue_comment_url"]?.let { json.decodeFromJsonElement<String>(it) },
        issueEventsUrl = rawObject["issue_events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        issuesUrl = rawObject["issues_url"]?.let { json.decodeFromJsonElement<String>(it) },
        keysUrl = rawObject["keys_url"]?.let { json.decodeFromJsonElement<String>(it) },
        labelsUrl = rawObject["labels_url"]?.let { json.decodeFromJsonElement<String>(it) },
        language = rawObject["language"]?.let { json.decodeFromJsonElement<String>(it) },
        languagesUrl = rawObject["languages_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergeCommitMessage = rawObject["merge_commit_message"]?.let { json.decodeFromJsonElement<InlineRepositoryWebhooksTemplateRepositoryMergeCommitMessageX71740e55>(it) },
        mergeCommitTitle = rawObject["merge_commit_title"]?.let { json.decodeFromJsonElement<InlineRepositoryWebhooksTemplateRepositoryMergeCommitTitleX0c167c19>(it) },
        mergesUrl = rawObject["merges_url"]?.let { json.decodeFromJsonElement<String>(it) },
        milestonesUrl = rawObject["milestones_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mirrorUrl = rawObject["mirror_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        networkCount = rawObject["network_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        notificationsUrl = rawObject["notifications_url"]?.let { json.decodeFromJsonElement<String>(it) },
        openIssuesCount = rawObject["open_issues_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineRepositoryWebhooksTemplateRepositoryOwnerX90dcb0b7>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<InlineRepositoryWebhooksTemplateRepositoryPermissionsX8124936b>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        pullsUrl = rawObject["pulls_url"]?.let { json.decodeFromJsonElement<String>(it) },
        pushedAt = rawObject["pushed_at"]?.let { json.decodeFromJsonElement<String>(it) },
        releasesUrl = rawObject["releases_url"]?.let { json.decodeFromJsonElement<String>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        squashMergeCommitMessage = rawObject["squash_merge_commit_message"]?.let { json.decodeFromJsonElement<InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitMessageX94c138a8>(it) },
        squashMergeCommitTitle = rawObject["squash_merge_commit_title"]?.let { json.decodeFromJsonElement<InlineRepositoryWebhooksTemplateRepositorySquashMergeCommitTitleX3c912d4e>(it) },
        sshUrl = rawObject["ssh_url"]?.let { json.decodeFromJsonElement<String>(it) },
        stargazersCount = rawObject["stargazers_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        stargazersUrl = rawObject["stargazers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        statusesUrl = rawObject["statuses_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscribersCount = rawObject["subscribers_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        subscribersUrl = rawObject["subscribers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionUrl = rawObject["subscription_url"]?.let { json.decodeFromJsonElement<String>(it) },
        svnUrl = rawObject["svn_url"]?.let { json.decodeFromJsonElement<String>(it) },
        tagsUrl = rawObject["tags_url"]?.let { json.decodeFromJsonElement<String>(it) },
        teamsUrl = rawObject["teams_url"]?.let { json.decodeFromJsonElement<String>(it) },
        tempCloneToken = rawObject["temp_clone_token"]?.let { json.decodeFromJsonElement<String>(it) },
        topics = rawObject["topics"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        treesUrl = rawObject["trees_url"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        useSquashPrTitleAsDefault = rawObject["use_squash_pr_title_as_default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        visibility = rawObject["visibility"]?.let { json.decodeFromJsonElement<String>(it) },
        watchersCount = rawObject["watchers_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksTemplateRepositoryXa8335f95) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryWebhooksTemplateRepositoryXa8335f95")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowAutoMerge?.let { put("allow_auto_merge", json.encodeToJsonElement(it)) }
        value.allowMergeCommit?.let { put("allow_merge_commit", json.encodeToJsonElement(it)) }
        value.allowRebaseMerge?.let { put("allow_rebase_merge", json.encodeToJsonElement(it)) }
        value.allowSquashMerge?.let { put("allow_squash_merge", json.encodeToJsonElement(it)) }
        value.allowUpdateBranch?.let { put("allow_update_branch", json.encodeToJsonElement(it)) }
        value.archiveUrl?.let { put("archive_url", it) }
        value.archived?.let { put("archived", json.encodeToJsonElement(it)) }
        value.assigneesUrl?.let { put("assignees_url", it) }
        value.blobsUrl?.let { put("blobs_url", it) }
        value.branchesUrl?.let { put("branches_url", it) }
        value.cloneUrl?.let { put("clone_url", it) }
        value.collaboratorsUrl?.let { put("collaborators_url", it) }
        value.commentsUrl?.let { put("comments_url", it) }
        value.commitsUrl?.let { put("commits_url", it) }
        value.compareUrl?.let { put("compare_url", it) }
        value.contentsUrl?.let { put("contents_url", it) }
        value.contributorsUrl?.let { put("contributors_url", it) }
        value.createdAt?.let { put("created_at", it) }
        value.defaultBranch?.let { put("default_branch", it) }
        value.deleteBranchOnMerge?.let { put("delete_branch_on_merge", json.encodeToJsonElement(it)) }
        value.deploymentsUrl?.let { put("deployments_url", it) }
        value.description?.let { put("description", it) }
        value.disabled?.let { put("disabled", json.encodeToJsonElement(it)) }
        value.downloadsUrl?.let { put("downloads_url", it) }
        value.eventsUrl?.let { put("events_url", it) }
        value.fork?.let { put("fork", json.encodeToJsonElement(it)) }
        value.forksCount?.let { put("forks_count", json.encodeToJsonElement(it)) }
        value.forksUrl?.let { put("forks_url", it) }
        value.fullName?.let { put("full_name", it) }
        value.gitCommitsUrl?.let { put("git_commits_url", it) }
        value.gitRefsUrl?.let { put("git_refs_url", it) }
        value.gitTagsUrl?.let { put("git_tags_url", it) }
        value.gitUrl?.let { put("git_url", it) }
        value.hasDownloads?.let { put("has_downloads", json.encodeToJsonElement(it)) }
        value.hasIssues?.let { put("has_issues", json.encodeToJsonElement(it)) }
        value.hasPages?.let { put("has_pages", json.encodeToJsonElement(it)) }
        value.hasProjects?.let { put("has_projects", json.encodeToJsonElement(it)) }
        value.hasWiki?.let { put("has_wiki", json.encodeToJsonElement(it)) }
        value.homepage?.let { put("homepage", it) }
        value.hooksUrl?.let { put("hooks_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.isTemplate?.let { put("is_template", json.encodeToJsonElement(it)) }
        value.issueCommentUrl?.let { put("issue_comment_url", it) }
        value.issueEventsUrl?.let { put("issue_events_url", it) }
        value.issuesUrl?.let { put("issues_url", it) }
        value.keysUrl?.let { put("keys_url", it) }
        value.labelsUrl?.let { put("labels_url", it) }
        value.language?.let { put("language", it) }
        value.languagesUrl?.let { put("languages_url", it) }
        value.mergeCommitMessage?.let { put("merge_commit_message", json.encodeToJsonElement(it)) }
        value.mergeCommitTitle?.let { put("merge_commit_title", json.encodeToJsonElement(it)) }
        value.mergesUrl?.let { put("merges_url", it) }
        value.milestonesUrl?.let { put("milestones_url", it) }
        value.mirrorUrl?.let { put("mirror_url", it) }
        value.name?.let { put("name", it) }
        value.networkCount?.let { put("network_count", json.encodeToJsonElement(it)) }
        value.nodeId?.let { put("node_id", it) }
        value.notificationsUrl?.let { put("notifications_url", it) }
        value.openIssuesCount?.let { put("open_issues_count", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.private?.let { put("private", json.encodeToJsonElement(it)) }
        value.pullsUrl?.let { put("pulls_url", it) }
        value.pushedAt?.let { put("pushed_at", it) }
        value.releasesUrl?.let { put("releases_url", it) }
        value.size?.let { put("size", json.encodeToJsonElement(it)) }
        value.squashMergeCommitMessage?.let { put("squash_merge_commit_message", json.encodeToJsonElement(it)) }
        value.squashMergeCommitTitle?.let { put("squash_merge_commit_title", json.encodeToJsonElement(it)) }
        value.sshUrl?.let { put("ssh_url", it) }
        value.stargazersCount?.let { put("stargazers_count", json.encodeToJsonElement(it)) }
        value.stargazersUrl?.let { put("stargazers_url", it) }
        value.statusesUrl?.let { put("statuses_url", it) }
        value.subscribersCount?.let { put("subscribers_count", json.encodeToJsonElement(it)) }
        value.subscribersUrl?.let { put("subscribers_url", it) }
        value.subscriptionUrl?.let { put("subscription_url", it) }
        value.svnUrl?.let { put("svn_url", it) }
        value.tagsUrl?.let { put("tags_url", it) }
        value.teamsUrl?.let { put("teams_url", it) }
        value.tempCloneToken?.let { put("temp_clone_token", it) }
        value.topics?.let { put("topics", json.encodeToJsonElement(it)) }
        value.treesUrl?.let { put("trees_url", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.useSquashPrTitleAsDefault?.let { put("use_squash_pr_title_as_default", json.encodeToJsonElement(it)) }
        value.visibility?.let { put("visibility", it) }
        value.watchersCount?.let { put("watchers_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryWebhooksTemplateRepositoryXa8335f95(block: InlineRepositoryWebhooksTemplateRepositoryXa8335f95.Builder.() -> Unit): InlineRepositoryWebhooksTemplateRepositoryXa8335f95 = InlineRepositoryWebhooksTemplateRepositoryXa8335f95.build(block)

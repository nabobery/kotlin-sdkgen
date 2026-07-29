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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/fork-event/properties/forkee.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/fork-event/properties/forkee
 */
@Serializable(with = InlineForkEventForkeeX52e3045e.Serializer::class)
public class InlineForkEventForkeeX52e3045e(
  public val allowForking: Boolean? = null,
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
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  public val defaultBranch: String? = null,
  public val deploymentsUrl: String? = null,
  public val description: String? = null,
  public val disabled: Boolean? = null,
  public val downloadsUrl: String? = null,
  public val eventsUrl: String? = null,
  public val fork: Boolean? = null,
  public val forks: Int? = null,
  public val forksCount: Int? = null,
  public val forksUrl: String? = null,
  public val fullName: String? = null,
  public val gitCommitsUrl: String? = null,
  public val gitRefsUrl: String? = null,
  public val gitTagsUrl: String? = null,
  public val gitUrl: String? = null,
  public val hasDiscussions: Boolean? = null,
  public val hasDownloads: Boolean? = null,
  public val hasIssues: Boolean? = null,
  public val hasPages: Boolean? = null,
  public val hasProjects: Boolean? = null,
  public val hasPullRequests: Boolean? = null,
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
  public val license: NullableLicenseSimple? = null,
  public val mergesUrl: String? = null,
  public val milestonesUrl: String? = null,
  public val mirrorUrl: String? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  public val notificationsUrl: String? = null,
  public val openIssues: Int? = null,
  public val openIssuesCount: Int? = null,
  public val owner: SimpleUser? = null,
  public val `private`: Boolean? = null,
  public val `public`: Boolean? = null,
  /**
   * The policy controlling who can create pull requests: all or collaborators_only.
   */
  public val pullRequestCreationPolicy:
      InlineForkEventForkeePullRequestCreationPolicyXa57a22b0? = null,
  public val pullsUrl: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pushedAt: String? = null,
  public val releasesUrl: String? = null,
  public val size: Int? = null,
  public val sshUrl: String? = null,
  public val stargazersCount: Int? = null,
  public val stargazersUrl: String? = null,
  public val statusesUrl: String? = null,
  public val subscribersUrl: String? = null,
  public val subscriptionUrl: String? = null,
  public val svnUrl: String? = null,
  public val tagsUrl: String? = null,
  public val teamsUrl: String? = null,
  topics: List<String>? = null,
  public val treesUrl: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  public val url: String? = null,
  public val visibility: String? = null,
  public val watchers: Int? = null,
  public val watchersCount: Int? = null,
  public val webCommitSignoffRequired: Boolean? = null,
) {
  public val topics: List<String>? = topics?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var allowForking: Boolean? = null

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

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    public var defaultBranch: String? = null

    public var deploymentsUrl: String? = null

    public var description: String? = null

    public var disabled: Boolean? = null

    public var downloadsUrl: String? = null

    public var eventsUrl: String? = null

    public var fork: Boolean? = null

    public var forks: Int? = null

    public var forksCount: Int? = null

    public var forksUrl: String? = null

    public var fullName: String? = null

    public var gitCommitsUrl: String? = null

    public var gitRefsUrl: String? = null

    public var gitTagsUrl: String? = null

    public var gitUrl: String? = null

    public var hasDiscussions: Boolean? = null

    public var hasDownloads: Boolean? = null

    public var hasIssues: Boolean? = null

    public var hasPages: Boolean? = null

    public var hasProjects: Boolean? = null

    public var hasPullRequests: Boolean? = null

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

    public var license: NullableLicenseSimple? = null

    public var mergesUrl: String? = null

    public var milestonesUrl: String? = null

    public var mirrorUrl: String? = null

    public var name: String? = null

    public var nodeId: String? = null

    public var notificationsUrl: String? = null

    public var openIssues: Int? = null

    public var openIssuesCount: Int? = null

    public var owner: SimpleUser? = null

    public var `private`: Boolean? = null

    public var `public`: Boolean? = null

    /**
     * The policy controlling who can create pull requests: all or collaborators_only.
     */
    public var pullRequestCreationPolicy: InlineForkEventForkeePullRequestCreationPolicyXa57a22b0? =
        null

    public var pullsUrl: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var pushedAt: String? = null

    public var releasesUrl: String? = null

    public var size: Int? = null

    public var sshUrl: String? = null

    public var stargazersCount: Int? = null

    public var stargazersUrl: String? = null

    public var statusesUrl: String? = null

    public var subscribersUrl: String? = null

    public var subscriptionUrl: String? = null

    public var svnUrl: String? = null

    public var tagsUrl: String? = null

    public var teamsUrl: String? = null

    private var topicsValue: List<String>? = null

    public var topics: List<String>?
      get() = topicsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        topicsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var treesUrl: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public var url: String? = null

    public var visibility: String? = null

    public var watchers: Int? = null

    public var watchersCount: Int? = null

    public var webCommitSignoffRequired: Boolean? = null

    public fun build(): InlineForkEventForkeeX52e3045e = InlineForkEventForkeeX52e3045e(
      allowForking = allowForking,
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
      hasDownloads = hasDownloads,
      hasIssues = hasIssues,
      hasPages = hasPages,
      hasProjects = hasProjects,
      hasPullRequests = hasPullRequests,
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
      public = public,
      pullRequestCreationPolicy = pullRequestCreationPolicy,
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
      webCommitSignoffRequired = webCommitSignoffRequired,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineForkEventForkeeX52e3045e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineForkEventForkeeX52e3045e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineForkEventForkeeX52e3045e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineForkEventForkeeX52e3045e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineForkEventForkeeX52e3045e must be a JSON object")
      return InlineForkEventForkeeX52e3045e(
        allowForking = rawObject["allow_forking"]?.let { json.decodeFromJsonElement<Boolean>(it) },
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
        createdAt = rawObject["created_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        defaultBranch = rawObject["default_branch"]?.let { json.decodeFromJsonElement<String>(it) },
        deploymentsUrl = rawObject["deployments_url"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        disabled = rawObject["disabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        downloadsUrl = rawObject["downloads_url"]?.let { json.decodeFromJsonElement<String>(it) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        fork = rawObject["fork"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        forks = rawObject["forks"]?.let { json.decodeFromJsonElement<Int>(it) },
        forksCount = rawObject["forks_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        forksUrl = rawObject["forks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        fullName = rawObject["full_name"]?.let { json.decodeFromJsonElement<String>(it) },
        gitCommitsUrl = rawObject["git_commits_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitRefsUrl = rawObject["git_refs_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitTagsUrl = rawObject["git_tags_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitUrl = rawObject["git_url"]?.let { json.decodeFromJsonElement<String>(it) },
        hasDiscussions = rawObject["has_discussions"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasDownloads = rawObject["has_downloads"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasIssues = rawObject["has_issues"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasPages = rawObject["has_pages"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasProjects = rawObject["has_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasPullRequests = rawObject["has_pull_requests"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasWiki = rawObject["has_wiki"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        homepage = rawObject["homepage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        hooksUrl = rawObject["hooks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        isTemplate = rawObject["is_template"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        issueCommentUrl = rawObject["issue_comment_url"]?.let { json.decodeFromJsonElement<String>(it) },
        issueEventsUrl = rawObject["issue_events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        issuesUrl = rawObject["issues_url"]?.let { json.decodeFromJsonElement<String>(it) },
        keysUrl = rawObject["keys_url"]?.let { json.decodeFromJsonElement<String>(it) },
        labelsUrl = rawObject["labels_url"]?.let { json.decodeFromJsonElement<String>(it) },
        language = rawObject["language"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        languagesUrl = rawObject["languages_url"]?.let { json.decodeFromJsonElement<String>(it) },
        license = rawObject["license"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableLicenseSimple?>(element) },
        mergesUrl = rawObject["merges_url"]?.let { json.decodeFromJsonElement<String>(it) },
        milestonesUrl = rawObject["milestones_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mirrorUrl = rawObject["mirror_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        notificationsUrl = rawObject["notifications_url"]?.let { json.decodeFromJsonElement<String>(it) },
        openIssues = rawObject["open_issues"]?.let { json.decodeFromJsonElement<Int>(it) },
        openIssuesCount = rawObject["open_issues_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        public = rawObject["public"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        pullRequestCreationPolicy = rawObject["pull_request_creation_policy"]?.let { json.decodeFromJsonElement<InlineForkEventForkeePullRequestCreationPolicyXa57a22b0>(it) },
        pullsUrl = rawObject["pulls_url"]?.let { json.decodeFromJsonElement<String>(it) },
        pushedAt = rawObject["pushed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        releasesUrl = rawObject["releases_url"]?.let { json.decodeFromJsonElement<String>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        sshUrl = rawObject["ssh_url"]?.let { json.decodeFromJsonElement<String>(it) },
        stargazersCount = rawObject["stargazers_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        stargazersUrl = rawObject["stargazers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        statusesUrl = rawObject["statuses_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscribersUrl = rawObject["subscribers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionUrl = rawObject["subscription_url"]?.let { json.decodeFromJsonElement<String>(it) },
        svnUrl = rawObject["svn_url"]?.let { json.decodeFromJsonElement<String>(it) },
        tagsUrl = rawObject["tags_url"]?.let { json.decodeFromJsonElement<String>(it) },
        teamsUrl = rawObject["teams_url"]?.let { json.decodeFromJsonElement<String>(it) },
        topics = rawObject["topics"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        treesUrl = rawObject["trees_url"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        visibility = rawObject["visibility"]?.let { json.decodeFromJsonElement<String>(it) },
        watchers = rawObject["watchers"]?.let { json.decodeFromJsonElement<Int>(it) },
        watchersCount = rawObject["watchers_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        webCommitSignoffRequired = rawObject["web_commit_signoff_required"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineForkEventForkeeX52e3045e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineForkEventForkeeX52e3045e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowForking?.let { put("allow_forking", json.encodeToJsonElement(it)) }
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
        value.deploymentsUrl?.let { put("deployments_url", it) }
        value.description?.let { put("description", it) }
        value.disabled?.let { put("disabled", json.encodeToJsonElement(it)) }
        value.downloadsUrl?.let { put("downloads_url", it) }
        value.eventsUrl?.let { put("events_url", it) }
        value.fork?.let { put("fork", json.encodeToJsonElement(it)) }
        value.forks?.let { put("forks", json.encodeToJsonElement(it)) }
        value.forksCount?.let { put("forks_count", json.encodeToJsonElement(it)) }
        value.forksUrl?.let { put("forks_url", it) }
        value.fullName?.let { put("full_name", it) }
        value.gitCommitsUrl?.let { put("git_commits_url", it) }
        value.gitRefsUrl?.let { put("git_refs_url", it) }
        value.gitTagsUrl?.let { put("git_tags_url", it) }
        value.gitUrl?.let { put("git_url", it) }
        value.hasDiscussions?.let { put("has_discussions", json.encodeToJsonElement(it)) }
        value.hasDownloads?.let { put("has_downloads", json.encodeToJsonElement(it)) }
        value.hasIssues?.let { put("has_issues", json.encodeToJsonElement(it)) }
        value.hasPages?.let { put("has_pages", json.encodeToJsonElement(it)) }
        value.hasProjects?.let { put("has_projects", json.encodeToJsonElement(it)) }
        value.hasPullRequests?.let { put("has_pull_requests", json.encodeToJsonElement(it)) }
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
        value.license?.let { put("license", json.encodeToJsonElement(it)) }
        value.mergesUrl?.let { put("merges_url", it) }
        value.milestonesUrl?.let { put("milestones_url", it) }
        value.mirrorUrl?.let { put("mirror_url", it) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.notificationsUrl?.let { put("notifications_url", it) }
        value.openIssues?.let { put("open_issues", json.encodeToJsonElement(it)) }
        value.openIssuesCount?.let { put("open_issues_count", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.private?.let { put("private", json.encodeToJsonElement(it)) }
        value.public?.let { put("public", json.encodeToJsonElement(it)) }
        value.pullRequestCreationPolicy?.let { put("pull_request_creation_policy", json.encodeToJsonElement(it)) }
        value.pullsUrl?.let { put("pulls_url", it) }
        value.pushedAt?.let { put("pushed_at", it) }
        value.releasesUrl?.let { put("releases_url", it) }
        value.size?.let { put("size", json.encodeToJsonElement(it)) }
        value.sshUrl?.let { put("ssh_url", it) }
        value.stargazersCount?.let { put("stargazers_count", json.encodeToJsonElement(it)) }
        value.stargazersUrl?.let { put("stargazers_url", it) }
        value.statusesUrl?.let { put("statuses_url", it) }
        value.subscribersUrl?.let { put("subscribers_url", it) }
        value.subscriptionUrl?.let { put("subscription_url", it) }
        value.svnUrl?.let { put("svn_url", it) }
        value.tagsUrl?.let { put("tags_url", it) }
        value.teamsUrl?.let { put("teams_url", it) }
        value.topics?.let { put("topics", json.encodeToJsonElement(it)) }
        value.treesUrl?.let { put("trees_url", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.visibility?.let { put("visibility", it) }
        value.watchers?.let { put("watchers", json.encodeToJsonElement(it)) }
        value.watchersCount?.let { put("watchers_count", json.encodeToJsonElement(it)) }
        value.webCommitSignoffRequired?.let { put("web_commit_signoff_required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineForkEventForkeeX52e3045e(block: InlineForkEventForkeeX52e3045e.Builder.() -> Unit): InlineForkEventForkeeX52e3045e = InlineForkEventForkeeX52e3045e.build(block)

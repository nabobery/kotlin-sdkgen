package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/repository
 */
@Serializable(with = InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e.Serializer::class)
public class InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e(
  public val archiveUrl: String? = null,
  public val assigneesUrl: String? = null,
  public val blobsUrl: String? = null,
  public val branchesUrl: String? = null,
  public val collaboratorsUrl: String? = null,
  public val commentsUrl: String? = null,
  public val commitsUrl: String? = null,
  public val compareUrl: String? = null,
  public val contentsUrl: String? = null,
  public val contributorsUrl: String? = null,
  public val deploymentsUrl: String? = null,
  public val description: String? = null,
  public val downloadsUrl: String? = null,
  public val eventsUrl: String? = null,
  public val fork: Boolean? = null,
  public val forksUrl: String? = null,
  public val fullName: String? = null,
  public val gitCommitsUrl: String? = null,
  public val gitRefsUrl: String? = null,
  public val gitTagsUrl: String? = null,
  public val hooksUrl: String? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val issueCommentUrl: String? = null,
  public val issueEventsUrl: String? = null,
  public val issuesUrl: String? = null,
  public val keysUrl: String? = null,
  public val labelsUrl: String? = null,
  public val languagesUrl: String? = null,
  public val mergesUrl: String? = null,
  public val milestonesUrl: String? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  public val notificationsUrl: String? = null,
  public val owner:
      InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryOwnerXefac84c7? = null,
  public val `private`: Boolean? = null,
  public val pullsUrl: String? = null,
  public val releasesUrl: String? = null,
  public val stargazersUrl: String? = null,
  public val statusesUrl: String? = null,
  public val subscribersUrl: String? = null,
  public val subscriptionUrl: String? = null,
  public val tagsUrl: String? = null,
  public val teamsUrl: String? = null,
  public val treesUrl: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var archiveUrl: String? = null

    public var assigneesUrl: String? = null

    public var blobsUrl: String? = null

    public var branchesUrl: String? = null

    public var collaboratorsUrl: String? = null

    public var commentsUrl: String? = null

    public var commitsUrl: String? = null

    public var compareUrl: String? = null

    public var contentsUrl: String? = null

    public var contributorsUrl: String? = null

    public var deploymentsUrl: String? = null

    public var description: String? = null

    public var downloadsUrl: String? = null

    public var eventsUrl: String? = null

    public var fork: Boolean? = null

    public var forksUrl: String? = null

    public var fullName: String? = null

    public var gitCommitsUrl: String? = null

    public var gitRefsUrl: String? = null

    public var gitTagsUrl: String? = null

    public var hooksUrl: String? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var issueCommentUrl: String? = null

    public var issueEventsUrl: String? = null

    public var issuesUrl: String? = null

    public var keysUrl: String? = null

    public var labelsUrl: String? = null

    public var languagesUrl: String? = null

    public var mergesUrl: String? = null

    public var milestonesUrl: String? = null

    public var name: String? = null

    public var nodeId: String? = null

    public var notificationsUrl: String? = null

    public var owner: InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryOwnerXefac84c7? =
        null

    public var `private`: Boolean? = null

    public var pullsUrl: String? = null

    public var releasesUrl: String? = null

    public var stargazersUrl: String? = null

    public var statusesUrl: String? = null

    public var subscribersUrl: String? = null

    public var subscriptionUrl: String? = null

    public var tagsUrl: String? = null

    public var teamsUrl: String? = null

    public var treesUrl: String? = null

    public var url: String? = null

    public fun build(): InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e = InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e(
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
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e must be a JSON object")
      return InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e(
        archiveUrl = rawObject["archive_url"]?.let { json.decodeFromJsonElement<String>(it) },
        assigneesUrl = rawObject["assignees_url"]?.let { json.decodeFromJsonElement<String>(it) },
        blobsUrl = rawObject["blobs_url"]?.let { json.decodeFromJsonElement<String>(it) },
        branchesUrl = rawObject["branches_url"]?.let { json.decodeFromJsonElement<String>(it) },
        collaboratorsUrl = rawObject["collaborators_url"]?.let { json.decodeFromJsonElement<String>(it) },
        commentsUrl = rawObject["comments_url"]?.let { json.decodeFromJsonElement<String>(it) },
        commitsUrl = rawObject["commits_url"]?.let { json.decodeFromJsonElement<String>(it) },
        compareUrl = rawObject["compare_url"]?.let { json.decodeFromJsonElement<String>(it) },
        contentsUrl = rawObject["contents_url"]?.let { json.decodeFromJsonElement<String>(it) },
        contributorsUrl = rawObject["contributors_url"]?.let { json.decodeFromJsonElement<String>(it) },
        deploymentsUrl = rawObject["deployments_url"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        downloadsUrl = rawObject["downloads_url"]?.let { json.decodeFromJsonElement<String>(it) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        fork = rawObject["fork"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        forksUrl = rawObject["forks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        fullName = rawObject["full_name"]?.let { json.decodeFromJsonElement<String>(it) },
        gitCommitsUrl = rawObject["git_commits_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitRefsUrl = rawObject["git_refs_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitTagsUrl = rawObject["git_tags_url"]?.let { json.decodeFromJsonElement<String>(it) },
        hooksUrl = rawObject["hooks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        issueCommentUrl = rawObject["issue_comment_url"]?.let { json.decodeFromJsonElement<String>(it) },
        issueEventsUrl = rawObject["issue_events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        issuesUrl = rawObject["issues_url"]?.let { json.decodeFromJsonElement<String>(it) },
        keysUrl = rawObject["keys_url"]?.let { json.decodeFromJsonElement<String>(it) },
        labelsUrl = rawObject["labels_url"]?.let { json.decodeFromJsonElement<String>(it) },
        languagesUrl = rawObject["languages_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergesUrl = rawObject["merges_url"]?.let { json.decodeFromJsonElement<String>(it) },
        milestonesUrl = rawObject["milestones_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        notificationsUrl = rawObject["notifications_url"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryOwnerXefac84c7>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        pullsUrl = rawObject["pulls_url"]?.let { json.decodeFromJsonElement<String>(it) },
        releasesUrl = rawObject["releases_url"]?.let { json.decodeFromJsonElement<String>(it) },
        stargazersUrl = rawObject["stargazers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        statusesUrl = rawObject["statuses_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscribersUrl = rawObject["subscribers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionUrl = rawObject["subscription_url"]?.let { json.decodeFromJsonElement<String>(it) },
        tagsUrl = rawObject["tags_url"]?.let { json.decodeFromJsonElement<String>(it) },
        teamsUrl = rawObject["teams_url"]?.let { json.decodeFromJsonElement<String>(it) },
        treesUrl = rawObject["trees_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.archiveUrl?.let { put("archive_url", it) }
        value.assigneesUrl?.let { put("assignees_url", it) }
        value.blobsUrl?.let { put("blobs_url", it) }
        value.branchesUrl?.let { put("branches_url", it) }
        value.collaboratorsUrl?.let { put("collaborators_url", it) }
        value.commentsUrl?.let { put("comments_url", it) }
        value.commitsUrl?.let { put("commits_url", it) }
        value.compareUrl?.let { put("compare_url", it) }
        value.contentsUrl?.let { put("contents_url", it) }
        value.contributorsUrl?.let { put("contributors_url", it) }
        value.deploymentsUrl?.let { put("deployments_url", it) }
        value.description?.let { put("description", it) }
        value.downloadsUrl?.let { put("downloads_url", it) }
        value.eventsUrl?.let { put("events_url", it) }
        value.fork?.let { put("fork", json.encodeToJsonElement(it)) }
        value.forksUrl?.let { put("forks_url", it) }
        value.fullName?.let { put("full_name", it) }
        value.gitCommitsUrl?.let { put("git_commits_url", it) }
        value.gitRefsUrl?.let { put("git_refs_url", it) }
        value.gitTagsUrl?.let { put("git_tags_url", it) }
        value.hooksUrl?.let { put("hooks_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.issueCommentUrl?.let { put("issue_comment_url", it) }
        value.issueEventsUrl?.let { put("issue_events_url", it) }
        value.issuesUrl?.let { put("issues_url", it) }
        value.keysUrl?.let { put("keys_url", it) }
        value.labelsUrl?.let { put("labels_url", it) }
        value.languagesUrl?.let { put("languages_url", it) }
        value.mergesUrl?.let { put("merges_url", it) }
        value.milestonesUrl?.let { put("milestones_url", it) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.notificationsUrl?.let { put("notifications_url", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.private?.let { put("private", json.encodeToJsonElement(it)) }
        value.pullsUrl?.let { put("pulls_url", it) }
        value.releasesUrl?.let { put("releases_url", it) }
        value.stargazersUrl?.let { put("stargazers_url", it) }
        value.statusesUrl?.let { put("statuses_url", it) }
        value.subscribersUrl?.let { put("subscribers_url", it) }
        value.subscriptionUrl?.let { put("subscription_url", it) }
        value.tagsUrl?.let { put("tags_url", it) }
        value.teamsUrl?.let { put("teams_url", it) }
        value.treesUrl?.let { put("trees_url", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e(block: InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e.Builder.() -> Unit): InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e = InlineWebhookDeploymentReviewRejectedWorkflowRunRepositoryX274a301e.build(block)

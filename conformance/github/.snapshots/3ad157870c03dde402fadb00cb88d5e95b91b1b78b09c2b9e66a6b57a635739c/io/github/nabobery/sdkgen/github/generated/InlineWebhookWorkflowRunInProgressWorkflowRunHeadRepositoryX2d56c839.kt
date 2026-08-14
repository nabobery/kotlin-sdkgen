package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * head_repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * head_repository
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839.Serializer::class)
public class InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839(
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val archiveUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val assigneesUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val blobsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val branchesUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val collaboratorsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commitsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val compareUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
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
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gitCommitsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gitRefsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gitTagsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val hooksUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the repository
   */
  public val id: Int,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueCommentUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueEventsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issuesUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val keysUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val labelsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val languagesUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val mergesUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val milestonesUrl: String,
  /**
   * The name of the repository.
   */
  public val name: String?,
  public val nodeId: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val notificationsUrl: String,
  public val owner: InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerX8cd9bc42?,
  /**
   * Whether the repository is private or public.
   */
  public val `private`: Boolean,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullsUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val releasesUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val stargazersUrl: String,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
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
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val treesUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
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

    private var idValue: Int? = null

    public var id: Int
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

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * The name of the repository.
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var ownerState:
        FieldState<InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerX8cd9bc42?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var owner: InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerX8cd9bc42?
      get() = ownerState.valueOrNull()
      set(`value`) {
        ownerState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 {
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
      check(nodeIdValue != null) { "nodeId is required" }
      check(notificationsUrlValue != null) { "notificationsUrl is required" }
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
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      check(ownerState !== FieldState.Absent) { "owner is required, even when null" }
      return InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839(
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
        name = nameState.valueOrNull(),
        nodeId = nodeId,
        notificationsUrl = notificationsUrl,
        owner = ownerState.valueOrNull(),
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
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 must be a JSON object")
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
      val id = json.decodeRequired<Int>(rawObject, "id")
      val issueCommentUrl = json.decodeRequired<String>(rawObject, "issue_comment_url")
      val issueEventsUrl = json.decodeRequired<String>(rawObject, "issue_events_url")
      val issuesUrl = json.decodeRequired<String>(rawObject, "issues_url")
      val keysUrl = json.decodeRequired<String>(rawObject, "keys_url")
      val labelsUrl = json.decodeRequired<String>(rawObject, "labels_url")
      val languagesUrl = json.decodeRequired<String>(rawObject, "languages_url")
      val mergesUrl = json.decodeRequired<String>(rawObject, "merges_url")
      val milestonesUrl = json.decodeRequired<String>(rawObject, "milestones_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val notificationsUrl = json.decodeRequired<String>(rawObject, "notifications_url")
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
        throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("name")) {
        throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("owner")) {
        throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 is missing required property 'owner'")
      }
      val owner = rawObject["owner"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryOwnerX8cd9bc42?>(requireNotNull(element)) }
      return InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839")
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
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("notifications_url", value.notificationsUrl)
        put("owner", value.owner?.let { json.encodeToJsonElement(it) } ?: JsonNull)
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
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839(block: InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839.Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 = InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryX2d56c839 property '" + name + "' is not nullable")
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

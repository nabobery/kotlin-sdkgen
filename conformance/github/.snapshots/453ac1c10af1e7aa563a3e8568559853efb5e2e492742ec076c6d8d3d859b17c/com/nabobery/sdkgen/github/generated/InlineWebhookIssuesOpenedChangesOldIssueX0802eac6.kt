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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssueX0802eac6.Serializer::class)
public class InlineWebhookIssuesOpenedChangesOldIssueX0802eac6(
  public val id: Long,
  public val number: Int,
  public val activeLockReason:
      InlineWebhookIssuesOpenedChangesOldIssueActiveLockReasonXf523b14e? = null,
  public val assignee: InlineWebhookIssuesOpenedChangesOldIssueAssigneeXbed6bf6a? = null,
  assignees: List<InlineWebhookIssuesOpenedChangesOldIssueAssigneesItemXa5c9a4e5?>? = null,
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation:
      InlineWebhookIssuesOpenedChangesOldIssueAuthorAssociationX7007efcf? = null,
  /**
   * Contents of the issue
   */
  public val body: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val closedAt: String? = null,
  public val comments: Int? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commentsUrl: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  public val draft: Boolean? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val eventsUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  public val issueDependenciesSummary: IssueDependenciesSummary? = null,
  issueFieldValues: List<IssueFieldValue>? = null,
  labels: List<InlineWebhookIssuesOpenedChangesOldIssueLabelsItemXf9fe2a89>? = null,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val labelsUrl: String? = null,
  public val locked: Boolean? = null,
  /**
   * A collection of related issues and pull requests.
   */
  public val milestone: InlineWebhookIssuesOpenedChangesOldIssueMilestoneXd2fda449? = null,
  public val nodeId: String? = null,
  /**
   * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
   * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
   * first class actors within GitHub.
   */
  public val performedViaGithubApp:
      InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppX520b181e? = null,
  public val pinnedComment: NullableIssueComment? = null,
  public val pullRequest: InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6? = null,
  public val reactions: InlineWebhookIssuesOpenedChangesOldIssueReactionsXe25bab01? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String? = null,
  /**
   * State of the issue; either 'open' or 'closed'
   */
  public val state: InlineWebhookIssuesOpenedChangesOldIssueStateX3f73d815? = null,
  public val stateReason: String? = null,
  public val subIssuesSummary: SubIssuesSummary? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val timelineUrl: String? = null,
  /**
   * Title of the issue
   */
  public val title: String? = null,
  public val type: IssueType? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  /**
   * URL for the issue
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
  public val user: InlineWebhookIssuesOpenedChangesOldIssueUserX80fc3c2c? = null,
) {
  public val assignees: List<InlineWebhookIssuesOpenedChangesOldIssueAssigneesItemXa5c9a4e5?>? =
      assignees?.let { collection0 -> collection0.toList() }

  public val issueFieldValues: List<IssueFieldValue>? =
      issueFieldValues?.let { collection0 -> collection0.toList() }

  public val labels: List<InlineWebhookIssuesOpenedChangesOldIssueLabelsItemXf9fe2a89>? =
      labels?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    public var activeLockReason: InlineWebhookIssuesOpenedChangesOldIssueActiveLockReasonXf523b14e?
        = null

    public var assignee: InlineWebhookIssuesOpenedChangesOldIssueAssigneeXbed6bf6a? = null

    private var assigneesValue:
        List<InlineWebhookIssuesOpenedChangesOldIssueAssigneesItemXa5c9a4e5?>? = null

    public var assignees: List<InlineWebhookIssuesOpenedChangesOldIssueAssigneesItemXa5c9a4e5?>?
      get() = assigneesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        assigneesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * How the author is associated with the repository.
     */
    public var authorAssociation:
        InlineWebhookIssuesOpenedChangesOldIssueAuthorAssociationX7007efcf? = null

    /**
     * Contents of the issue
     */
    public var body: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var closedAt: String? = null

    public var comments: Int? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var commentsUrl: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    public var draft: Boolean? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var eventsUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public var issueDependenciesSummary: IssueDependenciesSummary? = null

    private var issueFieldValuesValue: List<IssueFieldValue>? = null

    public var issueFieldValues: List<IssueFieldValue>?
      get() = issueFieldValuesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        issueFieldValuesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var labelsValue: List<InlineWebhookIssuesOpenedChangesOldIssueLabelsItemXf9fe2a89>? =
        null

    public var labels: List<InlineWebhookIssuesOpenedChangesOldIssueLabelsItemXf9fe2a89>?
      get() = labelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        labelsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var labelsUrl: String? = null

    public var locked: Boolean? = null

    /**
     * A collection of related issues and pull requests.
     */
    public var milestone: InlineWebhookIssuesOpenedChangesOldIssueMilestoneXd2fda449? = null

    public var nodeId: String? = null

    /**
     * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
     * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps
     * are first class actors within GitHub.
     */
    public var performedViaGithubApp:
        InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppX520b181e? = null

    public var pinnedComment: NullableIssueComment? = null

    public var pullRequest: InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6? = null

    public var reactions: InlineWebhookIssuesOpenedChangesOldIssueReactionsXe25bab01? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var repositoryUrl: String? = null

    /**
     * State of the issue; either 'open' or 'closed'
     */
    public var state: InlineWebhookIssuesOpenedChangesOldIssueStateX3f73d815? = null

    public var stateReason: String? = null

    public var subIssuesSummary: SubIssuesSummary? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var timelineUrl: String? = null

    /**
     * Title of the issue
     */
    public var title: String? = null

    public var type: IssueType? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    /**
     * URL for the issue
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public var user: InlineWebhookIssuesOpenedChangesOldIssueUserX80fc3c2c? = null

    public fun build(): InlineWebhookIssuesOpenedChangesOldIssueX0802eac6 {
      check(idValue != null) { "id is required" }
      check(numberValue != null) { "number is required" }
      return InlineWebhookIssuesOpenedChangesOldIssueX0802eac6(
        id = id,
        number = number,
        activeLockReason = activeLockReason,
        assignee = assignee,
        assignees = assignees,
        authorAssociation = authorAssociation,
        body = body,
        closedAt = closedAt,
        comments = comments,
        commentsUrl = commentsUrl,
        createdAt = createdAt,
        draft = draft,
        eventsUrl = eventsUrl,
        htmlUrl = htmlUrl,
        issueDependenciesSummary = issueDependenciesSummary,
        issueFieldValues = issueFieldValues,
        labels = labels,
        labelsUrl = labelsUrl,
        locked = locked,
        milestone = milestone,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubApp,
        pinnedComment = pinnedComment,
        pullRequest = pullRequest,
        reactions = reactions,
        repositoryUrl = repositoryUrl,
        state = state,
        stateReason = stateReason,
        subIssuesSummary = subIssuesSummary,
        timelineUrl = timelineUrl,
        title = title,
        type = type,
        updatedAt = updatedAt,
        url = url,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesOpenedChangesOldIssueX0802eac6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssueX0802eac6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssueX0802eac6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesOpenedChangesOldIssueX0802eac6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesOpenedChangesOldIssueX0802eac6 must be a JSON object")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      return InlineWebhookIssuesOpenedChangesOldIssueX0802eac6(
        id = id,
        number = number,
        activeLockReason = rawObject["active_lock_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueActiveLockReasonXf523b14e?>(element) },
        assignee = rawObject["assignee"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueAssigneeXbed6bf6a?>(element) },
        assignees = rawObject["assignees"]?.let { json.decodeFromJsonElement<List<InlineWebhookIssuesOpenedChangesOldIssueAssigneesItemXa5c9a4e5?>>(it) },
        authorAssociation = rawObject["author_association"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueAuthorAssociationX7007efcf>(it) },
        body = rawObject["body"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        closedAt = rawObject["closed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        comments = rawObject["comments"]?.let { json.decodeFromJsonElement<Int>(it) },
        commentsUrl = rawObject["comments_url"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        draft = rawObject["draft"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        issueDependenciesSummary = rawObject["issue_dependencies_summary"]?.let { json.decodeFromJsonElement<IssueDependenciesSummary>(it) },
        issueFieldValues = rawObject["issue_field_values"]?.let { json.decodeFromJsonElement<List<IssueFieldValue>>(it) },
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<InlineWebhookIssuesOpenedChangesOldIssueLabelsItemXf9fe2a89>>(it) },
        labelsUrl = rawObject["labels_url"]?.let { json.decodeFromJsonElement<String>(it) },
        locked = rawObject["locked"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        milestone = rawObject["milestone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueMilestoneXd2fda449?>(element) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        performedViaGithubApp = rawObject["performed_via_github_app"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePerformedViaGithubAppX520b181e?>(element) },
        pinnedComment = rawObject["pinned_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIssueComment?>(element) },
        pullRequest = rawObject["pull_request"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6>(it) },
        reactions = rawObject["reactions"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueReactionsXe25bab01>(it) },
        repositoryUrl = rawObject["repository_url"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueStateX3f73d815>(it) },
        stateReason = rawObject["state_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        subIssuesSummary = rawObject["sub_issues_summary"]?.let { json.decodeFromJsonElement<SubIssuesSummary>(it) },
        timelineUrl = rawObject["timeline_url"]?.let { json.decodeFromJsonElement<String>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<IssueType?>(element) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueUserX80fc3c2c?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssueX0802eac6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesOpenedChangesOldIssueX0802eac6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("number", json.encodeToJsonElement(value.number))
        value.activeLockReason?.let { put("active_lock_reason", json.encodeToJsonElement(it)) }
        value.assignee?.let { put("assignee", json.encodeToJsonElement(it)) }
        value.assignees?.let { put("assignees", json.encodeToJsonElement(it)) }
        value.authorAssociation?.let { put("author_association", json.encodeToJsonElement(it)) }
        value.body?.let { put("body", it) }
        value.closedAt?.let { put("closed_at", it) }
        value.comments?.let { put("comments", json.encodeToJsonElement(it)) }
        value.commentsUrl?.let { put("comments_url", it) }
        value.createdAt?.let { put("created_at", it) }
        value.draft?.let { put("draft", json.encodeToJsonElement(it)) }
        value.eventsUrl?.let { put("events_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.issueDependenciesSummary?.let { put("issue_dependencies_summary", json.encodeToJsonElement(it)) }
        value.issueFieldValues?.let { put("issue_field_values", json.encodeToJsonElement(it)) }
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
        value.labelsUrl?.let { put("labels_url", it) }
        value.locked?.let { put("locked", json.encodeToJsonElement(it)) }
        value.milestone?.let { put("milestone", json.encodeToJsonElement(it)) }
        value.nodeId?.let { put("node_id", it) }
        value.performedViaGithubApp?.let { put("performed_via_github_app", json.encodeToJsonElement(it)) }
        value.pinnedComment?.let { put("pinned_comment", json.encodeToJsonElement(it)) }
        value.pullRequest?.let { put("pull_request", json.encodeToJsonElement(it)) }
        value.reactions?.let { put("reactions", json.encodeToJsonElement(it)) }
        value.repositoryUrl?.let { put("repository_url", it) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
        value.stateReason?.let { put("state_reason", it) }
        value.subIssuesSummary?.let { put("sub_issues_summary", json.encodeToJsonElement(it)) }
        value.timelineUrl?.let { put("timeline_url", it) }
        value.title?.let { put("title", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesOpenedChangesOldIssueX0802eac6(block: InlineWebhookIssuesOpenedChangesOldIssueX0802eac6.Builder.() -> Unit): InlineWebhookIssuesOpenedChangesOldIssueX0802eac6 = InlineWebhookIssuesOpenedChangesOldIssueX0802eac6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesOpenedChangesOldIssueX0802eac6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * A collection of related issues and pull requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/milestone
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380.Serializer::class)
public class InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380(
  public val closedAt: String?,
  public val closedIssues: Int,
  public val createdAt: String,
  public val creator: InlineWebhookPullRequestReffb1OneOf1PullRequestMilestoneCreatorX2bb48cf8?,
  public val description: String?,
  public val dueOn: String?,
  public val htmlUrl: String,
  public val id: Int,
  public val labelsUrl: String,
  public val nodeId: String,
  /**
   * The number of the milestone.
   */
  public val number: Int,
  public val openIssues: Int,
  /**
   * The state of the milestone.
   */
  public val state: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc,
  /**
   * The title of the milestone.
   */
  public val title: String,
  public val updatedAt: String,
  public val url: String,
) {
  public class Builder {
    private var closedIssuesValue: Int? = null

    public var closedIssues: Int
      get() = requireNotNull(closedIssuesValue) { "closedIssues is required" }
      set(`value`) {
        closedIssuesValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
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

    private var labelsUrlValue: String? = null

    public var labelsUrl: String
      get() = requireNotNull(labelsUrlValue) { "labelsUrl is required" }
      set(`value`) {
        labelsUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var openIssuesValue: Int? = null

    public var openIssues: Int
      get() = requireNotNull(openIssuesValue) { "openIssues is required" }
      set(`value`) {
        openIssuesValue = value
      }

    private var stateValue:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc? = null

    public var state:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
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

    private var closedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var closedAt: String?
      get() = closedAtState.valueOrNull()
      set(`value`) {
        closedAtState = value.toNullableFieldState()
      }

    private var creatorState:
        FieldState<InlineWebhookPullRequestReffb1OneOf1PullRequestMilestoneCreatorX2bb48cf8?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var creator: InlineWebhookPullRequestReffb1OneOf1PullRequestMilestoneCreatorX2bb48cf8?
      get() = creatorState.valueOrNull()
      set(`value`) {
        creatorState = value.toNullableFieldState()
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

    private var dueOnState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var dueOn: String?
      get() = dueOnState.valueOrNull()
      set(`value`) {
        dueOnState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 {
      check(closedIssuesValue != null) { "closedIssues is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(labelsUrlValue != null) { "labelsUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(openIssuesValue != null) { "openIssues is required" }
      check(stateValue != null) { "state is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(closedAtState !== FieldState.Absent) { "closedAt is required, even when null" }
      check(creatorState !== FieldState.Absent) { "creator is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(dueOnState !== FieldState.Absent) { "dueOn is required, even when null" }
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380(
        closedAt = closedAtState.valueOrNull(),
        closedIssues = closedIssues,
        createdAt = createdAt,
        creator = creatorState.valueOrNull(),
        description = descriptionState.valueOrNull(),
        dueOn = dueOnState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        labelsUrl = labelsUrl,
        nodeId = nodeId,
        number = number,
        openIssues = openIssues,
        state = state,
        title = title,
        updatedAt = updatedAt,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 must be a JSON object")
      val closedIssues = json.decodeRequired<Int>(rawObject, "closed_issues")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val labelsUrl = json.decodeRequired<String>(rawObject, "labels_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val openIssues = json.decodeRequired<Int>(rawObject, "open_issues")
      val state = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneStateXccfc7dfc>(rawObject, "state")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("closed_at")) {
        throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 is missing required property 'closed_at'")
      }
      val closedAt = rawObject["closed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("creator")) {
        throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 is missing required property 'creator'")
      }
      val creator = rawObject["creator"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReffb1OneOf1PullRequestMilestoneCreatorX2bb48cf8?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("due_on")) {
        throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 is missing required property 'due_on'")
      }
      val dueOn = rawObject["due_on"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380(
        closedAt = closedAt,
        closedIssues = closedIssues,
        createdAt = createdAt,
        creator = creator,
        description = description,
        dueOn = dueOn,
        htmlUrl = htmlUrl,
        id = id,
        labelsUrl = labelsUrl,
        nodeId = nodeId,
        number = number,
        openIssues = openIssues,
        state = state,
        title = title,
        updatedAt = updatedAt,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("closed_at", value.closedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("closed_issues", json.encodeToJsonElement(value.closedIssues))
        put("created_at", value.createdAt)
        put("creator", value.creator?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("due_on", value.dueOn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("labels_url", value.labelsUrl)
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("open_issues", json.encodeToJsonElement(value.openIssues))
        put("state", json.encodeToJsonElement(value.state))
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380(block: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestMilestoneX4cea9380 property '" + name + "' is not nullable")
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

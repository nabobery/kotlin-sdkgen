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
 * A Discussion in a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/discussion
 */
@Serializable(with = Discussion.Serializer::class)
public class Discussion internal constructor(
  public val activeLockReason: String?,
  public val answerChosenAt: String?,
  public val answerChosenBy: InlineDiscussionAnswerChosenByXf6dfe0da?,
  public val answerHtmlUrl: String?,
  public val body: String,
  public val category: InlineDiscussionCategoryX70c0bc24,
  public val comments: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val htmlUrl: String,
  public val id: Int,
  public val locked: Boolean,
  public val nodeId: String,
  public val number: Int,
  public val repositoryUrl: String,
  /**
   * The current state of the discussion.
   * `converting` means that the discussion is being converted from an issue.
   * `transferring` means that the discussion is being transferred from another repository.
   */
  public val state: InlineDiscussionStateX18cb31c0,
  /**
   * The reason for the current state
   */
  public val stateReason: InlineDiscussionStateReasonX8c6522bd?,
  public val title: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  public val user: InlineDiscussionUserXa642f34f?,
  private val authorAssociationState: FieldState<InlineDiscussionAuthorAssociationXda638118>,
  labelsState: FieldState<List<Label>>,
  private val reactionsState: FieldState<InlineDiscussionReactionsX5076693c>,
  private val timelineUrlState: FieldState<String>,
) {
  private val labelsState: FieldState<List<Label>> =
      labelsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation: InlineDiscussionAuthorAssociationXda638118?
    get() = authorAssociationState.valueOrNull()

  public val labels: List<Label>?
    get() = labelsState.valueOrNull()

  public val reactions: InlineDiscussionReactionsX5076693c?
    get() = reactionsState.valueOrNull()

  public val timelineUrl: String?
    get() = timelineUrlState.valueOrNull()

  public constructor(
    activeLockReason: String?,
    answerChosenAt: String?,
    answerChosenBy: InlineDiscussionAnswerChosenByXf6dfe0da?,
    answerHtmlUrl: String?,
    body: String,
    category: InlineDiscussionCategoryX70c0bc24,
    comments: Int,
    createdAt: String,
    htmlUrl: String,
    id: Int,
    locked: Boolean,
    nodeId: String,
    number: Int,
    repositoryUrl: String,
    state: InlineDiscussionStateX18cb31c0,
    stateReason: InlineDiscussionStateReasonX8c6522bd?,
    title: String,
    updatedAt: String,
    user: InlineDiscussionUserXa642f34f?,
  ) : this(activeLockReason = activeLockReason,
  answerChosenAt = answerChosenAt,
  answerChosenBy = answerChosenBy,
  answerHtmlUrl = answerHtmlUrl,
  body = body,
  category = category,
  comments = comments,
  createdAt = createdAt,
  htmlUrl = htmlUrl,
  id = id,
  locked = locked,
  nodeId = nodeId,
  number = number,
  repositoryUrl = repositoryUrl,
  state = state,
  stateReason = stateReason,
  title = title,
  updatedAt = updatedAt,
  user = user,
  authorAssociationState = FieldState.Absent,
  labelsState = FieldState.Absent,
  reactionsState = FieldState.Absent,
  timelineUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `author_association`.
   */
  public fun authorAssociationPresence(): FieldPresence = authorAssociationState.presence

  /**
   * Returns the wire presence of `labels`.
   */
  public fun labelsPresence(): FieldPresence = labelsState.presence

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  /**
   * Returns the wire presence of `timeline_url`.
   */
  public fun timelineUrlPresence(): FieldPresence = timelineUrlState.presence

  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var categoryValue: InlineDiscussionCategoryX70c0bc24? = null

    public var category: InlineDiscussionCategoryX70c0bc24
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    private var commentsValue: Int? = null

    public var comments: Int
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
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

    private var lockedValue: Boolean? = null

    public var locked: Boolean
      get() = requireNotNull(lockedValue) { "locked is required" }
      set(`value`) {
        lockedValue = value
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

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var stateValue: InlineDiscussionStateX18cb31c0? = null

    public var state: InlineDiscussionStateX18cb31c0
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

    private var activeLockReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var activeLockReason: String?
      get() = activeLockReasonState.valueOrNull()
      set(`value`) {
        activeLockReasonState = value.toNullableFieldState()
      }

    private var answerChosenAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var answerChosenAt: String?
      get() = answerChosenAtState.valueOrNull()
      set(`value`) {
        answerChosenAtState = value.toNullableFieldState()
      }

    private var answerChosenByState: FieldState<InlineDiscussionAnswerChosenByXf6dfe0da?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var answerChosenBy: InlineDiscussionAnswerChosenByXf6dfe0da?
      get() = answerChosenByState.valueOrNull()
      set(`value`) {
        answerChosenByState = value.toNullableFieldState()
      }

    private var answerHtmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var answerHtmlUrl: String?
      get() = answerHtmlUrlState.valueOrNull()
      set(`value`) {
        answerHtmlUrlState = value.toNullableFieldState()
      }

    private var stateReasonState: FieldState<InlineDiscussionStateReasonX8c6522bd?> =
        FieldState.Absent

    /**
     * The reason for the current state
     * Required nullable field; assigning `null` records present-null.
     */
    public var stateReason: InlineDiscussionStateReasonX8c6522bd?
      get() = stateReasonState.valueOrNull()
      set(`value`) {
        stateReasonState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineDiscussionUserXa642f34f?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineDiscussionUserXa642f34f?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var authorAssociationState: FieldState<InlineDiscussionAuthorAssociationXda638118> =
        FieldState.Absent

    /**
     * How the author is associated with the repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var authorAssociation: InlineDiscussionAuthorAssociationXda638118?
      get() = authorAssociationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "authorAssociation is not nullable; call unsetAuthorAssociation() to omit it" }
        authorAssociationState = FieldState.Value(present)
      }

    private var labelsState: FieldState<List<Label>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var labels: List<Label>?
      get() = labelsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "labels is not nullable; call unsetLabels() to omit it" }
        labelsState = FieldState.Value(present.toList())
      }

    private var reactionsState: FieldState<InlineDiscussionReactionsX5076693c> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: InlineDiscussionReactionsX5076693c?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    private var timelineUrlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var timelineUrl: String?
      get() = timelineUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "timelineUrl is not nullable; call unsetTimelineUrl() to omit it" }
        timelineUrlState = FieldState.Value(present)
      }

    /**
     * Omits `author_association` from serialized output.
     */
    public fun unsetAuthorAssociation() {
      authorAssociationState = FieldState.Absent
    }

    /**
     * Omits `labels` from serialized output.
     */
    public fun unsetLabels() {
      labelsState = FieldState.Absent
    }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    /**
     * Omits `timeline_url` from serialized output.
     */
    public fun unsetTimelineUrl() {
      timelineUrlState = FieldState.Absent
    }

    public fun build(): Discussion {
      check(bodyValue != null) { "body is required" }
      check(categoryValue != null) { "category is required" }
      check(commentsValue != null) { "comments is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(lockedValue != null) { "locked is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(numberValue != null) { "number is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(stateValue != null) { "state is required" }
      check(titleValue != null) { "title is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(activeLockReasonState !== FieldState.Absent) { "activeLockReason is required, even when null" }
      check(answerChosenAtState !== FieldState.Absent) { "answerChosenAt is required, even when null" }
      check(answerChosenByState !== FieldState.Absent) { "answerChosenBy is required, even when null" }
      check(answerHtmlUrlState !== FieldState.Absent) { "answerHtmlUrl is required, even when null" }
      check(stateReasonState !== FieldState.Absent) { "stateReason is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return Discussion(
        activeLockReason = activeLockReasonState.valueOrNull(),
        answerChosenAt = answerChosenAtState.valueOrNull(),
        answerChosenBy = answerChosenByState.valueOrNull(),
        answerHtmlUrl = answerHtmlUrlState.valueOrNull(),
        body = body,
        category = category,
        comments = comments,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        locked = locked,
        nodeId = nodeId,
        number = number,
        repositoryUrl = repositoryUrl,
        state = state,
        stateReason = stateReasonState.valueOrNull(),
        title = title,
        updatedAt = updatedAt,
        user = userState.valueOrNull(),
        authorAssociationState = authorAssociationState,
        labelsState = labelsState,
        reactionsState = reactionsState,
        timelineUrlState = timelineUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Discussion = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Discussion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Discussion {
      val jsonDecoder = decoder.requireJsonDecoder("Discussion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Discussion must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val category = json.decodeRequired<InlineDiscussionCategoryX70c0bc24>(rawObject, "category")
      val comments = json.decodeRequired<Int>(rawObject, "comments")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val locked = json.decodeRequired<Boolean>(rawObject, "locked")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val state = json.decodeRequired<InlineDiscussionStateX18cb31c0>(rawObject, "state")
      val title = json.decodeRequired<String>(rawObject, "title")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("active_lock_reason")) {
        throw SerializationException("Discussion is missing required property 'active_lock_reason'")
      }
      val activeLockReason = rawObject["active_lock_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("answer_chosen_at")) {
        throw SerializationException("Discussion is missing required property 'answer_chosen_at'")
      }
      val answerChosenAt = rawObject["answer_chosen_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("answer_chosen_by")) {
        throw SerializationException("Discussion is missing required property 'answer_chosen_by'")
      }
      val answerChosenBy = rawObject["answer_chosen_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDiscussionAnswerChosenByXf6dfe0da?>(requireNotNull(element)) }
      if (!rawObject.containsKey("answer_html_url")) {
        throw SerializationException("Discussion is missing required property 'answer_html_url'")
      }
      val answerHtmlUrl = rawObject["answer_html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("state_reason")) {
        throw SerializationException("Discussion is missing required property 'state_reason'")
      }
      val stateReason = rawObject["state_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDiscussionStateReasonX8c6522bd?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("Discussion is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDiscussionUserXa642f34f?>(requireNotNull(element)) }
      return Discussion(
        activeLockReason = activeLockReason,
        answerChosenAt = answerChosenAt,
        answerChosenBy = answerChosenBy,
        answerHtmlUrl = answerHtmlUrl,
        body = body,
        category = category,
        comments = comments,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        locked = locked,
        nodeId = nodeId,
        number = number,
        repositoryUrl = repositoryUrl,
        state = state,
        stateReason = stateReason,
        title = title,
        updatedAt = updatedAt,
        user = user,
        authorAssociationState = json.decodeOptional(rawObject, "author_association", nullable = false),
        labelsState = json.decodeOptional(rawObject, "labels", nullable = false),
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
        timelineUrlState = json.decodeOptional(rawObject, "timeline_url", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Discussion) {
      val jsonEncoder = encoder.requireJsonEncoder("Discussion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active_lock_reason", value.activeLockReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("answer_chosen_at", value.answerChosenAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("answer_chosen_by", value.answerChosenBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("answer_html_url", value.answerHtmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("body", value.body)
        put("category", json.encodeToJsonElement(value.category))
        put("comments", json.encodeToJsonElement(value.comments))
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("locked", json.encodeToJsonElement(value.locked))
        put("node_id", value.nodeId)
        put("number", json.encodeToJsonElement(value.number))
        put("repository_url", value.repositoryUrl)
        put("state", json.encodeToJsonElement(value.state))
        put("state_reason", value.stateReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("title", value.title)
        put("updated_at", value.updatedAt)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("author_association", value.authorAssociationState, json::encodeToJsonElement)
        putState("labels", value.labelsState, json::encodeToJsonElement)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
        putState("timeline_url", value.timelineUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun discussion(block: Discussion.Builder.() -> Unit): Discussion = Discussion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Discussion is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Discussion property '" + name + "' is not nullable")
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

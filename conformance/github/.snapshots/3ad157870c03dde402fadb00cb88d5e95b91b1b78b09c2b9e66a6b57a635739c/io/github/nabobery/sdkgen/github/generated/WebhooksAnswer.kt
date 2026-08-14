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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_answer.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_answer
 */
@Serializable(with = WebhooksAnswer.Serializer::class)
public class WebhooksAnswer internal constructor(
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation: InlineWebhooksAnswerAuthorAssociationXf4f7ddae,
  public val body: String,
  public val childCommentCount: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val discussionId: Int,
  public val htmlUrl: String,
  public val id: Int,
  public val nodeId: String,
  public val parentId: JsonElement?,
  public val repositoryUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  public val user: InlineWebhooksAnswerUserX4d43aac4?,
  private val reactionsState: FieldState<InlineWebhooksAnswerReactionsXa9778800>,
) {
  public val reactions: InlineWebhooksAnswerReactionsXa9778800?
    get() = reactionsState.valueOrNull()

  public constructor(
    authorAssociation: InlineWebhooksAnswerAuthorAssociationXf4f7ddae,
    body: String,
    childCommentCount: Int,
    createdAt: String,
    discussionId: Int,
    htmlUrl: String,
    id: Int,
    nodeId: String,
    parentId: JsonElement?,
    repositoryUrl: String,
    updatedAt: String,
    user: InlineWebhooksAnswerUserX4d43aac4?,
  ) : this(authorAssociation = authorAssociation,
  body = body,
  childCommentCount = childCommentCount,
  createdAt = createdAt,
  discussionId = discussionId,
  htmlUrl = htmlUrl,
  id = id,
  nodeId = nodeId,
  parentId = parentId,
  repositoryUrl = repositoryUrl,
  updatedAt = updatedAt,
  user = user,
  reactionsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  public class Builder {
    private var authorAssociationValue: InlineWebhooksAnswerAuthorAssociationXf4f7ddae? = null

    public var authorAssociation: InlineWebhooksAnswerAuthorAssociationXf4f7ddae
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var childCommentCountValue: Int? = null

    public var childCommentCount: Int
      get() = requireNotNull(childCommentCountValue) { "childCommentCount is required" }
      set(`value`) {
        childCommentCountValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var discussionIdValue: Int? = null

    public var discussionId: Int
      get() = requireNotNull(discussionIdValue) { "discussionId is required" }
      set(`value`) {
        discussionIdValue = value
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

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var parentIdState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var parentId: JsonElement?
      get() = parentIdState.valueOrNull()
      set(`value`) {
        parentIdState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineWebhooksAnswerUserX4d43aac4?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhooksAnswerUserX4d43aac4?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var reactionsState: FieldState<InlineWebhooksAnswerReactionsXa9778800> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: InlineWebhooksAnswerReactionsXa9778800?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    public fun build(): WebhooksAnswer {
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(bodyValue != null) { "body is required" }
      check(childCommentCountValue != null) { "childCommentCount is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(discussionIdValue != null) { "discussionId is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(parentIdState !== FieldState.Absent) { "parentId is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return WebhooksAnswer(
        authorAssociation = authorAssociation,
        body = body,
        childCommentCount = childCommentCount,
        createdAt = createdAt,
        discussionId = discussionId,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        parentId = parentIdState.valueOrNull(),
        repositoryUrl = repositoryUrl,
        updatedAt = updatedAt,
        user = userState.valueOrNull(),
        reactionsState = reactionsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksAnswer = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksAnswer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksAnswer {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksAnswer")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksAnswer must be a JSON object")
      val authorAssociation = json.decodeRequired<InlineWebhooksAnswerAuthorAssociationXf4f7ddae>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val childCommentCount = json.decodeRequired<Int>(rawObject, "child_comment_count")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val discussionId = json.decodeRequired<Int>(rawObject, "discussion_id")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("parent_id")) {
        throw SerializationException("WebhooksAnswer is missing required property 'parent_id'")
      }
      val parentId = rawObject["parent_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("WebhooksAnswer is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksAnswerUserX4d43aac4?>(requireNotNull(element)) }
      return WebhooksAnswer(
        authorAssociation = authorAssociation,
        body = body,
        childCommentCount = childCommentCount,
        createdAt = createdAt,
        discussionId = discussionId,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        parentId = parentId,
        repositoryUrl = repositoryUrl,
        updatedAt = updatedAt,
        user = user,
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksAnswer) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksAnswer")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body)
        put("child_comment_count", json.encodeToJsonElement(value.childCommentCount))
        put("created_at", value.createdAt)
        put("discussion_id", json.encodeToJsonElement(value.discussionId))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("parent_id", value.parentId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository_url", value.repositoryUrl)
        put("updated_at", value.updatedAt)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksAnswer(block: WebhooksAnswer.Builder.() -> Unit): WebhooksAnswer = WebhooksAnswer.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksAnswer is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksAnswer property '" + name + "' is not nullable")
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

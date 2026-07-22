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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_comment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_comment
 */
@Serializable(with = WebhooksComment.Serializer::class)
public class WebhooksComment(
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation: InlineWebhooksCommentAuthorAssociationXb284c734,
  public val body: String,
  public val childCommentCount: Int,
  public val createdAt: String,
  public val discussionId: Int,
  public val htmlUrl: String,
  public val id: Int,
  public val nodeId: String,
  public val parentId: Int?,
  public val reactions: InlineWebhooksCommentReactionsX0f705a6e,
  public val repositoryUrl: String,
  public val updatedAt: String,
  public val user: InlineWebhooksCommentUserX18850ccb?,
) {
  public class Builder {
    private var authorAssociationValue: InlineWebhooksCommentAuthorAssociationXb284c734? = null

    public var authorAssociation: InlineWebhooksCommentAuthorAssociationXb284c734
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

    private var reactionsValue: InlineWebhooksCommentReactionsX0f705a6e? = null

    public var reactions: InlineWebhooksCommentReactionsX0f705a6e
      get() = requireNotNull(reactionsValue) { "reactions is required" }
      set(`value`) {
        reactionsValue = value
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

    private var parentIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var parentId: Int?
      get() = parentIdState.valueOrNull()
      set(`value`) {
        parentIdState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineWebhooksCommentUserX18850ccb?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhooksCommentUserX18850ccb?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): WebhooksComment {
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(bodyValue != null) { "body is required" }
      check(childCommentCountValue != null) { "childCommentCount is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(discussionIdValue != null) { "discussionId is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(reactionsValue != null) { "reactions is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(parentIdState !== FieldState.Absent) { "parentId is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return WebhooksComment(
        authorAssociation = authorAssociation,
        body = body,
        childCommentCount = childCommentCount,
        createdAt = createdAt,
        discussionId = discussionId,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        parentId = parentIdState.valueOrNull(),
        reactions = reactions,
        repositoryUrl = repositoryUrl,
        updatedAt = updatedAt,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksComment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhooksComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksComment {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksComment must be a JSON object")
      val authorAssociation = json.decodeRequired<InlineWebhooksCommentAuthorAssociationXb284c734>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val childCommentCount = json.decodeRequired<Int>(rawObject, "child_comment_count")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val discussionId = json.decodeRequired<Int>(rawObject, "discussion_id")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val reactions = json.decodeRequired<InlineWebhooksCommentReactionsX0f705a6e>(rawObject, "reactions")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("parent_id")) {
        throw SerializationException("WebhooksComment is missing required property 'parent_id'")
      }
      val parentId = rawObject["parent_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("WebhooksComment is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksCommentUserX18850ccb?>(requireNotNull(element)) }
      return WebhooksComment(
        authorAssociation = authorAssociation,
        body = body,
        childCommentCount = childCommentCount,
        createdAt = createdAt,
        discussionId = discussionId,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        parentId = parentId,
        reactions = reactions,
        repositoryUrl = repositoryUrl,
        updatedAt = updatedAt,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksComment) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksComment")
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
        put("reactions", json.encodeToJsonElement(value.reactions))
        put("repository_url", value.repositoryUrl)
        put("updated_at", value.updatedAt)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksComment(block: WebhooksComment.Builder.() -> Unit): WebhooksComment = WebhooksComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksComment property '" + name + "' is not nullable")
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

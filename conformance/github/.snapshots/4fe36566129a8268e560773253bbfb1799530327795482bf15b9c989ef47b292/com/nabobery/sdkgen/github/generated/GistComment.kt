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
 * A comment made to a gist.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-comment
 */
@Serializable(with = GistComment.Serializer::class)
public class GistComment(
  public val authorAssociation: AuthorAssociation,
  /**
   * The comment text.
   */
  public val body: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val id: Int,
  public val nodeId: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: NullableSimpleUser?,
) {
  public class Builder {
    private var authorAssociationValue: AuthorAssociation? = null

    public var authorAssociation: AuthorAssociation
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

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
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

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): GistComment {
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(bodyValue != null) { "body is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return GistComment(
        authorAssociation = authorAssociation,
        body = body,
        createdAt = createdAt,
        id = id,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GistComment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GistComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GistComment {
      val jsonDecoder = decoder.requireJsonDecoder("GistComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GistComment must be a JSON object")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("GistComment is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return GistComment(
        authorAssociation = authorAssociation,
        body = body,
        createdAt = createdAt,
        id = id,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GistComment) {
      val jsonEncoder = encoder.requireJsonEncoder("GistComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body)
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gistComment(block: GistComment.Builder.() -> Unit): GistComment = GistComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GistComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("GistComment property '" + name + "' is not nullable")
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

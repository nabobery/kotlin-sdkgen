package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/commit-comment-event/properties/comment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-comment-event/properties/comment
 */
@Serializable(with = InlineCommitCommentEventCommentX076c9378.Serializer::class)
public class InlineCommitCommentEventCommentX076c9378(
  public val body: String? = null,
  public val commitId: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val line: Int? = null,
  public val nodeId: String? = null,
  public val path: String? = null,
  public val position: Int? = null,
  public val reactions: ReactionRollup? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
  public val user: NullableSimpleUser? = null,
) {
  public class Builder {
    public var body: String? = null

    public var commitId: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public var id: Int? = null

    public var line: Int? = null

    public var nodeId: String? = null

    public var path: String? = null

    public var position: Int? = null

    public var reactions: ReactionRollup? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public var user: NullableSimpleUser? = null

    public fun build(): InlineCommitCommentEventCommentX076c9378 = InlineCommitCommentEventCommentX076c9378(
      body = body,
      commitId = commitId,
      createdAt = createdAt,
      htmlUrl = htmlUrl,
      id = id,
      line = line,
      nodeId = nodeId,
      path = path,
      position = position,
      reactions = reactions,
      updatedAt = updatedAt,
      url = url,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommitCommentEventCommentX076c9378 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCommitCommentEventCommentX076c9378> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommitCommentEventCommentX076c9378 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommitCommentEventCommentX076c9378")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommitCommentEventCommentX076c9378 must be a JSON object")
      return InlineCommitCommentEventCommentX076c9378(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        commitId = rawObject["commit_id"]?.let { json.decodeFromJsonElement<String>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        line = rawObject["line"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        path = rawObject["path"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        position = rawObject["position"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        reactions = rawObject["reactions"]?.let { json.decodeFromJsonElement<ReactionRollup>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommitCommentEventCommentX076c9378) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommitCommentEventCommentX076c9378")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", it) }
        value.commitId?.let { put("commit_id", it) }
        value.createdAt?.let { put("created_at", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.line?.let { put("line", json.encodeToJsonElement(it)) }
        value.nodeId?.let { put("node_id", it) }
        value.path?.let { put("path", it) }
        value.position?.let { put("position", json.encodeToJsonElement(it)) }
        value.reactions?.let { put("reactions", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommitCommentEventCommentX076c9378(block: InlineCommitCommentEventCommentX076c9378.Builder.() -> Unit): InlineCommitCommentEventCommentX076c9378 = InlineCommitCommentEventCommentX076c9378.build(block)

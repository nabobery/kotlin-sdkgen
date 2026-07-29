package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Represents a 'discussion_comment' secret scanning location type. This location type shows that a secret was detected
 * in a comment on a discussion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-discussion-comment
 */
@Serializable(with = SecretScanningLocationDiscussionComment.Serializer::class)
public class SecretScanningLocationDiscussionComment(
  /**
   * The API URL to get the discussion comment where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val discussionCommentUrl: String,
) {
  public class Builder {
    private var discussionCommentUrlValue: String? = null

    public var discussionCommentUrl: String
      get() = requireNotNull(discussionCommentUrlValue) { "discussionCommentUrl is required" }
      set(`value`) {
        discussionCommentUrlValue = value
      }

    public fun build(): SecretScanningLocationDiscussionComment {
      check(discussionCommentUrlValue != null) { "discussionCommentUrl is required" }
      return SecretScanningLocationDiscussionComment(
        discussionCommentUrl = discussionCommentUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationDiscussionComment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocationDiscussionComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationDiscussionComment {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationDiscussionComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationDiscussionComment must be a JSON object")
      val discussionCommentUrl = json.decodeRequired<String>(rawObject, "discussion_comment_url")
      return SecretScanningLocationDiscussionComment(
        discussionCommentUrl = discussionCommentUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationDiscussionComment) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationDiscussionComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("discussion_comment_url", value.discussionCommentUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationDiscussionComment(block: SecretScanningLocationDiscussionComment.Builder.() -> Unit): SecretScanningLocationDiscussionComment = SecretScanningLocationDiscussionComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationDiscussionComment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

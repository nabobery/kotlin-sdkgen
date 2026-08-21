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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited/properties/changes/properties/body
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited/properties/changes/properties/body
 */
@Serializable(with = InlineWebhookDiscussionCommentEditedChangesBodyX95646409.Serializer::class)
public class InlineWebhookDiscussionCommentEditedChangesBodyX95646409(
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookDiscussionCommentEditedChangesBodyX95646409 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookDiscussionCommentEditedChangesBodyX95646409(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionCommentEditedChangesBodyX95646409 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionCommentEditedChangesBodyX95646409> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCommentEditedChangesBodyX95646409 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionCommentEditedChangesBodyX95646409")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionCommentEditedChangesBodyX95646409 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookDiscussionCommentEditedChangesBodyX95646409(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCommentEditedChangesBodyX95646409) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionCommentEditedChangesBodyX95646409")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionCommentEditedChangesBodyX95646409(block: InlineWebhookDiscussionCommentEditedChangesBodyX95646409.Builder.() -> Unit): InlineWebhookDiscussionCommentEditedChangesBodyX95646409 = InlineWebhookDiscussionCommentEditedChangesBodyX95646409.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionCommentEditedChangesBodyX95646409 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

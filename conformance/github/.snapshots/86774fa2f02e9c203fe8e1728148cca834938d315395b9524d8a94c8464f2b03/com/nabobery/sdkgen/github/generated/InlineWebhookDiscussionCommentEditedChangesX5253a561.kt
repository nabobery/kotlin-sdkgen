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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited/properties/changes
 */
@Serializable(with = InlineWebhookDiscussionCommentEditedChangesX5253a561.Serializer::class)
public class InlineWebhookDiscussionCommentEditedChangesX5253a561(
  public val body: InlineWebhookDiscussionCommentEditedChangesBodyX95646409,
) {
  public class Builder {
    private var bodyValue: InlineWebhookDiscussionCommentEditedChangesBodyX95646409? = null

    public var body: InlineWebhookDiscussionCommentEditedChangesBodyX95646409
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    public fun build(): InlineWebhookDiscussionCommentEditedChangesX5253a561 {
      check(bodyValue != null) { "body is required" }
      return InlineWebhookDiscussionCommentEditedChangesX5253a561(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionCommentEditedChangesX5253a561 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionCommentEditedChangesX5253a561> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCommentEditedChangesX5253a561 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionCommentEditedChangesX5253a561")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionCommentEditedChangesX5253a561 must be a JSON object")
      val body = json.decodeRequired<InlineWebhookDiscussionCommentEditedChangesBodyX95646409>(rawObject, "body")
      return InlineWebhookDiscussionCommentEditedChangesX5253a561(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCommentEditedChangesX5253a561) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionCommentEditedChangesX5253a561")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", json.encodeToJsonElement(value.body))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionCommentEditedChangesX5253a561(block: InlineWebhookDiscussionCommentEditedChangesX5253a561.Builder.() -> Unit): InlineWebhookDiscussionCommentEditedChangesX5253a561 = InlineWebhookDiscussionCommentEditedChangesX5253a561.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionCommentEditedChangesX5253a561 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited/properties/changes/properties/title.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited/properties/changes/properties/title
 */
@Serializable(with = InlineWebhookDiscussionEditedChangesTitleX9d519bfb.Serializer::class)
public class InlineWebhookDiscussionEditedChangesTitleX9d519bfb(
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookDiscussionEditedChangesTitleX9d519bfb {
      check(fromValue != null) { "from is required" }
      return InlineWebhookDiscussionEditedChangesTitleX9d519bfb(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionEditedChangesTitleX9d519bfb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDiscussionEditedChangesTitleX9d519bfb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionEditedChangesTitleX9d519bfb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionEditedChangesTitleX9d519bfb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionEditedChangesTitleX9d519bfb must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookDiscussionEditedChangesTitleX9d519bfb(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionEditedChangesTitleX9d519bfb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionEditedChangesTitleX9d519bfb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionEditedChangesTitleX9d519bfb(block: InlineWebhookDiscussionEditedChangesTitleX9d519bfb.Builder.() -> Unit): InlineWebhookDiscussionEditedChangesTitleX9d519bfb = InlineWebhookDiscussionEditedChangesTitleX9d519bfb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionEditedChangesTitleX9d519bfb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

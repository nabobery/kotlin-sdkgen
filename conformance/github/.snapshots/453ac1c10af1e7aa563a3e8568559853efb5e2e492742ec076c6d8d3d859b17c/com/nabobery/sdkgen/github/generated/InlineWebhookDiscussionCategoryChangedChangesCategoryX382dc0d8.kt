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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/changes/properties/ca
 * tegory.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed/properties/changes/properties/ca
 * tegory
 */
@Serializable(with = InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8.Serializer::class)
public class InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8(
  public val from: InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332,
) {
  public class Builder {
    private var fromValue: InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332? =
        null

    public var from: InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8 must be a JSON object")
      val from = json.decodeRequired<InlineWebhookDiscussionCategoryChangedChangesCategoryFromXd80bf332>(rawObject, "from")
      return InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8(block: InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8.Builder.() -> Unit): InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8 = InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionCategoryChangedChangesCategoryX382dc0d8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

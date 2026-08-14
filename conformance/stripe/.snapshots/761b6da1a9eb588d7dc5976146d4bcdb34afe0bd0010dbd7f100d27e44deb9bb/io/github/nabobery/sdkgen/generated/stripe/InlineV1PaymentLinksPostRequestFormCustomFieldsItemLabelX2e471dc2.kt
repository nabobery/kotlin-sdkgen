package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/label.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_fields/items/properties/label
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2(
  public val custom: String,
  public val type: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a,
) {
  public class Builder {
    private var customValue: String? = null

    public var custom: String
      get() = requireNotNull(customValue) { "custom is required" }
      set(`value`) {
        customValue = value
      }

    private var typeValue: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a? =
        null

    public var type: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2 {
      check(customValue != null) { "custom is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2(
        custom = custom,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2 must be a JSON object")
      val custom = json.decodeRequired<String>(rawObject, "custom")
      val type = json.decodeRequired<InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelTypeX0129ff8a>(rawObject, "type")
      return InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2(
        custom = custom,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("custom", value.custom)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2(block: InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2 = InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomFieldsItemLabelX2e471dc2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

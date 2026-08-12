package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items/properties/label.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_fields/items/properties/label
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8(
  public val custom: String,
  public val type: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelTypeX0aff2239,
) {
  public class Builder {
    private var customValue: String? = null

    public var custom: String
      get() = requireNotNull(customValue) { "custom is required" }
      set(`value`) {
        customValue = value
      }

    private var typeValue:
        InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelTypeX0aff2239? = null

    public var type: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelTypeX0aff2239
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8 {
      check(customValue != null) { "custom is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8(
        custom = custom,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8 must be a JSON object")
      val custom = json.decodeRequired<String>(rawObject, "custom")
      val type = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelTypeX0aff2239>(rawObject, "type")
      return InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8(
        custom = custom,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("custom", value.custom)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8(block: InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8 = InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomFieldsItemLabelXb5ab84e8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

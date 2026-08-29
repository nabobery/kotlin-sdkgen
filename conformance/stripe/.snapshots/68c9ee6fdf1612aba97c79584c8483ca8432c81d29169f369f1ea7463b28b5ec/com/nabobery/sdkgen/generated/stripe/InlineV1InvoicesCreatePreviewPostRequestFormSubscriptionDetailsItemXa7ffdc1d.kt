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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/applies_to/ite
 * ms.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/billing_schedules/anyOf/0/items/properties/applies_to/ite
 * ms
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d(
  public val type: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXddc93d6c,
  public val price: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXddc93d6c? = null

    public var type: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXddc93d6c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var price: String? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d(
        type = type,
        price = price,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsTypeXddc93d6c>(rawObject, "type")
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d(
        type = type,
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.price?.let { put("price", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d(block: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemXa7ffdc1d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

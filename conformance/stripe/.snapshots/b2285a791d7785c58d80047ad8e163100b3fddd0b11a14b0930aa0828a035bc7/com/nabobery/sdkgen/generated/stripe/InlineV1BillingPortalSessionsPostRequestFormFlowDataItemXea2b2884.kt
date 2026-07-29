package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update_confirm/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update_confirm/properties/items/items
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884(
  public val id: String,
  public val price: String? = null,
  public val quantity: Int? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public var price: String? = null

    public var quantity: Int? = null

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884 {
      check(idValue != null) { "id is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884(
        id = id,
        price = price,
        quantity = quantity,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884 must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884(
        id = id,
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        value.price?.let { put("price", it) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884 = InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items/properties/applies_to/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_schedules/items/properties/applies_to/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48(
  public val type: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529,
  public val price: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529? = null

    public var type: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var price: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48(
        type = type,
        price = price,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToTypeX1bb63529>(rawObject, "type")
      return InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48(
        type = type,
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.price?.let { put("price", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48(block: InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48 = InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingSchedulesItemAppliesToItemX89efce48 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

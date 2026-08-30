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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68(
  public val interval:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXbc345e4c,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXbc345e4c? = null

    public var interval:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXbc345e4c
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68 must be a JSON object")
      val interval = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXbc345e4c>(rawObject, "interval")
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68(block: InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68 = InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX22505c68 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

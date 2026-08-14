package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/line_items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/line_items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542(
  public val interval:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3? = null

    public var interval:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542 must be a JSON object")
      val interval = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataIntervalXd47390b3>(rawObject, "interval")
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542(block: InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542 = InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataRecurringX6a0f0542 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

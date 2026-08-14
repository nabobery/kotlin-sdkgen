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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca(
  public val interval: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b? = null

    public var interval: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca {
      check(intervalValue != null) { "interval is required" }
      return InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca must be a JSON object")
      val interval = json.decodeRequired<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataIntervalXd995328b>(rawObject, "interval")
      return InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca(block: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca = InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

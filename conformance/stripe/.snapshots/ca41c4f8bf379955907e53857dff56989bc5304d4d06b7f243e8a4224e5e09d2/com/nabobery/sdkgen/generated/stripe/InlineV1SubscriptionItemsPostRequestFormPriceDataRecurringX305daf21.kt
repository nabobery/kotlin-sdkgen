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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/price_data/properties/recurring.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/price_data/properties/recurring
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21(
  public val interval: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalXd69f31ce,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalXd69f31ce? = null

    public var interval: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalXd69f31ce
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21 must be a JSON object")
      val interval = json.decodeRequired<InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringIntervalXd69f31ce>(rawObject, "interval")
      return InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21(block: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21.Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21 = InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

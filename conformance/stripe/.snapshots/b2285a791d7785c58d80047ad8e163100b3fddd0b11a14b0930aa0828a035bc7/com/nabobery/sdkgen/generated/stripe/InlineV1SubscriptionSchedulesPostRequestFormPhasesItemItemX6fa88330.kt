package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330(
  public val discountable: Boolean? = null,
  discounts: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX100aef5b>? = null,
  metadata: Map<String, String>? = null,
  public val period: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPeriodXa89fd4f1? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPriceDataX16f9e99f? = null,
  public val quantity: Int? = null,
  public val taxRates:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083? = null,
) {
  public val discounts: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX100aef5b>? =
      discounts?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var discountable: Boolean? = null

    private var discountsValue:
        List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX100aef5b>? = null

    public var discounts: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX100aef5b>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var period: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPeriodXa89fd4f1? = null

    public var price: String? = null

    public var priceData: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPriceDataX16f9e99f?
        = null

    public var quantity: Int? = null

    public var taxRates: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083? =
        null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330(
      discountable = discountable,
      discounts = discounts,
      metadata = metadata,
      period = period,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330 must be a JSON object")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330(
        discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX100aef5b>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        period = rawObject["period"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPeriodXa89fd4f1>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemPriceDataX16f9e99f>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.period?.let { put("period", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemX6fa88330.build(block)

package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * encoded/schema/properties/phases/items/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849(
  public val billingThresholds:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1? = null,
  public val discounts:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7? = null,
  metadata: Map<String, String>? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataXebe80254? = null,
  public val quantity: Int? = null,
  public val taxRates:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var billingThresholds:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1? = null

    public var discounts:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var price: String? = null

    public var priceData:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataXebe80254? = null

    public var quantity: Int? = null

    public var taxRates:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849(
      billingThresholds = billingThresholds,
      discounts = discounts,
      metadata = metadata,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849 must be a JSON object")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849(
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX1843dca1>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataXebe80254>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemX457be849.build(block)

package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f(
  public val discountable: Boolean? = null,
  discounts: List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemDiscountsItemXd785da4a>? = null,
  metadata: Map<String, String>? = null,
  public val period: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b? = null,
  public val quantity: Int? = null,
  public val taxRates:
      InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad? = null,
) {
  public val discounts:
      List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemDiscountsItemXd785da4a>? =
      discounts?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var discountable: Boolean? = null

    private var discountsValue:
        List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemDiscountsItemXd785da4a>? = null

    public var discounts:
        List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemDiscountsItemXd785da4a>?
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

    public var period: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9? =
        null

    public var price: String? = null

    public var priceData: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b?
        = null

    public var quantity: Int? = null

    public var taxRates: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad? =
        null

    public fun build(): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f(
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
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f(
        discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemDiscountsItemXd785da4a>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        period = rawObject["period"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxRatesXa2ce4aad>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f")
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

public fun inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f(block: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX14b4e13f.build(block)

package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25(
  public val amount: Int? = null,
  public val description: String? = null,
  public val discountable: Boolean? = null,
  public val discounts: InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f? = null,
  public val invoiceItem: String? = null,
  public val metadata: InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459? = null,
  public val period: InlineV1InvoicesAddLinesPostRequestFormLinesItemPeriodXe0553e9c? = null,
  public val priceData: InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332? = null,
  public val pricing: InlineV1InvoicesAddLinesPostRequestFormLinesItemPricingX615d9355? = null,
  public val quantity: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  public val taxAmounts:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff? = null,
  public val taxRates: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var description: String? = null

    public var discountable: Boolean? = null

    public var discounts: InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f? = null

    public var invoiceItem: String? = null

    public var metadata: InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459? = null

    public var period: InlineV1InvoicesAddLinesPostRequestFormLinesItemPeriodXe0553e9c? = null

    public var priceData: InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332? = null

    public var pricing: InlineV1InvoicesAddLinesPostRequestFormLinesItemPricingX615d9355? = null

    public var quantity: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    public var taxAmounts: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff? =
        null

    public var taxRates: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7? = null

    public fun build(): InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25 = InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25(
      amount = amount,
      description = description,
      discountable = discountable,
      discounts = discounts,
      invoiceItem = invoiceItem,
      metadata = metadata,
      period = period,
      priceData = priceData,
      pricing = pricing,
      quantity = quantity,
      quantityDecimal = quantityDecimal,
      taxAmounts = taxAmounts,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25 must be a JSON object")
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f>(it) },
        invoiceItem = rawObject["invoice_item"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459>(it) },
        period = rawObject["period"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemPeriodXe0553e9c>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332>(it) },
        pricing = rawObject["pricing"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemPricingX615d9355>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        taxAmounts = rawObject["tax_amounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.invoiceItem?.let { put("invoice_item", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.period?.let { put("period", json.encodeToJsonElement(it)) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.pricing?.let { put("pricing", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.taxAmounts?.let { put("tax_amounts", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25(block: InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25.Builder.() -> Unit): InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25 = InlineV1InvoicesAddLinesPostRequestFormLinesItemX4410ce25.build(block)

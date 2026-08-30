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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944(
  public val amount: Int? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val description: String? = null,
  public val discountable: Boolean? = null,
  public val discounts:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97? = null,
  public val invoiceitem: String? = null,
  public val metadata:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796? = null,
  public val period:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPriceDataXb2fabe99? = null,
  public val quantity: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  public val taxBehavior:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorXcdc0a597? = null,
  public val taxCode:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxCodeX61ac50e2? = null,
  public val taxRates:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public class Builder {
    public var amount: Int? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var description: String? = null

    public var discountable: Boolean? = null

    public var discounts:
        InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97? = null

    public var invoiceitem: String? = null

    public var metadata:
        InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796? = null

    public var period: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f?
        = null

    public var price: String? = null

    public var priceData:
        InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPriceDataXb2fabe99? = null

    public var quantity: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    public var taxBehavior:
        InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorXcdc0a597? = null

    public var taxCode:
        InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxCodeX61ac50e2? = null

    public var taxRates:
        InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944 = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944(
      amount = amount,
      currency = currency,
      description = description,
      discountable = discountable,
      discounts = discounts,
      invoiceitem = invoiceitem,
      metadata = metadata,
      period = period,
      price = price,
      priceData = priceData,
      quantity = quantity,
      quantityDecimal = quantityDecimal,
      taxBehavior = taxBehavior,
      taxCode = taxCode,
      taxRates = taxRates,
      unitAmount = unitAmount,
      unitAmountDecimal = unitAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944 must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemDiscountsX0e559a97>(it) },
        invoiceitem = rawObject["invoiceitem"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796>(it) },
        period = rawObject["period"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPriceDataXb2fabe99>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxBehaviorXcdc0a597>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxCodeX61ac50e2>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemTaxRatesX590a7ef6>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.description?.let { put("description", it) }
        value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.invoiceitem?.let { put("invoiceitem", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.period?.let { put("period", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944(block: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944 = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944.build(block)

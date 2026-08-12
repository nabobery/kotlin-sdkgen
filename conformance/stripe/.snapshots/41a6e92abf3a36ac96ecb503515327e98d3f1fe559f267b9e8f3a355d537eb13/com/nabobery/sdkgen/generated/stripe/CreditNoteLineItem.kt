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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The credit note line item object
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note_line_item
 */
@Serializable(with = CreditNoteLineItem.Serializer::class)
public class CreditNoteLineItem(
  /**
   * The integer amount in cents (or local equivalent) representing the gross amount being credited for this line item,
   * excluding (exclusive) tax and discounts.
   */
  public val amount: Int,
  /**
   * The integer amount in cents (or local equivalent) representing the discount being credited for this line item.
   */
  public val discountAmount: Int,
  discountAmounts: List<DiscountsResourceDiscountAmount>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineCreditNoteLineItemObjectValueX94067580,
  pretaxCreditAmounts: List<CreditNotesPretaxCreditAmount>,
  taxRates: List<TaxRate>,
  /**
   * The type of the credit note line item, one of `invoice_line_item` or `custom_line_item`. When the type is
   * `invoice_line_item` there is an additional `invoice_line_item` property on the resource the value of which is the
   * id of the credited line item on the invoice.
   */
  public val type: InlineCreditNoteLineItemTypeXfc7121bf,
  /**
   * Description of the item being credited.
   */
  public val description: String? = null,
  /**
   * ID of the invoice line item being credited
   */
  public val invoiceLineItem: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * The number of units of product being credited.
   */
  public val quantity: Int? = null,
  taxes: List<BillingBillResourceInvoicingTaxesTax>? = null,
  /**
   * The cost of each unit of product being credited.
   */
  public val unitAmount: Int? = null,
  /**
   * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  /**
   * The amount of discount calculated per discount for this line item
   */
  public val discountAmounts: List<DiscountsResourceDiscountAmount> = discountAmounts.toList()

  /**
   * The pretax credit amounts (ex: discount, credit grants, etc) for this line item.
   */
  public val pretaxCreditAmounts: List<CreditNotesPretaxCreditAmount> = pretaxCreditAmounts.toList()

  /**
   * The tax rates which apply to the line item.
   */
  public val taxRates: List<TaxRate> = taxRates.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The tax information of the line item.
   */
  public val taxes: List<BillingBillResourceInvoicingTaxesTax>? =
      taxes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var discountAmountValue: Int? = null

    public var discountAmount: Int
      get() = requireNotNull(discountAmountValue) { "discountAmount is required" }
      set(`value`) {
        discountAmountValue = value
      }

    private var discountAmountsValue: List<DiscountsResourceDiscountAmount>? = null

    public var discountAmounts: List<DiscountsResourceDiscountAmount>
      get() = requireNotNull(discountAmountsValue) { "discountAmounts is required" }.toList()
      set(`value`) {
        discountAmountsValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineCreditNoteLineItemObjectValueX94067580? = null

    public var objectValue: InlineCreditNoteLineItemObjectValueX94067580
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var pretaxCreditAmountsValue: List<CreditNotesPretaxCreditAmount>? = null

    public var pretaxCreditAmounts: List<CreditNotesPretaxCreditAmount>
      get() = requireNotNull(pretaxCreditAmountsValue) { "pretaxCreditAmounts is required" }.toList()
      set(`value`) {
        pretaxCreditAmountsValue = value.toList()
      }

    private var taxRatesValue: List<TaxRate>? = null

    public var taxRates: List<TaxRate>
      get() = requireNotNull(taxRatesValue) { "taxRates is required" }.toList()
      set(`value`) {
        taxRatesValue = value.toList()
      }

    private var typeValue: InlineCreditNoteLineItemTypeXfc7121bf? = null

    public var type: InlineCreditNoteLineItemTypeXfc7121bf
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Description of the item being credited.
     */
    public var description: String? = null

    /**
     * ID of the invoice line item being credited
     */
    public var invoiceLineItem: String? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The number of units of product being credited.
     */
    public var quantity: Int? = null

    private var taxesValue: List<BillingBillResourceInvoicingTaxesTax>? = null

    /**
     * The tax information of the line item.
     */
    public var taxes: List<BillingBillResourceInvoicingTaxesTax>?
      get() = taxesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The cost of each unit of product being credited.
     */
    public var unitAmount: Int? = null

    /**
     * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): CreditNoteLineItem {
      check(amountValue != null) { "amount is required" }
      check(discountAmountValue != null) { "discountAmount is required" }
      check(discountAmountsValue != null) { "discountAmounts is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(pretaxCreditAmountsValue != null) { "pretaxCreditAmounts is required" }
      check(taxRatesValue != null) { "taxRates is required" }
      check(typeValue != null) { "type is required" }
      return CreditNoteLineItem(
        amount = amount,
        discountAmount = discountAmount,
        discountAmounts = discountAmounts,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        pretaxCreditAmounts = pretaxCreditAmounts,
        taxRates = taxRates,
        type = type,
        description = description,
        invoiceLineItem = invoiceLineItem,
        metadata = metadata,
        quantity = quantity,
        taxes = taxes,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreditNoteLineItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreditNoteLineItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreditNoteLineItem {
      val jsonDecoder = decoder.requireJsonDecoder("CreditNoteLineItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreditNoteLineItem must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val discountAmount = json.decodeRequired<Int>(rawObject, "discount_amount")
      val discountAmounts = json.decodeRequired<List<DiscountsResourceDiscountAmount>>(rawObject, "discount_amounts")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineCreditNoteLineItemObjectValueX94067580>(rawObject, "object")
      val pretaxCreditAmounts = json.decodeRequired<List<CreditNotesPretaxCreditAmount>>(rawObject, "pretax_credit_amounts")
      val taxRates = json.decodeRequired<List<TaxRate>>(rawObject, "tax_rates")
      val type = json.decodeRequired<InlineCreditNoteLineItemTypeXfc7121bf>(rawObject, "type")
      return CreditNoteLineItem(
        amount = amount,
        discountAmount = discountAmount,
        discountAmounts = discountAmounts,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        pretaxCreditAmounts = pretaxCreditAmounts,
        taxRates = taxRates,
        type = type,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoiceLineItem = rawObject["invoice_line_item"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        quantity = rawObject["quantity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        taxes = rawObject["taxes"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<BillingBillResourceInvoicingTaxesTax>?>(element) },
        unitAmount = rawObject["unit_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreditNoteLineItem) {
      val jsonEncoder = encoder.requireJsonEncoder("CreditNoteLineItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("discount_amount", json.encodeToJsonElement(value.discountAmount))
        put("discount_amounts", json.encodeToJsonElement(value.discountAmounts))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("pretax_credit_amounts", json.encodeToJsonElement(value.pretaxCreditAmounts))
        put("tax_rates", json.encodeToJsonElement(value.taxRates))
        put("type", json.encodeToJsonElement(value.type))
        value.description?.let { put("description", it) }
        value.invoiceLineItem?.let { put("invoice_line_item", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxes?.let { put("taxes", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun creditNoteLineItem(block: CreditNoteLineItem.Builder.() -> Unit): CreditNoteLineItem = CreditNoteLineItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreditNoteLineItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

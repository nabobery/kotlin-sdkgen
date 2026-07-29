package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A Tax Transaction records the tax collected from or refunded to your customer.
 *
 * Related guide: [Calculate tax in your custom payment flow](https://docs.stripe.com/tax/custom#tax-transaction)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction
 */
@Serializable(with = TaxTransaction.Serializer::class)
public class TaxTransaction(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  public val currency: String,
  public val customerDetails: TaxProductResourceCustomerDetails,
  /**
   * Unique identifier for the transaction.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxTransactionObjectValueX5d2bf11d,
  /**
   * The Unix timestamp representing when the tax liability is assumed or reduced.
   */
  public val postedAt: Int,
  /**
   * A custom unique identifier, such as 'myOrder_123'.
   */
  public val reference: String,
  /**
   * The calculation uses the tax rules and rates that are in effect at this timestamp. You can use a date up to 31 days
   * in the past or up to 31 days in the future. If you use a future date, Stripe doesn't guarantee that the expected
   * tax rules and rate being used match the actual rules and rate that will be in effect on that date. We deploy tax
   * changes before their effective date, but not within a fixed window.
   */
  public val taxDate: Int,
  /**
   * If `reversal`, this transaction reverses an earlier transaction.
   */
  public val type: InlineTaxTransactionTypeXc9b6780b,
  /**
   * The ID of an existing [Customer](https://docs.stripe.com/api/customers/object) used for the resource.
   */
  public val customer: String? = null,
  /**
   * The tax collected or refunded, by line item.
   */
  public val lineItems: InlineTaxTransactionLineItemsXbeaf3154? = null,
  metadata: Map<String, String>? = null,
  /**
   * If `type=reversal`, contains information about what was reversed.
   */
  public val reversal: InlineTaxTransactionReversalX8e426397? = null,
  /**
   * The details of the ship from location, such as the address.
   */
  public val shipFromDetails: InlineTaxTransactionShipFromDetailsXb15ac2b5? = null,
  /**
   * The shipping cost details for the transaction.
   */
  public val shippingCost: InlineTaxTransactionShippingCostX19bb479f? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var customerDetailsValue: TaxProductResourceCustomerDetails? = null

    public var customerDetails: TaxProductResourceCustomerDetails
      get() = requireNotNull(customerDetailsValue) { "customerDetails is required" }
      set(`value`) {
        customerDetailsValue = value
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

    private var objectValueValue: InlineTaxTransactionObjectValueX5d2bf11d? = null

    public var objectValue: InlineTaxTransactionObjectValueX5d2bf11d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var postedAtValue: Int? = null

    public var postedAt: Int
      get() = requireNotNull(postedAtValue) { "postedAt is required" }
      set(`value`) {
        postedAtValue = value
      }

    private var referenceValue: String? = null

    public var reference: String
      get() = requireNotNull(referenceValue) { "reference is required" }
      set(`value`) {
        referenceValue = value
      }

    private var taxDateValue: Int? = null

    public var taxDate: Int
      get() = requireNotNull(taxDateValue) { "taxDate is required" }
      set(`value`) {
        taxDateValue = value
      }

    private var typeValue: InlineTaxTransactionTypeXc9b6780b? = null

    public var type: InlineTaxTransactionTypeXc9b6780b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The ID of an existing [Customer](https://docs.stripe.com/api/customers/object) used for the resource.
     */
    public var customer: String? = null

    /**
     * The tax collected or refunded, by line item.
     */
    public var lineItems: InlineTaxTransactionLineItemsXbeaf3154? = null

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
     * If `type=reversal`, contains information about what was reversed.
     */
    public var reversal: InlineTaxTransactionReversalX8e426397? = null

    /**
     * The details of the ship from location, such as the address.
     */
    public var shipFromDetails: InlineTaxTransactionShipFromDetailsXb15ac2b5? = null

    /**
     * The shipping cost details for the transaction.
     */
    public var shippingCost: InlineTaxTransactionShippingCostX19bb479f? = null

    public fun build(): TaxTransaction {
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerDetailsValue != null) { "customerDetails is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(postedAtValue != null) { "postedAt is required" }
      check(referenceValue != null) { "reference is required" }
      check(taxDateValue != null) { "taxDate is required" }
      check(typeValue != null) { "type is required" }
      return TaxTransaction(
        created = created,
        currency = currency,
        customerDetails = customerDetails,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        postedAt = postedAt,
        reference = reference,
        taxDate = taxDate,
        type = type,
        customer = customer,
        lineItems = lineItems,
        metadata = metadata,
        reversal = reversal,
        shipFromDetails = shipFromDetails,
        shippingCost = shippingCost,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxTransaction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxTransaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxTransaction {
      val jsonDecoder = decoder.requireJsonDecoder("TaxTransaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxTransaction must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customerDetails = json.decodeRequired<TaxProductResourceCustomerDetails>(rawObject, "customer_details")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTaxTransactionObjectValueX5d2bf11d>(rawObject, "object")
      val postedAt = json.decodeRequired<Int>(rawObject, "posted_at")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      val taxDate = json.decodeRequired<Int>(rawObject, "tax_date")
      val type = json.decodeRequired<InlineTaxTransactionTypeXc9b6780b>(rawObject, "type")
      return TaxTransaction(
        created = created,
        currency = currency,
        customerDetails = customerDetails,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        postedAt = postedAt,
        reference = reference,
        taxDate = taxDate,
        type = type,
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lineItems = rawObject["line_items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxTransactionLineItemsXbeaf3154?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        reversal = rawObject["reversal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxTransactionReversalX8e426397?>(element) },
        shipFromDetails = rawObject["ship_from_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxTransactionShipFromDetailsXb15ac2b5?>(element) },
        shippingCost = rawObject["shipping_cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxTransactionShippingCostX19bb479f?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxTransaction) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxTransaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("customer_details", json.encodeToJsonElement(value.customerDetails))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("posted_at", json.encodeToJsonElement(value.postedAt))
        put("reference", value.reference)
        put("tax_date", json.encodeToJsonElement(value.taxDate))
        put("type", json.encodeToJsonElement(value.type))
        value.customer?.let { put("customer", it) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.reversal?.let { put("reversal", json.encodeToJsonElement(it)) }
        value.shipFromDetails?.let { put("ship_from_details", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxTransaction(block: TaxTransaction.Builder.() -> Unit): TaxTransaction = TaxTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxTransaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

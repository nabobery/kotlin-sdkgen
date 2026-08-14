package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormX0a91eb27.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormX0a91eb27(
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  lineItems: List<InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce>,
  /**
   * The ID of an existing customer to use for this calculation. If provided, the customer's address and tax IDs are
   * copied to `customer_details`.
   */
  public val customer: String? = null,
  /**
   * Details about the customer, including address and tax IDs.
   */
  public val customerDetails:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af? = null,
  expand: List<String>? = null,
  /**
   * Details about the address from which the goods are being shipped.
   */
  public val shipFromDetails:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91? = null,
  /**
   * Shipping cost details to be used for the calculation.
   */
  public val shippingCost: InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41? = null,
  /**
   * Timestamp of date at which the tax rules and rates in effect applies for the calculation. Measured in seconds since
   * the Unix epoch. Can be up to 48 hours in the past, and up to 48 hours in the future.
   */
  public val taxDate: Int? = null,
) {
  /**
   * A list of items the customer is purchasing.
   */
  public val lineItems: List<InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce> =
      lineItems.toList()

  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var lineItemsValue: List<InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce>?
        = null

    public var lineItems: List<InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce>
      get() = requireNotNull(lineItemsValue) { "lineItems is required" }.toList()
      set(`value`) {
        lineItemsValue = value.toList()
      }

    /**
     * The ID of an existing customer to use for this calculation. If provided, the customer's address and tax IDs are
     * copied to `customer_details`.
     */
    public var customer: String? = null

    /**
     * Details about the customer, including address and tax IDs.
     */
    public var customerDetails: InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af? =
        null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Details about the address from which the goods are being shipped.
     */
    public var shipFromDetails: InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91? =
        null

    /**
     * Shipping cost details to be used for the calculation.
     */
    public var shippingCost: InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41? = null

    /**
     * Timestamp of date at which the tax rules and rates in effect applies for the calculation. Measured in seconds
     * since the Unix epoch. Can be up to 48 hours in the past, and up to 48 hours in the future.
     */
    public var taxDate: Int? = null

    public fun build(): InlineV1TaxCalculationsPostRequestFormX0a91eb27 {
      check(currencyValue != null) { "currency is required" }
      check(lineItemsValue != null) { "lineItems is required" }
      return InlineV1TaxCalculationsPostRequestFormX0a91eb27(
        currency = currency,
        lineItems = lineItems,
        customer = customer,
        customerDetails = customerDetails,
        expand = expand,
        shipFromDetails = shipFromDetails,
        shippingCost = shippingCost,
        taxDate = taxDate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormX0a91eb27 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormX0a91eb27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormX0a91eb27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormX0a91eb27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormX0a91eb27 must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val lineItems = json.decodeRequired<List<InlineV1TaxCalculationsPostRequestFormLineItemsItemXb2c24cce>>(rawObject, "line_items")
      return InlineV1TaxCalculationsPostRequestFormX0a91eb27(
        currency = currency,
        lineItems = lineItems,
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerDetails = rawObject["customer_details"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsXb18941af>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        shipFromDetails = rawObject["ship_from_details"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsX9aca7f91>(it) },
        shippingCost = rawObject["shipping_cost"]?.let { json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShippingCostXca28ce41>(it) },
        taxDate = rawObject["tax_date"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormX0a91eb27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormX0a91eb27")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("line_items", json.encodeToJsonElement(value.lineItems))
        value.customer?.let { put("customer", it) }
        value.customerDetails?.let { put("customer_details", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.shipFromDetails?.let { put("ship_from_details", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
        value.taxDate?.let { put("tax_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxCalculationsPostRequestFormX0a91eb27(block: InlineV1TaxCalculationsPostRequestFormX0a91eb27.Builder.() -> Unit): InlineV1TaxCalculationsPostRequestFormX0a91eb27 = InlineV1TaxCalculationsPostRequestFormX0a91eb27.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxCalculationsPostRequestFormX0a91eb27 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

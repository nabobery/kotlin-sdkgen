package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_pricing_pricing_price_details
 */
@Serializable(with = BillingBillResourceInvoicingPricingPricingPriceDetails.Serializer::class)
public class BillingBillResourceInvoicingPricingPricingPriceDetails(
  /**
   * The ID of the price this item is associated with.
   */
  public val price: InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a,
  /**
   * The ID of the product this item is associated with.
   */
  public val product: String,
) {
  public class Builder {
    private var priceValue:
        InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a? = null

    public var price: InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a
      get() = requireNotNull(priceValue) { "price is required" }
      set(`value`) {
        priceValue = value
      }

    private var productValue: String? = null

    public var product: String
      get() = requireNotNull(productValue) { "product is required" }
      set(`value`) {
        productValue = value
      }

    public fun build(): BillingBillResourceInvoicingPricingPricingPriceDetails {
      check(priceValue != null) { "price is required" }
      check(productValue != null) { "product is required" }
      return BillingBillResourceInvoicingPricingPricingPriceDetails(
        price = price,
        product = product,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingPricingPricingPriceDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingBillResourceInvoicingPricingPricingPriceDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingPricingPricingPriceDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingPricingPricingPriceDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingBillResourceInvoicingPricingPricingPriceDetails must be a JSON object")
      val price = json.decodeRequired<InlineBillingBillResourceInvoicingPricingPricingPriceDetailsPriceXb248ee7a>(rawObject, "price")
      val product = json.decodeRequired<String>(rawObject, "product")
      return BillingBillResourceInvoicingPricingPricingPriceDetails(
        price = price,
        product = product,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingBillResourceInvoicingPricingPricingPriceDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingPricingPricingPriceDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("price", json.encodeToJsonElement(value.price))
        put("product", value.product)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingBillResourceInvoicingPricingPricingPriceDetails(block: BillingBillResourceInvoicingPricingPricingPriceDetails.Builder.() -> Unit): BillingBillResourceInvoicingPricingPricingPriceDetails = BillingBillResourceInvoicingPricingPricingPriceDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingBillResourceInvoicingPricingPricingPriceDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

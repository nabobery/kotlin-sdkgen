package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentPagesCheckoutSessionTotalDetailsView(
  @SerialName("amount_discount")
  public val amountDiscount: Int,
  @SerialName("amount_shipping")
  public val amountShipping: Int? = null,
  @SerialName("amount_tax")
  public val amountTax: Int,
  public val breakdown: PaymentPagesCheckoutSessionTotalDetailsResourceBreakdown? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_total_details
 */
@Serializable(with = PaymentPagesCheckoutSessionTotalDetails.Serializer::class)
public class PaymentPagesCheckoutSessionTotalDetails(
  /**
   * This is the sum of all the discounts.
   */
  public val amountDiscount: Int,
  /**
   * This is the sum of all the tax amounts.
   */
  public val amountTax: Int,
  /**
   * This is the sum of all the shipping amounts.
   */
  public val amountShipping: Int? = null,
  public val breakdown: PaymentPagesCheckoutSessionTotalDetailsResourceBreakdown? = null,
) {
  public class Builder {
    private var amountDiscountValue: Int? = null

    public var amountDiscount: Int
      get() = requireNotNull(amountDiscountValue) { "amountDiscount is required" }
      set(`value`) {
        amountDiscountValue = value
      }

    private var amountTaxValue: Int? = null

    public var amountTax: Int
      get() = requireNotNull(amountTaxValue) { "amountTax is required" }
      set(`value`) {
        amountTaxValue = value
      }

    /**
     * This is the sum of all the shipping amounts.
     */
    public var amountShipping: Int? = null

    public var breakdown: PaymentPagesCheckoutSessionTotalDetailsResourceBreakdown? = null

    public fun build(): PaymentPagesCheckoutSessionTotalDetails {
      check(amountDiscountValue != null) { "amountDiscount is required" }
      check(amountTaxValue != null) { "amountTax is required" }
      return PaymentPagesCheckoutSessionTotalDetails(
        amountDiscount = amountDiscount,
        amountTax = amountTax,
        amountShipping = amountShipping,
        breakdown = breakdown,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionTotalDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionTotalDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionTotalDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionTotalDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionTotalDetails must be a JSON object")
      val amountDiscount = json.decodeRequired<Int>(rawObject, "amount_discount")
      val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
      return PaymentPagesCheckoutSessionTotalDetails(
        amountDiscount = amountDiscount,
        amountTax = amountTax,
        amountShipping = rawObject["amount_shipping"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        breakdown = rawObject["breakdown"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionTotalDetailsResourceBreakdown>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionTotalDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionTotalDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_discount", json.encodeToJsonElement(value.amountDiscount))
        put("amount_tax", json.encodeToJsonElement(value.amountTax))
        value.amountShipping?.let { put("amount_shipping", json.encodeToJsonElement(it)) }
        value.breakdown?.let { put("breakdown", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionTotalDetails(block: PaymentPagesCheckoutSessionTotalDetails.Builder.() -> Unit): PaymentPagesCheckoutSessionTotalDetails = PaymentPagesCheckoutSessionTotalDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionTotalDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentFlowsAmountDetailsView(
  @SerialName("discount_amount")
  public val discountAmount: Int? = null,
  public val error: PaymentFlowsAmountDetailsResourceError? = null,
  @SerialName("line_items")
  public val lineItems: InlinePaymentFlowsAmountDetailsLineItemsXce22638c? = null,
  public val shipping: PaymentFlowsAmountDetailsResourceShipping? = null,
  public val tax: PaymentFlowsAmountDetailsResourceTax? = null,
  public val tip: PaymentFlowsAmountDetailsClientResourceTip? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details
 */
@Serializable(with = PaymentFlowsAmountDetails.Serializer::class)
public class PaymentFlowsAmountDetails(
  /**
   * The total discount applied on the transaction represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). An integer greater than 0.
   *
   * This field is mutually exclusive with the `amount_details[line_items][#][discount_amount]` field.
   */
  public val discountAmount: Int? = null,
  public val error: PaymentFlowsAmountDetailsResourceError? = null,
  /**
   * A list of line items, each containing information about a product in the PaymentIntent. There is a maximum of 200
   * line items.
   */
  public val lineItems: InlinePaymentFlowsAmountDetailsLineItemsXce22638c? = null,
  public val shipping: PaymentFlowsAmountDetailsResourceShipping? = null,
  public val tax: PaymentFlowsAmountDetailsResourceTax? = null,
  public val tip: PaymentFlowsAmountDetailsClientResourceTip? = null,
) {
  public class Builder {
    /**
     * The total discount applied on the transaction represented in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal). An integer greater than 0.
     *
     * This field is mutually exclusive with the `amount_details[line_items][#][discount_amount]` field.
     */
    public var discountAmount: Int? = null

    public var error: PaymentFlowsAmountDetailsResourceError? = null

    /**
     * A list of line items, each containing information about a product in the PaymentIntent. There is a maximum of 200
     * line items.
     */
    public var lineItems: InlinePaymentFlowsAmountDetailsLineItemsXce22638c? = null

    public var shipping: PaymentFlowsAmountDetailsResourceShipping? = null

    public var tax: PaymentFlowsAmountDetailsResourceTax? = null

    public var tip: PaymentFlowsAmountDetailsClientResourceTip? = null

    public fun build(): PaymentFlowsAmountDetails = PaymentFlowsAmountDetails(
      discountAmount = discountAmount,
      error = error,
      lineItems = lineItems,
      shipping = shipping,
      tax = tax,
      tip = tip,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsAmountDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAmountDetails must be a JSON object")
      return PaymentFlowsAmountDetails(
        discountAmount = rawObject["discount_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        error = rawObject["error"]?.let { json.decodeFromJsonElement<PaymentFlowsAmountDetailsResourceError>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlinePaymentFlowsAmountDetailsLineItemsXce22638c>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<PaymentFlowsAmountDetailsResourceShipping>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<PaymentFlowsAmountDetailsResourceTax>(it) },
        tip = rawObject["tip"]?.let { json.decodeFromJsonElement<PaymentFlowsAmountDetailsClientResourceTip>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAmountDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.discountAmount?.let { put("discount_amount", json.encodeToJsonElement(it)) }
        value.error?.let { put("error", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
        value.tip?.let { put("tip", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAmountDetails(block: PaymentFlowsAmountDetails.Builder.() -> Unit): PaymentFlowsAmountDetails = PaymentFlowsAmountDetails.build(block)

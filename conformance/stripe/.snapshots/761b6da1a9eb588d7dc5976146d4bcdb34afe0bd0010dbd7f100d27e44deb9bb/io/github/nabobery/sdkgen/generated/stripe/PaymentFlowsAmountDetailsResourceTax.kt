package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_resource_tax
 */
@Serializable(with = PaymentFlowsAmountDetailsResourceTax.Serializer::class)
public class PaymentFlowsAmountDetailsResourceTax(
  /**
   * The total amount of tax on the transaction represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). Required for L2 rates. An integer greater than or equal to
   * 0.
   *
   * This field is mutually exclusive with the `amount_details[line_items][#][tax][total_tax_amount]` field.
   */
  public val totalTaxAmount: Int? = null,
) {
  public class Builder {
    /**
     * The total amount of tax on the transaction represented in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal). Required for L2 rates. An integer greater than or equal
     * to 0.
     *
     * This field is mutually exclusive with the `amount_details[line_items][#][tax][total_tax_amount]` field.
     */
    public var totalTaxAmount: Int? = null

    public fun build(): PaymentFlowsAmountDetailsResourceTax = PaymentFlowsAmountDetailsResourceTax(
      totalTaxAmount = totalTaxAmount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetailsResourceTax = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsAmountDetailsResourceTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetailsResourceTax {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetailsResourceTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAmountDetailsResourceTax must be a JSON object")
      return PaymentFlowsAmountDetailsResourceTax(
        totalTaxAmount = rawObject["total_tax_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAmountDetailsResourceTax) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetailsResourceTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.totalTaxAmount?.let { put("total_tax_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAmountDetailsResourceTax(block: PaymentFlowsAmountDetailsResourceTax.Builder.() -> Unit): PaymentFlowsAmountDetailsResourceTax = PaymentFlowsAmountDetailsResourceTax.build(block)

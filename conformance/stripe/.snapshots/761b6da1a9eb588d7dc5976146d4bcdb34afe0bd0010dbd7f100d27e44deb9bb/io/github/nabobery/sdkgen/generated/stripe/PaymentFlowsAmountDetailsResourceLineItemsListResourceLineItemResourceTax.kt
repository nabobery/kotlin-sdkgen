package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTaxView(
  @SerialName("total_tax_amount")
  public val totalTaxAmount: Int,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_resource_line_items_list_resource_line_
 * item_resource_tax
 */
@Serializable(with = PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax.Serializer::class)
public class PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax(
  /**
   * The total amount of tax on the transaction represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). Required for L2 rates. An integer greater than or equal to
   * 0.
   *
   * This field is mutually exclusive with the `amount_details[line_items][#][tax][total_tax_amount]` field.
   */
  public val totalTaxAmount: Int,
) {
  public class Builder {
    private var totalTaxAmountValue: Int? = null

    public var totalTaxAmount: Int
      get() = requireNotNull(totalTaxAmountValue) { "totalTaxAmount is required" }
      set(`value`) {
        totalTaxAmountValue = value
      }

    public fun build(): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax {
      check(totalTaxAmountValue != null) { "totalTaxAmount is required" }
      return PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax(
        totalTaxAmount = totalTaxAmount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax must be a JSON object")
      val totalTaxAmount = json.decodeRequired<Int>(rawObject, "total_tax_amount")
      return PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax(
        totalTaxAmount = totalTaxAmount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_tax_amount", json.encodeToJsonElement(value.totalTaxAmount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax(block: PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax.Builder.() -> Unit): PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax = PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentFlowsAmountDetailsResourceLineItemsListResourceLineItemResourceTax is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

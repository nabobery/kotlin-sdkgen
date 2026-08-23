package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_resource_shipping
 */
@Serializable(with = PaymentFlowsAmountDetailsResourceShipping.Serializer::class)
public class PaymentFlowsAmountDetailsResourceShipping(
  /**
   * If a physical good is being shipped, the cost of shipping represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). An integer greater than or equal to 0.
   */
  public val amount: Int? = null,
  /**
   * If a physical good is being shipped, the postal code of where it is being shipped from. At most 10 alphanumeric
   * characters long, hyphens and spaces are allowed.
   */
  public val fromPostalCode: String? = null,
  /**
   * If a physical good is being shipped, the postal code of where it is being shipped to. At most 10 alphanumeric
   * characters long, hyphens and spaces are allowed.
   */
  public val toPostalCode: String? = null,
) {
  public class Builder {
    /**
     * If a physical good is being shipped, the cost of shipping represented in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal). An integer greater than or equal to 0.
     */
    public var amount: Int? = null

    /**
     * If a physical good is being shipped, the postal code of where it is being shipped from. At most 10 alphanumeric
     * characters long, hyphens and spaces are allowed.
     */
    public var fromPostalCode: String? = null

    /**
     * If a physical good is being shipped, the postal code of where it is being shipped to. At most 10 alphanumeric
     * characters long, hyphens and spaces are allowed.
     */
    public var toPostalCode: String? = null

    public fun build(): PaymentFlowsAmountDetailsResourceShipping = PaymentFlowsAmountDetailsResourceShipping(
      amount = amount,
      fromPostalCode = fromPostalCode,
      toPostalCode = toPostalCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetailsResourceShipping = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsAmountDetailsResourceShipping> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetailsResourceShipping {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetailsResourceShipping")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsAmountDetailsResourceShipping must be a JSON object")
      return PaymentFlowsAmountDetailsResourceShipping(
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        fromPostalCode = rawObject["from_postal_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        toPostalCode = rawObject["to_postal_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsAmountDetailsResourceShipping) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetailsResourceShipping")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.fromPostalCode?.let { put("from_postal_code", it) }
        value.toPostalCode?.let { put("to_postal_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsAmountDetailsResourceShipping(block: PaymentFlowsAmountDetailsResourceShipping.Builder.() -> Unit): PaymentFlowsAmountDetailsResourceShipping = PaymentFlowsAmountDetailsResourceShipping.build(block)

package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/revolut_pay_underlying_payment_method_funding_details
 */
@Serializable(with = RevolutPayUnderlyingPaymentMethodFundingDetails.Serializer::class)
public class RevolutPayUnderlyingPaymentMethodFundingDetails(
  public val card: PaymentMethodDetailsPassthroughCard? = null,
  /**
   * funding type of the underlying payment method.
   */
  public val type: InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853? = null,
) {
  public class Builder {
    public var card: PaymentMethodDetailsPassthroughCard? = null

    /**
     * funding type of the underlying payment method.
     */
    public var type: InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853? = null

    public fun build(): RevolutPayUnderlyingPaymentMethodFundingDetails = RevolutPayUnderlyingPaymentMethodFundingDetails(
      card = card,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RevolutPayUnderlyingPaymentMethodFundingDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RevolutPayUnderlyingPaymentMethodFundingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RevolutPayUnderlyingPaymentMethodFundingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("RevolutPayUnderlyingPaymentMethodFundingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RevolutPayUnderlyingPaymentMethodFundingDetails must be a JSON object")
      return RevolutPayUnderlyingPaymentMethodFundingDetails(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPassthroughCard>(it) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RevolutPayUnderlyingPaymentMethodFundingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("RevolutPayUnderlyingPaymentMethodFundingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun revolutPayUnderlyingPaymentMethodFundingDetails(block: RevolutPayUnderlyingPaymentMethodFundingDetails.Builder.() -> Unit): RevolutPayUnderlyingPaymentMethodFundingDetails = RevolutPayUnderlyingPaymentMethodFundingDetails.build(block)

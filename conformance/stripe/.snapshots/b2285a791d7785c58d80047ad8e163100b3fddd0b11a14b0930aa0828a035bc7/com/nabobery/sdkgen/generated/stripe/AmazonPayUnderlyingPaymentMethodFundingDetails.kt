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
 * Source: sdkgen://source/openapi.json#/components/schemas/amazon_pay_underlying_payment_method_funding_details
 */
@Serializable(with = AmazonPayUnderlyingPaymentMethodFundingDetails.Serializer::class)
public class AmazonPayUnderlyingPaymentMethodFundingDetails(
  public val card: PaymentMethodDetailsPassthroughCard? = null,
  /**
   * funding type of the underlying payment method.
   */
  public val type: InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956? = null,
) {
  public class Builder {
    public var card: PaymentMethodDetailsPassthroughCard? = null

    /**
     * funding type of the underlying payment method.
     */
    public var type: InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956? = null

    public fun build(): AmazonPayUnderlyingPaymentMethodFundingDetails = AmazonPayUnderlyingPaymentMethodFundingDetails(
      card = card,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AmazonPayUnderlyingPaymentMethodFundingDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AmazonPayUnderlyingPaymentMethodFundingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AmazonPayUnderlyingPaymentMethodFundingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("AmazonPayUnderlyingPaymentMethodFundingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AmazonPayUnderlyingPaymentMethodFundingDetails must be a JSON object")
      return AmazonPayUnderlyingPaymentMethodFundingDetails(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPassthroughCard>(it) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAmazonPayUnderlyingPaymentMethodFundingDetailsTypeXf7bea956?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AmazonPayUnderlyingPaymentMethodFundingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("AmazonPayUnderlyingPaymentMethodFundingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun amazonPayUnderlyingPaymentMethodFundingDetails(block: AmazonPayUnderlyingPaymentMethodFundingDetails.Builder.() -> Unit): AmazonPayUnderlyingPaymentMethodFundingDetails = AmazonPayUnderlyingPaymentMethodFundingDetails.build(block)

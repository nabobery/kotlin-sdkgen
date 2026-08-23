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
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details_amazon_pay
 */
@Serializable(with = DisputePaymentMethodDetailsAmazonPay.Serializer::class)
public class DisputePaymentMethodDetailsAmazonPay(
  /**
   * The AmazonPay dispute type, chargeback or claim
   */
  public val disputeType: InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39? = null,
) {
  public class Builder {
    /**
     * The AmazonPay dispute type, chargeback or claim
     */
    public var disputeType: InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39? = null

    public fun build(): DisputePaymentMethodDetailsAmazonPay = DisputePaymentMethodDetailsAmazonPay(
      disputeType = disputeType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputePaymentMethodDetailsAmazonPay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputePaymentMethodDetailsAmazonPay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputePaymentMethodDetailsAmazonPay {
      val jsonDecoder = decoder.requireJsonDecoder("DisputePaymentMethodDetailsAmazonPay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputePaymentMethodDetailsAmazonPay must be a JSON object")
      return DisputePaymentMethodDetailsAmazonPay(
        disputeType = rawObject["dispute_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDisputePaymentMethodDetailsAmazonPayDisputeTypeXf591be39?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputePaymentMethodDetailsAmazonPay) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputePaymentMethodDetailsAmazonPay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.disputeType?.let { put("dispute_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputePaymentMethodDetailsAmazonPay(block: DisputePaymentMethodDetailsAmazonPay.Builder.() -> Unit): DisputePaymentMethodDetailsAmazonPay = DisputePaymentMethodDetailsAmazonPay.build(block)

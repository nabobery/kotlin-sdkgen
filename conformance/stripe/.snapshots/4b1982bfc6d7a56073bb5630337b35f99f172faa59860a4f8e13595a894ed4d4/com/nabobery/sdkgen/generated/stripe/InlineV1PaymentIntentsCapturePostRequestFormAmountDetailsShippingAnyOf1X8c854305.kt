package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305(
  public val amount:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1? = null,
  public val fromPostalCode:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a? = null,
  public val toPostalCode:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995? = null,
) {
  public class Builder {
    public var amount:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1? = null

    public var fromPostalCode:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a? = null

    public var toPostalCode:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995? = null

    public fun build(): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305 = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305(
      amount = amount,
      fromPostalCode = fromPostalCode,
      toPostalCode = toPostalCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305 must be a JSON object")
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1>(it) },
        fromPostalCode = rawObject["from_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a>(it) },
        toPostalCode = rawObject["to_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.fromPostalCode?.let { put("from_postal_code", json.encodeToJsonElement(it)) }
        value.toPostalCode?.let { put("to_postal_code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305(block: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305.Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305 = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305.build(block)

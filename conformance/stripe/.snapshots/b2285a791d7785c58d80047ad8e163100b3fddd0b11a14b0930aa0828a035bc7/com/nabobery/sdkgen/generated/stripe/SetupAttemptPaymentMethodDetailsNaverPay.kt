package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_naver_pay
 */
@Serializable(with = SetupAttemptPaymentMethodDetailsNaverPay.Serializer::class)
public class SetupAttemptPaymentMethodDetailsNaverPay(
  /**
   * Uniquely identifies this particular Naver Pay account. You can use this attribute to check whether two Naver Pay
   * accounts are the same.
   */
  public val buyerId: String? = null,
) {
  public class Builder {
    /**
     * Uniquely identifies this particular Naver Pay account. You can use this attribute to check whether two Naver Pay
     * accounts are the same.
     */
    public var buyerId: String? = null

    public fun build(): SetupAttemptPaymentMethodDetailsNaverPay = SetupAttemptPaymentMethodDetailsNaverPay(
      buyerId = buyerId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupAttemptPaymentMethodDetailsNaverPay = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SetupAttemptPaymentMethodDetailsNaverPay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupAttemptPaymentMethodDetailsNaverPay {
      val jsonDecoder = decoder.requireJsonDecoder("SetupAttemptPaymentMethodDetailsNaverPay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupAttemptPaymentMethodDetailsNaverPay must be a JSON object")
      return SetupAttemptPaymentMethodDetailsNaverPay(
        buyerId = rawObject["buyer_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupAttemptPaymentMethodDetailsNaverPay) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupAttemptPaymentMethodDetailsNaverPay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerId?.let { put("buyer_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupAttemptPaymentMethodDetailsNaverPay(block: SetupAttemptPaymentMethodDetailsNaverPay.Builder.() -> Unit): SetupAttemptPaymentMethodDetailsNaverPay = SetupAttemptPaymentMethodDetailsNaverPay.build(block)

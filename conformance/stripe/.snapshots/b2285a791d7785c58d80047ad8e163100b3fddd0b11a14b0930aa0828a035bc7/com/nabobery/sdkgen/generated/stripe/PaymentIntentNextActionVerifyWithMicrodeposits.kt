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
import kotlinx.serialization.json.Json
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_verify_with_microdeposits
 */
@Serializable(with = PaymentIntentNextActionVerifyWithMicrodeposits.Serializer::class)
public class PaymentIntentNextActionVerifyWithMicrodeposits(
  /**
   * The timestamp when the microdeposits are expected to land.
   */
  public val arrivalDate: Int,
  /**
   * The URL for the hosted verification page, which allows customers to verify their bank account.
   */
  public val hostedVerificationUrl: String,
  /**
   * The type of the microdeposit sent to the customer. Used to distinguish between different verification methods.
   */
  public val microdepositType:
      InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d? = null,
) {
  public class Builder {
    private var arrivalDateValue: Int? = null

    public var arrivalDate: Int
      get() = requireNotNull(arrivalDateValue) { "arrivalDate is required" }
      set(`value`) {
        arrivalDateValue = value
      }

    private var hostedVerificationUrlValue: String? = null

    public var hostedVerificationUrl: String
      get() = requireNotNull(hostedVerificationUrlValue) { "hostedVerificationUrl is required" }
      set(`value`) {
        hostedVerificationUrlValue = value
      }

    /**
     * The type of the microdeposit sent to the customer. Used to distinguish between different verification methods.
     */
    public var microdepositType:
        InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d? = null

    public fun build(): PaymentIntentNextActionVerifyWithMicrodeposits {
      check(arrivalDateValue != null) { "arrivalDate is required" }
      check(hostedVerificationUrlValue != null) { "hostedVerificationUrl is required" }
      return PaymentIntentNextActionVerifyWithMicrodeposits(
        arrivalDate = arrivalDate,
        hostedVerificationUrl = hostedVerificationUrl,
        microdepositType = microdepositType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionVerifyWithMicrodeposits = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentIntentNextActionVerifyWithMicrodeposits> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionVerifyWithMicrodeposits {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionVerifyWithMicrodeposits")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionVerifyWithMicrodeposits must be a JSON object")
      val arrivalDate = json.decodeRequired<Int>(rawObject, "arrival_date")
      val hostedVerificationUrl = json.decodeRequired<String>(rawObject, "hosted_verification_url")
      return PaymentIntentNextActionVerifyWithMicrodeposits(
        arrivalDate = arrivalDate,
        hostedVerificationUrl = hostedVerificationUrl,
        microdepositType = rawObject["microdeposit_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentNextActionVerifyWithMicrodepositsMicrodepositTypeXbbf8eb5d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionVerifyWithMicrodeposits) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionVerifyWithMicrodeposits")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arrival_date", json.encodeToJsonElement(value.arrivalDate))
        put("hosted_verification_url", value.hostedVerificationUrl)
        value.microdepositType?.let { put("microdeposit_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionVerifyWithMicrodeposits(block: PaymentIntentNextActionVerifyWithMicrodeposits.Builder.() -> Unit): PaymentIntentNextActionVerifyWithMicrodeposits = PaymentIntentNextActionVerifyWithMicrodeposits.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionVerifyWithMicrodeposits is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

@Serializable
public data class PaymentIntentNextActionKonbiniLawsonView(
  @SerialName("confirmation_number")
  public val confirmationNumber: String? = null,
  @SerialName("payment_code")
  public val paymentCode: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini_lawson
 */
@Serializable(with = PaymentIntentNextActionKonbiniLawson.Serializer::class)
public class PaymentIntentNextActionKonbiniLawson(
  /**
   * The payment code.
   */
  public val paymentCode: String,
  /**
   * The confirmation number.
   */
  public val confirmationNumber: String? = null,
) {
  public class Builder {
    private var paymentCodeValue: String? = null

    public var paymentCode: String
      get() = requireNotNull(paymentCodeValue) { "paymentCode is required" }
      set(`value`) {
        paymentCodeValue = value
      }

    /**
     * The confirmation number.
     */
    public var confirmationNumber: String? = null

    public fun build(): PaymentIntentNextActionKonbiniLawson {
      check(paymentCodeValue != null) { "paymentCode is required" }
      return PaymentIntentNextActionKonbiniLawson(
        paymentCode = paymentCode,
        confirmationNumber = confirmationNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionKonbiniLawson = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionKonbiniLawson> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionKonbiniLawson {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionKonbiniLawson")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionKonbiniLawson must be a JSON object")
      val paymentCode = json.decodeRequired<String>(rawObject, "payment_code")
      return PaymentIntentNextActionKonbiniLawson(
        paymentCode = paymentCode,
        confirmationNumber = rawObject["confirmation_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionKonbiniLawson) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionKonbiniLawson")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_code", value.paymentCode)
        value.confirmationNumber?.let { put("confirmation_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionKonbiniLawson(block: PaymentIntentNextActionKonbiniLawson.Builder.() -> Unit): PaymentIntentNextActionKonbiniLawson = PaymentIntentNextActionKonbiniLawson.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionKonbiniLawson is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

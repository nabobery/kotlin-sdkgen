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
public data class PaymentIntentNextActionKonbiniMinistopView(
  @SerialName("confirmation_number")
  public val confirmationNumber: String? = null,
  @SerialName("payment_code")
  public val paymentCode: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini_ministop
 */
@Serializable(with = PaymentIntentNextActionKonbiniMinistop.Serializer::class)
public class PaymentIntentNextActionKonbiniMinistop(
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

    public fun build(): PaymentIntentNextActionKonbiniMinistop {
      check(paymentCodeValue != null) { "paymentCode is required" }
      return PaymentIntentNextActionKonbiniMinistop(
        paymentCode = paymentCode,
        confirmationNumber = confirmationNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionKonbiniMinistop = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionKonbiniMinistop> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionKonbiniMinistop {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionKonbiniMinistop")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionKonbiniMinistop must be a JSON object")
      val paymentCode = json.decodeRequired<String>(rawObject, "payment_code")
      return PaymentIntentNextActionKonbiniMinistop(
        paymentCode = paymentCode,
        confirmationNumber = rawObject["confirmation_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionKonbiniMinistop) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionKonbiniMinistop")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_code", value.paymentCode)
        value.confirmationNumber?.let { put("confirmation_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionKonbiniMinistop(block: PaymentIntentNextActionKonbiniMinistop.Builder.() -> Unit): PaymentIntentNextActionKonbiniMinistop = PaymentIntentNextActionKonbiniMinistop.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionKonbiniMinistop is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

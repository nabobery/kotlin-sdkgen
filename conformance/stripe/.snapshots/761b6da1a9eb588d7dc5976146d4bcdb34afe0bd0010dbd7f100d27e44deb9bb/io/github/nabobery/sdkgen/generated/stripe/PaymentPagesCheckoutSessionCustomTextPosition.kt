package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentPagesCheckoutSessionCustomTextPositionView(
  public val message: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_text_position
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomTextPosition.Serializer::class)
public class PaymentPagesCheckoutSessionCustomTextPosition(
  /**
   * Text can be up to 1200 characters in length.
   */
  public val message: String,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionCustomTextPosition {
      check(messageValue != null) { "message is required" }
      return PaymentPagesCheckoutSessionCustomTextPosition(
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomTextPosition = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomTextPosition> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomTextPosition {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomTextPosition")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomTextPosition must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return PaymentPagesCheckoutSessionCustomTextPosition(
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomTextPosition) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomTextPosition")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomTextPosition(block: PaymentPagesCheckoutSessionCustomTextPosition.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomTextPosition = PaymentPagesCheckoutSessionCustomTextPosition.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionCustomTextPosition is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

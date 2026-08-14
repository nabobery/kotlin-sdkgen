package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_phone_number_collection
 */
@Serializable(with = PaymentPagesCheckoutSessionPhoneNumberCollection.Serializer::class)
public class PaymentPagesCheckoutSessionPhoneNumberCollection(
  /**
   * Indicates whether phone number collection is enabled for the session
   */
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionPhoneNumberCollection {
      check(enabledValue != null) { "enabled is required" }
      return PaymentPagesCheckoutSessionPhoneNumberCollection(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionPhoneNumberCollection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionPhoneNumberCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionPhoneNumberCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionPhoneNumberCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionPhoneNumberCollection must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentPagesCheckoutSessionPhoneNumberCollection(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionPhoneNumberCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionPhoneNumberCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionPhoneNumberCollection(block: PaymentPagesCheckoutSessionPhoneNumberCollection.Builder.() -> Unit): PaymentPagesCheckoutSessionPhoneNumberCollection = PaymentPagesCheckoutSessionPhoneNumberCollection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionPhoneNumberCollection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

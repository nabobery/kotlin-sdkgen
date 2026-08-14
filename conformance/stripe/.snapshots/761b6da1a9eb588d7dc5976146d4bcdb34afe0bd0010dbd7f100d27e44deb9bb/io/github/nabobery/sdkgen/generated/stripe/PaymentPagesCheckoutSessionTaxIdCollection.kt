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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_tax_id_collection
 */
@Serializable(with = PaymentPagesCheckoutSessionTaxIdCollection.Serializer::class)
public class PaymentPagesCheckoutSessionTaxIdCollection(
  /**
   * Indicates whether tax ID collection is enabled for the session
   */
  public val enabled: Boolean,
  /**
   * Indicates whether a tax ID is required on the payment page
   */
  public val required: InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var requiredValue: InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866? =
        null

    public var required: InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866
      get() = requireNotNull(requiredValue) { "required is required" }
      set(`value`) {
        requiredValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionTaxIdCollection {
      check(enabledValue != null) { "enabled is required" }
      check(requiredValue != null) { "required is required" }
      return PaymentPagesCheckoutSessionTaxIdCollection(
        enabled = enabled,
        required = required,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionTaxIdCollection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionTaxIdCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionTaxIdCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionTaxIdCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionTaxIdCollection must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val required = json.decodeRequired<InlinePaymentPagesCheckoutSessionTaxIdCollectionRequiredX90344866>(rawObject, "required")
      return PaymentPagesCheckoutSessionTaxIdCollection(
        enabled = enabled,
        required = required,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionTaxIdCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionTaxIdCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("required", json.encodeToJsonElement(value.required))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionTaxIdCollection(block: PaymentPagesCheckoutSessionTaxIdCollection.Builder.() -> Unit): PaymentPagesCheckoutSessionTaxIdCollection = PaymentPagesCheckoutSessionTaxIdCollection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionTaxIdCollection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

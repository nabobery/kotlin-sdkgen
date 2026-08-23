package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_phone_number_collection
 */
@Serializable(with = PaymentLinksResourcePhoneNumberCollection.Serializer::class)
public class PaymentLinksResourcePhoneNumberCollection(
  /**
   * If `true`, a phone number will be collected during checkout.
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

    public fun build(): PaymentLinksResourcePhoneNumberCollection {
      check(enabledValue != null) { "enabled is required" }
      return PaymentLinksResourcePhoneNumberCollection(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourcePhoneNumberCollection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourcePhoneNumberCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourcePhoneNumberCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourcePhoneNumberCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourcePhoneNumberCollection must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentLinksResourcePhoneNumberCollection(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourcePhoneNumberCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourcePhoneNumberCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourcePhoneNumberCollection(block: PaymentLinksResourcePhoneNumberCollection.Builder.() -> Unit): PaymentLinksResourcePhoneNumberCollection = PaymentLinksResourcePhoneNumberCollection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourcePhoneNumberCollection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

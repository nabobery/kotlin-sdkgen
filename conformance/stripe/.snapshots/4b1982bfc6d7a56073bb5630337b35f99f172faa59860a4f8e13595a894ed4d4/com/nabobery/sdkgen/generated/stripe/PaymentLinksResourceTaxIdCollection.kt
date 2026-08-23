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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_tax_id_collection
 */
@Serializable(with = PaymentLinksResourceTaxIdCollection.Serializer::class)
public class PaymentLinksResourceTaxIdCollection(
  /**
   * Indicates whether tax ID collection is enabled for the session.
   */
  public val enabled: Boolean,
  public val required: InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var requiredValue: InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332? = null

    public var required: InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332
      get() = requireNotNull(requiredValue) { "required is required" }
      set(`value`) {
        requiredValue = value
      }

    public fun build(): PaymentLinksResourceTaxIdCollection {
      check(enabledValue != null) { "enabled is required" }
      check(requiredValue != null) { "required is required" }
      return PaymentLinksResourceTaxIdCollection(
        enabled = enabled,
        required = required,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceTaxIdCollection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceTaxIdCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceTaxIdCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceTaxIdCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceTaxIdCollection must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val required = json.decodeRequired<InlinePaymentLinksResourceTaxIdCollectionRequiredXd1de9332>(rawObject, "required")
      return PaymentLinksResourceTaxIdCollection(
        enabled = enabled,
        required = required,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceTaxIdCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceTaxIdCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("required", json.encodeToJsonElement(value.required))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceTaxIdCollection(block: PaymentLinksResourceTaxIdCollection.Builder.() -> Unit): PaymentLinksResourceTaxIdCollection = PaymentLinksResourceTaxIdCollection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceTaxIdCollection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_custom
 */
@Serializable(with = PaymentMethodCustom.Serializer::class)
public class PaymentMethodCustom(
  /**
   * ID of the Dashboard-only CustomPaymentMethodType. Not expandable.
   */
  public val type: String,
  /**
   * Display name of the Dashboard-only CustomPaymentMethodType.
   */
  public val displayName: String? = null,
  /**
   * Contains information about the Dashboard-only CustomPaymentMethodType logo.
   */
  public val logo: InlinePaymentMethodCustomLogoX97938b2e? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Display name of the Dashboard-only CustomPaymentMethodType.
     */
    public var displayName: String? = null

    /**
     * Contains information about the Dashboard-only CustomPaymentMethodType logo.
     */
    public var logo: InlinePaymentMethodCustomLogoX97938b2e? = null

    public fun build(): PaymentMethodCustom {
      check(typeValue != null) { "type is required" }
      return PaymentMethodCustom(
        type = type,
        displayName = displayName,
        logo = logo,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodCustom = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodCustom> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodCustom {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodCustom")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodCustom must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return PaymentMethodCustom(
        type = type,
        displayName = rawObject["display_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        logo = rawObject["logo"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCustomLogoX97938b2e?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodCustom) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodCustom")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.displayName?.let { put("display_name", it) }
        value.logo?.let { put("logo", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodCustom(block: PaymentMethodCustom.Builder.() -> Unit): PaymentMethodCustom = PaymentMethodCustom.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodCustom is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

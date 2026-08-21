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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_automatic_tax
 */
@Serializable(with = PaymentLinksResourceAutomaticTax.Serializer::class)
public class PaymentLinksResourceAutomaticTax(
  /**
   * If `true`, tax will be calculated automatically using the customer's location.
   */
  public val enabled: Boolean,
  /**
   * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
   * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
   */
  public val liability: InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
     * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
     */
    public var liability: InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176? = null

    public fun build(): PaymentLinksResourceAutomaticTax {
      check(enabledValue != null) { "enabled is required" }
      return PaymentLinksResourceAutomaticTax(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceAutomaticTax = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceAutomaticTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceAutomaticTax {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceAutomaticTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceAutomaticTax must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentLinksResourceAutomaticTax(
        enabled = enabled,
        liability = rawObject["liability"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceAutomaticTaxLiabilityXa5e53176?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceAutomaticTax) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceAutomaticTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceAutomaticTax(block: PaymentLinksResourceAutomaticTax.Builder.() -> Unit): PaymentLinksResourceAutomaticTax = PaymentLinksResourceAutomaticTax.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceAutomaticTax is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

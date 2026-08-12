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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_automatic_tax
 */
@Serializable(with = PaymentPagesCheckoutSessionAutomaticTax.Serializer::class)
public class PaymentPagesCheckoutSessionAutomaticTax(
  /**
   * Indicates whether automatic tax is enabled for the session
   */
  public val enabled: Boolean,
  /**
   * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
   * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
   */
  public val liability: InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0? = null,
  /**
   * The tax provider powering automatic tax.
   */
  public val provider: String? = null,
  /**
   * The status of the most recent automated tax calculation for this session.
   */
  public val status: InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa? = null,
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
    public var liability: InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0? = null

    /**
     * The tax provider powering automatic tax.
     */
    public var provider: String? = null

    /**
     * The status of the most recent automated tax calculation for this session.
     */
    public var status: InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa? = null

    public fun build(): PaymentPagesCheckoutSessionAutomaticTax {
      check(enabledValue != null) { "enabled is required" }
      return PaymentPagesCheckoutSessionAutomaticTax(
        enabled = enabled,
        liability = liability,
        provider = provider,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionAutomaticTax = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionAutomaticTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionAutomaticTax {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionAutomaticTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionAutomaticTax must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentPagesCheckoutSessionAutomaticTax(
        enabled = enabled,
        liability = rawObject["liability"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0?>(element) },
        provider = rawObject["provider"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionAutomaticTax) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionAutomaticTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionAutomaticTax(block: PaymentPagesCheckoutSessionAutomaticTax.Builder.() -> Unit): PaymentPagesCheckoutSessionAutomaticTax = PaymentPagesCheckoutSessionAutomaticTax.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionAutomaticTax is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

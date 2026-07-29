package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentPagesCheckoutSessionAfterExpirationRecoveryView(
  @SerialName("allow_promotion_codes")
  public val allowPromotionCodes: Boolean,
  public val enabled: Boolean,
  @SerialName("expires_at")
  public val expiresAt: Int? = null,
  public val url: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_after_expiration_recovery
 */
@Serializable(with = PaymentPagesCheckoutSessionAfterExpirationRecovery.Serializer::class)
public class PaymentPagesCheckoutSessionAfterExpirationRecovery(
  /**
   * Enables user redeemable promotion codes on the recovered Checkout Sessions. Defaults to `false`
   */
  public val allowPromotionCodes: Boolean,
  /**
   * If `true`, a recovery url will be generated to recover this Checkout Session if it
   * expires before a transaction is completed. It will be attached to the
   * Checkout Session object upon expiration.
   */
  public val enabled: Boolean,
  /**
   * The timestamp at which the recovery URL will expire.
   */
  public val expiresAt: Int? = null,
  /**
   * URL that creates a new Checkout Session when clicked that is a copy of this expired Checkout Session
   */
  public val url: String? = null,
) {
  public class Builder {
    private var allowPromotionCodesValue: Boolean? = null

    public var allowPromotionCodes: Boolean
      get() = requireNotNull(allowPromotionCodesValue) { "allowPromotionCodes is required" }
      set(`value`) {
        allowPromotionCodesValue = value
      }

    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * The timestamp at which the recovery URL will expire.
     */
    public var expiresAt: Int? = null

    /**
     * URL that creates a new Checkout Session when clicked that is a copy of this expired Checkout Session
     */
    public var url: String? = null

    public fun build(): PaymentPagesCheckoutSessionAfterExpirationRecovery {
      check(allowPromotionCodesValue != null) { "allowPromotionCodes is required" }
      check(enabledValue != null) { "enabled is required" }
      return PaymentPagesCheckoutSessionAfterExpirationRecovery(
        allowPromotionCodes = allowPromotionCodes,
        enabled = enabled,
        expiresAt = expiresAt,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionAfterExpirationRecovery = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionAfterExpirationRecovery> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionAfterExpirationRecovery {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionAfterExpirationRecovery")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionAfterExpirationRecovery must be a JSON object")
      val allowPromotionCodes = json.decodeRequired<Boolean>(rawObject, "allow_promotion_codes")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentPagesCheckoutSessionAfterExpirationRecovery(
        allowPromotionCodes = allowPromotionCodes,
        enabled = enabled,
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionAfterExpirationRecovery) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionAfterExpirationRecovery")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allow_promotion_codes", json.encodeToJsonElement(value.allowPromotionCodes))
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionAfterExpirationRecovery(block: PaymentPagesCheckoutSessionAfterExpirationRecovery.Builder.() -> Unit): PaymentPagesCheckoutSessionAfterExpirationRecovery = PaymentPagesCheckoutSessionAfterExpirationRecovery.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionAfterExpirationRecovery is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

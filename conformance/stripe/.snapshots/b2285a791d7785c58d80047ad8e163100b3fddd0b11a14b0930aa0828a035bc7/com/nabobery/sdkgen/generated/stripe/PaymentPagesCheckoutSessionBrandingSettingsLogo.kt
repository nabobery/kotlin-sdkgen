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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentPagesCheckoutSessionBrandingSettingsLogoView(
  public val `file`: String? = null,
  public val type: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc,
  public val url: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_branding_settings_logo
 */
@Serializable(with = PaymentPagesCheckoutSessionBrandingSettingsLogo.Serializer::class)
public class PaymentPagesCheckoutSessionBrandingSettingsLogo(
  /**
   * The type of image for the logo. Must be one of `file` or `url`.
   */
  public val type: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc,
  /**
   * The ID of a [File upload](https://stripe.com/docs/api/files) representing the logo. Purpose must be
   * `business_logo`. Required if `type` is `file` and disallowed otherwise.
   */
  public val `file`: String? = null,
  /**
   * The URL of the image. Present when `type` is `url`.
   */
  public val url: String? = null,
) {
  public class Builder {
    private var typeValue: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc? =
        null

    public var type: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The ID of a [File upload](https://stripe.com/docs/api/files) representing the logo. Purpose must be
     * `business_logo`. Required if `type` is `file` and disallowed otherwise.
     */
    public var `file`: String? = null

    /**
     * The URL of the image. Present when `type` is `url`.
     */
    public var url: String? = null

    public fun build(): PaymentPagesCheckoutSessionBrandingSettingsLogo {
      check(typeValue != null) { "type is required" }
      return PaymentPagesCheckoutSessionBrandingSettingsLogo(
        type = type,
        file = file,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionBrandingSettingsLogo = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionBrandingSettingsLogo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionBrandingSettingsLogo {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionBrandingSettingsLogo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionBrandingSettingsLogo must be a JSON object")
      val type = json.decodeRequired<InlinePaymentPagesCheckoutSessionBrandingSettingsLogoTypeXb1f8ecdc>(rawObject, "type")
      return PaymentPagesCheckoutSessionBrandingSettingsLogo(
        type = type,
        file = rawObject["file"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionBrandingSettingsLogo) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionBrandingSettingsLogo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.file?.let { put("file", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionBrandingSettingsLogo(block: PaymentPagesCheckoutSessionBrandingSettingsLogo.Builder.() -> Unit): PaymentPagesCheckoutSessionBrandingSettingsLogo = PaymentPagesCheckoutSessionBrandingSettingsLogo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionBrandingSettingsLogo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

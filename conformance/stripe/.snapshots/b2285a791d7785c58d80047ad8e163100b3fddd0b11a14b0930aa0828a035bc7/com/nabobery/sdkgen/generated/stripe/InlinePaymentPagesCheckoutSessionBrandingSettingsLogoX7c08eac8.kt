package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Branch {
  PaymentPagesCheckoutSessionBrandingSettingsLogo,
}

public sealed class InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Inspection(
  public val matchesPaymentPagesCheckoutSessionBrandingSettingsLogo: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionBrandingSettingsLogo).count { it }
}

/**
 * The logo for the Checkout Session. You cannot set both `logo` and `icon`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_branding_settings/properties/logo
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8.Serializer::class)
public class InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Inspection,
) {
  public val paymentPagesCheckoutSessionBrandingSettingsLogo:
      PaymentPagesCheckoutSessionBrandingSettingsLogoView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionBrandingSettingsLogo) json.decodeFromJsonElement<PaymentPagesCheckoutSessionBrandingSettingsLogoView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionBrandingSettingsLogo) add(InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Branch.PaymentPagesCheckoutSessionBrandingSettingsLogo)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8NoMatchException("InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8(element: JsonElement): InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Inspection(
    matchesPaymentPagesCheckoutSessionBrandingSettingsLogo = false,
    failures = listOf("PaymentPagesCheckoutSessionBrandingSettingsLogo: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionBrandingSettingsLogo = raw["type"] != null
  return InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8Inspection(
    matchesPaymentPagesCheckoutSessionBrandingSettingsLogo = matchesPaymentPagesCheckoutSessionBrandingSettingsLogo,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionBrandingSettingsLogo) add("PaymentPagesCheckoutSessionBrandingSettingsLogo: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

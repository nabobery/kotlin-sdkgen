package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Branch {
  PaymentPagesCheckoutSessionBrandingSettingsIcon,
}

public sealed class InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Inspection(
  public val matchesPaymentPagesCheckoutSessionBrandingSettingsIcon: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionBrandingSettingsIcon).count { it }
}

/**
 * The icon for the Checkout Session. You cannot set both `logo` and `icon`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_branding_settings/properties/icon
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01.Serializer::class)
public class InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Inspection,
) {
  public val paymentPagesCheckoutSessionBrandingSettingsIcon:
      PaymentPagesCheckoutSessionBrandingSettingsIconView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionBrandingSettingsIcon) json.decodeFromJsonElement<PaymentPagesCheckoutSessionBrandingSettingsIconView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionBrandingSettingsIcon) add(InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Branch.PaymentPagesCheckoutSessionBrandingSettingsIcon)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01NoMatchException("InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01(element: JsonElement): InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Inspection(
    matchesPaymentPagesCheckoutSessionBrandingSettingsIcon = false,
    failures = listOf("PaymentPagesCheckoutSessionBrandingSettingsIcon: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionBrandingSettingsIcon = raw["type"] != null
  return InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01Inspection(
    matchesPaymentPagesCheckoutSessionBrandingSettingsIcon = matchesPaymentPagesCheckoutSessionBrandingSettingsIcon,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionBrandingSettingsIcon) add("PaymentPagesCheckoutSessionBrandingSettingsIcon: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

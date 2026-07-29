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

public enum class InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Branch {
  PaymentPagesCheckoutSessionCustomTextPosition,
}

public sealed class InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Inspection(
  public val matchesPaymentPagesCheckoutSessionCustomTextPosition: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed in place of the default terms of service agreement text.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_text/properties/terms_of_servi
 * ce_acceptance
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417.Serializer::class)
public class InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Inspection,
) {
  public val paymentPagesCheckoutSessionCustomTextPosition:
      PaymentPagesCheckoutSessionCustomTextPositionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) json.decodeFromJsonElement<PaymentPagesCheckoutSessionCustomTextPositionView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) add(InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Branch.PaymentPagesCheckoutSessionCustomTextPosition)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417NoMatchException("InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417(element: JsonElement): InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Inspection(
    matchesPaymentPagesCheckoutSessionCustomTextPosition = false,
    failures = listOf("PaymentPagesCheckoutSessionCustomTextPosition: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionCustomTextPosition = raw["message"].isString()
  return InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417Inspection(
    matchesPaymentPagesCheckoutSessionCustomTextPosition = matchesPaymentPagesCheckoutSessionCustomTextPosition,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionCustomTextPosition) add("PaymentPagesCheckoutSessionCustomTextPosition: required properties 'message' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

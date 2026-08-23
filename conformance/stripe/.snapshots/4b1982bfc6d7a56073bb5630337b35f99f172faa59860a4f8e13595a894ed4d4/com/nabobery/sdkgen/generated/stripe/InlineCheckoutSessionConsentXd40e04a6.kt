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

public enum class InlineCheckoutSessionConsentXd40e04a6Branch {
  PaymentPagesCheckoutSessionConsent,
}

public sealed class InlineCheckoutSessionConsentXd40e04a6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionConsentXd40e04a6NoMatchException(
  message: String,
) : InlineCheckoutSessionConsentXd40e04a6DecodingException(message)

internal data class InlineCheckoutSessionConsentXd40e04a6Inspection(
  public val matchesPaymentPagesCheckoutSessionConsent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionConsent).count { it }
}

/**
 * Results of `consent_collection` for this session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/consent
 */
@Serializable(with = InlineCheckoutSessionConsentXd40e04a6.Serializer::class)
public class InlineCheckoutSessionConsentXd40e04a6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionConsentXd40e04a6Inspection,
) {
  public val paymentPagesCheckoutSessionConsent: PaymentPagesCheckoutSessionConsentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionConsent) json.decodeFromJsonElement<PaymentPagesCheckoutSessionConsentView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionConsentXd40e04a6Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionConsent) add(InlineCheckoutSessionConsentXd40e04a6Branch.PaymentPagesCheckoutSessionConsent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionConsentXd40e04a6 {
      val inspection = inspectInlineCheckoutSessionConsentXd40e04a6(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionConsentXd40e04a6NoMatchException("InlineCheckoutSessionConsentXd40e04a6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionConsentXd40e04a6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionConsentXd40e04a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionConsentXd40e04a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionConsentXd40e04a6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionConsentXd40e04a6) {
      encoder.requireJsonEncoder("InlineCheckoutSessionConsentXd40e04a6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionConsentXd40e04a6(element: JsonElement): InlineCheckoutSessionConsentXd40e04a6Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionConsentXd40e04a6Inspection(
    matchesPaymentPagesCheckoutSessionConsent = false,
    failures = listOf("PaymentPagesCheckoutSessionConsent: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionConsent = true
  return InlineCheckoutSessionConsentXd40e04a6Inspection(
    matchesPaymentPagesCheckoutSessionConsent = matchesPaymentPagesCheckoutSessionConsent,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionConsent) add("PaymentPagesCheckoutSessionConsent: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

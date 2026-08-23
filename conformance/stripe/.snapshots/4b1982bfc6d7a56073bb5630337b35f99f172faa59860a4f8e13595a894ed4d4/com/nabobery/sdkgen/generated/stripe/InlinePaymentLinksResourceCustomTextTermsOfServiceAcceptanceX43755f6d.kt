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

public enum class InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dBranch {
  PaymentLinksResourceCustomTextPosition,
}

public sealed class InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dNoMatchException(
  message: String,
) : InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dDecodingException(message)

internal data class InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dInspection(
  public val matchesPaymentLinksResourceCustomTextPosition: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed in place of the default terms of service agreement text.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_text/properties/terms_of_service_accep
 * tance
 */
@Serializable(with = InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d.Serializer::class)
public class InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dInspection,
) {
  public val paymentLinksResourceCustomTextPosition: PaymentLinksResourceCustomTextPositionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceCustomTextPosition) json.decodeFromJsonElement<PaymentLinksResourceCustomTextPositionView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dBranch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceCustomTextPosition) add(InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dBranch.PaymentLinksResourceCustomTextPosition)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d {
      val inspection = inspectInlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dNoMatchException("InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d(element: JsonElement): InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dInspection(
    matchesPaymentLinksResourceCustomTextPosition = false,
    failures = listOf("PaymentLinksResourceCustomTextPosition: expected JSON object"),
  )
  val matchesPaymentLinksResourceCustomTextPosition = raw["message"].isString()
  return InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6dInspection(
    matchesPaymentLinksResourceCustomTextPosition = matchesPaymentLinksResourceCustomTextPosition,
    failures = buildList {
      if (!matchesPaymentLinksResourceCustomTextPosition) add("PaymentLinksResourceCustomTextPosition: required properties 'message' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

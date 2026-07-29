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

public enum class InlinePaymentLinkRestrictionsXaf818cc6Branch {
  PaymentLinksResourceRestrictions,
}

public sealed class InlinePaymentLinkRestrictionsXaf818cc6DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkRestrictionsXaf818cc6NoMatchException(
  message: String,
) : InlinePaymentLinkRestrictionsXaf818cc6DecodingException(message)

internal data class InlinePaymentLinkRestrictionsXaf818cc6Inspection(
  public val matchesPaymentLinksResourceRestrictions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceRestrictions).count { it }
}

/**
 * Settings that restrict the usage of a payment link.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/restrictions
 */
@Serializable(with = InlinePaymentLinkRestrictionsXaf818cc6.Serializer::class)
public class InlinePaymentLinkRestrictionsXaf818cc6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkRestrictionsXaf818cc6Inspection,
) {
  public val paymentLinksResourceRestrictions: PaymentLinksResourceRestrictionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceRestrictions) json.decodeFromJsonElement<PaymentLinksResourceRestrictionsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkRestrictionsXaf818cc6Branch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceRestrictions) add(InlinePaymentLinkRestrictionsXaf818cc6Branch.PaymentLinksResourceRestrictions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkRestrictionsXaf818cc6 {
      val inspection = inspectInlinePaymentLinkRestrictionsXaf818cc6(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkRestrictionsXaf818cc6NoMatchException("InlinePaymentLinkRestrictionsXaf818cc6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkRestrictionsXaf818cc6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinkRestrictionsXaf818cc6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkRestrictionsXaf818cc6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkRestrictionsXaf818cc6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkRestrictionsXaf818cc6) {
      encoder.requireJsonEncoder("InlinePaymentLinkRestrictionsXaf818cc6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkRestrictionsXaf818cc6(element: JsonElement): InlinePaymentLinkRestrictionsXaf818cc6Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinkRestrictionsXaf818cc6Inspection(
    matchesPaymentLinksResourceRestrictions = false,
    failures = listOf("PaymentLinksResourceRestrictions: expected JSON object"),
  )
  val matchesPaymentLinksResourceRestrictions = raw["completed_sessions"] != null
  return InlinePaymentLinkRestrictionsXaf818cc6Inspection(
    matchesPaymentLinksResourceRestrictions = matchesPaymentLinksResourceRestrictions,
    failures = buildList {
      if (!matchesPaymentLinksResourceRestrictions) add("PaymentLinksResourceRestrictions: required properties 'completed_sessions' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

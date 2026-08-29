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

public enum class InlinePaymentLinkSubscriptionDataXc04bdbecBranch {
  PaymentLinksResourceSubscriptionData,
}

public sealed class InlinePaymentLinkSubscriptionDataXc04bdbecDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkSubscriptionDataXc04bdbecNoMatchException(
  message: String,
) : InlinePaymentLinkSubscriptionDataXc04bdbecDecodingException(message)

internal data class InlinePaymentLinkSubscriptionDataXc04bdbecInspection(
  public val matchesPaymentLinksResourceSubscriptionData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceSubscriptionData).count { it }
}

/**
 * When creating a subscription, the specified configuration data will be used. There must be at least one line item
 * with a recurring price to use `subscription_data`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/subscription_data
 */
@Serializable(with = InlinePaymentLinkSubscriptionDataXc04bdbec.Serializer::class)
public class InlinePaymentLinkSubscriptionDataXc04bdbec internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkSubscriptionDataXc04bdbecInspection,
) {
  public val paymentLinksResourceSubscriptionData: PaymentLinksResourceSubscriptionDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceSubscriptionData) json.decodeFromJsonElement<PaymentLinksResourceSubscriptionDataView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkSubscriptionDataXc04bdbecBranch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceSubscriptionData) add(InlinePaymentLinkSubscriptionDataXc04bdbecBranch.PaymentLinksResourceSubscriptionData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkSubscriptionDataXc04bdbec {
      val inspection = inspectInlinePaymentLinkSubscriptionDataXc04bdbec(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkSubscriptionDataXc04bdbecNoMatchException("InlinePaymentLinkSubscriptionDataXc04bdbec matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkSubscriptionDataXc04bdbec(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkSubscriptionDataXc04bdbec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkSubscriptionDataXc04bdbec {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkSubscriptionDataXc04bdbec")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkSubscriptionDataXc04bdbec) {
      encoder.requireJsonEncoder("InlinePaymentLinkSubscriptionDataXc04bdbec").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkSubscriptionDataXc04bdbec(element: JsonElement): InlinePaymentLinkSubscriptionDataXc04bdbecInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinkSubscriptionDataXc04bdbecInspection(
    matchesPaymentLinksResourceSubscriptionData = false,
    failures = listOf("PaymentLinksResourceSubscriptionData: expected JSON object"),
  )
  val matchesPaymentLinksResourceSubscriptionData = raw["invoice_settings"] != null && raw["metadata"] != null
  return InlinePaymentLinkSubscriptionDataXc04bdbecInspection(
    matchesPaymentLinksResourceSubscriptionData = matchesPaymentLinksResourceSubscriptionData,
    failures = buildList {
      if (!matchesPaymentLinksResourceSubscriptionData) add("PaymentLinksResourceSubscriptionData: required properties 'invoice_settings', 'metadata' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

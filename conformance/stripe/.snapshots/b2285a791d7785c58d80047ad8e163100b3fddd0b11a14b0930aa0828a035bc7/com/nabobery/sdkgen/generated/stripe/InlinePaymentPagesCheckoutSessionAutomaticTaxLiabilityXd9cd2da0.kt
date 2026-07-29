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

public enum class InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Branch {
  ConnectAccountReference,
}

public sealed class InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Inspection(
  public val matchesConnectAccountReference: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConnectAccountReference).count { it }
}

/**
 * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
 * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_automatic_tax/properties/liability
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0.Serializer::class)
public class InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Inspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Branch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Branch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0NoMatchException("InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0(element: JsonElement): InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Inspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlinePaymentPagesCheckoutSessionAutomaticTaxLiabilityXd9cd2da0Inspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

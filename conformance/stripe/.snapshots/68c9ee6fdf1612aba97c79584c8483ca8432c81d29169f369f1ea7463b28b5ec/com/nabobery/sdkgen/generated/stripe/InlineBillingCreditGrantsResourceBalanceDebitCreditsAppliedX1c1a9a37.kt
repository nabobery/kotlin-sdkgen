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

public enum class InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Branch {
  BillingCreditGrantsResourceBalanceCreditsApplied,
}

public sealed class InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37NoMatchException(
  message: String,
) : InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37DecodingException(message)

internal data class InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Inspection(
  public val matchesBillingCreditGrantsResourceBalanceCreditsApplied: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingCreditGrantsResourceBalanceCreditsApplied).count { it }
}

/**
 * Details of how the billing credits were applied to an invoice. Only present if `type` is `credits_applied`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_balance_debit/properties/credits_appl
 * ied
 */
@Serializable(with = InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37.Serializer::class)
public class InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Inspection,
) {
  public val billingCreditGrantsResourceBalanceCreditsApplied:
      BillingCreditGrantsResourceBalanceCreditsAppliedView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingCreditGrantsResourceBalanceCreditsApplied) json.decodeFromJsonElement<BillingCreditGrantsResourceBalanceCreditsAppliedView>(raw) else null }

  public val matchedBranches:
      Set<InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Branch>
    get() = buildSet {
      if (inspection.matchesBillingCreditGrantsResourceBalanceCreditsApplied) add(InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Branch.BillingCreditGrantsResourceBalanceCreditsApplied)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37 {
      val inspection = inspectInlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37NoMatchException("InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37) {
      encoder.requireJsonEncoder("InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37(element: JsonElement): InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Inspection {
  val raw = element as? JsonObject ?: return InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Inspection(
    matchesBillingCreditGrantsResourceBalanceCreditsApplied = false,
    failures = listOf("BillingCreditGrantsResourceBalanceCreditsApplied: expected JSON object"),
  )
  val matchesBillingCreditGrantsResourceBalanceCreditsApplied = raw["invoice"] != null && raw["invoice_line_item"].isString()
  return InlineBillingCreditGrantsResourceBalanceDebitCreditsAppliedX1c1a9a37Inspection(
    matchesBillingCreditGrantsResourceBalanceCreditsApplied = matchesBillingCreditGrantsResourceBalanceCreditsApplied,
    failures = buildList {
      if (!matchesBillingCreditGrantsResourceBalanceCreditsApplied) add("BillingCreditGrantsResourceBalanceCreditsApplied: required properties 'invoice', 'invoice_line_item' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

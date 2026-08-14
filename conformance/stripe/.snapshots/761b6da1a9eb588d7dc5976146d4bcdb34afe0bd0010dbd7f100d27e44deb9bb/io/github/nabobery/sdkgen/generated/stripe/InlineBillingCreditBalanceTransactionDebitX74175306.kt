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

public enum class InlineBillingCreditBalanceTransactionDebitX74175306Branch {
  BillingCreditGrantsResourceBalanceDebit,
}

public sealed class InlineBillingCreditBalanceTransactionDebitX74175306DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingCreditBalanceTransactionDebitX74175306NoMatchException(
  message: String,
) : InlineBillingCreditBalanceTransactionDebitX74175306DecodingException(message)

internal data class InlineBillingCreditBalanceTransactionDebitX74175306Inspection(
  public val matchesBillingCreditGrantsResourceBalanceDebit: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingCreditGrantsResourceBalanceDebit).count { it }
}

/**
 * Debit details for this credit balance transaction. Only present if type is `debit`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_transaction/properties/debit
 */
@Serializable(with = InlineBillingCreditBalanceTransactionDebitX74175306.Serializer::class)
public class InlineBillingCreditBalanceTransactionDebitX74175306 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingCreditBalanceTransactionDebitX74175306Inspection,
) {
  public val billingCreditGrantsResourceBalanceDebit: BillingCreditGrantsResourceBalanceDebitView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingCreditGrantsResourceBalanceDebit) json.decodeFromJsonElement<BillingCreditGrantsResourceBalanceDebitView>(raw) else null }

  public val matchedBranches: Set<InlineBillingCreditBalanceTransactionDebitX74175306Branch>
    get() = buildSet {
      if (inspection.matchesBillingCreditGrantsResourceBalanceDebit) add(InlineBillingCreditBalanceTransactionDebitX74175306Branch.BillingCreditGrantsResourceBalanceDebit)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingCreditBalanceTransactionDebitX74175306 {
      val inspection = inspectInlineBillingCreditBalanceTransactionDebitX74175306(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingCreditBalanceTransactionDebitX74175306NoMatchException("InlineBillingCreditBalanceTransactionDebitX74175306 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingCreditBalanceTransactionDebitX74175306(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditBalanceTransactionDebitX74175306> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceTransactionDebitX74175306 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditBalanceTransactionDebitX74175306")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditBalanceTransactionDebitX74175306) {
      encoder.requireJsonEncoder("InlineBillingCreditBalanceTransactionDebitX74175306").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingCreditBalanceTransactionDebitX74175306(element: JsonElement): InlineBillingCreditBalanceTransactionDebitX74175306Inspection {
  val raw = element as? JsonObject ?: return InlineBillingCreditBalanceTransactionDebitX74175306Inspection(
    matchesBillingCreditGrantsResourceBalanceDebit = false,
    failures = listOf("BillingCreditGrantsResourceBalanceDebit: expected JSON object"),
  )
  val matchesBillingCreditGrantsResourceBalanceDebit = raw["amount"] != null && raw["type"] != null
  return InlineBillingCreditBalanceTransactionDebitX74175306Inspection(
    matchesBillingCreditGrantsResourceBalanceDebit = matchesBillingCreditGrantsResourceBalanceDebit,
    failures = buildList {
      if (!matchesBillingCreditGrantsResourceBalanceDebit) add("BillingCreditGrantsResourceBalanceDebit: required properties 'amount', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

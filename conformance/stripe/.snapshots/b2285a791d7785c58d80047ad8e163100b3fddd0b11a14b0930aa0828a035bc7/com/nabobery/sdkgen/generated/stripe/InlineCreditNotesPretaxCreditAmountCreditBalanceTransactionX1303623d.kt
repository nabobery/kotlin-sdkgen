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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dBranch {
  Branch1,
  BillingCreditBalanceTransaction,
}

public sealed class InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dNoMatchException(
  message: String,
) : InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dDecodingException(message)

internal data class InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dInspection(
  public val matchesBranch1: Boolean,
  public val matchesBillingCreditBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBillingCreditBalanceTransaction).count { it }
}

/**
 * The credit balance transaction that was applied to get this pretax credit amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/credit_notes_pretax_credit_amount/properties/credit_balance_transact
 * ion
 */
@Serializable(with = InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d.Serializer::class)
public class InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val billingCreditBalanceTransaction: BillingCreditBalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingCreditBalanceTransaction) json.decodeFromJsonElement<BillingCreditBalanceTransaction>(raw) else null }

  public val matchedBranches:
      Set<InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dBranch.Branch1)
      if (inspection.matchesBillingCreditBalanceTransaction) add(InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dBranch.BillingCreditBalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d {
      val inspection = inspectInlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d(raw)
      if (inspection.matchCount == 0) {
        throw InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dNoMatchException("InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d) {
      encoder.requireJsonEncoder("InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623d(element: JsonElement): InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBillingCreditBalanceTransaction = element.isJsonDecodable<BillingCreditBalanceTransaction>()
  return InlineCreditNotesPretaxCreditAmountCreditBalanceTransactionX1303623dInspection(
    matchesBranch1 = matchesBranch1,
    matchesBillingCreditBalanceTransaction = matchesBillingCreditBalanceTransaction,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBillingCreditBalanceTransaction) add("BillingCreditBalanceTransaction: value does not match BillingCreditBalanceTransaction")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

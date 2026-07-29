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

public enum class InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dBranch {
  Branch1,
  BillingCreditBalanceTransaction,
}

public sealed class InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dNoMatchException(
  message: String,
) : InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dDecodingException(message)

internal data class InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/invoices_resource_pretax_credit_amount/properties/credit_balance_tra
 * nsaction
 */
@Serializable(with = InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d.Serializer::class)
public class InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val billingCreditBalanceTransaction: BillingCreditBalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingCreditBalanceTransaction) json.decodeFromJsonElement<BillingCreditBalanceTransaction>(raw) else null }

  public val matchedBranches:
      Set<InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dBranch.Branch1)
      if (inspection.matchesBillingCreditBalanceTransaction) add(InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dBranch.BillingCreditBalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d {
      val inspection = inspectInlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dNoMatchException("InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d) {
      encoder.requireJsonEncoder("InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2d(element: JsonElement): InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBillingCreditBalanceTransaction = element.isJsonDecodable<BillingCreditBalanceTransaction>()
  return InlineInvoicesResourcePretaxCreditAmountCreditBalanceTransactionX4cc7eb2dInspection(
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

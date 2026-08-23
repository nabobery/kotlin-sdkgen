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

public enum class InlineCustomerBalanceResou7348BalanceTransactionX26d64799Branch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineCustomerBalanceResou7348BalanceTransactionX26d64799DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerBalanceResou7348BalanceTransactionX26d64799NoMatchException(
  message: String,
) : InlineCustomerBalanceResou7348BalanceTransactionX26d64799DecodingException(message)

internal data class InlineCustomerBalanceResou7348BalanceTransactionX26d64799Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * The [Balance Transaction](https://docs.stripe.com/api/balance_transactions/object) that corresponds to funds taken
 * out of your Stripe balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_adjusted
 * _for_overdraft/properties/balance_transaction
 */
@Serializable(with = InlineCustomerBalanceResou7348BalanceTransactionX26d64799.Serializer::class)
public class InlineCustomerBalanceResou7348BalanceTransactionX26d64799 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerBalanceResou7348BalanceTransactionX26d64799Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineCustomerBalanceResou7348BalanceTransactionX26d64799Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerBalanceResou7348BalanceTransactionX26d64799Branch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineCustomerBalanceResou7348BalanceTransactionX26d64799Branch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerBalanceResou7348BalanceTransactionX26d64799 {
      val inspection = inspectInlineCustomerBalanceResou7348BalanceTransactionX26d64799(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerBalanceResou7348BalanceTransactionX26d64799NoMatchException("InlineCustomerBalanceResou7348BalanceTransactionX26d64799 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerBalanceResou7348BalanceTransactionX26d64799(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceResou7348BalanceTransactionX26d64799> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceResou7348BalanceTransactionX26d64799 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceResou7348BalanceTransactionX26d64799")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceResou7348BalanceTransactionX26d64799) {
      encoder.requireJsonEncoder("InlineCustomerBalanceResou7348BalanceTransactionX26d64799").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerBalanceResou7348BalanceTransactionX26d64799(element: JsonElement): InlineCustomerBalanceResou7348BalanceTransactionX26d64799Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineCustomerBalanceResou7348BalanceTransactionX26d64799Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBalanceTransaction = matchesBalanceTransaction,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBalanceTransaction) add("BalanceTransaction: value does not match BalanceTransaction")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

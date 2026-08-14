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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Branch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineCustomerBalanceResou7c01BalanceTransactionX245622a8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerBalanceResou7c01BalanceTransactionX245622a8NoMatchException(
  message: String,
) : InlineCustomerBalanceResou7c01BalanceTransactionX245622a8DecodingException(message)

internal data class InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * The [Balance Transaction](https://docs.stripe.com/api/balance_transactions/object) that corresponds to funds
 * transferred to your Stripe balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_transfer
 * red_to_balance/properties/balance_transaction
 */
@Serializable(with = InlineCustomerBalanceResou7c01BalanceTransactionX245622a8.Serializer::class)
public class InlineCustomerBalanceResou7c01BalanceTransactionX245622a8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Branch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Branch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerBalanceResou7c01BalanceTransactionX245622a8 {
      val inspection = inspectInlineCustomerBalanceResou7c01BalanceTransactionX245622a8(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerBalanceResou7c01BalanceTransactionX245622a8NoMatchException("InlineCustomerBalanceResou7c01BalanceTransactionX245622a8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerBalanceResou7c01BalanceTransactionX245622a8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceResou7c01BalanceTransactionX245622a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceResou7c01BalanceTransactionX245622a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceResou7c01BalanceTransactionX245622a8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceResou7c01BalanceTransactionX245622a8) {
      encoder.requireJsonEncoder("InlineCustomerBalanceResou7c01BalanceTransactionX245622a8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerBalanceResou7c01BalanceTransactionX245622a8(element: JsonElement): InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineCustomerBalanceResou7c01BalanceTransactionX245622a8Inspection(
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

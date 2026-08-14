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

public enum class InlinePayoutFailureBalanceTransactionX38dfbc94Branch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlinePayoutFailureBalanceTransactionX38dfbc94DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePayoutFailureBalanceTransactionX38dfbc94NoMatchException(
  message: String,
) : InlinePayoutFailureBalanceTransactionX38dfbc94DecodingException(message)

internal data class InlinePayoutFailureBalanceTransactionX38dfbc94Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * If the payout fails or cancels, this is the ID of the balance transaction that reverses the initial balance
 * transaction and returns the funds from the failed payout back in your balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/failure_balance_transaction
 */
@Serializable(with = InlinePayoutFailureBalanceTransactionX38dfbc94.Serializer::class)
public class InlinePayoutFailureBalanceTransactionX38dfbc94 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePayoutFailureBalanceTransactionX38dfbc94Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlinePayoutFailureBalanceTransactionX38dfbc94Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePayoutFailureBalanceTransactionX38dfbc94Branch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlinePayoutFailureBalanceTransactionX38dfbc94Branch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePayoutFailureBalanceTransactionX38dfbc94 {
      val inspection = inspectInlinePayoutFailureBalanceTransactionX38dfbc94(raw)
      if (inspection.matchCount == 0) {
        throw InlinePayoutFailureBalanceTransactionX38dfbc94NoMatchException("InlinePayoutFailureBalanceTransactionX38dfbc94 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePayoutFailureBalanceTransactionX38dfbc94(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePayoutFailureBalanceTransactionX38dfbc94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePayoutFailureBalanceTransactionX38dfbc94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePayoutFailureBalanceTransactionX38dfbc94")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePayoutFailureBalanceTransactionX38dfbc94) {
      encoder.requireJsonEncoder("InlinePayoutFailureBalanceTransactionX38dfbc94").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePayoutFailureBalanceTransactionX38dfbc94(element: JsonElement): InlinePayoutFailureBalanceTransactionX38dfbc94Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlinePayoutFailureBalanceTransactionX38dfbc94Inspection(
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

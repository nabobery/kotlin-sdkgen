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

public enum class InlineRefundFailureBalanceTransactionX88292ff3Branch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineRefundFailureBalanceTransactionX88292ff3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineRefundFailureBalanceTransactionX88292ff3NoMatchException(
  message: String,
) : InlineRefundFailureBalanceTransactionX88292ff3DecodingException(message)

internal data class InlineRefundFailureBalanceTransactionX88292ff3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * After the refund fails, this balance transaction describes the adjustment made on your account balance that reverses
 * the initial balance transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/failure_balance_transaction
 */
@Serializable(with = InlineRefundFailureBalanceTransactionX88292ff3.Serializer::class)
public class InlineRefundFailureBalanceTransactionX88292ff3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRefundFailureBalanceTransactionX88292ff3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineRefundFailureBalanceTransactionX88292ff3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineRefundFailureBalanceTransactionX88292ff3Branch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineRefundFailureBalanceTransactionX88292ff3Branch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRefundFailureBalanceTransactionX88292ff3 {
      val inspection = inspectInlineRefundFailureBalanceTransactionX88292ff3(raw)
      if (inspection.matchCount == 0) {
        throw InlineRefundFailureBalanceTransactionX88292ff3NoMatchException("InlineRefundFailureBalanceTransactionX88292ff3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRefundFailureBalanceTransactionX88292ff3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineRefundFailureBalanceTransactionX88292ff3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRefundFailureBalanceTransactionX88292ff3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRefundFailureBalanceTransactionX88292ff3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRefundFailureBalanceTransactionX88292ff3) {
      encoder.requireJsonEncoder("InlineRefundFailureBalanceTransactionX88292ff3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRefundFailureBalanceTransactionX88292ff3(element: JsonElement): InlineRefundFailureBalanceTransactionX88292ff3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineRefundFailureBalanceTransactionX88292ff3Inspection(
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

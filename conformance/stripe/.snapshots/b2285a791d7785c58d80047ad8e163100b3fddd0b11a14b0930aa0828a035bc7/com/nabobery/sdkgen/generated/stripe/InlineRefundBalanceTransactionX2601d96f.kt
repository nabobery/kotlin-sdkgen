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

public enum class InlineRefundBalanceTransactionX2601d96fBranch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineRefundBalanceTransactionX2601d96fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineRefundBalanceTransactionX2601d96fNoMatchException(
  message: String,
) : InlineRefundBalanceTransactionX2601d96fDecodingException(message)

internal data class InlineRefundBalanceTransactionX2601d96fInspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * Balance transaction that describes the impact on your account balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/balance_transaction
 */
@Serializable(with = InlineRefundBalanceTransactionX2601d96f.Serializer::class)
public class InlineRefundBalanceTransactionX2601d96f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRefundBalanceTransactionX2601d96fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineRefundBalanceTransactionX2601d96fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineRefundBalanceTransactionX2601d96fBranch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineRefundBalanceTransactionX2601d96fBranch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRefundBalanceTransactionX2601d96f {
      val inspection = inspectInlineRefundBalanceTransactionX2601d96f(raw)
      if (inspection.matchCount == 0) {
        throw InlineRefundBalanceTransactionX2601d96fNoMatchException("InlineRefundBalanceTransactionX2601d96f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRefundBalanceTransactionX2601d96f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineRefundBalanceTransactionX2601d96f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRefundBalanceTransactionX2601d96f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRefundBalanceTransactionX2601d96f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRefundBalanceTransactionX2601d96f) {
      encoder.requireJsonEncoder("InlineRefundBalanceTransactionX2601d96f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRefundBalanceTransactionX2601d96f(element: JsonElement): InlineRefundBalanceTransactionX2601d96fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineRefundBalanceTransactionX2601d96fInspection(
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

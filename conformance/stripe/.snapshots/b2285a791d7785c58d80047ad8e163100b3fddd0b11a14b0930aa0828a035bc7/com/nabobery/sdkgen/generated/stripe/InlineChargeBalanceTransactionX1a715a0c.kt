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

public enum class InlineChargeBalanceTransactionX1a715a0cBranch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineChargeBalanceTransactionX1a715a0cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeBalanceTransactionX1a715a0cNoMatchException(
  message: String,
) : InlineChargeBalanceTransactionX1a715a0cDecodingException(message)

internal data class InlineChargeBalanceTransactionX1a715a0cInspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * ID of the balance transaction that describes the impact of this charge on your account balance (not including refunds
 * or disputes).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/balance_transaction
 */
@Serializable(with = InlineChargeBalanceTransactionX1a715a0c.Serializer::class)
public class InlineChargeBalanceTransactionX1a715a0c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeBalanceTransactionX1a715a0cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineChargeBalanceTransactionX1a715a0cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeBalanceTransactionX1a715a0cBranch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineChargeBalanceTransactionX1a715a0cBranch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeBalanceTransactionX1a715a0c {
      val inspection = inspectInlineChargeBalanceTransactionX1a715a0c(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeBalanceTransactionX1a715a0cNoMatchException("InlineChargeBalanceTransactionX1a715a0c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeBalanceTransactionX1a715a0c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineChargeBalanceTransactionX1a715a0c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeBalanceTransactionX1a715a0c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeBalanceTransactionX1a715a0c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeBalanceTransactionX1a715a0c) {
      encoder.requireJsonEncoder("InlineChargeBalanceTransactionX1a715a0c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeBalanceTransactionX1a715a0c(element: JsonElement): InlineChargeBalanceTransactionX1a715a0cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineChargeBalanceTransactionX1a715a0cInspection(
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

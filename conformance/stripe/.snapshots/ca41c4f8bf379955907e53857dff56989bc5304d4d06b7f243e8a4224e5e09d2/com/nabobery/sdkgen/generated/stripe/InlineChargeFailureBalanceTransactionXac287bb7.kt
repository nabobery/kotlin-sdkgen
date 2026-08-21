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

public enum class InlineChargeFailureBalanceTransactionXac287bb7Branch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineChargeFailureBalanceTransactionXac287bb7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeFailureBalanceTransactionXac287bb7NoMatchException(
  message: String,
) : InlineChargeFailureBalanceTransactionXac287bb7DecodingException(message)

internal data class InlineChargeFailureBalanceTransactionXac287bb7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * ID of the balance transaction that describes the reversal of the balance on your account due to payment failure.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/failure_balance_transaction
 */
@Serializable(with = InlineChargeFailureBalanceTransactionXac287bb7.Serializer::class)
public class InlineChargeFailureBalanceTransactionXac287bb7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeFailureBalanceTransactionXac287bb7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineChargeFailureBalanceTransactionXac287bb7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeFailureBalanceTransactionXac287bb7Branch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineChargeFailureBalanceTransactionXac287bb7Branch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeFailureBalanceTransactionXac287bb7 {
      val inspection = inspectInlineChargeFailureBalanceTransactionXac287bb7(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeFailureBalanceTransactionXac287bb7NoMatchException("InlineChargeFailureBalanceTransactionXac287bb7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeFailureBalanceTransactionXac287bb7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChargeFailureBalanceTransactionXac287bb7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeFailureBalanceTransactionXac287bb7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeFailureBalanceTransactionXac287bb7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeFailureBalanceTransactionXac287bb7) {
      encoder.requireJsonEncoder("InlineChargeFailureBalanceTransactionXac287bb7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeFailureBalanceTransactionXac287bb7(element: JsonElement): InlineChargeFailureBalanceTransactionXac287bb7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineChargeFailureBalanceTransactionXac287bb7Inspection(
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

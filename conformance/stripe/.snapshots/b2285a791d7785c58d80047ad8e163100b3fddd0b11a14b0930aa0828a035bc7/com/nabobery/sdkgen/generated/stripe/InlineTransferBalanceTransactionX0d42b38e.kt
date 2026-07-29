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

public enum class InlineTransferBalanceTransactionX0d42b38eBranch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineTransferBalanceTransactionX0d42b38eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTransferBalanceTransactionX0d42b38eNoMatchException(
  message: String,
) : InlineTransferBalanceTransactionX0d42b38eDecodingException(message)

internal data class InlineTransferBalanceTransactionX0d42b38eInspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * Balance transaction that describes the impact of this transfer on your account balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer/properties/balance_transaction
 */
@Serializable(with = InlineTransferBalanceTransactionX0d42b38e.Serializer::class)
public class InlineTransferBalanceTransactionX0d42b38e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTransferBalanceTransactionX0d42b38eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineTransferBalanceTransactionX0d42b38eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTransferBalanceTransactionX0d42b38eBranch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineTransferBalanceTransactionX0d42b38eBranch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTransferBalanceTransactionX0d42b38e {
      val inspection = inspectInlineTransferBalanceTransactionX0d42b38e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTransferBalanceTransactionX0d42b38eNoMatchException("InlineTransferBalanceTransactionX0d42b38e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTransferBalanceTransactionX0d42b38e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTransferBalanceTransactionX0d42b38e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTransferBalanceTransactionX0d42b38e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTransferBalanceTransactionX0d42b38e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTransferBalanceTransactionX0d42b38e) {
      encoder.requireJsonEncoder("InlineTransferBalanceTransactionX0d42b38e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTransferBalanceTransactionX0d42b38e(element: JsonElement): InlineTransferBalanceTransactionX0d42b38eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineTransferBalanceTransactionX0d42b38eInspection(
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

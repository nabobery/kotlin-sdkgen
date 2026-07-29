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

public enum class InlinePayoutBalanceTransactionX644e86feBranch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlinePayoutBalanceTransactionX644e86feDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePayoutBalanceTransactionX644e86feNoMatchException(
  message: String,
) : InlinePayoutBalanceTransactionX644e86feDecodingException(message)

internal data class InlinePayoutBalanceTransactionX644e86feInspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * ID of the balance transaction that describes the impact of this payout on your account balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/balance_transaction
 */
@Serializable(with = InlinePayoutBalanceTransactionX644e86fe.Serializer::class)
public class InlinePayoutBalanceTransactionX644e86fe internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePayoutBalanceTransactionX644e86feInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlinePayoutBalanceTransactionX644e86feBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePayoutBalanceTransactionX644e86feBranch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlinePayoutBalanceTransactionX644e86feBranch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePayoutBalanceTransactionX644e86fe {
      val inspection = inspectInlinePayoutBalanceTransactionX644e86fe(raw)
      if (inspection.matchCount == 0) {
        throw InlinePayoutBalanceTransactionX644e86feNoMatchException("InlinePayoutBalanceTransactionX644e86fe matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePayoutBalanceTransactionX644e86fe(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePayoutBalanceTransactionX644e86fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePayoutBalanceTransactionX644e86fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePayoutBalanceTransactionX644e86fe")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePayoutBalanceTransactionX644e86fe) {
      encoder.requireJsonEncoder("InlinePayoutBalanceTransactionX644e86fe").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePayoutBalanceTransactionX644e86fe(element: JsonElement): InlinePayoutBalanceTransactionX644e86feInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlinePayoutBalanceTransactionX644e86feInspection(
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

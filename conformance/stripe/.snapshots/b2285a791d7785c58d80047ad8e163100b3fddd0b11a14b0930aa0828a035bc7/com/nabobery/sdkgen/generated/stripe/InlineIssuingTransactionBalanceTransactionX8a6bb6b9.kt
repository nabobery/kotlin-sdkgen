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

public enum class InlineIssuingTransactionBalanceTransactionX8a6bb6b9Branch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineIssuingTransactionBalanceTransactionX8a6bb6b9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTransactionBalanceTransactionX8a6bb6b9NoMatchException(
  message: String,
) : InlineIssuingTransactionBalanceTransactionX8a6bb6b9DecodingException(message)

internal data class InlineIssuingTransactionBalanceTransactionX8a6bb6b9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBalanceTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * ID of the [balance transaction](https://docs.stripe.com/api/balance_transactions) associated with this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.transaction/properties/balance_transaction
 */
@Serializable(with = InlineIssuingTransactionBalanceTransactionX8a6bb6b9.Serializer::class)
public class InlineIssuingTransactionBalanceTransactionX8a6bb6b9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTransactionBalanceTransactionX8a6bb6b9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTransactionBalanceTransactionX8a6bb6b9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingTransactionBalanceTransactionX8a6bb6b9Branch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineIssuingTransactionBalanceTransactionX8a6bb6b9Branch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTransactionBalanceTransactionX8a6bb6b9 {
      val inspection = inspectInlineIssuingTransactionBalanceTransactionX8a6bb6b9(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTransactionBalanceTransactionX8a6bb6b9NoMatchException("InlineIssuingTransactionBalanceTransactionX8a6bb6b9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTransactionBalanceTransactionX8a6bb6b9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingTransactionBalanceTransactionX8a6bb6b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTransactionBalanceTransactionX8a6bb6b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionBalanceTransactionX8a6bb6b9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTransactionBalanceTransactionX8a6bb6b9) {
      encoder.requireJsonEncoder("InlineIssuingTransactionBalanceTransactionX8a6bb6b9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTransactionBalanceTransactionX8a6bb6b9(element: JsonElement): InlineIssuingTransactionBalanceTransactionX8a6bb6b9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineIssuingTransactionBalanceTransactionX8a6bb6b9Inspection(
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

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

public enum class InlineFeeRefundBalanceTransactionX75308484Branch {
  Branch1,
  BalanceTransaction,
}

public sealed class InlineFeeRefundBalanceTransactionX75308484DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFeeRefundBalanceTransactionX75308484NoMatchException(
  message: String,
) : InlineFeeRefundBalanceTransactionX75308484DecodingException(message)

internal data class InlineFeeRefundBalanceTransactionX75308484Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/fee_refund/properties/balance_transaction
 */
@Serializable(with = InlineFeeRefundBalanceTransactionX75308484.Serializer::class)
public class InlineFeeRefundBalanceTransactionX75308484 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFeeRefundBalanceTransactionX75308484Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val balanceTransaction: BalanceTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null }

  public val matchedBranches: Set<InlineFeeRefundBalanceTransactionX75308484Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineFeeRefundBalanceTransactionX75308484Branch.Branch1)
      if (inspection.matchesBalanceTransaction) add(InlineFeeRefundBalanceTransactionX75308484Branch.BalanceTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFeeRefundBalanceTransactionX75308484 {
      val inspection = inspectInlineFeeRefundBalanceTransactionX75308484(raw)
      if (inspection.matchCount == 0) {
        throw InlineFeeRefundBalanceTransactionX75308484NoMatchException("InlineFeeRefundBalanceTransactionX75308484 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFeeRefundBalanceTransactionX75308484(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFeeRefundBalanceTransactionX75308484> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFeeRefundBalanceTransactionX75308484 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFeeRefundBalanceTransactionX75308484")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFeeRefundBalanceTransactionX75308484) {
      encoder.requireJsonEncoder("InlineFeeRefundBalanceTransactionX75308484").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFeeRefundBalanceTransactionX75308484(element: JsonElement): InlineFeeRefundBalanceTransactionX75308484Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
  return InlineFeeRefundBalanceTransactionX75308484Inspection(
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

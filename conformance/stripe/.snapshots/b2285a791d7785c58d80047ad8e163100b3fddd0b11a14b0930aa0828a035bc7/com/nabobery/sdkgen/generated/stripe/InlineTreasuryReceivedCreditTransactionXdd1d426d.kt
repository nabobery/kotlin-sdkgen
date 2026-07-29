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

public enum class InlineTreasuryReceivedCreditTransactionXdd1d426dBranch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryReceivedCreditTransactionXdd1d426dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryReceivedCreditTransactionXdd1d426dNoMatchException(
  message: String,
) : InlineTreasuryReceivedCreditTransactionXdd1d426dDecodingException(message)

internal data class InlineTreasuryReceivedCreditTransactionXdd1d426dInspection(
  public val matchesBranch1: Boolean,
  public val matchesTreasuryTransaction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTreasuryTransaction).count { it }
}

/**
 * The Transaction associated with this object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_credit/properties/transaction
 */
@Serializable(with = InlineTreasuryReceivedCreditTransactionXdd1d426d.Serializer::class)
public class InlineTreasuryReceivedCreditTransactionXdd1d426d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryReceivedCreditTransactionXdd1d426dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryReceivedCreditTransactionXdd1d426dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryReceivedCreditTransactionXdd1d426dBranch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryReceivedCreditTransactionXdd1d426dBranch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryReceivedCreditTransactionXdd1d426d {
      val inspection = inspectInlineTreasuryReceivedCreditTransactionXdd1d426d(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryReceivedCreditTransactionXdd1d426dNoMatchException("InlineTreasuryReceivedCreditTransactionXdd1d426d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryReceivedCreditTransactionXdd1d426d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryReceivedCreditTransactionXdd1d426d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditTransactionXdd1d426d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryReceivedCreditTransactionXdd1d426d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditTransactionXdd1d426d) {
      encoder.requireJsonEncoder("InlineTreasuryReceivedCreditTransactionXdd1d426d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryReceivedCreditTransactionXdd1d426d(element: JsonElement): InlineTreasuryReceivedCreditTransactionXdd1d426dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryReceivedCreditTransactionXdd1d426dInspection(
    matchesBranch1 = matchesBranch1,
    matchesTreasuryTransaction = matchesTreasuryTransaction,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTreasuryTransaction) add("TreasuryTransaction: value does not match TreasuryTransaction")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

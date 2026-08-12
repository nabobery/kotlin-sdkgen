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

public enum class InlineTreasuryReceivedDebitTransactionX78b9e912Branch {
  Branch1,
  TreasuryTransaction,
}

public sealed class InlineTreasuryReceivedDebitTransactionX78b9e912DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryReceivedDebitTransactionX78b9e912NoMatchException(
  message: String,
) : InlineTreasuryReceivedDebitTransactionX78b9e912DecodingException(message)

internal data class InlineTreasuryReceivedDebitTransactionX78b9e912Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_debit/properties/transaction
 */
@Serializable(with = InlineTreasuryReceivedDebitTransactionX78b9e912.Serializer::class)
public class InlineTreasuryReceivedDebitTransactionX78b9e912 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryReceivedDebitTransactionX78b9e912Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val treasuryTransaction: TreasuryTransaction? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryReceivedDebitTransactionX78b9e912Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTreasuryReceivedDebitTransactionX78b9e912Branch.Branch1)
      if (inspection.matchesTreasuryTransaction) add(InlineTreasuryReceivedDebitTransactionX78b9e912Branch.TreasuryTransaction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryReceivedDebitTransactionX78b9e912 {
      val inspection = inspectInlineTreasuryReceivedDebitTransactionX78b9e912(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryReceivedDebitTransactionX78b9e912NoMatchException("InlineTreasuryReceivedDebitTransactionX78b9e912 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryReceivedDebitTransactionX78b9e912(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedDebitTransactionX78b9e912> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedDebitTransactionX78b9e912 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryReceivedDebitTransactionX78b9e912")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedDebitTransactionX78b9e912) {
      encoder.requireJsonEncoder("InlineTreasuryReceivedDebitTransactionX78b9e912").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryReceivedDebitTransactionX78b9e912(element: JsonElement): InlineTreasuryReceivedDebitTransactionX78b9e912Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
  return InlineTreasuryReceivedDebitTransactionX78b9e912Inspection(
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

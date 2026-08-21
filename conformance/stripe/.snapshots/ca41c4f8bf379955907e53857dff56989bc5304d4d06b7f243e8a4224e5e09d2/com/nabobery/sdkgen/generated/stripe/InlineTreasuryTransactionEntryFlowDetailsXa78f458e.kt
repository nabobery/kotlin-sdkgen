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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineTreasuryTransactionEntryFlowDetailsXa78f458eBranch {
  TreasuryTransactionsResourceFlowDetails,
}

public sealed class InlineTreasuryTransactionEntryFlowDetailsXa78f458eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryTransactionEntryFlowDetailsXa78f458eNoMatchException(
  message: String,
) : InlineTreasuryTransactionEntryFlowDetailsXa78f458eDecodingException(message)

internal data class InlineTreasuryTransactionEntryFlowDetailsXa78f458eInspection(
  public val matchesTreasuryTransactionsResourceFlowDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryTransactionsResourceFlowDetails).count { it }
}

/**
 * Details of the flow associated with the TransactionEntry.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction_entry/properties/flow_details
 */
@Serializable(with = InlineTreasuryTransactionEntryFlowDetailsXa78f458e.Serializer::class)
public class InlineTreasuryTransactionEntryFlowDetailsXa78f458e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryTransactionEntryFlowDetailsXa78f458eInspection,
) {
  public val treasuryTransactionsResourceFlowDetails: TreasuryTransactionsResourceFlowDetailsView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransactionsResourceFlowDetails) json.decodeFromJsonElement<TreasuryTransactionsResourceFlowDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryTransactionEntryFlowDetailsXa78f458eBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryTransactionsResourceFlowDetails) add(InlineTreasuryTransactionEntryFlowDetailsXa78f458eBranch.TreasuryTransactionsResourceFlowDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryTransactionEntryFlowDetailsXa78f458e {
      val inspection = inspectInlineTreasuryTransactionEntryFlowDetailsXa78f458e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryTransactionEntryFlowDetailsXa78f458eNoMatchException("InlineTreasuryTransactionEntryFlowDetailsXa78f458e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryTransactionEntryFlowDetailsXa78f458e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryTransactionEntryFlowDetailsXa78f458e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionEntryFlowDetailsXa78f458e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryTransactionEntryFlowDetailsXa78f458e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionEntryFlowDetailsXa78f458e) {
      encoder.requireJsonEncoder("InlineTreasuryTransactionEntryFlowDetailsXa78f458e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryTransactionEntryFlowDetailsXa78f458e(element: JsonElement): InlineTreasuryTransactionEntryFlowDetailsXa78f458eInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryTransactionEntryFlowDetailsXa78f458eInspection(
    matchesTreasuryTransactionsResourceFlowDetails = false,
    failures = listOf("TreasuryTransactionsResourceFlowDetails: expected JSON object"),
  )
  val matchesTreasuryTransactionsResourceFlowDetails = raw["type"] != null
  return InlineTreasuryTransactionEntryFlowDetailsXa78f458eInspection(
    matchesTreasuryTransactionsResourceFlowDetails = matchesTreasuryTransactionsResourceFlowDetails,
    failures = buildList {
      if (!matchesTreasuryTransactionsResourceFlowDetails) add("TreasuryTransactionsResourceFlowDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

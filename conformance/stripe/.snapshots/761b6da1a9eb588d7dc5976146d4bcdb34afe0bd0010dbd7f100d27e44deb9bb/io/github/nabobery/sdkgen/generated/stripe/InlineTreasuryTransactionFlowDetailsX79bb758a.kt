package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineTreasuryTransactionFlowDetailsX79bb758aBranch {
  TreasuryTransactionsResourceFlowDetails,
}

public sealed class InlineTreasuryTransactionFlowDetailsX79bb758aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryTransactionFlowDetailsX79bb758aNoMatchException(
  message: String,
) : InlineTreasuryTransactionFlowDetailsX79bb758aDecodingException(message)

internal data class InlineTreasuryTransactionFlowDetailsX79bb758aInspection(
  public val matchesTreasuryTransactionsResourceFlowDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryTransactionsResourceFlowDetails).count { it }
}

/**
 * Details of the flow that created the Transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction/properties/flow_details
 */
@Serializable(with = InlineTreasuryTransactionFlowDetailsX79bb758a.Serializer::class)
public class InlineTreasuryTransactionFlowDetailsX79bb758a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryTransactionFlowDetailsX79bb758aInspection,
) {
  public val treasuryTransactionsResourceFlowDetails: TreasuryTransactionsResourceFlowDetailsView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryTransactionsResourceFlowDetails) json.decodeFromJsonElement<TreasuryTransactionsResourceFlowDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryTransactionFlowDetailsX79bb758aBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryTransactionsResourceFlowDetails) add(InlineTreasuryTransactionFlowDetailsX79bb758aBranch.TreasuryTransactionsResourceFlowDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryTransactionFlowDetailsX79bb758a {
      val inspection = inspectInlineTreasuryTransactionFlowDetailsX79bb758a(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryTransactionFlowDetailsX79bb758aNoMatchException("InlineTreasuryTransactionFlowDetailsX79bb758a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryTransactionFlowDetailsX79bb758a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryTransactionFlowDetailsX79bb758a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionFlowDetailsX79bb758a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryTransactionFlowDetailsX79bb758a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionFlowDetailsX79bb758a) {
      encoder.requireJsonEncoder("InlineTreasuryTransactionFlowDetailsX79bb758a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryTransactionFlowDetailsX79bb758a(element: JsonElement): InlineTreasuryTransactionFlowDetailsX79bb758aInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryTransactionFlowDetailsX79bb758aInspection(
    matchesTreasuryTransactionsResourceFlowDetails = false,
    failures = listOf("TreasuryTransactionsResourceFlowDetails: expected JSON object"),
  )
  val matchesTreasuryTransactionsResourceFlowDetails = raw["type"] != null
  return InlineTreasuryTransactionFlowDetailsX79bb758aInspection(
    matchesTreasuryTransactionsResourceFlowDetails = matchesTreasuryTransactionsResourceFlowDetails,
    failures = buildList {
      if (!matchesTreasuryTransactionsResourceFlowDetails) add("TreasuryTransactionsResourceFlowDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

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

public enum class InlineTreasuryReceivedDebitReversalDetailsX208cee01Branch {
  TreasuryReceivedDebitsResourceReversalDetails,
}

public sealed class InlineTreasuryReceivedDebitReversalDetailsX208cee01DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryReceivedDebitReversalDetailsX208cee01NoMatchException(
  message: String,
) : InlineTreasuryReceivedDebitReversalDetailsX208cee01DecodingException(message)

internal data class InlineTreasuryReceivedDebitReversalDetailsX208cee01Inspection(
  public val matchesTreasuryReceivedDebitsResourceReversalDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryReceivedDebitsResourceReversalDetails).count { it }
}

/**
 * Details describing when a ReceivedDebit might be reversed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_debit/properties/reversal_details
 */
@Serializable(with = InlineTreasuryReceivedDebitReversalDetailsX208cee01.Serializer::class)
public class InlineTreasuryReceivedDebitReversalDetailsX208cee01 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryReceivedDebitReversalDetailsX208cee01Inspection,
) {
  public val treasuryReceivedDebitsResourceReversalDetails:
      TreasuryReceivedDebitsResourceReversalDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryReceivedDebitsResourceReversalDetails) json.decodeFromJsonElement<TreasuryReceivedDebitsResourceReversalDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryReceivedDebitReversalDetailsX208cee01Branch>
    get() = buildSet {
      if (inspection.matchesTreasuryReceivedDebitsResourceReversalDetails) add(InlineTreasuryReceivedDebitReversalDetailsX208cee01Branch.TreasuryReceivedDebitsResourceReversalDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryReceivedDebitReversalDetailsX208cee01 {
      val inspection = inspectInlineTreasuryReceivedDebitReversalDetailsX208cee01(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryReceivedDebitReversalDetailsX208cee01NoMatchException("InlineTreasuryReceivedDebitReversalDetailsX208cee01 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryReceivedDebitReversalDetailsX208cee01(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedDebitReversalDetailsX208cee01> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedDebitReversalDetailsX208cee01 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryReceivedDebitReversalDetailsX208cee01")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedDebitReversalDetailsX208cee01) {
      encoder.requireJsonEncoder("InlineTreasuryReceivedDebitReversalDetailsX208cee01").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryReceivedDebitReversalDetailsX208cee01(element: JsonElement): InlineTreasuryReceivedDebitReversalDetailsX208cee01Inspection {
  val raw = element as? JsonObject ?: return InlineTreasuryReceivedDebitReversalDetailsX208cee01Inspection(
    matchesTreasuryReceivedDebitsResourceReversalDetails = false,
    failures = listOf("TreasuryReceivedDebitsResourceReversalDetails: expected JSON object"),
  )
  val matchesTreasuryReceivedDebitsResourceReversalDetails = true
  return InlineTreasuryReceivedDebitReversalDetailsX208cee01Inspection(
    matchesTreasuryReceivedDebitsResourceReversalDetails = matchesTreasuryReceivedDebitsResourceReversalDetails,
    failures = buildList {
      if (!matchesTreasuryReceivedDebitsResourceReversalDetails) add("TreasuryReceivedDebitsResourceReversalDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

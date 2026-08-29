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

public enum class InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Branch {
  TreasuryReceivedCreditsResourceReversalDetails,
}

public sealed class InlineTreasuryReceivedCreditReversalDetailsX2cda43a1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryReceivedCreditReversalDetailsX2cda43a1NoMatchException(
  message: String,
) : InlineTreasuryReceivedCreditReversalDetailsX2cda43a1DecodingException(message)

internal data class InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Inspection(
  public val matchesTreasuryReceivedCreditsResourceReversalDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryReceivedCreditsResourceReversalDetails).count { it }
}

/**
 * Details describing when a ReceivedCredit may be reversed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_credit/properties/reversal_details
 */
@Serializable(with = InlineTreasuryReceivedCreditReversalDetailsX2cda43a1.Serializer::class)
public class InlineTreasuryReceivedCreditReversalDetailsX2cda43a1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Inspection,
) {
  public val treasuryReceivedCreditsResourceReversalDetails:
      TreasuryReceivedCreditsResourceReversalDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryReceivedCreditsResourceReversalDetails) json.decodeFromJsonElement<TreasuryReceivedCreditsResourceReversalDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Branch>
    get() = buildSet {
      if (inspection.matchesTreasuryReceivedCreditsResourceReversalDetails) add(InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Branch.TreasuryReceivedCreditsResourceReversalDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryReceivedCreditReversalDetailsX2cda43a1 {
      val inspection = inspectInlineTreasuryReceivedCreditReversalDetailsX2cda43a1(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryReceivedCreditReversalDetailsX2cda43a1NoMatchException("InlineTreasuryReceivedCreditReversalDetailsX2cda43a1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryReceivedCreditReversalDetailsX2cda43a1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedCreditReversalDetailsX2cda43a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditReversalDetailsX2cda43a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryReceivedCreditReversalDetailsX2cda43a1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditReversalDetailsX2cda43a1) {
      encoder.requireJsonEncoder("InlineTreasuryReceivedCreditReversalDetailsX2cda43a1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryReceivedCreditReversalDetailsX2cda43a1(element: JsonElement): InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Inspection {
  val raw = element as? JsonObject ?: return InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Inspection(
    matchesTreasuryReceivedCreditsResourceReversalDetails = false,
    failures = listOf("TreasuryReceivedCreditsResourceReversalDetails: expected JSON object"),
  )
  val matchesTreasuryReceivedCreditsResourceReversalDetails = true
  return InlineTreasuryReceivedCreditReversalDetailsX2cda43a1Inspection(
    matchesTreasuryReceivedCreditsResourceReversalDetails = matchesTreasuryReceivedCreditsResourceReversalDetails,
    failures = buildList {
      if (!matchesTreasuryReceivedCreditsResourceReversalDetails) add("TreasuryReceivedCreditsResourceReversalDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

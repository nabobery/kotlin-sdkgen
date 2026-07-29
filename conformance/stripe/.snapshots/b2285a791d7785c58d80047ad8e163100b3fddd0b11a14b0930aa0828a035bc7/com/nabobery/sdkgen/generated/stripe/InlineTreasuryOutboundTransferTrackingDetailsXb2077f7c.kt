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

public enum class InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cBranch {
  TreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails,
}

public sealed class InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cNoMatchException(
  message: String,
) : InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cDecodingException(message)

internal data class InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cInspection(
  public val matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails).count { it }
}

/**
 * Details about network-specific tracking information if available.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_transfer/properties/tracking_details
 */
@Serializable(with = InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c.Serializer::class)
public class InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cInspection,
) {
  public val treasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails:
      TreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails) json.decodeFromJsonElement<TreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails) add(InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cBranch.TreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c {
      val inspection = inspectInlineTreasuryOutboundTransferTrackingDetailsXb2077f7c(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cNoMatchException("InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c) {
      encoder.requireJsonEncoder("InlineTreasuryOutboundTransferTrackingDetailsXb2077f7c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryOutboundTransferTrackingDetailsXb2077f7c(element: JsonElement): InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cInspection(
    matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails = false,
    failures = listOf("TreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails: expected JSON object"),
  )
  val matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails = raw["type"] != null
  return InlineTreasuryOutboundTransferTrackingDetailsXb2077f7cInspection(
    matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails = matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails,
    failures = buildList {
      if (!matchesTreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails) add("TreasuryOutboundTransfersResourceOutboundTransferResourceTrackingDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

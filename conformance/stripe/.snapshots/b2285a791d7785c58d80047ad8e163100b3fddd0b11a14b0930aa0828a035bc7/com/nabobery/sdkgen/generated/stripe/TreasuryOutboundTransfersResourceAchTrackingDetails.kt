package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_outbound_transfers_resource_ach_tracking_details
 */
@Serializable(with = TreasuryOutboundTransfersResourceAchTrackingDetails.Serializer::class)
public class TreasuryOutboundTransfersResourceAchTrackingDetails(
  /**
   * ACH trace ID of the OutboundTransfer for transfers sent over the `ach` network.
   */
  public val traceId: String,
) {
  public class Builder {
    private var traceIdValue: String? = null

    public var traceId: String
      get() = requireNotNull(traceIdValue) { "traceId is required" }
      set(`value`) {
        traceIdValue = value
      }

    public fun build(): TreasuryOutboundTransfersResourceAchTrackingDetails {
      check(traceIdValue != null) { "traceId is required" }
      return TreasuryOutboundTransfersResourceAchTrackingDetails(
        traceId = traceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryOutboundTransfersResourceAchTrackingDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryOutboundTransfersResourceAchTrackingDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryOutboundTransfersResourceAchTrackingDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryOutboundTransfersResourceAchTrackingDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryOutboundTransfersResourceAchTrackingDetails must be a JSON object")
      val traceId = json.decodeRequired<String>(rawObject, "trace_id")
      return TreasuryOutboundTransfersResourceAchTrackingDetails(
        traceId = traceId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryOutboundTransfersResourceAchTrackingDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryOutboundTransfersResourceAchTrackingDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("trace_id", value.traceId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryOutboundTransfersResourceAchTrackingDetails(block: TreasuryOutboundTransfersResourceAchTrackingDetails.Builder.() -> Unit): TreasuryOutboundTransfersResourceAchTrackingDetails = TreasuryOutboundTransfersResourceAchTrackingDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryOutboundTransfersResourceAchTrackingDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_inbound_transfers_resource_inbound_transfer_resource_status
 * _transitions
 */
@Serializable(with = TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions.Serializer::class)
public class TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions(
  /**
   * Timestamp describing when an InboundTransfer changed status to `canceled`.
   */
  public val canceledAt: Int? = null,
  /**
   * Timestamp describing when an InboundTransfer changed status to `failed`.
   */
  public val failedAt: Int? = null,
  /**
   * Timestamp describing when an InboundTransfer changed status to `succeeded`.
   */
  public val succeededAt: Int? = null,
) {
  public class Builder {
    /**
     * Timestamp describing when an InboundTransfer changed status to `canceled`.
     */
    public var canceledAt: Int? = null

    /**
     * Timestamp describing when an InboundTransfer changed status to `failed`.
     */
    public var failedAt: Int? = null

    /**
     * Timestamp describing when an InboundTransfer changed status to `succeeded`.
     */
    public var succeededAt: Int? = null

    public fun build(): TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions = TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions(
      canceledAt = canceledAt,
      failedAt = failedAt,
      succeededAt = succeededAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions must be a JSON object")
      return TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions(
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        failedAt = rawObject["failed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        succeededAt = rawObject["succeeded_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.failedAt?.let { put("failed_at", json.encodeToJsonElement(it)) }
        value.succeededAt?.let { put("succeeded_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryInboundTransfersResourceInboundTransferResourceStatusTransitions(block: TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions.Builder.() -> Unit): TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions = TreasuryInboundTransfersResourceInboundTransferResourceStatusTransitions.build(block)

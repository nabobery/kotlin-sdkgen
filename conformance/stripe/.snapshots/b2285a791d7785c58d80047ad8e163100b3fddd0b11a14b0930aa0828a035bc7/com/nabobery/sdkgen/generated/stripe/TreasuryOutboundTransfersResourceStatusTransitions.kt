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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_outbound_transfers_resource_status_transitions
 */
@Serializable(with = TreasuryOutboundTransfersResourceStatusTransitions.Serializer::class)
public class TreasuryOutboundTransfersResourceStatusTransitions(
  /**
   * Timestamp describing when an OutboundTransfer changed status to `canceled`
   */
  public val canceledAt: Int? = null,
  /**
   * Timestamp describing when an OutboundTransfer changed status to `failed`
   */
  public val failedAt: Int? = null,
  /**
   * Timestamp describing when an OutboundTransfer changed status to `posted`
   */
  public val postedAt: Int? = null,
  /**
   * Timestamp describing when an OutboundTransfer changed status to `returned`
   */
  public val returnedAt: Int? = null,
) {
  public class Builder {
    /**
     * Timestamp describing when an OutboundTransfer changed status to `canceled`
     */
    public var canceledAt: Int? = null

    /**
     * Timestamp describing when an OutboundTransfer changed status to `failed`
     */
    public var failedAt: Int? = null

    /**
     * Timestamp describing when an OutboundTransfer changed status to `posted`
     */
    public var postedAt: Int? = null

    /**
     * Timestamp describing when an OutboundTransfer changed status to `returned`
     */
    public var returnedAt: Int? = null

    public fun build(): TreasuryOutboundTransfersResourceStatusTransitions = TreasuryOutboundTransfersResourceStatusTransitions(
      canceledAt = canceledAt,
      failedAt = failedAt,
      postedAt = postedAt,
      returnedAt = returnedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryOutboundTransfersResourceStatusTransitions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryOutboundTransfersResourceStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryOutboundTransfersResourceStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryOutboundTransfersResourceStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryOutboundTransfersResourceStatusTransitions must be a JSON object")
      return TreasuryOutboundTransfersResourceStatusTransitions(
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        failedAt = rawObject["failed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        postedAt = rawObject["posted_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        returnedAt = rawObject["returned_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryOutboundTransfersResourceStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryOutboundTransfersResourceStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.failedAt?.let { put("failed_at", json.encodeToJsonElement(it)) }
        value.postedAt?.let { put("posted_at", json.encodeToJsonElement(it)) }
        value.returnedAt?.let { put("returned_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryOutboundTransfersResourceStatusTransitions(block: TreasuryOutboundTransfersResourceStatusTransitions.Builder.() -> Unit): TreasuryOutboundTransfersResourceStatusTransitions = TreasuryOutboundTransfersResourceStatusTransitions.build(block)

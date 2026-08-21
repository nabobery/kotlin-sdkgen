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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_received_credits_resource_status_transitions
 */
@Serializable(with = TreasuryReceivedCreditsResourceStatusTransitions.Serializer::class)
public class TreasuryReceivedCreditsResourceStatusTransitions(
  /**
   * Timestamp describing when the CreditReversal changed status to `posted`
   */
  public val postedAt: Int? = null,
) {
  public class Builder {
    /**
     * Timestamp describing when the CreditReversal changed status to `posted`
     */
    public var postedAt: Int? = null

    public fun build(): TreasuryReceivedCreditsResourceStatusTransitions = TreasuryReceivedCreditsResourceStatusTransitions(
      postedAt = postedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryReceivedCreditsResourceStatusTransitions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryReceivedCreditsResourceStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryReceivedCreditsResourceStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedCreditsResourceStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryReceivedCreditsResourceStatusTransitions must be a JSON object")
      return TreasuryReceivedCreditsResourceStatusTransitions(
        postedAt = rawObject["posted_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryReceivedCreditsResourceStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedCreditsResourceStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.postedAt?.let { put("posted_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryReceivedCreditsResourceStatusTransitions(block: TreasuryReceivedCreditsResourceStatusTransitions.Builder.() -> Unit): TreasuryReceivedCreditsResourceStatusTransitions = TreasuryReceivedCreditsResourceStatusTransitions.build(block)

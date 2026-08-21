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
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_status_transitions
 */
@Serializable(with = QuotesResourceStatusTransitions.Serializer::class)
public class QuotesResourceStatusTransitions(
  /**
   * The time that the quote was accepted. Measured in seconds since Unix epoch.
   */
  public val acceptedAt: Int? = null,
  /**
   * The time that the quote was canceled. Measured in seconds since Unix epoch.
   */
  public val canceledAt: Int? = null,
  /**
   * The time that the quote was finalized. Measured in seconds since Unix epoch.
   */
  public val finalizedAt: Int? = null,
) {
  public class Builder {
    /**
     * The time that the quote was accepted. Measured in seconds since Unix epoch.
     */
    public var acceptedAt: Int? = null

    /**
     * The time that the quote was canceled. Measured in seconds since Unix epoch.
     */
    public var canceledAt: Int? = null

    /**
     * The time that the quote was finalized. Measured in seconds since Unix epoch.
     */
    public var finalizedAt: Int? = null

    public fun build(): QuotesResourceStatusTransitions = QuotesResourceStatusTransitions(
      acceptedAt = acceptedAt,
      canceledAt = canceledAt,
      finalizedAt = finalizedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): QuotesResourceStatusTransitions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<QuotesResourceStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): QuotesResourceStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("QuotesResourceStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("QuotesResourceStatusTransitions must be a JSON object")
      return QuotesResourceStatusTransitions(
        acceptedAt = rawObject["accepted_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        finalizedAt = rawObject["finalized_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: QuotesResourceStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("QuotesResourceStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acceptedAt?.let { put("accepted_at", json.encodeToJsonElement(it)) }
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.finalizedAt?.let { put("finalized_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun quotesResourceStatusTransitions(block: QuotesResourceStatusTransitions.Builder.() -> Unit): QuotesResourceStatusTransitions = QuotesResourceStatusTransitions.build(block)

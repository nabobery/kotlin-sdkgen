package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatStreamDelta/properties/audio.
 */
@Serializable(with = InlineComponentsSchemasChatStreamDeltaPropertiesAudio.Serializer::class)
public class InlineComponentsSchemasChatStreamDeltaPropertiesAudio(
  /**
   * Base64 encoded audio data
   */
  public val `data`: String? = null,
  /**
   * Audio expiration timestamp
   */
  public val expiresAt: Int? = null,
  /**
   * Audio output identifier
   */
  public val id: String? = null,
  /**
   * Audio transcript
   */
  public val transcript: String? = null,
) {
  public class Builder {
    /**
     * Base64 encoded audio data
     */
    public var `data`: String? = null

    /**
     * Audio expiration timestamp
     */
    public var expiresAt: Int? = null

    /**
     * Audio output identifier
     */
    public var id: String? = null

    /**
     * Audio transcript
     */
    public var transcript: String? = null

    public fun build(): InlineComponentsSchemasChatStreamDeltaPropertiesAudio =
      InlineComponentsSchemasChatStreamDeltaPropertiesAudio(
      data = data,
      expiresAt = expiresAt,
      id = id,
      transcript = transcript,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatStreamDeltaPropertiesAudio = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatStreamDeltaPropertiesAudio> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatStreamDeltaPropertiesAudio {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatStreamDeltaPropertiesAudio")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatStreamDeltaPropertiesAudio must be a JSON object")
      return InlineComponentsSchemasChatStreamDeltaPropertiesAudio(
        data = raw["data"]?.let { json.decodeFromJsonElement<String>(it) },
        expiresAt = raw["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        transcript = raw["transcript"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatStreamDeltaPropertiesAudio) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatStreamDeltaPropertiesAudio")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.data?.let { put("data", it) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.transcript?.let { put("transcript", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatStreamDeltaPropertiesAudio(block: InlineComponentsSchemasChatStreamDeltaPropertiesAudio.Builder.() -> Unit): InlineComponentsSchemasChatStreamDeltaPropertiesAudio = InlineComponentsSchemasChatStreamDeltaPropertiesAudio.build(block)

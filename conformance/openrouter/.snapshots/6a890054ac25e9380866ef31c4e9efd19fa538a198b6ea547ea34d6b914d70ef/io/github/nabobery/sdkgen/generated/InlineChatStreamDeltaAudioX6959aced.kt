package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamDelta/properties/audio
 */
@Serializable(with = InlineChatStreamDeltaAudioX6959aced.Serializer::class)
public class InlineChatStreamDeltaAudioX6959aced(
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

    public fun build(): InlineChatStreamDeltaAudioX6959aced = InlineChatStreamDeltaAudioX6959aced(
      data = data,
      expiresAt = expiresAt,
      id = id,
      transcript = transcript,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatStreamDeltaAudioX6959aced = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatStreamDeltaAudioX6959aced> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatStreamDeltaAudioX6959aced {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatStreamDeltaAudioX6959aced")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatStreamDeltaAudioX6959aced must be a JSON object")
      return InlineChatStreamDeltaAudioX6959aced(
        data = rawObject["data"]?.let { json.decodeFromJsonElement<String>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        transcript = rawObject["transcript"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatStreamDeltaAudioX6959aced) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatStreamDeltaAudioX6959aced")
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

public fun inlineChatStreamDeltaAudioX6959aced(block: InlineChatStreamDeltaAudioX6959aced.Builder.() -> Unit): InlineChatStreamDeltaAudioX6959aced = InlineChatStreamDeltaAudioX6959aced.build(block)

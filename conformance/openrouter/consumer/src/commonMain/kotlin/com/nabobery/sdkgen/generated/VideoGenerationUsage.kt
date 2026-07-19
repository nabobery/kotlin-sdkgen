package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Usage and cost information for the video generation. Available once the job has completed.
 */
@Serializable(with = VideoGenerationUsage.Serializer::class)
public class VideoGenerationUsage(
  /**
   * The cost of the video generation in USD.
   */
  public val cost: Double? = null,
  /**
   * Whether the request was made using a Bring Your Own Key configuration.
   */
  public val isByok: Boolean? = null,
) {
  public class Builder {
    /**
     * The cost of the video generation in USD.
     */
    public var cost: Double? = null

    /**
     * Whether the request was made using a Bring Your Own Key configuration.
     */
    public var isByok: Boolean? = null

    public fun build(): VideoGenerationUsage = VideoGenerationUsage(
      cost = cost,
      isByok = isByok,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): VideoGenerationUsage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<VideoGenerationUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): VideoGenerationUsage {
      val jsonDecoder = decoder.requireJsonDecoder("VideoGenerationUsage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("VideoGenerationUsage must be a JSON object")
      return VideoGenerationUsage(
        cost = raw["cost"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        isByok = raw["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: VideoGenerationUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("VideoGenerationUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.isByok?.let { put("is_byok", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun videoGenerationUsage(block: VideoGenerationUsage.Builder.() -> Unit): VideoGenerationUsage =
  VideoGenerationUsage.build(block)

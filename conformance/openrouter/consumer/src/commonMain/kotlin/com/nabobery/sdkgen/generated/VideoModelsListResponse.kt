package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/VideoModelsListResponse.
 */
@Serializable(with = VideoModelsListResponse.Serializer::class)
public class VideoModelsListResponse(
  `data`: List<VideoModel>,
) {
  public val `data`: List<VideoModel> = data.toList()

  public class Builder {
    private var dataValue: List<VideoModel>? = null

    public var `data`: List<VideoModel>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): VideoModelsListResponse {
      check(dataValue != null) { "data is required" }
      return VideoModelsListResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): VideoModelsListResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<VideoModelsListResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): VideoModelsListResponse {
      val jsonDecoder = decoder.requireJsonDecoder("VideoModelsListResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("VideoModelsListResponse must be a JSON object")
      val data = json.decodeRequired<List<VideoModel>>(raw, "data")
      return VideoModelsListResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: VideoModelsListResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("VideoModelsListResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun videoModelsListResponse(block: VideoModelsListResponse.Builder.() -> Unit): VideoModelsListResponse =
  VideoModelsListResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("VideoModelsListResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ImageStreamingResponse.
 */
@Serializable(with = ImageStreamingResponse.Serializer::class)
public class ImageStreamingResponse(
  public val `data`: InlineComponentsSchemasImageStreamingResponsePropertiesData,
) {
  public class Builder {
    private var dataValue: InlineComponentsSchemasImageStreamingResponsePropertiesData? = null

    public var `data`: InlineComponentsSchemasImageStreamingResponsePropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): ImageStreamingResponse {
      check(dataValue != null) { "data is required" }
      return ImageStreamingResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageStreamingResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageStreamingResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageStreamingResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ImageStreamingResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageStreamingResponse must be a JSON object")
      val data = json.decodeRequired<InlineComponentsSchemasImageStreamingResponsePropertiesData>(raw, "data")
      return ImageStreamingResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageStreamingResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageStreamingResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageStreamingResponse(block: ImageStreamingResponse.Builder.() -> Unit): ImageStreamingResponse =
  ImageStreamingResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageStreamingResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

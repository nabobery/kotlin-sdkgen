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
 * List of image generation models.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageModelsListResponse
 */
@Serializable(with = ImageModelsListResponse.Serializer::class)
public class ImageModelsListResponse(
  `data`: List<ImageModelListItem>,
) {
  public val `data`: List<ImageModelListItem> = data.toList()

  public class Builder {
    private var dataValue: List<ImageModelListItem>? = null

    public var `data`: List<ImageModelListItem>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    public fun build(): ImageModelsListResponse {
      check(dataValue != null) { "data is required" }
      return ImageModelsListResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageModelsListResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageModelsListResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageModelsListResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ImageModelsListResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageModelsListResponse must be a JSON object")
      val data = json.decodeRequired<List<ImageModelListItem>>(rawObject, "data")
      return ImageModelsListResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageModelsListResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageModelsListResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageModelsListResponse(block: ImageModelsListResponse.Builder.() -> Unit): ImageModelsListResponse = ImageModelsListResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageModelsListResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

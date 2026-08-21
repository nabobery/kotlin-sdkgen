package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Image generation response
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationResponse
 */
@Serializable(with = ImageGenerationResponse.Serializer::class)
public class ImageGenerationResponse(
  /**
   * Unix timestamp (seconds) when the image was generated
   */
  public val created: Int,
  `data`: List<InlineImageGenerationResponseDataItemXc3984636>,
  public val usage: ImageGenerationUsage? = null,
) {
  /**
   * Generated images
   */
  public val `data`: List<InlineImageGenerationResponseDataItemXc3984636> = data.toList()

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var dataValue: List<InlineImageGenerationResponseDataItemXc3984636>? = null

    public var `data`: List<InlineImageGenerationResponseDataItemXc3984636>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    public var usage: ImageGenerationUsage? = null

    public fun build(): ImageGenerationResponse {
      check(createdValue != null) { "created is required" }
      check(dataValue != null) { "data is required" }
      return ImageGenerationResponse(
        created = created,
        data = data,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageGenerationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageGenerationResponse must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val data = json.decodeRequired<List<InlineImageGenerationResponseDataItemXc3984636>>(rawObject, "data")
      return ImageGenerationResponse(
        created = created,
        data = data,
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<ImageGenerationUsage>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("data", json.encodeToJsonElement(value.data))
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenerationResponse(block: ImageGenerationResponse.Builder.() -> Unit): ImageGenerationResponse = ImageGenerationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenerationResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

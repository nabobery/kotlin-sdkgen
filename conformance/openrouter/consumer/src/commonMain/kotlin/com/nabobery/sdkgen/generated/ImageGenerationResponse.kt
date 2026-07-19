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
 */
@Serializable(with = ImageGenerationResponse.Serializer::class)
public class ImageGenerationResponse(
  /**
   * Unix timestamp (seconds) when the image was generated
   */
  public val created: Int,
  `data`: List<InlineComponentsSchemasImageGenerationResponsePropertiesDataItems>,
  public val usage: ImageGenerationUsage? = null,
) {
  /**
   * Generated images
   */
  public val `data`: List<InlineComponentsSchemasImageGenerationResponsePropertiesDataItems> =
      data.toList()

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var dataValue: List<InlineComponentsSchemasImageGenerationResponsePropertiesDataItems>?
        = null

    public var `data`: List<InlineComponentsSchemasImageGenerationResponsePropertiesDataItems>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
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

  public object Serializer : KSerializer<ImageGenerationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenerationResponse must be a JSON object")
      val created = json.decodeRequired<Int>(raw, "created")
      val data = json.decodeRequired<List<InlineComponentsSchemasImageGenerationResponsePropertiesDataItems>>(raw,
        "data")
      return ImageGenerationResponse(
        created = created,
        data = data,
        usage = raw["usage"]?.let { json.decodeFromJsonElement<ImageGenerationUsage>(it) },
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

public fun imageGenerationResponse(block: ImageGenerationResponse.Builder.() -> Unit): ImageGenerationResponse =
  ImageGenerationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenerationResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

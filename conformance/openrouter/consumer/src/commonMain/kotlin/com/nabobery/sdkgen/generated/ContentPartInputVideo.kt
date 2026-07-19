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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputVideo.
 */
@Serializable(with = ContentPartInputVideo.Serializer::class)
public class ContentPartInputVideo(
  public val inputVideo: MultimodalMedia,
  public val type: InlineComponentsSchemasContentPartInputVideoPropertiesType,
) {
  public class Builder {
    private var inputVideoValue: MultimodalMedia? = null

    public var inputVideo: MultimodalMedia
      get() = requireNotNull(inputVideoValue) { "inputVideo is required" }
      set(`value`) {
        inputVideoValue = value
      }

    private var typeValue: InlineComponentsSchemasContentPartInputVideoPropertiesType? = null

    public var type: InlineComponentsSchemasContentPartInputVideoPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ContentPartInputVideo {
      check(inputVideoValue != null) { "inputVideo is required" }
      check(typeValue != null) { "type is required" }
      return ContentPartInputVideo(
        inputVideo = inputVideo,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContentPartInputVideo = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContentPartInputVideo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContentPartInputVideo {
      val jsonDecoder = decoder.requireJsonDecoder("ContentPartInputVideo")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ContentPartInputVideo must be a JSON object")
      val inputVideo = json.decodeRequired<MultimodalMedia>(raw, "input_video")
      val type = json.decodeRequired<InlineComponentsSchemasContentPartInputVideoPropertiesType>(raw, "type")
      return ContentPartInputVideo(
        inputVideo = inputVideo,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContentPartInputVideo) {
      val jsonEncoder = encoder.requireJsonEncoder("ContentPartInputVideo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_video", json.encodeToJsonElement(value.inputVideo))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contentPartInputVideo(block: ContentPartInputVideo.Builder.() -> Unit): ContentPartInputVideo =
  ContentPartInputVideo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContentPartInputVideo is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

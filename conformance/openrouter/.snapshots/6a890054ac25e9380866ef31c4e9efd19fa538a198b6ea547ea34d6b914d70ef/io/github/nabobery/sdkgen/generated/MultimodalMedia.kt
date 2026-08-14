package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MultimodalMedia.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MultimodalMedia
 */
@Serializable(with = MultimodalMedia.Serializer::class)
public class MultimodalMedia(
  public val `data`: String,
  public val format: String? = null,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public var format: String? = null

    public fun build(): MultimodalMedia {
      check(dataValue != null) { "data is required" }
      return MultimodalMedia(
        data = data,
        format = format,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MultimodalMedia = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MultimodalMedia> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MultimodalMedia {
      val jsonDecoder = decoder.requireJsonDecoder("MultimodalMedia")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MultimodalMedia must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      return MultimodalMedia(
        data = data,
        format = rawObject["format"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MultimodalMedia) {
      val jsonEncoder = encoder.requireJsonEncoder("MultimodalMedia")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        value.format?.let { put("format", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun multimodalMedia(block: MultimodalMedia.Builder.() -> Unit): MultimodalMedia = MultimodalMedia.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MultimodalMedia is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ContentPartImage/properties/image_url.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartImage/properties/image_url
 */
@Serializable(with = InlineContentPartImageImageUrlX38ea4836.Serializer::class)
public class InlineContentPartImageImageUrlX38ea4836(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineContentPartImageImageUrlX38ea4836 {
      check(urlValue != null) { "url is required" }
      return InlineContentPartImageImageUrlX38ea4836(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineContentPartImageImageUrlX38ea4836 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineContentPartImageImageUrlX38ea4836> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineContentPartImageImageUrlX38ea4836 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineContentPartImageImageUrlX38ea4836")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineContentPartImageImageUrlX38ea4836 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineContentPartImageImageUrlX38ea4836(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineContentPartImageImageUrlX38ea4836) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineContentPartImageImageUrlX38ea4836")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineContentPartImageImageUrlX38ea4836(block: InlineContentPartImageImageUrlX38ea4836.Builder.() -> Unit): InlineContentPartImageImageUrlX38ea4836 = InlineContentPartImageImageUrlX38ea4836.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineContentPartImageImageUrlX38ea4836 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

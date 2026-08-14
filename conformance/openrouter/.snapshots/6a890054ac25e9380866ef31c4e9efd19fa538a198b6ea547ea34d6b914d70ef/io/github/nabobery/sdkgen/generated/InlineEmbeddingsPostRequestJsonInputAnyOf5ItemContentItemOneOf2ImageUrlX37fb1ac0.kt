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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/1/properties/image_url.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/1/properties/image_url
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0.Serializer::class)
public class InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0 {
      check(urlValue != null) { "url is required" }
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0 must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0(block: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0.Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0 = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

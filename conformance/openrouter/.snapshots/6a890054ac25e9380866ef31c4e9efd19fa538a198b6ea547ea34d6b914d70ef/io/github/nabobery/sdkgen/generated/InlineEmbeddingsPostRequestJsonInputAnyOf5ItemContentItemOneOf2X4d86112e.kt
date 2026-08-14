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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/1
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e.Serializer::class)
public class InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e(
  public val imageUrl:
      InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0,
  public val type: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2TypeX5138d426,
) {
  public class Builder {
    private var imageUrlValue:
        InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0? = null

    public var imageUrl:
        InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0
      get() = requireNotNull(imageUrlValue) { "imageUrl is required" }
      set(`value`) {
        imageUrlValue = value
      }

    private var typeValue:
        InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2TypeX5138d426? = null

    public var type: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2TypeX5138d426
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e {
      check(imageUrlValue != null) { "imageUrl is required" }
      check(typeValue != null) { "type is required" }
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e(
        imageUrl = imageUrl,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e must be a JSON object")
      val imageUrl = json.decodeRequired<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2ImageUrlX37fb1ac0>(rawObject, "image_url")
      val type = json.decodeRequired<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2TypeX5138d426>(rawObject, "type")
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e(
        imageUrl = imageUrl,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("image_url", json.encodeToJsonElement(value.imageUrl))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e(block: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e.Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf2X4d86112e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

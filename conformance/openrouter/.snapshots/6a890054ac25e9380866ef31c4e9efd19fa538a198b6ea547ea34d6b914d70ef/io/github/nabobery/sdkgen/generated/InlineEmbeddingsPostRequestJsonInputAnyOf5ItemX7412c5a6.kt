package io.github.nabobery.sdkgen.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6.Serializer::class)
public class InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6(
  content: List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemXb431cc20>,
) {
  public val content: List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemXb431cc20> =
      content.toList()

  public class Builder {
    private var contentValue:
        List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemXb431cc20>? = null

    public var content: List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemXb431cc20>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
      }

    public fun build(): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6 {
      check(contentValue != null) { "content is required" }
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6 must be a JSON object")
      val content = json.decodeRequired<List<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemXb431cc20>>(rawObject, "content")
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6(block: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6.Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6 = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemX7412c5a6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

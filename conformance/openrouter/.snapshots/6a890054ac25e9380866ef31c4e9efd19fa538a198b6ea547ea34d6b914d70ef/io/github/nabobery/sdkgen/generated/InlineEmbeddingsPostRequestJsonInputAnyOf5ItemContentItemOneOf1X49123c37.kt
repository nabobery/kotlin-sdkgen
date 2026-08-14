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
 * nyOf/4/items/properties/content/items/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/0
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37.Serializer::class)
public class InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37(
  public val text: String,
  public val type: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue:
        InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5? = null

    public var type: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37 {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37(
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37 must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1TypeXc13ea4d5>(rawObject, "type")
      return InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37(
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37(block: InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37.Builder.() -> Unit): InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37 = InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostRequestJsonInputAnyOf5ItemContentItemOneOf1X49123c37 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

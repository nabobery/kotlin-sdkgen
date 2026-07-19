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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/0.
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37
  .Serializer::class)
public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37(
  public val text: String,
  public val type:
      InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5? =
        null

    public var type:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37(
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 " +
          "must be a JSON object")
      val text = json.decodeRequired<String>(raw, "text")
      val type = json
        .decodeRequired<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5>(raw,
          "type")
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37(
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37(block: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37.Builder.() -> Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items
  .Serializer::class)
public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items(
  content: List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20>,
) {
  public val content:
      List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20>
      = content.toList()

  public class Builder {
    private var contentValue:
        List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20>?
        = null

    public var content:
        List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20>
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    public fun build(): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items {
      check(contentValue != null) { "content is required" }
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items(
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items {
      val jsonDecoder = decoder
























































                                                                                                                        .requireJsonDecoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items " +
          "must be a JSON object")
      val content = json
























































                                                                                                                        .decodeRequired<List<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20>>(raw, "content")
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items(
        content = content,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items) {
      val jsonEncoder = encoder
























































                                                                                                                        .requireJsonEncoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items(block: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items.Builder.() -> Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAnyOf4Items " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

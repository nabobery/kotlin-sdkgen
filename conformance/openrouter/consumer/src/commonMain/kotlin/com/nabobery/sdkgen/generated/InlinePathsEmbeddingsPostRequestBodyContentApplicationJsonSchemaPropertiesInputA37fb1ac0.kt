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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items/oneOf/1/properties/image_url.
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0
  .Serializer::class)
public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0(
  public val url: String,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0 {
      check(urlValue != null) { "url is required" }
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0(
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0 = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0 " +
          "must be a JSON object")
      val url = json.decodeRequired<String>(raw, "url")
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0(
        url = url,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0(block: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0.Builder.() -> Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0 = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0 " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

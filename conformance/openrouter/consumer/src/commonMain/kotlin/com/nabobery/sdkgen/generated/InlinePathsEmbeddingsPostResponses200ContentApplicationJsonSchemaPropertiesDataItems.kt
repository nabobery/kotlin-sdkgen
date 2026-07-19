package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * A single embedding object
 */
@Serializable(with = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems
  .Serializer::class)
public class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems(
  /**
   * Embedding vector as an array of floats or a base64 string
   */
  public val embedding:
      InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c,
  public val objectValue:
      InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataIf4d6e8ae,
  /**
   * Index of the embedding in the input list
   */
  public val index: Int? = null,
) {
  public class Builder {
    private var embeddingValue:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c? =
        null

    public var embedding:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c
      get() = requireNotNull(embeddingValue) { "embedding is required" }
      set(`value`) {
        embeddingValue = value
      }

    private var objectValueValue:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataIf4d6e8ae? =
        null

    public var objectValue:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataIf4d6e8ae
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Index of the embedding in the input list
     */
    public var index: Int? = null

    public fun build(): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems {
      check(embeddingValue != null) { "embedding is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems(
        embedding = embedding,
        objectValue = objectValue,
        index = index,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems " +
          "must be a JSON object")
      val embedding = json
        .decodeRequired<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataI4e9ff00c>(raw,
          "embedding")
      val objectValue = json
        .decodeRequired<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataIf4d6e8ae>(raw,
          "object")
      return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems(
        embedding = embedding,
        objectValue = objectValue,
        index = raw["index"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("embedding", json.encodeToJsonElement(value.embedding))
        put("object", json.encodeToJsonElement(value.objectValue))
        value.index?.let { put("index", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems(block: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems.Builder.() -> Unit): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

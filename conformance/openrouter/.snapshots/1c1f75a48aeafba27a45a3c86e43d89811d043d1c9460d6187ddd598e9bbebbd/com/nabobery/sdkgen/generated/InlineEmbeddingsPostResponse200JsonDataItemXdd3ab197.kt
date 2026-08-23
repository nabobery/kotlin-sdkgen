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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/data/
 * items
 */
@Serializable(with = InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197.Serializer::class)
public class InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197(
  /**
   * Embedding vector as an array of floats or a base64 string
   */
  public val embedding: InlineEmbeddingsPostResponse200JsonDataItemEmbeddingX4e9ff00c,
  public val objectValue: InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae,
  /**
   * Index of the embedding in the input list
   */
  public val index: Int? = null,
) {
  public class Builder {
    private var embeddingValue: InlineEmbeddingsPostResponse200JsonDataItemEmbeddingX4e9ff00c? =
        null

    public var embedding: InlineEmbeddingsPostResponse200JsonDataItemEmbeddingX4e9ff00c
      get() = requireNotNull(embeddingValue) { "embedding is required" }
      set(`value`) {
        embeddingValue = value
      }

    private var objectValueValue: InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae? =
        null

    public var objectValue: InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Index of the embedding in the input list
     */
    public var index: Int? = null

    public fun build(): InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197 {
      check(embeddingValue != null) { "embedding is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197(
        embedding = embedding,
        objectValue = objectValue,
        index = index,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197 must be a JSON object")
      val embedding = json.decodeRequired<InlineEmbeddingsPostResponse200JsonDataItemEmbeddingX4e9ff00c>(rawObject, "embedding")
      val objectValue = json.decodeRequired<InlineEmbeddingsPostResponse200JsonDataItemObjectValueXf4d6e8ae>(rawObject, "object")
      return InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197(
        embedding = embedding,
        objectValue = objectValue,
        index = rawObject["index"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197")
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

public fun inlineEmbeddingsPostResponse200JsonDataItemXdd3ab197(block: InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197.Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197 = InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostResponse200JsonDataItemXdd3ab197 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

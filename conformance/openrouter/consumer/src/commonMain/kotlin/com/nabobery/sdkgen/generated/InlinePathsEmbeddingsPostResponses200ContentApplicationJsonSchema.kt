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
 * Embeddings response containing embedding vectors
 */
@Serializable(with = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema(
  `data`: List<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems>,
  /**
   * The model used for embeddings
   */
  public val model: String,
  public val objectValue:
      InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject,
  /**
   * Unique identifier for the embeddings response
   */
  public val id: String? = null,
  /**
   * Token usage statistics
   */
  public val usage:
      InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage? = null,
) {
  /**
   * List of embedding objects
   */
  public val `data`:
      List<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems> =
      data.toList()

  public class Builder {
    private var dataValue:
        List<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems>?
        = null

    public var `data`:
        List<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var objectValueValue:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject? = null

    public var objectValue:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    /**
     * Unique identifier for the embeddings response
     */
    public var id: String? = null

    /**
     * Token usage statistics
     */
    public var usage:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage? = null

    public fun build(): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema {
      check(dataValue != null) { "data is required" }
      check(modelValue != null) { "model is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema(
        data = data,
        model = model,
        objectValue = objectValue,
        id = id,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema must be a " +
          "JSON object")
      val data = json
        .decodeRequired<List<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesDataItems>>(raw, "data")
      val model = json.decodeRequired<String>(raw, "model")
      val objectValue = json
        .decodeRequired<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesObject>(raw,
          "object")
      return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema(
        data = data,
        model = model,
        objectValue = objectValue,
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = raw["usage"]?.let { json
          .decodeFromJsonElement<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("model", value.model)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.id?.let { put("id", it) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema(block: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}

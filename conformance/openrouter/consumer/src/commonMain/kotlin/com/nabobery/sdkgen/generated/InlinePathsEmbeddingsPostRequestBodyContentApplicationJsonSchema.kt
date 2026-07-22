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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Embeddings request input
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema.Serializer::class)
public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema(
  /**
   * Text, token, or multimodal input(s) to embed
   */
  public val input: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput,
  /**
   * The model to use for embeddings
   */
  public val model: String,
  /**
   * The number of dimensions for the output embeddings
   */
  public val dimensions: Int? = null,
  /**
   * The format of the output embeddings
   */
  public val encodingFormat:
      InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat? = null,
  /**
   * The type of input (e.g. search_query, search_document)
   */
  public val inputType: String? = null,
  public val provider: ProviderPreferences? = null,
  /**
   * A unique identifier for the end-user
   */
  public val user: String? = null,
) {
  public class Builder {
    private var inputValue:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput? = null

    public var input:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput
      get() = requireNotNull(inputValue) { "input is required" }
      set(`value`) {
        inputValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    /**
     * The number of dimensions for the output embeddings
     */
    public var dimensions: Int? = null

    /**
     * The format of the output embeddings
     */
    public var encodingFormat:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat? =
        null

    /**
     * The type of input (e.g. search_query, search_document)
     */
    public var inputType: String? = null

    public var provider: ProviderPreferences? = null

    /**
     * A unique identifier for the end-user
     */
    public var user: String? = null

    public fun build(): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema {
      check(inputValue != null) { "input is required" }
      check(modelValue != null) { "model is required" }
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema(
        input = input,
        model = model,
        dimensions = dimensions,
        encodingFormat = encodingFormat,
        inputType = inputType,
        provider = provider,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema must be a JSON " +
          "object")
      val input = json
        .decodeRequired<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInput>(raw, "input")
      val model = json.decodeRequired<String>(raw, "model")
      return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema(
        input = input,
        model = model,
        dimensions = raw["dimensions"]?.let { json.decodeFromJsonElement<Int>(it) },
        encodingFormat = raw["encoding_format"]?.let { json
          .decodeFromJsonElement<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesEncodingFormat>(it) },
        inputType = raw["input_type"]?.let { json.decodeFromJsonElement<String>(it) },
        provider = raw["provider"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ProviderPreferences?>(element) },
        user = raw["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input", json.encodeToJsonElement(value.input))
        put("model", value.model)
        value.dimensions?.let { put("dimensions", json.encodeToJsonElement(it)) }
        value.encodingFormat?.let { put("encoding_format", json.encodeToJsonElement(it)) }
        value.inputType?.let { put("input_type", it) }
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema(block: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}

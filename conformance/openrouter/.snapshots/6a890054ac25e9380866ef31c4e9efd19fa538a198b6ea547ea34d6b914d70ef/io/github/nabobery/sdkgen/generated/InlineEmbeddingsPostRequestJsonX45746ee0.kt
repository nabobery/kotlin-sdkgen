package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineEmbeddingsPostRequestJsonX45746ee0.Serializer::class)
public class InlineEmbeddingsPostRequestJsonX45746ee0(
  /**
   * Text, token, or multimodal input(s) to embed
   */
  public val input: InlineEmbeddingsPostRequestJsonInputXf4a228e1,
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
  public val encodingFormat: InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de? = null,
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
    private var inputValue: InlineEmbeddingsPostRequestJsonInputXf4a228e1? = null

    public var input: InlineEmbeddingsPostRequestJsonInputXf4a228e1
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
    public var encodingFormat: InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de? = null

    /**
     * The type of input (e.g. search_query, search_document)
     */
    public var inputType: String? = null

    public var provider: ProviderPreferences? = null

    /**
     * A unique identifier for the end-user
     */
    public var user: String? = null

    public fun build(): InlineEmbeddingsPostRequestJsonX45746ee0 {
      check(inputValue != null) { "input is required" }
      check(modelValue != null) { "model is required" }
      return InlineEmbeddingsPostRequestJsonX45746ee0(
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
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostRequestJsonX45746ee0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostRequestJsonX45746ee0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostRequestJsonX45746ee0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostRequestJsonX45746ee0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostRequestJsonX45746ee0 must be a JSON object")
      val input = json.decodeRequired<InlineEmbeddingsPostRequestJsonInputXf4a228e1>(rawObject, "input")
      val model = json.decodeRequired<String>(rawObject, "model")
      return InlineEmbeddingsPostRequestJsonX45746ee0(
        input = input,
        model = model,
        dimensions = rawObject["dimensions"]?.let { json.decodeFromJsonElement<Int>(it) },
        encodingFormat = rawObject["encoding_format"]?.let { json.decodeFromJsonElement<InlineEmbeddingsPostRequestJsonEncodingFormatXdcac62de>(it) },
        inputType = rawObject["input_type"]?.let { json.decodeFromJsonElement<String>(it) },
        provider = rawObject["provider"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ProviderPreferences?>(element) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostRequestJsonX45746ee0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostRequestJsonX45746ee0")
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

public fun inlineEmbeddingsPostRequestJsonX45746ee0(block: InlineEmbeddingsPostRequestJsonX45746ee0.Builder.() -> Unit): InlineEmbeddingsPostRequestJsonX45746ee0 = InlineEmbeddingsPostRequestJsonX45746ee0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostRequestJsonX45746ee0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

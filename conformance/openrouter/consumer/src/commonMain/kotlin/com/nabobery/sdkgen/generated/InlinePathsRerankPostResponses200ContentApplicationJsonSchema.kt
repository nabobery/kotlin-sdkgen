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
 * Rerank response containing ranked results
 */
@Serializable(with = InlinePathsRerankPostResponses200ContentApplicationJsonSchema.Serializer::class)
public class InlinePathsRerankPostResponses200ContentApplicationJsonSchema(
  /**
   * The model used for reranking
   */
  public val model: String,
  results: List<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems>,
  /**
   * Unique identifier for the rerank response (ORID format)
   */
  public val id: String? = null,
  /**
   * The provider that served the rerank request
   */
  public val provider: String? = null,
  /**
   * Usage statistics
   */
  public val usage:
      InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage? = null,
) {
  /**
   * List of rerank results sorted by relevance
   */
  public val results:
      List<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems> =
      results.toList()

  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var resultsValue:
        List<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems>? =
        null

    public var results:
        List<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems>
      get() = requireNotNull(resultsValue) { "results is required" }
      set(`value`) {
        resultsValue = value
      }

    /**
     * Unique identifier for the rerank response (ORID format)
     */
    public var id: String? = null

    /**
     * The provider that served the rerank request
     */
    public var provider: String? = null

    /**
     * Usage statistics
     */
    public var usage: InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage?
        = null

    public fun build(): InlinePathsRerankPostResponses200ContentApplicationJsonSchema {
      check(modelValue != null) { "model is required" }
      check(resultsValue != null) { "results is required" }
      return InlinePathsRerankPostResponses200ContentApplicationJsonSchema(
        model = model,
        results = results,
        id = id,
        provider = provider,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsRerankPostResponses200ContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsRerankPostResponses200ContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsRerankPostResponses200ContentApplicationJsonSchema must be a JSON " +
          "object")
      val model = json.decodeRequired<String>(raw, "model")
      val results = json
        .decodeRequired<List<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems>>(raw,
          "results")
      return InlinePathsRerankPostResponses200ContentApplicationJsonSchema(
        model = model,
        results = results,
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        provider = raw["provider"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = raw["usage"]?.let { json
          .decodeFromJsonElement<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsRerankPostResponses200ContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("results", json.encodeToJsonElement(value.results))
        value.id?.let { put("id", it) }
        value.provider?.let { put("provider", it) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsRerankPostResponses200ContentApplicationJsonSchema(block: InlinePathsRerankPostResponses200ContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchema = InlinePathsRerankPostResponses200ContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsRerankPostResponses200ContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}

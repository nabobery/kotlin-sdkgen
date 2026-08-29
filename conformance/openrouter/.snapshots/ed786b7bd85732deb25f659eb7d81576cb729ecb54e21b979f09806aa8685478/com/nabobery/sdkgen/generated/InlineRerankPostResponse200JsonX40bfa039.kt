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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1rerank/post/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineRerankPostResponse200JsonX40bfa039.Serializer::class)
public class InlineRerankPostResponse200JsonX40bfa039(
  /**
   * The model used for reranking
   */
  public val model: String,
  results: List<InlineRerankPostResponse200JsonResultsItemXe4c74fce>,
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
  public val usage: InlineRerankPostResponse200JsonUsageX233a77c3? = null,
) {
  /**
   * List of rerank results sorted by relevance
   */
  public val results: List<InlineRerankPostResponse200JsonResultsItemXe4c74fce> = results.toList()

  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var resultsValue: List<InlineRerankPostResponse200JsonResultsItemXe4c74fce>? = null

    public var results: List<InlineRerankPostResponse200JsonResultsItemXe4c74fce>
      get() = requireNotNull(resultsValue) { "results is required" }.toList()
      set(`value`) {
        resultsValue = value.toList()
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
    public var usage: InlineRerankPostResponse200JsonUsageX233a77c3? = null

    public fun build(): InlineRerankPostResponse200JsonX40bfa039 {
      check(modelValue != null) { "model is required" }
      check(resultsValue != null) { "results is required" }
      return InlineRerankPostResponse200JsonX40bfa039(
        model = model,
        results = results,
        id = id,
        provider = provider,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRerankPostResponse200JsonX40bfa039 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRerankPostResponse200JsonX40bfa039> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRerankPostResponse200JsonX40bfa039 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRerankPostResponse200JsonX40bfa039")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRerankPostResponse200JsonX40bfa039 must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val results = json.decodeRequired<List<InlineRerankPostResponse200JsonResultsItemXe4c74fce>>(rawObject, "results")
      return InlineRerankPostResponse200JsonX40bfa039(
        model = model,
        results = results,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        provider = rawObject["provider"]?.let { json.decodeFromJsonElement<String>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<InlineRerankPostResponse200JsonUsageX233a77c3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRerankPostResponse200JsonX40bfa039) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRerankPostResponse200JsonX40bfa039")
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

public fun inlineRerankPostResponse200JsonX40bfa039(block: InlineRerankPostResponse200JsonX40bfa039.Builder.() -> Unit): InlineRerankPostResponse200JsonX40bfa039 = InlineRerankPostResponse200JsonX40bfa039.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRerankPostResponse200JsonX40bfa039 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

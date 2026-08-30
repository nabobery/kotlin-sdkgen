package com.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Rerank request input
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1rerank/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineRerankPostRequestJsonX0cab2cab.Serializer::class)
public class InlineRerankPostRequestJsonX0cab2cab(
  documents: List<InlineRerankPostRequestJsonDocumentsItemX394b73e2>,
  /**
   * The rerank model to use
   */
  public val model: String,
  /**
   * The search query to rerank documents against
   */
  public val query: String,
  public val provider: ProviderPreferences? = null,
  /**
   * Number of most relevant documents to return
   */
  public val topN: Int? = null,
) {
  /**
   * The list of documents to rerank. Documents may be plain strings, or structured objects with `text` and/or `image`
   * for multimodal models.
   */
  public val documents: List<InlineRerankPostRequestJsonDocumentsItemX394b73e2> = documents.toList()

  public class Builder {
    private var documentsValue: List<InlineRerankPostRequestJsonDocumentsItemX394b73e2>? = null

    public var documents: List<InlineRerankPostRequestJsonDocumentsItemX394b73e2>
      get() = requireNotNull(documentsValue) { "documents is required" }.toList()
      set(`value`) {
        documentsValue = value.toList()
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var queryValue: String? = null

    public var query: String
      get() = requireNotNull(queryValue) { "query is required" }
      set(`value`) {
        queryValue = value
      }

    public var provider: ProviderPreferences? = null

    /**
     * Number of most relevant documents to return
     */
    public var topN: Int? = null

    public fun build(): InlineRerankPostRequestJsonX0cab2cab {
      check(documentsValue != null) { "documents is required" }
      check(modelValue != null) { "model is required" }
      check(queryValue != null) { "query is required" }
      return InlineRerankPostRequestJsonX0cab2cab(
        documents = documents,
        model = model,
        query = query,
        provider = provider,
        topN = topN,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRerankPostRequestJsonX0cab2cab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRerankPostRequestJsonX0cab2cab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRerankPostRequestJsonX0cab2cab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRerankPostRequestJsonX0cab2cab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRerankPostRequestJsonX0cab2cab must be a JSON object")
      val documents = json.decodeRequired<List<InlineRerankPostRequestJsonDocumentsItemX394b73e2>>(rawObject, "documents")
      val model = json.decodeRequired<String>(rawObject, "model")
      val query = json.decodeRequired<String>(rawObject, "query")
      return InlineRerankPostRequestJsonX0cab2cab(
        documents = documents,
        model = model,
        query = query,
        provider = rawObject["provider"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ProviderPreferences?>(element) },
        topN = rawObject["top_n"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRerankPostRequestJsonX0cab2cab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRerankPostRequestJsonX0cab2cab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("documents", json.encodeToJsonElement(value.documents))
        put("model", value.model)
        put("query", value.query)
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.topN?.let { put("top_n", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRerankPostRequestJsonX0cab2cab(block: InlineRerankPostRequestJsonX0cab2cab.Builder.() -> Unit): InlineRerankPostRequestJsonX0cab2cab = InlineRerankPostRequestJsonX0cab2cab.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRerankPostRequestJsonX0cab2cab is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

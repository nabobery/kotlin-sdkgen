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
 */
@Serializable(with = InlinePathsRerankPostRequestBodyContentApplicationJsonSchema.Serializer::class)
public class InlinePathsRerankPostRequestBodyContentApplicationJsonSchema(
  documents: List<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems>,
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
  public val documents:
      List<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems> =
      documents.toList()

  public class Builder {
    private var documentsValue:
        List<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems>?
        = null

    public var documents:
        List<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems>
      get() = requireNotNull(documentsValue) { "documents is required" }
      set(`value`) {
        documentsValue = value
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

    public fun build(): InlinePathsRerankPostRequestBodyContentApplicationJsonSchema {
      check(documentsValue != null) { "documents is required" }
      check(modelValue != null) { "model is required" }
      check(queryValue != null) { "query is required" }
      return InlinePathsRerankPostRequestBodyContentApplicationJsonSchema(
        documents = documents,
        model = model,
        query = query,
        provider = provider,
        topN = topN,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsRerankPostRequestBodyContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsRerankPostRequestBodyContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsRerankPostRequestBodyContentApplicationJsonSchema {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePathsRerankPostRequestBodyContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsRerankPostRequestBodyContentApplicationJsonSchema must be a JSON " +
          "object")
      val documents = json
























































                                                                                                                        .decodeRequired<List<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItems>>(raw, "documents")
      val model = json.decodeRequired<String>(raw, "model")
      val query = json.decodeRequired<String>(raw, "query")
      return InlinePathsRerankPostRequestBodyContentApplicationJsonSchema(
        documents = documents,
        model = model,
        query = query,
        provider = raw["provider"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ProviderPreferences?>(element) },
        topN = raw["top_n"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePathsRerankPostRequestBodyContentApplicationJsonSchema) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePathsRerankPostRequestBodyContentApplicationJsonSchema")
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

public fun inlinePathsRerankPostRequestBodyContentApplicationJsonSchema(block: InlinePathsRerankPostRequestBodyContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsRerankPostRequestBodyContentApplicationJsonSchema = InlinePathsRerankPostRequestBodyContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsRerankPostRequestBodyContentApplicationJsonSchema is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}

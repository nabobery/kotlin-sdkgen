package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * A single rerank result
 */
@Serializable(with = InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems
  .Serializer::class)
public class InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems(
  /**
   * The document object echoing the original input (text and/or image)
   */
  public val document:
      InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20,
  /**
   * Index of the document in the original input list
   */
  public val index: Int,
  /**
   * Relevance score of the document to the query
   */
  public val relevanceScore: Double,
) {
  public class Builder {
    private var documentValue:
        InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20? =
        null

    public var document:
        InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20
      get() = requireNotNull(documentValue) { "document is required" }
      set(`value`) {
        documentValue = value
      }

    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    private var relevanceScoreValue: Double? = null

    public var relevanceScore: Double
      get() = requireNotNull(relevanceScoreValue) { "relevanceScore is required" }
      set(`value`) {
        relevanceScoreValue = value
      }

    public fun build(): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems {
      check(documentValue != null) { "document is required" }
      check(indexValue != null) { "index is required" }
      check(relevanceScoreValue != null) { "relevanceScore is required" }
      return InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems(
        document = document,
        index = index,
        relevanceScore = relevanceScore,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems " +
          "must be a JSON object")
      val document = json
        .decodeRequired<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20>(raw,
          "document")
      val index = json.decodeRequired<Int>(raw, "index")
      val relevanceScore = json.decodeRequired<Double>(raw, "relevance_score")
      return InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems(
        document = document,
        index = index,
        relevanceScore = relevanceScore,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("document", json.encodeToJsonElement(value.document))
        put("index", json.encodeToJsonElement(value.index))
        put("relevance_score", json.encodeToJsonElement(value.relevanceScore))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems(block: InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems.Builder.() -> Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems = InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItems " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

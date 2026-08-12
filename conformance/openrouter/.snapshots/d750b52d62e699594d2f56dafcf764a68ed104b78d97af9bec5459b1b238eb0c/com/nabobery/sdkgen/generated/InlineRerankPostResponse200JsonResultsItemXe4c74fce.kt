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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1rerank/post/responses/200/content/application~1json/schema/properties/results/i
 * tems
 */
@Serializable(with = InlineRerankPostResponse200JsonResultsItemXe4c74fce.Serializer::class)
public class InlineRerankPostResponse200JsonResultsItemXe4c74fce(
  /**
   * The document object echoing the original input (text and/or image)
   */
  public val document: InlineRerankPostResponse200JsonResultsItemDocumentXfec02a20,
  /**
   * Index of the document in the original input list
   */
  public val index: Int,
  /**
   * Relevance score of the document to the query
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val relevanceScore: Double,
) {
  public class Builder {
    private var documentValue: InlineRerankPostResponse200JsonResultsItemDocumentXfec02a20? = null

    public var document: InlineRerankPostResponse200JsonResultsItemDocumentXfec02a20
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

    public fun build(): InlineRerankPostResponse200JsonResultsItemXe4c74fce {
      check(documentValue != null) { "document is required" }
      check(indexValue != null) { "index is required" }
      check(relevanceScoreValue != null) { "relevanceScore is required" }
      return InlineRerankPostResponse200JsonResultsItemXe4c74fce(
        document = document,
        index = index,
        relevanceScore = relevanceScore,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRerankPostResponse200JsonResultsItemXe4c74fce = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRerankPostResponse200JsonResultsItemXe4c74fce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRerankPostResponse200JsonResultsItemXe4c74fce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRerankPostResponse200JsonResultsItemXe4c74fce")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRerankPostResponse200JsonResultsItemXe4c74fce must be a JSON object")
      val document = json.decodeRequired<InlineRerankPostResponse200JsonResultsItemDocumentXfec02a20>(rawObject, "document")
      val index = json.decodeRequired<Int>(rawObject, "index")
      val relevanceScore = json.decodeRequired<Double>(rawObject, "relevance_score")
      return InlineRerankPostResponse200JsonResultsItemXe4c74fce(
        document = document,
        index = index,
        relevanceScore = relevanceScore,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRerankPostResponse200JsonResultsItemXe4c74fce) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRerankPostResponse200JsonResultsItemXe4c74fce")
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

public fun inlineRerankPostResponse200JsonResultsItemXe4c74fce(block: InlineRerankPostResponse200JsonResultsItemXe4c74fce.Builder.() -> Unit): InlineRerankPostResponse200JsonResultsItemXe4c74fce = InlineRerankPostResponse200JsonResultsItemXe4c74fce.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRerankPostResponse200JsonResultsItemXe4c74fce is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

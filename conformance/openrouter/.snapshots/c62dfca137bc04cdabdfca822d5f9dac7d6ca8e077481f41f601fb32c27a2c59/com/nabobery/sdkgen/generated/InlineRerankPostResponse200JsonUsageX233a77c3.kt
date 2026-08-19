package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Usage statistics
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1rerank/post/responses/200/content/application~1json/schema/properties/usage
 */
@Serializable(with = InlineRerankPostResponse200JsonUsageX233a77c3.Serializer::class)
public class InlineRerankPostResponse200JsonUsageX233a77c3(
  /**
   * Cost of the request in credits
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val cost: Double? = null,
  /**
   * Number of search units consumed (Cohere billing)
   */
  public val searchUnits: Int? = null,
  /**
   * Total number of tokens used
   */
  public val totalTokens: Int? = null,
) {
  public class Builder {
    /**
     * Cost of the request in credits
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var cost: Double? = null

    /**
     * Number of search units consumed (Cohere billing)
     */
    public var searchUnits: Int? = null

    /**
     * Total number of tokens used
     */
    public var totalTokens: Int? = null

    public fun build(): InlineRerankPostResponse200JsonUsageX233a77c3 = InlineRerankPostResponse200JsonUsageX233a77c3(
      cost = cost,
      searchUnits = searchUnits,
      totalTokens = totalTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRerankPostResponse200JsonUsageX233a77c3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRerankPostResponse200JsonUsageX233a77c3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRerankPostResponse200JsonUsageX233a77c3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRerankPostResponse200JsonUsageX233a77c3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRerankPostResponse200JsonUsageX233a77c3 must be a JSON object")
      return InlineRerankPostResponse200JsonUsageX233a77c3(
        cost = rawObject["cost"]?.let { json.decodeFromJsonElement<Double>(it) },
        searchUnits = rawObject["search_units"]?.let { json.decodeFromJsonElement<Int>(it) },
        totalTokens = rawObject["total_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRerankPostResponse200JsonUsageX233a77c3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRerankPostResponse200JsonUsageX233a77c3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.searchUnits?.let { put("search_units", json.encodeToJsonElement(it)) }
        value.totalTokens?.let { put("total_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRerankPostResponse200JsonUsageX233a77c3(block: InlineRerankPostResponse200JsonUsageX233a77c3.Builder.() -> Unit): InlineRerankPostResponse200JsonUsageX233a77c3 = InlineRerankPostResponse200JsonUsageX233a77c3.build(block)

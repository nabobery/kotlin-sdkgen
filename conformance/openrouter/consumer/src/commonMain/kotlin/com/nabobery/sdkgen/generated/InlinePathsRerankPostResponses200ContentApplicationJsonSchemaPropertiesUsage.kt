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
 */
@Serializable(with = InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage.Serializer::class)
public class InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage(
  /**
   * Cost of the request in credits
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

    public fun build(): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage =
      InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage(
      cost = cost,
      searchUnits = searchUnits,
      totalTokens = totalTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage " +
          "must be a JSON object")
      return InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage(
        cost = raw["cost"]?.let { json.decodeFromJsonElement<Double>(it) },
        searchUnits = raw["search_units"]?.let { json.decodeFromJsonElement<Int>(it) },
        totalTokens = raw["total_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage")
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

public fun inlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage(block: InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage.Builder.() -> Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage = InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesUsage.build(block)

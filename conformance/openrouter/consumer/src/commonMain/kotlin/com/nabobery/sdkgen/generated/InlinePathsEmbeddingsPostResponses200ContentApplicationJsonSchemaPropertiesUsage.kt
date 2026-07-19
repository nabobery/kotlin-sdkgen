package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Token usage statistics
 */
@Serializable(with = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage.Serializer::class)
public class InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage(
  /**
   * Number of tokens in the input
   */
  public val promptTokens: Int,
  /**
   * Total number of tokens used
   */
  public val totalTokens: Int,
  /**
   * Cost of the request in credits
   */
  public val cost: Double? = null,
  public val costDetails: CostDetails? = null,
  /**
   * Whether a request was made using a Bring Your Own Key configuration
   */
  public val isByok: Boolean? = null,
  /**
   * Per-modality token breakdown. Only present when the input contains 2+ modalities (e.g. text + image) and the
   * upstream provider returns modality-level usage data. Only non-zero modality counts are included.
   */
  public val promptTokensDetails:
      InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage5c2f467b? = null,
) {
  public class Builder {
    private var promptTokensValue: Int? = null

    public var promptTokens: Int
      get() = requireNotNull(promptTokensValue) { "promptTokens is required" }
      set(`value`) {
        promptTokensValue = value
      }

    private var totalTokensValue: Int? = null

    public var totalTokens: Int
      get() = requireNotNull(totalTokensValue) { "totalTokens is required" }
      set(`value`) {
        totalTokensValue = value
      }

    /**
     * Cost of the request in credits
     */
    public var cost: Double? = null

    public var costDetails: CostDetails? = null

    /**
     * Whether a request was made using a Bring Your Own Key configuration
     */
    public var isByok: Boolean? = null

    /**
     * Per-modality token breakdown. Only present when the input contains 2+ modalities (e.g. text + image) and the
     * upstream provider returns modality-level usage data. Only non-zero modality counts are included.
     */
    public var promptTokensDetails:
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage5c2f467b? =
        null

    public fun build(): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage {
      check(promptTokensValue != null) { "promptTokens is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage(
        promptTokens = promptTokens,
        totalTokens = totalTokens,
        cost = cost,
        costDetails = costDetails,
        isByok = isByok,
        promptTokensDetails = promptTokensDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage " +
          "must be a JSON object")
      val promptTokens = json.decodeRequired<Int>(raw, "prompt_tokens")
      val totalTokens = json.decodeRequired<Int>(raw, "total_tokens")
      return InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage(
        promptTokens = promptTokens,
        totalTokens = totalTokens,
        cost = raw["cost"]?.let { json.decodeFromJsonElement<Double>(it) },
        costDetails = raw["cost_details"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<CostDetails?>(element) },
        isByok = raw["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        promptTokensDetails = raw["prompt_tokens_details"]?.let { json























































                                                                                                                        .decodeFromJsonElement<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage5c2f467b>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("prompt_tokens", json.encodeToJsonElement(value.promptTokens))
        put("total_tokens", json.encodeToJsonElement(value.totalTokens))
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.costDetails?.let { put("cost_details", json.encodeToJsonElement(it)) }
        value.isByok?.let { put("is_byok", json.encodeToJsonElement(it)) }
        value.promptTokensDetails?.let { put("prompt_tokens_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage(block: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage.Builder.() -> Unit): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage = InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchemaPropertiesUsage is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

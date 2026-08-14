package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/responses/200/content/application~1json/schema/properties/usage
 */
@Serializable(with = InlineEmbeddingsPostResponse200JsonUsageXe5f9524c.Serializer::class)
public class InlineEmbeddingsPostResponse200JsonUsageXe5f9524c(
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
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
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
      InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b? = null,
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
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
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
        InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b? = null

    public fun build(): InlineEmbeddingsPostResponse200JsonUsageXe5f9524c {
      check(promptTokensValue != null) { "promptTokens is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return InlineEmbeddingsPostResponse200JsonUsageXe5f9524c(
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
    public fun build(block: Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonUsageXe5f9524c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEmbeddingsPostResponse200JsonUsageXe5f9524c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEmbeddingsPostResponse200JsonUsageXe5f9524c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEmbeddingsPostResponse200JsonUsageXe5f9524c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEmbeddingsPostResponse200JsonUsageXe5f9524c must be a JSON object")
      val promptTokens = json.decodeRequired<Int>(rawObject, "prompt_tokens")
      val totalTokens = json.decodeRequired<Int>(rawObject, "total_tokens")
      return InlineEmbeddingsPostResponse200JsonUsageXe5f9524c(
        promptTokens = promptTokens,
        totalTokens = totalTokens,
        cost = rawObject["cost"]?.let { json.decodeFromJsonElement<Double>(it) },
        costDetails = rawObject["cost_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CostDetails?>(element) },
        isByok = rawObject["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        promptTokensDetails = rawObject["prompt_tokens_details"]?.let { json.decodeFromJsonElement<InlineEmbeddingsPostResponse200JsonUsagePromptTokensDetailsX5c2f467b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEmbeddingsPostResponse200JsonUsageXe5f9524c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEmbeddingsPostResponse200JsonUsageXe5f9524c")
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

public fun inlineEmbeddingsPostResponse200JsonUsageXe5f9524c(block: InlineEmbeddingsPostResponse200JsonUsageXe5f9524c.Builder.() -> Unit): InlineEmbeddingsPostResponse200JsonUsageXe5f9524c = InlineEmbeddingsPostResponse200JsonUsageXe5f9524c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEmbeddingsPostResponse200JsonUsageXe5f9524c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

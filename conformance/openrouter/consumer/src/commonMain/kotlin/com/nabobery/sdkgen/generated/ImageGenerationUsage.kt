package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Token and cost usage for the image generation request, when available
 */
@Serializable(with = ImageGenerationUsage.Serializer::class)
public class ImageGenerationUsage(
  /**
   * The tokens generated
   */
  public val completionTokens: Int,
  /**
   * Including images, input audio, and tools if any
   */
  public val promptTokens: Int,
  /**
   * Sum of the above two fields
   */
  public val totalTokens: Int,
  public val cacheCreation: AnthropicCacheCreation? = null,
  public val completionTokensDetails:
      InlineComponentsSchemasImageGenerationUsagePropertiesCompletionTokensDetails? = null,
  /**
   * Cost of the completion
   */
  public val cost: Double? = null,
  public val costDetails: CostDetails? = null,
  /**
   * Whether a request was made using a Bring Your Own Key configuration
   */
  public val isByok: Boolean? = null,
  public val iterations: List<AnthropicUsageIteration>? = null,
  /**
   * Breakdown of tokens used in the prompt.
   */
  public val promptTokensDetails:
      InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails? = null,
  /**
   * Usage for server-side tool execution (e.g., web search)
   */
  public val serverToolUse:
      InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse? = null,
  /**
   * The service tier used by the upstream provider for this request
   */
  public val serviceTier: String? = null,
  public val speed: AnthropicSpeed? = null,
) {
  public class Builder {
    private var completionTokensValue: Int? = null

    public var completionTokens: Int
      get() = requireNotNull(completionTokensValue) { "completionTokens is required" }
      set(`value`) {
        completionTokensValue = value
      }

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

    public var cacheCreation: AnthropicCacheCreation? = null

    public var completionTokensDetails:
        InlineComponentsSchemasImageGenerationUsagePropertiesCompletionTokensDetails? = null

    /**
     * Cost of the completion
     */
    public var cost: Double? = null

    public var costDetails: CostDetails? = null

    /**
     * Whether a request was made using a Bring Your Own Key configuration
     */
    public var isByok: Boolean? = null

    public var iterations: List<AnthropicUsageIteration>? = null

    /**
     * Breakdown of tokens used in the prompt.
     */
    public var promptTokensDetails:
        InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails? = null

    /**
     * Usage for server-side tool execution (e.g., web search)
     */
    public var serverToolUse: InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse? =
        null

    /**
     * The service tier used by the upstream provider for this request
     */
    public var serviceTier: String? = null

    public var speed: AnthropicSpeed? = null

    public fun build(): ImageGenerationUsage {
      check(completionTokensValue != null) { "completionTokens is required" }
      check(promptTokensValue != null) { "promptTokens is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return ImageGenerationUsage(
        completionTokens = completionTokens,
        promptTokens = promptTokens,
        totalTokens = totalTokens,
        cacheCreation = cacheCreation,
        completionTokensDetails = completionTokensDetails,
        cost = cost,
        costDetails = costDetails,
        isByok = isByok,
        iterations = iterations,
        promptTokensDetails = promptTokensDetails,
        serverToolUse = serverToolUse,
        serviceTier = serviceTier,
        speed = speed,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenerationUsage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageGenerationUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenerationUsage {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenerationUsage")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenerationUsage must be a JSON object")
      val completionTokens = json.decodeRequired<Int>(raw, "completion_tokens")
      val promptTokens = json.decodeRequired<Int>(raw, "prompt_tokens")
      val totalTokens = json.decodeRequired<Int>(raw, "total_tokens")
      return ImageGenerationUsage(
        completionTokens = completionTokens,
        promptTokens = promptTokens,
        totalTokens = totalTokens,
        cacheCreation = raw["cache_creation"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicCacheCreation?>(element) },
        completionTokensDetails = raw["completion_tokens_details"]?.let { element ->
          if (element == JsonNull) null else json
            .decodeFromJsonElement<InlineComponentsSchemasImageGenerationUsagePropertiesCompletionTokensDetails?>(element) },
        cost = raw["cost"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        costDetails = raw["cost_details"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<CostDetails?>(element) },
        isByok = raw["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        iterations = raw["iterations"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<AnthropicUsageIteration>?>(element) },
        promptTokensDetails = raw["prompt_tokens_details"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails?>(element) },
        serverToolUse = raw["server_tool_use"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse?>(element) },
        serviceTier = raw["service_tier"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        speed = raw["speed"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicSpeed?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenerationUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenerationUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completion_tokens", json.encodeToJsonElement(value.completionTokens))
        put("prompt_tokens", json.encodeToJsonElement(value.promptTokens))
        put("total_tokens", json.encodeToJsonElement(value.totalTokens))
        value.cacheCreation?.let { put("cache_creation", json.encodeToJsonElement(it)) }
        value.completionTokensDetails?.let { put("completion_tokens_details", json.encodeToJsonElement(it)) }
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.costDetails?.let { put("cost_details", json.encodeToJsonElement(it)) }
        value.isByok?.let { put("is_byok", json.encodeToJsonElement(it)) }
        value.iterations?.let { put("iterations", json.encodeToJsonElement(it)) }
        value.promptTokensDetails?.let { put("prompt_tokens_details", json.encodeToJsonElement(it)) }
        value.serverToolUse?.let { put("server_tool_use", json.encodeToJsonElement(it)) }
        value.serviceTier?.let { put("service_tier", it) }
        value.speed?.let { put("speed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenerationUsage(block: ImageGenerationUsage.Builder.() -> Unit): ImageGenerationUsage =
  ImageGenerationUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageGenerationUsage is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

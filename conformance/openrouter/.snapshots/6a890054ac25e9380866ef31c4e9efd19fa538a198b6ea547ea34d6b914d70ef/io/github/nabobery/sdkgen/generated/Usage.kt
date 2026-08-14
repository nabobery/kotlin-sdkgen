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
 * Token usage information for the response
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Usage
 */
@Serializable(with = Usage.Serializer::class)
public class Usage(
  public val inputTokens: Int,
  public val inputTokensDetails: InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e,
  public val outputTokens: Int,
  public val outputTokensDetails: InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3,
  public val totalTokens: Int,
  /**
   * Cost of the completion
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val cost: Double? = null,
  public val costDetails: InlineUsageAllOf2CostDetailsX08abd2be? = null,
  /**
   * Whether a request was made using a Bring Your Own Key configuration
   */
  public val isByok: Boolean? = null,
  public val serverToolUseDetails: ServerToolUseDetails? = null,
) {
  public class Builder {
    private var inputTokensValue: Int? = null

    public var inputTokens: Int
      get() = requireNotNull(inputTokensValue) { "inputTokens is required" }
      set(`value`) {
        inputTokensValue = value
      }

    private var inputTokensDetailsValue: InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e? =
        null

    public var inputTokensDetails: InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e
      get() = requireNotNull(inputTokensDetailsValue) { "inputTokensDetails is required" }
      set(`value`) {
        inputTokensDetailsValue = value
      }

    private var outputTokensValue: Int? = null

    public var outputTokens: Int
      get() = requireNotNull(outputTokensValue) { "outputTokens is required" }
      set(`value`) {
        outputTokensValue = value
      }

    private var outputTokensDetailsValue: InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3? =
        null

    public var outputTokensDetails: InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3
      get() = requireNotNull(outputTokensDetailsValue) { "outputTokensDetails is required" }
      set(`value`) {
        outputTokensDetailsValue = value
      }

    private var totalTokensValue: Int? = null

    public var totalTokens: Int
      get() = requireNotNull(totalTokensValue) { "totalTokens is required" }
      set(`value`) {
        totalTokensValue = value
      }

    /**
     * Cost of the completion
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var cost: Double? = null

    public var costDetails: InlineUsageAllOf2CostDetailsX08abd2be? = null

    /**
     * Whether a request was made using a Bring Your Own Key configuration
     */
    public var isByok: Boolean? = null

    public var serverToolUseDetails: ServerToolUseDetails? = null

    public fun build(): Usage {
      check(inputTokensValue != null) { "inputTokens is required" }
      check(inputTokensDetailsValue != null) { "inputTokensDetails is required" }
      check(outputTokensValue != null) { "outputTokens is required" }
      check(outputTokensDetailsValue != null) { "outputTokensDetails is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return Usage(
        inputTokens = inputTokens,
        inputTokensDetails = inputTokensDetails,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetails,
        totalTokens = totalTokens,
        cost = cost,
        costDetails = costDetails,
        isByok = isByok,
        serverToolUseDetails = serverToolUseDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Usage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Usage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Usage {
      val jsonDecoder = decoder.requireJsonDecoder("Usage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Usage must be a JSON object")
      val inputTokens = json.decodeRequired<Int>(rawObject, "input_tokens")
      val inputTokensDetails = json.decodeRequired<InlineOpenAiResponsesUsageInputTokensDetailsX9eaffc8e>(rawObject, "input_tokens_details")
      val outputTokens = json.decodeRequired<Int>(rawObject, "output_tokens")
      val outputTokensDetails = json.decodeRequired<InlineOpenAiResponsesUsageOutputTokensDetailsXeb5286a3>(rawObject, "output_tokens_details")
      val totalTokens = json.decodeRequired<Int>(rawObject, "total_tokens")
      return Usage(
        inputTokens = inputTokens,
        inputTokensDetails = inputTokensDetails,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetails,
        totalTokens = totalTokens,
        cost = rawObject["cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        costDetails = rawObject["cost_details"]?.let { json.decodeFromJsonElement<InlineUsageAllOf2CostDetailsX08abd2be>(it) },
        isByok = rawObject["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        serverToolUseDetails = rawObject["server_tool_use_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ServerToolUseDetails?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Usage) {
      val jsonEncoder = encoder.requireJsonEncoder("Usage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_tokens", json.encodeToJsonElement(value.inputTokens))
        put("input_tokens_details", json.encodeToJsonElement(value.inputTokensDetails))
        put("output_tokens", json.encodeToJsonElement(value.outputTokens))
        put("output_tokens_details", json.encodeToJsonElement(value.outputTokensDetails))
        put("total_tokens", json.encodeToJsonElement(value.totalTokens))
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.costDetails?.let { put("cost_details", json.encodeToJsonElement(it)) }
        value.isByok?.let { put("is_byok", json.encodeToJsonElement(it)) }
        value.serverToolUseDetails?.let { put("server_tool_use_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun usage(block: Usage.Builder.() -> Unit): Usage = Usage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Usage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

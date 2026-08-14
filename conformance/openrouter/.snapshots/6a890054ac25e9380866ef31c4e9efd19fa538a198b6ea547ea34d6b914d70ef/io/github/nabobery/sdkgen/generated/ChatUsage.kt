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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatUsage
 */
@Serializable(with = ChatUsage.Serializer::class)
public class ChatUsage(
  /**
   * Number of tokens in the completion
   */
  public val completionTokens: Int,
  /**
   * Number of tokens in the prompt
   */
  public val promptTokens: Int,
  /**
   * Total number of tokens
   */
  public val totalTokens: Int,
  /**
   * Detailed completion token usage
   */
  public val completionTokensDetails: InlineChatUsageCompletionTokensDetailsX505930a9? = null,
  /**
   * Cost of the completion
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
   * Detailed prompt token usage
   */
  public val promptTokensDetails: InlineChatUsagePromptTokensDetailsX4d2bbaaa? = null,
  public val serverToolUseDetails: ServerToolUseDetails? = null,
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

    /**
     * Detailed completion token usage
     */
    public var completionTokensDetails: InlineChatUsageCompletionTokensDetailsX505930a9? = null

    /**
     * Cost of the completion
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
     * Detailed prompt token usage
     */
    public var promptTokensDetails: InlineChatUsagePromptTokensDetailsX4d2bbaaa? = null

    public var serverToolUseDetails: ServerToolUseDetails? = null

    public fun build(): ChatUsage {
      check(completionTokensValue != null) { "completionTokens is required" }
      check(promptTokensValue != null) { "promptTokens is required" }
      check(totalTokensValue != null) { "totalTokens is required" }
      return ChatUsage(
        completionTokens = completionTokens,
        promptTokens = promptTokens,
        totalTokens = totalTokens,
        completionTokensDetails = completionTokensDetails,
        cost = cost,
        costDetails = costDetails,
        isByok = isByok,
        promptTokensDetails = promptTokensDetails,
        serverToolUseDetails = serverToolUseDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatUsage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatUsage {
      val jsonDecoder = decoder.requireJsonDecoder("ChatUsage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatUsage must be a JSON object")
      val completionTokens = json.decodeRequired<Int>(rawObject, "completion_tokens")
      val promptTokens = json.decodeRequired<Int>(rawObject, "prompt_tokens")
      val totalTokens = json.decodeRequired<Int>(rawObject, "total_tokens")
      return ChatUsage(
        completionTokens = completionTokens,
        promptTokens = promptTokens,
        totalTokens = totalTokens,
        completionTokensDetails = rawObject["completion_tokens_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChatUsageCompletionTokensDetailsX505930a9?>(element) },
        cost = rawObject["cost"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        costDetails = rawObject["cost_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CostDetails?>(element) },
        isByok = rawObject["is_byok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        promptTokensDetails = rawObject["prompt_tokens_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChatUsagePromptTokensDetailsX4d2bbaaa?>(element) },
        serverToolUseDetails = rawObject["server_tool_use_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ServerToolUseDetails?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completion_tokens", json.encodeToJsonElement(value.completionTokens))
        put("prompt_tokens", json.encodeToJsonElement(value.promptTokens))
        put("total_tokens", json.encodeToJsonElement(value.totalTokens))
        value.completionTokensDetails?.let { put("completion_tokens_details", json.encodeToJsonElement(it)) }
        value.cost?.let { put("cost", json.encodeToJsonElement(it)) }
        value.costDetails?.let { put("cost_details", json.encodeToJsonElement(it)) }
        value.isByok?.let { put("is_byok", json.encodeToJsonElement(it)) }
        value.promptTokensDetails?.let { put("prompt_tokens_details", json.encodeToJsonElement(it)) }
        value.serverToolUseDetails?.let { put("server_tool_use_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatUsage(block: ChatUsage.Builder.() -> Unit): ChatUsage = ChatUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatUsage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

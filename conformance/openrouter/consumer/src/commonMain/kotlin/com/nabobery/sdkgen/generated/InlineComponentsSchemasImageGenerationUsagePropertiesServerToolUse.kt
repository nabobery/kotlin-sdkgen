package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Usage for server-side tool execution (e.g., web search)
 */
@Serializable(with = InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse.Serializer::class)
public class InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse(
  /**
   * Number of OpenRouter server tool calls that executed and produced a result.
   */
  public val toolCallsExecuted: Int? = null,
  /**
   * Total number of OpenRouter server-orchestrated tool calls the model requested, across all tool types.
   * Provider-native tools (e.g. native web search) are not counted here.
   */
  public val toolCallsRequested: Int? = null,
  /**
   * Number of web searches performed by server-side tools. For server-orchestrated tool calls a web search is also
   * counted in tool_calls_requested; provider-native web search may report web_search_requests only. Do not sum the
   * two.
   */
  public val webSearchRequests: Int? = null,
) {
  public class Builder {
    /**
     * Number of OpenRouter server tool calls that executed and produced a result.
     */
    public var toolCallsExecuted: Int? = null

    /**
     * Total number of OpenRouter server-orchestrated tool calls the model requested, across all tool types.
     * Provider-native tools (e.g. native web search) are not counted here.
     */
    public var toolCallsRequested: Int? = null

    /**
     * Number of web searches performed by server-side tools. For server-orchestrated tool calls a web search is also
     * counted in tool_calls_requested; provider-native web search may report web_search_requests only. Do not sum the
     * two.
     */
    public var webSearchRequests: Int? = null

    public fun build(): InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse =
      InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse(
      toolCallsExecuted = toolCallsExecuted,
      toolCallsRequested = toolCallsRequested,
      webSearchRequests = webSearchRequests,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse must be a " +
          "JSON object")
      return InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse(
        toolCallsExecuted = raw["tool_calls_executed"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        toolCallsRequested = raw["tool_calls_requested"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        webSearchRequests = raw["web_search_requests"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.toolCallsExecuted?.let { put("tool_calls_executed", json.encodeToJsonElement(it)) }
        value.toolCallsRequested?.let { put("tool_calls_requested", json.encodeToJsonElement(it)) }
        value.webSearchRequests?.let { put("web_search_requests", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse(block: InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse.Builder.() -> Unit): InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse = InlineComponentsSchemasImageGenerationUsagePropertiesServerToolUse.build(block)

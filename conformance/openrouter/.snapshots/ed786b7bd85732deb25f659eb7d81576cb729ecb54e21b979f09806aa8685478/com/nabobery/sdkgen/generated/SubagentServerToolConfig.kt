package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for the openrouter:subagent server tool.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SubagentServerToolConfig
 */
@Serializable(with = SubagentServerToolConfig.Serializer::class)
public class SubagentServerToolConfig(
  /**
   * System instructions for the subagent. When omitted, the subagent responds with no system prompt of its own.
   */
  public val instructions: String? = null,
  /**
   * Maximum number of output tokens (including reasoning) the subagent may produce. When omitted, the provider's
   * default applies.
   */
  public val maxCompletionTokens: Int? = null,
  /**
   * Maximum number of tool-calling steps the subagent may take during its agentic loop. Capped at 25. Only relevant
   * when the subagent is given tools. Accepted and validated but not yet enforced on the subagent call.
   */
  public val maxToolCalls: Int? = null,
  /**
   * Slug of the model that executes delegated tasks (any OpenRouter model). Typically a smaller, cheaper, faster model
   * than the one delegating. When omitted, the model from the outer API request is used. The subagent tool itself
   * cannot be the subagent model.
   */
  public val model: String? = null,
  public val reasoning: SubagentReasoning? = null,
  /**
   * Sampling temperature forwarded to the subagent call. When omitted, the provider's default applies.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  tools: List<SubagentNestedTool>? = null,
) {
  /**
   * Tools the subagent may use while executing a delegated task. The subagent runs as an agentic sub-agent over these
   * tools, then returns its outcome. Only OpenRouter server tools are supported — function tools are rejected — and the
   * list must not include the subagent tool itself.
   */
  public val tools: List<SubagentNestedTool>? = tools?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * System instructions for the subagent. When omitted, the subagent responds with no system prompt of its own.
     */
    public var instructions: String? = null

    /**
     * Maximum number of output tokens (including reasoning) the subagent may produce. When omitted, the provider's
     * default applies.
     */
    public var maxCompletionTokens: Int? = null

    /**
     * Maximum number of tool-calling steps the subagent may take during its agentic loop. Capped at 25. Only relevant
     * when the subagent is given tools. Accepted and validated but not yet enforced on the subagent call.
     */
    public var maxToolCalls: Int? = null

    /**
     * Slug of the model that executes delegated tasks (any OpenRouter model). Typically a smaller, cheaper, faster
     * model than the one delegating. When omitted, the model from the outer API request is used. The subagent tool
     * itself cannot be the subagent model.
     */
    public var model: String? = null

    public var reasoning: SubagentReasoning? = null

    /**
     * Sampling temperature forwarded to the subagent call. When omitted, the provider's default applies.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    private var toolsValue: List<SubagentNestedTool>? = null

    /**
     * Tools the subagent may use while executing a delegated task. The subagent runs as an agentic sub-agent over these
     * tools, then returns its outcome. Only OpenRouter server tools are supported — function tools are rejected — and
     * the list must not include the subagent tool itself.
     */
    public var tools: List<SubagentNestedTool>?
      get() = toolsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): SubagentServerToolConfig = SubagentServerToolConfig(
      instructions = instructions,
      maxCompletionTokens = maxCompletionTokens,
      maxToolCalls = maxToolCalls,
      model = model,
      reasoning = reasoning,
      temperature = temperature,
      tools = tools,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubagentServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubagentServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubagentServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("SubagentServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubagentServerToolConfig must be a JSON object")
      return SubagentServerToolConfig(
        instructions = rawObject["instructions"]?.let { json.decodeFromJsonElement<String>(it) },
        maxCompletionTokens = rawObject["max_completion_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxToolCalls = rawObject["max_tool_calls"]?.let { json.decodeFromJsonElement<Int>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        reasoning = rawObject["reasoning"]?.let { json.decodeFromJsonElement<SubagentReasoning>(it) },
        temperature = rawObject["temperature"]?.let { json.decodeFromJsonElement<Double>(it) },
        tools = rawObject["tools"]?.let { json.decodeFromJsonElement<List<SubagentNestedTool>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubagentServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("SubagentServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.instructions?.let { put("instructions", it) }
        value.maxCompletionTokens?.let { put("max_completion_tokens", json.encodeToJsonElement(it)) }
        value.maxToolCalls?.let { put("max_tool_calls", json.encodeToJsonElement(it)) }
        value.model?.let { put("model", it) }
        value.reasoning?.let { put("reasoning", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.tools?.let { put("tools", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subagentServerToolConfig(block: SubagentServerToolConfig.Builder.() -> Unit): SubagentServerToolConfig = SubagentServerToolConfig.build(block)

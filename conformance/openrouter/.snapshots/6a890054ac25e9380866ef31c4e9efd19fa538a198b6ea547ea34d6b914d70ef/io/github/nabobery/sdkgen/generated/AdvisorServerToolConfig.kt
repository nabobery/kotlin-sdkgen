package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for one openrouter:advisor server tool entry.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AdvisorServerToolConfig
 */
@Serializable(with = AdvisorServerToolConfig.Serializer::class)
public class AdvisorServerToolConfig(
  /**
   * When true, the full parent conversation is forwarded to the advisor so it sees the same context the executor does
   * (and the tool-call `prompt`, if given, is appended as a final user turn). When false or omitted, the advisor
   * receives only the `prompt` the executor passes in the tool call.
   */
  public val forwardTranscript: Boolean? = null,
  /**
   * System instructions for the advisor sub-agent. When omitted, the advisor responds with no system prompt of its own.
   */
  public val instructions: String? = null,
  /**
   * Maximum number of output tokens (including reasoning) the advisor may produce. When omitted, the provider's default
   * applies.
   */
  public val maxCompletionTokens: Int? = null,
  /**
   * Maximum number of tool-calling steps the advisor sub-agent may take during its agentic loop. Capped at 25. Only
   * relevant when the advisor is given tools.
   */
  public val maxToolCalls: Int? = null,
  /**
   * Slug of the advisor model to consult (any OpenRouter model). When omitted, the executor can choose it via the tool
   * call's `model` argument; if neither is set, the model from the outer API request is used. The advisor tool itself
   * cannot be the advisor model.
   */
  public val model: String? = null,
  /**
   * Optional name for this advisor. The model sees one tool per named advisor (and one default for an unnamed entry).
   * Names must be unique across advisor entries. Letters, digits, spaces, underscores, and dashes; trimmed; 1–64 chars.
   */
  public val name: String? = null,
  public val reasoning: AdvisorReasoning? = null,
  /**
   * When true, the advisor's advice streams incrementally as it is produced. In the Responses API this emits
   * `response.output_text.delta` events targeting the advisor output item; the final `advice` field is still set on the
   * completed item. Has no effect on the Chat Completions API (where the advice arrives only as the final tool result).
   * When false or omitted, the advice arrives only as the final result.
   */
  public val stream: Boolean? = null,
  /**
   * Sampling temperature forwarded to the advisor call. When omitted, the provider's default applies.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  tools: List<AdvisorNestedTool>? = null,
) {
  /**
   * Tools the advisor sub-agent may use while forming its advice. The advisor runs as an agentic sub-agent over these
   * tools, then returns its text. Only OpenRouter server tools are supported — function tools are rejected — and the
   * list must not include the advisor tool itself.
   */
  public val tools: List<AdvisorNestedTool>? = tools?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * When true, the full parent conversation is forwarded to the advisor so it sees the same context the executor does
     * (and the tool-call `prompt`, if given, is appended as a final user turn). When false or omitted, the advisor
     * receives only the `prompt` the executor passes in the tool call.
     */
    public var forwardTranscript: Boolean? = null

    /**
     * System instructions for the advisor sub-agent. When omitted, the advisor responds with no system prompt of its
     * own.
     */
    public var instructions: String? = null

    /**
     * Maximum number of output tokens (including reasoning) the advisor may produce. When omitted, the provider's
     * default applies.
     */
    public var maxCompletionTokens: Int? = null

    /**
     * Maximum number of tool-calling steps the advisor sub-agent may take during its agentic loop. Capped at 25. Only
     * relevant when the advisor is given tools.
     */
    public var maxToolCalls: Int? = null

    /**
     * Slug of the advisor model to consult (any OpenRouter model). When omitted, the executor can choose it via the
     * tool call's `model` argument; if neither is set, the model from the outer API request is used. The advisor tool
     * itself cannot be the advisor model.
     */
    public var model: String? = null

    /**
     * Optional name for this advisor. The model sees one tool per named advisor (and one default for an unnamed entry).
     * Names must be unique across advisor entries. Letters, digits, spaces, underscores, and dashes; trimmed; 1–64
     * chars.
     */
    public var name: String? = null

    public var reasoning: AdvisorReasoning? = null

    /**
     * When true, the advisor's advice streams incrementally as it is produced. In the Responses API this emits
     * `response.output_text.delta` events targeting the advisor output item; the final `advice` field is still set on
     * the completed item. Has no effect on the Chat Completions API (where the advice arrives only as the final tool
     * result). When false or omitted, the advice arrives only as the final result.
     */
    public var stream: Boolean? = null

    /**
     * Sampling temperature forwarded to the advisor call. When omitted, the provider's default applies.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    private var toolsValue: List<AdvisorNestedTool>? = null

    /**
     * Tools the advisor sub-agent may use while forming its advice. The advisor runs as an agentic sub-agent over these
     * tools, then returns its text. Only OpenRouter server tools are supported — function tools are rejected — and the
     * list must not include the advisor tool itself.
     */
    public var tools: List<AdvisorNestedTool>?
      get() = toolsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): AdvisorServerToolConfig = AdvisorServerToolConfig(
      forwardTranscript = forwardTranscript,
      instructions = instructions,
      maxCompletionTokens = maxCompletionTokens,
      maxToolCalls = maxToolCalls,
      model = model,
      name = name,
      reasoning = reasoning,
      stream = stream,
      temperature = temperature,
      tools = tools,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AdvisorServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AdvisorServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AdvisorServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("AdvisorServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AdvisorServerToolConfig must be a JSON object")
      return AdvisorServerToolConfig(
        forwardTranscript = rawObject["forward_transcript"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        instructions = rawObject["instructions"]?.let { json.decodeFromJsonElement<String>(it) },
        maxCompletionTokens = rawObject["max_completion_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxToolCalls = rawObject["max_tool_calls"]?.let { json.decodeFromJsonElement<Int>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        reasoning = rawObject["reasoning"]?.let { json.decodeFromJsonElement<AdvisorReasoning>(it) },
        stream = rawObject["stream"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        temperature = rawObject["temperature"]?.let { json.decodeFromJsonElement<Double>(it) },
        tools = rawObject["tools"]?.let { json.decodeFromJsonElement<List<AdvisorNestedTool>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AdvisorServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("AdvisorServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.forwardTranscript?.let { put("forward_transcript", json.encodeToJsonElement(it)) }
        value.instructions?.let { put("instructions", it) }
        value.maxCompletionTokens?.let { put("max_completion_tokens", json.encodeToJsonElement(it)) }
        value.maxToolCalls?.let { put("max_tool_calls", json.encodeToJsonElement(it)) }
        value.model?.let { put("model", it) }
        value.name?.let { put("name", it) }
        value.reasoning?.let { put("reasoning", json.encodeToJsonElement(it)) }
        value.stream?.let { put("stream", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.tools?.let { put("tools", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun advisorServerToolConfig(block: AdvisorServerToolConfig.Builder.() -> Unit): AdvisorServerToolConfig = AdvisorServerToolConfig.build(block)

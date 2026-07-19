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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Request schema for Anthropic Messages API endpoint
 */
@Serializable(with = MessagesRequest.Serializer::class)
public class MessagesRequest internal constructor(
  public val messages: List<MessagesMessageParam>?,
  public val model: String,
  private val cacheControlState: FieldState<AnthropicCacheControlDirective>,
  private val contextManagementState:
      FieldState<InlineComponentsSchemasMessagesRequestPropertiesContextManagement?>,
  private val fallbacksState: FieldState<List<MessagesFallbackParam>?>,
  private val maxTokensState: FieldState<Int>,
  private val metadataState: FieldState<InlineComponentsSchemasMessagesRequestPropertiesMetadata>,
  private val modelsState: FieldState<List<String>>,
  private val outputConfigState: FieldState<MessagesOutputConfig>,
  private val pluginsState:
      FieldState<List<InlineComponentsSchemasMessagesRequestPropertiesPluginsItems>>,
  private val providerState: FieldState<ProviderPreferences?>,
  private val routeState: FieldState<DeprecatedRoute?>,
  private val serviceTierState: FieldState<String>,
  private val sessionIdState: FieldState<String>,
  private val speedState: FieldState<AnthropicSpeed?>,
  private val stopSequencesState: FieldState<List<String>>,
  private val stopServerToolsWhenState: FieldState<List<StopServerToolsWhenCondition>>,
  private val streamState: FieldState<Boolean>,
  private val systemState: FieldState<InlineComponentsSchemasMessagesRequestPropertiesSystem>,
  private val temperatureState: FieldState<Double>,
  private val thinkingState: FieldState<InlineComponentsSchemasMessagesRequestPropertiesThinking>,
  private val toolChoiceState:
      FieldState<InlineComponentsSchemasMessagesRequestPropertiesToolChoice>,
  private val toolsState:
      FieldState<List<InlineComponentsSchemasMessagesRequestPropertiesToolsItems>>,
  private val topKState: FieldState<Int>,
  private val topPState: FieldState<Double>,
  private val traceState: FieldState<TraceConfig>,
  private val userState: FieldState<String>,
) {
  public val cacheControl: AnthropicCacheControlDirective?
    get() = cacheControlState.valueOrNull()

  public val contextManagement: InlineComponentsSchemasMessagesRequestPropertiesContextManagement?
    get() = contextManagementState.valueOrNull()

  /**
   * Fallback models to try if the primary model fails or refuses, in order. Handled by OpenRouter multi-model routing
   * rather than Anthropic server-side fallbacks; cannot be combined with `models`. Each entry accepts only `model`.
   * Maximum of 3 entries.
   */
  public val fallbacks: List<MessagesFallbackParam>?
    get() = fallbacksState.valueOrNull()

  public val maxTokens: Int?
    get() = maxTokensState.valueOrNull()

  public val metadata: InlineComponentsSchemasMessagesRequestPropertiesMetadata?
    get() = metadataState.valueOrNull()

  public val models: List<String>?
    get() = modelsState.valueOrNull()

  public val outputConfig: MessagesOutputConfig?
    get() = outputConfigState.valueOrNull()

  /**
   * Plugins you want to enable for this request, including their settings.
   */
  public val plugins: List<InlineComponentsSchemasMessagesRequestPropertiesPluginsItems>?
    get() = pluginsState.valueOrNull()

  public val provider: ProviderPreferences?
    get() = providerState.valueOrNull()

  public val route: DeprecatedRoute?
    get() = routeState.valueOrNull()

  public val serviceTier: String?
    get() = serviceTierState.valueOrNull()

  /**
   * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
   * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to maximize
   * prompt cache hits. Also used for observability grouping. If provided in both the request body and the x-session-id
   * header, the body value takes precedence. Maximum of 256 characters.
   */
  public val sessionId: String?
    get() = sessionIdState.valueOrNull()

  public val speed: AnthropicSpeed?
    get() = speedState.valueOrNull()

  public val stopSequences: List<String>?
    get() = stopSequencesState.valueOrNull()

  public val stopServerToolsWhen: List<StopServerToolsWhenCondition>?
    get() = stopServerToolsWhenState.valueOrNull()

  public val stream: Boolean?
    get() = streamState.valueOrNull()

  public val system: InlineComponentsSchemasMessagesRequestPropertiesSystem?
    get() = systemState.valueOrNull()

  public val temperature: Double?
    get() = temperatureState.valueOrNull()

  public val thinking: InlineComponentsSchemasMessagesRequestPropertiesThinking?
    get() = thinkingState.valueOrNull()

  public val toolChoice: InlineComponentsSchemasMessagesRequestPropertiesToolChoice?
    get() = toolChoiceState.valueOrNull()

  public val tools: List<InlineComponentsSchemasMessagesRequestPropertiesToolsItems>?
    get() = toolsState.valueOrNull()

  public val topK: Int?
    get() = topKState.valueOrNull()

  public val topP: Double?
    get() = topPState.valueOrNull()

  public val trace: TraceConfig?
    get() = traceState.valueOrNull()

  /**
   * A unique identifier representing your end-user, which helps distinguish between different users of your app. This
   * allows your app to identify specific users in case of abuse reports, preventing your entire app from being affected
   * by the actions of individual users. Maximum of 256 characters.
   */
  public val user: String?
    get() = userState.valueOrNull()

  public constructor(messages: List<MessagesMessageParam>?, model: String) : this(messages = messages,
  model = model,
  cacheControlState = FieldState.Absent,
  contextManagementState = FieldState.Absent,
  fallbacksState = FieldState.Absent,
  maxTokensState = FieldState.Absent,
  metadataState = FieldState.Absent,
  modelsState = FieldState.Absent,
  outputConfigState = FieldState.Absent,
  pluginsState = FieldState.Absent,
  providerState = FieldState.Absent,
  routeState = FieldState.Absent,
  serviceTierState = FieldState.Absent,
  sessionIdState = FieldState.Absent,
  speedState = FieldState.Absent,
  stopSequencesState = FieldState.Absent,
  stopServerToolsWhenState = FieldState.Absent,
  streamState = FieldState.Absent,
  systemState = FieldState.Absent,
  temperatureState = FieldState.Absent,
  thinkingState = FieldState.Absent,
  toolChoiceState = FieldState.Absent,
  toolsState = FieldState.Absent,
  topKState = FieldState.Absent,
  topPState = FieldState.Absent,
  traceState = FieldState.Absent,
  userState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `cache_control`.
   */
  public fun cacheControlPresence(): FieldPresence = cacheControlState.presence

  /**
   * Returns the wire presence of `context_management`.
   */
  public fun contextManagementPresence(): FieldPresence = contextManagementState.presence

  /**
   * Returns the wire presence of `fallbacks`.
   */
  public fun fallbacksPresence(): FieldPresence = fallbacksState.presence

  /**
   * Returns the wire presence of `max_tokens`.
   */
  public fun maxTokensPresence(): FieldPresence = maxTokensState.presence

  /**
   * Returns the wire presence of `metadata`.
   */
  public fun metadataPresence(): FieldPresence = metadataState.presence

  /**
   * Returns the wire presence of `models`.
   */
  public fun modelsPresence(): FieldPresence = modelsState.presence

  /**
   * Returns the wire presence of `output_config`.
   */
  public fun outputConfigPresence(): FieldPresence = outputConfigState.presence

  /**
   * Returns the wire presence of `plugins`.
   */
  public fun pluginsPresence(): FieldPresence = pluginsState.presence

  /**
   * Returns the wire presence of `provider`.
   */
  public fun providerPresence(): FieldPresence = providerState.presence

  /**
   * Returns the wire presence of `route`.
   */
  public fun routePresence(): FieldPresence = routeState.presence

  /**
   * Returns the wire presence of `service_tier`.
   */
  public fun serviceTierPresence(): FieldPresence = serviceTierState.presence

  /**
   * Returns the wire presence of `session_id`.
   */
  public fun sessionIdPresence(): FieldPresence = sessionIdState.presence

  /**
   * Returns the wire presence of `speed`.
   */
  public fun speedPresence(): FieldPresence = speedState.presence

  /**
   * Returns the wire presence of `stop_sequences`.
   */
  public fun stopSequencesPresence(): FieldPresence = stopSequencesState.presence

  /**
   * Returns the wire presence of `stop_server_tools_when`.
   */
  public fun stopServerToolsWhenPresence(): FieldPresence = stopServerToolsWhenState.presence

  /**
   * Returns the wire presence of `stream`.
   */
  public fun streamPresence(): FieldPresence = streamState.presence

  /**
   * Returns the wire presence of `system`.
   */
  public fun systemPresence(): FieldPresence = systemState.presence

  /**
   * Returns the wire presence of `temperature`.
   */
  public fun temperaturePresence(): FieldPresence = temperatureState.presence

  /**
   * Returns the wire presence of `thinking`.
   */
  public fun thinkingPresence(): FieldPresence = thinkingState.presence

  /**
   * Returns the wire presence of `tool_choice`.
   */
  public fun toolChoicePresence(): FieldPresence = toolChoiceState.presence

  /**
   * Returns the wire presence of `tools`.
   */
  public fun toolsPresence(): FieldPresence = toolsState.presence

  /**
   * Returns the wire presence of `top_k`.
   */
  public fun topKPresence(): FieldPresence = topKState.presence

  /**
   * Returns the wire presence of `top_p`.
   */
  public fun topPPresence(): FieldPresence = topPState.presence

  /**
   * Returns the wire presence of `trace`.
   */
  public fun tracePresence(): FieldPresence = traceState.presence

  /**
   * Returns the wire presence of `user`.
   */
  public fun userPresence(): FieldPresence = userState.presence

  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var messagesState: FieldState<List<MessagesMessageParam>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var messages: List<MessagesMessageParam>?
      get() = messagesState.valueOrNull()
      set(`value`) {
        messagesState = value.toNullableFieldState()
      }

    private var cacheControlState: FieldState<AnthropicCacheControlDirective> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var cacheControl: AnthropicCacheControlDirective?
      get() = cacheControlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "cacheControl is not nullable; call unsetCacheControl() to omit it" }
        cacheControlState = FieldState.Value(present)
      }

    private var contextManagementState:
        FieldState<InlineComponentsSchemasMessagesRequestPropertiesContextManagement?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var contextManagement: InlineComponentsSchemasMessagesRequestPropertiesContextManagement?
      get() = contextManagementState.valueOrNull()
      set(`value`) {
        contextManagementState = value.toNullableFieldState()
      }

    private var fallbacksState: FieldState<List<MessagesFallbackParam>?> = FieldState.Absent

    /**
     * Fallback models to try if the primary model fails or refuses, in order. Handled by OpenRouter multi-model routing
     * rather than Anthropic server-side fallbacks; cannot be combined with `models`. Each entry accepts only `model`.
     * Maximum of 3 entries.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var fallbacks: List<MessagesFallbackParam>?
      get() = fallbacksState.valueOrNull()
      set(`value`) {
        fallbacksState = value.toNullableFieldState()
      }

    private var maxTokensState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var maxTokens: Int?
      get() = maxTokensState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "maxTokens is not nullable; call unsetMaxTokens() to omit it" }
        maxTokensState = FieldState.Value(present)
      }

    private var metadataState: FieldState<InlineComponentsSchemasMessagesRequestPropertiesMetadata>
        = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var metadata: InlineComponentsSchemasMessagesRequestPropertiesMetadata?
      get() = metadataState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "metadata is not nullable; call unsetMetadata() to omit it" }
        metadataState = FieldState.Value(present)
      }

    private var modelsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var models: List<String>?
      get() = modelsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "models is not nullable; call unsetModels() to omit it" }
        modelsState = FieldState.Value(present)
      }

    private var outputConfigState: FieldState<MessagesOutputConfig> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var outputConfig: MessagesOutputConfig?
      get() = outputConfigState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "outputConfig is not nullable; call unsetOutputConfig() to omit it" }
        outputConfigState = FieldState.Value(present)
      }

    private var pluginsState:
        FieldState<List<InlineComponentsSchemasMessagesRequestPropertiesPluginsItems>> =
        FieldState.Absent

    /**
     * Plugins you want to enable for this request, including their settings.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var plugins: List<InlineComponentsSchemasMessagesRequestPropertiesPluginsItems>?
      get() = pluginsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "plugins is not nullable; call unsetPlugins() to omit it" }
        pluginsState = FieldState.Value(present)
      }

    private var providerState: FieldState<ProviderPreferences?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var provider: ProviderPreferences?
      get() = providerState.valueOrNull()
      set(`value`) {
        providerState = value.toNullableFieldState()
      }

    private var routeState: FieldState<DeprecatedRoute?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var route: DeprecatedRoute?
      get() = routeState.valueOrNull()
      set(`value`) {
        routeState = value.toNullableFieldState()
      }

    private var serviceTierState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var serviceTier: String?
      get() = serviceTierState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "serviceTier is not nullable; call unsetServiceTier() to omit it" }
        serviceTierState = FieldState.Value(present)
      }

    private var sessionIdState: FieldState<String> = FieldState.Absent

    /**
     * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
     * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to
     * maximize prompt cache hits. Also used for observability grouping. If provided in both the request body and the
     * x-session-id header, the body value takes precedence. Maximum of 256 characters.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var sessionId: String?
      get() = sessionIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "sessionId is not nullable; call unsetSessionId() to omit it" }
        sessionIdState = FieldState.Value(present)
      }

    private var speedState: FieldState<AnthropicSpeed?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var speed: AnthropicSpeed?
      get() = speedState.valueOrNull()
      set(`value`) {
        speedState = value.toNullableFieldState()
      }

    private var stopSequencesState: FieldState<List<String>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var stopSequences: List<String>?
      get() = stopSequencesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "stopSequences is not nullable; call unsetStopSequences() to omit it" }
        stopSequencesState = FieldState.Value(present)
      }

    private var stopServerToolsWhenState: FieldState<List<StopServerToolsWhenCondition>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var stopServerToolsWhen: List<StopServerToolsWhenCondition>?
      get() = stopServerToolsWhenState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) {
          "stopServerToolsWhen is not nullable; call unsetStopServerToolsWhen() to omit it" }
        stopServerToolsWhenState = FieldState.Value(present)
      }

    private var streamState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var stream: Boolean?
      get() = streamState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "stream is not nullable; call unsetStream() to omit it" }
        streamState = FieldState.Value(present)
      }

    private var systemState: FieldState<InlineComponentsSchemasMessagesRequestPropertiesSystem> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var system: InlineComponentsSchemasMessagesRequestPropertiesSystem?
      get() = systemState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "system is not nullable; call unsetSystem() to omit it" }
        systemState = FieldState.Value(present)
      }

    private var temperatureState: FieldState<Double> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var temperature: Double?
      get() = temperatureState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "temperature is not nullable; call unsetTemperature() to omit it" }
        temperatureState = FieldState.Value(present)
      }

    private var thinkingState: FieldState<InlineComponentsSchemasMessagesRequestPropertiesThinking>
        = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var thinking: InlineComponentsSchemasMessagesRequestPropertiesThinking?
      get() = thinkingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "thinking is not nullable; call unsetThinking() to omit it" }
        thinkingState = FieldState.Value(present)
      }

    private var toolChoiceState:
        FieldState<InlineComponentsSchemasMessagesRequestPropertiesToolChoice> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var toolChoice: InlineComponentsSchemasMessagesRequestPropertiesToolChoice?
      get() = toolChoiceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "toolChoice is not nullable; call unsetToolChoice() to omit it" }
        toolChoiceState = FieldState.Value(present)
      }

    private var toolsState:
        FieldState<List<InlineComponentsSchemasMessagesRequestPropertiesToolsItems>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tools: List<InlineComponentsSchemasMessagesRequestPropertiesToolsItems>?
      get() = toolsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tools is not nullable; call unsetTools() to omit it" }
        toolsState = FieldState.Value(present)
      }

    private var topKState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var topK: Int?
      get() = topKState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "topK is not nullable; call unsetTopK() to omit it" }
        topKState = FieldState.Value(present)
      }

    private var topPState: FieldState<Double> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var topP: Double?
      get() = topPState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "topP is not nullable; call unsetTopP() to omit it" }
        topPState = FieldState.Value(present)
      }

    private var traceState: FieldState<TraceConfig> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var trace: TraceConfig?
      get() = traceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "trace is not nullable; call unsetTrace() to omit it" }
        traceState = FieldState.Value(present)
      }

    private var userState: FieldState<String> = FieldState.Absent

    /**
     * A unique identifier representing your end-user, which helps distinguish between different users of your app. This
     * allows your app to identify specific users in case of abuse reports, preventing your entire app from being
     * affected by the actions of individual users. Maximum of 256 characters.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var user: String?
      get() = userState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "user is not nullable; call unsetUser() to omit it" }
        userState = FieldState.Value(present)
      }

    /**
     * Omits `cache_control` from serialized output.
     */
    public fun unsetCacheControl() {
      cacheControlState = FieldState.Absent
    }

    /**
     * Omits `context_management` from serialized output.
     */
    public fun unsetContextManagement() {
      contextManagementState = FieldState.Absent
    }

    /**
     * Omits `fallbacks` from serialized output.
     */
    public fun unsetFallbacks() {
      fallbacksState = FieldState.Absent
    }

    /**
     * Omits `max_tokens` from serialized output.
     */
    public fun unsetMaxTokens() {
      maxTokensState = FieldState.Absent
    }

    /**
     * Omits `metadata` from serialized output.
     */
    public fun unsetMetadata() {
      metadataState = FieldState.Absent
    }

    /**
     * Omits `models` from serialized output.
     */
    public fun unsetModels() {
      modelsState = FieldState.Absent
    }

    /**
     * Omits `output_config` from serialized output.
     */
    public fun unsetOutputConfig() {
      outputConfigState = FieldState.Absent
    }

    /**
     * Omits `plugins` from serialized output.
     */
    public fun unsetPlugins() {
      pluginsState = FieldState.Absent
    }

    /**
     * Omits `provider` from serialized output.
     */
    public fun unsetProvider() {
      providerState = FieldState.Absent
    }

    /**
     * Omits `route` from serialized output.
     */
    public fun unsetRoute() {
      routeState = FieldState.Absent
    }

    /**
     * Omits `service_tier` from serialized output.
     */
    public fun unsetServiceTier() {
      serviceTierState = FieldState.Absent
    }

    /**
     * Omits `session_id` from serialized output.
     */
    public fun unsetSessionId() {
      sessionIdState = FieldState.Absent
    }

    /**
     * Omits `speed` from serialized output.
     */
    public fun unsetSpeed() {
      speedState = FieldState.Absent
    }

    /**
     * Omits `stop_sequences` from serialized output.
     */
    public fun unsetStopSequences() {
      stopSequencesState = FieldState.Absent
    }

    /**
     * Omits `stop_server_tools_when` from serialized output.
     */
    public fun unsetStopServerToolsWhen() {
      stopServerToolsWhenState = FieldState.Absent
    }

    /**
     * Omits `stream` from serialized output.
     */
    public fun unsetStream() {
      streamState = FieldState.Absent
    }

    /**
     * Omits `system` from serialized output.
     */
    public fun unsetSystem() {
      systemState = FieldState.Absent
    }

    /**
     * Omits `temperature` from serialized output.
     */
    public fun unsetTemperature() {
      temperatureState = FieldState.Absent
    }

    /**
     * Omits `thinking` from serialized output.
     */
    public fun unsetThinking() {
      thinkingState = FieldState.Absent
    }

    /**
     * Omits `tool_choice` from serialized output.
     */
    public fun unsetToolChoice() {
      toolChoiceState = FieldState.Absent
    }

    /**
     * Omits `tools` from serialized output.
     */
    public fun unsetTools() {
      toolsState = FieldState.Absent
    }

    /**
     * Omits `top_k` from serialized output.
     */
    public fun unsetTopK() {
      topKState = FieldState.Absent
    }

    /**
     * Omits `top_p` from serialized output.
     */
    public fun unsetTopP() {
      topPState = FieldState.Absent
    }

    /**
     * Omits `trace` from serialized output.
     */
    public fun unsetTrace() {
      traceState = FieldState.Absent
    }

    /**
     * Omits `user` from serialized output.
     */
    public fun unsetUser() {
      userState = FieldState.Absent
    }

    public fun build(): MessagesRequest {
      check(modelValue != null) { "model is required" }
      check(messagesState !== FieldState.Absent) { "messages is required, even when null" }
      return MessagesRequest(
        messages = messagesState.valueOrNull(),
        model = model,
        cacheControlState = cacheControlState,
        contextManagementState = contextManagementState,
        fallbacksState = fallbacksState,
        maxTokensState = maxTokensState,
        metadataState = metadataState,
        modelsState = modelsState,
        outputConfigState = outputConfigState,
        pluginsState = pluginsState,
        providerState = providerState,
        routeState = routeState,
        serviceTierState = serviceTierState,
        sessionIdState = sessionIdState,
        speedState = speedState,
        stopSequencesState = stopSequencesState,
        stopServerToolsWhenState = stopServerToolsWhenState,
        streamState = streamState,
        systemState = systemState,
        temperatureState = temperatureState,
        thinkingState = thinkingState,
        toolChoiceState = toolChoiceState,
        toolsState = toolsState,
        topKState = topKState,
        topPState = topPState,
        traceState = traceState,
        userState = userState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesRequest {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesRequest must be a JSON object")
      val model = json.decodeRequired<String>(raw, "model")
      if (!raw.containsKey("messages")) {
        throw SerializationException("MessagesRequest is missing required property 'messages'")
      }
      val messages = raw["messages"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<MessagesMessageParam>?>(requireNotNull(element)) }
      return MessagesRequest(
        messages = messages,
        model = model,
        cacheControlState = json.decodeOptional(raw, "cache_control", nullable = false),
        contextManagementState = json.decodeOptional(raw, "context_management", nullable = true),
        fallbacksState = json.decodeOptional(raw, "fallbacks", nullable = true),
        maxTokensState = json.decodeOptional(raw, "max_tokens", nullable = false),
        metadataState = json.decodeOptional(raw, "metadata", nullable = false),
        modelsState = json.decodeOptional(raw, "models", nullable = false),
        outputConfigState = json.decodeOptional(raw, "output_config", nullable = false),
        pluginsState = json.decodeOptional(raw, "plugins", nullable = false),
        providerState = json.decodeOptional(raw, "provider", nullable = true),
        routeState = json.decodeOptional(raw, "route", nullable = true),
        serviceTierState = json.decodeOptional(raw, "service_tier", nullable = false),
        sessionIdState = json.decodeOptional(raw, "session_id", nullable = false),
        speedState = json.decodeOptional(raw, "speed", nullable = true),
        stopSequencesState = json.decodeOptional(raw, "stop_sequences", nullable = false),
        stopServerToolsWhenState = json.decodeOptional(raw, "stop_server_tools_when", nullable = false),
        streamState = json.decodeOptional(raw, "stream", nullable = false),
        systemState = json.decodeOptional(raw, "system", nullable = false),
        temperatureState = json.decodeOptional(raw, "temperature", nullable = false),
        thinkingState = json.decodeOptional(raw, "thinking", nullable = false),
        toolChoiceState = json.decodeOptional(raw, "tool_choice", nullable = false),
        toolsState = json.decodeOptional(raw, "tools", nullable = false),
        topKState = json.decodeOptional(raw, "top_k", nullable = false),
        topPState = json.decodeOptional(raw, "top_p", nullable = false),
        traceState = json.decodeOptional(raw, "trace", nullable = false),
        userState = json.decodeOptional(raw, "user", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("messages", value.messages?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("model", value.model)
        putState("cache_control", value.cacheControlState, json::encodeToJsonElement)
        putState("context_management", value.contextManagementState, json::encodeToJsonElement)
        putState("fallbacks", value.fallbacksState, json::encodeToJsonElement)
        putState("max_tokens", value.maxTokensState, json::encodeToJsonElement)
        putState("metadata", value.metadataState, json::encodeToJsonElement)
        putState("models", value.modelsState, json::encodeToJsonElement)
        putState("output_config", value.outputConfigState, json::encodeToJsonElement)
        putState("plugins", value.pluginsState, json::encodeToJsonElement)
        putState("provider", value.providerState, json::encodeToJsonElement)
        putState("route", value.routeState, json::encodeToJsonElement)
        putState("service_tier", value.serviceTierState, json::encodeToJsonElement)
        putState("session_id", value.sessionIdState, json::encodeToJsonElement)
        putState("speed", value.speedState, json::encodeToJsonElement)
        putState("stop_sequences", value.stopSequencesState, json::encodeToJsonElement)
        putState("stop_server_tools_when", value.stopServerToolsWhenState, json::encodeToJsonElement)
        putState("stream", value.streamState, json::encodeToJsonElement)
        putState("system", value.systemState, json::encodeToJsonElement)
        putState("temperature", value.temperatureState, json::encodeToJsonElement)
        putState("thinking", value.thinkingState, json::encodeToJsonElement)
        putState("tool_choice", value.toolChoiceState, json::encodeToJsonElement)
        putState("tools", value.toolsState, json::encodeToJsonElement)
        putState("top_k", value.topKState, json::encodeToJsonElement)
        putState("top_p", value.topPState, json::encodeToJsonElement)
        putState("trace", value.traceState, json::encodeToJsonElement)
        putState("user", value.userState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesRequest(block: MessagesRequest.Builder.() -> Unit): MessagesRequest = MessagesRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("MessagesRequest property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}

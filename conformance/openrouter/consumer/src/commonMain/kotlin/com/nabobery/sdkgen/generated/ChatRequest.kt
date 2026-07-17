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
 * Chat completion request parameters
 */
@Serializable(with = ChatRequest.Serializer::class)
public class ChatRequest internal constructor(
  messages: List<JsonElement>,
  private val modelState: FieldState<String>,
  private val sessionIdState: FieldState<String>,
  private val temperatureState: FieldState<Double>,
  private val maxTokensState: FieldState<Int>,
  private val stopState: FieldState<ChatStopAnyOf>,
) {
  /**
   * List of messages for the conversation
   */
  public val messages: List<JsonElement> = messages.toList()

  public val model: String?
    get() = modelState.valueOrNull()

  /**
   * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided, OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to maximize prompt cache hits. Also used for observability grouping. If provided in both the request body and the x-session-id header, the body value takes precedence. Maximum of 256 characters.
   */
  public val sessionId: String?
    get() = sessionIdState.valueOrNull()

  /**
   * Sampling temperature (0-2)
   */
  public val temperature: Double?
    get() = temperatureState.valueOrNull()

  /**
   * Maximum tokens (deprecated, use max_completion_tokens). Note: some providers enforce a minimum of 16.
   */
  public val maxTokens: Int?
    get() = maxTokensState.valueOrNull()

  /**
   * Stop sequences (up to 4)
   */
  public val stop: ChatStopAnyOf?
    get() = stopState.valueOrNull()

  public constructor(messages: List<JsonElement>) : this(messages = messages,
  modelState = FieldState.Absent,
  sessionIdState = FieldState.Absent,
  temperatureState = FieldState.Absent,
  maxTokensState = FieldState.Absent,
  stopState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `model`.
   */
  public fun modelPresence(): FieldPresence = modelState.presence

  /**
   * Returns the wire presence of `session_id`.
   */
  public fun sessionIdPresence(): FieldPresence = sessionIdState.presence

  /**
   * Returns the wire presence of `temperature`.
   */
  public fun temperaturePresence(): FieldPresence = temperatureState.presence

  /**
   * Returns the wire presence of `max_tokens`.
   */
  public fun maxTokensPresence(): FieldPresence = maxTokensState.presence

  /**
   * Returns the wire presence of `stop`.
   */
  public fun stopPresence(): FieldPresence = stopState.presence

  public class Builder {
    public lateinit var messages: List<JsonElement>

    private var modelState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var model: String?
      get() = modelState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "model is not nullable; call unsetModel() to omit it" }
        modelState = FieldState.Value(present)
      }

    private var sessionIdState: FieldState<String> = FieldState.Absent

    /**
     * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided, OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to maximize prompt cache hits. Also used for observability grouping. If provided in both the request body and the x-session-id header, the body value takes precedence. Maximum of 256 characters.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var sessionId: String?
      get() = sessionIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "sessionId is not nullable; call unsetSessionId() to omit it" }
        sessionIdState = FieldState.Value(present)
      }

    private var temperatureState: FieldState<Double> = FieldState.Absent

    /**
     * Sampling temperature (0-2)
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var temperature: Double?
      get() = temperatureState.valueOrNull()
      set(`value`) {
        temperatureState = value.toNullableFieldState()
      }

    private var maxTokensState: FieldState<Int> = FieldState.Absent

    /**
     * Maximum tokens (deprecated, use max_completion_tokens). Note: some providers enforce a minimum of 16.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var maxTokens: Int?
      get() = maxTokensState.valueOrNull()
      set(`value`) {
        maxTokensState = value.toNullableFieldState()
      }

    private var stopState: FieldState<ChatStopAnyOf> = FieldState.Absent

    /**
     * Stop sequences (up to 4)
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var stop: ChatStopAnyOf?
      get() = stopState.valueOrNull()
      set(`value`) {
        stopState = value.toNullableFieldState()
      }

    /**
     * Omits `model` from serialized output.
     */
    public fun unsetModel() {
      modelState = FieldState.Absent
    }

    /**
     * Omits `session_id` from serialized output.
     */
    public fun unsetSessionId() {
      sessionIdState = FieldState.Absent
    }

    /**
     * Omits `temperature` from serialized output.
     */
    public fun unsetTemperature() {
      temperatureState = FieldState.Absent
    }

    /**
     * Omits `max_tokens` from serialized output.
     */
    public fun unsetMaxTokens() {
      maxTokensState = FieldState.Absent
    }

    /**
     * Omits `stop` from serialized output.
     */
    public fun unsetStop() {
      stopState = FieldState.Absent
    }

    public fun build(): ChatRequest {
      check(::messages.isInitialized) { "messages is required" }
      return ChatRequest(
        messages = messages,
        modelState = modelState,
        sessionIdState = sessionIdState,
        temperatureState = temperatureState,
        maxTokensState = maxTokensState,
        stopState = stopState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatRequest {
      val jsonDecoder = decoder.requireJsonDecoder("ChatRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatRequest must be a JSON object")
      val messages = json.decodeRequired<List<JsonElement>>(raw, "messages")
      return ChatRequest(
        messages = messages,
        modelState = json.decodeOptional(raw, "model", nullable = false),
        sessionIdState = json.decodeOptional(raw, "session_id", nullable = false),
        temperatureState = json.decodeOptional(raw, "temperature", nullable = true),
        maxTokensState = json.decodeOptional(raw, "max_tokens", nullable = true),
        stopState = json.decodeOptional(raw, "stop", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("messages", json.encodeToJsonElement(value.messages))
        putState("model", value.modelState, json::encodeToJsonElement)
        putState("session_id", value.sessionIdState, json::encodeToJsonElement)
        putState("temperature", value.temperatureState, json::encodeToJsonElement)
        putState("max_tokens", value.maxTokensState, json::encodeToJsonElement)
        putState("stop", value.stopState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatRequest(block: ChatRequest.Builder.() -> Unit): ChatRequest = ChatRequest.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("ChatRequest property '" + name + "' is not nullable")
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

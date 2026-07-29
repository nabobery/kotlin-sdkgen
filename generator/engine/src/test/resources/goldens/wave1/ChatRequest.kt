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
 * One chat message.
 */
@Serializable
public data class ChatMessage(
  /**
   * Message role.
   */
  public val role: String,
  /**
   * Message content.
   */
  public val content: ChatContent,
)

/**
 * Immutable chat request with exact absent, present-null, and present-value semantics. 100% generated; unsafe KDoc
 * terminators like *&#47; are sanitized.
 */
@Serializable(with = ChatRequest.Serializer::class)
public class ChatRequest internal constructor(
  /**
   * Model identifier.
   */
  public val model: String,
  messages: List<ChatMessage>,
  /**
   * Required nullable session identifier.
   */
  public val sessionId: String?,
  private val temperatureState: FieldState<Double>,
  private val maxTokensState: FieldState<Int>,
) {
  /**
   * Ordered messages.
   */
  public val messages: List<ChatMessage> = messages.toList()

  /**
   * Optional nullable temperature.
   */
  public val temperature: Double?
    get() = temperatureState.valueOrNull()

  /**
   * Optional non-null token limit.
   */
  public val maxTokens: Int?
    get() = maxTokensState.valueOrNull()

  public constructor(
    model: String,
    messages: List<ChatMessage>,
    sessionId: String?,
  ) : this(model = model,
  messages = messages,
  sessionId = sessionId,
  temperatureState = FieldState.Absent,
  maxTokensState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `temperature`.
   */
  public fun temperaturePresence(): FieldPresence = temperatureState.presence

  /**
   * Returns the wire presence of `max_tokens`.
   */
  public fun maxTokensPresence(): FieldPresence = maxTokensState.presence

  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var messagesValue: List<ChatMessage>? = null

    public var messages: List<ChatMessage>
      get() = requireNotNull(messagesValue) { "messages is required" }.toList()
      set(`value`) {
        messagesValue = value.toList()
      }

    private var sessionIdState: FieldState<String> = FieldState.Absent

    /**
     * Required nullable session identifier.
     * Required nullable field; assigning `null` records present-null.
     */
    public var sessionId: String?
      get() = sessionIdState.valueOrNull()
      set(`value`) {
        sessionIdState = value.toNullableFieldState()
      }

    private var temperatureState: FieldState<Double> = FieldState.Absent

    /**
     * Optional nullable temperature.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var temperature: Double?
      get() = temperatureState.valueOrNull()
      set(`value`) {
        temperatureState = value.toNullableFieldState()
      }

    private var maxTokensState: FieldState<Int> = FieldState.Absent

    /**
     * Optional non-null token limit.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var maxTokens: Int?
      get() = maxTokensState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "maxTokens is not nullable; call unsetMaxTokens() to omit it" }
        maxTokensState = FieldState.Value(present)
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

    public fun build(): ChatRequest {
      check(modelValue != null) { "model is required" }
      check(messagesValue != null) { "messages is required" }
      check(sessionIdState !== FieldState.Absent) { "sessionId is required, even when null" }
      return ChatRequest(
        model = model,
        messages = messages,
        sessionId = sessionIdState.valueOrNull(),
        temperatureState = temperatureState,
        maxTokensState = maxTokensState,
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
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatRequest must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val messages = json.decodeRequired<List<ChatMessage>>(rawObject, "messages")
      if (!rawObject.containsKey("session_id")) {
        throw SerializationException("ChatRequest is missing required property 'session_id'")
      }
      val sessionId = rawObject["session_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String>(requireNotNull(element)) }
      return ChatRequest(
        model = model,
        messages = messages,
        sessionId = sessionId,
        temperatureState = json.decodeOptional(rawObject, "temperature", nullable = true),
        maxTokensState = json.decodeOptional(rawObject, "max_tokens", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("messages", json.encodeToJsonElement(value.messages))
        put("session_id", value.sessionId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("temperature", value.temperatureState, json::encodeToJsonElement)
        putState("max_tokens", value.maxTokensState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatRequest(block: ChatRequest.Builder.() -> Unit): ChatRequest = ChatRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
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

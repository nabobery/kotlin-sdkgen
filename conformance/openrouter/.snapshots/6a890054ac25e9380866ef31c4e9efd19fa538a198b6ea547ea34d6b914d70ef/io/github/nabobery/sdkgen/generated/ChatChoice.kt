package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Chat completion choice
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatChoice
 */
@Serializable(with = ChatChoice.Serializer::class)
public class ChatChoice internal constructor(
  public val finishReason: ChatFinishReasonEnum?,
  /**
   * Choice index
   */
  public val index: Int,
  public val message: ChatAssistantMessage,
  private val logprobsState: FieldState<ChatTokenLogprobs?>,
) {
  public val logprobs: ChatTokenLogprobs?
    get() = logprobsState.valueOrNull()

  public constructor(
    finishReason: ChatFinishReasonEnum?,
    index: Int,
    message: ChatAssistantMessage,
  ) : this(finishReason = finishReason,
  index = index,
  message = message,
  logprobsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `logprobs`.
   */
  public fun logprobsPresence(): FieldPresence = logprobsState.presence

  public class Builder {
    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    private var messageValue: ChatAssistantMessage? = null

    public var message: ChatAssistantMessage
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var finishReasonState: FieldState<ChatFinishReasonEnum?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var finishReason: ChatFinishReasonEnum?
      get() = finishReasonState.valueOrNull()
      set(`value`) {
        finishReasonState = value.toNullableFieldState()
      }

    private var logprobsState: FieldState<ChatTokenLogprobs?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var logprobs: ChatTokenLogprobs?
      get() = logprobsState.valueOrNull()
      set(`value`) {
        logprobsState = value.toNullableFieldState()
      }

    /**
     * Omits `logprobs` from serialized output.
     */
    public fun unsetLogprobs() {
      logprobsState = FieldState.Absent
    }

    public fun build(): ChatChoice {
      check(indexValue != null) { "index is required" }
      check(messageValue != null) { "message is required" }
      check(finishReasonState !== FieldState.Absent) { "finishReason is required, even when null" }
      return ChatChoice(
        finishReason = finishReasonState.valueOrNull(),
        index = index,
        message = message,
        logprobsState = logprobsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatChoice = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatChoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatChoice {
      val jsonDecoder = decoder.requireJsonDecoder("ChatChoice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatChoice must be a JSON object")
      val index = json.decodeRequired<Int>(rawObject, "index")
      val message = json.decodeRequired<ChatAssistantMessage>(rawObject, "message")
      if (!rawObject.containsKey("finish_reason")) {
        throw SerializationException("ChatChoice is missing required property 'finish_reason'")
      }
      val finishReason = rawObject["finish_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ChatFinishReasonEnum?>(requireNotNull(element)) }
      return ChatChoice(
        finishReason = finishReason,
        index = index,
        message = message,
        logprobsState = json.decodeOptional(rawObject, "logprobs", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatChoice) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatChoice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("finish_reason", value.finishReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("index", json.encodeToJsonElement(value.index))
        put("message", json.encodeToJsonElement(value.message))
        putState("logprobs", value.logprobsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatChoice(block: ChatChoice.Builder.() -> Unit): ChatChoice = ChatChoice.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatChoice is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ChatChoice property '" + name + "' is not nullable")
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

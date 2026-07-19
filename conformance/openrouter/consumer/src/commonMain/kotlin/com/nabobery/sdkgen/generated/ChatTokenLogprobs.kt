package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Log probabilities for the completion
 */
@Serializable(with = ChatTokenLogprobs.Serializer::class)
public class ChatTokenLogprobs internal constructor(
  /**
   * Log probabilities for content tokens
   */
  public val content: List<ChatTokenLogprob>?,
  private val refusalState: FieldState<List<ChatTokenLogprob>?>,
) {
  /**
   * Log probabilities for refusal tokens
   */
  public val refusal: List<ChatTokenLogprob>?
    get() = refusalState.valueOrNull()

  public constructor(content: List<ChatTokenLogprob>?) : this(content = content,
  refusalState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `refusal`.
   */
  public fun refusalPresence(): FieldPresence = refusalState.presence

  public class Builder {
    private var contentState: FieldState<List<ChatTokenLogprob>?> = FieldState.Absent

    /**
     * Log probabilities for content tokens
     * Required nullable field; assigning `null` records present-null.
     */
    public var content: List<ChatTokenLogprob>?
      get() = contentState.valueOrNull()
      set(`value`) {
        contentState = value.toNullableFieldState()
      }

    private var refusalState: FieldState<List<ChatTokenLogprob>?> = FieldState.Absent

    /**
     * Log probabilities for refusal tokens
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var refusal: List<ChatTokenLogprob>?
      get() = refusalState.valueOrNull()
      set(`value`) {
        refusalState = value.toNullableFieldState()
      }

    /**
     * Omits `refusal` from serialized output.
     */
    public fun unsetRefusal() {
      refusalState = FieldState.Absent
    }

    public fun build(): ChatTokenLogprobs {
      check(contentState !== FieldState.Absent) { "content is required, even when null" }
      return ChatTokenLogprobs(
        content = contentState.valueOrNull(),
        refusalState = refusalState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatTokenLogprobs = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatTokenLogprobs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatTokenLogprobs {
      val jsonDecoder = decoder.requireJsonDecoder("ChatTokenLogprobs")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatTokenLogprobs must be a JSON object")
      if (!raw.containsKey("content")) {
        throw SerializationException("ChatTokenLogprobs is missing required property 'content'")
      }
      val content = raw["content"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<ChatTokenLogprob>?>(requireNotNull(element)) }
      return ChatTokenLogprobs(
        content = content,
        refusalState = json.decodeOptional(raw, "refusal", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatTokenLogprobs) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatTokenLogprobs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("refusal", value.refusalState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatTokenLogprobs(block: ChatTokenLogprobs.Builder.() -> Unit): ChatTokenLogprobs = ChatTokenLogprobs
  .build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("ChatTokenLogprobs property '" + name + "' is not nullable")
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

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
 * Token log probability information
 */
@Serializable(with = ChatTokenLogprob.Serializer::class)
public class ChatTokenLogprob(
  /**
   * UTF-8 bytes of the token
   */
  public val bytes: List<Int>?,
  /**
   * Log probability of the token
   */
  public val logprob: Double,
  /**
   * The token
   */
  public val token: String,
  topLogprobs: List<InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems>,
) {
  /**
   * Top alternative tokens with probabilities
   */
  public val topLogprobs: List<InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems> =
      topLogprobs.toList()

  public class Builder {
    private var logprobValue: Double? = null

    public var logprob: Double
      get() = requireNotNull(logprobValue) { "logprob is required" }
      set(`value`) {
        logprobValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    private var topLogprobsValue:
        List<InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems>? = null

    public var topLogprobs: List<InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems>
      get() = requireNotNull(topLogprobsValue) { "topLogprobs is required" }
      set(`value`) {
        topLogprobsValue = value
      }

    private var bytesState: FieldState<List<Int>?> = FieldState.Absent

    /**
     * UTF-8 bytes of the token
     * Required nullable field; assigning `null` records present-null.
     */
    public var bytes: List<Int>?
      get() = bytesState.valueOrNull()
      set(`value`) {
        bytesState = value.toNullableFieldState()
      }

    public fun build(): ChatTokenLogprob {
      check(logprobValue != null) { "logprob is required" }
      check(tokenValue != null) { "token is required" }
      check(topLogprobsValue != null) { "topLogprobs is required" }
      check(bytesState !== FieldState.Absent) { "bytes is required, even when null" }
      return ChatTokenLogprob(
        bytes = bytesState.valueOrNull(),
        logprob = logprob,
        token = token,
        topLogprobs = topLogprobs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatTokenLogprob = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatTokenLogprob> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatTokenLogprob {
      val jsonDecoder = decoder.requireJsonDecoder("ChatTokenLogprob")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatTokenLogprob must be a JSON object")
      val logprob = json.decodeRequired<Double>(raw, "logprob")
      val token = json.decodeRequired<String>(raw, "token")
      val topLogprobs = json
        .decodeRequired<List<InlineComponentsSchemasChatTokenLogprobPropertiesTopLogprobsItems>>(raw, "top_logprobs")
      if (!raw.containsKey("bytes")) {
        throw SerializationException("ChatTokenLogprob is missing required property 'bytes'")
      }
      val bytes = raw["bytes"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<List<Int>?>(requireNotNull(element)) }
      return ChatTokenLogprob(
        bytes = bytes,
        logprob = logprob,
        token = token,
        topLogprobs = topLogprobs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatTokenLogprob) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatTokenLogprob")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bytes", value.bytes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("logprob", json.encodeToJsonElement(value.logprob))
        put("token", value.token)
        put("top_logprobs", json.encodeToJsonElement(value.topLogprobs))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatTokenLogprob(block: ChatTokenLogprob.Builder.() -> Unit): ChatTokenLogprob = ChatTokenLogprob
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatTokenLogprob is missing required property '" + name +
    "'")
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
    if (!nullable) throw SerializationException("ChatTokenLogprob property '" + name + "' is not nullable")
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

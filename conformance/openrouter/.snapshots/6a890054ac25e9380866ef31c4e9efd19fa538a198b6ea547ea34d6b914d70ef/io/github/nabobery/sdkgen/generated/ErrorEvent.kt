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
 * Event emitted when an error occurs during streaming
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ErrorEvent
 */
@Serializable(with = ErrorEvent.Serializer::class)
public class ErrorEvent(
  public val code: String?,
  public val message: String,
  public val `param`: String?,
  public val sequenceNumber: Int,
  public val type: InlineBaseErrorEventTypeXb81f86a5,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineBaseErrorEventTypeXb81f86a5? = null

    public var type: InlineBaseErrorEventTypeXb81f86a5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var codeState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var code: String?
      get() = codeState.valueOrNull()
      set(`value`) {
        codeState = value.toNullableFieldState()
      }

    private var paramState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var `param`: String?
      get() = paramState.valueOrNull()
      set(`value`) {
        paramState = value.toNullableFieldState()
      }

    public fun build(): ErrorEvent {
      check(messageValue != null) { "message is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      check(codeState !== FieldState.Absent) { "code is required, even when null" }
      check(paramState !== FieldState.Absent) { "param is required, even when null" }
      return ErrorEvent(
        code = codeState.valueOrNull(),
        message = message,
        param = paramState.valueOrNull(),
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ErrorEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ErrorEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ErrorEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ErrorEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ErrorEvent must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineBaseErrorEventTypeXb81f86a5>(rawObject, "type")
      if (!rawObject.containsKey("code")) {
        throw SerializationException("ErrorEvent is missing required property 'code'")
      }
      val code = rawObject["code"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("param")) {
        throw SerializationException("ErrorEvent is missing required property 'param'")
      }
      val param = rawObject["param"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ErrorEvent(
        code = code,
        message = message,
        param = param,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ErrorEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ErrorEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", value.code?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("message", value.message)
        put("param", value.param?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun errorEvent(block: ErrorEvent.Builder.() -> Unit): ErrorEvent = ErrorEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ErrorEvent is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ErrorEvent property '" + name + "' is not nullable")
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

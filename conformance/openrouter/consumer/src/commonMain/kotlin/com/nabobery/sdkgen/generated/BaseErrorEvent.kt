package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = BaseErrorEvent.Serializer::class)
public class BaseErrorEvent(
  public val code: String?,
  public val message: String,
  public val `param`: String?,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasBaseErrorEventPropertiesType,
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

    private var typeValue: InlineComponentsSchemasBaseErrorEventPropertiesType? = null

    public var type: InlineComponentsSchemasBaseErrorEventPropertiesType
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

    public fun build(): BaseErrorEvent {
      check(messageValue != null) { "message is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      check(codeState !== FieldState.Absent) { "code is required, even when null" }
      check(paramState !== FieldState.Absent) { "param is required, even when null" }
      return BaseErrorEvent(
        code = codeState.valueOrNull(),
        message = message,
        param = paramState.valueOrNull(),
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseErrorEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BaseErrorEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseErrorEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseErrorEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("BaseErrorEvent must be a JSON object")
      val message = json.decodeRequired<String>(raw, "message")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasBaseErrorEventPropertiesType>(raw, "type")
      if (!raw.containsKey("code")) {
        throw SerializationException("BaseErrorEvent is missing required property 'code'")
      }
      val code = raw["code"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("param")) {
        throw SerializationException("BaseErrorEvent is missing required property 'param'")
      }
      val param = raw["param"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return BaseErrorEvent(
        code = code,
        message = message,
        param = param,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseErrorEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseErrorEvent")
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

public fun baseErrorEvent(block: BaseErrorEvent.Builder.() -> Unit): BaseErrorEvent = BaseErrorEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseErrorEvent is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("BaseErrorEvent property '" + name + "' is not nullable")
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

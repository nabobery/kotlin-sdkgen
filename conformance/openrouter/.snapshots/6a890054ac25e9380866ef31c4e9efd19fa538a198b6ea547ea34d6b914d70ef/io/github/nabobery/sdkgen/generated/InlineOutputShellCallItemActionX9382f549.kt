package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallItem/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallItem/properties/action
 */
@Serializable(with = InlineOutputShellCallItemActionX9382f549.Serializer::class)
public class InlineOutputShellCallItemActionX9382f549(
  commands: List<String>,
  public val maxOutputLength: Int?,
  public val timeoutMs: Int?,
) {
  public val commands: List<String> = commands.toList()

  public class Builder {
    private var commandsValue: List<String>? = null

    public var commands: List<String>
      get() = requireNotNull(commandsValue) { "commands is required" }.toList()
      set(`value`) {
        commandsValue = value.toList()
      }

    private var maxOutputLengthState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var maxOutputLength: Int?
      get() = maxOutputLengthState.valueOrNull()
      set(`value`) {
        maxOutputLengthState = value.toNullableFieldState()
      }

    private var timeoutMsState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var timeoutMs: Int?
      get() = timeoutMsState.valueOrNull()
      set(`value`) {
        timeoutMsState = value.toNullableFieldState()
      }

    public fun build(): InlineOutputShellCallItemActionX9382f549 {
      check(commandsValue != null) { "commands is required" }
      check(maxOutputLengthState !== FieldState.Absent) { "maxOutputLength is required, even when null" }
      check(timeoutMsState !== FieldState.Absent) { "timeoutMs is required, even when null" }
      return InlineOutputShellCallItemActionX9382f549(
        commands = commands,
        maxOutputLength = maxOutputLengthState.valueOrNull(),
        timeoutMs = timeoutMsState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputShellCallItemActionX9382f549 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputShellCallItemActionX9382f549> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputShellCallItemActionX9382f549 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputShellCallItemActionX9382f549")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputShellCallItemActionX9382f549 must be a JSON object")
      val commands = json.decodeRequired<List<String>>(rawObject, "commands")
      if (!rawObject.containsKey("max_output_length")) {
        throw SerializationException("InlineOutputShellCallItemActionX9382f549 is missing required property 'max_output_length'")
      }
      val maxOutputLength = rawObject["max_output_length"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("timeout_ms")) {
        throw SerializationException("InlineOutputShellCallItemActionX9382f549 is missing required property 'timeout_ms'")
      }
      val timeoutMs = rawObject["timeout_ms"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return InlineOutputShellCallItemActionX9382f549(
        commands = commands,
        maxOutputLength = maxOutputLength,
        timeoutMs = timeoutMs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputShellCallItemActionX9382f549) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputShellCallItemActionX9382f549")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commands", json.encodeToJsonElement(value.commands))
        put("max_output_length", value.maxOutputLength?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("timeout_ms", value.timeoutMs?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputShellCallItemActionX9382f549(block: InlineOutputShellCallItemActionX9382f549.Builder.() -> Unit): InlineOutputShellCallItemActionX9382f549 = InlineOutputShellCallItemActionX9382f549.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputShellCallItemActionX9382f549 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOutputShellCallItemActionX9382f549 property '" + name + "' is not nullable")
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

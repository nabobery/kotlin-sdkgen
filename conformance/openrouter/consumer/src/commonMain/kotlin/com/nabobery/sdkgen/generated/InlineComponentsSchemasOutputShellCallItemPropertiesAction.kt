package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallItemPropertiesAction.Serializer::class)
public class InlineComponentsSchemasOutputShellCallItemPropertiesAction(
  commands: List<String>,
  public val maxOutputLength: Int?,
  public val timeoutMs: Int?,
) {
  public val commands: List<String> = commands.toList()

  public class Builder {
    private var commandsValue: List<String>? = null

    public var commands: List<String>
      get() = requireNotNull(commandsValue) { "commands is required" }
      set(`value`) {
        commandsValue = value
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

    public fun build(): InlineComponentsSchemasOutputShellCallItemPropertiesAction {
      check(commandsValue != null) { "commands is required" }
      check(maxOutputLengthState !== FieldState.Absent) { "maxOutputLength is required, even when null" }
      check(timeoutMsState !== FieldState.Absent) { "timeoutMs is required, even when null" }
      return InlineComponentsSchemasOutputShellCallItemPropertiesAction(
        commands = commands,
        maxOutputLength = maxOutputLengthState.valueOrNull(),
        timeoutMs = timeoutMsState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOutputShellCallItemPropertiesAction = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallItemPropertiesAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallItemPropertiesAction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputShellCallItemPropertiesAction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputShellCallItemPropertiesAction must be a JSON object")
      val commands = json.decodeRequired<List<String>>(raw, "commands")
      if (!raw.containsKey("max_output_length")) {
        throw SerializationException("InlineComponentsSchemasOutputShellCallItemPropertiesAction is missing required " +
          "property 'max_output_length'")
      }
      val maxOutputLength = raw["max_output_length"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!raw.containsKey("timeout_ms")) {
        throw SerializationException("InlineComponentsSchemasOutputShellCallItemPropertiesAction is missing required " +
          "property 'timeout_ms'")
      }
      val timeoutMs = raw["timeout_ms"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return InlineComponentsSchemasOutputShellCallItemPropertiesAction(
        commands = commands,
        maxOutputLength = maxOutputLength,
        timeoutMs = timeoutMs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputShellCallItemPropertiesAction) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasOutputShellCallItemPropertiesAction")
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

public fun inlineComponentsSchemasOutputShellCallItemPropertiesAction(block: InlineComponentsSchemasOutputShellCallItemPropertiesAction.Builder.() -> Unit): InlineComponentsSchemasOutputShellCallItemPropertiesAction = InlineComponentsSchemasOutputShellCallItemPropertiesAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputShellCallItemPropertiesAction is missing required " +
      "property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasOutputShellCallItemPropertiesAction property " +
      "'" + name + "' is not nullable")
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

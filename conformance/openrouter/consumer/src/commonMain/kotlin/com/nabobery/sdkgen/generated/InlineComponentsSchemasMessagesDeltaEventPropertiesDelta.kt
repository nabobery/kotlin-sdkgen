package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent/properties/delta.
 */
@Serializable(with = InlineComponentsSchemasMessagesDeltaEventPropertiesDelta.Serializer::class)
public class InlineComponentsSchemasMessagesDeltaEventPropertiesDelta(
  public val container: AnthropicContainer?,
  public val stopDetails: AnthropicRefusalStopDetails?,
  public val stopReason: OrAnthropicStopReason?,
  public val stopSequence: String?,
) {
  public class Builder {
    private var containerState: FieldState<AnthropicContainer?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var container: AnthropicContainer?
      get() = containerState.valueOrNull()
      set(`value`) {
        containerState = value.toNullableFieldState()
      }

    private var stopDetailsState: FieldState<AnthropicRefusalStopDetails?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopDetails: AnthropicRefusalStopDetails?
      get() = stopDetailsState.valueOrNull()
      set(`value`) {
        stopDetailsState = value.toNullableFieldState()
      }

    private var stopReasonState: FieldState<OrAnthropicStopReason?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopReason: OrAnthropicStopReason?
      get() = stopReasonState.valueOrNull()
      set(`value`) {
        stopReasonState = value.toNullableFieldState()
      }

    private var stopSequenceState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopSequence: String?
      get() = stopSequenceState.valueOrNull()
      set(`value`) {
        stopSequenceState = value.toNullableFieldState()
      }

    public fun build(): InlineComponentsSchemasMessagesDeltaEventPropertiesDelta {
      check(containerState !== FieldState.Absent) { "container is required, even when null" }
      check(stopDetailsState !== FieldState.Absent) { "stopDetails is required, even when null" }
      check(stopReasonState !== FieldState.Absent) { "stopReason is required, even when null" }
      check(stopSequenceState !== FieldState.Absent) { "stopSequence is required, even when null" }
      return InlineComponentsSchemasMessagesDeltaEventPropertiesDelta(
        container = containerState.valueOrNull(),
        stopDetails = stopDetailsState.valueOrNull(),
        stopReason = stopReasonState.valueOrNull(),
        stopSequence = stopSequenceState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesDeltaEventPropertiesDelta = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesDeltaEventPropertiesDelta> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesDeltaEventPropertiesDelta {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta must be a JSON object")
      if (!raw.containsKey("container")) {
        throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta is missing required " +
          "property 'container'")
      }
      val container = raw["container"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<AnthropicContainer?>(requireNotNull(element)) }
      if (!raw.containsKey("stop_details")) {
        throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta is missing required " +
          "property 'stop_details'")
      }
      val stopDetails = raw["stop_details"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<AnthropicRefusalStopDetails?>(requireNotNull(element)) }
      if (!raw.containsKey("stop_reason")) {
        throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta is missing required " +
          "property 'stop_reason'")
      }
      val stopReason = raw["stop_reason"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<OrAnthropicStopReason?>(requireNotNull(element)) }
      if (!raw.containsKey("stop_sequence")) {
        throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta is missing required " +
          "property 'stop_sequence'")
      }
      val stopSequence = raw["stop_sequence"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineComponentsSchemasMessagesDeltaEventPropertiesDelta(
        container = container,
        stopDetails = stopDetails,
        stopReason = stopReason,
        stopSequence = stopSequence,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesDeltaEventPropertiesDelta) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("container", value.container?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("stop_details", value.stopDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("stop_reason", value.stopReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("stop_sequence", value.stopSequence?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesDeltaEventPropertiesDelta(block: InlineComponentsSchemasMessagesDeltaEventPropertiesDelta.Builder.() -> Unit): InlineComponentsSchemasMessagesDeltaEventPropertiesDelta = InlineComponentsSchemasMessagesDeltaEventPropertiesDelta.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesDelta property '" +
      name + "' is not nullable")
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

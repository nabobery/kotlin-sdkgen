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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message
 */
@Serializable(with = InlineMessagesStartEventMessageX67927c6f.Serializer::class)
public class InlineMessagesStartEventMessageX67927c6f internal constructor(
  public val container: AnthropicContainer?,
  content: List<OrAnthropicContentBlock>,
  public val id: String,
  public val model: String,
  public val role: InlineMessagesStartEventMessageRoleXdd76094e,
  public val stopDetails: AnthropicRefusalStopDetails?,
  public val stopReason: JsonElement?,
  public val stopSequence: JsonElement?,
  public val type: InlineMessagesStartEventMessageTypeXa75e4c4e,
  public val usage: InlineMessagesStartEventMessageUsageX2365f359,
  private val providerState: FieldState<InlineMessagesStartEventMessageProviderX4d53f013>,
) {
  public val content: List<OrAnthropicContentBlock> = content.toList()

  public val provider: InlineMessagesStartEventMessageProviderX4d53f013?
    get() = providerState.valueOrNull()

  public constructor(
    container: AnthropicContainer?,
    content: List<OrAnthropicContentBlock>,
    id: String,
    model: String,
    role: InlineMessagesStartEventMessageRoleXdd76094e,
    stopDetails: AnthropicRefusalStopDetails?,
    stopReason: JsonElement?,
    stopSequence: JsonElement?,
    type: InlineMessagesStartEventMessageTypeXa75e4c4e,
    usage: InlineMessagesStartEventMessageUsageX2365f359,
  ) : this(container = container,
  content = content,
  id = id,
  model = model,
  role = role,
  stopDetails = stopDetails,
  stopReason = stopReason,
  stopSequence = stopSequence,
  type = type,
  usage = usage,
  providerState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `provider`.
   */
  public fun providerPresence(): FieldPresence = providerState.presence

  public class Builder {
    private var contentValue: List<OrAnthropicContentBlock>? = null

    public var content: List<OrAnthropicContentBlock>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var roleValue: InlineMessagesStartEventMessageRoleXdd76094e? = null

    public var role: InlineMessagesStartEventMessageRoleXdd76094e
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var typeValue: InlineMessagesStartEventMessageTypeXa75e4c4e? = null

    public var type: InlineMessagesStartEventMessageTypeXa75e4c4e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var usageValue: InlineMessagesStartEventMessageUsageX2365f359? = null

    public var usage: InlineMessagesStartEventMessageUsageX2365f359
      get() = requireNotNull(usageValue) { "usage is required" }
      set(`value`) {
        usageValue = value
      }

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

    private var stopReasonState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopReason: JsonElement?
      get() = stopReasonState.valueOrNull()
      set(`value`) {
        stopReasonState = value.toNullableFieldState()
      }

    private var stopSequenceState: FieldState<JsonElement?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopSequence: JsonElement?
      get() = stopSequenceState.valueOrNull()
      set(`value`) {
        stopSequenceState = value.toNullableFieldState()
      }

    private var providerState: FieldState<InlineMessagesStartEventMessageProviderX4d53f013> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var provider: InlineMessagesStartEventMessageProviderX4d53f013?
      get() = providerState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "provider is not nullable; call unsetProvider() to omit it" }
        providerState = FieldState.Value(present)
      }

    /**
     * Omits `provider` from serialized output.
     */
    public fun unsetProvider() {
      providerState = FieldState.Absent
    }

    public fun build(): InlineMessagesStartEventMessageX67927c6f {
      check(contentValue != null) { "content is required" }
      check(idValue != null) { "id is required" }
      check(modelValue != null) { "model is required" }
      check(roleValue != null) { "role is required" }
      check(typeValue != null) { "type is required" }
      check(usageValue != null) { "usage is required" }
      check(containerState !== FieldState.Absent) { "container is required, even when null" }
      check(stopDetailsState !== FieldState.Absent) { "stopDetails is required, even when null" }
      check(stopReasonState !== FieldState.Absent) { "stopReason is required, even when null" }
      check(stopSequenceState !== FieldState.Absent) { "stopSequence is required, even when null" }
      return InlineMessagesStartEventMessageX67927c6f(
        container = containerState.valueOrNull(),
        content = content,
        id = id,
        model = model,
        role = role,
        stopDetails = stopDetailsState.valueOrNull(),
        stopReason = stopReasonState.valueOrNull(),
        stopSequence = stopSequenceState.valueOrNull(),
        type = type,
        usage = usage,
        providerState = providerState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesStartEventMessageX67927c6f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesStartEventMessageX67927c6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesStartEventMessageX67927c6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesStartEventMessageX67927c6f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesStartEventMessageX67927c6f must be a JSON object")
      val content = json.decodeRequired<List<OrAnthropicContentBlock>>(rawObject, "content")
      val id = json.decodeRequired<String>(rawObject, "id")
      val model = json.decodeRequired<String>(rawObject, "model")
      val role = json.decodeRequired<InlineMessagesStartEventMessageRoleXdd76094e>(rawObject, "role")
      val type = json.decodeRequired<InlineMessagesStartEventMessageTypeXa75e4c4e>(rawObject, "type")
      val usage = json.decodeRequired<InlineMessagesStartEventMessageUsageX2365f359>(rawObject, "usage")
      if (!rawObject.containsKey("container")) {
        throw SerializationException("InlineMessagesStartEventMessageX67927c6f is missing required property 'container'")
      }
      val container = rawObject["container"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicContainer?>(requireNotNull(element)) }
      if (!rawObject.containsKey("stop_details")) {
        throw SerializationException("InlineMessagesStartEventMessageX67927c6f is missing required property 'stop_details'")
      }
      val stopDetails = rawObject["stop_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicRefusalStopDetails?>(requireNotNull(element)) }
      if (!rawObject.containsKey("stop_reason")) {
        throw SerializationException("InlineMessagesStartEventMessageX67927c6f is missing required property 'stop_reason'")
      }
      val stopReason = rawObject["stop_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(requireNotNull(element)) }
      if (!rawObject.containsKey("stop_sequence")) {
        throw SerializationException("InlineMessagesStartEventMessageX67927c6f is missing required property 'stop_sequence'")
      }
      val stopSequence = rawObject["stop_sequence"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(requireNotNull(element)) }
      return InlineMessagesStartEventMessageX67927c6f(
        container = container,
        content = content,
        id = id,
        model = model,
        role = role,
        stopDetails = stopDetails,
        stopReason = stopReason,
        stopSequence = stopSequence,
        type = type,
        usage = usage,
        providerState = json.decodeOptional(rawObject, "provider", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesStartEventMessageX67927c6f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesStartEventMessageX67927c6f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("container", value.container?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("content", json.encodeToJsonElement(value.content))
        put("id", value.id)
        put("model", value.model)
        put("role", json.encodeToJsonElement(value.role))
        put("stop_details", value.stopDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("stop_reason", value.stopReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("stop_sequence", value.stopSequence?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
        put("usage", json.encodeToJsonElement(value.usage))
        putState("provider", value.providerState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesStartEventMessageX67927c6f(block: InlineMessagesStartEventMessageX67927c6f.Builder.() -> Unit): InlineMessagesStartEventMessageX67927c6f = InlineMessagesStartEventMessageX67927c6f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesStartEventMessageX67927c6f is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineMessagesStartEventMessageX67927c6f property '" + name + "' is not nullable")
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

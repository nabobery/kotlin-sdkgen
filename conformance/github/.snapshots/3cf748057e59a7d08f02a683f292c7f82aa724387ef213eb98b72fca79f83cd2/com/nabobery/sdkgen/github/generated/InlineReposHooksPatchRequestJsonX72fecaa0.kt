package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1hooks~1{hook_id}/patch/requestBody/content/application~
 * 1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1hooks~1{hook_id}/patch/requestBody/content/application~
 * 1json/schema
 */
@Serializable(with = InlineReposHooksPatchRequestJsonX72fecaa0.Serializer::class)
public class InlineReposHooksPatchRequestJsonX72fecaa0 internal constructor(
  private val activeState: FieldState<Boolean>,
  private val addEventsState: FieldState<List<String>>,
  private val configState: FieldState<WebhookConfig>,
  private val eventsState: FieldState<List<String>>,
  private val removeEventsState: FieldState<List<String>>,
) {
  /**
   * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
   */
  public val active: Boolean?
    get() = activeState.valueOrNull()

  /**
   * Determines a list of events to be added to the list of events that the Hook triggers for.
   */
  public val addEvents: List<String>?
    get() = addEventsState.valueOrNull()

  public val config: WebhookConfig?
    get() = configState.valueOrNull()

  /**
   * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This replaces
   * the entire array of events.
   */
  public val events: List<String>?
    get() = eventsState.valueOrNull()

  /**
   * Determines a list of events to be removed from the list of events that the Hook triggers for.
   */
  public val removeEvents: List<String>?
    get() = removeEventsState.valueOrNull()

  public constructor() : this(activeState = FieldState.Absent,
  addEventsState = FieldState.Absent,
  configState = FieldState.Absent,
  eventsState = FieldState.Absent,
  removeEventsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `active`.
   */
  public fun activePresence(): FieldPresence = activeState.presence

  /**
   * Returns the wire presence of `add_events`.
   */
  public fun addEventsPresence(): FieldPresence = addEventsState.presence

  /**
   * Returns the wire presence of `config`.
   */
  public fun configPresence(): FieldPresence = configState.presence

  /**
   * Returns the wire presence of `events`.
   */
  public fun eventsPresence(): FieldPresence = eventsState.presence

  /**
   * Returns the wire presence of `remove_events`.
   */
  public fun removeEventsPresence(): FieldPresence = removeEventsState.presence

  public class Builder {
    private var activeState: FieldState<Boolean> = FieldState.Absent

    /**
     * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var active: Boolean?
      get() = activeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "active is not nullable; call unsetActive() to omit it" }
        activeState = FieldState.Value(present)
      }

    private var addEventsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Determines a list of events to be added to the list of events that the Hook triggers for.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var addEvents: List<String>?
      get() = addEventsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "addEvents is not nullable; call unsetAddEvents() to omit it" }
        addEventsState = FieldState.Value(present)
      }

    private var configState: FieldState<WebhookConfig> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var config: WebhookConfig?
      get() = configState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "config is not nullable; call unsetConfig() to omit it" }
        configState = FieldState.Value(present)
      }

    private var eventsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This
     * replaces the entire array of events.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var events: List<String>?
      get() = eventsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "events is not nullable; call unsetEvents() to omit it" }
        eventsState = FieldState.Value(present)
      }

    private var removeEventsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Determines a list of events to be removed from the list of events that the Hook triggers for.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var removeEvents: List<String>?
      get() = removeEventsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "removeEvents is not nullable; call unsetRemoveEvents() to omit it" }
        removeEventsState = FieldState.Value(present)
      }

    /**
     * Omits `active` from serialized output.
     */
    public fun unsetActive() {
      activeState = FieldState.Absent
    }

    /**
     * Omits `add_events` from serialized output.
     */
    public fun unsetAddEvents() {
      addEventsState = FieldState.Absent
    }

    /**
     * Omits `config` from serialized output.
     */
    public fun unsetConfig() {
      configState = FieldState.Absent
    }

    /**
     * Omits `events` from serialized output.
     */
    public fun unsetEvents() {
      eventsState = FieldState.Absent
    }

    /**
     * Omits `remove_events` from serialized output.
     */
    public fun unsetRemoveEvents() {
      removeEventsState = FieldState.Absent
    }

    public fun build(): InlineReposHooksPatchRequestJsonX72fecaa0 = InlineReposHooksPatchRequestJsonX72fecaa0(
      activeState = activeState,
      addEventsState = addEventsState,
      configState = configState,
      eventsState = eventsState,
      removeEventsState = removeEventsState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposHooksPatchRequestJsonX72fecaa0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposHooksPatchRequestJsonX72fecaa0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposHooksPatchRequestJsonX72fecaa0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposHooksPatchRequestJsonX72fecaa0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposHooksPatchRequestJsonX72fecaa0 must be a JSON object")
      return InlineReposHooksPatchRequestJsonX72fecaa0(
        activeState = json.decodeOptional(rawObject, "active", nullable = false),
        addEventsState = json.decodeOptional(rawObject, "add_events", nullable = false),
        configState = json.decodeOptional(rawObject, "config", nullable = false),
        eventsState = json.decodeOptional(rawObject, "events", nullable = false),
        removeEventsState = json.decodeOptional(rawObject, "remove_events", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposHooksPatchRequestJsonX72fecaa0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposHooksPatchRequestJsonX72fecaa0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("active", value.activeState, json::encodeToJsonElement)
        putState("add_events", value.addEventsState, json::encodeToJsonElement)
        putState("config", value.configState, json::encodeToJsonElement)
        putState("events", value.eventsState, json::encodeToJsonElement)
        putState("remove_events", value.removeEventsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposHooksPatchRequestJsonX72fecaa0(block: InlineReposHooksPatchRequestJsonX72fecaa0.Builder.() -> Unit): InlineReposHooksPatchRequestJsonX72fecaa0 = InlineReposHooksPatchRequestJsonX72fecaa0.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposHooksPatchRequestJsonX72fecaa0 property '" + name + "' is not nullable")
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

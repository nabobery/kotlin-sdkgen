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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks~1{hook_id}/patch/requestBody/content/application~1json/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1hooks~1{hook_id}/patch/requestBody/content/application~1json/schem
 * a
 */
@Serializable(with = InlineOrgsHooksPatchRequestJsonX9a7fff3b.Serializer::class)
public class InlineOrgsHooksPatchRequestJsonX9a7fff3b internal constructor(
  private val activeState: FieldState<Boolean>,
  private val configState: FieldState<InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a>,
  eventsState: FieldState<List<String>>,
  private val nameState: FieldState<String>,
) {
  private val eventsState: FieldState<List<String>> =
      eventsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
   */
  public val active: Boolean?
    get() = activeState.valueOrNull()

  /**
   * Key/value pairs to provide settings for this webhook.
   */
  public val config: InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a?
    get() = configState.valueOrNull()

  /**
   * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for.
   */
  public val events: List<String>?
    get() = eventsState.valueOrNull()

  public val name: String?
    get() = nameState.valueOrNull()

  public constructor() : this(activeState = FieldState.Absent,
  configState = FieldState.Absent,
  eventsState = FieldState.Absent,
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `active`.
   */
  public fun activePresence(): FieldPresence = activeState.presence

  /**
   * Returns the wire presence of `config`.
   */
  public fun configPresence(): FieldPresence = configState.presence

  /**
   * Returns the wire presence of `events`.
   */
  public fun eventsPresence(): FieldPresence = eventsState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

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

    private var configState: FieldState<InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a> =
        FieldState.Absent

    /**
     * Key/value pairs to provide settings for this webhook.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var config: InlineOrgsHooksPatchRequestJsonConfigX1b10eb0a?
      get() = configState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "config is not nullable; call unsetConfig() to omit it" }
        configState = FieldState.Value(present)
      }

    private var eventsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var events: List<String>?
      get() = eventsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "events is not nullable; call unsetEvents() to omit it" }
        eventsState = FieldState.Value(present.toList())
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    /**
     * Omits `active` from serialized output.
     */
    public fun unsetActive() {
      activeState = FieldState.Absent
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
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): InlineOrgsHooksPatchRequestJsonX9a7fff3b = InlineOrgsHooksPatchRequestJsonX9a7fff3b(
      activeState = activeState,
      configState = configState,
      eventsState = eventsState,
      nameState = nameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsHooksPatchRequestJsonX9a7fff3b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsHooksPatchRequestJsonX9a7fff3b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsHooksPatchRequestJsonX9a7fff3b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsHooksPatchRequestJsonX9a7fff3b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsHooksPatchRequestJsonX9a7fff3b must be a JSON object")
      return InlineOrgsHooksPatchRequestJsonX9a7fff3b(
        activeState = json.decodeOptional(rawObject, "active", nullable = false),
        configState = json.decodeOptional(rawObject, "config", nullable = false),
        eventsState = json.decodeOptional(rawObject, "events", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsHooksPatchRequestJsonX9a7fff3b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsHooksPatchRequestJsonX9a7fff3b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("active", value.activeState, json::encodeToJsonElement)
        putState("config", value.configState, json::encodeToJsonElement)
        putState("events", value.eventsState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsHooksPatchRequestJsonX9a7fff3b(block: InlineOrgsHooksPatchRequestJsonX9a7fff3b.Builder.() -> Unit): InlineOrgsHooksPatchRequestJsonX9a7fff3b = InlineOrgsHooksPatchRequestJsonX9a7fff3b.build(block)

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
    if (!nullable) throw SerializationException("InlineOrgsHooksPatchRequestJsonX9a7fff3b property '" + name + "' is not nullable")
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

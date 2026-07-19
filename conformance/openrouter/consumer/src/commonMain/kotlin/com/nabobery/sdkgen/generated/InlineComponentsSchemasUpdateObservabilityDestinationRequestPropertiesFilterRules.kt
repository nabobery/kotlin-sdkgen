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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/UpdateObservabilityDestinationRequest/properties/filter_rules.
 */
@Serializable(with = InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules
  .Serializer::class)
public class InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules internal constructor(
  groups: List<ObservabilityFilterRuleGroup>,
  private val enabledState: FieldState<Boolean>,
) {
  public val groups: List<ObservabilityFilterRuleGroup> = groups.toList()

  public val enabled: Boolean?
    get() = enabledState.valueOrNull()

  public constructor(groups: List<ObservabilityFilterRuleGroup>) : this(groups = groups,
  enabledState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enabled`.
   */
  public fun enabledPresence(): FieldPresence = enabledState.presence

  public class Builder {
    private var groupsValue: List<ObservabilityFilterRuleGroup>? = null

    public var groups: List<ObservabilityFilterRuleGroup>
      get() = requireNotNull(groupsValue) { "groups is required" }
      set(`value`) {
        groupsValue = value
      }

    private var enabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enabled: Boolean?
      get() = enabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enabled is not nullable; call unsetEnabled() to omit it" }
        enabledState = FieldState.Value(present)
      }

    /**
     * Omits `enabled` from serialized output.
     */
    public fun unsetEnabled() {
      enabledState = FieldState.Absent
    }

    public fun build(): InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules {
      check(groupsValue != null) { "groups is required" }
      return InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules(
        groups = groups,
        enabledState = enabledState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules " +
          "must be a JSON object")
      val groups = json.decodeRequired<List<ObservabilityFilterRuleGroup>>(raw, "groups")
      return InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules(
        groups = groups,
        enabledState = json.decodeOptional(raw, "enabled", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("groups", json.encodeToJsonElement(value.groups))
        putState("enabled", value.enabledState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules(block: InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules.Builder.() -> Unit): InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules = InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules " +
      "is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasUpdateObservabilityDestinationRequestPropertiesFilterRules " +
      "property '" + name + "' is not nullable")
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

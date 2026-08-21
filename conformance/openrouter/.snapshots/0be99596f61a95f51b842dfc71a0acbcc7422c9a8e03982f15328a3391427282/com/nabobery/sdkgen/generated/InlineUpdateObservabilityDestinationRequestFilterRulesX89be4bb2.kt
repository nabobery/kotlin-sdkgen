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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/UpdateObservabilityDestinationRequest/properties/filter_rules
 */
@Serializable(with = InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2.Serializer::class)
public class InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 internal constructor(
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
      get() = requireNotNull(groupsValue) { "groups is required" }.toList()
      set(`value`) {
        groupsValue = value.toList()
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

    public fun build(): InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 {
      check(groupsValue != null) { "groups is required" }
      return InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2(
        groups = groups,
        enabledState = enabledState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 must be a JSON object")
      val groups = json.decodeRequired<List<ObservabilityFilterRuleGroup>>(rawObject, "groups")
      return InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2(
        groups = groups,
        enabledState = json.decodeOptional(rawObject, "enabled", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("groups", json.encodeToJsonElement(value.groups))
        putState("enabled", value.enabledState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2(block: InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2.Builder.() -> Unit): InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 = InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineUpdateObservabilityDestinationRequestFilterRulesX89be4bb2 property '" + name + "' is not nullable")
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

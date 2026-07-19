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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup.
 */
@Serializable(with = ObservabilityFilterRuleGroup.Serializer::class)
public class ObservabilityFilterRuleGroup internal constructor(
  rules: List<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems>,
  private val logicState:
      FieldState<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic>,
) {
  public val rules: List<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems> =
      rules.toList()

  public val logic: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic?
    get() = logicState.valueOrNull()

  public constructor(rules: List<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems>) : this(rules = rules,
  logicState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `logic`.
   */
  public fun logicPresence(): FieldPresence = logicState.presence

  public class Builder {
    private var rulesValue:
        List<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems>? = null

    public var rules: List<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems>
      get() = requireNotNull(rulesValue) { "rules is required" }
      set(`value`) {
        rulesValue = value
      }

    private var logicState:
        FieldState<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var logic: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic?
      get() = logicState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "logic is not nullable; call unsetLogic() to omit it" }
        logicState = FieldState.Value(present)
      }

    /**
     * Omits `logic` from serialized output.
     */
    public fun unsetLogic() {
      logicState = FieldState.Absent
    }

    public fun build(): ObservabilityFilterRuleGroup {
      check(rulesValue != null) { "rules is required" }
      return ObservabilityFilterRuleGroup(
        rules = rules,
        logicState = logicState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ObservabilityFilterRuleGroup = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ObservabilityFilterRuleGroup> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ObservabilityFilterRuleGroup {
      val jsonDecoder = decoder.requireJsonDecoder("ObservabilityFilterRuleGroup")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ObservabilityFilterRuleGroup must be a JSON object")
      val rules = json
        .decodeRequired<List<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems>>(raw, "rules")
      return ObservabilityFilterRuleGroup(
        rules = rules,
        logicState = json.decodeOptional(raw, "logic", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ObservabilityFilterRuleGroup) {
      val jsonEncoder = encoder.requireJsonEncoder("ObservabilityFilterRuleGroup")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("rules", json.encodeToJsonElement(value.rules))
        putState("logic", value.logicState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun observabilityFilterRuleGroup(block: ObservabilityFilterRuleGroup.Builder.() ->
  Unit): ObservabilityFilterRuleGroup = ObservabilityFilterRuleGroup.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ObservabilityFilterRuleGroup is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ObservabilityFilterRuleGroup property '" + name + "' is not nullable")
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

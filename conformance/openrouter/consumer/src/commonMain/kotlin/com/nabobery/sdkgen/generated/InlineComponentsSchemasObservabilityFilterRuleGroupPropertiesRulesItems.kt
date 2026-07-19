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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/rules/items.
 */
@Serializable(with = InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems.Serializer::class)
public class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems internal constructor(
  public val `field`:
      InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesField,
  public val `operator`:
      InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator,
  private val valueState:
      FieldState<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue>,
) {
  public val `value`:
      InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue?
    get() = valueState.valueOrNull()

  public constructor(`field`: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesField,
    `operator`: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator) : this(field = field,
  operator = operator,
  valueState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `value`.
   */
  public fun valuePresence(): FieldPresence = valueState.presence

  public class Builder {
    private var fieldValue:
        InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesField? =
        null

    public var `field`:
        InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesField
      get() = requireNotNull(fieldValue) { "field is required" }
      set(`value`) {
        fieldValue = value
      }

    private var operatorValue:
        InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator? =
        null

    public var `operator`:
        InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator
      get() = requireNotNull(operatorValue) { "operator is required" }
      set(`value`) {
        operatorValue = value
      }

    private var valueState:
        FieldState<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue>
        = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var `value`:
        InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesValue?
      get() = valueState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "value is not nullable; call unsetValue() to omit it" }
        valueState = FieldState.Value(present)
      }

    /**
     * Omits `value` from serialized output.
     */
    public fun unsetValue() {
      valueState = FieldState.Absent
    }

    public fun build(): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems {
      check(fieldValue != null) { "field is required" }
      check(operatorValue != null) { "operator is required" }
      return InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems(
        field = field,
        operator = operator,
        valueState = valueState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems must be " +
          "a JSON object")
      val field = json
        .decodeRequired<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesField>(raw,
          "field")
      val operator = json
        .decodeRequired<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItemsPropertiesOperator>(raw,
          "operator")
      return InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems(
        field = field,
        operator = operator,
        valueState = json.decodeOptional(raw, "value", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field", json.encodeToJsonElement(value.field))
        put("operator", json.encodeToJsonElement(value.operator))
        putState("value", value.valueState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems(block: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems.Builder.() -> Unit): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems = InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems is missing " +
      "required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesRulesItems " +
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

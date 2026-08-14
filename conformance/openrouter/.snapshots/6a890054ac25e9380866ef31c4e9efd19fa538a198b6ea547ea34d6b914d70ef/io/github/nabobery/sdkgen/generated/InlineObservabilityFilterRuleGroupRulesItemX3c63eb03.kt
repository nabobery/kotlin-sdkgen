package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/rules/items
 */
@Serializable(with = InlineObservabilityFilterRuleGroupRulesItemX3c63eb03.Serializer::class)
public class InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 internal constructor(
  public val `field`: InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66,
  public val `operator`: InlineObservabilityFilterRuleGroupRulesItemOperatorX3f25b4b1,
  private val valueState: FieldState<InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7>,
) {
  public val `value`: InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7?
    get() = valueState.valueOrNull()

  public constructor(`field`: InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66, `operator`: InlineObservabilityFilterRuleGroupRulesItemOperatorX3f25b4b1) : this(field = field,
  operator = operator,
  valueState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `value`.
   */
  public fun valuePresence(): FieldPresence = valueState.presence

  public class Builder {
    private var fieldValue: InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66? = null

    public var `field`: InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66
      get() = requireNotNull(fieldValue) { "field is required" }
      set(`value`) {
        fieldValue = value
      }

    private var operatorValue: InlineObservabilityFilterRuleGroupRulesItemOperatorX3f25b4b1? = null

    public var `operator`: InlineObservabilityFilterRuleGroupRulesItemOperatorX3f25b4b1
      get() = requireNotNull(operatorValue) { "operator is required" }
      set(`value`) {
        operatorValue = value
      }

    private var valueState: FieldState<InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var `value`: InlineObservabilityFilterRuleGroupRulesItemValueXa463abf7?
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

    public fun build(): InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 {
      check(fieldValue != null) { "field is required" }
      check(operatorValue != null) { "operator is required" }
      return InlineObservabilityFilterRuleGroupRulesItemX3c63eb03(
        field = field,
        operator = operator,
        valueState = valueState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityFilterRuleGroupRulesItemX3c63eb03> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityFilterRuleGroupRulesItemX3c63eb03")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 must be a JSON object")
      val field = json.decodeRequired<InlineObservabilityFilterRuleGroupRulesItemFieldXae0b8f66>(rawObject, "field")
      val operator = json.decodeRequired<InlineObservabilityFilterRuleGroupRulesItemOperatorX3f25b4b1>(rawObject, "operator")
      return InlineObservabilityFilterRuleGroupRulesItemX3c63eb03(
        field = field,
        operator = operator,
        valueState = json.decodeOptional(rawObject, "value", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityFilterRuleGroupRulesItemX3c63eb03) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityFilterRuleGroupRulesItemX3c63eb03")
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

public fun inlineObservabilityFilterRuleGroupRulesItemX3c63eb03(block: InlineObservabilityFilterRuleGroupRulesItemX3c63eb03.Builder.() -> Unit): InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 = InlineObservabilityFilterRuleGroupRulesItemX3c63eb03.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineObservabilityFilterRuleGroupRulesItemX3c63eb03 property '" + name + "' is not nullable")
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

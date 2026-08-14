package io.github.nabobery.sdkgen.github.generated

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
 * Custom property name and associated value
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property-value
 */
@Serializable(with = CustomPropertyValue.Serializer::class)
public class CustomPropertyValue(
  /**
   * The name of the property
   */
  public val propertyName: String,
  /**
   * The value assigned to the property
   */
  public val `value`: InlineCustomPropertyValueValueX1e8c239b?,
) {
  public class Builder {
    private var propertyNameValue: String? = null

    public var propertyName: String
      get() = requireNotNull(propertyNameValue) { "propertyName is required" }
      set(`value`) {
        propertyNameValue = value
      }

    private var valueState: FieldState<InlineCustomPropertyValueValueX1e8c239b?> = FieldState.Absent

    /**
     * The value assigned to the property
     * Required nullable field; assigning `null` records present-null.
     */
    public var `value`: InlineCustomPropertyValueValueX1e8c239b?
      get() = valueState.valueOrNull()
      set(`value`) {
        valueState = value.toNullableFieldState()
      }

    public fun build(): CustomPropertyValue {
      check(propertyNameValue != null) { "propertyName is required" }
      check(valueState !== FieldState.Absent) { "value is required, even when null" }
      return CustomPropertyValue(
        propertyName = propertyName,
        value = valueState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomPropertyValue = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomPropertyValue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomPropertyValue {
      val jsonDecoder = decoder.requireJsonDecoder("CustomPropertyValue")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomPropertyValue must be a JSON object")
      val propertyName = json.decodeRequired<String>(rawObject, "property_name")
      if (!rawObject.containsKey("value")) {
        throw SerializationException("CustomPropertyValue is missing required property 'value'")
      }
      val value = rawObject["value"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomPropertyValueValueX1e8c239b?>(requireNotNull(element)) }
      return CustomPropertyValue(
        propertyName = propertyName,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomPropertyValue) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomPropertyValue")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("property_name", value.propertyName)
        put("value", value.value?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customPropertyValue(block: CustomPropertyValue.Builder.() -> Unit): CustomPropertyValue = CustomPropertyValue.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomPropertyValue is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CustomPropertyValue property '" + name + "' is not nullable")
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

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
 * Custom property defined on an organization
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property
 */
@Serializable(with = CustomProperty.Serializer::class)
public class CustomProperty internal constructor(
  /**
   * The name of the property
   */
  public val propertyName: String,
  /**
   * The type of the value for the property
   */
  public val valueType: InlineCustomPropertyValueTypeX728e68ab,
  private val allowedValuesState: FieldState<List<String>?>,
  private val defaultValueState: FieldState<InlineCustomPropertyDefaultValueX07520f17?>,
  private val descriptionState: FieldState<String?>,
  private val requireExplicitValuesState: FieldState<Boolean>,
  private val requiredState: FieldState<Boolean>,
  private val sourceTypeState: FieldState<InlineCustomPropertySourceTypeX2390df1b>,
  private val urlState: FieldState<String>,
  private val valuesEditableByState: FieldState<InlineCustomPropertyValuesEditableByX423c274f?>,
) {
  /**
   * An ordered list of the allowed values of the property.
   * The property can have up to 200 allowed values.
   */
  public val allowedValues: List<String>?
    get() = allowedValuesState.valueOrNull()

  /**
   * Default value of the property
   */
  public val defaultValue: InlineCustomPropertyDefaultValueX07520f17?
    get() = defaultValueState.valueOrNull()

  /**
   * Short description of the property
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Whether setting properties values is mandatory
   */
  public val requireExplicitValues: Boolean?
    get() = requireExplicitValuesState.valueOrNull()

  /**
   * Whether the property is required.
   */
  public val required: Boolean?
    get() = requiredState.valueOrNull()

  /**
   * The source type of the property
   */
  public val sourceType: InlineCustomPropertySourceTypeX2390df1b?
    get() = sourceTypeState.valueOrNull()

  /**
   * The URL that can be used to fetch, update, or delete info about this property via the API.
   */
  public val url: String?
    get() = urlState.valueOrNull()

  /**
   * Who can edit the values of the property
   */
  public val valuesEditableBy: InlineCustomPropertyValuesEditableByX423c274f?
    get() = valuesEditableByState.valueOrNull()

  public constructor(propertyName: String, valueType: InlineCustomPropertyValueTypeX728e68ab) : this(propertyName = propertyName,
  valueType = valueType,
  allowedValuesState = FieldState.Absent,
  defaultValueState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  requireExplicitValuesState = FieldState.Absent,
  requiredState = FieldState.Absent,
  sourceTypeState = FieldState.Absent,
  urlState = FieldState.Absent,
  valuesEditableByState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `allowed_values`.
   */
  public fun allowedValuesPresence(): FieldPresence = allowedValuesState.presence

  /**
   * Returns the wire presence of `default_value`.
   */
  public fun defaultValuePresence(): FieldPresence = defaultValueState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `require_explicit_values`.
   */
  public fun requireExplicitValuesPresence(): FieldPresence = requireExplicitValuesState.presence

  /**
   * Returns the wire presence of `required`.
   */
  public fun requiredPresence(): FieldPresence = requiredState.presence

  /**
   * Returns the wire presence of `source_type`.
   */
  public fun sourceTypePresence(): FieldPresence = sourceTypeState.presence

  /**
   * Returns the wire presence of `url`.
   */
  public fun urlPresence(): FieldPresence = urlState.presence

  /**
   * Returns the wire presence of `values_editable_by`.
   */
  public fun valuesEditableByPresence(): FieldPresence = valuesEditableByState.presence

  public class Builder {
    private var propertyNameValue: String? = null

    public var propertyName: String
      get() = requireNotNull(propertyNameValue) { "propertyName is required" }
      set(`value`) {
        propertyNameValue = value
      }

    private var valueTypeValue: InlineCustomPropertyValueTypeX728e68ab? = null

    public var valueType: InlineCustomPropertyValueTypeX728e68ab
      get() = requireNotNull(valueTypeValue) { "valueType is required" }
      set(`value`) {
        valueTypeValue = value
      }

    private var allowedValuesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * An ordered list of the allowed values of the property.
     * The property can have up to 200 allowed values.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var allowedValues: List<String>?
      get() = allowedValuesState.valueOrNull()
      set(`value`) {
        allowedValuesState = value.toNullableFieldState()
      }

    private var defaultValueState: FieldState<InlineCustomPropertyDefaultValueX07520f17?> =
        FieldState.Absent

    /**
     * Default value of the property
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var defaultValue: InlineCustomPropertyDefaultValueX07520f17?
      get() = defaultValueState.valueOrNull()
      set(`value`) {
        defaultValueState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Short description of the property
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var requireExplicitValuesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether setting properties values is mandatory
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var requireExplicitValues: Boolean?
      get() = requireExplicitValuesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "requireExplicitValues is not nullable; call unsetRequireExplicitValues() to omit it" }
        requireExplicitValuesState = FieldState.Value(present)
      }

    private var requiredState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether the property is required.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var required: Boolean?
      get() = requiredState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "required is not nullable; call unsetRequired() to omit it" }
        requiredState = FieldState.Value(present)
      }

    private var sourceTypeState: FieldState<InlineCustomPropertySourceTypeX2390df1b> =
        FieldState.Absent

    /**
     * The source type of the property
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var sourceType: InlineCustomPropertySourceTypeX2390df1b?
      get() = sourceTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "sourceType is not nullable; call unsetSourceType() to omit it" }
        sourceTypeState = FieldState.Value(present)
      }

    private var urlState: FieldState<String> = FieldState.Absent

    /**
     * The URL that can be used to fetch, update, or delete info about this property via the API.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "url is not nullable; call unsetUrl() to omit it" }
        urlState = FieldState.Value(present)
      }

    private var valuesEditableByState: FieldState<InlineCustomPropertyValuesEditableByX423c274f?> =
        FieldState.Absent

    /**
     * Who can edit the values of the property
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var valuesEditableBy: InlineCustomPropertyValuesEditableByX423c274f?
      get() = valuesEditableByState.valueOrNull()
      set(`value`) {
        valuesEditableByState = value.toNullableFieldState()
      }

    /**
     * Omits `allowed_values` from serialized output.
     */
    public fun unsetAllowedValues() {
      allowedValuesState = FieldState.Absent
    }

    /**
     * Omits `default_value` from serialized output.
     */
    public fun unsetDefaultValue() {
      defaultValueState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `require_explicit_values` from serialized output.
     */
    public fun unsetRequireExplicitValues() {
      requireExplicitValuesState = FieldState.Absent
    }

    /**
     * Omits `required` from serialized output.
     */
    public fun unsetRequired() {
      requiredState = FieldState.Absent
    }

    /**
     * Omits `source_type` from serialized output.
     */
    public fun unsetSourceType() {
      sourceTypeState = FieldState.Absent
    }

    /**
     * Omits `url` from serialized output.
     */
    public fun unsetUrl() {
      urlState = FieldState.Absent
    }

    /**
     * Omits `values_editable_by` from serialized output.
     */
    public fun unsetValuesEditableBy() {
      valuesEditableByState = FieldState.Absent
    }

    public fun build(): CustomProperty {
      check(propertyNameValue != null) { "propertyName is required" }
      check(valueTypeValue != null) { "valueType is required" }
      return CustomProperty(
        propertyName = propertyName,
        valueType = valueType,
        allowedValuesState = allowedValuesState,
        defaultValueState = defaultValueState,
        descriptionState = descriptionState,
        requireExplicitValuesState = requireExplicitValuesState,
        requiredState = requiredState,
        sourceTypeState = sourceTypeState,
        urlState = urlState,
        valuesEditableByState = valuesEditableByState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomProperty = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomProperty> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomProperty {
      val jsonDecoder = decoder.requireJsonDecoder("CustomProperty")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomProperty must be a JSON object")
      val propertyName = json.decodeRequired<String>(rawObject, "property_name")
      val valueType = json.decodeRequired<InlineCustomPropertyValueTypeX728e68ab>(rawObject, "value_type")
      return CustomProperty(
        propertyName = propertyName,
        valueType = valueType,
        allowedValuesState = json.decodeOptional(rawObject, "allowed_values", nullable = true),
        defaultValueState = json.decodeOptional(rawObject, "default_value", nullable = true),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        requireExplicitValuesState = json.decodeOptional(rawObject, "require_explicit_values", nullable = false),
        requiredState = json.decodeOptional(rawObject, "required", nullable = false),
        sourceTypeState = json.decodeOptional(rawObject, "source_type", nullable = false),
        urlState = json.decodeOptional(rawObject, "url", nullable = false),
        valuesEditableByState = json.decodeOptional(rawObject, "values_editable_by", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomProperty) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomProperty")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("property_name", value.propertyName)
        put("value_type", json.encodeToJsonElement(value.valueType))
        putState("allowed_values", value.allowedValuesState, json::encodeToJsonElement)
        putState("default_value", value.defaultValueState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("require_explicit_values", value.requireExplicitValuesState, json::encodeToJsonElement)
        putState("required", value.requiredState, json::encodeToJsonElement)
        putState("source_type", value.sourceTypeState, json::encodeToJsonElement)
        putState("url", value.urlState, json::encodeToJsonElement)
        putState("values_editable_by", value.valuesEditableByState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customProperty(block: CustomProperty.Builder.() -> Unit): CustomProperty = CustomProperty.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomProperty is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CustomProperty property '" + name + "' is not nullable")
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

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Custom property set payload
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-property-set-payload
 */
@Serializable(with = CustomPropertySetPayload.Serializer::class)
public class CustomPropertySetPayload(
  /**
   * The type of the value for the property
   */
  public val valueType: InlineCustomPropertySetPayloadValueTypeX84b79c61,
  allowedValues: List<String>? = null,
  /**
   * Default value of the property
   */
  public val defaultValue: InlineCustomPropertySetPayloadDefaultValueX3a9e934a? = null,
  /**
   * Short description of the property
   */
  public val description: String? = null,
  /**
   * Whether setting properties values is mandatory
   */
  public val requireExplicitValues: Boolean? = null,
  /**
   * Whether the property is required.
   */
  public val required: Boolean? = null,
  /**
   * Who can edit the values of the property
   */
  public val valuesEditableBy: InlineCustomPropertySetPayloadValuesEditableByX09582a2b? = null,
) {
  /**
   * An ordered list of the allowed values of the property.
   * The property can have up to 200 allowed values.
   */
  public val allowedValues: List<String>? =
      allowedValues?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var valueTypeValue: InlineCustomPropertySetPayloadValueTypeX84b79c61? = null

    public var valueType: InlineCustomPropertySetPayloadValueTypeX84b79c61
      get() = requireNotNull(valueTypeValue) { "valueType is required" }
      set(`value`) {
        valueTypeValue = value
      }

    private var allowedValuesValue: List<String>? = null

    /**
     * An ordered list of the allowed values of the property.
     * The property can have up to 200 allowed values.
     */
    public var allowedValues: List<String>?
      get() = allowedValuesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedValuesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Default value of the property
     */
    public var defaultValue: InlineCustomPropertySetPayloadDefaultValueX3a9e934a? = null

    /**
     * Short description of the property
     */
    public var description: String? = null

    /**
     * Whether setting properties values is mandatory
     */
    public var requireExplicitValues: Boolean? = null

    /**
     * Whether the property is required.
     */
    public var required: Boolean? = null

    /**
     * Who can edit the values of the property
     */
    public var valuesEditableBy: InlineCustomPropertySetPayloadValuesEditableByX09582a2b? = null

    public fun build(): CustomPropertySetPayload {
      check(valueTypeValue != null) { "valueType is required" }
      return CustomPropertySetPayload(
        valueType = valueType,
        allowedValues = allowedValues,
        defaultValue = defaultValue,
        description = description,
        requireExplicitValues = requireExplicitValues,
        required = required,
        valuesEditableBy = valuesEditableBy,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomPropertySetPayload = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomPropertySetPayload> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomPropertySetPayload {
      val jsonDecoder = decoder.requireJsonDecoder("CustomPropertySetPayload")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomPropertySetPayload must be a JSON object")
      val valueType = json.decodeRequired<InlineCustomPropertySetPayloadValueTypeX84b79c61>(rawObject, "value_type")
      return CustomPropertySetPayload(
        valueType = valueType,
        allowedValues = rawObject["allowed_values"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        defaultValue = rawObject["default_value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomPropertySetPayloadDefaultValueX3a9e934a?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        requireExplicitValues = rawObject["require_explicit_values"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        required = rawObject["required"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        valuesEditableBy = rawObject["values_editable_by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomPropertySetPayloadValuesEditableByX09582a2b?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomPropertySetPayload) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomPropertySetPayload")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("value_type", json.encodeToJsonElement(value.valueType))
        value.allowedValues?.let { put("allowed_values", json.encodeToJsonElement(it)) }
        value.defaultValue?.let { put("default_value", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.requireExplicitValues?.let { put("require_explicit_values", json.encodeToJsonElement(it)) }
        value.required?.let { put("required", json.encodeToJsonElement(it)) }
        value.valuesEditableBy?.let { put("values_editable_by", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customPropertySetPayload(block: CustomPropertySetPayload.Builder.() -> Unit): CustomPropertySetPayload = CustomPropertySetPayload.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomPropertySetPayload is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

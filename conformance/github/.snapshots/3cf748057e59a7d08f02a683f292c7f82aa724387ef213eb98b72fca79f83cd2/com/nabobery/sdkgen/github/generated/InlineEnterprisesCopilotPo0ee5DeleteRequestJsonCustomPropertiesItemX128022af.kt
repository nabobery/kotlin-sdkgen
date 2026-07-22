package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent~1organizations/delet
 * e/requestBody/content/application~1json/schema/properties/custom_properties/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1copilot~1policies~1coding_agent~1organizations/delet
 * e/requestBody/content/application~1json/schema/properties/custom_properties/items
 */
@Serializable(with = InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af.Serializer::class)
public class InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af(
  /**
   * The name of the custom property to filter by.
   */
  public val propertyName: String,
  values: List<String>,
) {
  /**
   * The values of the custom property to match.
   */
  public val values: List<String> = values.toList()

  public class Builder {
    private var propertyNameValue: String? = null

    public var propertyName: String
      get() = requireNotNull(propertyNameValue) { "propertyName is required" }
      set(`value`) {
        propertyNameValue = value
      }

    private var valuesValue: List<String>? = null

    public var values: List<String>
      get() = requireNotNull(valuesValue) { "values is required" }
      set(`value`) {
        valuesValue = value
      }

    public fun build(): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af {
      check(propertyNameValue != null) { "propertyName is required" }
      check(valuesValue != null) { "values is required" }
      return InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af(
        propertyName = propertyName,
        values = values,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af must be a JSON object")
      val propertyName = json.decodeRequired<String>(rawObject, "property_name")
      val values = json.decodeRequired<List<String>>(rawObject, "values")
      return InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af(
        propertyName = propertyName,
        values = values,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("property_name", value.propertyName)
        put("values", json.encodeToJsonElement(value.values))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af(block: InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af.Builder.() -> Unit): InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af = InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesCopilotPo0ee5DeleteRequestJsonCustomPropertiesItemX128022af is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

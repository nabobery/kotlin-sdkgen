package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/operators/items.
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714
  .Serializer::class)
public class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714(
  /**
   * Operator identifier used in filter definitions
   */
  public val name:
      InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592,
  /**
   * Whether the operator expects a single value or an array
   */
  public val valueType:
      InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da,
) {
  public class Builder {
    private var nameValue:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592? =
        null

    public var name:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var valueTypeValue:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da? =
        null

    public var valueType:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da
      get() = requireNotNull(valueTypeValue) { "valueType is required" }
      set(`value`) {
        valueTypeValue = value
      }

    public fun build(): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714 {
      check(nameValue != null) { "name is required" }
      check(valueTypeValue != null) { "valueType is required" }
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714(
        name = name,
        valueType = valueType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714 = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714 " +
          "must be a JSON object")
      val name = json
        .decodeRequired<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat7d8c9592>(raw,
          "name")
      val valueType = json
        .decodeRequired<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData449b9da>(raw,
          "value_type")
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714(
        name = name,
        valueType = valueType,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
        put("value_type", json.encodeToJsonElement(value.valueType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714(block: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714.Builder.() -> Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714 = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714 " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/dimensions/items.
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e
  .Serializer::class)
public class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e(
  /**
   * Human-readable label
   */
  public val displayLabel: String,
  /**
   * Dimension identifier used in query requests
   */
  public val name: String,
) {
  public class Builder {
    private var displayLabelValue: String? = null

    public var displayLabel: String
      get() = requireNotNull(displayLabelValue) { "displayLabel is required" }
      set(`value`) {
        displayLabelValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e {
      check(displayLabelValue != null) { "displayLabel is required" }
      check(nameValue != null) { "name is required" }
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e(
        displayLabel = displayLabel,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e " +
          "must be a JSON object")
      val displayLabel = json.decodeRequired<String>(raw, "display_label")
      val name = json.decodeRequired<String>(raw, "name")
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e(
        displayLabel = displayLabel,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_label", value.displayLabel)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e(block: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e.Builder.() -> Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

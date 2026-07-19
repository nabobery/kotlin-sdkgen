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
 * ata/properties/granularities/items.
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a
  .Serializer::class)
public class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a(
  /**
   * Human-readable label
   */
  public val displayLabel: String,
  /**
   * Granularity identifier
   */
  public val name:
      InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486,
) {
  public class Builder {
    private var displayLabelValue: String? = null

    public var displayLabel: String
      get() = requireNotNull(displayLabelValue) { "displayLabel is required" }
      set(`value`) {
        displayLabelValue = value
      }

    private var nameValue:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486? =
        null

    public var name:
        InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a {
      check(displayLabelValue != null) { "displayLabel is required" }
      check(nameValue != null) { "name is required" }
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a(
        displayLabel = displayLabel,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a " +
          "must be a JSON object")
      val displayLabel = json.decodeRequired<String>(raw, "display_label")
      val name = json
        .decodeRequired<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatcc968486>(raw,
          "name")
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a(
        displayLabel = displayLabel,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_label", value.displayLabel)
        put("name", json.encodeToJsonElement(value.name))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a(block: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a.Builder.() -> Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

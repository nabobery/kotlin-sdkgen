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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/f
 * ilters/items.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems(
  /**
   * Dimension to filter on. Use the /meta endpoint for available dimensions.
   */
  public val `field`: String,
  /**
   * Filter operator
   */
  public val `operator`: String,
  /**
   * Filter value (scalar or array depending on operator). Several dimensions are enriched in responses (returned as
   * human-readable labels), but filters must use the underlying ID: `api_key_id` — numeric ID (from generation
   * metadata) or key hash (64-char hex from GET /api/v1/keys, resolved server-side); `user` — Clerk user ID (e.g.
   * "user_abc123"), not the display name; `workspace` — workspace UUID, not the workspace name; `app` — numeric app ID,
   * not the app title; `model` — permaslug (e.g. "openai/gpt-4o"), not the display name. Other dimensions (provider,
   * origin, country, etc.) are not enriched and accept the value as returned.
   */
  public val `value`:
      InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFi08e5e633,
) {
  public class Builder {
    private var fieldValue: String? = null

    public var `field`: String
      get() = requireNotNull(fieldValue) { "field is required" }
      set(`value`) {
        fieldValue = value
      }

    private var operatorValue: String? = null

    public var `operator`: String
      get() = requireNotNull(operatorValue) { "operator is required" }
      set(`value`) {
        operatorValue = value
      }

    private var valueValue:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFi08e5e633? =
        null

    public var `value`:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFi08e5e633
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems {
      check(fieldValue != null) { "field is required" }
      check(operatorValue != null) { "operator is required" }
      check(valueValue != null) { "value is required" }
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems(
        field = field,
        operator = operator,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems " +
          "must be a JSON object")
      val field = json.decodeRequired<String>(raw, "field")
      val operator = json.decodeRequired<String>(raw, "operator")
      val value = json
        .decodeRequired<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFi08e5e633>(raw,
          "value")
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems(
        field = field,
        operator = operator,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field", value.field)
        put("operator", value.operator)
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems(block: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems.Builder.() -> Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

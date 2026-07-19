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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/o
 * rder_by.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy(
  public val direction:
      InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682,
  /**
   * Field to order by
   */
  public val `field`: String,
) {
  public class Builder {
    private var directionValue:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682? =
        null

    public var direction:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682
      get() = requireNotNull(directionValue) { "direction is required" }
      set(`value`) {
        directionValue = value
      }

    private var fieldValue: String? = null

    public var `field`: String
      get() = requireNotNull(fieldValue) { "field is required" }
      set(`value`) {
        fieldValue = value
      }

    public fun build(): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy {
      check(directionValue != null) { "direction is required" }
      check(fieldValue != null) { "field is required" }
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy(
        direction = direction,
        field = field,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy " +
          "must be a JSON object")
      val direction = json
        .decodeRequired<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrb7a79682>(raw,
          "direction")
      val field = json.decodeRequired<String>(raw, "field")
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy(
        direction = direction,
        field = field,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("direction", json.encodeToJsonElement(value.direction))
        put("field", value.field)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy(block: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy.Builder.() -> Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

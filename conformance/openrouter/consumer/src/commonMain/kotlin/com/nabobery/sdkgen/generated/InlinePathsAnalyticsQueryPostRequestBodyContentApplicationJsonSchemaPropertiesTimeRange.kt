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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/t
 * ime_range.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange(
  public val end: String,
  public val start: String,
) {
  public class Builder {
    private var endValue: String? = null

    public var end: String
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue: String? = null

    public var start: String
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    public fun build(): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange " +
          "must be a JSON object")
      val end = json.decodeRequired<String>(raw, "end")
      val start = json.decodeRequired<String>(raw, "start")
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", value.end)
        put("start", value.start)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange(block: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange.Builder.() -> Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

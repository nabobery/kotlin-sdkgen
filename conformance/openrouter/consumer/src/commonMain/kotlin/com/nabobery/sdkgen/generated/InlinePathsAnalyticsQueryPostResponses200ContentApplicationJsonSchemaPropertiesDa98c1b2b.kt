package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema/properties
 * /data/properties/metadata.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b(
  public val queryTimeMs: Double,
  public val rowCount: Int,
  public val truncated: Boolean,
) {
  public class Builder {
    private var queryTimeMsValue: Double? = null

    public var queryTimeMs: Double
      get() = requireNotNull(queryTimeMsValue) { "queryTimeMs is required" }
      set(`value`) {
        queryTimeMsValue = value
      }

    private var rowCountValue: Int? = null

    public var rowCount: Int
      get() = requireNotNull(rowCountValue) { "rowCount is required" }
      set(`value`) {
        rowCountValue = value
      }

    private var truncatedValue: Boolean? = null

    public var truncated: Boolean
      get() = requireNotNull(truncatedValue) { "truncated is required" }
      set(`value`) {
        truncatedValue = value
      }

    public fun build(): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b {
      check(queryTimeMsValue != null) { "queryTimeMs is required" }
      check(rowCountValue != null) { "rowCount is required" }
      check(truncatedValue != null) { "truncated is required" }
      return InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b(
        queryTimeMs = queryTimeMs,
        rowCount = rowCount,
        truncated = truncated,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b " +
          "must be a JSON object")
      val queryTimeMs = json.decodeRequired<Double>(raw, "query_time_ms")
      val rowCount = json.decodeRequired<Int>(raw, "row_count")
      val truncated = json.decodeRequired<Boolean>(raw, "truncated")
      return InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b(
        queryTimeMs = queryTimeMs,
        rowCount = rowCount,
        truncated = truncated,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("query_time_ms", json.encodeToJsonElement(value.queryTimeMs))
        put("row_count", json.encodeToJsonElement(value.rowCount))
        put("truncated", json.encodeToJsonElement(value.truncated))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b(block: InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b.Builder.() -> Unit): InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b = InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostResponses200ContentApplicationJsonSchemaPropertiesDa98c1b2b " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

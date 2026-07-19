package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata.
 */
@Serializable(with = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData
  .Serializer::class)
public class InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData(
  dimensions: List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e>,
  granularities: List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a>,
  metrics: List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat166460a5>,
  operators: List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714>,
) {
  public val dimensions:
      List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e>
      = dimensions.toList()

  public val granularities:
      List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a>
      = granularities.toList()

  public val metrics:
      List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat166460a5>
      = metrics.toList()

  public val operators:
      List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714>
      = operators.toList()

  public class Builder {
    private var dimensionsValue:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e>?
        = null

    public var dimensions:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e>
      get() = requireNotNull(dimensionsValue) { "dimensions is required" }
      set(`value`) {
        dimensionsValue = value
      }

    private var granularitiesValue:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a>?
        = null

    public var granularities:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a>
      get() = requireNotNull(granularitiesValue) { "granularities is required" }
      set(`value`) {
        granularitiesValue = value
      }

    private var metricsValue:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat166460a5>?
        = null

    public var metrics:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat166460a5>
      get() = requireNotNull(metricsValue) { "metrics is required" }
      set(`value`) {
        metricsValue = value
      }

    private var operatorsValue:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714>?
        = null

    public var operators:
        List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714>
      get() = requireNotNull(operatorsValue) { "operators is required" }
      set(`value`) {
        operatorsValue = value
      }

    public fun build(): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData {
      check(dimensionsValue != null) { "dimensions is required" }
      check(granularitiesValue != null) { "granularities is required" }
      check(metricsValue != null) { "metrics is required" }
      check(operatorsValue != null) { "operators is required" }
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData(
        dimensions = dimensions,
        granularities = granularities,
        metrics = metrics,
        operators = operators,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData " +
          "must be a JSON object")
      val dimensions = json
























































                                                                                                                        .decodeRequired<List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat0bfb694e>>(raw, "dimensions")
      val granularities = json
























































                                                                                                                        .decodeRequired<List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatc9817b8a>>(raw, "granularities")
      val metrics = json
























































                                                                                                                        .decodeRequired<List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDat166460a5>>(raw, "metrics")
      val operators = json
























































                                                                                                                        .decodeRequired<List<InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesDatb8ce2714>>(raw, "operators")
      return InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData(
        dimensions = dimensions,
        granularities = granularities,
        metrics = metrics,
        operators = operators,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("dimensions", json.encodeToJsonElement(value.dimensions))
        put("granularities", json.encodeToJsonElement(value.granularities))
        put("metrics", json.encodeToJsonElement(value.metrics))
        put("operators", json.encodeToJsonElement(value.operators))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData(block: InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData.Builder.() -> Unit): InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData = InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsMetaGetResponses200ContentApplicationJsonSchemaPropertiesData " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

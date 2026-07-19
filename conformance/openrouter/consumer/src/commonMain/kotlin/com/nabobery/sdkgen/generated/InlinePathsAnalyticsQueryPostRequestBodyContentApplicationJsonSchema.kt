package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema.Serializer::class)
public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema(
  metrics: List<String>,
  /**
   * Group results by custom classifier tags, breaking down metrics by the specified dimension values. Requires an
   * active classifier on the workspace.
   */
  public val classifierDimensions:
      InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e? = null,
  /**
   * Filter results to generations with specific classifier tag values. Can be combined with classifier_dimensions (must
   * use the same classifier_id) or used independently with standard dimensions.
   */
  public val classifierFilters:
      InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd? = null,
  public val dimensions: List<String>? = null,
  public val filters:
      List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems>? = null,
  /**
   * Time granularity
   */
  public val granularity: String? = null,
  /**
   * Maximum rows per distinct combination of dimensions. When omitted on time-series queries (granularity +
   * dimensions), auto-computed to avoid truncating time windows. Explicit values override the default and may truncate
   * time buckets if set lower than the number of buckets in the range. Ignored when no dimensions are specified.
   */
  public val groupLimit: Int? = null,
  /**
   * Maximum total rows returned. Defaults to 1000. On time-series queries with dimensions and no explicit group_limit,
   * the server may raise this to accommodate the expected number of unique time-bucket/dimension combinations.
   */
  public val limit: Int? = null,
  public val orderBy:
      InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy? = null,
  public val timeRange:
      InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange? = null,
) {
  public val metrics: List<String> = metrics.toList()

  public class Builder {
    private var metricsValue: List<String>? = null

    public var metrics: List<String>
      get() = requireNotNull(metricsValue) { "metrics is required" }
      set(`value`) {
        metricsValue = value
      }

    /**
     * Group results by custom classifier tags, breaking down metrics by the specified dimension values. Requires an
     * active classifier on the workspace.
     */
    public var classifierDimensions:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e? =
        null

    /**
     * Filter results to generations with specific classifier tag values. Can be combined with classifier_dimensions
     * (must use the same classifier_id) or used independently with standard dimensions.
     */
    public var classifierFilters:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd? =
        null

    public var dimensions: List<String>? = null

    public var filters:
        List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems>?
        = null

    /**
     * Time granularity
     */
    public var granularity: String? = null

    /**
     * Maximum rows per distinct combination of dimensions. When omitted on time-series queries (granularity +
     * dimensions), auto-computed to avoid truncating time windows. Explicit values override the default and may
     * truncate time buckets if set lower than the number of buckets in the range. Ignored when no dimensions are
     * specified.
     */
    public var groupLimit: Int? = null

    /**
     * Maximum total rows returned. Defaults to 1000. On time-series queries with dimensions and no explicit
     * group_limit, the server may raise this to accommodate the expected number of unique time-bucket/dimension
     * combinations.
     */
    public var limit: Int? = null

    public var orderBy:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy? =
        null

    public var timeRange:
        InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange? =
        null

    public fun build(): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema {
      check(metricsValue != null) { "metrics is required" }
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema(
        metrics = metrics,
        classifierDimensions = classifierDimensions,
        classifierFilters = classifierFilters,
        dimensions = dimensions,
        filters = filters,
        granularity = granularity,
        groupLimit = groupLimit,
        limit = limit,
        orderBy = orderBy,
        timeRange = timeRange,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema must be a " +
          "JSON object")
      val metrics = json.decodeRequired<List<String>>(raw, "metrics")
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema(
        metrics = metrics,
        classifierDimensions = raw["classifier_dimensions"]?.let { json























































                                                                                                                        .decodeFromJsonElement<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl7205245e>(it) },
        classifierFilters = raw["classifier_filters"]?.let { json























































                                                                                                                        .decodeFromJsonElement<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesCl4b29c7dd>(it) },
        dimensions = raw["dimensions"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        filters = raw["filters"]?.let { json























































                                                                                                                        .decodeFromJsonElement<List<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFiltersItems>>(it) },
        granularity = raw["granularity"]?.let { json.decodeFromJsonElement<String>(it) },
        groupLimit = raw["group_limit"]?.let { json.decodeFromJsonElement<Int>(it) },
        limit = raw["limit"]?.let { json.decodeFromJsonElement<Int>(it) },
        orderBy = raw["order_by"]?.let { json























































                                                                                                                        .decodeFromJsonElement<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesOrderBy>(it) },
        timeRange = raw["time_range"]?.let { json























































                                                                                                                        .decodeFromJsonElement<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesTimeRange>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("metrics", json.encodeToJsonElement(value.metrics))
        value.classifierDimensions?.let { put("classifier_dimensions", json.encodeToJsonElement(it)) }
        value.classifierFilters?.let { put("classifier_filters", json.encodeToJsonElement(it)) }
        value.dimensions?.let { put("dimensions", json.encodeToJsonElement(it)) }
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.granularity?.let { put("granularity", it) }
        value.groupLimit?.let { put("group_limit", json.encodeToJsonElement(it)) }
        value.limit?.let { put("limit", json.encodeToJsonElement(it)) }
        value.orderBy?.let { put("order_by", json.encodeToJsonElement(it)) }
        value.timeRange?.let { put("time_range", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema(block: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema.Builder.() -> Unit): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchema is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}

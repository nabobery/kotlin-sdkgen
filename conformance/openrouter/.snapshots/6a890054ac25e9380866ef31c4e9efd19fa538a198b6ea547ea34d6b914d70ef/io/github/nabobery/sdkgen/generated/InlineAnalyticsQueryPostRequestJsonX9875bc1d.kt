package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonX9875bc1d.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonX9875bc1d(
  metrics: List<String>,
  /**
   * Group results by custom classifier tags, breaking down metrics by the specified dimension values. Requires an
   * active classifier on the workspace.
   */
  public val classifierDimensions:
      InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e? = null,
  /**
   * Filter results to generations with specific classifier tag values. Can be combined with classifier_dimensions (must
   * use the same classifier_id) or used independently with standard dimensions.
   */
  public val classifierFilters:
      InlineAnalyticsQueryPostRequestJsonClassifierFiltersX4b29c7dd? = null,
  dimensions: List<String>? = null,
  filters: List<InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8>? = null,
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
  public val orderBy: InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296? = null,
  public val timeRange: InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf? = null,
) {
  public val metrics: List<String> = metrics.toList()

  public val dimensions: List<String>? = dimensions?.let { collection0 -> collection0.toList() }

  public val filters: List<InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8>? =
      filters?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var metricsValue: List<String>? = null

    public var metrics: List<String>
      get() = requireNotNull(metricsValue) { "metrics is required" }.toList()
      set(`value`) {
        metricsValue = value.toList()
      }

    /**
     * Group results by custom classifier tags, breaking down metrics by the specified dimension values. Requires an
     * active classifier on the workspace.
     */
    public var classifierDimensions:
        InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e? = null

    /**
     * Filter results to generations with specific classifier tag values. Can be combined with classifier_dimensions
     * (must use the same classifier_id) or used independently with standard dimensions.
     */
    public var classifierFilters: InlineAnalyticsQueryPostRequestJsonClassifierFiltersX4b29c7dd? =
        null

    private var dimensionsValue: List<String>? = null

    public var dimensions: List<String>?
      get() = dimensionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        dimensionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var filtersValue: List<InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8>? = null

    public var filters: List<InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8>?
      get() = filtersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filtersValue = value?.let { collection0 -> collection0.toList() }
      }

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

    public var orderBy: InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296? = null

    public var timeRange: InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf? = null

    public fun build(): InlineAnalyticsQueryPostRequestJsonX9875bc1d {
      check(metricsValue != null) { "metrics is required" }
      return InlineAnalyticsQueryPostRequestJsonX9875bc1d(
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
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonX9875bc1d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonX9875bc1d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonX9875bc1d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonX9875bc1d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonX9875bc1d must be a JSON object")
      val metrics = json.decodeRequired<List<String>>(rawObject, "metrics")
      return InlineAnalyticsQueryPostRequestJsonX9875bc1d(
        metrics = metrics,
        classifierDimensions = rawObject["classifier_dimensions"]?.let { json.decodeFromJsonElement<InlineAnalyticsQueryPostRequestJsonClassifierDimensionsX7205245e>(it) },
        classifierFilters = rawObject["classifier_filters"]?.let { json.decodeFromJsonElement<InlineAnalyticsQueryPostRequestJsonClassifierFiltersX4b29c7dd>(it) },
        dimensions = rawObject["dimensions"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<List<InlineAnalyticsQueryPostRequestJsonFiltersItemX4a9db3c8>>(it) },
        granularity = rawObject["granularity"]?.let { json.decodeFromJsonElement<String>(it) },
        groupLimit = rawObject["group_limit"]?.let { json.decodeFromJsonElement<Int>(it) },
        limit = rawObject["limit"]?.let { json.decodeFromJsonElement<Int>(it) },
        orderBy = rawObject["order_by"]?.let { json.decodeFromJsonElement<InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296>(it) },
        timeRange = rawObject["time_range"]?.let { json.decodeFromJsonElement<InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonX9875bc1d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonX9875bc1d")
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

public fun inlineAnalyticsQueryPostRequestJsonX9875bc1d(block: InlineAnalyticsQueryPostRequestJsonX9875bc1d.Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonX9875bc1d = InlineAnalyticsQueryPostRequestJsonX9875bc1d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonX9875bc1d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

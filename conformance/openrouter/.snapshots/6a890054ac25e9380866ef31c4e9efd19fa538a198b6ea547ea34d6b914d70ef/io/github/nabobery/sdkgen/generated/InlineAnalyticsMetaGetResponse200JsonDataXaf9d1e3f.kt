package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f.Serializer::class)
public class InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f(
  dimensions: List<InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e>,
  granularities: List<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a>,
  metrics: List<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5>,
  operators: List<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714>,
) {
  public val dimensions: List<InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e> =
      dimensions.toList()

  public val granularities:
      List<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a> =
      granularities.toList()

  public val metrics: List<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5> =
      metrics.toList()

  public val operators: List<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714> =
      operators.toList()

  public class Builder {
    private var dimensionsValue:
        List<InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e>? = null

    public var dimensions: List<InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e>
      get() = requireNotNull(dimensionsValue) { "dimensions is required" }.toList()
      set(`value`) {
        dimensionsValue = value.toList()
      }

    private var granularitiesValue:
        List<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a>? = null

    public var granularities:
        List<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a>
      get() = requireNotNull(granularitiesValue) { "granularities is required" }.toList()
      set(`value`) {
        granularitiesValue = value.toList()
      }

    private var metricsValue: List<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5>? =
        null

    public var metrics: List<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5>
      get() = requireNotNull(metricsValue) { "metrics is required" }.toList()
      set(`value`) {
        metricsValue = value.toList()
      }

    private var operatorsValue:
        List<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714>? = null

    public var operators: List<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714>
      get() = requireNotNull(operatorsValue) { "operators is required" }.toList()
      set(`value`) {
        operatorsValue = value.toList()
      }

    public fun build(): InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f {
      check(dimensionsValue != null) { "dimensions is required" }
      check(granularitiesValue != null) { "granularities is required" }
      check(metricsValue != null) { "metrics is required" }
      check(operatorsValue != null) { "operators is required" }
      return InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f(
        dimensions = dimensions,
        granularities = granularities,
        metrics = metrics,
        operators = operators,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f must be a JSON object")
      val dimensions = json.decodeRequired<List<InlineAnalyticsMetaGetResponse200JsonDataDimensionsItemX0bfb694e>>(rawObject, "dimensions")
      val granularities = json.decodeRequired<List<InlineAnalyticsMetaGetResponse200JsonDataGranularitiesItemXc9817b8a>>(rawObject, "granularities")
      val metrics = json.decodeRequired<List<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5>>(rawObject, "metrics")
      val operators = json.decodeRequired<List<InlineAnalyticsMetaGetResponse200JsonDataOperatorsItemXb8ce2714>>(rawObject, "operators")
      return InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f(
        dimensions = dimensions,
        granularities = granularities,
        metrics = metrics,
        operators = operators,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f")
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

public fun inlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f(block: InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f.Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f = InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

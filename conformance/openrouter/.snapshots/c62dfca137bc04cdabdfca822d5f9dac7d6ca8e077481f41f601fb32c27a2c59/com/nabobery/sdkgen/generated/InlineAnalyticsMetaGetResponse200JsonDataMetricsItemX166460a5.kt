package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * ata/properties/metrics/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema/properties/d
 * ata/properties/metrics/items
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5.Serializer::class)
public class InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5(
  /**
   * How this metric value should be formatted for display (e.g. percent → multiply by 100 and append %, currency →
   * prefix with $)
   */
  public val displayFormat:
      InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8,
  /**
   * Human-readable label
   */
  public val displayLabel: String,
  /**
   * Whether this metric is a rate/ratio (averaged, not summed)
   */
  public val isRate: Boolean,
  /**
   * Metric identifier used in query requests
   */
  public val name: String,
) {
  public class Builder {
    private var displayFormatValue:
        InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8? = null

    public var displayFormat:
        InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8
      get() = requireNotNull(displayFormatValue) { "displayFormat is required" }
      set(`value`) {
        displayFormatValue = value
      }

    private var displayLabelValue: String? = null

    public var displayLabel: String
      get() = requireNotNull(displayLabelValue) { "displayLabel is required" }
      set(`value`) {
        displayLabelValue = value
      }

    private var isRateValue: Boolean? = null

    public var isRate: Boolean
      get() = requireNotNull(isRateValue) { "isRate is required" }
      set(`value`) {
        isRateValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5 {
      check(displayFormatValue != null) { "displayFormat is required" }
      check(displayLabelValue != null) { "displayLabel is required" }
      check(isRateValue != null) { "isRate is required" }
      check(nameValue != null) { "name is required" }
      return InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5(
        displayFormat = displayFormat,
        displayLabel = displayLabel,
        isRate = isRate,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5 must be a JSON object")
      val displayFormat = json.decodeRequired<InlineAnalyticsMetaGetResponse200JsonDataMetricsItemDisplayFormatXa15ee4f8>(rawObject, "display_format")
      val displayLabel = json.decodeRequired<String>(rawObject, "display_label")
      val isRate = json.decodeRequired<Boolean>(rawObject, "is_rate")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5(
        displayFormat = displayFormat,
        displayLabel = displayLabel,
        isRate = isRate,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_format", json.encodeToJsonElement(value.displayFormat))
        put("display_label", value.displayLabel)
        put("is_rate", json.encodeToJsonElement(value.isRate))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5(block: InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5.Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5 = InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonDataMetricsItemX166460a5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

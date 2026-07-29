package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Parameters specifying how the report should be run. Different Report Types have different required and optional
 * parameters, listed in the [API Access to Reports](https://docs.stripe.com/reporting/statements/api) documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/parameters
 */
@Serializable(with = InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf.Serializer::class)
public class InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf(
  columns: List<String>? = null,
  public val connectedAccount: String? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val intervalEnd: Int? = null,
  public val intervalStart: Int? = null,
  public val payout: String? = null,
  public val reportingCategory:
      InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172? = null,
  public val timezone:
      InlineV1ReportingReportRunsPostRequestFormParametersTimezoneXca3d8ed1? = null,
) {
  public val columns: List<String>? = columns?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var columnsValue: List<String>? = null

    public var columns: List<String>?
      get() = columnsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        columnsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var connectedAccount: String? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var intervalEnd: Int? = null

    public var intervalStart: Int? = null

    public var payout: String? = null

    public var reportingCategory:
        InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172? = null

    public var timezone: InlineV1ReportingReportRunsPostRequestFormParametersTimezoneXca3d8ed1? =
        null

    public fun build(): InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf = InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf(
      columns = columns,
      connectedAccount = connectedAccount,
      currency = currency,
      intervalEnd = intervalEnd,
      intervalStart = intervalStart,
      payout = payout,
      reportingCategory = reportingCategory,
      timezone = timezone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf must be a JSON object")
      return InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf(
        columns = rawObject["columns"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        connectedAccount = rawObject["connected_account"]?.let { json.decodeFromJsonElement<String>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        intervalEnd = rawObject["interval_end"]?.let { json.decodeFromJsonElement<Int>(it) },
        intervalStart = rawObject["interval_start"]?.let { json.decodeFromJsonElement<Int>(it) },
        payout = rawObject["payout"]?.let { json.decodeFromJsonElement<String>(it) },
        reportingCategory = rawObject["reporting_category"]?.let { json.decodeFromJsonElement<InlineV1ReportingReportRunsPostRequestFormParametersReportingCategoryXea6b9172>(it) },
        timezone = rawObject["timezone"]?.let { json.decodeFromJsonElement<InlineV1ReportingReportRunsPostRequestFormParametersTimezoneXca3d8ed1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.columns?.let { put("columns", json.encodeToJsonElement(it)) }
        value.connectedAccount?.let { put("connected_account", it) }
        value.currency?.let { put("currency", it) }
        value.intervalEnd?.let { put("interval_end", json.encodeToJsonElement(it)) }
        value.intervalStart?.let { put("interval_start", json.encodeToJsonElement(it)) }
        value.payout?.let { put("payout", it) }
        value.reportingCategory?.let { put("reporting_category", json.encodeToJsonElement(it)) }
        value.timezone?.let { put("timezone", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf(block: InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf.Builder.() -> Unit): InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf = InlineV1ReportingReportRunsPostRequestFormParametersX2d2199bf.build(block)

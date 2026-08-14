package io.github.nabobery.sdkgen.github.generated

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
 * Links to download the latest Copilot usage metrics report for an enterprise/organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-usage-metrics-28-day-report
 */
@Serializable(with = CopilotUsageMetrics28DayReport.Serializer::class)
public class CopilotUsageMetrics28DayReport(
  downloadLinks: List<String>,
  /**
   * The end date of the report period in `YYYY-MM-DD` format.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reportEndDay: String,
  /**
   * The start date of the report period in `YYYY-MM-DD` format.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reportStartDay: String,
) {
  /**
   * The URLs to download the latest Copilot usage metrics report for the enterprise/organization.
   */
  public val downloadLinks: List<String> = downloadLinks.toList()

  public class Builder {
    private var downloadLinksValue: List<String>? = null

    public var downloadLinks: List<String>
      get() = requireNotNull(downloadLinksValue) { "downloadLinks is required" }.toList()
      set(`value`) {
        downloadLinksValue = value.toList()
      }

    private var reportEndDayValue: String? = null

    public var reportEndDay: String
      get() = requireNotNull(reportEndDayValue) { "reportEndDay is required" }
      set(`value`) {
        reportEndDayValue = value
      }

    private var reportStartDayValue: String? = null

    public var reportStartDay: String
      get() = requireNotNull(reportStartDayValue) { "reportStartDay is required" }
      set(`value`) {
        reportStartDayValue = value
      }

    public fun build(): CopilotUsageMetrics28DayReport {
      check(downloadLinksValue != null) { "downloadLinks is required" }
      check(reportEndDayValue != null) { "reportEndDay is required" }
      check(reportStartDayValue != null) { "reportStartDay is required" }
      return CopilotUsageMetrics28DayReport(
        downloadLinks = downloadLinks,
        reportEndDay = reportEndDay,
        reportStartDay = reportStartDay,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CopilotUsageMetrics28DayReport = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CopilotUsageMetrics28DayReport> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotUsageMetrics28DayReport {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotUsageMetrics28DayReport")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CopilotUsageMetrics28DayReport must be a JSON object")
      val downloadLinks = json.decodeRequired<List<String>>(rawObject, "download_links")
      val reportEndDay = json.decodeRequired<String>(rawObject, "report_end_day")
      val reportStartDay = json.decodeRequired<String>(rawObject, "report_start_day")
      return CopilotUsageMetrics28DayReport(
        downloadLinks = downloadLinks,
        reportEndDay = reportEndDay,
        reportStartDay = reportStartDay,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CopilotUsageMetrics28DayReport) {
      val jsonEncoder = encoder.requireJsonEncoder("CopilotUsageMetrics28DayReport")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("download_links", json.encodeToJsonElement(value.downloadLinks))
        put("report_end_day", value.reportEndDay)
        put("report_start_day", value.reportStartDay)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun copilotUsageMetrics28DayReport(block: CopilotUsageMetrics28DayReport.Builder.() -> Unit): CopilotUsageMetrics28DayReport = CopilotUsageMetrics28DayReport.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CopilotUsageMetrics28DayReport is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

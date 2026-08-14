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
 * Links to download the Copilot usage metrics report for an enterprise/organization for a specific day.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-usage-metrics-1-day-report
 */
@Serializable(with = CopilotUsageMetrics1DayReport.Serializer::class)
public class CopilotUsageMetrics1DayReport(
  downloadLinks: List<String>,
  /**
   * The day of the report in `YYYY-MM-DD` format.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reportDay: String,
) {
  /**
   * The URLs to download the Copilot usage metrics report for the enterprise/organization for the specified day.
   */
  public val downloadLinks: List<String> = downloadLinks.toList()

  public class Builder {
    private var downloadLinksValue: List<String>? = null

    public var downloadLinks: List<String>
      get() = requireNotNull(downloadLinksValue) { "downloadLinks is required" }.toList()
      set(`value`) {
        downloadLinksValue = value.toList()
      }

    private var reportDayValue: String? = null

    public var reportDay: String
      get() = requireNotNull(reportDayValue) { "reportDay is required" }
      set(`value`) {
        reportDayValue = value
      }

    public fun build(): CopilotUsageMetrics1DayReport {
      check(downloadLinksValue != null) { "downloadLinks is required" }
      check(reportDayValue != null) { "reportDay is required" }
      return CopilotUsageMetrics1DayReport(
        downloadLinks = downloadLinks,
        reportDay = reportDay,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CopilotUsageMetrics1DayReport = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CopilotUsageMetrics1DayReport> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotUsageMetrics1DayReport {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotUsageMetrics1DayReport")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CopilotUsageMetrics1DayReport must be a JSON object")
      val downloadLinks = json.decodeRequired<List<String>>(rawObject, "download_links")
      val reportDay = json.decodeRequired<String>(rawObject, "report_day")
      return CopilotUsageMetrics1DayReport(
        downloadLinks = downloadLinks,
        reportDay = reportDay,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CopilotUsageMetrics1DayReport) {
      val jsonEncoder = encoder.requireJsonEncoder("CopilotUsageMetrics1DayReport")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("download_links", json.encodeToJsonElement(value.downloadLinks))
        put("report_day", value.reportDay)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun copilotUsageMetrics1DayReport(block: CopilotUsageMetrics1DayReport.Builder.() -> Unit): CopilotUsageMetrics1DayReport = CopilotUsageMetrics1DayReport.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CopilotUsageMetrics1DayReport is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

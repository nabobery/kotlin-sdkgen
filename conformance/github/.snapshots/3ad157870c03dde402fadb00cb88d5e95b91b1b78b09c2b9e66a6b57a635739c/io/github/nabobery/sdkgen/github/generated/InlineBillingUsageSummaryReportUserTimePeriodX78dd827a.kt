package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-user/properties/timePeriod.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-user/properties/timePeriod
 */
@Serializable(with = InlineBillingUsageSummaryReportUserTimePeriodX78dd827a.Serializer::class)
public class InlineBillingUsageSummaryReportUserTimePeriodX78dd827a(
  /**
   * The year for the usage report.
   */
  public val year: Int,
  /**
   * The day for the usage report.
   */
  public val day: Int? = null,
  /**
   * The month for the usage report.
   */
  public val month: Int? = null,
) {
  public class Builder {
    private var yearValue: Int? = null

    public var year: Int
      get() = requireNotNull(yearValue) { "year is required" }
      set(`value`) {
        yearValue = value
      }

    /**
     * The day for the usage report.
     */
    public var day: Int? = null

    /**
     * The month for the usage report.
     */
    public var month: Int? = null

    public fun build(): InlineBillingUsageSummaryReportUserTimePeriodX78dd827a {
      check(yearValue != null) { "year is required" }
      return InlineBillingUsageSummaryReportUserTimePeriodX78dd827a(
        year = year,
        day = day,
        month = month,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBillingUsageSummaryReportUserTimePeriodX78dd827a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBillingUsageSummaryReportUserTimePeriodX78dd827a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingUsageSummaryReportUserTimePeriodX78dd827a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingUsageSummaryReportUserTimePeriodX78dd827a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBillingUsageSummaryReportUserTimePeriodX78dd827a must be a JSON object")
      val year = json.decodeRequired<Int>(rawObject, "year")
      return InlineBillingUsageSummaryReportUserTimePeriodX78dd827a(
        year = year,
        day = rawObject["day"]?.let { json.decodeFromJsonElement<Int>(it) },
        month = rawObject["month"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingUsageSummaryReportUserTimePeriodX78dd827a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBillingUsageSummaryReportUserTimePeriodX78dd827a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("year", json.encodeToJsonElement(value.year))
        value.day?.let { put("day", json.encodeToJsonElement(it)) }
        value.month?.let { put("month", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBillingUsageSummaryReportUserTimePeriodX78dd827a(block: InlineBillingUsageSummaryReportUserTimePeriodX78dd827a.Builder.() -> Unit): InlineBillingUsageSummaryReportUserTimePeriodX78dd827a = InlineBillingUsageSummaryReportUserTimePeriodX78dd827a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBillingUsageSummaryReportUserTimePeriodX78dd827a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

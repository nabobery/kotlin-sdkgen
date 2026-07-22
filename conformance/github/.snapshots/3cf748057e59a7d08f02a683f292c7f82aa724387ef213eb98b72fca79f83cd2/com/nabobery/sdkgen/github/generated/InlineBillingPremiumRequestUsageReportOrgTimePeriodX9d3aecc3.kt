package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-org/properties/timePeriod.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-org/properties/timePeriod
 */
@Serializable(with = InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3.Serializer::class)
public class InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3(
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

    public fun build(): InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3 {
      check(yearValue != null) { "year is required" }
      return InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3(
        year = year,
        day = day,
        month = month,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3 must be a JSON object")
      val year = json.decodeRequired<Int>(rawObject, "year")
      return InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3(
        year = year,
        day = rawObject["day"]?.let { json.decodeFromJsonElement<Int>(it) },
        month = rawObject["month"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3")
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

public fun inlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3(block: InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3.Builder.() -> Unit): InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3 = InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

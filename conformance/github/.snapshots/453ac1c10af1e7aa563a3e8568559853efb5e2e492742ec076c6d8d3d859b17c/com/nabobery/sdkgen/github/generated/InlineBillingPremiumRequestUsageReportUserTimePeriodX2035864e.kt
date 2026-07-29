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
 * sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-user/properties/timePeriod.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-user/properties/timePeriod
 */
@Serializable(with = InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e.Serializer::class)
public class InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e(
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

    public fun build(): InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e {
      check(yearValue != null) { "year is required" }
      return InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e(
        year = year,
        day = day,
        month = month,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e must be a JSON object")
      val year = json.decodeRequired<Int>(rawObject, "year")
      return InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e(
        year = year,
        day = rawObject["day"]?.let { json.decodeFromJsonElement<Int>(it) },
        month = rawObject["month"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e")
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

public fun inlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e(block: InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e.Builder.() -> Unit): InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e = InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * sdkgen://source/openapi.yaml#/components/schemas/billing-ai-credit-usage-report-org/properties/timePeriod.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-ai-credit-usage-report-org/properties/timePeriod
 */
@Serializable(with = InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb.Serializer::class)
public class InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb(
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

    public fun build(): InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb {
      check(yearValue != null) { "year is required" }
      return InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb(
        year = year,
        day = day,
        month = month,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb must be a JSON object")
      val year = json.decodeRequired<Int>(rawObject, "year")
      return InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb(
        year = year,
        day = rawObject["day"]?.let { json.decodeFromJsonElement<Int>(it) },
        month = rawObject["month"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb")
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

public fun inlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb(block: InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb.Builder.() -> Unit): InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb = InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

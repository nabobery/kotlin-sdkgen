package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report
 */
@Serializable(with = BillingUsageReport.Serializer::class)
public class BillingUsageReport(
  public val usageItems: List<InlineBillingUsageReportUsageItemsItemXd7a8f9c2>? = null,
) {
  public class Builder {
    public var usageItems: List<InlineBillingUsageReportUsageItemsItemXd7a8f9c2>? = null

    public fun build(): BillingUsageReport = BillingUsageReport(
      usageItems = usageItems,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingUsageReport = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingUsageReport> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingUsageReport {
      val jsonDecoder = decoder.requireJsonDecoder("BillingUsageReport")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingUsageReport must be a JSON object")
      return BillingUsageReport(
        usageItems = rawObject["usageItems"]?.let { json.decodeFromJsonElement<List<InlineBillingUsageReportUsageItemsItemXd7a8f9c2>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingUsageReport) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingUsageReport")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.usageItems?.let { put("usageItems", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingUsageReport(block: BillingUsageReport.Builder.() -> Unit): BillingUsageReport = BillingUsageReport.build(block)

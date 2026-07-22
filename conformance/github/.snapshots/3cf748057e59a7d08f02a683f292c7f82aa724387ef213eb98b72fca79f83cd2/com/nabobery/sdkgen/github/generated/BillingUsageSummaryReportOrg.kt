package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-org.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-org
 */
@Serializable(with = BillingUsageSummaryReportOrg.Serializer::class)
public class BillingUsageSummaryReportOrg(
  /**
   * The unique identifier of the organization.
   */
  public val organization: String,
  public val timePeriod: InlineBillingUsageSummaryReportOrgTimePeriodX58bae4fb,
  usageItems: List<InlineBillingUsageSummaryReportOrgUsageItemsItemX5b170f76>,
  /**
   * The product for the usage report.
   */
  public val product: String? = null,
  /**
   * The name of the repository for the usage report.
   */
  public val repository: String? = null,
  /**
   * The SKU for the usage report.
   */
  public val sku: String? = null,
) {
  public val usageItems: List<InlineBillingUsageSummaryReportOrgUsageItemsItemX5b170f76> =
      usageItems.toList()

  public class Builder {
    private var organizationValue: String? = null

    public var organization: String
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var timePeriodValue: InlineBillingUsageSummaryReportOrgTimePeriodX58bae4fb? = null

    public var timePeriod: InlineBillingUsageSummaryReportOrgTimePeriodX58bae4fb
      get() = requireNotNull(timePeriodValue) { "timePeriod is required" }
      set(`value`) {
        timePeriodValue = value
      }

    private var usageItemsValue: List<InlineBillingUsageSummaryReportOrgUsageItemsItemX5b170f76>? =
        null

    public var usageItems: List<InlineBillingUsageSummaryReportOrgUsageItemsItemX5b170f76>
      get() = requireNotNull(usageItemsValue) { "usageItems is required" }
      set(`value`) {
        usageItemsValue = value
      }

    /**
     * The product for the usage report.
     */
    public var product: String? = null

    /**
     * The name of the repository for the usage report.
     */
    public var repository: String? = null

    /**
     * The SKU for the usage report.
     */
    public var sku: String? = null

    public fun build(): BillingUsageSummaryReportOrg {
      check(organizationValue != null) { "organization is required" }
      check(timePeriodValue != null) { "timePeriod is required" }
      check(usageItemsValue != null) { "usageItems is required" }
      return BillingUsageSummaryReportOrg(
        organization = organization,
        timePeriod = timePeriod,
        usageItems = usageItems,
        product = product,
        repository = repository,
        sku = sku,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingUsageSummaryReportOrg = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingUsageSummaryReportOrg> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingUsageSummaryReportOrg {
      val jsonDecoder = decoder.requireJsonDecoder("BillingUsageSummaryReportOrg")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingUsageSummaryReportOrg must be a JSON object")
      val organization = json.decodeRequired<String>(rawObject, "organization")
      val timePeriod = json.decodeRequired<InlineBillingUsageSummaryReportOrgTimePeriodX58bae4fb>(rawObject, "timePeriod")
      val usageItems = json.decodeRequired<List<InlineBillingUsageSummaryReportOrgUsageItemsItemX5b170f76>>(rawObject, "usageItems")
      return BillingUsageSummaryReportOrg(
        organization = organization,
        timePeriod = timePeriod,
        usageItems = usageItems,
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<String>(it) },
        sku = rawObject["sku"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingUsageSummaryReportOrg) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingUsageSummaryReportOrg")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("organization", value.organization)
        put("timePeriod", json.encodeToJsonElement(value.timePeriod))
        put("usageItems", json.encodeToJsonElement(value.usageItems))
        value.product?.let { put("product", it) }
        value.repository?.let { put("repository", it) }
        value.sku?.let { put("sku", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingUsageSummaryReportOrg(block: BillingUsageSummaryReportOrg.Builder.() -> Unit): BillingUsageSummaryReportOrg = BillingUsageSummaryReportOrg.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingUsageSummaryReportOrg is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-org.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-org
 */
@Serializable(with = BillingPremiumRequestUsageReportOrg.Serializer::class)
public class BillingPremiumRequestUsageReportOrg(
  /**
   * The unique identifier of the organization.
   */
  public val organization: String,
  public val timePeriod: InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3,
  usageItems: List<InlineBillingPremiumRequestUsageReportOrgUsageItemsItemXbe3cff3a>,
  /**
   * The model for the usage report.
   */
  public val model: String? = null,
  /**
   * The product for the usage report.
   */
  public val product: String? = null,
  /**
   * The name of the user for the usage report.
   */
  public val user: String? = null,
) {
  public val usageItems: List<InlineBillingPremiumRequestUsageReportOrgUsageItemsItemXbe3cff3a> =
      usageItems.toList()

  public class Builder {
    private var organizationValue: String? = null

    public var organization: String
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var timePeriodValue: InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3? =
        null

    public var timePeriod: InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3
      get() = requireNotNull(timePeriodValue) { "timePeriod is required" }
      set(`value`) {
        timePeriodValue = value
      }

    private var usageItemsValue:
        List<InlineBillingPremiumRequestUsageReportOrgUsageItemsItemXbe3cff3a>? = null

    public var usageItems: List<InlineBillingPremiumRequestUsageReportOrgUsageItemsItemXbe3cff3a>
      get() = requireNotNull(usageItemsValue) { "usageItems is required" }.toList()
      set(`value`) {
        usageItemsValue = value.toList()
      }

    /**
     * The model for the usage report.
     */
    public var model: String? = null

    /**
     * The product for the usage report.
     */
    public var product: String? = null

    /**
     * The name of the user for the usage report.
     */
    public var user: String? = null

    public fun build(): BillingPremiumRequestUsageReportOrg {
      check(organizationValue != null) { "organization is required" }
      check(timePeriodValue != null) { "timePeriod is required" }
      check(usageItemsValue != null) { "usageItems is required" }
      return BillingPremiumRequestUsageReportOrg(
        organization = organization,
        timePeriod = timePeriod,
        usageItems = usageItems,
        model = model,
        product = product,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingPremiumRequestUsageReportOrg = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingPremiumRequestUsageReportOrg> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingPremiumRequestUsageReportOrg {
      val jsonDecoder = decoder.requireJsonDecoder("BillingPremiumRequestUsageReportOrg")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingPremiumRequestUsageReportOrg must be a JSON object")
      val organization = json.decodeRequired<String>(rawObject, "organization")
      val timePeriod = json.decodeRequired<InlineBillingPremiumRequestUsageReportOrgTimePeriodX9d3aecc3>(rawObject, "timePeriod")
      val usageItems = json.decodeRequired<List<InlineBillingPremiumRequestUsageReportOrgUsageItemsItemXbe3cff3a>>(rawObject, "usageItems")
      return BillingPremiumRequestUsageReportOrg(
        organization = organization,
        timePeriod = timePeriod,
        usageItems = usageItems,
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingPremiumRequestUsageReportOrg) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingPremiumRequestUsageReportOrg")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("organization", value.organization)
        put("timePeriod", json.encodeToJsonElement(value.timePeriod))
        put("usageItems", json.encodeToJsonElement(value.usageItems))
        value.model?.let { put("model", it) }
        value.product?.let { put("product", it) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingPremiumRequestUsageReportOrg(block: BillingPremiumRequestUsageReportOrg.Builder.() -> Unit): BillingPremiumRequestUsageReportOrg = BillingPremiumRequestUsageReportOrg.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingPremiumRequestUsageReportOrg is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

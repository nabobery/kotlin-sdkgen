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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-ai-credit-usage-report-org.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-ai-credit-usage-report-org
 */
@Serializable(with = BillingAiCreditUsageReportOrg.Serializer::class)
public class BillingAiCreditUsageReportOrg(
  /**
   * The unique identifier of the organization.
   */
  public val organization: String,
  public val timePeriod: InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb,
  usageItems: List<InlineBillingAiCreditUsageReportOrgUsageItemsItemX84f199df>,
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
  public val usageItems: List<InlineBillingAiCreditUsageReportOrgUsageItemsItemX84f199df> =
      usageItems.toList()

  public class Builder {
    private var organizationValue: String? = null

    public var organization: String
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var timePeriodValue: InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb? = null

    public var timePeriod: InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb
      get() = requireNotNull(timePeriodValue) { "timePeriod is required" }
      set(`value`) {
        timePeriodValue = value
      }

    private var usageItemsValue: List<InlineBillingAiCreditUsageReportOrgUsageItemsItemX84f199df>? =
        null

    public var usageItems: List<InlineBillingAiCreditUsageReportOrgUsageItemsItemX84f199df>
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

    public fun build(): BillingAiCreditUsageReportOrg {
      check(organizationValue != null) { "organization is required" }
      check(timePeriodValue != null) { "timePeriod is required" }
      check(usageItemsValue != null) { "usageItems is required" }
      return BillingAiCreditUsageReportOrg(
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
    public fun build(block: Builder.() -> Unit): BillingAiCreditUsageReportOrg = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingAiCreditUsageReportOrg> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingAiCreditUsageReportOrg {
      val jsonDecoder = decoder.requireJsonDecoder("BillingAiCreditUsageReportOrg")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingAiCreditUsageReportOrg must be a JSON object")
      val organization = json.decodeRequired<String>(rawObject, "organization")
      val timePeriod = json.decodeRequired<InlineBillingAiCreditUsageReportOrgTimePeriodX2ca837cb>(rawObject, "timePeriod")
      val usageItems = json.decodeRequired<List<InlineBillingAiCreditUsageReportOrgUsageItemsItemX84f199df>>(rawObject, "usageItems")
      return BillingAiCreditUsageReportOrg(
        organization = organization,
        timePeriod = timePeriod,
        usageItems = usageItems,
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingAiCreditUsageReportOrg) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingAiCreditUsageReportOrg")
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

public fun billingAiCreditUsageReportOrg(block: BillingAiCreditUsageReportOrg.Builder.() -> Unit): BillingAiCreditUsageReportOrg = BillingAiCreditUsageReportOrg.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingAiCreditUsageReportOrg is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

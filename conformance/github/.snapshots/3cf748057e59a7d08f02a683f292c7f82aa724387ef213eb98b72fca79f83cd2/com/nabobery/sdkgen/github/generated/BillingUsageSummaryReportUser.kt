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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-user
 */
@Serializable(with = BillingUsageSummaryReportUser.Serializer::class)
public class BillingUsageSummaryReportUser(
  public val timePeriod: InlineBillingUsageSummaryReportUserTimePeriodX78dd827a,
  usageItems: List<InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14>,
  /**
   * The unique identifier of the user.
   */
  public val user: String,
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
  public val usageItems: List<InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14> =
      usageItems.toList()

  public class Builder {
    private var timePeriodValue: InlineBillingUsageSummaryReportUserTimePeriodX78dd827a? = null

    public var timePeriod: InlineBillingUsageSummaryReportUserTimePeriodX78dd827a
      get() = requireNotNull(timePeriodValue) { "timePeriod is required" }
      set(`value`) {
        timePeriodValue = value
      }

    private var usageItemsValue: List<InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14>? =
        null

    public var usageItems: List<InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14>
      get() = requireNotNull(usageItemsValue) { "usageItems is required" }
      set(`value`) {
        usageItemsValue = value
      }

    private var userValue: String? = null

    public var user: String
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
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

    public fun build(): BillingUsageSummaryReportUser {
      check(timePeriodValue != null) { "timePeriod is required" }
      check(usageItemsValue != null) { "usageItems is required" }
      check(userValue != null) { "user is required" }
      return BillingUsageSummaryReportUser(
        timePeriod = timePeriod,
        usageItems = usageItems,
        user = user,
        product = product,
        repository = repository,
        sku = sku,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingUsageSummaryReportUser = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingUsageSummaryReportUser> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingUsageSummaryReportUser {
      val jsonDecoder = decoder.requireJsonDecoder("BillingUsageSummaryReportUser")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingUsageSummaryReportUser must be a JSON object")
      val timePeriod = json.decodeRequired<InlineBillingUsageSummaryReportUserTimePeriodX78dd827a>(rawObject, "timePeriod")
      val usageItems = json.decodeRequired<List<InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14>>(rawObject, "usageItems")
      val user = json.decodeRequired<String>(rawObject, "user")
      return BillingUsageSummaryReportUser(
        timePeriod = timePeriod,
        usageItems = usageItems,
        user = user,
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<String>(it) },
        sku = rawObject["sku"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingUsageSummaryReportUser) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingUsageSummaryReportUser")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("timePeriod", json.encodeToJsonElement(value.timePeriod))
        put("usageItems", json.encodeToJsonElement(value.usageItems))
        put("user", value.user)
        value.product?.let { put("product", it) }
        value.repository?.let { put("repository", it) }
        value.sku?.let { put("sku", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingUsageSummaryReportUser(block: BillingUsageSummaryReportUser.Builder.() -> Unit): BillingUsageSummaryReportUser = BillingUsageSummaryReportUser.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingUsageSummaryReportUser is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

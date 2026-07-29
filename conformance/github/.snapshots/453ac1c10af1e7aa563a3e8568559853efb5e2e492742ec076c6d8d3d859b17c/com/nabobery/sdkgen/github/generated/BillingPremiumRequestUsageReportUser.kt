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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-premium-request-usage-report-user
 */
@Serializable(with = BillingPremiumRequestUsageReportUser.Serializer::class)
public class BillingPremiumRequestUsageReportUser(
  public val timePeriod: InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e,
  usageItems: List<InlineBillingPremiumRequestUsageReportUserUsageItemsItemX8f2f128d>,
  /**
   * The unique identifier of the user.
   */
  public val user: String,
  /**
   * The model for the usage report.
   */
  public val model: String? = null,
  /**
   * The product for the usage report.
   */
  public val product: String? = null,
) {
  public val usageItems: List<InlineBillingPremiumRequestUsageReportUserUsageItemsItemX8f2f128d> =
      usageItems.toList()

  public class Builder {
    private var timePeriodValue: InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e? =
        null

    public var timePeriod: InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e
      get() = requireNotNull(timePeriodValue) { "timePeriod is required" }
      set(`value`) {
        timePeriodValue = value
      }

    private var usageItemsValue:
        List<InlineBillingPremiumRequestUsageReportUserUsageItemsItemX8f2f128d>? = null

    public var usageItems: List<InlineBillingPremiumRequestUsageReportUserUsageItemsItemX8f2f128d>
      get() = requireNotNull(usageItemsValue) { "usageItems is required" }.toList()
      set(`value`) {
        usageItemsValue = value.toList()
      }

    private var userValue: String? = null

    public var user: String
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    /**
     * The model for the usage report.
     */
    public var model: String? = null

    /**
     * The product for the usage report.
     */
    public var product: String? = null

    public fun build(): BillingPremiumRequestUsageReportUser {
      check(timePeriodValue != null) { "timePeriod is required" }
      check(usageItemsValue != null) { "usageItems is required" }
      check(userValue != null) { "user is required" }
      return BillingPremiumRequestUsageReportUser(
        timePeriod = timePeriod,
        usageItems = usageItems,
        user = user,
        model = model,
        product = product,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingPremiumRequestUsageReportUser = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BillingPremiumRequestUsageReportUser> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingPremiumRequestUsageReportUser {
      val jsonDecoder = decoder.requireJsonDecoder("BillingPremiumRequestUsageReportUser")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingPremiumRequestUsageReportUser must be a JSON object")
      val timePeriod = json.decodeRequired<InlineBillingPremiumRequestUsageReportUserTimePeriodX2035864e>(rawObject, "timePeriod")
      val usageItems = json.decodeRequired<List<InlineBillingPremiumRequestUsageReportUserUsageItemsItemX8f2f128d>>(rawObject, "usageItems")
      val user = json.decodeRequired<String>(rawObject, "user")
      return BillingPremiumRequestUsageReportUser(
        timePeriod = timePeriod,
        usageItems = usageItems,
        user = user,
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingPremiumRequestUsageReportUser) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingPremiumRequestUsageReportUser")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("timePeriod", json.encodeToJsonElement(value.timePeriod))
        put("usageItems", json.encodeToJsonElement(value.usageItems))
        put("user", value.user)
        value.model?.let { put("model", it) }
        value.product?.let { put("product", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingPremiumRequestUsageReportUser(block: BillingPremiumRequestUsageReportUser.Builder.() -> Unit): BillingPremiumRequestUsageReportUser = BillingPremiumRequestUsageReportUser.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingPremiumRequestUsageReportUser is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

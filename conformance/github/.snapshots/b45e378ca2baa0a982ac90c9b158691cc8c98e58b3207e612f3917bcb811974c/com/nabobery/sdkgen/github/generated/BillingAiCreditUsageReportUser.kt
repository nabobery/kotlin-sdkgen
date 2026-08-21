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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/billing-ai-credit-usage-report-user.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-ai-credit-usage-report-user
 */
@Serializable(with = BillingAiCreditUsageReportUser.Serializer::class)
public class BillingAiCreditUsageReportUser(
  public val timePeriod: InlineBillingAiCreditUsageReportUserTimePeriodX47601871,
  usageItems: List<InlineBillingAiCreditUsageReportUserUsageItemsItemX10b8e8d5>,
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
  public val usageItems: List<InlineBillingAiCreditUsageReportUserUsageItemsItemX10b8e8d5> =
      usageItems.toList()

  public class Builder {
    private var timePeriodValue: InlineBillingAiCreditUsageReportUserTimePeriodX47601871? = null

    public var timePeriod: InlineBillingAiCreditUsageReportUserTimePeriodX47601871
      get() = requireNotNull(timePeriodValue) { "timePeriod is required" }
      set(`value`) {
        timePeriodValue = value
      }

    private var usageItemsValue: List<InlineBillingAiCreditUsageReportUserUsageItemsItemX10b8e8d5>?
        = null

    public var usageItems: List<InlineBillingAiCreditUsageReportUserUsageItemsItemX10b8e8d5>
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

    public fun build(): BillingAiCreditUsageReportUser {
      check(timePeriodValue != null) { "timePeriod is required" }
      check(usageItemsValue != null) { "usageItems is required" }
      check(userValue != null) { "user is required" }
      return BillingAiCreditUsageReportUser(
        timePeriod = timePeriod,
        usageItems = usageItems,
        user = user,
        model = model,
        product = product,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingAiCreditUsageReportUser = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingAiCreditUsageReportUser> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingAiCreditUsageReportUser {
      val jsonDecoder = decoder.requireJsonDecoder("BillingAiCreditUsageReportUser")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingAiCreditUsageReportUser must be a JSON object")
      val timePeriod = json.decodeRequired<InlineBillingAiCreditUsageReportUserTimePeriodX47601871>(rawObject, "timePeriod")
      val usageItems = json.decodeRequired<List<InlineBillingAiCreditUsageReportUserUsageItemsItemX10b8e8d5>>(rawObject, "usageItems")
      val user = json.decodeRequired<String>(rawObject, "user")
      return BillingAiCreditUsageReportUser(
        timePeriod = timePeriod,
        usageItems = usageItems,
        user = user,
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingAiCreditUsageReportUser) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingAiCreditUsageReportUser")
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

public fun billingAiCreditUsageReportUser(block: BillingAiCreditUsageReportUser.Builder.() -> Unit): BillingAiCreditUsageReportUser = BillingAiCreditUsageReportUser.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingAiCreditUsageReportUser is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class SubscriptionsResourcePendingUpdateView internal constructor(
  @SerialName("billing_cycle_anchor")
  public val billingCycleAnchor: Int? = null,
  public val discount: InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb? = null,
  public val discounts:
      List<InlineSubscriptionsResourcePendingUpdateDiscountsItemXcaf617ab>? = null,
  @SerialName("expires_at")
  public val expiresAt: Int,
  public val metadata: Map<String, String>? = null,
  @SerialName("subscription_items")
  public val subscriptionItems: List<SubscriptionItem>? = null,
  @SerialName("trial_end")
  public val trialEnd: Int? = null,
  @SerialName("trial_from_plan")
  public val trialFromPlan: Boolean? = null,
)

/**
 * Pending Updates store the changes pending from a previous update that will be applied
 * to the Subscription upon successful payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_pending_update
 */
@Serializable(with = SubscriptionsResourcePendingUpdate.Serializer::class)
public class SubscriptionsResourcePendingUpdate(
  /**
   * The point after which the changes reflected by this update will be discarded and no longer applied.
   */
  public val expiresAt: Int,
  /**
   * If the update is applied, determines the date of the first full invoice, and, for plans with `month` or `year`
   * intervals, the day of the month for subsequent invoices. The timestamp is in UTC format.
   */
  public val billingCycleAnchor: Int? = null,
  /**
   * The pending subscription-level discount that will be applied when the pending update is applied.
   */
  public val discount: InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb? = null,
  discounts: List<InlineSubscriptionsResourcePendingUpdateDiscountsItemXcaf617ab>? = null,
  metadata: Map<String, String>? = null,
  subscriptionItems: List<SubscriptionItem>? = null,
  /**
   * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
   * time, if the update is applied.
   */
  public val trialEnd: Int? = null,
  /**
   * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting `trial_end` per
   * subscription is preferred, and this defaults to `false`. Setting this flag to `true` together with `trial_end` is
   * not allowed. See [Using trial periods on subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to
   * learn more.
   */
  public val trialFromPlan: Boolean? = null,
) {
  /**
   * The discounts that will be applied to the subscription when the pending update is applied. Use `expand[]=discounts`
   * to expand each discount.
   */
  public val discounts: List<InlineSubscriptionsResourcePendingUpdateDiscountsItemXcaf617ab>? =
      discounts?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * List of subscription items, each with an attached plan, that will be set if the update is applied.
   */
  public val subscriptionItems: List<SubscriptionItem>? =
      subscriptionItems?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expiresAtValue: Int? = null

    public var expiresAt: Int
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    /**
     * If the update is applied, determines the date of the first full invoice, and, for plans with `month` or `year`
     * intervals, the day of the month for subsequent invoices. The timestamp is in UTC format.
     */
    public var billingCycleAnchor: Int? = null

    /**
     * The pending subscription-level discount that will be applied when the pending update is applied.
     */
    public var discount: InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb? = null

    private var discountsValue:
        List<InlineSubscriptionsResourcePendingUpdateDiscountsItemXcaf617ab>? = null

    /**
     * The discounts that will be applied to the subscription when the pending update is applied. Use
     * `expand[]=discounts` to expand each discount.
     */
    public var discounts: List<InlineSubscriptionsResourcePendingUpdateDiscountsItemXcaf617ab>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var subscriptionItemsValue: List<SubscriptionItem>? = null

    /**
     * List of subscription items, each with an attached plan, that will be set if the update is applied.
     */
    public var subscriptionItems: List<SubscriptionItem>?
      get() = subscriptionItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        subscriptionItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
     * time, if the update is applied.
     */
    public var trialEnd: Int? = null

    /**
     * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting `trial_end` per
     * subscription is preferred, and this defaults to `false`. Setting this flag to `true` together with `trial_end` is
     * not allowed. See [Using trial periods on subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to
     * learn more.
     */
    public var trialFromPlan: Boolean? = null

    public fun build(): SubscriptionsResourcePendingUpdate {
      check(expiresAtValue != null) { "expiresAt is required" }
      return SubscriptionsResourcePendingUpdate(
        expiresAt = expiresAt,
        billingCycleAnchor = billingCycleAnchor,
        discount = discount,
        discounts = discounts,
        metadata = metadata,
        subscriptionItems = subscriptionItems,
        trialEnd = trialEnd,
        trialFromPlan = trialFromPlan,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourcePendingUpdate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubscriptionsResourcePendingUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourcePendingUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourcePendingUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourcePendingUpdate must be a JSON object")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      return SubscriptionsResourcePendingUpdate(
        expiresAt = expiresAt,
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        discount = rawObject["discount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionsResourcePendingUpdateDiscountXe74f41cb?>(element) },
        discounts = rawObject["discounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineSubscriptionsResourcePendingUpdateDiscountsItemXcaf617ab>?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        subscriptionItems = rawObject["subscription_items"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<SubscriptionItem>?>(element) },
        trialEnd = rawObject["trial_end"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        trialFromPlan = rawObject["trial_from_plan"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourcePendingUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourcePendingUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
        value.discount?.let { put("discount", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.subscriptionItems?.let { put("subscription_items", json.encodeToJsonElement(it)) }
        value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
        value.trialFromPlan?.let { put("trial_from_plan", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourcePendingUpdate(block: SubscriptionsResourcePendingUpdate.Builder.() -> Unit): SubscriptionsResourcePendingUpdate = SubscriptionsResourcePendingUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourcePendingUpdate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_update
 */
@Serializable(with = PortalSubscriptionUpdate.Serializer::class)
public class PortalSubscriptionUpdate(
  defaultAllowedUpdates: List<InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9>,
  /**
   * Whether the feature is enabled.
   */
  public val enabled: Boolean,
  /**
   * Determines how to handle prorations resulting from subscription updates. Valid values are `none`,
   * `create_prorations`, and `always_invoice`. Defaults to a value of `none` if you don't set it during creation.
   */
  public val prorationBehavior: InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809,
  public val scheduleAtPeriodEnd: PortalResourceScheduleUpdateAtPeriodEnd,
  /**
   * Determines how handle updates to trialing subscriptions. Valid values are `end_trial` and `continue_trial`.
   * Defaults to a value of `end_trial` if you don't set it during creation.
   */
  public val trialUpdateBehavior: InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf,
  /**
   * Determines the value to use for the billing cycle anchor on subscription updates. Valid values are `now` or
   * `unchanged`, and the default value is `unchanged`. Setting the value to `now` resets the subscription's billing
   * cycle anchor to the current time (in UTC). For more information, see the billing cycle
   * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
   */
  public val billingCycleAnchor: InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd? = null,
  products: List<PortalSubscriptionUpdateProduct>? = null,
) {
  /**
   * The types of subscription updates that are supported for items listed in the `products` attribute. When empty,
   * subscriptions are not updateable.
   */
  public val defaultAllowedUpdates:
      List<InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9> =
      defaultAllowedUpdates.toList()

  /**
   * The list of up to 10 products that support subscription updates.
   */
  public val products: List<PortalSubscriptionUpdateProduct>? =
      products?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var defaultAllowedUpdatesValue:
        List<InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9>? = null

    public var defaultAllowedUpdates:
        List<InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9>
      get() = requireNotNull(defaultAllowedUpdatesValue) { "defaultAllowedUpdates is required" }.toList()
      set(`value`) {
        defaultAllowedUpdatesValue = value.toList()
      }

    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var prorationBehaviorValue: InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809? =
        null

    public var prorationBehavior: InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809
      get() = requireNotNull(prorationBehaviorValue) { "prorationBehavior is required" }
      set(`value`) {
        prorationBehaviorValue = value
      }

    private var scheduleAtPeriodEndValue: PortalResourceScheduleUpdateAtPeriodEnd? = null

    public var scheduleAtPeriodEnd: PortalResourceScheduleUpdateAtPeriodEnd
      get() = requireNotNull(scheduleAtPeriodEndValue) { "scheduleAtPeriodEnd is required" }
      set(`value`) {
        scheduleAtPeriodEndValue = value
      }

    private var trialUpdateBehaviorValue:
        InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf? = null

    public var trialUpdateBehavior: InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf
      get() = requireNotNull(trialUpdateBehaviorValue) { "trialUpdateBehavior is required" }
      set(`value`) {
        trialUpdateBehaviorValue = value
      }

    /**
     * Determines the value to use for the billing cycle anchor on subscription updates. Valid values are `now` or
     * `unchanged`, and the default value is `unchanged`. Setting the value to `now` resets the subscription's billing
     * cycle anchor to the current time (in UTC). For more information, see the billing cycle
     * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
     */
    public var billingCycleAnchor: InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd? = null

    private var productsValue: List<PortalSubscriptionUpdateProduct>? = null

    /**
     * The list of up to 10 products that support subscription updates.
     */
    public var products: List<PortalSubscriptionUpdateProduct>?
      get() = productsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        productsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): PortalSubscriptionUpdate {
      check(defaultAllowedUpdatesValue != null) { "defaultAllowedUpdates is required" }
      check(enabledValue != null) { "enabled is required" }
      check(prorationBehaviorValue != null) { "prorationBehavior is required" }
      check(scheduleAtPeriodEndValue != null) { "scheduleAtPeriodEnd is required" }
      check(trialUpdateBehaviorValue != null) { "trialUpdateBehavior is required" }
      return PortalSubscriptionUpdate(
        defaultAllowedUpdates = defaultAllowedUpdates,
        enabled = enabled,
        prorationBehavior = prorationBehavior,
        scheduleAtPeriodEnd = scheduleAtPeriodEnd,
        trialUpdateBehavior = trialUpdateBehavior,
        billingCycleAnchor = billingCycleAnchor,
        products = products,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalSubscriptionUpdate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PortalSubscriptionUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalSubscriptionUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("PortalSubscriptionUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalSubscriptionUpdate must be a JSON object")
      val defaultAllowedUpdates = json.decodeRequired<List<InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9>>(rawObject, "default_allowed_updates")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val prorationBehavior = json.decodeRequired<InlinePortalSubscriptionUpdateProrationBehaviorXbd6e9809>(rawObject, "proration_behavior")
      val scheduleAtPeriodEnd = json.decodeRequired<PortalResourceScheduleUpdateAtPeriodEnd>(rawObject, "schedule_at_period_end")
      val trialUpdateBehavior = json.decodeRequired<InlinePortalSubscriptionUpdateTrialUpdateBehaviorX4154e1cf>(rawObject, "trial_update_behavior")
      return PortalSubscriptionUpdate(
        defaultAllowedUpdates = defaultAllowedUpdates,
        enabled = enabled,
        prorationBehavior = prorationBehavior,
        scheduleAtPeriodEnd = scheduleAtPeriodEnd,
        trialUpdateBehavior = trialUpdateBehavior,
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd?>(element) },
        products = rawObject["products"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PortalSubscriptionUpdateProduct>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalSubscriptionUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalSubscriptionUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("default_allowed_updates", json.encodeToJsonElement(value.defaultAllowedUpdates))
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("proration_behavior", json.encodeToJsonElement(value.prorationBehavior))
        put("schedule_at_period_end", json.encodeToJsonElement(value.scheduleAtPeriodEnd))
        put("trial_update_behavior", json.encodeToJsonElement(value.trialUpdateBehavior))
        value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
        value.products?.let { put("products", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalSubscriptionUpdate(block: PortalSubscriptionUpdate.Builder.() -> Unit): PortalSubscriptionUpdate = PortalSubscriptionUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalSubscriptionUpdate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

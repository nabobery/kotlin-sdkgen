package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148(
  public val enabled: Boolean,
  public val billingCycleAnchor:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorXf481156c? = null,
  public val defaultAllowedUpdates:
      InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46? = null,
  public val products:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee? = null,
  public val prorationBehavior:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1? = null,
  public val scheduleAtPeriodEnd:
      InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60? = null,
  public val trialUpdateBehavior:
      InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX7ab893b0? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var billingCycleAnchor:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorXf481156c? = null

    public var defaultAllowedUpdates:
        InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46? = null

    public var products: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee? =
        null

    public var prorationBehavior:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1? = null

    public var scheduleAtPeriodEnd:
        InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60? = null

    public var trialUpdateBehavior:
        InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX7ab893b0? = null

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148(
        enabled = enabled,
        billingCycleAnchor = billingCycleAnchor,
        defaultAllowedUpdates = defaultAllowedUpdates,
        products = products,
        prorationBehavior = prorationBehavior,
        scheduleAtPeriodEnd = scheduleAtPeriodEnd,
        trialUpdateBehavior = trialUpdateBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148(
        enabled = enabled,
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesBillingCycleAnchorXf481156c>(it) },
        defaultAllowedUpdates = rawObject["default_allowed_updates"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46>(it) },
        products = rawObject["products"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXa0475aee>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorXacaab4b1>(it) },
        scheduleAtPeriodEnd = rawObject["schedule_at_period_end"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormScheduleAtPeriodEndX87090e60>(it) },
        trialUpdateBehavior = rawObject["trial_update_behavior"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormTrialUpdateBehaviorX7ab893b0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
        value.defaultAllowedUpdates?.let { put("default_allowed_updates", json.encodeToJsonElement(it)) }
        value.products?.let { put("products", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
        value.scheduleAtPeriodEnd?.let { put("schedule_at_period_end", json.encodeToJsonElement(it)) }
        value.trialUpdateBehavior?.let { put("trial_update_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148(block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148 = InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionUpdateX8729b148 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/delete/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/delete/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc.Serializer::class)
public class InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc(
  /**
   * Delete all usage for the given subscription item. Allowed only when the current plan's `usage_type` is `metered`.
   */
  public val clearUsage: Boolean? = null,
  /**
   * Controls how Stripe handles payment when a subscription update requires payment and
   * `collection_method=charge_automatically`.
   */
  public val paymentBehavior:
      InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d? = null,
  /**
   * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
   * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
   * item's `quantity` changes. The default value is `create_prorations`.
   */
  public val prorationBehavior:
      InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c? = null,
  /**
   * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used
   * to apply the same proration that was previewed with the [upcoming invoice](/api/invoices/create_preview) endpoint.
   */
  public val prorationDate: Int? = null,
) {
  public class Builder {
    /**
     * Delete all usage for the given subscription item. Allowed only when the current plan's `usage_type` is `metered`.
     */
    public var clearUsage: Boolean? = null

    /**
     * Controls how Stripe handles payment when a subscription update requires payment and
     * `collection_method=charge_automatically`.
     */
    public var paymentBehavior: InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d?
        = null

    /**
     * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
     * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
     * item's `quantity` changes. The default value is `create_prorations`.
     */
    public var prorationBehavior:
        InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c? = null

    /**
     * If set, the proration will be calculated as though the subscription was updated at the given time. This can be
     * used to apply the same proration that was previewed with the [upcoming invoice](/api/invoices/create_preview)
     * endpoint.
     */
    public var prorationDate: Int? = null

    public fun build(): InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc = InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc(
      clearUsage = clearUsage,
      paymentBehavior = paymentBehavior,
      prorationBehavior = prorationBehavior,
      prorationDate = prorationDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc must be a JSON object")
      return InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc(
        clearUsage = rawObject["clear_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        paymentBehavior = rawObject["payment_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c>(it) },
        prorationDate = rawObject["proration_date"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.clearUsage?.let { put("clear_usage", json.encodeToJsonElement(it)) }
        value.paymentBehavior?.let { put("payment_behavior", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
        value.prorationDate?.let { put("proration_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc(block: InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc.Builder.() -> Unit): InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc = InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc.build(block)

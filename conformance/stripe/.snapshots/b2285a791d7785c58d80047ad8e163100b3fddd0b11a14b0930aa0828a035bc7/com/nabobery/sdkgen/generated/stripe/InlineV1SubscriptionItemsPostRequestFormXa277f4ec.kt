package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormXa277f4ec.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormXa277f4ec(
  /**
   * The identifier of the subscription to modify.
   */
  public val subscription: String,
  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. Pass an
   * empty string to remove previously-defined thresholds.
   */
  public val billingThresholds:
      InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6? = null,
  /**
   * The coupons to redeem into discounts for the subscription item.
   */
  public val discounts: InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * Controls how Stripe handles payment when a subscription update requires payment and
   * `collection_method=charge_automatically`.
   */
  public val paymentBehavior:
      InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorXc5ed1ece? = null,
  /**
   * The ID of the price object.
   */
  public val price: String? = null,
  /**
   * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
   */
  public val priceData: InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd? = null,
  /**
   * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
   * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
   * item's `quantity` changes. The default value is `create_prorations`.
   */
  public val prorationBehavior:
      InlineV1SubscriptionItemsPostRequestFormProrationBehaviorX038153bf? = null,
  /**
   * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used
   * to apply the same proration that was previewed with the [upcoming invoice](/api/invoices/create_preview) endpoint.
   */
  public val prorationDate: Int? = null,
  /**
   * The quantity you'd like to apply to the subscription item you're creating.
   */
  public val quantity: Int? = null,
  /**
   * A list of [Tax Rate](https://docs.stripe.com/api/tax_rates) ids. These Tax Rates will override the
   * [`default_tax_rates`](https://docs.stripe.com/api/subscriptions/create#create_subscription-default_tax_rates) on
   * the Subscription. When updating, pass an empty string to remove previously-defined tax rates.
   */
  public val taxRates: InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. Pass
     * an empty string to remove previously-defined thresholds.
     */
    public var billingThresholds:
        InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6? = null

    /**
     * The coupons to redeem into discounts for the subscription item.
     */
    public var discounts: InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Controls how Stripe handles payment when a subscription update requires payment and
     * `collection_method=charge_automatically`.
     */
    public var paymentBehavior: InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorXc5ed1ece? =
        null

    /**
     * The ID of the price object.
     */
    public var price: String? = null

    /**
     * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
     */
    public var priceData: InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd? = null

    /**
     * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
     * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
     * item's `quantity` changes. The default value is `create_prorations`.
     */
    public var prorationBehavior:
        InlineV1SubscriptionItemsPostRequestFormProrationBehaviorX038153bf? = null

    /**
     * If set, the proration will be calculated as though the subscription was updated at the given time. This can be
     * used to apply the same proration that was previewed with the [upcoming invoice](/api/invoices/create_preview)
     * endpoint.
     */
    public var prorationDate: Int? = null

    /**
     * The quantity you'd like to apply to the subscription item you're creating.
     */
    public var quantity: Int? = null

    /**
     * A list of [Tax Rate](https://docs.stripe.com/api/tax_rates) ids. These Tax Rates will override the
     * [`default_tax_rates`](https://docs.stripe.com/api/subscriptions/create#create_subscription-default_tax_rates) on
     * the Subscription. When updating, pass an empty string to remove previously-defined tax rates.
     */
    public var taxRates: InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5? = null

    public fun build(): InlineV1SubscriptionItemsPostRequestFormXa277f4ec {
      check(subscriptionValue != null) { "subscription is required" }
      return InlineV1SubscriptionItemsPostRequestFormXa277f4ec(
        subscription = subscription,
        billingThresholds = billingThresholds,
        discounts = discounts,
        expand = expand,
        metadata = metadata,
        paymentBehavior = paymentBehavior,
        price = price,
        priceData = priceData,
        prorationBehavior = prorationBehavior,
        prorationDate = prorationDate,
        quantity = quantity,
        taxRates = taxRates,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormXa277f4ec = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormXa277f4ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormXa277f4ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormXa277f4ec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormXa277f4ec must be a JSON object")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return InlineV1SubscriptionItemsPostRequestFormXa277f4ec(
        subscription = subscription,
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsXca8229d6>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        paymentBehavior = rawObject["payment_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorXc5ed1ece>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormProrationBehaviorX038153bf>(it) },
        prorationDate = rawObject["proration_date"]?.let { json.decodeFromJsonElement<Int>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormTaxRatesX127dc7e5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormXa277f4ec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormXa277f4ec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subscription", value.subscription)
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.paymentBehavior?.let { put("payment_behavior", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
        value.prorationDate?.let { put("proration_date", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionItemsPostRequestFormXa277f4ec(block: InlineV1SubscriptionItemsPostRequestFormXa277f4ec.Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormXa277f4ec = InlineV1SubscriptionItemsPostRequestFormXa277f4ec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormXa277f4ec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

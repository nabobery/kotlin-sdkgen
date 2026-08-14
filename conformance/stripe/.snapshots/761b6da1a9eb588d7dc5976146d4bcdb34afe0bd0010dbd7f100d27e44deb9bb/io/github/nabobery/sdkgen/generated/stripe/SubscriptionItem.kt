package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Subscription items allow you to create customer subscriptions with more than
 * one plan, making it easy to represent complex billing relationships.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_item
 */
@Serializable(with = SubscriptionItem.Serializer::class)
public class SubscriptionItem(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The end time of this subscription item's current billing period.
   */
  public val currentPeriodEnd: Int,
  /**
   * The start time of this subscription item's current billing period.
   */
  public val currentPeriodStart: Int,
  discounts: List<InlineSubscriptionItemDiscountsItemX172b5224>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineSubscriptionItemObjectValueX1d680dfa,
  public val price: Price,
  /**
   * The `subscription` this `subscription_item` belongs to.
   */
  public val subscription: String,
  /**
   * The time period the subscription item has been billed for.
   */
  public val billedUntil: Int? = null,
  /**
   * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period
   */
  public val billingThresholds: InlineSubscriptionItemBillingThresholdsXf7b51752? = null,
  /**
   * The [quantity](https://docs.stripe.com/subscriptions/quantities) of the plan to which the customer should be
   * subscribed.
   */
  public val quantity: Int? = null,
  taxRates: List<TaxRate>? = null,
) {
  /**
   * The discounts applied to the subscription item. Subscription item discounts are applied before subscription
   * discounts. Use `expand[]=discounts` to expand each discount.
   */
  public val discounts: List<InlineSubscriptionItemDiscountsItemX172b5224> = discounts.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates` on the subscription do not
   * apply to this `subscription_item`.
   */
  public val taxRates: List<TaxRate>? = taxRates?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currentPeriodEndValue: Int? = null

    public var currentPeriodEnd: Int
      get() = requireNotNull(currentPeriodEndValue) { "currentPeriodEnd is required" }
      set(`value`) {
        currentPeriodEndValue = value
      }

    private var currentPeriodStartValue: Int? = null

    public var currentPeriodStart: Int
      get() = requireNotNull(currentPeriodStartValue) { "currentPeriodStart is required" }
      set(`value`) {
        currentPeriodStartValue = value
      }

    private var discountsValue: List<InlineSubscriptionItemDiscountsItemX172b5224>? = null

    public var discounts: List<InlineSubscriptionItemDiscountsItemX172b5224>
      get() = requireNotNull(discountsValue) { "discounts is required" }.toList()
      set(`value`) {
        discountsValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineSubscriptionItemObjectValueX1d680dfa? = null

    public var objectValue: InlineSubscriptionItemObjectValueX1d680dfa
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var priceValue: Price? = null

    public var price: Price
      get() = requireNotNull(priceValue) { "price is required" }
      set(`value`) {
        priceValue = value
      }

    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    /**
     * The time period the subscription item has been billed for.
     */
    public var billedUntil: Int? = null

    /**
     * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period
     */
    public var billingThresholds: InlineSubscriptionItemBillingThresholdsXf7b51752? = null

    /**
     * The [quantity](https://docs.stripe.com/subscriptions/quantities) of the plan to which the customer should be
     * subscribed.
     */
    public var quantity: Int? = null

    private var taxRatesValue: List<TaxRate>? = null

    /**
     * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates` on the subscription do
     * not apply to this `subscription_item`.
     */
    public var taxRates: List<TaxRate>?
      get() = taxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): SubscriptionItem {
      check(createdValue != null) { "created is required" }
      check(currentPeriodEndValue != null) { "currentPeriodEnd is required" }
      check(currentPeriodStartValue != null) { "currentPeriodStart is required" }
      check(discountsValue != null) { "discounts is required" }
      check(idValue != null) { "id is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(priceValue != null) { "price is required" }
      check(subscriptionValue != null) { "subscription is required" }
      return SubscriptionItem(
        created = created,
        currentPeriodEnd = currentPeriodEnd,
        currentPeriodStart = currentPeriodStart,
        discounts = discounts,
        id = id,
        metadata = metadata,
        objectValue = objectValue,
        price = price,
        subscription = subscription,
        billedUntil = billedUntil,
        billingThresholds = billingThresholds,
        quantity = quantity,
        taxRates = taxRates,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionItem {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionItem must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currentPeriodEnd = json.decodeRequired<Int>(rawObject, "current_period_end")
      val currentPeriodStart = json.decodeRequired<Int>(rawObject, "current_period_start")
      val discounts = json.decodeRequired<List<InlineSubscriptionItemDiscountsItemX172b5224>>(rawObject, "discounts")
      val id = json.decodeRequired<String>(rawObject, "id")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineSubscriptionItemObjectValueX1d680dfa>(rawObject, "object")
      val price = json.decodeRequired<Price>(rawObject, "price")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return SubscriptionItem(
        created = created,
        currentPeriodEnd = currentPeriodEnd,
        currentPeriodStart = currentPeriodStart,
        discounts = discounts,
        id = id,
        metadata = metadata,
        objectValue = objectValue,
        price = price,
        subscription = subscription,
        billedUntil = rawObject["billed_until"]?.let { json.decodeFromJsonElement<Int>(it) },
        billingThresholds = rawObject["billing_thresholds"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionItemBillingThresholdsXf7b51752?>(element) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<TaxRate>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionItem) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("current_period_end", json.encodeToJsonElement(value.currentPeriodEnd))
        put("current_period_start", json.encodeToJsonElement(value.currentPeriodStart))
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("id", value.id)
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("price", json.encodeToJsonElement(value.price))
        put("subscription", value.subscription)
        value.billedUntil?.let { put("billed_until", json.encodeToJsonElement(it)) }
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionItem(block: SubscriptionItem.Builder.() -> Unit): SubscriptionItem = SubscriptionItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
 * A phase item describes the price and quantity of a phase.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule_configuration_item
 */
@Serializable(with = SubscriptionScheduleConfigurationItem.Serializer::class)
public class SubscriptionScheduleConfigurationItem(
  discounts: List<StackableDiscountWithDiscountSettings>,
  /**
   * ID of the price to which the customer should be subscribed.
   */
  public val price: InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c,
  /**
   * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period
   */
  public val billingThresholds:
      InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a? = null,
  metadata: Map<String, String>? = null,
  /**
   * Quantity of the plan to which the customer should be subscribed.
   */
  public val quantity: Int? = null,
  taxRates: List<TaxRate>? = null,
) {
  /**
   * The discounts applied to the subscription item. Subscription item discounts are applied before subscription
   * discounts. Use `expand[]=discounts` to expand each discount.
   */
  public val discounts: List<StackableDiscountWithDiscountSettings> = discounts.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an item. Metadata on this
   * item will update the underlying subscription item's `metadata` when the phase is entered.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The tax rates which apply to this `phase_item`. When set, the `default_tax_rates` on the phase do not apply to this
   * `phase_item`.
   */
  public val taxRates: List<TaxRate>? = taxRates?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var discountsValue: List<StackableDiscountWithDiscountSettings>? = null

    public var discounts: List<StackableDiscountWithDiscountSettings>
      get() = requireNotNull(discountsValue) { "discounts is required" }.toList()
      set(`value`) {
        discountsValue = value.toList()
      }

    private var priceValue: InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c? = null

    public var price: InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c
      get() = requireNotNull(priceValue) { "price is required" }
      set(`value`) {
        priceValue = value
      }

    /**
     * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period
     */
    public var billingThresholds:
        InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an item. Metadata on this
     * item will update the underlying subscription item's `metadata` when the phase is entered.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Quantity of the plan to which the customer should be subscribed.
     */
    public var quantity: Int? = null

    private var taxRatesValue: List<TaxRate>? = null

    /**
     * The tax rates which apply to this `phase_item`. When set, the `default_tax_rates` on the phase do not apply to
     * this `phase_item`.
     */
    public var taxRates: List<TaxRate>?
      get() = taxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): SubscriptionScheduleConfigurationItem {
      check(discountsValue != null) { "discounts is required" }
      check(priceValue != null) { "price is required" }
      return SubscriptionScheduleConfigurationItem(
        discounts = discounts,
        price = price,
        billingThresholds = billingThresholds,
        metadata = metadata,
        quantity = quantity,
        taxRates = taxRates,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionScheduleConfigurationItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionScheduleConfigurationItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionScheduleConfigurationItem {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionScheduleConfigurationItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionScheduleConfigurationItem must be a JSON object")
      val discounts = json.decodeRequired<List<StackableDiscountWithDiscountSettings>>(rawObject, "discounts")
      val price = json.decodeRequired<InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c>(rawObject, "price")
      return SubscriptionScheduleConfigurationItem(
        discounts = discounts,
        price = price,
        billingThresholds = rawObject["billing_thresholds"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionScheduleConfigurationItemBillingThresholdsX55f2ab3a?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<TaxRate>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionScheduleConfigurationItem) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionScheduleConfigurationItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("price", json.encodeToJsonElement(value.price))
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionScheduleConfigurationItem(block: SubscriptionScheduleConfigurationItem.Builder.() -> Unit): SubscriptionScheduleConfigurationItem = SubscriptionScheduleConfigurationItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionScheduleConfigurationItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

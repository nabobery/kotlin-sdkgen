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
public data class PriceView internal constructor(
  public val active: Boolean,
  @SerialName("billing_scheme")
  public val billingScheme: InlinePriceBillingSchemeXc4ec9d28,
  public val created: Int,
  public val currency: String,
  @SerialName("currency_options")
  public val currencyOptions: Map<String, CurrencyOption>? = null,
  @SerialName("custom_unit_amount")
  public val customUnitAmount: InlinePriceCustomUnitAmountXd58f53a7? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("lookup_key")
  public val lookupKey: String? = null,
  public val metadata: Map<String, String>,
  public val nickname: String? = null,
  @SerialName("object")
  public val objectValue: InlinePriceObjectValueX9264b0d6,
  public val product: InlinePriceProductXa9e9648b,
  public val recurring: InlinePriceRecurringX2e8687de? = null,
  @SerialName("tax_behavior")
  public val taxBehavior: InlinePriceTaxBehaviorX0141c91e? = null,
  public val tiers: List<PriceTier>? = null,
  @SerialName("tiers_mode")
  public val tiersMode: InlinePriceTiersModeX49856d16? = null,
  @SerialName("transform_quantity")
  public val transformQuantity: InlinePriceTransformQuantityX05ef18f6? = null,
  public val type: InlinePriceTypeXd9ca5dc3,
  @SerialName("unit_amount")
  public val unitAmount: Int? = null,
  @SerialName("unit_amount_decimal")
  public val unitAmountDecimal: String? = null,
)

/**
 * Prices define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of
 * products.
 * [Products](https://api.stripe.com#products) help you track inventory or provisioning, and prices help you track
 * payment terms. Different physical goods or levels of service should be represented by products, and pricing options
 * should be represented by prices. This approach lets you change prices without having to change your provisioning
 * scheme.
 *
 * For example, you might have a single "gold" product that has prices for $10/month, $100/year, and €9 once.
 *
 * Related guides: [Set up a subscription](https://docs.stripe.com/billing/subscriptions/set-up-subscription), [create
 * an invoice](https://docs.stripe.com/billing/invoices/create), and more about [products and
 * prices](https://docs.stripe.com/products-prices/overview).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price
 */
@Serializable(with = Price.Serializer::class)
public class Price(
  /**
   * Whether the price can be used for new purchases.
   */
  public val active: Boolean,
  /**
   * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed
   * amount (specified in `unit_amount` or `unit_amount_decimal`) will be charged per unit in `quantity` (for prices
   * with `usage_type=licensed`), or per unit of total usage (for prices with `usage_type=metered`). `tiered` indicates
   * that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode`
   * attributes.
   */
  public val billingScheme: InlinePriceBillingSchemeXc4ec9d28,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePriceObjectValueX9264b0d6,
  /**
   * The ID of the product this price is associated with.
   */
  public val product: InlinePriceProductXa9e9648b,
  /**
   * One of `one_time` or `recurring` depending on whether the price is for a one-time purchase or a recurring
   * (subscription) purchase.
   */
  public val type: InlinePriceTypeXd9ca5dc3,
  currencyOptions: Map<String, CurrencyOption>? = null,
  /**
   * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and Payment
   * Links.
   */
  public val customUnitAmount: InlinePriceCustomUnitAmountXd58f53a7? = null,
  /**
   * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
   */
  public val lookupKey: String? = null,
  /**
   * A brief description of the price, hidden from customers.
   */
  public val nickname: String? = null,
  /**
   * The recurring components of a price such as `interval` and `usage_type`.
   */
  public val recurring: InlinePriceRecurringX2e8687de? = null,
  /**
   * Only required if a [default tax
   * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(r
   * ecommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of
   * taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
   * `inclusive` or `exclusive`, it cannot be changed.
   */
  public val taxBehavior: InlinePriceTaxBehaviorX0141c91e? = null,
  tiers: List<PriceTier>? = null,
  /**
   * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum
   * quantity within a period determines the per unit price. In `graduated` tiering, pricing can change as the quantity
   * grows.
   */
  public val tiersMode: InlinePriceTiersModeX49856d16? = null,
  /**
   * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be combined
   * with `tiers`.
   */
  public val transformQuantity: InlinePriceTransformQuantityX05ef18f6? = null,
  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if possible. Only set
   * if `billing_scheme=per_unit`.
   */
  public val unitAmount: Int? = null,
  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string with at most 12
   * decimal places. Only set if `billing_scheme=per_unit`.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * Prices defined in each available currency option. Each key must be a three-letter [ISO currency
   * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
   * currency](https://stripe.com/docs/currencies).
   */
  public val currencyOptions: Map<String, CurrencyOption>? =
      currencyOptions?.let { collection0 -> collection0.toMap() }

  /**
   * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
   * the documentation for `billing_scheme`.
   */
  public val tiers: List<PriceTier>? = tiers?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var billingSchemeValue: InlinePriceBillingSchemeXc4ec9d28? = null

    public var billingScheme: InlinePriceBillingSchemeXc4ec9d28
      get() = requireNotNull(billingSchemeValue) { "billingScheme is required" }
      set(`value`) {
        billingSchemeValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlinePriceObjectValueX9264b0d6? = null

    public var objectValue: InlinePriceObjectValueX9264b0d6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var productValue: InlinePriceProductXa9e9648b? = null

    public var product: InlinePriceProductXa9e9648b
      get() = requireNotNull(productValue) { "product is required" }
      set(`value`) {
        productValue = value
      }

    private var typeValue: InlinePriceTypeXd9ca5dc3? = null

    public var type: InlinePriceTypeXd9ca5dc3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var currencyOptionsValue: Map<String, CurrencyOption>? = null

    /**
     * Prices defined in each available currency option. Each key must be a three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public var currencyOptions: Map<String, CurrencyOption>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and
     * Payment Links.
     */
    public var customUnitAmount: InlinePriceCustomUnitAmountXd58f53a7? = null

    /**
     * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
     */
    public var lookupKey: String? = null

    /**
     * A brief description of the price, hidden from customers.
     */
    public var nickname: String? = null

    /**
     * The recurring components of a price such as `interval` and `usage_type`.
     */
    public var recurring: InlinePriceRecurringX2e8687de? = null

    /**
     * Only required if a [default tax
     * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-
     * (recommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive
     * of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
     * `inclusive` or `exclusive`, it cannot be changed.
     */
    public var taxBehavior: InlinePriceTaxBehaviorX0141c91e? = null

    private var tiersValue: List<PriceTier>? = null

    /**
     * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
     * the documentation for `billing_scheme`.
     */
    public var tiers: List<PriceTier>?
      get() = tiersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tiersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum
     * quantity within a period determines the per unit price. In `graduated` tiering, pricing can change as the
     * quantity grows.
     */
    public var tiersMode: InlinePriceTiersModeX49856d16? = null

    /**
     * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be
     * combined with `tiers`.
     */
    public var transformQuantity: InlinePriceTransformQuantityX05ef18f6? = null

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if possible. Only
     * set if `billing_scheme=per_unit`.
     */
    public var unitAmount: Int? = null

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string with at most 12
     * decimal places. Only set if `billing_scheme=per_unit`.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): Price {
      check(activeValue != null) { "active is required" }
      check(billingSchemeValue != null) { "billingScheme is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(productValue != null) { "product is required" }
      check(typeValue != null) { "type is required" }
      return Price(
        active = active,
        billingScheme = billingScheme,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        product = product,
        type = type,
        currencyOptions = currencyOptions,
        customUnitAmount = customUnitAmount,
        lookupKey = lookupKey,
        nickname = nickname,
        recurring = recurring,
        taxBehavior = taxBehavior,
        tiers = tiers,
        tiersMode = tiersMode,
        transformQuantity = transformQuantity,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Price = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Price> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Price {
      val jsonDecoder = decoder.requireJsonDecoder("Price")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Price must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val billingScheme = json.decodeRequired<InlinePriceBillingSchemeXc4ec9d28>(rawObject, "billing_scheme")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlinePriceObjectValueX9264b0d6>(rawObject, "object")
      val product = json.decodeRequired<InlinePriceProductXa9e9648b>(rawObject, "product")
      val type = json.decodeRequired<InlinePriceTypeXd9ca5dc3>(rawObject, "type")
      return Price(
        active = active,
        billingScheme = billingScheme,
        created = created,
        currency = currency,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        product = product,
        type = type,
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, CurrencyOption>>(it) },
        customUnitAmount = rawObject["custom_unit_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePriceCustomUnitAmountXd58f53a7?>(element) },
        lookupKey = rawObject["lookup_key"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nickname = rawObject["nickname"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        recurring = rawObject["recurring"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePriceRecurringX2e8687de?>(element) },
        taxBehavior = rawObject["tax_behavior"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePriceTaxBehaviorX0141c91e?>(element) },
        tiers = rawObject["tiers"]?.let { json.decodeFromJsonElement<List<PriceTier>>(it) },
        tiersMode = rawObject["tiers_mode"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePriceTiersModeX49856d16?>(element) },
        transformQuantity = rawObject["transform_quantity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePriceTransformQuantityX05ef18f6?>(element) },
        unitAmount = rawObject["unit_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Price) {
      val jsonEncoder = encoder.requireJsonEncoder("Price")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("billing_scheme", json.encodeToJsonElement(value.billingScheme))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("product", json.encodeToJsonElement(value.product))
        put("type", json.encodeToJsonElement(value.type))
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
        value.customUnitAmount?.let { put("custom_unit_amount", json.encodeToJsonElement(it)) }
        value.lookupKey?.let { put("lookup_key", it) }
        value.nickname?.let { put("nickname", it) }
        value.recurring?.let { put("recurring", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.tiers?.let { put("tiers", json.encodeToJsonElement(it)) }
        value.tiersMode?.let { put("tiers_mode", json.encodeToJsonElement(it)) }
        value.transformQuantity?.let { put("transform_quantity", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun price(block: Price.Builder.() -> Unit): Price = Price.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Price is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

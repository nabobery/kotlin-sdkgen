package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * You can now model subscriptions more flexibly using the [Prices API](https://api.stripe.com#prices). It replaces the
 * Plans API and is backwards compatible to simplify your migration.
 *
 * Plans define the base price, currency, and billing cycle for recurring purchases of products.
 * [Products](https://api.stripe.com#products) help you track inventory or provisioning, and plans help you track
 * pricing. Different physical goods or levels of service should be represented by products, and pricing options should
 * be represented by plans. This approach lets you change prices without having to change your provisioning scheme.
 *
 * For example, you might have a single "gold" product that has plans for $10/month, $100/year, €9/month, and €90/year.
 *
 * Related guides: [Set up a subscription](https://docs.stripe.com/billing/subscriptions/set-up-subscription) and more
 * about [products and prices](https://docs.stripe.com/products-prices/overview).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan
 */
@Serializable(with = Plan.Serializer::class)
public class Plan(
  /**
   * Whether the plan can be used for new purchases.
   */
  public val active: Boolean,
  /**
   * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed
   * amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or
   * per unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be
   * computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
   */
  public val billingScheme: InlinePlanBillingSchemeX6d8a7e86,
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
   * The frequency at which a subscription is billed. One of `day`, `week`, `month` or `year`.
   */
  public val interval: InlinePlanIntervalXf758c6bb,
  /**
   * The number of intervals (specified in the `interval` attribute) between subscription billings. For example,
   * `interval=month` and `interval_count=3` bills every 3 months.
   */
  public val intervalCount: Int,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePlanObjectValueXc22de456,
  /**
   * Configures how the quantity per period should be determined. Can be either `metered` or `licensed`. `licensed`
   * automatically bills the `quantity` set when adding it to a subscription. `metered` aggregates the total usage based
   * on usage records. Defaults to `licensed`.
   */
  public val usageType: InlinePlanUsageTypeXe742ecd5,
  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if possible. Only set
   * if `billing_scheme=per_unit`.
   */
  public val amount: Int? = null,
  /**
   * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string with at most 12
   * decimal places. Only set if `billing_scheme=per_unit`.
   *
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val amountDecimal: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * The meter tracking the usage of a metered price
   */
  public val meter: String? = null,
  /**
   * A brief description of the plan, hidden from customers.
   */
  public val nickname: String? = null,
  /**
   * The product whose pricing this plan determines.
   */
  public val product: InlinePlanProductXfe94cf9a? = null,
  tiers: List<PlanTier>? = null,
  /**
   * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum
   * quantity within a period determines the per unit price. In `graduated` tiering, pricing can change as the quantity
   * grows.
   */
  public val tiersMode: InlinePlanTiersModeXa5bf74cc? = null,
  /**
   * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be combined
   * with `tiers`.
   */
  public val transformUsage: InlinePlanTransformUsageX37dc328e? = null,
  /**
   * Default number of trial days when subscribing a customer to this plan using
   * [`trial_from_plan=true`](https://docs.stripe.com/api#create_subscription-trial_from_plan).
   */
  public val trialPeriodDays: Int? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
   * the documentation for `billing_scheme`.
   */
  public val tiers: List<PlanTier>? = tiers?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var billingSchemeValue: InlinePlanBillingSchemeX6d8a7e86? = null

    public var billingScheme: InlinePlanBillingSchemeX6d8a7e86
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

    private var intervalValue: InlinePlanIntervalXf758c6bb? = null

    public var interval: InlinePlanIntervalXf758c6bb
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var intervalCountValue: Int? = null

    public var intervalCount: Int
      get() = requireNotNull(intervalCountValue) { "intervalCount is required" }
      set(`value`) {
        intervalCountValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlinePlanObjectValueXc22de456? = null

    public var objectValue: InlinePlanObjectValueXc22de456
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var usageTypeValue: InlinePlanUsageTypeXe742ecd5? = null

    public var usageType: InlinePlanUsageTypeXe742ecd5
      get() = requireNotNull(usageTypeValue) { "usageType is required" }
      set(`value`) {
        usageTypeValue = value
      }

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a whole integer if possible. Only
     * set if `billing_scheme=per_unit`.
     */
    public var amount: Int? = null

    /**
     * The unit amount in cents (or local equivalent) to be charged, represented as a decimal string with at most 12
     * decimal places. Only set if `billing_scheme=per_unit`.
     *
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var amountDecimal: String? = null

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

    /**
     * The meter tracking the usage of a metered price
     */
    public var meter: String? = null

    /**
     * A brief description of the plan, hidden from customers.
     */
    public var nickname: String? = null

    /**
     * The product whose pricing this plan determines.
     */
    public var product: InlinePlanProductXfe94cf9a? = null

    private var tiersValue: List<PlanTier>? = null

    /**
     * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
     * the documentation for `billing_scheme`.
     */
    public var tiers: List<PlanTier>?
      get() = tiersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        tiersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum
     * quantity within a period determines the per unit price. In `graduated` tiering, pricing can change as the
     * quantity grows.
     */
    public var tiersMode: InlinePlanTiersModeXa5bf74cc? = null

    /**
     * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be
     * combined with `tiers`.
     */
    public var transformUsage: InlinePlanTransformUsageX37dc328e? = null

    /**
     * Default number of trial days when subscribing a customer to this plan using
     * [`trial_from_plan=true`](https://docs.stripe.com/api#create_subscription-trial_from_plan).
     */
    public var trialPeriodDays: Int? = null

    public fun build(): Plan {
      check(activeValue != null) { "active is required" }
      check(billingSchemeValue != null) { "billingScheme is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(idValue != null) { "id is required" }
      check(intervalValue != null) { "interval is required" }
      check(intervalCountValue != null) { "intervalCount is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(usageTypeValue != null) { "usageType is required" }
      return Plan(
        active = active,
        billingScheme = billingScheme,
        created = created,
        currency = currency,
        id = id,
        interval = interval,
        intervalCount = intervalCount,
        livemode = livemode,
        objectValue = objectValue,
        usageType = usageType,
        amount = amount,
        amountDecimal = amountDecimal,
        metadata = metadata,
        meter = meter,
        nickname = nickname,
        product = product,
        tiers = tiers,
        tiersMode = tiersMode,
        transformUsage = transformUsage,
        trialPeriodDays = trialPeriodDays,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Plan = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Plan> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Plan {
      val jsonDecoder = decoder.requireJsonDecoder("Plan")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Plan must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val billingScheme = json.decodeRequired<InlinePlanBillingSchemeX6d8a7e86>(rawObject, "billing_scheme")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val id = json.decodeRequired<String>(rawObject, "id")
      val interval = json.decodeRequired<InlinePlanIntervalXf758c6bb>(rawObject, "interval")
      val intervalCount = json.decodeRequired<Int>(rawObject, "interval_count")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlinePlanObjectValueXc22de456>(rawObject, "object")
      val usageType = json.decodeRequired<InlinePlanUsageTypeXe742ecd5>(rawObject, "usage_type")
      return Plan(
        active = active,
        billingScheme = billingScheme,
        created = created,
        currency = currency,
        id = id,
        interval = interval,
        intervalCount = intervalCount,
        livemode = livemode,
        objectValue = objectValue,
        usageType = usageType,
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        amountDecimal = rawObject["amount_decimal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        meter = rawObject["meter"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nickname = rawObject["nickname"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        product = rawObject["product"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePlanProductXfe94cf9a?>(element) },
        tiers = rawObject["tiers"]?.let { json.decodeFromJsonElement<List<PlanTier>>(it) },
        tiersMode = rawObject["tiers_mode"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePlanTiersModeXa5bf74cc?>(element) },
        transformUsage = rawObject["transform_usage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePlanTransformUsageX37dc328e?>(element) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Plan) {
      val jsonEncoder = encoder.requireJsonEncoder("Plan")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("billing_scheme", json.encodeToJsonElement(value.billingScheme))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("id", value.id)
        put("interval", json.encodeToJsonElement(value.interval))
        put("interval_count", json.encodeToJsonElement(value.intervalCount))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("usage_type", json.encodeToJsonElement(value.usageType))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountDecimal?.let { put("amount_decimal", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.meter?.let { put("meter", it) }
        value.nickname?.let { put("nickname", it) }
        value.product?.let { put("product", json.encodeToJsonElement(it)) }
        value.tiers?.let { put("tiers", json.encodeToJsonElement(it)) }
        value.tiersMode?.let { put("tiers_mode", json.encodeToJsonElement(it)) }
        value.transformUsage?.let { put("transform_usage", json.encodeToJsonElement(it)) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun plan(block: Plan.Builder.() -> Unit): Plan = Plan.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Plan is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

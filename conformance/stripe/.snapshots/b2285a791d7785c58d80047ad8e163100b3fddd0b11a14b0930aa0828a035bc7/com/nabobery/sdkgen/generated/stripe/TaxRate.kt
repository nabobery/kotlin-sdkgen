package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
public data class TaxRateView internal constructor(
  public val active: Boolean,
  public val country: String? = null,
  public val created: Int,
  public val description: String? = null,
  @SerialName("display_name")
  public val displayName: String,
  @SerialName("effective_percentage")
  public val effectivePercentage: Double? = null,
  @SerialName("flat_amount")
  public val flatAmount: InlineTaxRateFlatAmountXa35356a0? = null,
  public val id: String,
  public val inclusive: Boolean,
  public val jurisdiction: String? = null,
  @SerialName("jurisdiction_level")
  public val jurisdictionLevel: InlineTaxRateJurisdictionLevelX63ce8669? = null,
  public val livemode: Boolean,
  public val metadata: Map<String, String>? = null,
  @SerialName("object")
  public val objectValue: InlineTaxRateObjectValueXa9523a0e,
  public val percentage: Double,
  @SerialName("rate_type")
  public val rateType: InlineTaxRateRateTypeX81463d4b? = null,
  public val state: String? = null,
  @SerialName("tax_type")
  public val taxType: InlineTaxRateTaxTypeX73e4c6cd? = null,
)

/**
 * Tax rates can be applied to [invoices](/invoicing/taxes/tax-rates), [subscriptions](/billing/taxes/tax-rates) and
 * [Checkout Sessions](/payments/checkout/use-manual-tax-rates) to collect tax.
 *
 * Related guide: [Tax rates](/billing/taxes/tax-rates)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_rate
 */
@Serializable(with = TaxRate.Serializer::class)
public class TaxRate(
  /**
   * Defaults to `true`. When set to `false`, this tax rate cannot be used with new applications or Checkout Sessions,
   * but will still work for subscriptions and invoices that already have it set.
   */
  public val active: Boolean,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The display name of the tax rates as it will appear to your customer on their receipt email, PDF, and the hosted
   * invoice page.
   */
  public val displayName: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * This specifies if the tax rate is inclusive or exclusive.
   */
  public val inclusive: Boolean,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxRateObjectValueXa9523a0e,
  /**
   * Tax rate percentage out of 100. For tax calculations with automatic_tax[enabled]=true, this percentage includes the
   * statutory tax rate of non-taxable jurisdictions.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val percentage: Double,
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String? = null,
  /**
   * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your customers.
   */
  public val description: String? = null,
  /**
   * Actual/effective tax rate percentage out of 100. For tax calculations with automatic_tax[enabled]=true,
   * this percentage reflects the rate actually used to calculate tax based on the product's taxability
   * and whether the user is registered to collect taxes in the corresponding jurisdiction.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val effectivePercentage: Double? = null,
  /**
   * The amount of the tax rate when the `rate_type` is `flat_amount`. Tax rates with `rate_type` `percentage` can vary
   * based on the transaction, resulting in this field being `null`. This field exposes the amount and currency of the
   * flat tax rate.
   */
  public val flatAmount: InlineTaxRateFlatAmountXa35356a0? = null,
  /**
   * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes. It also appears on your
   * customer’s invoice.
   */
  public val jurisdiction: String? = null,
  /**
   * The level of the jurisdiction that imposes this tax rate. Will be `null` for manually defined tax rates.
   */
  public val jurisdictionLevel: InlineTaxRateJurisdictionLevelX63ce8669? = null,
  metadata: Map<String, String>? = null,
  /**
   * Indicates the type of tax rate applied to the taxable amount. This value can be `null` when no tax applies to the
   * location. This field is only present for TaxRates created by Stripe Tax.
   */
  public val rateType: InlineTaxRateRateTypeX81463d4b? = null,
  /**
   * [ISO 3166-2 subdivision code](https://en.wikipedia.org/wiki/ISO_3166-2), without country prefix. For example, "NY"
   * for New York, United States.
   */
  public val state: String? = null,
  /**
   * The high-level tax type, such as `vat` or `sales_tax`.
   */
  public val taxType: InlineTaxRateTaxTypeX73e4c6cd? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var inclusiveValue: Boolean? = null

    public var inclusive: Boolean
      get() = requireNotNull(inclusiveValue) { "inclusive is required" }
      set(`value`) {
        inclusiveValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTaxRateObjectValueXa9523a0e? = null

    public var objectValue: InlineTaxRateObjectValueXa9523a0e
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var percentageValue: Double? = null

    public var percentage: Double
      get() = requireNotNull(percentageValue) { "percentage is required" }
      set(`value`) {
        percentageValue = value
      }

    /**
     * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
     */
    public var country: String? = null

    /**
     * An arbitrary string attached to the tax rate for your internal use only. It will not be visible to your
     * customers.
     */
    public var description: String? = null

    /**
     * Actual/effective tax rate percentage out of 100. For tax calculations with automatic_tax[enabled]=true,
     * this percentage reflects the rate actually used to calculate tax based on the product's taxability
     * and whether the user is registered to collect taxes in the corresponding jurisdiction.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var effectivePercentage: Double? = null

    /**
     * The amount of the tax rate when the `rate_type` is `flat_amount`. Tax rates with `rate_type` `percentage` can
     * vary based on the transaction, resulting in this field being `null`. This field exposes the amount and currency
     * of the flat tax rate.
     */
    public var flatAmount: InlineTaxRateFlatAmountXa35356a0? = null

    /**
     * The jurisdiction for the tax rate. You can use this label field for tax reporting purposes. It also appears on
     * your customer’s invoice.
     */
    public var jurisdiction: String? = null

    /**
     * The level of the jurisdiction that imposes this tax rate. Will be `null` for manually defined tax rates.
     */
    public var jurisdictionLevel: InlineTaxRateJurisdictionLevelX63ce8669? = null

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
     * Indicates the type of tax rate applied to the taxable amount. This value can be `null` when no tax applies to the
     * location. This field is only present for TaxRates created by Stripe Tax.
     */
    public var rateType: InlineTaxRateRateTypeX81463d4b? = null

    /**
     * [ISO 3166-2 subdivision code](https://en.wikipedia.org/wiki/ISO_3166-2), without country prefix. For example,
     * "NY" for New York, United States.
     */
    public var state: String? = null

    /**
     * The high-level tax type, such as `vat` or `sales_tax`.
     */
    public var taxType: InlineTaxRateTaxTypeX73e4c6cd? = null

    public fun build(): TaxRate {
      check(activeValue != null) { "active is required" }
      check(createdValue != null) { "created is required" }
      check(displayNameValue != null) { "displayName is required" }
      check(idValue != null) { "id is required" }
      check(inclusiveValue != null) { "inclusive is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(percentageValue != null) { "percentage is required" }
      return TaxRate(
        active = active,
        created = created,
        displayName = displayName,
        id = id,
        inclusive = inclusive,
        livemode = livemode,
        objectValue = objectValue,
        percentage = percentage,
        country = country,
        description = description,
        effectivePercentage = effectivePercentage,
        flatAmount = flatAmount,
        jurisdiction = jurisdiction,
        jurisdictionLevel = jurisdictionLevel,
        metadata = metadata,
        rateType = rateType,
        state = state,
        taxType = taxType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxRate = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxRate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxRate {
      val jsonDecoder = decoder.requireJsonDecoder("TaxRate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxRate must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val id = json.decodeRequired<String>(rawObject, "id")
      val inclusive = json.decodeRequired<Boolean>(rawObject, "inclusive")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTaxRateObjectValueXa9523a0e>(rawObject, "object")
      val percentage = json.decodeRequired<Double>(rawObject, "percentage")
      return TaxRate(
        active = active,
        created = created,
        displayName = displayName,
        id = id,
        inclusive = inclusive,
        livemode = livemode,
        objectValue = objectValue,
        percentage = percentage,
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        effectivePercentage = rawObject["effective_percentage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        flatAmount = rawObject["flat_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxRateFlatAmountXa35356a0?>(element) },
        jurisdiction = rawObject["jurisdiction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        jurisdictionLevel = rawObject["jurisdiction_level"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxRateJurisdictionLevelX63ce8669?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        rateType = rawObject["rate_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxRateRateTypeX81463d4b?>(element) },
        state = rawObject["state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        taxType = rawObject["tax_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxRateTaxTypeX73e4c6cd?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxRate) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxRate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("created", json.encodeToJsonElement(value.created))
        put("display_name", value.displayName)
        put("id", value.id)
        put("inclusive", json.encodeToJsonElement(value.inclusive))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("percentage", json.encodeToJsonElement(value.percentage))
        value.country?.let { put("country", it) }
        value.description?.let { put("description", it) }
        value.effectivePercentage?.let { put("effective_percentage", json.encodeToJsonElement(it)) }
        value.flatAmount?.let { put("flat_amount", json.encodeToJsonElement(it)) }
        value.jurisdiction?.let { put("jurisdiction", it) }
        value.jurisdictionLevel?.let { put("jurisdiction_level", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.rateType?.let { put("rate_type", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", it) }
        value.taxType?.let { put("tax_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxRate(block: TaxRate.Builder.() -> Unit): TaxRate = TaxRate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxRate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

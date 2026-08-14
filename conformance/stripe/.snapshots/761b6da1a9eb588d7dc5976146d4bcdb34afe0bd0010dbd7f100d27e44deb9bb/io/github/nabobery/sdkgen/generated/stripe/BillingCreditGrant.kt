package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
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
public data class BillingCreditGrantView internal constructor(
  public val amount: BillingCreditGrantsResourceAmount,
  @SerialName("applicability_config")
  public val applicabilityConfig: BillingCreditGrantsResourceApplicabilityConfig,
  public val category: InlineBillingCreditGrantCategoryXda8e84e5,
  public val created: Int,
  public val customer: InlineBillingCreditGrantCustomerX059a3367,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("effective_at")
  public val effectiveAt: Int? = null,
  @SerialName("expires_at")
  public val expiresAt: Int? = null,
  public val id: String,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  public val name: String? = null,
  @SerialName("object")
  public val objectValue: InlineBillingCreditGrantObjectValueX5155fef6,
  public val priority: Int? = null,
  @SerialName("test_clock")
  public val testClock: InlineBillingCreditGrantTestClockXd98a9055? = null,
  public val updated: Int,
  @SerialName("voided_at")
  public val voidedAt: Int? = null,
)

/**
 * A credit grant is an API resource that documents the allocation of some billing credits to a customer.
 *
 * Related guide: [Billing credits](https://docs.stripe.com/billing/subscriptions/usage-based/billing-credits)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_grant
 */
@Serializable(with = BillingCreditGrant.Serializer::class)
public class BillingCreditGrant(
  public val amount: BillingCreditGrantsResourceAmount,
  public val applicabilityConfig: BillingCreditGrantsResourceApplicabilityConfig,
  /**
   * The category of this credit grant. This is for tracking purposes and isn't displayed to the customer.
   */
  public val category: InlineBillingCreditGrantCategoryXda8e84e5,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * ID of the customer receiving the billing credits.
   */
  public val customer: InlineBillingCreditGrantCustomerX059a3367,
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
  public val objectValue: InlineBillingCreditGrantObjectValueX5155fef6,
  /**
   * Time at which the object was last updated. Measured in seconds since the Unix epoch.
   */
  public val updated: Int,
  /**
   * ID of the account representing the customer receiving the billing credits
   */
  public val customerAccount: String? = null,
  /**
   * The time when the billing credits become effective-when they're eligible for use.
   */
  public val effectiveAt: Int? = null,
  /**
   * The time when the billing credits expire. If not present, the billing credits don't expire.
   */
  public val expiresAt: Int? = null,
  /**
   * A descriptive name shown in dashboard.
   */
  public val name: String? = null,
  /**
   * The priority for applying this credit grant. The highest priority is 0 and the lowest is 100.
   */
  public val priority: Int? = null,
  /**
   * ID of the test clock this credit grant belongs to.
   */
  public val testClock: InlineBillingCreditGrantTestClockXd98a9055? = null,
  /**
   * The time when this credit grant was voided. If not present, the credit grant hasn't been voided.
   */
  public val voidedAt: Int? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var amountValue: BillingCreditGrantsResourceAmount? = null

    public var amount: BillingCreditGrantsResourceAmount
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var applicabilityConfigValue: BillingCreditGrantsResourceApplicabilityConfig? = null

    public var applicabilityConfig: BillingCreditGrantsResourceApplicabilityConfig
      get() = requireNotNull(applicabilityConfigValue) { "applicabilityConfig is required" }
      set(`value`) {
        applicabilityConfigValue = value
      }

    private var categoryValue: InlineBillingCreditGrantCategoryXda8e84e5? = null

    public var category: InlineBillingCreditGrantCategoryXda8e84e5
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var customerValue: InlineBillingCreditGrantCustomerX059a3367? = null

    public var customer: InlineBillingCreditGrantCustomerX059a3367
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
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

    private var objectValueValue: InlineBillingCreditGrantObjectValueX5155fef6? = null

    public var objectValue: InlineBillingCreditGrantObjectValueX5155fef6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var updatedValue: Int? = null

    public var updated: Int
      get() = requireNotNull(updatedValue) { "updated is required" }
      set(`value`) {
        updatedValue = value
      }

    /**
     * ID of the account representing the customer receiving the billing credits
     */
    public var customerAccount: String? = null

    /**
     * The time when the billing credits become effective-when they're eligible for use.
     */
    public var effectiveAt: Int? = null

    /**
     * The time when the billing credits expire. If not present, the billing credits don't expire.
     */
    public var expiresAt: Int? = null

    /**
     * A descriptive name shown in dashboard.
     */
    public var name: String? = null

    /**
     * The priority for applying this credit grant. The highest priority is 0 and the lowest is 100.
     */
    public var priority: Int? = null

    /**
     * ID of the test clock this credit grant belongs to.
     */
    public var testClock: InlineBillingCreditGrantTestClockXd98a9055? = null

    /**
     * The time when this credit grant was voided. If not present, the credit grant hasn't been voided.
     */
    public var voidedAt: Int? = null

    public fun build(): BillingCreditGrant {
      check(amountValue != null) { "amount is required" }
      check(applicabilityConfigValue != null) { "applicabilityConfig is required" }
      check(categoryValue != null) { "category is required" }
      check(createdValue != null) { "created is required" }
      check(customerValue != null) { "customer is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(updatedValue != null) { "updated is required" }
      return BillingCreditGrant(
        amount = amount,
        applicabilityConfig = applicabilityConfig,
        category = category,
        created = created,
        customer = customer,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        updated = updated,
        customerAccount = customerAccount,
        effectiveAt = effectiveAt,
        expiresAt = expiresAt,
        name = name,
        priority = priority,
        testClock = testClock,
        voidedAt = voidedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrant = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingCreditGrant> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrant {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrant")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrant must be a JSON object")
      val amount = json.decodeRequired<BillingCreditGrantsResourceAmount>(rawObject, "amount")
      val applicabilityConfig = json.decodeRequired<BillingCreditGrantsResourceApplicabilityConfig>(rawObject, "applicability_config")
      val category = json.decodeRequired<InlineBillingCreditGrantCategoryXda8e84e5>(rawObject, "category")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val customer = json.decodeRequired<InlineBillingCreditGrantCustomerX059a3367>(rawObject, "customer")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineBillingCreditGrantObjectValueX5155fef6>(rawObject, "object")
      val updated = json.decodeRequired<Int>(rawObject, "updated")
      return BillingCreditGrant(
        amount = amount,
        applicabilityConfig = applicabilityConfig,
        category = category,
        created = created,
        customer = customer,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        updated = updated,
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        effectiveAt = rawObject["effective_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        priority = rawObject["priority"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        testClock = rawObject["test_clock"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingCreditGrantTestClockXd98a9055?>(element) },
        voidedAt = rawObject["voided_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrant) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrant")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("applicability_config", json.encodeToJsonElement(value.applicabilityConfig))
        put("category", json.encodeToJsonElement(value.category))
        put("created", json.encodeToJsonElement(value.created))
        put("customer", json.encodeToJsonElement(value.customer))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("updated", json.encodeToJsonElement(value.updated))
        value.customerAccount?.let { put("customer_account", it) }
        value.effectiveAt?.let { put("effective_at", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.priority?.let { put("priority", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
        value.voidedAt?.let { put("voided_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrant(block: BillingCreditGrant.Builder.() -> Unit): BillingCreditGrant = BillingCreditGrant.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingCreditGrant is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

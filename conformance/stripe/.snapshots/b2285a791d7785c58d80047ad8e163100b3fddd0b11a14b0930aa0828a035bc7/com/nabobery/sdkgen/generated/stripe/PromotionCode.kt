package com.nabobery.sdkgen.generated.stripe

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
public data class PromotionCodeView internal constructor(
  public val active: Boolean,
  public val code: String,
  public val created: Int,
  public val customer: InlinePromotionCodeCustomerX64b32b82? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("expires_at")
  public val expiresAt: Int? = null,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("max_redemptions")
  public val maxRedemptions: Int? = null,
  public val metadata: Map<String, String>? = null,
  @SerialName("object")
  public val objectValue: InlinePromotionCodeObjectValueXfaa06a5c,
  public val promotion: PromotionCodesResourcePromotion,
  public val restrictions: PromotionCodesResourceRestrictions,
  @SerialName("times_redeemed")
  public val timesRedeemed: Int,
)

/**
 * A Promotion Code represents a customer-redeemable code for an underlying promotion.
 * You can create multiple codes for a single promotion.
 *
 * If you enable promotion codes in your [customer portal
 * configuration](https://docs.stripe.com/customer-management/configure-portal), then customers can redeem a code
 * themselves when updating a subscription in the portal.
 * Customers can also view the currently active promotion codes and coupons on each of their subscriptions in the
 * portal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_code
 */
@Serializable(with = PromotionCode.Serializer::class)
public class PromotionCode(
  /**
   * Whether the promotion code is currently active. A promotion code is only active if the coupon is also valid.
   */
  public val active: Boolean,
  /**
   * The customer-facing code. Regardless of case, this code must be unique across all active promotion codes for each
   * customer. Valid characters are lower case letters (a-z), upper case letters (A-Z), digits (0-9), and dashes (-).
   */
  public val code: String,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePromotionCodeObjectValueXfaa06a5c,
  public val promotion: PromotionCodesResourcePromotion,
  public val restrictions: PromotionCodesResourceRestrictions,
  /**
   * Number of times this promotion code has been used.
   */
  public val timesRedeemed: Int,
  /**
   * The customer who can use this promotion code.
   */
  public val customer: InlinePromotionCodeCustomerX64b32b82? = null,
  /**
   * The account representing the customer who can use this promotion code.
   */
  public val customerAccount: String? = null,
  /**
   * Date at which the promotion code can no longer be redeemed.
   */
  public val expiresAt: Int? = null,
  /**
   * Maximum number of times this promotion code can be redeemed.
   */
  public val maxRedemptions: Int? = null,
  metadata: Map<String, String>? = null,
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

    private var codeValue: String? = null

    public var code: String
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
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

    private var objectValueValue: InlinePromotionCodeObjectValueXfaa06a5c? = null

    public var objectValue: InlinePromotionCodeObjectValueXfaa06a5c
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var promotionValue: PromotionCodesResourcePromotion? = null

    public var promotion: PromotionCodesResourcePromotion
      get() = requireNotNull(promotionValue) { "promotion is required" }
      set(`value`) {
        promotionValue = value
      }

    private var restrictionsValue: PromotionCodesResourceRestrictions? = null

    public var restrictions: PromotionCodesResourceRestrictions
      get() = requireNotNull(restrictionsValue) { "restrictions is required" }
      set(`value`) {
        restrictionsValue = value
      }

    private var timesRedeemedValue: Int? = null

    public var timesRedeemed: Int
      get() = requireNotNull(timesRedeemedValue) { "timesRedeemed is required" }
      set(`value`) {
        timesRedeemedValue = value
      }

    /**
     * The customer who can use this promotion code.
     */
    public var customer: InlinePromotionCodeCustomerX64b32b82? = null

    /**
     * The account representing the customer who can use this promotion code.
     */
    public var customerAccount: String? = null

    /**
     * Date at which the promotion code can no longer be redeemed.
     */
    public var expiresAt: Int? = null

    /**
     * Maximum number of times this promotion code can be redeemed.
     */
    public var maxRedemptions: Int? = null

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

    public fun build(): PromotionCode {
      check(activeValue != null) { "active is required" }
      check(codeValue != null) { "code is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(promotionValue != null) { "promotion is required" }
      check(restrictionsValue != null) { "restrictions is required" }
      check(timesRedeemedValue != null) { "timesRedeemed is required" }
      return PromotionCode(
        active = active,
        code = code,
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        promotion = promotion,
        restrictions = restrictions,
        timesRedeemed = timesRedeemed,
        customer = customer,
        customerAccount = customerAccount,
        expiresAt = expiresAt,
        maxRedemptions = maxRedemptions,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PromotionCode = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PromotionCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PromotionCode {
      val jsonDecoder = decoder.requireJsonDecoder("PromotionCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PromotionCode must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val code = json.decodeRequired<String>(rawObject, "code")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlinePromotionCodeObjectValueXfaa06a5c>(rawObject, "object")
      val promotion = json.decodeRequired<PromotionCodesResourcePromotion>(rawObject, "promotion")
      val restrictions = json.decodeRequired<PromotionCodesResourceRestrictions>(rawObject, "restrictions")
      val timesRedeemed = json.decodeRequired<Int>(rawObject, "times_redeemed")
      return PromotionCode(
        active = active,
        code = code,
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        promotion = promotion,
        restrictions = restrictions,
        timesRedeemed = timesRedeemed,
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePromotionCodeCustomerX64b32b82?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        maxRedemptions = rawObject["max_redemptions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PromotionCode) {
      val jsonEncoder = encoder.requireJsonEncoder("PromotionCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("code", value.code)
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("promotion", json.encodeToJsonElement(value.promotion))
        put("restrictions", json.encodeToJsonElement(value.restrictions))
        put("times_redeemed", json.encodeToJsonElement(value.timesRedeemed))
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.maxRedemptions?.let { put("max_redemptions", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun promotionCode(block: PromotionCode.Builder.() -> Unit): PromotionCode = PromotionCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PromotionCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

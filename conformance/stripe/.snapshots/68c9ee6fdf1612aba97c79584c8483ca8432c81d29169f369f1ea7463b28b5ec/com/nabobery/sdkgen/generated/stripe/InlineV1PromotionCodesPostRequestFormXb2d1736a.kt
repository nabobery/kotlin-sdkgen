package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormXb2d1736a.Serializer::class)
public class InlineV1PromotionCodesPostRequestFormXb2d1736a(
  /**
   * The promotion referenced by this promotion code.
   */
  public val promotion: InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4,
  /**
   * Whether the promotion code is currently active.
   */
  public val active: Boolean? = null,
  /**
   * The customer-facing code. Regardless of case, this code must be unique across all active promotion codes for a
   * specific customer. Valid characters are lower case letters (a-z), upper case letters (A-Z), digits (0-9), and
   * dashes (-).
   *
   * If left blank, we will generate one automatically.
   */
  public val code: String? = null,
  /**
   * The customer who can use this promotion code. If not set, all customers can use the promotion code.
   */
  public val customer: String? = null,
  /**
   * The account representing the customer who can use this promotion code. If not set, all customers can use the
   * promotion code.
   */
  public val customerAccount: String? = null,
  expand: List<String>? = null,
  /**
   * The timestamp at which this promotion code will expire. If the coupon has specified a `redeems_by`, then this value
   * cannot be after the coupon's `redeems_by`.
   */
  public val expiresAt: Int? = null,
  /**
   * A positive integer specifying the number of times the promotion code can be redeemed. If the coupon has specified a
   * `max_redemptions`, then this value cannot be greater than the coupon's `max_redemptions`.
   */
  public val maxRedemptions: Int? = null,
  metadata: Map<String, String>? = null,
  /**
   * Settings that restrict the redemption of the promotion code.
   */
  public val restrictions: InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc? = null,
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
    private var promotionValue: InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4? = null

    public var promotion: InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4
      get() = requireNotNull(promotionValue) { "promotion is required" }
      set(`value`) {
        promotionValue = value
      }

    /**
     * Whether the promotion code is currently active.
     */
    public var active: Boolean? = null

    /**
     * The customer-facing code. Regardless of case, this code must be unique across all active promotion codes for a
     * specific customer. Valid characters are lower case letters (a-z), upper case letters (A-Z), digits (0-9), and
     * dashes (-).
     *
     * If left blank, we will generate one automatically.
     */
    public var code: String? = null

    /**
     * The customer who can use this promotion code. If not set, all customers can use the promotion code.
     */
    public var customer: String? = null

    /**
     * The account representing the customer who can use this promotion code. If not set, all customers can use the
     * promotion code.
     */
    public var customerAccount: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The timestamp at which this promotion code will expire. If the coupon has specified a `redeems_by`, then this
     * value cannot be after the coupon's `redeems_by`.
     */
    public var expiresAt: Int? = null

    /**
     * A positive integer specifying the number of times the promotion code can be redeemed. If the coupon has specified
     * a `max_redemptions`, then this value cannot be greater than the coupon's `max_redemptions`.
     */
    public var maxRedemptions: Int? = null

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
     * Settings that restrict the redemption of the promotion code.
     */
    public var restrictions: InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc? = null

    public fun build(): InlineV1PromotionCodesPostRequestFormXb2d1736a {
      check(promotionValue != null) { "promotion is required" }
      return InlineV1PromotionCodesPostRequestFormXb2d1736a(
        promotion = promotion,
        active = active,
        code = code,
        customer = customer,
        customerAccount = customerAccount,
        expand = expand,
        expiresAt = expiresAt,
        maxRedemptions = maxRedemptions,
        metadata = metadata,
        restrictions = restrictions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormXb2d1736a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormXb2d1736a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormXb2d1736a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PromotionCodesPostRequestFormXb2d1736a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormXb2d1736a must be a JSON object")
      val promotion = json.decodeRequired<InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4>(rawObject, "promotion")
      return InlineV1PromotionCodesPostRequestFormXb2d1736a(
        promotion = promotion,
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        code = rawObject["code"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxRedemptions = rawObject["max_redemptions"]?.let { json.decodeFromJsonElement<Int>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormXb2d1736a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PromotionCodesPostRequestFormXb2d1736a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("promotion", json.encodeToJsonElement(value.promotion))
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.code?.let { put("code", it) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.maxRedemptions?.let { put("max_redemptions", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PromotionCodesPostRequestFormXb2d1736a(block: InlineV1PromotionCodesPostRequestFormXb2d1736a.Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormXb2d1736a = InlineV1PromotionCodesPostRequestFormXb2d1736a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormXb2d1736a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

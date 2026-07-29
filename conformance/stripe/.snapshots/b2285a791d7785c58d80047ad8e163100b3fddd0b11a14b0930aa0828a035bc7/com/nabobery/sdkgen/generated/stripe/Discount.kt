package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
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

@Serializable
public data class DiscountView(
  @SerialName("checkout_session")
  public val checkoutSession: String? = null,
  public val customer: InlineDiscountCustomerX0a3ac123? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  public val end: Int? = null,
  public val id: String,
  public val invoice: String? = null,
  @SerialName("invoice_item")
  public val invoiceItem: String? = null,
  @SerialName("object")
  public val objectValue: InlineDiscountObjectValueX4e9ee181,
  @SerialName("promotion_code")
  public val promotionCode: InlineDiscountPromotionCodeX7807fc74? = null,
  public val source: DiscountSource,
  public val start: Int,
  public val subscription: String? = null,
  @SerialName("subscription_item")
  public val subscriptionItem: String? = null,
)

/**
 * A discount represents the actual application of a [coupon](https://api.stripe.com#coupons) or [promotion
 * code](https://api.stripe.com#promotion_codes).
 * It contains information about when the discount began, when it will end, and what it is applied to.
 *
 * Related guide: [Applying discounts to subscriptions](https://docs.stripe.com/billing/subscriptions/discounts)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/discount
 */
@Serializable(with = Discount.Serializer::class)
public class Discount(
  /**
   * The ID of the discount object. Discounts can't be fetched by ID. Use `expand[]=discounts` in API calls to expand
   * discount IDs in an array.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineDiscountObjectValueX4e9ee181,
  public val source: DiscountSource,
  /**
   * Date that the coupon was applied.
   */
  public val start: Int,
  /**
   * The Checkout session that this coupon is applied to, if it is applied to a particular session in payment mode. Not
   * present for subscription mode.
   */
  public val checkoutSession: String? = null,
  /**
   * The ID of the customer associated with this discount.
   */
  public val customer: InlineDiscountCustomerX0a3ac123? = null,
  /**
   * The ID of the account representing the customer associated with this discount.
   */
  public val customerAccount: String? = null,
  /**
   * If the coupon has a duration of `repeating`, the date that this discount will end. If the coupon has a duration of
   * `once` or `forever`, this attribute will be null.
   */
  public val end: Int? = null,
  /**
   * The invoice that the discount's coupon was applied to, if it was applied directly to a particular invoice.
   */
  public val invoice: String? = null,
  /**
   * The invoice item `id` (or invoice line item `id` for invoice line items of type='subscription') that the discount's
   * coupon was applied to, if it was applied directly to a particular invoice item or invoice line item.
   */
  public val invoiceItem: String? = null,
  /**
   * The promotion code applied to create this discount.
   */
  public val promotionCode: InlineDiscountPromotionCodeX7807fc74? = null,
  /**
   * The subscription that this coupon is applied to, if it is applied to a particular subscription.
   */
  public val subscription: String? = null,
  /**
   * The subscription item that this coupon is applied to, if it is applied to a particular subscription item.
   */
  public val subscriptionItem: String? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineDiscountObjectValueX4e9ee181? = null

    public var objectValue: InlineDiscountObjectValueX4e9ee181
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var sourceValue: DiscountSource? = null

    public var source: DiscountSource
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var startValue: Int? = null

    public var start: Int
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    /**
     * The Checkout session that this coupon is applied to, if it is applied to a particular session in payment mode.
     * Not present for subscription mode.
     */
    public var checkoutSession: String? = null

    /**
     * The ID of the customer associated with this discount.
     */
    public var customer: InlineDiscountCustomerX0a3ac123? = null

    /**
     * The ID of the account representing the customer associated with this discount.
     */
    public var customerAccount: String? = null

    /**
     * If the coupon has a duration of `repeating`, the date that this discount will end. If the coupon has a duration
     * of `once` or `forever`, this attribute will be null.
     */
    public var end: Int? = null

    /**
     * The invoice that the discount's coupon was applied to, if it was applied directly to a particular invoice.
     */
    public var invoice: String? = null

    /**
     * The invoice item `id` (or invoice line item `id` for invoice line items of type='subscription') that the
     * discount's coupon was applied to, if it was applied directly to a particular invoice item or invoice line item.
     */
    public var invoiceItem: String? = null

    /**
     * The promotion code applied to create this discount.
     */
    public var promotionCode: InlineDiscountPromotionCodeX7807fc74? = null

    /**
     * The subscription that this coupon is applied to, if it is applied to a particular subscription.
     */
    public var subscription: String? = null

    /**
     * The subscription item that this coupon is applied to, if it is applied to a particular subscription item.
     */
    public var subscriptionItem: String? = null

    public fun build(): Discount {
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(sourceValue != null) { "source is required" }
      check(startValue != null) { "start is required" }
      return Discount(
        id = id,
        objectValue = objectValue,
        source = source,
        start = start,
        checkoutSession = checkoutSession,
        customer = customer,
        customerAccount = customerAccount,
        end = end,
        invoice = invoice,
        invoiceItem = invoiceItem,
        promotionCode = promotionCode,
        subscription = subscription,
        subscriptionItem = subscriptionItem,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Discount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Discount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Discount {
      val jsonDecoder = decoder.requireJsonDecoder("Discount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Discount must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineDiscountObjectValueX4e9ee181>(rawObject, "object")
      val source = json.decodeRequired<DiscountSource>(rawObject, "source")
      val start = json.decodeRequired<Int>(rawObject, "start")
      return Discount(
        id = id,
        objectValue = objectValue,
        source = source,
        start = start,
        checkoutSession = rawObject["checkout_session"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDiscountCustomerX0a3ac123?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        end = rawObject["end"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        invoice = rawObject["invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoiceItem = rawObject["invoice_item"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        promotionCode = rawObject["promotion_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineDiscountPromotionCodeX7807fc74?>(element) },
        subscription = rawObject["subscription"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        subscriptionItem = rawObject["subscription_item"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Discount) {
      val jsonEncoder = encoder.requireJsonEncoder("Discount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("source", json.encodeToJsonElement(value.source))
        put("start", json.encodeToJsonElement(value.start))
        value.checkoutSession?.let { put("checkout_session", it) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.end?.let { put("end", json.encodeToJsonElement(it)) }
        value.invoice?.let { put("invoice", it) }
        value.invoiceItem?.let { put("invoice_item", it) }
        value.promotionCode?.let { put("promotion_code", json.encodeToJsonElement(it)) }
        value.subscription?.let { put("subscription", it) }
        value.subscriptionItem?.let { put("subscription_item", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun discount(block: Discount.Builder.() -> Unit): Discount = Discount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Discount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

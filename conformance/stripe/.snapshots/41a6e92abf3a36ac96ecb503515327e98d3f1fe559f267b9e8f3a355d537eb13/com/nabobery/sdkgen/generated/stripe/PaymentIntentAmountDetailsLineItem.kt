package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_amount_details_line_item
 */
@Serializable(with = PaymentIntentAmountDetailsLineItem.Serializer::class)
public class PaymentIntentAmountDetailsLineItem(
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062,
  /**
   * The product name of the line item. Required for L3 rates. At most 1024 characters long.
   *
   * For Cards, this field is truncated to 26 alphanumeric characters before being sent to the card networks. For
   * PayPal, this field is truncated to 127 characters.
   */
  public val productName: String,
  /**
   * The quantity of items. Required for L3 rates. An integer greater than 0.
   */
  public val quantity: Int,
  /**
   * The unit cost of the line item represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). Required for L3 rates. An integer greater than or equal to
   * 0.
   */
  public val unitCost: Int,
  /**
   * The discount applied on this line item represented in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). An integer greater than 0.
   *
   * This field is mutually exclusive with the `amount_details[discount_amount]` field.
   */
  public val discountAmount: Int? = null,
  /**
   * Payment method-specific information for line items.
   */
  public val paymentMethodOptions:
      InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed? = null,
  /**
   * The product code of the line item, such as an SKU. Required for L3 rates. At most 12 characters long.
   */
  public val productCode: String? = null,
  /**
   * Contains information about the tax on the item.
   */
  public val tax: InlinePaymentIntentAmountDetailsLineItemTaxX754180e6? = null,
  /**
   * A unit of measure for the line item, such as gallons, feet, meters, etc. Required for L3 rates. At most 12
   * alphanumeric characters long.
   */
  public val unitOfMeasure: String? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062? =
        null

    public var objectValue: InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var productNameValue: String? = null

    public var productName: String
      get() = requireNotNull(productNameValue) { "productName is required" }
      set(`value`) {
        productNameValue = value
      }

    private var quantityValue: Int? = null

    public var quantity: Int
      get() = requireNotNull(quantityValue) { "quantity is required" }
      set(`value`) {
        quantityValue = value
      }

    private var unitCostValue: Int? = null

    public var unitCost: Int
      get() = requireNotNull(unitCostValue) { "unitCost is required" }
      set(`value`) {
        unitCostValue = value
      }

    /**
     * The discount applied on this line item represented in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal). An integer greater than 0.
     *
     * This field is mutually exclusive with the `amount_details[discount_amount]` field.
     */
    public var discountAmount: Int? = null

    /**
     * Payment method-specific information for line items.
     */
    public var paymentMethodOptions:
        InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed? = null

    /**
     * The product code of the line item, such as an SKU. Required for L3 rates. At most 12 characters long.
     */
    public var productCode: String? = null

    /**
     * Contains information about the tax on the item.
     */
    public var tax: InlinePaymentIntentAmountDetailsLineItemTaxX754180e6? = null

    /**
     * A unit of measure for the line item, such as gallons, feet, meters, etc. Required for L3 rates. At most 12
     * alphanumeric characters long.
     */
    public var unitOfMeasure: String? = null

    public fun build(): PaymentIntentAmountDetailsLineItem {
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(productNameValue != null) { "productName is required" }
      check(quantityValue != null) { "quantity is required" }
      check(unitCostValue != null) { "unitCost is required" }
      return PaymentIntentAmountDetailsLineItem(
        id = id,
        objectValue = objectValue,
        productName = productName,
        quantity = quantity,
        unitCost = unitCost,
        discountAmount = discountAmount,
        paymentMethodOptions = paymentMethodOptions,
        productCode = productCode,
        tax = tax,
        unitOfMeasure = unitOfMeasure,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentAmountDetailsLineItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentAmountDetailsLineItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentAmountDetailsLineItem {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentAmountDetailsLineItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentAmountDetailsLineItem must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlinePaymentIntentAmountDetailsLineItemObjectValueX5064f062>(rawObject, "object")
      val productName = json.decodeRequired<String>(rawObject, "product_name")
      val quantity = json.decodeRequired<Int>(rawObject, "quantity")
      val unitCost = json.decodeRequired<Int>(rawObject, "unit_cost")
      return PaymentIntentAmountDetailsLineItem(
        id = id,
        objectValue = objectValue,
        productName = productName,
        quantity = quantity,
        unitCost = unitCost,
        discountAmount = rawObject["discount_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentAmountDetailsLineItemPaymentMethodOptionsX51c30aed?>(element) },
        productCode = rawObject["product_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        tax = rawObject["tax"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentIntentAmountDetailsLineItemTaxX754180e6?>(element) },
        unitOfMeasure = rawObject["unit_of_measure"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentAmountDetailsLineItem) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentAmountDetailsLineItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("product_name", value.productName)
        put("quantity", json.encodeToJsonElement(value.quantity))
        put("unit_cost", json.encodeToJsonElement(value.unitCost))
        value.discountAmount?.let { put("discount_amount", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.productCode?.let { put("product_code", it) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
        value.unitOfMeasure?.let { put("unit_of_measure", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentAmountDetailsLineItem(block: PaymentIntentAmountDetailsLineItem.Builder.() -> Unit): PaymentIntentAmountDetailsLineItem = PaymentIntentAmountDetailsLineItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentAmountDetailsLineItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

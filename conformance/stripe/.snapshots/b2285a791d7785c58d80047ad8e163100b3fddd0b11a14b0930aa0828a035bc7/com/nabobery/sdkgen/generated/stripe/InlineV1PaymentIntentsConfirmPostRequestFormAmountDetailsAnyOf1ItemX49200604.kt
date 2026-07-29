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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604(
  public val productName: String,
  public val quantity: Int,
  public val unitCost: Int,
  public val discountAmount: Int? = null,
  public val paymentMethodOptions:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3? = null,
  public val productCode: String? = null,
  public val tax:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxXc5277cd6? = null,
  public val unitOfMeasure: String? = null,
) {
  public class Builder {
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

    public var discountAmount: Int? = null

    public var paymentMethodOptions:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3? = null

    public var productCode: String? = null

    public var tax: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxXc5277cd6? =
        null

    public var unitOfMeasure: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604 {
      check(productNameValue != null) { "productName is required" }
      check(quantityValue != null) { "quantity is required" }
      check(unitCostValue != null) { "unitCost is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604 must be a JSON object")
      val productName = json.decodeRequired<String>(rawObject, "product_name")
      val quantity = json.decodeRequired<Int>(rawObject, "quantity")
      val unitCost = json.decodeRequired<Int>(rawObject, "unit_cost")
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604(
        productName = productName,
        quantity = quantity,
        unitCost = unitCost,
        discountAmount = rawObject["discount_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3>(it) },
        productCode = rawObject["product_code"]?.let { json.decodeFromJsonElement<String>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxXc5277cd6>(it) },
        unitOfMeasure = rawObject["unit_of_measure"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604(block: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604 = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ItemX49200604 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

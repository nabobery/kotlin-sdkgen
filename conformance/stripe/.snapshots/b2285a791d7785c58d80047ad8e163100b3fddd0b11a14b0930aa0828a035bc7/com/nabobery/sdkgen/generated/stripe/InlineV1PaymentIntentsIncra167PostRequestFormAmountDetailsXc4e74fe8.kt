package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Provides industry-specific information about the amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8(
  public val discountAmount:
      InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f? = null,
  public val enforceArithmeticValidation: Boolean? = null,
  public val lineItems:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e? = null,
  public val shipping:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e? = null,
  public val tax: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f? = null,
) {
  public class Builder {
    public var discountAmount: InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f?
        = null

    public var enforceArithmeticValidation: Boolean? = null

    public var lineItems:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e? = null

    public var shipping:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e? = null

    public var tax: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f? = null

    public fun build(): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8 = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8(
      discountAmount = discountAmount,
      enforceArithmeticValidation = enforceArithmeticValidation,
      lineItems = lineItems,
      shipping = shipping,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8 must be a JSON object")
      return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8(
        discountAmount = rawObject["discount_amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f>(it) },
        enforceArithmeticValidation = rawObject["enforce_arithmetic_validation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsShippingX6706ac2e>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.discountAmount?.let { put("discount_amount", json.encodeToJsonElement(it)) }
        value.enforceArithmeticValidation?.let { put("enforce_arithmetic_validation", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8(block: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8.Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8 = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsXc4e74fe8.build(block)

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f(
  public val discountAmount:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6? = null,
  public val enforceArithmeticValidation: Boolean? = null,
  public val lineItems:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsX00138fc5? = null,
  public val shipping: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba? = null,
  public val tax: InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943? = null,
) {
  public class Builder {
    public var discountAmount:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6? = null

    public var enforceArithmeticValidation: Boolean? = null

    public var lineItems: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsX00138fc5? =
        null

    public var shipping: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba? = null

    public var tax: InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f = InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f(
      discountAmount = discountAmount,
      enforceArithmeticValidation = enforceArithmeticValidation,
      lineItems = lineItems,
      shipping = shipping,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f(
        discountAmount = rawObject["discount_amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6>(it) },
        enforceArithmeticValidation = rawObject["enforce_arithmetic_validation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsX00138fc5>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingX4a7f00ba>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsTaxXd947c943>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f")
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

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f(block: InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f = InlineV1PaymentIntentsPostRequestFormAmountDetailsX01eaef4f.build(block)

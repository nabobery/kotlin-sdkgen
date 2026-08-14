package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720(
  public val discountAmount:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d? = null,
  public val enforceArithmeticValidation: Boolean? = null,
  public val lineItems:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448? = null,
  public val shipping:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae? = null,
  public val tax: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337? = null,
) {
  public class Builder {
    public var discountAmount:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d? = null

    public var enforceArithmeticValidation: Boolean? = null

    public var lineItems:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448? = null

    public var shipping: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae?
        = null

    public var tax: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720 = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720(
      discountAmount = discountAmount,
      enforceArithmeticValidation = enforceArithmeticValidation,
      lineItems = lineItems,
      shipping = shipping,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720(
        discountAmount = rawObject["discount_amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d>(it) },
        enforceArithmeticValidation = rawObject["enforce_arithmetic_validation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingX0f2d58ae>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720")
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

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720(block: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720 = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1X4eb31720.build(block)

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382(
  public val discountAmount:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08? = null,
  public val enforceArithmeticValidation: Boolean? = null,
  public val lineItems:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a? = null,
  public val shipping:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da? = null,
  public val tax:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf? = null,
) {
  public class Builder {
    public var discountAmount:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08? = null

    public var enforceArithmeticValidation: Boolean? = null

    public var lineItems:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a? = null

    public var shipping:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da? = null

    public var tax: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf? =
        null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382 = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382(
      discountAmount = discountAmount,
      enforceArithmeticValidation = enforceArithmeticValidation,
      lineItems = lineItems,
      shipping = shipping,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382(
        discountAmount = rawObject["discount_amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08>(it) },
        enforceArithmeticValidation = rawObject["enforce_arithmetic_validation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsLineItemsXdf437b1a>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1ShippingX7eb247da>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1TaxX4a64b9bf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382(block: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382 = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1X37bf2382.build(block)

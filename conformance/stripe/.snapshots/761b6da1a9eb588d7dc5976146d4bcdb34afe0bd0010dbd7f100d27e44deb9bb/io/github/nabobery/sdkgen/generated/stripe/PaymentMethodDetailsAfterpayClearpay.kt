package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_afterpay_clearpay
 */
@Serializable(with = PaymentMethodDetailsAfterpayClearpay.Serializer::class)
public class PaymentMethodDetailsAfterpayClearpay(
  /**
   * The Afterpay order ID associated with this payment intent.
   */
  public val orderId: String? = null,
  /**
   * Order identifier shown to the merchant in Afterpay's online portal.
   */
  public val reference: String? = null,
) {
  public class Builder {
    /**
     * The Afterpay order ID associated with this payment intent.
     */
    public var orderId: String? = null

    /**
     * Order identifier shown to the merchant in Afterpay's online portal.
     */
    public var reference: String? = null

    public fun build(): PaymentMethodDetailsAfterpayClearpay = PaymentMethodDetailsAfterpayClearpay(
      orderId = orderId,
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsAfterpayClearpay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsAfterpayClearpay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsAfterpayClearpay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsAfterpayClearpay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsAfterpayClearpay must be a JSON object")
      return PaymentMethodDetailsAfterpayClearpay(
        orderId = rawObject["order_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsAfterpayClearpay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsAfterpayClearpay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.orderId?.let { put("order_id", it) }
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsAfterpayClearpay(block: PaymentMethodDetailsAfterpayClearpay.Builder.() -> Unit): PaymentMethodDetailsAfterpayClearpay = PaymentMethodDetailsAfterpayClearpay.build(block)

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_kakao_pay
 */
@Serializable(with = PaymentMethodDetailsKakaoPay.Serializer::class)
public class PaymentMethodDetailsKakaoPay(
  /**
   * A unique identifier for the buyer as determined by the local payment processor.
   */
  public val buyerId: String? = null,
  /**
   * The Kakao Pay transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * A unique identifier for the buyer as determined by the local payment processor.
     */
    public var buyerId: String? = null

    /**
     * The Kakao Pay transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsKakaoPay = PaymentMethodDetailsKakaoPay(
      buyerId = buyerId,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsKakaoPay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsKakaoPay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsKakaoPay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsKakaoPay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsKakaoPay must be a JSON object")
      return PaymentMethodDetailsKakaoPay(
        buyerId = rawObject["buyer_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsKakaoPay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsKakaoPay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerId?.let { put("buyer_id", it) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsKakaoPay(block: PaymentMethodDetailsKakaoPay.Builder.() -> Unit): PaymentMethodDetailsKakaoPay = PaymentMethodDetailsKakaoPay.build(block)

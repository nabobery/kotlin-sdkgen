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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_scalapay
 */
@Serializable(with = PaymentMethodDetailsScalapay.Serializer::class)
public class PaymentMethodDetailsScalapay(
  /**
   * The Scalapay transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * The Scalapay transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsScalapay = PaymentMethodDetailsScalapay(
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsScalapay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsScalapay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsScalapay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsScalapay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsScalapay must be a JSON object")
      return PaymentMethodDetailsScalapay(
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsScalapay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsScalapay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsScalapay(block: PaymentMethodDetailsScalapay.Builder.() -> Unit): PaymentMethodDetailsScalapay = PaymentMethodDetailsScalapay.build(block)

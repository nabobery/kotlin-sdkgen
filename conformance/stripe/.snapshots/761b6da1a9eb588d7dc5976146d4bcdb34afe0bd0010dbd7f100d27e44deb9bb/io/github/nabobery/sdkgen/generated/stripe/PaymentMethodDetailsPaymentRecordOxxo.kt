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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_oxxo
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordOxxo.Serializer::class)
public class PaymentMethodDetailsPaymentRecordOxxo(
  /**
   * OXXO reference number
   */
  public val number: String? = null,
) {
  public class Builder {
    /**
     * OXXO reference number
     */
    public var number: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordOxxo = PaymentMethodDetailsPaymentRecordOxxo(
      number = number,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordOxxo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordOxxo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordOxxo {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordOxxo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordOxxo must be a JSON object")
      return PaymentMethodDetailsPaymentRecordOxxo(
        number = rawObject["number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordOxxo) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordOxxo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.number?.let { put("number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordOxxo(block: PaymentMethodDetailsPaymentRecordOxxo.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordOxxo = PaymentMethodDetailsPaymentRecordOxxo.build(block)

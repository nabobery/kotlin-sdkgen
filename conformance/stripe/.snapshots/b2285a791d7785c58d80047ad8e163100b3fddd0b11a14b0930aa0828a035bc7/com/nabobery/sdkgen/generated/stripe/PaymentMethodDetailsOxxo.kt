package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_oxxo
 */
@Serializable(with = PaymentMethodDetailsOxxo.Serializer::class)
public class PaymentMethodDetailsOxxo(
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

    public fun build(): PaymentMethodDetailsOxxo = PaymentMethodDetailsOxxo(
      number = number,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsOxxo = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsOxxo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsOxxo {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsOxxo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsOxxo must be a JSON object")
      return PaymentMethodDetailsOxxo(
        number = rawObject["number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsOxxo) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsOxxo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.number?.let { put("number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsOxxo(block: PaymentMethodDetailsOxxo.Builder.() -> Unit): PaymentMethodDetailsOxxo = PaymentMethodDetailsOxxo.build(block)

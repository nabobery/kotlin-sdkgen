package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_p24
 */
@Serializable(with = PaymentMethodP24.Serializer::class)
public class PaymentMethodP24(
  /**
   * The customer's bank, if provided.
   */
  public val bank: InlinePaymentMethodP24BankX61d2f5c0? = null,
) {
  public class Builder {
    /**
     * The customer's bank, if provided.
     */
    public var bank: InlinePaymentMethodP24BankX61d2f5c0? = null

    public fun build(): PaymentMethodP24 = PaymentMethodP24(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodP24 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodP24> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodP24 {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodP24")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodP24 must be a JSON object")
      return PaymentMethodP24(
        bank = rawObject["bank"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodP24BankX61d2f5c0?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodP24) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodP24")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodP24(block: PaymentMethodP24.Builder.() -> Unit): PaymentMethodP24 = PaymentMethodP24.build(block)

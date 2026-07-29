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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_konbini
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordKonbini.Serializer::class)
public class PaymentMethodDetailsPaymentRecordKonbini(
  /**
   * If the payment succeeded, this contains the details of the convenience store where the payment was completed.
   */
  public val store: InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b? = null,
) {
  public class Builder {
    /**
     * If the payment succeeded, this contains the details of the convenience store where the payment was completed.
     */
    public var store: InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b? = null

    public fun build(): PaymentMethodDetailsPaymentRecordKonbini = PaymentMethodDetailsPaymentRecordKonbini(
      store = store,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordKonbini = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordKonbini> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordKonbini {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordKonbini")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordKonbini must be a JSON object")
      return PaymentMethodDetailsPaymentRecordKonbini(
        store = rawObject["store"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordKonbini) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordKonbini")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.store?.let { put("store", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordKonbini(block: PaymentMethodDetailsPaymentRecordKonbini.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordKonbini = PaymentMethodDetailsPaymentRecordKonbini.build(block)

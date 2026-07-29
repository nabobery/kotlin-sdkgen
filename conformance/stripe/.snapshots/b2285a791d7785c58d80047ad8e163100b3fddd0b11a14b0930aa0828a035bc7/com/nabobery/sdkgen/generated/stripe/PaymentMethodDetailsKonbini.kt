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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_konbini
 */
@Serializable(with = PaymentMethodDetailsKonbini.Serializer::class)
public class PaymentMethodDetailsKonbini(
  /**
   * If the payment succeeded, this contains the details of the convenience store where the payment was completed.
   */
  public val store: InlinePaymentMethodDetailsKonbiniStoreX638fc021? = null,
) {
  public class Builder {
    /**
     * If the payment succeeded, this contains the details of the convenience store where the payment was completed.
     */
    public var store: InlinePaymentMethodDetailsKonbiniStoreX638fc021? = null

    public fun build(): PaymentMethodDetailsKonbini = PaymentMethodDetailsKonbini(
      store = store,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsKonbini = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsKonbini> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsKonbini {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsKonbini")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsKonbini must be a JSON object")
      return PaymentMethodDetailsKonbini(
        store = rawObject["store"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsKonbiniStoreX638fc021?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsKonbini) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsKonbini")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.store?.let { put("store", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsKonbini(block: PaymentMethodDetailsKonbini.Builder.() -> Unit): PaymentMethodDetailsKonbini = PaymentMethodDetailsKonbini.build(block)

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_blik
 */
@Serializable(with = PaymentMethodDetailsBlik.Serializer::class)
public class PaymentMethodDetailsBlik(
  /**
   * A unique and immutable identifier assigned by BLIK to every buyer.
   */
  public val buyerId: String? = null,
) {
  public class Builder {
    /**
     * A unique and immutable identifier assigned by BLIK to every buyer.
     */
    public var buyerId: String? = null

    public fun build(): PaymentMethodDetailsBlik = PaymentMethodDetailsBlik(
      buyerId = buyerId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsBlik = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsBlik> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsBlik {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsBlik")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsBlik must be a JSON object")
      return PaymentMethodDetailsBlik(
        buyerId = rawObject["buyer_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsBlik) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsBlik")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerId?.let { put("buyer_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsBlik(block: PaymentMethodDetailsBlik.Builder.() -> Unit): PaymentMethodDetailsBlik = PaymentMethodDetailsBlik.build(block)

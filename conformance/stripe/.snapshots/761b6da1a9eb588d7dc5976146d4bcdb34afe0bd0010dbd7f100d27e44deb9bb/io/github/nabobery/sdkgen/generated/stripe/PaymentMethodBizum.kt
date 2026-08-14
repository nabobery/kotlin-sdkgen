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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_bizum
 */
@Serializable(with = PaymentMethodBizum.Serializer::class)
public class PaymentMethodBizum(
  /**
   * A unique identifier for the buyer as determined by the local payment processor.
   */
  public val buyerId: String? = null,
) {
  public class Builder {
    /**
     * A unique identifier for the buyer as determined by the local payment processor.
     */
    public var buyerId: String? = null

    public fun build(): PaymentMethodBizum = PaymentMethodBizum(
      buyerId = buyerId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodBizum = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodBizum> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodBizum {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodBizum")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodBizum must be a JSON object")
      return PaymentMethodBizum(
        buyerId = rawObject["buyer_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodBizum) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodBizum")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerId?.let { put("buyer_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodBizum(block: PaymentMethodBizum.Builder.() -> Unit): PaymentMethodBizum = PaymentMethodBizum.build(block)

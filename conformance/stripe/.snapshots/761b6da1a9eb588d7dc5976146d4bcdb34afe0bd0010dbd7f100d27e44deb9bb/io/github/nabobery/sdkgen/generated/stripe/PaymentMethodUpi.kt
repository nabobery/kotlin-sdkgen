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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_upi
 */
@Serializable(with = PaymentMethodUpi.Serializer::class)
public class PaymentMethodUpi(
  /**
   * Customer's unique Virtual Payment Address
   */
  public val vpa: String? = null,
) {
  public class Builder {
    /**
     * Customer's unique Virtual Payment Address
     */
    public var vpa: String? = null

    public fun build(): PaymentMethodUpi = PaymentMethodUpi(
      vpa = vpa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodUpi = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodUpi> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodUpi {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodUpi")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodUpi must be a JSON object")
      return PaymentMethodUpi(
        vpa = rawObject["vpa"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodUpi) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodUpi")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.vpa?.let { put("vpa", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodUpi(block: PaymentMethodUpi.Builder.() -> Unit): PaymentMethodUpi = PaymentMethodUpi.build(block)

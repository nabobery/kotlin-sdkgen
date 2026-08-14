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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_sofort
 */
@Serializable(with = PaymentMethodSofort.Serializer::class)
public class PaymentMethodSofort(
  /**
   * Two-letter ISO code representing the country the bank account is located in.
   */
  public val country: String? = null,
) {
  public class Builder {
    /**
     * Two-letter ISO code representing the country the bank account is located in.
     */
    public var country: String? = null

    public fun build(): PaymentMethodSofort = PaymentMethodSofort(
      country = country,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodSofort = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodSofort> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodSofort {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodSofort")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodSofort must be a JSON object")
      return PaymentMethodSofort(
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodSofort) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodSofort")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.country?.let { put("country", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodSofort(block: PaymentMethodSofort.Builder.() -> Unit): PaymentMethodSofort = PaymentMethodSofort.build(block)

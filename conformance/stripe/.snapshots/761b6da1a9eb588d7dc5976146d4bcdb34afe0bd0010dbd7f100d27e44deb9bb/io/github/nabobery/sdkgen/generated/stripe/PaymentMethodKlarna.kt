package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_klarna
 */
@Serializable(with = PaymentMethodKlarna.Serializer::class)
public class PaymentMethodKlarna(
  /**
   * The customer's date of birth, if provided.
   */
  public val dob: InlinePaymentMethodKlarnaDobX06112cf7? = null,
) {
  public class Builder {
    /**
     * The customer's date of birth, if provided.
     */
    public var dob: InlinePaymentMethodKlarnaDobX06112cf7? = null

    public fun build(): PaymentMethodKlarna = PaymentMethodKlarna(
      dob = dob,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodKlarna = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodKlarna> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodKlarna {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodKlarna")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodKlarna must be a JSON object")
      return PaymentMethodKlarna(
        dob = rawObject["dob"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodKlarnaDobX06112cf7?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodKlarna) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodKlarna")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodKlarna(block: PaymentMethodKlarna.Builder.() -> Unit): PaymentMethodKlarna = PaymentMethodKlarna.build(block)

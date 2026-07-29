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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_link
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordLink.Serializer::class)
public class PaymentMethodDetailsPaymentRecordLink(
  /**
   * Two-letter ISO code representing the funding source country beneath the Link payment. You could use this attribute
   * to get a sense of international fees.
   */
  public val country: String? = null,
) {
  public class Builder {
    /**
     * Two-letter ISO code representing the funding source country beneath the Link payment. You could use this
     * attribute to get a sense of international fees.
     */
    public var country: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordLink = PaymentMethodDetailsPaymentRecordLink(
      country = country,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordLink = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordLink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordLink {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordLink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordLink must be a JSON object")
      return PaymentMethodDetailsPaymentRecordLink(
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordLink) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordLink")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.country?.let { put("country", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordLink(block: PaymentMethodDetailsPaymentRecordLink.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordLink = PaymentMethodDetailsPaymentRecordLink.build(block)

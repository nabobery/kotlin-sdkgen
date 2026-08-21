package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_display_oxxo_details
 */
@Serializable(with = PaymentIntentNextActionDisplayOxxoDetails.Serializer::class)
public class PaymentIntentNextActionDisplayOxxoDetails(
  /**
   * The timestamp after which the OXXO voucher expires.
   */
  public val expiresAfter: Int? = null,
  /**
   * The URL for the hosted OXXO voucher page, which allows customers to view and print an OXXO voucher.
   */
  public val hostedVoucherUrl: String? = null,
  /**
   * OXXO reference number.
   */
  public val number: String? = null,
) {
  public class Builder {
    /**
     * The timestamp after which the OXXO voucher expires.
     */
    public var expiresAfter: Int? = null

    /**
     * The URL for the hosted OXXO voucher page, which allows customers to view and print an OXXO voucher.
     */
    public var hostedVoucherUrl: String? = null

    /**
     * OXXO reference number.
     */
    public var number: String? = null

    public fun build(): PaymentIntentNextActionDisplayOxxoDetails = PaymentIntentNextActionDisplayOxxoDetails(
      expiresAfter = expiresAfter,
      hostedVoucherUrl = hostedVoucherUrl,
      number = number,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionDisplayOxxoDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionDisplayOxxoDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionDisplayOxxoDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionDisplayOxxoDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionDisplayOxxoDetails must be a JSON object")
      return PaymentIntentNextActionDisplayOxxoDetails(
        expiresAfter = rawObject["expires_after"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        hostedVoucherUrl = rawObject["hosted_voucher_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        number = rawObject["number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionDisplayOxxoDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionDisplayOxxoDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expiresAfter?.let { put("expires_after", json.encodeToJsonElement(it)) }
        value.hostedVoucherUrl?.let { put("hosted_voucher_url", it) }
        value.number?.let { put("number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionDisplayOxxoDetails(block: PaymentIntentNextActionDisplayOxxoDetails.Builder.() -> Unit): PaymentIntentNextActionDisplayOxxoDetails = PaymentIntentNextActionDisplayOxxoDetails.build(block)

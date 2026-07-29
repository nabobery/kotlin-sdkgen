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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_display_multibanco_details
 */
@Serializable(with = PaymentIntentNextActionDisplayMultibancoDetails.Serializer::class)
public class PaymentIntentNextActionDisplayMultibancoDetails(
  /**
   * Entity number associated with this Multibanco payment.
   */
  public val entity: String? = null,
  /**
   * The timestamp at which the Multibanco voucher expires.
   */
  public val expiresAt: Int? = null,
  /**
   * The URL for the hosted Multibanco voucher page, which allows customers to view a Multibanco voucher.
   */
  public val hostedVoucherUrl: String? = null,
  /**
   * Reference number associated with this Multibanco payment.
   */
  public val reference: String? = null,
) {
  public class Builder {
    /**
     * Entity number associated with this Multibanco payment.
     */
    public var entity: String? = null

    /**
     * The timestamp at which the Multibanco voucher expires.
     */
    public var expiresAt: Int? = null

    /**
     * The URL for the hosted Multibanco voucher page, which allows customers to view a Multibanco voucher.
     */
    public var hostedVoucherUrl: String? = null

    /**
     * Reference number associated with this Multibanco payment.
     */
    public var reference: String? = null

    public fun build(): PaymentIntentNextActionDisplayMultibancoDetails = PaymentIntentNextActionDisplayMultibancoDetails(
      entity = entity,
      expiresAt = expiresAt,
      hostedVoucherUrl = hostedVoucherUrl,
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionDisplayMultibancoDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentIntentNextActionDisplayMultibancoDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionDisplayMultibancoDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionDisplayMultibancoDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionDisplayMultibancoDetails must be a JSON object")
      return PaymentIntentNextActionDisplayMultibancoDetails(
        entity = rawObject["entity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        hostedVoucherUrl = rawObject["hosted_voucher_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionDisplayMultibancoDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionDisplayMultibancoDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.entity?.let { put("entity", it) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.hostedVoucherUrl?.let { put("hosted_voucher_url", it) }
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionDisplayMultibancoDetails(block: PaymentIntentNextActionDisplayMultibancoDetails.Builder.() -> Unit): PaymentIntentNextActionDisplayMultibancoDetails = PaymentIntentNextActionDisplayMultibancoDetails.build(block)

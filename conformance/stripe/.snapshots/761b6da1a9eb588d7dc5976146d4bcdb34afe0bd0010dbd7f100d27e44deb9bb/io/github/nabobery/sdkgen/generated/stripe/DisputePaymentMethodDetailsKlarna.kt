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
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details_klarna
 */
@Serializable(with = DisputePaymentMethodDetailsKlarna.Serializer::class)
public class DisputePaymentMethodDetailsKlarna(
  /**
   * Chargeback loss reason mapped by Stripe from Klarna's chargeback loss reason
   */
  public val chargebackLossReasonCode: String? = null,
  /**
   * The reason for the dispute as defined by Klarna
   */
  public val reasonCode: String? = null,
) {
  public class Builder {
    /**
     * Chargeback loss reason mapped by Stripe from Klarna's chargeback loss reason
     */
    public var chargebackLossReasonCode: String? = null

    /**
     * The reason for the dispute as defined by Klarna
     */
    public var reasonCode: String? = null

    public fun build(): DisputePaymentMethodDetailsKlarna = DisputePaymentMethodDetailsKlarna(
      chargebackLossReasonCode = chargebackLossReasonCode,
      reasonCode = reasonCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputePaymentMethodDetailsKlarna = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputePaymentMethodDetailsKlarna> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputePaymentMethodDetailsKlarna {
      val jsonDecoder = decoder.requireJsonDecoder("DisputePaymentMethodDetailsKlarna")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputePaymentMethodDetailsKlarna must be a JSON object")
      return DisputePaymentMethodDetailsKlarna(
        chargebackLossReasonCode = rawObject["chargeback_loss_reason_code"]?.let { json.decodeFromJsonElement<String>(it) },
        reasonCode = rawObject["reason_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputePaymentMethodDetailsKlarna) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputePaymentMethodDetailsKlarna")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.chargebackLossReasonCode?.let { put("chargeback_loss_reason_code", it) }
        value.reasonCode?.let { put("reason_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputePaymentMethodDetailsKlarna(block: DisputePaymentMethodDetailsKlarna.Builder.() -> Unit): DisputePaymentMethodDetailsKlarna = DisputePaymentMethodDetailsKlarna.build(block)

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
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details_paypal
 */
@Serializable(with = DisputePaymentMethodDetailsPaypal.Serializer::class)
public class DisputePaymentMethodDetailsPaypal(
  /**
   * The ID of the dispute in PayPal.
   */
  public val caseId: String? = null,
  /**
   * The reason for the dispute as defined by PayPal
   */
  public val reasonCode: String? = null,
) {
  public class Builder {
    /**
     * The ID of the dispute in PayPal.
     */
    public var caseId: String? = null

    /**
     * The reason for the dispute as defined by PayPal
     */
    public var reasonCode: String? = null

    public fun build(): DisputePaymentMethodDetailsPaypal = DisputePaymentMethodDetailsPaypal(
      caseId = caseId,
      reasonCode = reasonCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DisputePaymentMethodDetailsPaypal = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DisputePaymentMethodDetailsPaypal> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DisputePaymentMethodDetailsPaypal {
      val jsonDecoder = decoder.requireJsonDecoder("DisputePaymentMethodDetailsPaypal")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DisputePaymentMethodDetailsPaypal must be a JSON object")
      return DisputePaymentMethodDetailsPaypal(
        caseId = rawObject["case_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reasonCode = rawObject["reason_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DisputePaymentMethodDetailsPaypal) {
      val jsonEncoder = encoder.requireJsonEncoder("DisputePaymentMethodDetailsPaypal")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.caseId?.let { put("case_id", it) }
        value.reasonCode?.let { put("reason_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun disputePaymentMethodDetailsPaypal(block: DisputePaymentMethodDetailsPaypal.Builder.() -> Unit): DisputePaymentMethodDetailsPaypal = DisputePaymentMethodDetailsPaypal.build(block)

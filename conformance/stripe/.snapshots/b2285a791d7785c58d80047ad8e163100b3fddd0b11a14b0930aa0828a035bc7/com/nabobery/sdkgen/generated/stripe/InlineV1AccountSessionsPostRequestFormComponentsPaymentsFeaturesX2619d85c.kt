package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payments/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payments/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c(
  public val capturePayments: Boolean? = null,
  public val destinationOnBehalfOfChargeManagement: Boolean? = null,
  public val disputeManagement: Boolean? = null,
  public val refundManagement: Boolean? = null,
) {
  public class Builder {
    public var capturePayments: Boolean? = null

    public var destinationOnBehalfOfChargeManagement: Boolean? = null

    public var disputeManagement: Boolean? = null

    public var refundManagement: Boolean? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c = InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c(
      capturePayments = capturePayments,
      destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement,
      disputeManagement = disputeManagement,
      refundManagement = refundManagement,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c must be a JSON object")
      return InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c(
        capturePayments = rawObject["capture_payments"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        destinationOnBehalfOfChargeManagement = rawObject["destination_on_behalf_of_charge_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        disputeManagement = rawObject["dispute_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        refundManagement = rawObject["refund_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.capturePayments?.let { put("capture_payments", json.encodeToJsonElement(it)) }
        value.destinationOnBehalfOfChargeManagement?.let { put("destination_on_behalf_of_charge_management", json.encodeToJsonElement(it)) }
        value.disputeManagement?.let { put("dispute_management", json.encodeToJsonElement(it)) }
        value.refundManagement?.let { put("refund_management", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c(block: InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c = InlineV1AccountSessionsPostRequestFormComponentsPaymentsFeaturesX2619d85c.build(block)

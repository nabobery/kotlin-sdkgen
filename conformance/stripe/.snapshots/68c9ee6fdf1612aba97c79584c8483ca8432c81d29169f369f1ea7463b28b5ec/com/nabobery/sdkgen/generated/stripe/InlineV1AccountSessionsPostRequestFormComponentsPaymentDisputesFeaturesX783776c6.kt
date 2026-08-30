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
 * d/schema/properties/components/properties/payment_disputes/properties/features.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payment_disputes/properties/features
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6(
  public val destinationOnBehalfOfChargeManagement: Boolean? = null,
  public val disputeManagement: Boolean? = null,
  public val refundManagement: Boolean? = null,
) {
  public class Builder {
    public var destinationOnBehalfOfChargeManagement: Boolean? = null

    public var disputeManagement: Boolean? = null

    public var refundManagement: Boolean? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6 = InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6(
      destinationOnBehalfOfChargeManagement = destinationOnBehalfOfChargeManagement,
      disputeManagement = disputeManagement,
      refundManagement = refundManagement,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6 must be a JSON object")
      return InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6(
        destinationOnBehalfOfChargeManagement = rawObject["destination_on_behalf_of_charge_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        disputeManagement = rawObject["dispute_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        refundManagement = rawObject["refund_management"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.destinationOnBehalfOfChargeManagement?.let { put("destination_on_behalf_of_charge_management", json.encodeToJsonElement(it)) }
        value.disputeManagement?.let { put("dispute_management", json.encodeToJsonElement(it)) }
        value.refundManagement?.let { put("refund_management", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6(block: InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6 = InlineV1AccountSessionsPostRequestFormComponentsPaymentDisputesFeaturesX783776c6.build(block)

package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/card
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a.Serializer::class)
public class InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a(
  public val customerPresence:
      InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8? = null,
  public val paymentType:
      InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3? = null,
) {
  public class Builder {
    public var customerPresence:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8? = null

    public var paymentType:
        InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3? = null

    public fun build(): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a = InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a(
      customerPresence = customerPresence,
      paymentType = paymentType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a must be a JSON object")
      return InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a(
        customerPresence = rawObject["customer_presence"]?.let { json.decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8>(it) },
        paymentType = rawObject["payment_type"]?.let { json.decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsPaymentTypeX2916c7d3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerPresence?.let { put("customer_presence", json.encodeToJsonElement(it)) }
        value.paymentType?.let { put("payment_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a(block: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a.Builder.() -> Unit): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a = InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentDetailsCardX4245796a.build(block)

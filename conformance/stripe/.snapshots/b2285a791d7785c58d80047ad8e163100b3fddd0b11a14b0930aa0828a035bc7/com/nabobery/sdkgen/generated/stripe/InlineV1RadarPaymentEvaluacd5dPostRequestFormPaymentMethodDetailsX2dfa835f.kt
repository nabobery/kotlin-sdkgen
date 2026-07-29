package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/payment_method_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/payment_method_details
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f.Serializer::class)
public class InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f(
  public val paymentMethod: String,
  public val billingDetails:
      InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e? = null,
) {
  public class Builder {
    private var paymentMethodValue: String? = null

    public var paymentMethod: String
      get() = requireNotNull(paymentMethodValue) { "paymentMethod is required" }
      set(`value`) {
        paymentMethodValue = value
      }

    public var billingDetails: InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e?
        = null

    public fun build(): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f {
      check(paymentMethodValue != null) { "paymentMethod is required" }
      return InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f(
        paymentMethod = paymentMethod,
        billingDetails = billingDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f must be a JSON object")
      val paymentMethod = json.decodeRequired<String>(rawObject, "payment_method")
      return InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f(
        paymentMethod = paymentMethod,
        billingDetails = rawObject["billing_details"]?.let { json.decodeFromJsonElement<InlineV1RadarPaymentEvaluacd5dPostRequestFormBillingDetailsX8170e78e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_method", value.paymentMethod)
        value.billingDetails?.let { put("billing_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f(block: InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f.Builder.() -> Unit): InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f = InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1RadarPaymentEvaluacd5dPostRequestFormPaymentMethodDetailsX2dfa835f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

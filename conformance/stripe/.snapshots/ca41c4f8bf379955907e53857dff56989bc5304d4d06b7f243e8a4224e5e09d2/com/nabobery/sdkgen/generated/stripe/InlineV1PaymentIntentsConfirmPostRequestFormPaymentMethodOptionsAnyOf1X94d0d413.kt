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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413(
  public val captureMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c? = null,
  public val requestExtendedAuthorization: Boolean? = null,
  public val requestIncrementalAuthorizationSupport: Boolean? = null,
  public val routing:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c? =
        null

    public var requestExtendedAuthorization: Boolean? = null

    public var requestIncrementalAuthorizationSupport: Boolean? = null

    public var routing:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413(
      captureMethod = captureMethod,
      requestExtendedAuthorization = requestExtendedAuthorization,
      requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport,
      routing = routing,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c>(it) },
        requestExtendedAuthorization = rawObject["request_extended_authorization"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requestIncrementalAuthorizationSupport = rawObject["request_incremental_authorization_support"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        routing = rawObject["routing"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.requestExtendedAuthorization?.let { put("request_extended_authorization", json.encodeToJsonElement(it)) }
        value.requestIncrementalAuthorizationSupport?.let { put("request_incremental_authorization_support", json.encodeToJsonElement(it)) }
        value.routing?.let { put("routing", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X94d0d413.build(block)

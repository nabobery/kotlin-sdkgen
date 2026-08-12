package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/affirm.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/affirm
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45(
  public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX2eb02212? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX0fda29ab? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX2eb02212? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX0fda29ab? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45(
      captureMethod = captureMethod,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX2eb02212>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX0fda29ab>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45.build(block)

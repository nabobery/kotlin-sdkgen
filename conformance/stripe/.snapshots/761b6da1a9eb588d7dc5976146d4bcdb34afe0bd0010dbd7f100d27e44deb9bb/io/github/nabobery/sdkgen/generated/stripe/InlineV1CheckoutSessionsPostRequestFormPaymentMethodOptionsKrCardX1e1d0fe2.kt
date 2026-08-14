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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/kr_card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/kr_card
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2(
  public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodXc7e24834? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXe1a95237? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodXc7e24834? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXe1a95237? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2(
      captureMethod = captureMethod,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodXc7e24834>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXe1a95237>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2.build(block)

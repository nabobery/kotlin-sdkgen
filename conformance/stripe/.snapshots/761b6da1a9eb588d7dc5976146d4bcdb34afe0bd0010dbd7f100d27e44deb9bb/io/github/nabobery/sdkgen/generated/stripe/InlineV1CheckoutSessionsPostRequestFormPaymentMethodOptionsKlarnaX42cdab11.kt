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
 * ded/schema/properties/payment_method_options/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/klarna
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11(
  public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodXcbb532ed? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXbfdeb65e? = null,
  public val subscriptions: InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodXcbb532ed? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXbfdeb65e? =
        null

    public var subscriptions: InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11(
      captureMethod = captureMethod,
      setupFutureUsage = setupFutureUsage,
      subscriptions = subscriptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodXcbb532ed>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXbfdeb65e>(it) },
        subscriptions = rawObject["subscriptions"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.subscriptions?.let { put("subscriptions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11.build(block)

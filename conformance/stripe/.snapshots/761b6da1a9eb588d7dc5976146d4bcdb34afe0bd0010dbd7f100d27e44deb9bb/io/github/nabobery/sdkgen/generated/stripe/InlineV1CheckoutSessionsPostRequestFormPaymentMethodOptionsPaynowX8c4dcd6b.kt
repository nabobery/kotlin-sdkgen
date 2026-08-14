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
 * ded/schema/properties/payment_method_options/properties/paynow.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/paynow
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b(
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX76ac46f3? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX76ac46f3? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX76ac46f3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b.build(block)

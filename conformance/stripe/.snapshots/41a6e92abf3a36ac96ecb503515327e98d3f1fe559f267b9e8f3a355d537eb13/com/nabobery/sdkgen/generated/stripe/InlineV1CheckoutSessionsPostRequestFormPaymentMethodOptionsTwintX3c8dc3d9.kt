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
 * ded/schema/properties/payment_method_options/properties/twint.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/twint
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9(
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX79a760ae>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9.build(block)

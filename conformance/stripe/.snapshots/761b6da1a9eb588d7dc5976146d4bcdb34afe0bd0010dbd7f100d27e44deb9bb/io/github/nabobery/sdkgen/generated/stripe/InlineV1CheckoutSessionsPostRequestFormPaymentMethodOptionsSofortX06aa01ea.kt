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
 * ded/schema/properties/payment_method_options/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/sofort
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea(
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX2a063ce7? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX2a063ce7? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX2a063ce7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea.build(block)

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/trial_settings/properties/end_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/trial_settings/properties/end_behavior
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3(
  public val missingPaymentMethod:
      InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e,
) {
  public class Builder {
    private var missingPaymentMethodValue:
        InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e? = null

    public var missingPaymentMethod:
        InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e
      get() = requireNotNull(missingPaymentMethodValue) { "missingPaymentMethod is required" }
      set(`value`) {
        missingPaymentMethodValue = value
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3 {
      check(missingPaymentMethodValue != null) { "missingPaymentMethod is required" }
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3(
        missingPaymentMethod = missingPaymentMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3 must be a JSON object")
      val missingPaymentMethod = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e>(rawObject, "missing_payment_method")
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3(
        missingPaymentMethod = missingPaymentMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("missing_payment_method", json.encodeToJsonElement(value.missingPaymentMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3(block: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3 = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

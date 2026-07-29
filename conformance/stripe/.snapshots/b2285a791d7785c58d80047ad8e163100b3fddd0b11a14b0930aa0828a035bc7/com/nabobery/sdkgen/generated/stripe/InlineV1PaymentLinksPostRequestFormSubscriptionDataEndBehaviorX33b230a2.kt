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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/trial_settings/properties/end_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/trial_settings/properties/end_behavior
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2(
  public val missingPaymentMethod:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b,
) {
  public class Builder {
    private var missingPaymentMethodValue:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b? = null

    public var missingPaymentMethod:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b
      get() = requireNotNull(missingPaymentMethodValue) { "missingPaymentMethod is required" }
      set(`value`) {
        missingPaymentMethodValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2 {
      check(missingPaymentMethodValue != null) { "missingPaymentMethod is required" }
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2(
        missingPaymentMethod = missingPaymentMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2 must be a JSON object")
      val missingPaymentMethod = json.decodeRequired<InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b>(rawObject, "missing_payment_method")
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2(
        missingPaymentMethod = missingPaymentMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("missing_payment_method", json.encodeToJsonElement(value.missingPaymentMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2(block: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2 = InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

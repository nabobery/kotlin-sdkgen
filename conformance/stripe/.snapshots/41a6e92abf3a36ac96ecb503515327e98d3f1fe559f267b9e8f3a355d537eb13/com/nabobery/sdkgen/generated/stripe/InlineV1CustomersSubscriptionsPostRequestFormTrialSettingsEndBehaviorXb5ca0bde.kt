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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_settings/properties/end_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_settings/properties/end_behavior
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde(
  public val missingPaymentMethod:
      InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b,
) {
  public class Builder {
    private var missingPaymentMethodValue:
        InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b? = null

    public var missingPaymentMethod:
        InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b
      get() = requireNotNull(missingPaymentMethodValue) { "missingPaymentMethod is required" }
      set(`value`) {
        missingPaymentMethodValue = value
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde {
      check(missingPaymentMethodValue != null) { "missingPaymentMethod is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde(
        missingPaymentMethod = missingPaymentMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde must be a JSON object")
      val missingPaymentMethod = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b>(rawObject, "missing_payment_method")
      return InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde(
        missingPaymentMethod = missingPaymentMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("missing_payment_method", json.encodeToJsonElement(value.missingPaymentMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde(block: InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde = InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

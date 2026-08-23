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
 * Defines how a subscription behaves when a free trial ends.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_trials_resource_end_behavior
 */
@Serializable(with = SubscriptionsTrialsResourceEndBehavior.Serializer::class)
public class SubscriptionsTrialsResourceEndBehavior(
  /**
   * Indicates how the subscription should change when the trial ends if the user did not provide a payment method.
   */
  public val missingPaymentMethod:
      InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b,
) {
  public class Builder {
    private var missingPaymentMethodValue:
        InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b? = null

    public var missingPaymentMethod:
        InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b
      get() = requireNotNull(missingPaymentMethodValue) { "missingPaymentMethod is required" }
      set(`value`) {
        missingPaymentMethodValue = value
      }

    public fun build(): SubscriptionsTrialsResourceEndBehavior {
      check(missingPaymentMethodValue != null) { "missingPaymentMethod is required" }
      return SubscriptionsTrialsResourceEndBehavior(
        missingPaymentMethod = missingPaymentMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsTrialsResourceEndBehavior = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsTrialsResourceEndBehavior> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsTrialsResourceEndBehavior {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsTrialsResourceEndBehavior")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsTrialsResourceEndBehavior must be a JSON object")
      val missingPaymentMethod = json.decodeRequired<InlineSubscriptionsTrialsResourceEndBehaviorMissingPaymentMethodX58fdd33b>(rawObject, "missing_payment_method")
      return SubscriptionsTrialsResourceEndBehavior(
        missingPaymentMethod = missingPaymentMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsTrialsResourceEndBehavior) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsTrialsResourceEndBehavior")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("missing_payment_method", json.encodeToJsonElement(value.missingPaymentMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsTrialsResourceEndBehavior(block: SubscriptionsTrialsResourceEndBehavior.Builder.() -> Unit): SubscriptionsTrialsResourceEndBehavior = SubscriptionsTrialsResourceEndBehavior.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsTrialsResourceEndBehavior is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

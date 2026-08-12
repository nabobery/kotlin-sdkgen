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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855(
  public val endBehavior: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197,
) {
  public class Builder {
    private var endBehaviorValue:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197? = null

    public var endBehavior: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197
      get() = requireNotNull(endBehaviorValue) { "endBehavior is required" }
      set(`value`) {
        endBehaviorValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 {
      check(endBehaviorValue != null) { "endBehavior is required" }
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855(
        endBehavior = endBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 must be a JSON object")
      val endBehavior = json.decodeRequired<InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX3c769197>(rawObject, "end_behavior")
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855(
        endBehavior = endBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_behavior", json.encodeToJsonElement(value.endBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855(block: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 = InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

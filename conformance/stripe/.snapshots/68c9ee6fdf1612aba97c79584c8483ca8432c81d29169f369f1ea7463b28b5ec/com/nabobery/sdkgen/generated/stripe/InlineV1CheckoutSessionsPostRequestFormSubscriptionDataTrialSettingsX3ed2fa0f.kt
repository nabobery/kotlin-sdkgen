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
 * ded/schema/properties/subscription_data/properties/trial_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/trial_settings
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f(
  public val endBehavior:
      InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3,
) {
  public class Builder {
    private var endBehaviorValue:
        InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3? = null

    public var endBehavior:
        InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3
      get() = requireNotNull(endBehaviorValue) { "endBehavior is required" }
      set(`value`) {
        endBehaviorValue = value
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f {
      check(endBehaviorValue != null) { "endBehavior is required" }
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f(
        endBehavior = endBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f must be a JSON object")
      val endBehavior = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataEndBehaviorX414fd5e3>(rawObject, "end_behavior")
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f(
        endBehavior = endBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_behavior", json.encodeToJsonElement(value.endBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f(block: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

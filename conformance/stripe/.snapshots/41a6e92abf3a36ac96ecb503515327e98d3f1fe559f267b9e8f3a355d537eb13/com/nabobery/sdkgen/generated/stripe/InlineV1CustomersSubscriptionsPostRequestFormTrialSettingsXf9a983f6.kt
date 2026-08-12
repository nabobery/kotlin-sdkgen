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
 * Settings related to subscription trials.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_settings
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6(
  public val endBehavior:
      InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde,
) {
  public class Builder {
    private var endBehaviorValue:
        InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde? = null

    public var endBehavior:
        InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde
      get() = requireNotNull(endBehaviorValue) { "endBehavior is required" }
      set(`value`) {
        endBehaviorValue = value
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6 {
      check(endBehaviorValue != null) { "endBehavior is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6(
        endBehavior = endBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6 must be a JSON object")
      val endBehavior = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsEndBehaviorXb5ca0bde>(rawObject, "end_behavior")
      return InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6(
        endBehavior = endBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_behavior", json.encodeToJsonElement(value.endBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6(block: InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6 = InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormTrialSettingsXf9a983f6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee(
  public val subscription: String,
) {
  public class Builder {
    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee {
      check(subscriptionValue != null) { "subscription is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee(
        subscription = subscription,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee must be a JSON object")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee(
        subscription = subscription,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subscription", value.subscription)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee = InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

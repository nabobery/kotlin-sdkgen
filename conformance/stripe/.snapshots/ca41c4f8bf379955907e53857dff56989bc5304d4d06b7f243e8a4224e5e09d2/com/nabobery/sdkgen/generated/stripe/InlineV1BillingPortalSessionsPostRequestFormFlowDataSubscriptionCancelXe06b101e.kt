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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_cancel
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e(
  public val subscription: String,
  public val retention:
      InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd? = null,
) {
  public class Builder {
    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    public var retention: InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd? =
        null

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e {
      check(subscriptionValue != null) { "subscription is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e(
        subscription = subscription,
        retention = retention,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e must be a JSON object")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e(
        subscription = subscription,
        retention = rawObject["retention"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormFlowDataRetentionXf3ca2ebd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subscription", value.subscription)
        value.retention?.let { put("retention", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e = InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

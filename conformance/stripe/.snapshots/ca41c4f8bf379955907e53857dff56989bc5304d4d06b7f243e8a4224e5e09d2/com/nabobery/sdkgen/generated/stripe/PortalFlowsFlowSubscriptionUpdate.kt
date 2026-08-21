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

@Serializable
public data class PortalFlowsFlowSubscriptionUpdateView(
  public val subscription: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_subscription_update
 */
@Serializable(with = PortalFlowsFlowSubscriptionUpdate.Serializer::class)
public class PortalFlowsFlowSubscriptionUpdate(
  /**
   * The ID of the subscription to be updated.
   */
  public val subscription: String,
) {
  public class Builder {
    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    public fun build(): PortalFlowsFlowSubscriptionUpdate {
      check(subscriptionValue != null) { "subscription is required" }
      return PortalFlowsFlowSubscriptionUpdate(
        subscription = subscription,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsFlowSubscriptionUpdate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalFlowsFlowSubscriptionUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsFlowSubscriptionUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsFlowSubscriptionUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsFlowSubscriptionUpdate must be a JSON object")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return PortalFlowsFlowSubscriptionUpdate(
        subscription = subscription,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsFlowSubscriptionUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsFlowSubscriptionUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subscription", value.subscription)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsFlowSubscriptionUpdate(block: PortalFlowsFlowSubscriptionUpdate.Builder.() -> Unit): PortalFlowsFlowSubscriptionUpdate = PortalFlowsFlowSubscriptionUpdate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalFlowsFlowSubscriptionUpdate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

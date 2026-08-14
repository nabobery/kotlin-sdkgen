package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PortalFlowsFlowSubscriptionCancelView(
  public val retention: InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60? = null,
  public val subscription: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_subscription_cancel
 */
@Serializable(with = PortalFlowsFlowSubscriptionCancel.Serializer::class)
public class PortalFlowsFlowSubscriptionCancel(
  /**
   * The ID of the subscription to be canceled.
   */
  public val subscription: String,
  /**
   * Specify a retention strategy to be used in the cancellation flow.
   */
  public val retention: InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60? = null,
) {
  public class Builder {
    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    /**
     * Specify a retention strategy to be used in the cancellation flow.
     */
    public var retention: InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60? = null

    public fun build(): PortalFlowsFlowSubscriptionCancel {
      check(subscriptionValue != null) { "subscription is required" }
      return PortalFlowsFlowSubscriptionCancel(
        subscription = subscription,
        retention = retention,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsFlowSubscriptionCancel = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalFlowsFlowSubscriptionCancel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsFlowSubscriptionCancel {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsFlowSubscriptionCancel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsFlowSubscriptionCancel must be a JSON object")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return PortalFlowsFlowSubscriptionCancel(
        subscription = subscription,
        retention = rawObject["retention"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsFlowSubscriptionCancel) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsFlowSubscriptionCancel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("subscription", value.subscription)
        value.retention?.let { put("retention", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsFlowSubscriptionCancel(block: PortalFlowsFlowSubscriptionCancel.Builder.() -> Unit): PortalFlowsFlowSubscriptionCancel = PortalFlowsFlowSubscriptionCancel.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalFlowsFlowSubscriptionCancel is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

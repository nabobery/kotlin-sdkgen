package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class PortalFlowsFlowView(
  @SerialName("after_completion")
  public val afterCompletion: PortalFlowsFlowAfterCompletion,
  @SerialName("subscription_cancel")
  public val subscriptionCancel: InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1? = null,
  @SerialName("subscription_update")
  public val subscriptionUpdate: InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e? = null,
  @SerialName("subscription_update_confirm")
  public val subscriptionUpdateConfirm:
      InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963? = null,
  public val type: InlinePortalFlowsFlowTypeX27d83801,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow
 */
@Serializable(with = PortalFlowsFlow.Serializer::class)
public class PortalFlowsFlow(
  public val afterCompletion: PortalFlowsFlowAfterCompletion,
  /**
   * Type of flow that the customer will go through.
   */
  public val type: InlinePortalFlowsFlowTypeX27d83801,
  /**
   * Configuration when `flow.type=subscription_cancel`.
   */
  public val subscriptionCancel: InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1? = null,
  /**
   * Configuration when `flow.type=subscription_update`.
   */
  public val subscriptionUpdate: InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e? = null,
  /**
   * Configuration when `flow.type=subscription_update_confirm`.
   */
  public val subscriptionUpdateConfirm:
      InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963? = null,
) {
  public class Builder {
    private var afterCompletionValue: PortalFlowsFlowAfterCompletion? = null

    public var afterCompletion: PortalFlowsFlowAfterCompletion
      get() = requireNotNull(afterCompletionValue) { "afterCompletion is required" }
      set(`value`) {
        afterCompletionValue = value
      }

    private var typeValue: InlinePortalFlowsFlowTypeX27d83801? = null

    public var type: InlinePortalFlowsFlowTypeX27d83801
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Configuration when `flow.type=subscription_cancel`.
     */
    public var subscriptionCancel: InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1? = null

    /**
     * Configuration when `flow.type=subscription_update`.
     */
    public var subscriptionUpdate: InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e? = null

    /**
     * Configuration when `flow.type=subscription_update_confirm`.
     */
    public var subscriptionUpdateConfirm: InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963? =
        null

    public fun build(): PortalFlowsFlow {
      check(afterCompletionValue != null) { "afterCompletion is required" }
      check(typeValue != null) { "type is required" }
      return PortalFlowsFlow(
        afterCompletion = afterCompletion,
        type = type,
        subscriptionCancel = subscriptionCancel,
        subscriptionUpdate = subscriptionUpdate,
        subscriptionUpdateConfirm = subscriptionUpdateConfirm,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsFlow = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalFlowsFlow> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsFlow {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsFlow")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsFlow must be a JSON object")
      val afterCompletion = json.decodeRequired<PortalFlowsFlowAfterCompletion>(rawObject, "after_completion")
      val type = json.decodeRequired<InlinePortalFlowsFlowTypeX27d83801>(rawObject, "type")
      return PortalFlowsFlow(
        afterCompletion = afterCompletion,
        type = type,
        subscriptionCancel = rawObject["subscription_cancel"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePortalFlowsFlowSubscriptionCancelX1d1da8b1?>(element) },
        subscriptionUpdate = rawObject["subscription_update"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePortalFlowsFlowSubscriptionUpdateX2b2e419e?>(element) },
        subscriptionUpdateConfirm = rawObject["subscription_update_confirm"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePortalFlowsFlowSubscriptionUpdateConfirmX6ccda963?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsFlow) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsFlow")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("after_completion", json.encodeToJsonElement(value.afterCompletion))
        put("type", json.encodeToJsonElement(value.type))
        value.subscriptionCancel?.let { put("subscription_cancel", json.encodeToJsonElement(it)) }
        value.subscriptionUpdate?.let { put("subscription_update", json.encodeToJsonElement(it)) }
        value.subscriptionUpdateConfirm?.let { put("subscription_update_confirm", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsFlow(block: PortalFlowsFlow.Builder.() -> Unit): PortalFlowsFlow = PortalFlowsFlow.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalFlowsFlow is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

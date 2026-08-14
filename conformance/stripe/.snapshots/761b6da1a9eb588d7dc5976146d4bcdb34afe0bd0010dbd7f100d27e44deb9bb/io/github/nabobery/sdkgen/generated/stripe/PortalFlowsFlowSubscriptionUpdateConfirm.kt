package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@ConsistentCopyVisibility
@Serializable
public data class PortalFlowsFlowSubscriptionUpdateConfirmView internal constructor(
  public val discounts: List<PortalFlowsSubscriptionUpdateConfirmDiscount>? = null,
  public val items: List<PortalFlowsSubscriptionUpdateConfirmItem>,
  public val subscription: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_subscription_update_confirm
 */
@Serializable(with = PortalFlowsFlowSubscriptionUpdateConfirm.Serializer::class)
public class PortalFlowsFlowSubscriptionUpdateConfirm(
  items: List<PortalFlowsSubscriptionUpdateConfirmItem>,
  /**
   * The ID of the subscription to be updated.
   */
  public val subscription: String,
  discounts: List<PortalFlowsSubscriptionUpdateConfirmDiscount>? = null,
) {
  /**
   * The [subscription item](https://docs.stripe.com/api/subscription_items) to be updated through this flow. Currently,
   * only up to one may be specified and subscriptions with multiple items are not updatable.
   */
  public val items: List<PortalFlowsSubscriptionUpdateConfirmItem> = items.toList()

  /**
   * The coupon or promotion code to apply to this subscription update.
   */
  public val discounts: List<PortalFlowsSubscriptionUpdateConfirmDiscount>? =
      discounts?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var itemsValue: List<PortalFlowsSubscriptionUpdateConfirmItem>? = null

    public var items: List<PortalFlowsSubscriptionUpdateConfirmItem>
      get() = requireNotNull(itemsValue) { "items is required" }.toList()
      set(`value`) {
        itemsValue = value.toList()
      }

    private var subscriptionValue: String? = null

    public var subscription: String
      get() = requireNotNull(subscriptionValue) { "subscription is required" }
      set(`value`) {
        subscriptionValue = value
      }

    private var discountsValue: List<PortalFlowsSubscriptionUpdateConfirmDiscount>? = null

    /**
     * The coupon or promotion code to apply to this subscription update.
     */
    public var discounts: List<PortalFlowsSubscriptionUpdateConfirmDiscount>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): PortalFlowsFlowSubscriptionUpdateConfirm {
      check(itemsValue != null) { "items is required" }
      check(subscriptionValue != null) { "subscription is required" }
      return PortalFlowsFlowSubscriptionUpdateConfirm(
        items = items,
        subscription = subscription,
        discounts = discounts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsFlowSubscriptionUpdateConfirm = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalFlowsFlowSubscriptionUpdateConfirm> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsFlowSubscriptionUpdateConfirm {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsFlowSubscriptionUpdateConfirm")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsFlowSubscriptionUpdateConfirm must be a JSON object")
      val items = json.decodeRequired<List<PortalFlowsSubscriptionUpdateConfirmItem>>(rawObject, "items")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return PortalFlowsFlowSubscriptionUpdateConfirm(
        items = items,
        subscription = subscription,
        discounts = rawObject["discounts"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PortalFlowsSubscriptionUpdateConfirmDiscount>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsFlowSubscriptionUpdateConfirm) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsFlowSubscriptionUpdateConfirm")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("items", json.encodeToJsonElement(value.items))
        put("subscription", value.subscription)
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsFlowSubscriptionUpdateConfirm(block: PortalFlowsFlowSubscriptionUpdateConfirm.Builder.() -> Unit): PortalFlowsFlowSubscriptionUpdateConfirm = PortalFlowsFlowSubscriptionUpdateConfirm.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalFlowsFlowSubscriptionUpdateConfirm is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

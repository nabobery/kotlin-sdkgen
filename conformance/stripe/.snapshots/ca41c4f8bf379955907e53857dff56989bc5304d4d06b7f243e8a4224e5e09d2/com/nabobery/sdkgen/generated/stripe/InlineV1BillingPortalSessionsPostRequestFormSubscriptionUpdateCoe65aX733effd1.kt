package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update_confirm.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/subscription_update_confirm
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1(
  items: List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884>,
  public val subscription: String,
  discounts: List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c>? = null,
) {
  public val items: List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884> =
      items.toList()

  public val discounts: List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c>? =
      discounts?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var itemsValue: List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884>?
        = null

    public var items: List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884>
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

    private var discountsValue:
        List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c>? = null

    public var discounts: List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c>?
      get() = discountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        discountsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1 {
      check(itemsValue != null) { "items is required" }
      check(subscriptionValue != null) { "subscription is required" }
      return InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1(
        items = items,
        subscription = subscription,
        discounts = discounts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1 must be a JSON object")
      val items = json.decodeRequired<List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemXea2b2884>>(rawObject, "items")
      val subscription = json.decodeRequired<String>(rawObject, "subscription")
      return InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1(
        items = items,
        subscription = subscription,
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<List<InlineV1BillingPortalSessionsPostRequestFormFlowDataItemX85cb593c>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1")
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

public fun inlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1(block: InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1 = InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

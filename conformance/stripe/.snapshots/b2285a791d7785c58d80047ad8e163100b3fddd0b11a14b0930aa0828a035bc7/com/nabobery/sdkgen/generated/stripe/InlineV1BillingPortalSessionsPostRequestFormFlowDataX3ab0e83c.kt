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
 * Information about a specific flow for the customer to go through. See the
 * [docs](https://docs.stripe.com/customer-management/portal-deep-links) to learn more about using customer portal deep
 * links and flows.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c(
  public val type: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486,
  public val afterCompletion:
      InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920? = null,
  public val subscriptionCancel:
      InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e? = null,
  public val subscriptionUpdate:
      InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee? = null,
  public val subscriptionUpdateConfirm:
      InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1? = null,
) {
  public class Builder {
    private var typeValue: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486? = null

    public var type: InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var afterCompletion:
        InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920? = null

    public var subscriptionCancel:
        InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e? = null

    public var subscriptionUpdate:
        InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee? = null

    public var subscriptionUpdateConfirm:
        InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1? = null

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c {
      check(typeValue != null) { "type is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c(
        type = type,
        afterCompletion = afterCompletion,
        subscriptionCancel = subscriptionCancel,
        subscriptionUpdate = subscriptionUpdate,
        subscriptionUpdateConfirm = subscriptionUpdateConfirm,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c must be a JSON object")
      val type = json.decodeRequired<InlineV1BillingPortalSessionsPostRequestFormFlowDataTypeXe9325486>(rawObject, "type")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c(
        type = type,
        afterCompletion = rawObject["after_completion"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920>(it) },
        subscriptionCancel = rawObject["subscription_cancel"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionCancelXe06b101e>(it) },
        subscriptionUpdate = rawObject["subscription_update"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormFlowDataSubscriptionUpdateXe87100ee>(it) },
        subscriptionUpdateConfirm = rawObject["subscription_update_confirm"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormSubscriptionUpdateCoe65aX733effd1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.afterCompletion?.let { put("after_completion", json.encodeToJsonElement(it)) }
        value.subscriptionCancel?.let { put("subscription_cancel", json.encodeToJsonElement(it)) }
        value.subscriptionUpdate?.let { put("subscription_update", json.encodeToJsonElement(it)) }
        value.subscriptionUpdateConfirm?.let { put("subscription_update_confirm", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c = InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

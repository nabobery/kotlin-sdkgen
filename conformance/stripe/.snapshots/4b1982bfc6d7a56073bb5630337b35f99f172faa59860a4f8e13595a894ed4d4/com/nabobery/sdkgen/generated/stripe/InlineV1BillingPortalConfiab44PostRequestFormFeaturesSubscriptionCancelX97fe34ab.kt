package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_cancel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_cancel
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab(
  public val enabled: Boolean,
  public val cancellationReason:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9? = null,
  public val mode: InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578? = null,
  public val prorationBehavior:
      InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorX6be432ec? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var cancellationReason:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9? = null

    public var mode: InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578? = null

    public var prorationBehavior:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorX6be432ec? = null

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab(
        enabled = enabled,
        cancellationReason = cancellationReason,
        mode = mode,
        prorationBehavior = prorationBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab(
        enabled = enabled,
        cancellationReason = rawObject["cancellation_reason"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9>(it) },
        mode = rawObject["mode"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesModeX2c690578>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProrationBehaviorX6be432ec>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab(block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab = InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesSubscriptionCancelX97fe34ab is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

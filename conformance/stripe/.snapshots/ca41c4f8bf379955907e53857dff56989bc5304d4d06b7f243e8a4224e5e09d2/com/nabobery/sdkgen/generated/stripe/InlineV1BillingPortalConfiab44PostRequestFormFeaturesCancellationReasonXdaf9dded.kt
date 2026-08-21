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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/cancellation_re
 * ason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/cancellation_re
 * ason
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded(
  public val enabled: Boolean,
  public val options: InlineV1BillingPortalConfiab44PostRequestFormFeaturesOptionsX205e6660? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var options: InlineV1BillingPortalConfiab44PostRequestFormFeaturesOptionsX205e6660? =
        null

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded(
        enabled = enabled,
        options = options,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded(
        enabled = enabled,
        options = rawObject["options"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesOptionsX205e6660>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded(block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonXdaf9dded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

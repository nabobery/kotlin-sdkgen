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
 * form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/cancellation_reason.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_cancel/properties/cancellation_reason
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9(
  public val enabled: Boolean,
  public val options: InlineV1BillingPortalConfiab44PostRequestFormFeaturesOptionsX04276304,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var optionsValue: InlineV1BillingPortalConfiab44PostRequestFormFeaturesOptionsX04276304?
        = null

    public var options: InlineV1BillingPortalConfiab44PostRequestFormFeaturesOptionsX04276304
      get() = requireNotNull(optionsValue) { "options is required" }
      set(`value`) {
        optionsValue = value
      }

    public fun build(): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9 {
      check(enabledValue != null) { "enabled is required" }
      check(optionsValue != null) { "options is required" }
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9(
        enabled = enabled,
        options = options,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val options = json.decodeRequired<InlineV1BillingPortalConfiab44PostRequestFormFeaturesOptionsX04276304>(rawObject, "options")
      return InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9(
        enabled = enabled,
        options = options,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("options", json.encodeToJsonElement(value.options))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9(block: InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9.Builder.() -> Unit): InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9 = InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfiab44PostRequestFormFeaturesCancellationReasonX2856cff9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

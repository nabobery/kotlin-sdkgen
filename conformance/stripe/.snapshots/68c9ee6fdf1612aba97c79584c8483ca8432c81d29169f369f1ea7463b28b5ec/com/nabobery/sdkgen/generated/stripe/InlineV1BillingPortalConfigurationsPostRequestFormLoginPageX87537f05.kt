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
 * The hosted login page for this configuration. Learn more about the portal login page in our [integration
 * docs](https://stripe.com/docs/billing/subscriptions/integrating-customer-portal#share).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/login_page
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05(block: InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05.Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05 = InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The business information shown to customers in the portal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/business_profile
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea(
  public val headline:
      InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8? = null,
  public val privacyPolicyUrl: String? = null,
  public val termsOfServiceUrl: String? = null,
) {
  public class Builder {
    public var headline:
        InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8? = null

    public var privacyPolicyUrl: String? = null

    public var termsOfServiceUrl: String? = null

    public fun build(): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea = InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea(
      headline = headline,
      privacyPolicyUrl = privacyPolicyUrl,
      termsOfServiceUrl = termsOfServiceUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea must be a JSON object")
      return InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea(
        headline = rawObject["headline"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX96eb4cf8>(it) },
        privacyPolicyUrl = rawObject["privacy_policy_url"]?.let { json.decodeFromJsonElement<String>(it) },
        termsOfServiceUrl = rawObject["terms_of_service_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.headline?.let { put("headline", json.encodeToJsonElement(it)) }
        value.privacyPolicyUrl?.let { put("privacy_policy_url", it) }
        value.termsOfServiceUrl?.let { put("terms_of_service_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea(block: InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea.Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea = InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea.build(block)

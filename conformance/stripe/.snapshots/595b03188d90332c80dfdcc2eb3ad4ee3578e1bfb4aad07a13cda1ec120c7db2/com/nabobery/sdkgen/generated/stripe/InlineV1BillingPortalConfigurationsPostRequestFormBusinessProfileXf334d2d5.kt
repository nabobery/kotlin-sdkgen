package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Unit

/**
 * The business information shown to customers in the portal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/business_profile
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5(
    public val headline: InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX50e0e617? = null,
    public val privacyPolicyUrl: InlineV1BillingPortalConfiab44PostRequestFormPrivacyPolicyUrlX5df97158? = null,
    public val termsOfServiceUrl: InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213? = null,
) {
    public class Builder {
        public var headline:
            InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX50e0e617? = null

        public var privacyPolicyUrl:
            InlineV1BillingPortalConfiab44PostRequestFormPrivacyPolicyUrlX5df97158? = null

        public var termsOfServiceUrl:
            InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213? = null

        public fun build(): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5 =
            InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5(
                headline = headline,
                privacyPolicyUrl = privacyPolicyUrl,
                termsOfServiceUrl = termsOfServiceUrl,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5 must be a JSON object",
                    )
            return InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5(
                headline =
                    rawObject["headline"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileHeadlineX50e0e617>(
                                it,
                            )
                    },
                privacyPolicyUrl =
                    rawObject["privacy_policy_url"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormPrivacyPolicyUrlX5df97158>(
                                it,
                            )
                    },
                termsOfServiceUrl =
                    rawObject["terms_of_service_url"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.headline?.let { put("headline", json.encodeToJsonElement(it)) }
                    value.privacyPolicyUrl?.let { put("privacy_policy_url", json.encodeToJsonElement(it)) }
                    value.termsOfServiceUrl?.let { put("terms_of_service_url", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5(
    block: InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5.Builder.() -> Unit,
): InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5 =
    InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5.build(block)

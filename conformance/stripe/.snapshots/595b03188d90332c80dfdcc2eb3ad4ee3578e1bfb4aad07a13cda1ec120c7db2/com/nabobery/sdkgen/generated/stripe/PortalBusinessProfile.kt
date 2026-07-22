package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_business_profile
 */
@Serializable(with = PortalBusinessProfile.Serializer::class)
public class PortalBusinessProfile(
    /**
     * The messaging shown to customers in the portal.
     */
    public val headline: String? = null,
    /**
     * A link to the business’s publicly available privacy policy.
     */
    public val privacyPolicyUrl: String? = null,
    /**
     * A link to the business’s publicly available terms of service.
     */
    public val termsOfServiceUrl: String? = null,
) {
    public class Builder {
        /**
         * The messaging shown to customers in the portal.
         */
        public var headline: String? = null

        /**
         * A link to the business’s publicly available privacy policy.
         */
        public var privacyPolicyUrl: String? = null

        /**
         * A link to the business’s publicly available terms of service.
         */
        public var termsOfServiceUrl: String? = null

        public fun build(): PortalBusinessProfile =
            PortalBusinessProfile(
                headline = headline,
                privacyPolicyUrl = privacyPolicyUrl,
                termsOfServiceUrl = termsOfServiceUrl,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PortalBusinessProfile = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PortalBusinessProfile> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PortalBusinessProfile {
            val jsonDecoder = decoder.requireJsonDecoder("PortalBusinessProfile")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PortalBusinessProfile must be a JSON object")
            return PortalBusinessProfile(
                headline =
                    rawObject["headline"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                privacyPolicyUrl =
                    rawObject["privacy_policy_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                termsOfServiceUrl =
                    rawObject["terms_of_service_url"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PortalBusinessProfile,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PortalBusinessProfile")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.headline?.let { put("headline", it) }
                    value.privacyPolicyUrl?.let { put("privacy_policy_url", it) }
                    value.termsOfServiceUrl?.let { put("terms_of_service_url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun portalBusinessProfile(block: PortalBusinessProfile.Builder.() -> Unit): PortalBusinessProfile =
    PortalBusinessProfile.build(block)

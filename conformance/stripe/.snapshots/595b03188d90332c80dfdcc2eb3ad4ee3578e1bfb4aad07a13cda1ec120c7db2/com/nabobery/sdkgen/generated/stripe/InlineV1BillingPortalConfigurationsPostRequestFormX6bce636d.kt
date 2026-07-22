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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d(
    /**
     * Whether the configuration is active and can be used to create portal sessions.
     */
    public val active: Boolean? = null,
    /**
     * The business information shown to customers in the portal.
     */
    public val businessProfile: InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5? = null,
    /**
     * The default URL to redirect customers to when they click on the portal's link to return to your website. This can
     * be [overriden](https://docs.stripe.com/api/customer_portal/sessions/create#create_portal_session-return_url) when
     * creating the session.
     */
    public val defaultReturnUrl: InlineV1BillingPortalConfigurationsPostRequestFormDefaultReturnUrlXb50f2cd3? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Information about the features available in the portal.
     */
    public val features: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b? = null,
    /**
     * The hosted login page for this configuration. Learn more about the portal login page in our [integration
     * docs](https://stripe.com/docs/billing/subscriptions/integrating-customer-portal#share).
     */
    public val loginPage: InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX03ccc776? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c? = null,
    /**
     * The name of the configuration.
     */
    public val name: InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb? = null,
) {
    public class Builder {
        /**
         * Whether the configuration is active and can be used to create portal sessions.
         */
        public var active: Boolean? = null

        /**
         * The business information shown to customers in the portal.
         */
        public var businessProfile:
            InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5? = null

        /**
         * The default URL to redirect customers to when they click on the portal's link to return to your website. This can
         * be [overriden](https://docs.stripe.com/api/customer_portal/sessions/create#create_portal_session-return_url) when
         * creating the session.
         */
        public var defaultReturnUrl:
            InlineV1BillingPortalConfigurationsPostRequestFormDefaultReturnUrlXb50f2cd3? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Information about the features available in the portal.
         */
        public var features: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b? = null

        /**
         * The hosted login page for this configuration. Learn more about the portal login page in our [integration
         * docs](https://stripe.com/docs/billing/subscriptions/integrating-customer-portal#share).
         */
        public var loginPage: InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX03ccc776? =
            null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c? = null

        /**
         * The name of the configuration.
         */
        public var name: InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb? = null

        public fun build(): InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d =
            InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d(
                active = active,
                businessProfile = businessProfile,
                defaultReturnUrl = defaultReturnUrl,
                expand = expand,
                features = features,
                loginPage = loginPage,
                metadata = metadata,
                name = name,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d must be a JSON object",
                    )
            return InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d(
                active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                businessProfile =
                    rawObject["business_profile"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileXf334d2d5>(
                                it,
                            )
                    },
                defaultReturnUrl =
                    rawObject["default_return_url"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormDefaultReturnUrlXb50f2cd3>(
                                it,
                            )
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                features =
                    rawObject["features"]?.let {
                        json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormFeaturesX378a9f5b>(
                            it,
                        )
                    },
                loginPage =
                    rawObject["login_page"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX03ccc776>(
                                it,
                            )
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormMetadataX09d7226c>(
                            it,
                        )
                    },
                name =
                    rawObject["name"]?.let {
                        json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormNameX1352debb>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.active?.let { put("active", json.encodeToJsonElement(it)) }
                    value.businessProfile?.let { put("business_profile", json.encodeToJsonElement(it)) }
                    value.defaultReturnUrl?.let { put("default_return_url", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.features?.let { put("features", json.encodeToJsonElement(it)) }
                    value.loginPage?.let { put("login_page", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingPortalConfigurationsPostRequestFormX6bce636d(
    block: InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d.Builder.() -> Unit,
): InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d =
    InlineV1BillingPortalConfigurationsPostRequestFormX6bce636d.build(block)

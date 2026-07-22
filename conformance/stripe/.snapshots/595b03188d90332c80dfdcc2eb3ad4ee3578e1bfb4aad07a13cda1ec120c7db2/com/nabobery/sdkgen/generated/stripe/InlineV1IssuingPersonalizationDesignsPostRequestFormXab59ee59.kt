package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59(
    /**
     * The physical bundle object belonging to this personalization design.
     */
    public val physicalBundle: String,
    /**
     * The file for the card logo, for use with physical bundles that support card logos. Must have a `purpose` value of
     * `issuing_logo`.
     */
    public val cardLogo: String? = null,
    /**
     * Hash containing carrier text, for use with physical bundles that support carrier text.
     */
    public val carrierText: InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * A lookup key used to retrieve personalization designs dynamically from a static string. This may be up to 200
     * characters.
     */
    public val lookupKey: String? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * Friendly display name.
     */
    public val name: String? = null,
    /**
     * Information on whether this personalization design is used to create cards when one is not specified.
     */
    public val preferences: InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859? = null,
    /**
     * If set to true, will atomically remove the lookup key from the existing personalization design, and assign it to
     * this personalization design.
     */
    public val transferLookupKey: Boolean? = null,
) {
    public class Builder {
        private var physicalBundleValue: String? = null

        public var physicalBundle: String
            get() = requireNotNull(physicalBundleValue) { "physicalBundle is required" }
            set(`value`) {
                physicalBundleValue = value
            }

        /**
         * The file for the card logo, for use with physical bundles that support card logos. Must have a `purpose` value of
         * `issuing_logo`.
         */
        public var cardLogo: String? = null

        /**
         * Hash containing carrier text, for use with physical bundles that support carrier text.
         */
        public var carrierText:
            InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * A lookup key used to retrieve personalization designs dynamically from a static string. This may be up to 200
         * characters.
         */
        public var lookupKey: String? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * Friendly display name.
         */
        public var name: String? = null

        /**
         * Information on whether this personalization design is used to create cards when one is not specified.
         */
        public var preferences:
            InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859? = null

        /**
         * If set to true, will atomically remove the lookup key from the existing personalization design, and assign it to
         * this personalization design.
         */
        public var transferLookupKey: Boolean? = null

        public fun build(): InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59 {
            check(physicalBundleValue != null) { "physicalBundle is required" }
            return InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59(
                physicalBundle = physicalBundle,
                cardLogo = cardLogo,
                carrierText = carrierText,
                expand = expand,
                lookupKey = lookupKey,
                metadata = metadata,
                name = name,
                preferences = preferences,
                transferLookupKey = transferLookupKey,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59 must be a JSON object",
                    )
            val physicalBundle = json.decodeRequired<String>(rawObject, "physical_bundle")
            return InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59(
                physicalBundle = physicalBundle,
                cardLogo = rawObject["card_logo"]?.let { json.decodeFromJsonElement<String>(it) },
                carrierText =
                    rawObject["carrier_text"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe>(
                                it,
                            )
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                lookupKey = rawObject["lookup_key"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                preferences =
                    rawObject["preferences"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX720c7859>(
                                it,
                            )
                    },
                transferLookupKey =
                    rawObject["transfer_lookup_key"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("physical_bundle", value.physicalBundle)
                    value.cardLogo?.let { put("card_logo", it) }
                    value.carrierText?.let { put("carrier_text", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.lookupKey?.let { put("lookup_key", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", it) }
                    value.preferences?.let { put("preferences", json.encodeToJsonElement(it)) }
                    value.transferLookupKey?.let { put("transfer_lookup_key", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59(
    block: InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59.Builder.() -> Unit,
): InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59 =
    InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1IssuingPersonalizationDesignsPostRequestFormXab59ee59 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}

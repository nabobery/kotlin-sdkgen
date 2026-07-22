package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@Serializable
public data class IssuingPersonalizationDesignView(
    @SerialName("card_logo")
    public val cardLogo: InlineIssuingPersonalizationDesignCardLogoX9055fd98? = null,
    @SerialName("carrier_text")
    public val carrierText: InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae? = null,
    public val created: Int,
    public val id: String,
    public val livemode: Boolean,
    @SerialName("lookup_key")
    public val lookupKey: String? = null,
    public val metadata: Map<String, String>,
    public val name: String? = null,
    @SerialName("object")
    public val objectValue: InlineIssuingPersonalizationDesignObjectValueX8418564b,
    @SerialName("physical_bundle")
    public val physicalBundle: InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3,
    public val preferences: IssuingPersonalizationDesignPreferences,
    @SerialName("rejection_reasons")
    public val rejectionReasons: IssuingPersonalizationDesignRejectionReasons,
    public val status: InlineIssuingPersonalizationDesignStatusX112137d7,
)

/**
 * A Personalization Design is a logical grouping of a Physical Bundle, card logo, and carrier text that represents a
 * product line.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.personalization_design
 */
@Serializable(with = IssuingPersonalizationDesign.Serializer::class)
public class IssuingPersonalizationDesign(
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineIssuingPersonalizationDesignObjectValueX8418564b,
    /**
     * The physical bundle object belonging to this personalization design.
     */
    public val physicalBundle: InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3,
    public val preferences: IssuingPersonalizationDesignPreferences,
    public val rejectionReasons: IssuingPersonalizationDesignRejectionReasons,
    /**
     * Whether this personalization design can be used to create cards.
     */
    public val status: InlineIssuingPersonalizationDesignStatusX112137d7,
    /**
     * The file for the card logo to use with physical bundles that support card logos. Must have a `purpose` value of
     * `issuing_logo`. Image must be in PNG format with dimensions of 1000px by 200px. It must be a binary (black and
     * white) image containing a black logo on a white background. We don't accept grayscale.
     */
    public val cardLogo: InlineIssuingPersonalizationDesignCardLogoX9055fd98? = null,
    /**
     * Hash containing carrier text, for use with physical bundles that support carrier text.
     */
    public val carrierText: InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae? = null,
    /**
     * A lookup key used to retrieve personalization designs dynamically from a static string. This may be up to 200
     * characters.
     */
    public val lookupKey: String? = null,
    /**
     * Friendly display name.
     */
    public val name: String? = null,
) {
    public class Builder {
        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var metadataValue: Map<String, String>? = null

        public var metadata: Map<String, String>
            get() = requireNotNull(metadataValue) { "metadata is required" }
            set(`value`) {
                metadataValue = value
            }

        private var objectValueValue: InlineIssuingPersonalizationDesignObjectValueX8418564b? = null

        public var objectValue: InlineIssuingPersonalizationDesignObjectValueX8418564b
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var physicalBundleValue: InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3? =
            null

        public var physicalBundle: InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3
            get() = requireNotNull(physicalBundleValue) { "physicalBundle is required" }
            set(`value`) {
                physicalBundleValue = value
            }

        private var preferencesValue: IssuingPersonalizationDesignPreferences? = null

        public var preferences: IssuingPersonalizationDesignPreferences
            get() = requireNotNull(preferencesValue) { "preferences is required" }
            set(`value`) {
                preferencesValue = value
            }

        private var rejectionReasonsValue: IssuingPersonalizationDesignRejectionReasons? = null

        public var rejectionReasons: IssuingPersonalizationDesignRejectionReasons
            get() = requireNotNull(rejectionReasonsValue) { "rejectionReasons is required" }
            set(`value`) {
                rejectionReasonsValue = value
            }

        private var statusValue: InlineIssuingPersonalizationDesignStatusX112137d7? = null

        public var status: InlineIssuingPersonalizationDesignStatusX112137d7
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * The file for the card logo to use with physical bundles that support card logos. Must have a `purpose` value of
         * `issuing_logo`. Image must be in PNG format with dimensions of 1000px by 200px. It must be a binary (black and
         * white) image containing a black logo on a white background. We don't accept grayscale.
         */
        public var cardLogo: InlineIssuingPersonalizationDesignCardLogoX9055fd98? = null

        /**
         * Hash containing carrier text, for use with physical bundles that support carrier text.
         */
        public var carrierText: InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae? = null

        /**
         * A lookup key used to retrieve personalization designs dynamically from a static string. This may be up to 200
         * characters.
         */
        public var lookupKey: String? = null

        /**
         * Friendly display name.
         */
        public var name: String? = null

        public fun build(): IssuingPersonalizationDesign {
            check(createdValue != null) { "created is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(metadataValue != null) { "metadata is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(physicalBundleValue != null) { "physicalBundle is required" }
            check(preferencesValue != null) { "preferences is required" }
            check(rejectionReasonsValue != null) { "rejectionReasons is required" }
            check(statusValue != null) { "status is required" }
            return IssuingPersonalizationDesign(
                created = created,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                physicalBundle = physicalBundle,
                preferences = preferences,
                rejectionReasons = rejectionReasons,
                status = status,
                cardLogo = cardLogo,
                carrierText = carrierText,
                lookupKey = lookupKey,
                name = name,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingPersonalizationDesign = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingPersonalizationDesign> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingPersonalizationDesign {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingPersonalizationDesign")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingPersonalizationDesign must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val objectValue =
                json.decodeRequired<InlineIssuingPersonalizationDesignObjectValueX8418564b>(
                    rawObject,
                    "object",
                )
            val physicalBundle =
                json.decodeRequired<InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3>(
                    rawObject,
                    "physical_bundle",
                )
            val preferences = json.decodeRequired<IssuingPersonalizationDesignPreferences>(rawObject, "preferences")
            val rejectionReasons =
                json.decodeRequired<IssuingPersonalizationDesignRejectionReasons>(
                    rawObject,
                    "rejection_reasons",
                )
            val status = json.decodeRequired<InlineIssuingPersonalizationDesignStatusX112137d7>(rawObject, "status")
            return IssuingPersonalizationDesign(
                created = created,
                id = id,
                livemode = livemode,
                metadata = metadata,
                objectValue = objectValue,
                physicalBundle = physicalBundle,
                preferences = preferences,
                rejectionReasons = rejectionReasons,
                status = status,
                cardLogo =
                    rawObject["card_logo"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingPersonalizationDesignCardLogoX9055fd98?>(element)
                        }
                    },
                carrierText =
                    rawObject["carrier_text"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae?>(element)
                        }
                    },
                lookupKey =
                    rawObject["lookup_key"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                name =
                    rawObject["name"]?.let { element ->
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
            `value`: IssuingPersonalizationDesign,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingPersonalizationDesign")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("physical_bundle", json.encodeToJsonElement(value.physicalBundle))
                    put("preferences", json.encodeToJsonElement(value.preferences))
                    put("rejection_reasons", json.encodeToJsonElement(value.rejectionReasons))
                    put("status", json.encodeToJsonElement(value.status))
                    value.cardLogo?.let { put("card_logo", json.encodeToJsonElement(it)) }
                    value.carrierText?.let { put("carrier_text", json.encodeToJsonElement(it)) }
                    value.lookupKey?.let { put("lookup_key", it) }
                    value.name?.let { put("name", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingPersonalizationDesign(
    block: IssuingPersonalizationDesign.Builder.() -> Unit,
): IssuingPersonalizationDesign = IssuingPersonalizationDesign.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("IssuingPersonalizationDesign is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}

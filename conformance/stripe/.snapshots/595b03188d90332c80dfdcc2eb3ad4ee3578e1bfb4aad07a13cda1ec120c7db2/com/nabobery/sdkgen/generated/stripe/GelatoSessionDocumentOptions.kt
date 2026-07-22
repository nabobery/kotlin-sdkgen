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
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_document_options
 */
@Serializable(with = GelatoSessionDocumentOptions.Serializer::class)
public class GelatoSessionDocumentOptions(
    /**
     * Array of strings of allowed identity document types. If the provided identity document isn’t one of the allowed
     * types, the verification check will fail with a document_type_not_allowed error code.
     */
    public val allowedTypes: List<InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94>? = null,
    /**
     * Collect an ID number and perform an [ID number
     * check](https://docs.stripe.com/identity/verification-checks?type=id-number) with the document’s extracted name and
     * date of birth.
     */
    public val requireIdNumber: Boolean? = null,
    /**
     * Disable image uploads, identity document images have to be captured using the device’s camera.
     */
    public val requireLiveCapture: Boolean? = null,
    /**
     * Capture a face image and perform a [selfie check](https://docs.stripe.com/identity/verification-checks?type=selfie)
     * comparing a photo ID and a picture of your user’s face. [Learn more](https://docs.stripe.com/identity/selfie).
     */
    public val requireMatchingSelfie: Boolean? = null,
) {
    public class Builder {
        /**
         * Array of strings of allowed identity document types. If the provided identity document isn’t one of the allowed
         * types, the verification check will fail with a document_type_not_allowed error code.
         */
        public var allowedTypes: List<InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94>? =
            null

        /**
         * Collect an ID number and perform an [ID number
         * check](https://docs.stripe.com/identity/verification-checks?type=id-number) with the document’s extracted name
         * and date of birth.
         */
        public var requireIdNumber: Boolean? = null

        /**
         * Disable image uploads, identity document images have to be captured using the device’s camera.
         */
        public var requireLiveCapture: Boolean? = null

        /**
         * Capture a face image and perform a [selfie
         * check](https://docs.stripe.com/identity/verification-checks?type=selfie) comparing a photo ID and a picture of
         * your user’s face. [Learn more](https://docs.stripe.com/identity/selfie).
         */
        public var requireMatchingSelfie: Boolean? = null

        public fun build(): GelatoSessionDocumentOptions =
            GelatoSessionDocumentOptions(
                allowedTypes = allowedTypes,
                requireIdNumber = requireIdNumber,
                requireLiveCapture = requireLiveCapture,
                requireMatchingSelfie = requireMatchingSelfie,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoSessionDocumentOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoSessionDocumentOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoSessionDocumentOptions {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoSessionDocumentOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoSessionDocumentOptions must be a JSON object")
            return GelatoSessionDocumentOptions(
                allowedTypes =
                    rawObject["allowed_types"]?.let {
                        json.decodeFromJsonElement<List<InlineGelatoSessionDocumentOptionsAllowedTypesItemXcd341b94>>(
                            it,
                        )
                    },
                requireIdNumber = rawObject["require_id_number"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                requireLiveCapture = rawObject["require_live_capture"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                requireMatchingSelfie =
                    rawObject["require_matching_selfie"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: GelatoSessionDocumentOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoSessionDocumentOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.allowedTypes?.let { put("allowed_types", json.encodeToJsonElement(it)) }
                    value.requireIdNumber?.let { put("require_id_number", json.encodeToJsonElement(it)) }
                    value.requireLiveCapture?.let { put("require_live_capture", json.encodeToJsonElement(it)) }
                    value.requireMatchingSelfie?.let { put("require_matching_selfie", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun gelatoSessionDocumentOptions(
    block: GelatoSessionDocumentOptions.Builder.() -> Unit,
): GelatoSessionDocumentOptions = GelatoSessionDocumentOptions.build(block)

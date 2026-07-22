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
import kotlin.String
import kotlin.Unit

@Serializable
public data class IssuingCardShippingAddressValidationView(
    public val mode: InlineIssuingCardShippingAddressValidationModeXe5f152f0,
    @SerialName("normalized_address")
    public val normalizedAddress: InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a? = null,
    public val result: InlineIssuingCardShippingAddressValidationResultXfbdb4a26? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping_address_validation
 */
@Serializable(with = IssuingCardShippingAddressValidation.Serializer::class)
public class IssuingCardShippingAddressValidation(
    /**
     * The address validation capabilities to use.
     */
    public val mode: InlineIssuingCardShippingAddressValidationModeXe5f152f0,
    /**
     * The normalized shipping address.
     */
    public val normalizedAddress: InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a? = null,
    /**
     * The validation result for the shipping address.
     */
    public val result: InlineIssuingCardShippingAddressValidationResultXfbdb4a26? = null,
) {
    public class Builder {
        private var modeValue: InlineIssuingCardShippingAddressValidationModeXe5f152f0? = null

        public var mode: InlineIssuingCardShippingAddressValidationModeXe5f152f0
            get() = requireNotNull(modeValue) { "mode is required" }
            set(`value`) {
                modeValue = value
            }

        /**
         * The normalized shipping address.
         */
        public var normalizedAddress:
            InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a? = null

        /**
         * The validation result for the shipping address.
         */
        public var result: InlineIssuingCardShippingAddressValidationResultXfbdb4a26? = null

        public fun build(): IssuingCardShippingAddressValidation {
            check(modeValue != null) { "mode is required" }
            return IssuingCardShippingAddressValidation(
                mode = mode,
                normalizedAddress = normalizedAddress,
                result = result,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingCardShippingAddressValidation =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingCardShippingAddressValidation> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingCardShippingAddressValidation {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingCardShippingAddressValidation")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingCardShippingAddressValidation must be a JSON object")
            val mode = json.decodeRequired<InlineIssuingCardShippingAddressValidationModeXe5f152f0>(rawObject, "mode")
            return IssuingCardShippingAddressValidation(
                mode = mode,
                normalizedAddress =
                    rawObject["normalized_address"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a?>(
                                    element,
                                )
                        }
                    },
                result =
                    rawObject["result"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingCardShippingAddressValidationResultXfbdb4a26?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingCardShippingAddressValidation,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingCardShippingAddressValidation")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("mode", json.encodeToJsonElement(value.mode))
                    value.normalizedAddress?.let { put("normalized_address", json.encodeToJsonElement(it)) }
                    value.result?.let { put("result", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingCardShippingAddressValidation(
    block: IssuingCardShippingAddressValidation.Builder.() -> Unit,
): IssuingCardShippingAddressValidation = IssuingCardShippingAddressValidation.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "IssuingCardShippingAddressValidation is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

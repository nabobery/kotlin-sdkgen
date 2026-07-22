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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_personalization_design_rejection_reasons
 */
@Serializable(with = IssuingPersonalizationDesignRejectionReasons.Serializer::class)
public class IssuingPersonalizationDesignRejectionReasons(
    /**
     * The reason(s) the card logo was rejected.
     */
    public val cardLogo: List<InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81>? = null,
    /**
     * The reason(s) the carrier text was rejected.
     */
    public val carrierText: List<InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351>? = null,
) {
    public class Builder {
        /**
         * The reason(s) the card logo was rejected.
         */
        public var cardLogo:
            List<InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81>? = null

        /**
         * The reason(s) the carrier text was rejected.
         */
        public var carrierText:
            List<InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351>? = null

        public fun build(): IssuingPersonalizationDesignRejectionReasons =
            IssuingPersonalizationDesignRejectionReasons(
                cardLogo = cardLogo,
                carrierText = carrierText,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingPersonalizationDesignRejectionReasons =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingPersonalizationDesignRejectionReasons> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingPersonalizationDesignRejectionReasons {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingPersonalizationDesignRejectionReasons")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "IssuingPersonalizationDesignRejectionReasons must be a JSON object",
                    )
            return IssuingPersonalizationDesignRejectionReasons(
                cardLogo =
                    rawObject["card_logo"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81>?>(
                                    element,
                                )
                        }
                    },
                carrierText =
                    rawObject["carrier_text"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351>?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingPersonalizationDesignRejectionReasons,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingPersonalizationDesignRejectionReasons")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.cardLogo?.let { put("card_logo", json.encodeToJsonElement(it)) }
                    value.carrierText?.let { put("carrier_text", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingPersonalizationDesignRejectionReasons(
    block: IssuingPersonalizationDesignRejectionReasons.Builder.() -> Unit,
): IssuingPersonalizationDesignRejectionReasons = IssuingPersonalizationDesignRejectionReasons.build(block)

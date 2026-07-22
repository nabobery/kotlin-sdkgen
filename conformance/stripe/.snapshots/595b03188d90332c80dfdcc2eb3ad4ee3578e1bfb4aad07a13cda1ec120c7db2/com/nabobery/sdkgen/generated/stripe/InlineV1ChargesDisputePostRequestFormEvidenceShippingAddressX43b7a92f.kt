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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/prior_undisputed_transactions/items/properties/shipping_address
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f(
    public val city: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1CityX5352f11b? = null,
    public val country: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd? = null,
    public val line1: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1Xbf08e599? = null,
    public val line2: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551? = null,
    public val postalCode: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidencePostalCodeXb86ba1cc? = null,
    public val state: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc? = null,
) {
    public class Builder {
        public var city:
            InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1CityX5352f11b? = null

        public var country:
            InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd? = null

        public var line1: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1Xbf08e599? =
            null

        public var line2: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551? =
            null

        public var postalCode:
            InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidencePostalCodeXb86ba1cc? = null

        public var state: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc? =
            null

        public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f =
            InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f(
                city = city,
                country = country,
                line1 = line1,
                line2 = line2,
                postalCode = postalCode,
                state = state,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f must be a JSON object",
                    )
            return InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f(
                city =
                    rawObject["city"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1CityX5352f11b>(
                                it,
                            )
                    },
                country =
                    rawObject["country"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryX14353fdd>(
                                it,
                            )
                    },
                line1 =
                    rawObject["line1"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1Xbf08e599>(
                                it,
                            )
                    },
                line2 =
                    rawObject["line2"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2X890d7551>(
                                it,
                            )
                    },
                postalCode =
                    rawObject["postal_code"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidencePostalCodeXb86ba1cc>(
                                it,
                            )
                    },
                state =
                    rawObject["state"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateXf42cd4cc>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.city?.let { put("city", json.encodeToJsonElement(it)) }
                    value.country?.let { put("country", json.encodeToJsonElement(it)) }
                    value.line1?.let { put("line1", json.encodeToJsonElement(it)) }
                    value.line2?.let { put("line2", json.encodeToJsonElement(it)) }
                    value.postalCode?.let { put("postal_code", json.encodeToJsonElement(it)) }
                    value.state?.let { put("state", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f(
    block: InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f.Builder.() -> Unit,
): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f =
    InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX43b7a92f.build(block)

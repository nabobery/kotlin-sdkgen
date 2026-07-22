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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109(
    public val disputedTransaction: InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9? = null,
    public val priorUndisputedTransactions:
        List<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f>? = null,
) {
    public class Builder {
        public var disputedTransaction:
            InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9? = null

        public var priorUndisputedTransactions:
            List<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f>? = null

        public fun build(): InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109 =
            InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109(
                disputedTransaction = disputedTransaction,
                priorUndisputedTransactions = priorUndisputedTransactions,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109 must be a JSON object",
                    )
            return InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109(
                disputedTransaction =
                    rawObject["disputed_transaction"]?.let {
                        json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceDisputedTransactionXc205d1b9>(
                            it,
                        )
                    },
                priorUndisputedTransactions =
                    rawObject["prior_undisputed_transactions"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1ItemX0cbb2a2f>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.disputedTransaction?.let { put("disputed_transaction", json.encodeToJsonElement(it)) }
                    value.priorUndisputedTransactions?.let {
                        put(
                            "prior_undisputed_transactions",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109(
    block: InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109.Builder.() -> Unit,
): InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109 =
    InlineV1DisputesPostRequestFormEvidenceVisaCompellingEvidence3Xdfec3109.build(block)

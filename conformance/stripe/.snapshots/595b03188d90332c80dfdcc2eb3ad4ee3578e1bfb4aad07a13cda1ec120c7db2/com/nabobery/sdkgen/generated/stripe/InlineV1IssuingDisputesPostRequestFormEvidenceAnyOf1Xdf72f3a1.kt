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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/evidence/properties/service_not_as_described/anyOf/0
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1(
    public val additionalDocumentation:
        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXfcc766a3? = null,
    public val canceledAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1? = null,
    public val cancellationReason: InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af? = null,
    public val explanation: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXee53e5b1? = null,
    public val receivedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464? = null,
) {
    public class Builder {
        public var additionalDocumentation:
            InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXfcc766a3? = null

        public var canceledAt: InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1? = null

        public var cancellationReason:
            InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af? = null

        public var explanation: InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXee53e5b1? =
            null

        public var receivedAt: InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464? = null

        public fun build(): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1 =
            InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1(
                additionalDocumentation = additionalDocumentation,
                canceledAt = canceledAt,
                cancellationReason = cancellationReason,
                explanation = explanation,
                receivedAt = receivedAt,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1 must be a JSON object",
                    )
            return InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1(
                additionalDocumentation =
                    rawObject["additional_documentation"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationXfcc766a3>(
                                it,
                            )
                    },
                canceledAt =
                    rawObject["canceled_at"]?.let {
                        json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCanceledAtXf0bc65e1>(
                            it,
                        )
                    },
                cancellationReason =
                    rawObject["cancellation_reason"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceCancellationReasonX554063af>(
                                it,
                            )
                    },
                explanation =
                    rawObject["explanation"]?.let {
                        json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceExplanationXee53e5b1>(
                            it,
                        )
                    },
                receivedAt =
                    rawObject["received_at"]?.let {
                        json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceReceivedAtXff021464>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.additionalDocumentation?.let { put("additional_documentation", json.encodeToJsonElement(it)) }
                    value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
                    value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
                    value.explanation?.let { put("explanation", json.encodeToJsonElement(it)) }
                    value.receivedAt?.let { put("received_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1(
    block: InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1.Builder.() -> Unit,
): InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1 =
    InlineV1IssuingDisputesPostRequestFormEvidenceAnyOf1Xdf72f3a1.build(block)

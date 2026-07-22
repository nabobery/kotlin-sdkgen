package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Branch {
    Branch1,
    InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd,
}

public sealed class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2NoMatchException(
    message: String,
) : InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2DecodingException(message)

internal data class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0/properties/additional_documentation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/evidence/properties/other/anyOf/0/properties/additional_documentation
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd:
        InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd) {
                    add(
                        InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Branch.InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2 {
            val inspection = inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2NoMatchException(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2(
    element: JsonElement,
): InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd =
        element
            .isJsonDecodable<InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd>()
    return InlineV1IssuingDisputesPostRequestFormEvidenceAdditionalDocumentationX91df73c2Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd = matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd) {
                    add(
                        "InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd: value does not match InlineV1IssuingDisputesPostRequestFormEvidenceOtherAnyOf1AnyOf2Xfcc688bd",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Branch {
    Branch1,
    File,
}

public sealed class InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95NoMatchException(
    message: String,
) : InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95DecodingException(message)

internal data class InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Inspection(
    public val matchesBranch1: Boolean,
    public val matchesFile: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Additional documentation supporting the dispute.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_not_received_evidence/properties/additional_document
 * ation
 */
@Serializable(with = InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95.Serializer::class)
public class InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val `file`: File? by
        lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

    public val matchedBranches:
        Set<InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Branch.Branch1,
                    )
                }
                if (inspection.matchesFile) {
                    add(
                        InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Branch.File,
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
        ): InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95 {
            val inspection = inspectInlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95NoMatchException(
                    "InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95(
    element: JsonElement,
): InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesFile = element.isJsonDecodable<File>()
    return InlineIssuingDisputeNotReceivedEvidenceAdditionalDocumentationX80cf7c95Inspection(
        matchesBranch1 = matchesBranch1,
        matchesFile = matchesFile,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesFile) add("File: value does not match File")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

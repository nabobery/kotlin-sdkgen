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

public enum class InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eBranch {
    Branch1,
    File,
}

public sealed class InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eNoMatchException(
    message: String,
) : InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eDecodingException(message)

internal data class InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/issuing_dispute_canceled_evidence/properties/additional_documentatio
 * n
 */
@Serializable(with = InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e.Serializer::class)
public class InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val `file`: File? by
        lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

    public val matchedBranches:
        Set<InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eBranch.Branch1,
                    )
                }
                if (inspection.matchesFile) {
                    add(
                        InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eBranch.File,
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
        ): InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e {
            val inspection = inspectInlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eNoMatchException(
                    "InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331e(
    element: JsonElement,
): InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesFile = element.isJsonDecodable<File>()
    return InlineIssuingDisputeCanceledEvidenceAdditionalDocumentationX7b60331eInspection(
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

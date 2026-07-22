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

public enum class InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebBranch {
    Branch1,
    File,
}

public sealed class InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebNoMatchException(
    message: String,
) : InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebDecodingException(message)

internal data class InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebInspection(
    public val matchesBranch1: Boolean,
    public val matchesFile: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Copy of the card statement showing that the
 * product had already been paid for.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_dispute_duplicate_evidence/properties/card_statement
 */
@Serializable(with = InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb.Serializer::class)
public class InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val `file`: File? by
        lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

    public val matchedBranches: Set<InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebBranch.Branch1,
                    )
                }
                if (inspection.matchesFile) add(InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebBranch.File)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb {
            val inspection = inspectInlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebNoMatchException(
                    "InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362eb(
    element: JsonElement,
): InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesFile = element.isJsonDecodable<File>()
    return InlineIssuingDisputeDuplicateEvidenceCardStatementXbf9362ebInspection(
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

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

public enum class InlineDisputeEvidenceReceiptXefa00443Branch {
    Branch1,
    File,
}

public sealed class InlineDisputeEvidenceReceiptXefa00443DecodingException(
    message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceReceiptXefa00443NoMatchException(
    message: String,
) : InlineDisputeEvidenceReceiptXefa00443DecodingException(message)

internal data class InlineDisputeEvidenceReceiptXefa00443Inspection(
    public val matchesBranch1: Boolean,
    public val matchesFile: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Any receipt or message sent to the customer
 * notifying them of the charge.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/receipt
 */
@Serializable(with = InlineDisputeEvidenceReceiptXefa00443.Serializer::class)
public class InlineDisputeEvidenceReceiptXefa00443 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineDisputeEvidenceReceiptXefa00443Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val `file`: File? by
        lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

    public val matchedBranches: Set<InlineDisputeEvidenceReceiptXefa00443Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineDisputeEvidenceReceiptXefa00443Branch.Branch1)
                if (inspection.matchesFile) add(InlineDisputeEvidenceReceiptXefa00443Branch.File)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineDisputeEvidenceReceiptXefa00443 {
            val inspection = inspectInlineDisputeEvidenceReceiptXefa00443(raw)
            if (inspection.matchCount == 0) {
                throw InlineDisputeEvidenceReceiptXefa00443NoMatchException(
                    "InlineDisputeEvidenceReceiptXefa00443 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineDisputeEvidenceReceiptXefa00443(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineDisputeEvidenceReceiptXefa00443> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineDisputeEvidenceReceiptXefa00443 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceReceiptXefa00443")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDisputeEvidenceReceiptXefa00443,
        ) {
            encoder.requireJsonEncoder("InlineDisputeEvidenceReceiptXefa00443").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineDisputeEvidenceReceiptXefa00443(
    element: JsonElement,
): InlineDisputeEvidenceReceiptXefa00443Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesFile = element.isJsonDecodable<File>()
    return InlineDisputeEvidenceReceiptXefa00443Inspection(
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

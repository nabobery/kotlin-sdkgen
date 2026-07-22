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

public enum class InlineDisputeEvidenceShippingDocumentationX5192d247Branch {
    Branch1,
    File,
}

public sealed class InlineDisputeEvidenceShippingDocumentationX5192d247DecodingException(
    message: String,
) : SerializationException(message)

public class InlineDisputeEvidenceShippingDocumentationX5192d247NoMatchException(
    message: String,
) : InlineDisputeEvidenceShippingDocumentationX5192d247DecodingException(message)

internal data class InlineDisputeEvidenceShippingDocumentationX5192d247Inspection(
    public val matchesBranch1: Boolean,
    public val matchesFile: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) Documentation showing proof that a product was
 * shipped to the customer at the same address the customer provided to you. This could include a copy of the shipment
 * receipt, shipping label, etc. It should show the customer's full shipping address, if possible.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_evidence/properties/shipping_documentation
 */
@Serializable(with = InlineDisputeEvidenceShippingDocumentationX5192d247.Serializer::class)
public class InlineDisputeEvidenceShippingDocumentationX5192d247 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineDisputeEvidenceShippingDocumentationX5192d247Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val `file`: File? by
        lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

    public val matchedBranches: Set<InlineDisputeEvidenceShippingDocumentationX5192d247Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineDisputeEvidenceShippingDocumentationX5192d247Branch.Branch1)
                if (inspection.matchesFile) add(InlineDisputeEvidenceShippingDocumentationX5192d247Branch.File)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineDisputeEvidenceShippingDocumentationX5192d247 {
            val inspection = inspectInlineDisputeEvidenceShippingDocumentationX5192d247(raw)
            if (inspection.matchCount == 0) {
                throw InlineDisputeEvidenceShippingDocumentationX5192d247NoMatchException(
                    "InlineDisputeEvidenceShippingDocumentationX5192d247 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineDisputeEvidenceShippingDocumentationX5192d247(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineDisputeEvidenceShippingDocumentationX5192d247> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineDisputeEvidenceShippingDocumentationX5192d247 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeEvidenceShippingDocumentationX5192d247")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDisputeEvidenceShippingDocumentationX5192d247,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineDisputeEvidenceShippingDocumentationX5192d247",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineDisputeEvidenceShippingDocumentationX5192d247(
    element: JsonElement,
): InlineDisputeEvidenceShippingDocumentationX5192d247Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesFile = element.isJsonDecodable<File>()
    return InlineDisputeEvidenceShippingDocumentationX5192d247Inspection(
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

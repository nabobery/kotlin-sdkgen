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

public enum class InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Branch {
    Branch1,
    InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980,
}

public sealed class InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0NoMatchException(
    message: String,
) : InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0DecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/visa/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/visa/properties/files/items
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980:
        InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Branch.InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980,
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
        ): InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0 {
            val inspection = inspectInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0NoMatchException(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0(
    element: JsonElement,
): InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980 =
        element
            .isJsonDecodable<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980>()
    return InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980 = matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980) {
                    add(
                        "InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980: value does not match InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cBranch {
    InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586,
    InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b,
}

public sealed class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cNoMatchException(
    message: String,
) : InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cDecodingException(message)

internal data class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cInspection(
    public val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586: Boolean,
    public val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586,
                matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cInspection,
) {
    public val inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586:
        InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586) {
                json
                    .decodeFromJsonElement<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b:
        InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b) {
                json
                    .decodeFromJsonElement<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586) {
                    add(
                        InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cBranch.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586,
                    )
                }
                if (inspection.matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b) {
                    add(
                        InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cBranch.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b,
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
        ): InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c {
            val inspection = inspectInlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cNoMatchException(
                    "InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c(
    element: JsonElement,
): InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cInspection {
    val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 =
        element
            .isJsonDecodable<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586>()
    val matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b =
        element
            .isJsonDecodable<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b>()
    return InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753cInspection(
        matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 = matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586,
        matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b = matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b,
        failures =
            buildList {
                if (!matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586) {
                    add(
                        "InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586: value does not match InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586",
                    )
                }
                if (!matchesInlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b) {
                    add(
                        "InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b: value does not match InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

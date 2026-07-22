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

public enum class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Branch {
    Branch1,
    InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5,
}

public sealed class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8NoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8DecodingException(message)

internal data class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/business_profile/properties/support_url.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/business_profile/properties/support_url
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8.Serializer::class)
public class InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5:
        InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5) {
                    add(
                        InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Branch.InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5,
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
        ): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8 {
            val inspection = inspectInlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8NoMatchException(
                    "InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8(
    element: JsonElement,
): InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5 =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5>()
    return InlineV1AccountsPostRequestFormBusinessProfileSupportUrlX73db74f8Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5 = matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5) {
                    add(
                        "InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5: value does not match InlineV1AccountsPostRequestFormBusinessProfileSupportUrlAnyOf2X8ec962e5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

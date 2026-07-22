package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Branch {
    Branch1,
    InlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44,
}

public sealed class InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4NoMatchException(
    message: String,
) : InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4DecodingException(message)

internal data class InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44,
            ).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1external_accounts~1{id}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4.Serializer::class)
public class InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44:
        InlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44) {
                json
                    .decodeFromJsonElement<InlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44) {
                    add(
                        InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Branch.InlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44,
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
        ): InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4 {
            val inspection = inspectInlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4NoMatchException(
                    "InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4(
    element: JsonElement,
): InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44 =
        element
            .isJsonDecodable<InlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44>()
    return InlineV1ExternalAccountsPostRequestFormMetadataX1645c9f4Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44 = matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44) {
                    add(
                        "InlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44: value does not match InlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

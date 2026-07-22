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

public enum class InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Branch {
    Branch1,
    InlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92,
}

public sealed class InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3NoMatchException(
    message: String,
) : InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3DecodingException(message)

internal data class InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92,
            ).count {
                it
            }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts~1{id}/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3.Serializer::class)
public class InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92:
        InlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92) {
                json
                    .decodeFromJsonElement<InlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92) {
                    add(
                        InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Branch.InlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92,
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
        ): InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3 {
            val inspection = inspectInlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3NoMatchException(
                    "InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3(
    element: JsonElement,
): InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92 =
        element
            .isJsonDecodable<InlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92>()
    return InlineV1AccountsExternalAccountsPostRequestFormMetadataX8bd568b3Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92 = matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92) {
                    add(
                        "InlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92: value does not match InlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

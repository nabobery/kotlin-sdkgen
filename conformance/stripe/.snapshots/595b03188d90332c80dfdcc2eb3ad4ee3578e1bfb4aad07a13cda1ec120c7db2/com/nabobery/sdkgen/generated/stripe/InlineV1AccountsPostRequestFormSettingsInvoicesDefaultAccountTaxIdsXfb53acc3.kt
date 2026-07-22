package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Branch {
    Branch1,
    InlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1,
}

public sealed class InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3NoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3DecodingException(message)

internal data class InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/invoices/properties/default_account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/invoices/properties/default_account_tax_ids
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1:
        InlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1) {
                    add(
                        InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Branch.InlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1,
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
        ): InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3 {
            val inspection = inspectInlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3NoMatchException(
                    "InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3(
    element: JsonElement,
): InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1 =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1>()
    return InlineV1AccountsPostRequestFormSettingsInvoicesDefaultAccountTaxIdsXfb53acc3Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1 = matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1) {
                    add(
                        "InlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1: value does not match InlineV1AccountsPostRequestFormSettingsInvoicesAnyOf2Xa5cf7aa1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

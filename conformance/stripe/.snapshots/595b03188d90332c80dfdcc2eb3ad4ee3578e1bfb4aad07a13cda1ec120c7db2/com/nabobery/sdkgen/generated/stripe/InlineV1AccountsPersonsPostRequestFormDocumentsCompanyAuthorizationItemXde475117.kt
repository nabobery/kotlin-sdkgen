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

public enum class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Branch {
    Branch1,
    InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483,
}

public sealed class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117NoMatchException(
    message: String,
) : InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117DecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483:
        InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Branch.InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483,
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
        ): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117 {
            val inspection =
                inspectInlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117NoMatchException(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117(
    element: JsonElement,
): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483 =
        element
            .isJsonDecodable<InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483>()
    return InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemXde475117Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483 = matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483) {
                    add(
                        "InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483: value does not match InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2X2557c483",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

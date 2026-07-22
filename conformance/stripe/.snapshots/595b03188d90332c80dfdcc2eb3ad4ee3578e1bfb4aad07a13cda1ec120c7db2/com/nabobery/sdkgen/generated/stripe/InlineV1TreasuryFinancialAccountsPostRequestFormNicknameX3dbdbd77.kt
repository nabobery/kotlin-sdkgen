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

public enum class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Branch {
    Branch1,
    InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81,
}

public sealed class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77NoMatchException(
    message: String,
) : InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77DecodingException(message)

internal data class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81,
            ).count {
                it
            }
}

/**
 * The nickname for the FinancialAccount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/nickname
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81:
        InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81) {
                json
                    .decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81) {
                    add(
                        InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Branch.InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81,
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
        ): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77 {
            val inspection = inspectInlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77NoMatchException(
                    "InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77(
    element: JsonElement,
): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81 =
        element
            .isJsonDecodable<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81>()
    return InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81 = matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81) {
                    add(
                        "InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81: value does not match InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X6f327b81",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

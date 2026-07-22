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

public enum class InlineV1AccountsPostRequestFormBankAccountX631136d5Branch {
    InlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f,
    Branch2,
}

public sealed class InlineV1AccountsPostRequestFormBankAccountX631136d5DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormBankAccountX631136d5NoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormBankAccountX631136d5DecodingException(message)

internal data class InlineV1AccountsPostRequestFormBankAccountX631136d5Inspection(
    public val matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f, matchesBranch2).count { it }
}

/**
 * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
 * user's bank account details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/bank_account
 */
@Serializable(with = InlineV1AccountsPostRequestFormBankAccountX631136d5.Serializer::class)
public class InlineV1AccountsPostRequestFormBankAccountX631136d5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormBankAccountX631136d5Inspection,
) {
    public val inlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f:
        InlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

    public val matchedBranches: Set<InlineV1AccountsPostRequestFormBankAccountX631136d5Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f) {
                    add(
                        InlineV1AccountsPostRequestFormBankAccountX631136d5Branch.InlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1AccountsPostRequestFormBankAccountX631136d5Branch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1AccountsPostRequestFormBankAccountX631136d5 {
            val inspection = inspectInlineV1AccountsPostRequestFormBankAccountX631136d5(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormBankAccountX631136d5NoMatchException(
                    "InlineV1AccountsPostRequestFormBankAccountX631136d5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormBankAccountX631136d5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBankAccountX631136d5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBankAccountX631136d5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormBankAccountX631136d5")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormBankAccountX631136d5,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormBankAccountX631136d5",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormBankAccountX631136d5(
    element: JsonElement,
): InlineV1AccountsPostRequestFormBankAccountX631136d5Inspection {
    val matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f>()
    val matchesBranch2 = element.isJsonDecodable<String>()
    return InlineV1AccountsPostRequestFormBankAccountX631136d5Inspection(
        matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f = matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f) {
                    add(
                        "InlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f: value does not match InlineV1AccountsPostRequestFormBankAccountAnyOf1Xb37b485f",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match String")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

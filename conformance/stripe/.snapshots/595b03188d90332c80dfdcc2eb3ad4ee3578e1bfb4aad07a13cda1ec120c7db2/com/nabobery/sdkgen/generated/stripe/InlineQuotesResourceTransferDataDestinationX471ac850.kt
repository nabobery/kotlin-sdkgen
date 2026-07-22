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

public enum class InlineQuotesResourceTransferDataDestinationX471ac850Branch {
    Branch1,
    Account,
}

public sealed class InlineQuotesResourceTransferDataDestinationX471ac850DecodingException(
    message: String,
) : SerializationException(message)

public class InlineQuotesResourceTransferDataDestinationX471ac850NoMatchException(
    message: String,
) : InlineQuotesResourceTransferDataDestinationX471ac850DecodingException(message)

internal data class InlineQuotesResourceTransferDataDestinationX471ac850Inspection(
    public val matchesBranch1: Boolean,
    public val matchesAccount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account where funds from the payment will be transferred to upon payment success.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quotes_resource_transfer_data/properties/destination
 */
@Serializable(with = InlineQuotesResourceTransferDataDestinationX471ac850.Serializer::class)
public class InlineQuotesResourceTransferDataDestinationX471ac850 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineQuotesResourceTransferDataDestinationX471ac850Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val account: Account? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

    public val matchedBranches: Set<InlineQuotesResourceTransferDataDestinationX471ac850Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineQuotesResourceTransferDataDestinationX471ac850Branch.Branch1)
                if (inspection.matchesAccount) add(InlineQuotesResourceTransferDataDestinationX471ac850Branch.Account)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineQuotesResourceTransferDataDestinationX471ac850 {
            val inspection = inspectInlineQuotesResourceTransferDataDestinationX471ac850(raw)
            if (inspection.matchCount == 0) {
                throw InlineQuotesResourceTransferDataDestinationX471ac850NoMatchException(
                    "InlineQuotesResourceTransferDataDestinationX471ac850 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineQuotesResourceTransferDataDestinationX471ac850(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineQuotesResourceTransferDataDestinationX471ac850> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineQuotesResourceTransferDataDestinationX471ac850 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineQuotesResourceTransferDataDestinationX471ac850")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineQuotesResourceTransferDataDestinationX471ac850,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineQuotesResourceTransferDataDestinationX471ac850",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineQuotesResourceTransferDataDestinationX471ac850(
    element: JsonElement,
): InlineQuotesResourceTransferDataDestinationX471ac850Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesAccount = element.isJsonDecodable<Account>()
    return InlineQuotesResourceTransferDataDestinationX471ac850Inspection(
        matchesBranch1 = matchesBranch1,
        matchesAccount = matchesAccount,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesAccount) add("Account: value does not match Account")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

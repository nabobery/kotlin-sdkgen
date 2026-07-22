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

public enum class InlineQuoteOnBehalfOfXcdb50ea5Branch {
    Branch1,
    Account,
}

public sealed class InlineQuoteOnBehalfOfXcdb50ea5DecodingException(
    message: String,
) : SerializationException(message)

public class InlineQuoteOnBehalfOfXcdb50ea5NoMatchException(
    message: String,
) : InlineQuoteOnBehalfOfXcdb50ea5DecodingException(message)

internal data class InlineQuoteOnBehalfOfXcdb50ea5Inspection(
    public val matchesBranch1: Boolean,
    public val matchesAccount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account on behalf of which to charge. See the [Connect
 * documentation](https://support.stripe.com/questions/sending-invoices-on-behalf-of-connected-accounts) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/on_behalf_of
 */
@Serializable(with = InlineQuoteOnBehalfOfXcdb50ea5.Serializer::class)
public class InlineQuoteOnBehalfOfXcdb50ea5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineQuoteOnBehalfOfXcdb50ea5Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val account: Account? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

    public val matchedBranches: Set<InlineQuoteOnBehalfOfXcdb50ea5Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineQuoteOnBehalfOfXcdb50ea5Branch.Branch1)
                if (inspection.matchesAccount) add(InlineQuoteOnBehalfOfXcdb50ea5Branch.Account)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineQuoteOnBehalfOfXcdb50ea5 {
            val inspection = inspectInlineQuoteOnBehalfOfXcdb50ea5(raw)
            if (inspection.matchCount == 0) {
                throw InlineQuoteOnBehalfOfXcdb50ea5NoMatchException(
                    "InlineQuoteOnBehalfOfXcdb50ea5 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineQuoteOnBehalfOfXcdb50ea5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineQuoteOnBehalfOfXcdb50ea5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineQuoteOnBehalfOfXcdb50ea5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteOnBehalfOfXcdb50ea5")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineQuoteOnBehalfOfXcdb50ea5,
        ) {
            encoder.requireJsonEncoder("InlineQuoteOnBehalfOfXcdb50ea5").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineQuoteOnBehalfOfXcdb50ea5(element: JsonElement): InlineQuoteOnBehalfOfXcdb50ea5Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesAccount = element.isJsonDecodable<Account>()
    return InlineQuoteOnBehalfOfXcdb50ea5Inspection(
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

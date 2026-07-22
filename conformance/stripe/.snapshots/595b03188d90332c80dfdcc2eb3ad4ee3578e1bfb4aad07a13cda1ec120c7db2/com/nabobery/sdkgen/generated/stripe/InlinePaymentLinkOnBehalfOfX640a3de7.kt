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

public enum class InlinePaymentLinkOnBehalfOfX640a3de7Branch {
    Branch1,
    Account,
}

public sealed class InlinePaymentLinkOnBehalfOfX640a3de7DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinkOnBehalfOfX640a3de7NoMatchException(
    message: String,
) : InlinePaymentLinkOnBehalfOfX640a3de7DecodingException(message)

internal data class InlinePaymentLinkOnBehalfOfX640a3de7Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/on_behalf_of
 */
@Serializable(with = InlinePaymentLinkOnBehalfOfX640a3de7.Serializer::class)
public class InlinePaymentLinkOnBehalfOfX640a3de7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinkOnBehalfOfX640a3de7Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val account: Account? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

    public val matchedBranches: Set<InlinePaymentLinkOnBehalfOfX640a3de7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlinePaymentLinkOnBehalfOfX640a3de7Branch.Branch1)
                if (inspection.matchesAccount) add(InlinePaymentLinkOnBehalfOfX640a3de7Branch.Account)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentLinkOnBehalfOfX640a3de7 {
            val inspection = inspectInlinePaymentLinkOnBehalfOfX640a3de7(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinkOnBehalfOfX640a3de7NoMatchException(
                    "InlinePaymentLinkOnBehalfOfX640a3de7 matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlinePaymentLinkOnBehalfOfX640a3de7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinkOnBehalfOfX640a3de7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinkOnBehalfOfX640a3de7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkOnBehalfOfX640a3de7")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinkOnBehalfOfX640a3de7,
        ) {
            encoder.requireJsonEncoder("InlinePaymentLinkOnBehalfOfX640a3de7").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinkOnBehalfOfX640a3de7(
    element: JsonElement,
): InlinePaymentLinkOnBehalfOfX640a3de7Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesAccount = element.isJsonDecodable<Account>()
    return InlinePaymentLinkOnBehalfOfX640a3de7Inspection(
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

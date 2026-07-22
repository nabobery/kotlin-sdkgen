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

public enum class InlineChargeOnBehalfOfXa14b2bb1Branch {
    Branch1,
    Account,
}

public sealed class InlineChargeOnBehalfOfXa14b2bb1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineChargeOnBehalfOfXa14b2bb1NoMatchException(
    message: String,
) : InlineChargeOnBehalfOfXa14b2bb1DecodingException(message)

internal data class InlineChargeOnBehalfOfXa14b2bb1Inspection(
    public val matchesBranch1: Boolean,
    public val matchesAccount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account (if any) the charge was made on behalf of without triggering an automatic transfer. See the [Connect
 * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/on_behalf_of
 */
@Serializable(with = InlineChargeOnBehalfOfXa14b2bb1.Serializer::class)
public class InlineChargeOnBehalfOfXa14b2bb1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineChargeOnBehalfOfXa14b2bb1Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val account: Account? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

    public val matchedBranches: Set<InlineChargeOnBehalfOfXa14b2bb1Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineChargeOnBehalfOfXa14b2bb1Branch.Branch1)
                if (inspection.matchesAccount) add(InlineChargeOnBehalfOfXa14b2bb1Branch.Account)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineChargeOnBehalfOfXa14b2bb1 {
            val inspection = inspectInlineChargeOnBehalfOfXa14b2bb1(raw)
            if (inspection.matchCount == 0) {
                throw InlineChargeOnBehalfOfXa14b2bb1NoMatchException(
                    "InlineChargeOnBehalfOfXa14b2bb1 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineChargeOnBehalfOfXa14b2bb1(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineChargeOnBehalfOfXa14b2bb1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineChargeOnBehalfOfXa14b2bb1 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineChargeOnBehalfOfXa14b2bb1")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineChargeOnBehalfOfXa14b2bb1,
        ) {
            encoder.requireJsonEncoder("InlineChargeOnBehalfOfXa14b2bb1").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineChargeOnBehalfOfXa14b2bb1(element: JsonElement): InlineChargeOnBehalfOfXa14b2bb1Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesAccount = element.isJsonDecodable<Account>()
    return InlineChargeOnBehalfOfXa14b2bb1Inspection(
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

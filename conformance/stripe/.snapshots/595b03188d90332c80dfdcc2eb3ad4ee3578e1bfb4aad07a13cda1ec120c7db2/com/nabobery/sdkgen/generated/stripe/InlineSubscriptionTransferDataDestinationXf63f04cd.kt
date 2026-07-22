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

public enum class InlineSubscriptionTransferDataDestinationXf63f04cdBranch {
    Branch1,
    Account,
}

public sealed class InlineSubscriptionTransferDataDestinationXf63f04cdDecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionTransferDataDestinationXf63f04cdNoMatchException(
    message: String,
) : InlineSubscriptionTransferDataDestinationXf63f04cdDecodingException(message)

internal data class InlineSubscriptionTransferDataDestinationXf63f04cdInspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_transfer_data/properties/destination
 */
@Serializable(with = InlineSubscriptionTransferDataDestinationXf63f04cd.Serializer::class)
public class InlineSubscriptionTransferDataDestinationXf63f04cd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionTransferDataDestinationXf63f04cdInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val account: Account? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

    public val matchedBranches: Set<InlineSubscriptionTransferDataDestinationXf63f04cdBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSubscriptionTransferDataDestinationXf63f04cdBranch.Branch1)
                if (inspection.matchesAccount) add(InlineSubscriptionTransferDataDestinationXf63f04cdBranch.Account)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineSubscriptionTransferDataDestinationXf63f04cd {
            val inspection = inspectInlineSubscriptionTransferDataDestinationXf63f04cd(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionTransferDataDestinationXf63f04cdNoMatchException(
                    "InlineSubscriptionTransferDataDestinationXf63f04cd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionTransferDataDestinationXf63f04cd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionTransferDataDestinationXf63f04cd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionTransferDataDestinationXf63f04cd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionTransferDataDestinationXf63f04cd")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionTransferDataDestinationXf63f04cd,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionTransferDataDestinationXf63f04cd",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionTransferDataDestinationXf63f04cd(
    element: JsonElement,
): InlineSubscriptionTransferDataDestinationXf63f04cdInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesAccount = element.isJsonDecodable<Account>()
    return InlineSubscriptionTransferDataDestinationXf63f04cdInspection(
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

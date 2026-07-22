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

public enum class InlinePaymentIntentOnBehalfOfXf11f3a8fBranch {
    Branch1,
    Account,
}

public sealed class InlinePaymentIntentOnBehalfOfXf11f3a8fDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentOnBehalfOfXf11f3a8fNoMatchException(
    message: String,
) : InlinePaymentIntentOnBehalfOfXf11f3a8fDecodingException(message)

internal data class InlinePaymentIntentOnBehalfOfXf11f3a8fInspection(
    public val matchesBranch1: Boolean,
    public val matchesAccount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * You can specify the settlement merchant as the
 * connected account using the `on_behalf_of` attribute on the charge. See the PaymentIntents [use case for connected
 * accounts](/payments/connected-accounts) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/on_behalf_of
 */
@Serializable(with = InlinePaymentIntentOnBehalfOfXf11f3a8f.Serializer::class)
public class InlinePaymentIntentOnBehalfOfXf11f3a8f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentOnBehalfOfXf11f3a8fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val account: Account? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

    public val matchedBranches: Set<InlinePaymentIntentOnBehalfOfXf11f3a8fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlinePaymentIntentOnBehalfOfXf11f3a8fBranch.Branch1)
                if (inspection.matchesAccount) add(InlinePaymentIntentOnBehalfOfXf11f3a8fBranch.Account)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentIntentOnBehalfOfXf11f3a8f {
            val inspection = inspectInlinePaymentIntentOnBehalfOfXf11f3a8f(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentOnBehalfOfXf11f3a8fNoMatchException(
                    "InlinePaymentIntentOnBehalfOfXf11f3a8f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentOnBehalfOfXf11f3a8f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentOnBehalfOfXf11f3a8f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentOnBehalfOfXf11f3a8f {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentOnBehalfOfXf11f3a8f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentOnBehalfOfXf11f3a8f,
        ) {
            encoder.requireJsonEncoder("InlinePaymentIntentOnBehalfOfXf11f3a8f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentOnBehalfOfXf11f3a8f(
    element: JsonElement,
): InlinePaymentIntentOnBehalfOfXf11f3a8fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesAccount = element.isJsonDecodable<Account>()
    return InlinePaymentIntentOnBehalfOfXf11f3a8fInspection(
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

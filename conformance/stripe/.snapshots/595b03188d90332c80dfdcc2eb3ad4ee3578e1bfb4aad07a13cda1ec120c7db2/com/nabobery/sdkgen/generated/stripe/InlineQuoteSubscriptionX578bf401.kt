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

public enum class InlineQuoteSubscriptionX578bf401Branch {
    Branch1,
    Subscription,
}

public sealed class InlineQuoteSubscriptionX578bf401DecodingException(
    message: String,
) : SerializationException(message)

public class InlineQuoteSubscriptionX578bf401NoMatchException(
    message: String,
) : InlineQuoteSubscriptionX578bf401DecodingException(message)

internal data class InlineQuoteSubscriptionX578bf401Inspection(
    public val matchesBranch1: Boolean,
    public val matchesSubscription: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesSubscription).count { it }
}

/**
 * The subscription that was created or updated from this quote.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/subscription
 */
@Serializable(with = InlineQuoteSubscriptionX578bf401.Serializer::class)
public class InlineQuoteSubscriptionX578bf401 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineQuoteSubscriptionX578bf401Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val subscription: Subscription? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSubscription) json.decodeFromJsonElement<Subscription>(raw) else null
        }

    public val matchedBranches: Set<InlineQuoteSubscriptionX578bf401Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineQuoteSubscriptionX578bf401Branch.Branch1)
                if (inspection.matchesSubscription) add(InlineQuoteSubscriptionX578bf401Branch.Subscription)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineQuoteSubscriptionX578bf401 {
            val inspection = inspectInlineQuoteSubscriptionX578bf401(raw)
            if (inspection.matchCount == 0) {
                throw InlineQuoteSubscriptionX578bf401NoMatchException(
                    "InlineQuoteSubscriptionX578bf401 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineQuoteSubscriptionX578bf401(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineQuoteSubscriptionX578bf401> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineQuoteSubscriptionX578bf401 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteSubscriptionX578bf401")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineQuoteSubscriptionX578bf401,
        ) {
            encoder.requireJsonEncoder("InlineQuoteSubscriptionX578bf401").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineQuoteSubscriptionX578bf401(element: JsonElement): InlineQuoteSubscriptionX578bf401Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesSubscription = element.isJsonDecodable<Subscription>()
    return InlineQuoteSubscriptionX578bf401Inspection(
        matchesBranch1 = matchesBranch1,
        matchesSubscription = matchesSubscription,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesSubscription) add("Subscription: value does not match Subscription")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

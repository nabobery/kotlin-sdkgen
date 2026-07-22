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

public enum class InlineV1SubscriptionsPostRequestFormTrialEndX48041713Branch {
    InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d,
    Branch2,
}

public sealed class InlineV1SubscriptionsPostRequestFormTrialEndX48041713DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormTrialEndX48041713NoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormTrialEndX48041713DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormTrialEndX48041713Inspection(
    public val matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d, matchesBranch2).count { it }
}

/**
 * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
 * time. If set, trial_end will override the default trial period of the plan the customer is being subscribed to. The
 * special value `now` can be provided to end the customer's trial immediately. Can be at most two years from
 * `billing_cycle_anchor`. See [Using trial periods on
 * subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to learn more.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/trial_end
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTrialEndX48041713.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormTrialEndX48041713 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormTrialEndX48041713Inspection,
) {
    public val inlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d:
        InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

    public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormTrialEndX48041713Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d) {
                    add(
                        InlineV1SubscriptionsPostRequestFormTrialEndX48041713Branch.InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1SubscriptionsPostRequestFormTrialEndX48041713Branch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1SubscriptionsPostRequestFormTrialEndX48041713 {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormTrialEndX48041713(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormTrialEndX48041713NoMatchException(
                    "InlineV1SubscriptionsPostRequestFormTrialEndX48041713 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormTrialEndX48041713(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTrialEndX48041713> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTrialEndX48041713 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormTrialEndX48041713")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormTrialEndX48041713,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormTrialEndX48041713",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormTrialEndX48041713(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormTrialEndX48041713Inspection {
    val matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1SubscriptionsPostRequestFormTrialEndX48041713Inspection(
        matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d = matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d: value does not match InlineV1SubscriptionsPostRequestFormTrialEndAnyOf1X16dd672d",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match Int")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

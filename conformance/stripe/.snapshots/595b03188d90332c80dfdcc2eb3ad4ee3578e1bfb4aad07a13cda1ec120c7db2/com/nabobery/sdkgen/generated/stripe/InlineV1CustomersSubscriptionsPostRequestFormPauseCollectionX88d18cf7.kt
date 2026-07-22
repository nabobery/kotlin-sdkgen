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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Branch {
    InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5,
    InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7NoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Inspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5,
                matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02,
            ).count {
                it
            }
}

/**
 * If specified, payment collection for this subscription will be paused. Note that the subscription status will be
 * unchanged and will not be updated to `paused`. Learn more about [pausing
 * collection](https://docs.stripe.com/billing/subscriptions/pause-payment).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/pause_collection
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Inspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5:
        InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02:
        InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Branch.InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Branch.InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7 {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7NoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Inspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02>()
    return InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionX88d18cf7Inspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5 = matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5,
        matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02 = matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5: value does not match InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf1X42b75df5",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02: value does not match InlineV1CustomersSubscriptionsPostRequestFormPauseCollectionAnyOf2X9b940f02",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

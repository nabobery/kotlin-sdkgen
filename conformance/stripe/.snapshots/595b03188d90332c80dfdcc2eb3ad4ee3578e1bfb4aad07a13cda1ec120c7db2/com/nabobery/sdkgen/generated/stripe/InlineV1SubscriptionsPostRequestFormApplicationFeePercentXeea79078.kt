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
import kotlin.Double
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Branch {
    Branch1,
    InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290,
}

public sealed class InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078NoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290,
            ).count {
                it
            }
}

/**
 * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
 * subscription invoice total that will be transferred to the application owner's Stripe account. The request must be
 * made by a platform account on a connected account in order to set an application fee percentage. For more
 * information, see the application fees
 * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/application_fee_percent
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Inspection,
) {
    public val branch1: Double? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

    public val inlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290:
        InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290) {
                    add(
                        InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Branch.InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290,
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
        ): InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078 {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078NoMatchException(
                    "InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Inspection {
    val matchesBranch1 = element.isJsonDecodable<Double>()
    val matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290>()
    return InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290 = matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Double")
                if (!matchesInlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290: value does not match InlineV1SubscriptionsPostRequestFormApplicationFeePercentAnyOf2X60394290",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

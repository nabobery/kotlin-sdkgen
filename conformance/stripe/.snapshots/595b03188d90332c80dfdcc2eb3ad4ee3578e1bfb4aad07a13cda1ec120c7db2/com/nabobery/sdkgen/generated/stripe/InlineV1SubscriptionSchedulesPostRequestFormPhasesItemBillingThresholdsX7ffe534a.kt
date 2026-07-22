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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aBranch {
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700,
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aNoMatchException(
    message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aInspection(
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700: Boolean,
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700,
                matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aInspection,
) {
    public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f,
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
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a {
            val inspection =
                inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aNoMatchException(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a(
    element: JsonElement,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aInspection {
    val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700 =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700>()
    val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f>()
    return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534aInspection(
        matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700,
        matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf1X2d165700",
                    )
                }
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X2c9c427f",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

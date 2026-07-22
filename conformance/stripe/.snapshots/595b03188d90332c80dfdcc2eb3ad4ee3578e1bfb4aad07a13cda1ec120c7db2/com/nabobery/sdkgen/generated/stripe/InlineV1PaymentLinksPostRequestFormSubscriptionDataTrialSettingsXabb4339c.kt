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

public enum class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cBranch {
    InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855,
    InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225,
}

public sealed class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cNoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cInspection(
    public val matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855,
                matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cInspection,
) {
    public val inlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855) {
                    add(
                        InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cBranch.InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225) {
                    add(
                        InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cBranch.InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225,
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
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cNoMatchException(
                    "InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cInspection {
    val matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855>()
    val matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225>()
    return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339cInspection(
        matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855 = matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855,
        matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225 = matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225,
        failures =
            buildList {
                if (!matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855: value does not match InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf1Xb0094855",
                    )
                }
                if (!matchesInlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225: value does not match InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsAnyOf2X57248225",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

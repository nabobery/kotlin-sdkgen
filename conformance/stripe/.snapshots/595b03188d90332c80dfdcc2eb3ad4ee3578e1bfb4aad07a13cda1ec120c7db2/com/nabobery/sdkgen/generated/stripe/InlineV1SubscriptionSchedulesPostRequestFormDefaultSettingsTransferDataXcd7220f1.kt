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

public enum class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Branch {
    InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a,
    InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1NoMatchException(
    message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Inspection(
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a: Boolean,
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a,
                matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/transfer_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/transfer_data
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Inspection,
) {
    public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a:
        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357:
        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357,
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
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1 {
            val inspection =
                inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1NoMatchException(
                    "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1(
    element: JsonElement,
): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Inspection {
    val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a>()
    val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357 =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357>()
    return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsTransferDataXcd7220f1Inspection(
        matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a,
        matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357 = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf1X7f55042a",
                    )
                }
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2Xf549c357",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

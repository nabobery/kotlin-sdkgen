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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bBranch {
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9,
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bNoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bInspection(
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9,
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bInspection,
) {
    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2,
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
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bNoMatchException(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2b(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bInspection {
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9>()
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2>()
    return InlineV1SubscriptionsPostRequestFormPaymentSettingsPixX96b74d2bInspection(
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9,
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xf0e0aec9",
                    )
                }
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X364fcef2",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

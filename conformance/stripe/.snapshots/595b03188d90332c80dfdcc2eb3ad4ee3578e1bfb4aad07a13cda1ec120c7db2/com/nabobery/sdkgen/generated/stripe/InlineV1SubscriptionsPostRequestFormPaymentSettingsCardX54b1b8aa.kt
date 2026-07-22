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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaBranch {
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1,
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaNoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaInspection(
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1,
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaInspection,
) {
    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a,
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
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaNoMatchException(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aa(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaInspection {
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1>()
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a>()
    return InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX54b1b8aaInspection(
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1,
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X4e52a4c1",
                    )
                }
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa1ad507a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

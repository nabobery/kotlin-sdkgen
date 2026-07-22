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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dBranch {
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e,
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dNoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dInspection(
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e,
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dInspection,
) {
    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582,
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
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dNoMatchException(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767d(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dInspection {
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e>()
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582>()
    return InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX46a4767dInspection(
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e,
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X27d1790e",
                    )
                }
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xb9773582",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

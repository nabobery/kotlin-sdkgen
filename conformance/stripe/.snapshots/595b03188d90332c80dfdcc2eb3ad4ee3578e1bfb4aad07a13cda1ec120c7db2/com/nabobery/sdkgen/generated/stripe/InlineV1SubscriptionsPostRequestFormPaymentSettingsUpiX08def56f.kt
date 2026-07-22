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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fBranch {
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676,
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fNoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fInspection(
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676,
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fInspection,
) {
    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12,
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
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fNoMatchException(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56f(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fInspection {
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676>()
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12>()
    return InlineV1SubscriptionsPostRequestFormPaymentSettingsUpiX08def56fInspection(
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676,
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe3bd8676",
                    )
                }
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X1cf8ab12",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fBranch {
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf,
    InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fNoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fInspection(
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf,
                matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fInspection,
) {
    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be,
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
        ): InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fNoMatchException(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168f(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fInspection {
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf>()
    val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be>()
    return InlineV1SubscriptionsPostRequestFormPaymentSettingsCardX8451168fInspection(
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf,
        matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X238c3fcf",
                    )
                }
                if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X346126be",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

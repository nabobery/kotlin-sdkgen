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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/mb_way.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/mb_way
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X554fc336",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

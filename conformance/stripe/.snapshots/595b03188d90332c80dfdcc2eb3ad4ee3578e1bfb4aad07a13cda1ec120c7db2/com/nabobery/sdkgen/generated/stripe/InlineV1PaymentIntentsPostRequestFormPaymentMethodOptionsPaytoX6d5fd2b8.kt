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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1X53e30c5f",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xf72d2fc5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

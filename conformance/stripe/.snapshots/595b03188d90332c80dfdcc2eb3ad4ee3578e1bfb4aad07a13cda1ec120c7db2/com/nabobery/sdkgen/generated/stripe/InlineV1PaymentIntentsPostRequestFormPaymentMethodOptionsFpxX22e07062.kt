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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/fpx.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/fpx
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf1X52ab1586",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxAnyOf2Xd53d0c9d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

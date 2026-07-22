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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edBranch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edInspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/twint.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/twint
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edInspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edInspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611edInspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa43aaed1",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2Xeed635d5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

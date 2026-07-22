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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bBranch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bInspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/kakao_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/kakao_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bInspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bInspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832bInspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xcf79aa72",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X63fdf46f",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

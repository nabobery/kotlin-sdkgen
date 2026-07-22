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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1X668ed3d9",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2X5ba3d4f4",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

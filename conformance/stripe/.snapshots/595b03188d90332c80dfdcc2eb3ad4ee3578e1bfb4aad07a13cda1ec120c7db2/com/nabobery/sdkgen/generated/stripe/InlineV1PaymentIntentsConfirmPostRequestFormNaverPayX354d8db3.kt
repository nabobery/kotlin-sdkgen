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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Branch {
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3NoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Inspection(
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Inspection,
) {
    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3 {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3NoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Inspection {
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0>()
    return InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3Inspection(
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X8366779f",
                    )
                }
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xd3249ac0",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Branch {
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051NoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Inspection(
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Inspection,
) {
    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051 {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051NoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Inspection {
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff>()
    return InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051Inspection(
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xc701fc50",
                    )
                }
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X4bc2beff",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

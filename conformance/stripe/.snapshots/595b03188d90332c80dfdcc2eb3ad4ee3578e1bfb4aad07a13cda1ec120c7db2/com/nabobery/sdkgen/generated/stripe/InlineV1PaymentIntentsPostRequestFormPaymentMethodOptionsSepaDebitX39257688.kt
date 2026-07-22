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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa04292f8",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xef94b8e5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

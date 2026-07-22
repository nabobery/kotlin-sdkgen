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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf2Xd2e81111",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

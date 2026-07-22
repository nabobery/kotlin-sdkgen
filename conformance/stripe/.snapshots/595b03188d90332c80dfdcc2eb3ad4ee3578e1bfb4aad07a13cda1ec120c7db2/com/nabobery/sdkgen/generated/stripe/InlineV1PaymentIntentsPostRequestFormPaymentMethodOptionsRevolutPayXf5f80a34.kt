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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/revolut_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/revolut_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xc489b9f6",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa81d7ab6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

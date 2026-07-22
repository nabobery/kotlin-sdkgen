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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fBranch {
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fNoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fInspection(
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/klarna
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fInspection,
) {
    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fNoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fInspection {
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f>()
    return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3fInspection(
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9",
                    )
                }
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xbbcf220f",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

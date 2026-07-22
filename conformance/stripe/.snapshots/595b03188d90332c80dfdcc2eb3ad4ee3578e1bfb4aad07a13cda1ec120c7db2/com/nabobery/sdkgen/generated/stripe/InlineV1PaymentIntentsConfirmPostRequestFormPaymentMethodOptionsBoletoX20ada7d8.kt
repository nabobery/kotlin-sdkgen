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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Branch {
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8NoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Inspection(
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/boleto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/boleto
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Inspection,
) {
    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8 {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8NoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Inspection {
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1>()
    return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8Inspection(
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X64164e7d",
                    )
                }
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe3ab69f1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

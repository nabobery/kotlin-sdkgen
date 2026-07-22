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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebBranch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebInspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/boleto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/boleto
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebInspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebInspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbebInspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1Xe7095f43",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2X4584077d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

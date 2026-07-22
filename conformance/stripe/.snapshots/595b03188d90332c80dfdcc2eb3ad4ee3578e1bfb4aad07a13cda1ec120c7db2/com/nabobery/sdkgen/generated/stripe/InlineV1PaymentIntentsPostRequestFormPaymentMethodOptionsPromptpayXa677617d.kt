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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dBranch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dInspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/promptpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/promptpay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dInspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dInspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617dInspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2217d54f",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X73e8c0ba",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/oxxo.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/oxxo
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf1X2543b2ba",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoAnyOf2Xd76cc8d8",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

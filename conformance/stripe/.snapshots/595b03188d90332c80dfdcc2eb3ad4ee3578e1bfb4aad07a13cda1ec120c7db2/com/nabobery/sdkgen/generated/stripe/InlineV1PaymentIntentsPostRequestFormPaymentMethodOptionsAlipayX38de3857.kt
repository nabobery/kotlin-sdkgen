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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alipay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alipay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf1Xaea428f2",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayAnyOf2Xcbb5d0dc",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

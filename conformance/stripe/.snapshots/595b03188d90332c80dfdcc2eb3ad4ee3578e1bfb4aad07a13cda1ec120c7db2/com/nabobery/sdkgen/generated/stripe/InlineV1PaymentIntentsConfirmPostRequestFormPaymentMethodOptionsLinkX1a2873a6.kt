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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Branch {
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6NoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Inspection(
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/link.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/link
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Inspection,
) {
    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6 {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6NoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Inspection {
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c>()
    return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6Inspection(
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X5d9c01e7",
                    )
                }
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xdcaa596c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

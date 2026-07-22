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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aBranch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aInspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payco.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payco
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aInspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aInspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2aInspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf1X3d8d1d75",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoAnyOf2Xa6553f3f",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

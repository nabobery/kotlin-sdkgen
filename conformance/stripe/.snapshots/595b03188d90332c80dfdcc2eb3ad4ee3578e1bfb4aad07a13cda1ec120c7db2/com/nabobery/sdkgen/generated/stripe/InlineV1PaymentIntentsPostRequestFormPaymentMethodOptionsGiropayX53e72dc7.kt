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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/giropay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/giropay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf1X486c1133",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayAnyOf2X38bcecf5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

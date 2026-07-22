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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/satispay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/satispay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf1X83f103ce",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayAnyOf2X2856ac91",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

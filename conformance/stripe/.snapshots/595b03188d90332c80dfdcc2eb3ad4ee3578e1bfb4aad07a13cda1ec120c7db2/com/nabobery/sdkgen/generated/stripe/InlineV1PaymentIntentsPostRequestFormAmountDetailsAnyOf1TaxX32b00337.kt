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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Branch {
    InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a,
    InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a,
                matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a,
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
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a>()
    val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a>()
    return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxX32b00337Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a,
        matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf1X1d43f00a",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1TaxAnyOf2X87569b5a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

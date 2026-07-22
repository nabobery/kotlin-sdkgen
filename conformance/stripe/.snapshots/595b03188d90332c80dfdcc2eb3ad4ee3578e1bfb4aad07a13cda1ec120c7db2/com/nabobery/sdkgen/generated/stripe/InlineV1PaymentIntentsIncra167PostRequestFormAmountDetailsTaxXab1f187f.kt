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

public enum class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fBranch {
    InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750,
    InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199,
}

public sealed class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fNoMatchException(
    message: String,
) : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fDecodingException(message)

internal data class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fInspection(
    public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750: Boolean,
    public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750,
                matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fInspection,
) {
    public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750) {
                    add(
                        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199) {
                    add(
                        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199,
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
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f {
            val inspection = inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fNoMatchException(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187f(
    element: JsonElement,
): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fInspection {
    val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750>()
    val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199>()
    return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxXab1f187fInspection(
        matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750 = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750,
        matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199 = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750) {
                    add(
                        "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf1X5759b750",
                    )
                }
                if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199) {
                    add(
                        "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsTaxAnyOf2Xf653b199",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

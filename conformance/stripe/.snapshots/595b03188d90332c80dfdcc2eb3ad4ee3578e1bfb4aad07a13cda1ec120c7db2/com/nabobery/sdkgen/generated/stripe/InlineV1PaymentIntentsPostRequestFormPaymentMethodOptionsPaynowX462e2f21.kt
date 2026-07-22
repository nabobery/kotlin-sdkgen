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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/paynow.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/paynow
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xaa9ec5a3",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2X12740191",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/eps.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/eps
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1X1fac70ec",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X4dabe805",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbBranch {
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbNoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbInspection(
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8,
            ).count {
                it
            }
}

/**
 * Provides industry-specific information about the charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbInspection,
) {
    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbNoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fb(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbInspection {
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8>()
    return InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsXa51d66fbInspection(
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5",
                    )
                }
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf2X9e2e61c8",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Branch {
    Branch1,
    InlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8NoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59).count { it }
}

/**
 * The list of payment method types to exclude from use with this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/excluded_payment_method_types
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Inspection,
) {
    public val branch1: List<InlineV1PaymentIntentsConfirmPostRequestFormItemX453378e4>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1PaymentIntentsConfirmPostRequestFormItemX453378e4>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59:
        InlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Branch.InlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8 {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8NoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1PaymentIntentsConfirmPostRequestFormItemX453378e4>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59>()
    return InlineV1PaymentIntentsConfirmPostRequestFormExcludedPaymentMethodTypesXe9ef34f8Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAnyOf2X7a443d59",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

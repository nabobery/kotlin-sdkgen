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

public enum class InlineV1InvoicesPostRequestFormShippingDetailsX130e758aBranch {
    InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79,
    InlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea,
}

public sealed class InlineV1InvoicesPostRequestFormShippingDetailsX130e758aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormShippingDetailsX130e758aNoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormShippingDetailsX130e758aDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormShippingDetailsX130e758aInspection(
    public val matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79,
                matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea,
            ).count {
                it
            }
}

/**
 * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise the
 * PDF will render the shipping address from the customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_details
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingDetailsX130e758a.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingDetailsX130e758a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormShippingDetailsX130e758aInspection,
) {
    public val inlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79:
        InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea:
        InlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesPostRequestFormShippingDetailsX130e758aBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79) {
                    add(
                        InlineV1InvoicesPostRequestFormShippingDetailsX130e758aBranch.InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea) {
                    add(
                        InlineV1InvoicesPostRequestFormShippingDetailsX130e758aBranch.InlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea,
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
        ): InlineV1InvoicesPostRequestFormShippingDetailsX130e758a {
            val inspection = inspectInlineV1InvoicesPostRequestFormShippingDetailsX130e758a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormShippingDetailsX130e758aNoMatchException(
                    "InlineV1InvoicesPostRequestFormShippingDetailsX130e758a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormShippingDetailsX130e758a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingDetailsX130e758a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingDetailsX130e758a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingDetailsX130e758a")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingDetailsX130e758a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormShippingDetailsX130e758a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormShippingDetailsX130e758a(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormShippingDetailsX130e758aInspection {
    val matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79>()
    val matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea>()
    return InlineV1InvoicesPostRequestFormShippingDetailsX130e758aInspection(
        matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79 = matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79,
        matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea = matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea,
        failures =
            buildList {
                if (!matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79) {
                    add(
                        "InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79: value does not match InlineV1InvoicesPostRequestFormShippingDetailsAnyOf1Xde699f79",
                    )
                }
                if (!matchesInlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea) {
                    add(
                        "InlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea: value does not match InlineV1InvoicesPostRequestFormShippingDetailsAnyOf2Xd6fb6fea",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

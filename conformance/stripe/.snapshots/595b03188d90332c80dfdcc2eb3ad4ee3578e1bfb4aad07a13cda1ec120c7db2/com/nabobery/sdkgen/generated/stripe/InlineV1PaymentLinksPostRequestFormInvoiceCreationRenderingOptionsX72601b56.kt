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

public enum class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Branch {
    InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c,
    InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea,
}

public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56NoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Inspection(
    public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c,
                matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/rendering_options
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Inspection,
) {
    public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Branch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Branch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea,
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
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56 {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56NoMatchException(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Inspection {
    val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c>()
    val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea>()
    return InlineV1PaymentLinksPostRequestFormInvoiceCreationRenderingOptionsX72601b56Inspection(
        matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c,
        matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea,
        failures =
            buildList {
                if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X4fd7894c",
                    )
                }
                if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X890527ea",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

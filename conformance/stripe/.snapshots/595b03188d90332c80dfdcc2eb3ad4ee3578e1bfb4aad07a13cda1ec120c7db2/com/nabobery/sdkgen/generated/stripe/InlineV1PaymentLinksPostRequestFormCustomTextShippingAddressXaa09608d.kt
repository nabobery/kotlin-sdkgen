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

public enum class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dBranch {
    InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45,
    InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dNoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dInspection(
    public val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45,
                matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/shipping_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/shipping_address
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dInspection,
) {
    public val inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45:
        InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c:
        InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45) {
                    add(
                        InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dBranch.InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c) {
                    add(
                        InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dBranch.InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c,
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
        ): InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dNoMatchException(
                    "InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dInspection {
    val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45>()
    val matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c>()
    return InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608dInspection(
        matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45 = matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45,
        matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c = matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c,
        failures =
            buildList {
                if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45: value does not match InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X3268ed45",
                    )
                }
                if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c: value does not match InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X5a6c725c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

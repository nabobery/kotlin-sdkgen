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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Branch {
    Branch1,
    InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1NoMatchException(
    message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573,
            ).count { it }
}

/**
 * The coupons to redeem into discounts for the invoice preview. If not specified, inherits the discount from the
 * subscription or customer. This works for both coupons directly applied to an invoice and coupons applied to a
 * subscription. Pass an empty string to avoid inheriting any discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/discounts
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Inspection,
) {
    public val branch1:
        List<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf1ItemX8ab4aafb>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf1ItemX8ab4aafb>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573:
        InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573) {
                    add(
                        InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Branch.InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573,
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
        ): InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1 {
            val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1NoMatchException(
                    "InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1(
    element: JsonElement,
): InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf1ItemX8ab4aafb>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573 =
        element
            .isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573>()
    return InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573 = matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573) {
                    add(
                        "InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573: value does not match InlineV1InvoicesCreatePreviewPostRequestFormDiscountsAnyOf2Xe4bde573",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

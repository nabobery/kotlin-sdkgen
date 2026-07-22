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

public enum class InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Branch {
    Branch1,
    InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14,
}

public sealed class InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74NoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/statement_descriptor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/statement_descriptor
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14:
        InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14) {
                    add(
                        InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Branch.InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14,
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
        ): InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74 {
            val inspection =
                inspectInlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74NoMatchException(
                    "InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14>()
    return InlineV1PaymentLinksPostRequestFormPaymentIntentDataStatementDescriptorX28bdad74Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14 = matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14: value does not match InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xcb767a14",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

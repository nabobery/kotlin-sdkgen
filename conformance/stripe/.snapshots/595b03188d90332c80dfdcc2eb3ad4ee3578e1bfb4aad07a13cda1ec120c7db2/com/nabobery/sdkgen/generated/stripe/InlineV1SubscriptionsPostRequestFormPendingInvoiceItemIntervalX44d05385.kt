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

public enum class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Branch {
    InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd,
    InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a,
}

public sealed class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385NoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Inspection(
    public val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd,
                matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a,
            ).count {
                it
            }
}

/**
 * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
 * invoice](/api/invoices/create) for the given subscription at the specified interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Inspection,
) {
    public val inlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd:
        InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a:
        InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Branch.InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a) {
                    add(
                        InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Branch.InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a,
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
        ): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385 {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385NoMatchException(
                    "InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Inspection {
    val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd>()
    val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a>()
    return InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalX44d05385Inspection(
        matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd = matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd,
        matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a = matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd: value does not match InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1Xc54d64cd",
                    )
                }
                if (!matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a: value does not match InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xed59a79a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

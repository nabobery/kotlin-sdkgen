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

public enum class InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Branch {
    InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88,
    InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838NoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Inspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88,
                matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958,
            ).count {
                it
            }
}

/**
 * If specified, the funds from the subscription's invoices will be transferred to the destination and the ID of the
 * resulting transfers will be found on the resulting charges. This will be unset if you POST an empty value.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/transfer_data
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Inspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88:
        InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958:
        InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Branch.InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Branch.InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838 {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838NoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Inspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958>()
    return InlineV1CustomersSubscriptionsPostRequestFormTransferDataX26240838Inspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88 = matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88,
        matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958 = matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88: value does not match InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf1Xcd4e1c88",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958: value does not match InlineV1CustomersSubscriptionsPostRequestFormTransferDataAnyOf2Xe10b7958",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

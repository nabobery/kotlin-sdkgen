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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineSubscriptionTransferDataX382db867Branch {
    SubscriptionTransferData,
}

public sealed class InlineSubscriptionTransferDataX382db867DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionTransferDataX382db867NoMatchException(
    message: String,
) : InlineSubscriptionTransferDataX382db867DecodingException(message)

internal data class InlineSubscriptionTransferDataX382db867Inspection(
    public val matchesSubscriptionTransferData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSubscriptionTransferData).count { it }
}

/**
 * The account (if any) the subscription's payments will be attributed to for tax reporting, and where funds from each
 * payment will be transferred to for each of the subscription's invoices.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/transfer_data
 */
@Serializable(with = InlineSubscriptionTransferDataX382db867.Serializer::class)
public class InlineSubscriptionTransferDataX382db867 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionTransferDataX382db867Inspection,
) {
    public val subscriptionTransferData: SubscriptionTransferDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSubscriptionTransferData) {
                json.decodeFromJsonElement<SubscriptionTransferDataView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSubscriptionTransferDataX382db867Branch>
        get() =
            buildSet {
                if (inspection.matchesSubscriptionTransferData) {
                    add(
                        InlineSubscriptionTransferDataX382db867Branch.SubscriptionTransferData,
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
        ): InlineSubscriptionTransferDataX382db867 {
            val inspection = inspectInlineSubscriptionTransferDataX382db867(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionTransferDataX382db867NoMatchException(
                    "InlineSubscriptionTransferDataX382db867 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionTransferDataX382db867(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionTransferDataX382db867> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionTransferDataX382db867 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionTransferDataX382db867")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionTransferDataX382db867,
        ) {
            encoder.requireJsonEncoder("InlineSubscriptionTransferDataX382db867").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionTransferDataX382db867(
    element: JsonElement,
): InlineSubscriptionTransferDataX382db867Inspection {
    val raw =
        element as? JsonObject ?: return InlineSubscriptionTransferDataX382db867Inspection(
            matchesSubscriptionTransferData = false,
            failures = listOf("SubscriptionTransferData: expected JSON object"),
        )
    val matchesSubscriptionTransferData = raw["destination"] != null
    return InlineSubscriptionTransferDataX382db867Inspection(
        matchesSubscriptionTransferData = matchesSubscriptionTransferData,
        failures =
            buildList {
                if (!matchesSubscriptionTransferData) {
                    add(
                        "SubscriptionTransferData: required properties 'destination' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

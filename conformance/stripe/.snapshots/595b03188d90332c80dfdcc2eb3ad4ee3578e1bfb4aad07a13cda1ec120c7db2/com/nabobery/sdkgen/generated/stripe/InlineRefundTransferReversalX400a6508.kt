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

public enum class InlineRefundTransferReversalX400a6508Branch {
    Branch1,
    TransferReversal,
}

public sealed class InlineRefundTransferReversalX400a6508DecodingException(
    message: String,
) : SerializationException(message)

public class InlineRefundTransferReversalX400a6508NoMatchException(
    message: String,
) : InlineRefundTransferReversalX400a6508DecodingException(message)

internal data class InlineRefundTransferReversalX400a6508Inspection(
    public val matchesBranch1: Boolean,
    public val matchesTransferReversal: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTransferReversal).count { it }
}

/**
 * This refers to the transfer reversal object if the accompanying transfer reverses. This is only applicable if the
 * charge was created using the destination parameter.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/transfer_reversal
 */
@Serializable(with = InlineRefundTransferReversalX400a6508.Serializer::class)
public class InlineRefundTransferReversalX400a6508 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineRefundTransferReversalX400a6508Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val transferReversal: TransferReversal? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTransferReversal) json.decodeFromJsonElement<TransferReversal>(raw) else null
        }

    public val matchedBranches: Set<InlineRefundTransferReversalX400a6508Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineRefundTransferReversalX400a6508Branch.Branch1)
                if (inspection.matchesTransferReversal) {
                    add(
                        InlineRefundTransferReversalX400a6508Branch.TransferReversal,
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
        ): InlineRefundTransferReversalX400a6508 {
            val inspection = inspectInlineRefundTransferReversalX400a6508(raw)
            if (inspection.matchCount == 0) {
                throw InlineRefundTransferReversalX400a6508NoMatchException(
                    "InlineRefundTransferReversalX400a6508 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineRefundTransferReversalX400a6508(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineRefundTransferReversalX400a6508> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineRefundTransferReversalX400a6508 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineRefundTransferReversalX400a6508")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineRefundTransferReversalX400a6508,
        ) {
            encoder.requireJsonEncoder("InlineRefundTransferReversalX400a6508").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineRefundTransferReversalX400a6508(
    element: JsonElement,
): InlineRefundTransferReversalX400a6508Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTransferReversal = element.isJsonDecodable<TransferReversal>()
    return InlineRefundTransferReversalX400a6508Inspection(
        matchesBranch1 = matchesBranch1,
        matchesTransferReversal = matchesTransferReversal,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesTransferReversal) add("TransferReversal: value does not match TransferReversal")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

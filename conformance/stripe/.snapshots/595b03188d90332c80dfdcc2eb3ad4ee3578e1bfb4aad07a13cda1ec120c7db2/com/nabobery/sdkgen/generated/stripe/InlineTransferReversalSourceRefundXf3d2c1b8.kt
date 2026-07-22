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

public enum class InlineTransferReversalSourceRefundXf3d2c1b8Branch {
    Branch1,
    Refund,
}

public sealed class InlineTransferReversalSourceRefundXf3d2c1b8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTransferReversalSourceRefundXf3d2c1b8NoMatchException(
    message: String,
) : InlineTransferReversalSourceRefundXf3d2c1b8DecodingException(message)

internal data class InlineTransferReversalSourceRefundXf3d2c1b8Inspection(
    public val matchesBranch1: Boolean,
    public val matchesRefund: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesRefund).count { it }
}

/**
 * ID of the refund responsible for the transfer reversal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_reversal/properties/source_refund
 */
@Serializable(with = InlineTransferReversalSourceRefundXf3d2c1b8.Serializer::class)
public class InlineTransferReversalSourceRefundXf3d2c1b8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTransferReversalSourceRefundXf3d2c1b8Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val refund: Refund? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesRefund) json.decodeFromJsonElement<Refund>(raw) else null }

    public val matchedBranches: Set<InlineTransferReversalSourceRefundXf3d2c1b8Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTransferReversalSourceRefundXf3d2c1b8Branch.Branch1)
                if (inspection.matchesRefund) add(InlineTransferReversalSourceRefundXf3d2c1b8Branch.Refund)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineTransferReversalSourceRefundXf3d2c1b8 {
            val inspection = inspectInlineTransferReversalSourceRefundXf3d2c1b8(raw)
            if (inspection.matchCount == 0) {
                throw InlineTransferReversalSourceRefundXf3d2c1b8NoMatchException(
                    "InlineTransferReversalSourceRefundXf3d2c1b8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTransferReversalSourceRefundXf3d2c1b8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTransferReversalSourceRefundXf3d2c1b8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTransferReversalSourceRefundXf3d2c1b8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTransferReversalSourceRefundXf3d2c1b8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTransferReversalSourceRefundXf3d2c1b8,
        ) {
            encoder.requireJsonEncoder("InlineTransferReversalSourceRefundXf3d2c1b8").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTransferReversalSourceRefundXf3d2c1b8(
    element: JsonElement,
): InlineTransferReversalSourceRefundXf3d2c1b8Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesRefund = element.isJsonDecodable<Refund>()
    return InlineTransferReversalSourceRefundXf3d2c1b8Inspection(
        matchesBranch1 = matchesBranch1,
        matchesRefund = matchesRefund,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesRefund) add("Refund: value does not match Refund")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

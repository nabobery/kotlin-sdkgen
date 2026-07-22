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

public enum class InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Branch {
    Branch1,
    Charge,
}

public sealed class InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75NoMatchException(
    message: String,
) : InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75DecodingException(message)

internal data class InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCharge: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * Charge that is being refunded.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_refund_payment_action/properties/cha
 * rge
 */
@Serializable(with = InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75.Serializer::class)
public class InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val charge: Charge? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

    public val matchedBranches:
        Set<InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Branch.Branch1,
                    )
                }
                if (inspection.matchesCharge) {
                    add(
                        InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Branch.Charge,
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
        ): InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75 {
            val inspection = inspectInlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75(raw)
            if (inspection.matchCount == 0) {
                throw InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75NoMatchException(
                    "InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75(
    element: JsonElement,
): InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCharge = element.isJsonDecodable<Charge>()
    return InlineTerminalReaderReaderResourceRefundPaymentActionChargeXfab6da75Inspection(
        matchesBranch1 = matchesBranch1,
        matchesCharge = matchesCharge,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCharge) add("Charge: value does not match Charge")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

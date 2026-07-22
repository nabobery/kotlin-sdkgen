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

public enum class InlineTreasuryOutboundPaymentReturnedDetailsX599a78afBranch {
    TreasuryOutboundPaymentsResourceReturnedStatus,
}

public sealed class InlineTreasuryOutboundPaymentReturnedDetailsX599a78afDecodingException(
    message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundPaymentReturnedDetailsX599a78afNoMatchException(
    message: String,
) : InlineTreasuryOutboundPaymentReturnedDetailsX599a78afDecodingException(message)

internal data class InlineTreasuryOutboundPaymentReturnedDetailsX599a78afInspection(
    public val matchesTreasuryOutboundPaymentsResourceReturnedStatus: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTreasuryOutboundPaymentsResourceReturnedStatus).count { it }
}

/**
 * Details about a returned OutboundPayment. Only set when the status is `returned`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment/properties/returned_details
 */
@Serializable(with = InlineTreasuryOutboundPaymentReturnedDetailsX599a78af.Serializer::class)
public class InlineTreasuryOutboundPaymentReturnedDetailsX599a78af internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTreasuryOutboundPaymentReturnedDetailsX599a78afInspection,
) {
    public val treasuryOutboundPaymentsResourceReturnedStatus:
        TreasuryOutboundPaymentsResourceReturnedStatusView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTreasuryOutboundPaymentsResourceReturnedStatus) {
                json
                    .decodeFromJsonElement<TreasuryOutboundPaymentsResourceReturnedStatusView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineTreasuryOutboundPaymentReturnedDetailsX599a78afBranch>
        get() =
            buildSet {
                if (inspection.matchesTreasuryOutboundPaymentsResourceReturnedStatus) {
                    add(
                        InlineTreasuryOutboundPaymentReturnedDetailsX599a78afBranch.TreasuryOutboundPaymentsResourceReturnedStatus,
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
        ): InlineTreasuryOutboundPaymentReturnedDetailsX599a78af {
            val inspection = inspectInlineTreasuryOutboundPaymentReturnedDetailsX599a78af(raw)
            if (inspection.matchCount == 0) {
                throw InlineTreasuryOutboundPaymentReturnedDetailsX599a78afNoMatchException(
                    "InlineTreasuryOutboundPaymentReturnedDetailsX599a78af matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTreasuryOutboundPaymentReturnedDetailsX599a78af(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTreasuryOutboundPaymentReturnedDetailsX599a78af> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentReturnedDetailsX599a78af {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundPaymentReturnedDetailsX599a78af")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryOutboundPaymentReturnedDetailsX599a78af,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineTreasuryOutboundPaymentReturnedDetailsX599a78af",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTreasuryOutboundPaymentReturnedDetailsX599a78af(
    element: JsonElement,
): InlineTreasuryOutboundPaymentReturnedDetailsX599a78afInspection {
    val raw =
        element as? JsonObject ?: return InlineTreasuryOutboundPaymentReturnedDetailsX599a78afInspection(
            matchesTreasuryOutboundPaymentsResourceReturnedStatus = false,
            failures = listOf("TreasuryOutboundPaymentsResourceReturnedStatus: expected JSON object"),
        )
    val matchesTreasuryOutboundPaymentsResourceReturnedStatus = raw["code"] != null && raw["transaction"] != null
    return InlineTreasuryOutboundPaymentReturnedDetailsX599a78afInspection(
        matchesTreasuryOutboundPaymentsResourceReturnedStatus = matchesTreasuryOutboundPaymentsResourceReturnedStatus,
        failures =
            buildList {
                if (!matchesTreasuryOutboundPaymentsResourceReturnedStatus) {
                    add(
                        "TreasuryOutboundPaymentsResourceReturnedStatus: required properties 'code', 'transaction' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

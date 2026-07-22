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

public enum class InlineTransferDestinationPaymentX1562c10cBranch {
    Branch1,
    Charge,
}

public sealed class InlineTransferDestinationPaymentX1562c10cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineTransferDestinationPaymentX1562c10cNoMatchException(
    message: String,
) : InlineTransferDestinationPaymentX1562c10cDecodingException(message)

internal data class InlineTransferDestinationPaymentX1562c10cInspection(
    public val matchesBranch1: Boolean,
    public val matchesCharge: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * If the destination is a Stripe account, this will be the ID of the payment that the destination account received for
 * the transfer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer/properties/destination_payment
 */
@Serializable(with = InlineTransferDestinationPaymentX1562c10c.Serializer::class)
public class InlineTransferDestinationPaymentX1562c10c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTransferDestinationPaymentX1562c10cInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val charge: Charge? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

    public val matchedBranches: Set<InlineTransferDestinationPaymentX1562c10cBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTransferDestinationPaymentX1562c10cBranch.Branch1)
                if (inspection.matchesCharge) add(InlineTransferDestinationPaymentX1562c10cBranch.Charge)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineTransferDestinationPaymentX1562c10c {
            val inspection = inspectInlineTransferDestinationPaymentX1562c10c(raw)
            if (inspection.matchCount == 0) {
                throw InlineTransferDestinationPaymentX1562c10cNoMatchException(
                    "InlineTransferDestinationPaymentX1562c10c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTransferDestinationPaymentX1562c10c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTransferDestinationPaymentX1562c10c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTransferDestinationPaymentX1562c10c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTransferDestinationPaymentX1562c10c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTransferDestinationPaymentX1562c10c,
        ) {
            encoder.requireJsonEncoder("InlineTransferDestinationPaymentX1562c10c").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTransferDestinationPaymentX1562c10c(
    element: JsonElement,
): InlineTransferDestinationPaymentX1562c10cInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCharge = element.isJsonDecodable<Charge>()
    return InlineTransferDestinationPaymentX1562c10cInspection(
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

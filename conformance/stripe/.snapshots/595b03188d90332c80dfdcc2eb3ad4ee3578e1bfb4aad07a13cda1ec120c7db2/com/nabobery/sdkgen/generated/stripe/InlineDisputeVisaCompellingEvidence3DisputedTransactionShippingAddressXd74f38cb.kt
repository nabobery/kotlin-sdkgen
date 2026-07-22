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

public enum class InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbBranch {
    DisputeTransactionShippingAddress,
}

public sealed class InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbNoMatchException(
    message: String,
) : InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbDecodingException(message)

internal data class InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbInspection(
    public val matchesDisputeTransactionShippingAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesDisputeTransactionShippingAddress).count { it }
}

/**
 * The address to which a physical product was shipped. All fields are required for Visa Compelling Evidence 3.0
 * evidence submission.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_visa_compelling_evidence3_disputed_transaction/properties/sh
 * ipping_address
 */
@Serializable(with = InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb.Serializer::class)
public class InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbInspection,
) {
    public val disputeTransactionShippingAddress: DisputeTransactionShippingAddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDisputeTransactionShippingAddress) {
                json
                    .decodeFromJsonElement<DisputeTransactionShippingAddressView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbBranch>
        get() =
            buildSet {
                if (inspection.matchesDisputeTransactionShippingAddress) {
                    add(
                        InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbBranch.DisputeTransactionShippingAddress,
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
        ): InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb {
            val inspection = inspectInlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb(raw)
            if (inspection.matchCount == 0) {
                throw InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbNoMatchException(
                    "InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cb(
    element: JsonElement,
): InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbInspection {
    val raw =
        element as? JsonObject
            ?: return InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbInspection(
                matchesDisputeTransactionShippingAddress = false,
                failures = listOf("DisputeTransactionShippingAddress: expected JSON object"),
            )
    val matchesDisputeTransactionShippingAddress = true
    return InlineDisputeVisaCompellingEvidence3DisputedTransactionShippingAddressXd74f38cbInspection(
        matchesDisputeTransactionShippingAddress = matchesDisputeTransactionShippingAddress,
        failures =
            buildList {
                if (!matchesDisputeTransactionShippingAddress) {
                    add(
                        "DisputeTransactionShippingAddress: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

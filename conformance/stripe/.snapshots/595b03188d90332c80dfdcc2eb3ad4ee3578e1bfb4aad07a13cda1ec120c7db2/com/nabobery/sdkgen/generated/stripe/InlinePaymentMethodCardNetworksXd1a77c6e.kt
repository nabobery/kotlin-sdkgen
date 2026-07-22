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

public enum class InlinePaymentMethodCardNetworksXd1a77c6eBranch {
    Networks,
}

public sealed class InlinePaymentMethodCardNetworksXd1a77c6eDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardNetworksXd1a77c6eNoMatchException(
    message: String,
) : InlinePaymentMethodCardNetworksXd1a77c6eDecodingException(message)

internal data class InlinePaymentMethodCardNetworksXd1a77c6eInspection(
    public val matchesNetworks: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesNetworks).count { it }
}

/**
 * Contains information about card networks that can be used to process the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card/properties/networks
 */
@Serializable(with = InlinePaymentMethodCardNetworksXd1a77c6e.Serializer::class)
public class InlinePaymentMethodCardNetworksXd1a77c6e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodCardNetworksXd1a77c6eInspection,
) {
    public val networks: NetworksView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesNetworks) json.decodeFromJsonElement<NetworksView>(raw) else null
        }

    public val matchedBranches: Set<InlinePaymentMethodCardNetworksXd1a77c6eBranch>
        get() =
            buildSet {
                if (inspection.matchesNetworks) add(InlinePaymentMethodCardNetworksXd1a77c6eBranch.Networks)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentMethodCardNetworksXd1a77c6e {
            val inspection = inspectInlinePaymentMethodCardNetworksXd1a77c6e(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodCardNetworksXd1a77c6eNoMatchException(
                    "InlinePaymentMethodCardNetworksXd1a77c6e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodCardNetworksXd1a77c6e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodCardNetworksXd1a77c6e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodCardNetworksXd1a77c6e {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardNetworksXd1a77c6e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodCardNetworksXd1a77c6e,
        ) {
            encoder.requireJsonEncoder("InlinePaymentMethodCardNetworksXd1a77c6e").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodCardNetworksXd1a77c6e(
    element: JsonElement,
): InlinePaymentMethodCardNetworksXd1a77c6eInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodCardNetworksXd1a77c6eInspection(
            matchesNetworks = false,
            failures = listOf("Networks: expected JSON object"),
        )
    val matchesNetworks = raw["available"].isStringArray()
    return InlinePaymentMethodCardNetworksXd1a77c6eInspection(
        matchesNetworks = matchesNetworks,
        failures =
            buildList {
                if (!matchesNetworks) add("Networks: required properties 'available' do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

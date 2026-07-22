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

public enum class InlineBillingDetailsAddressX0922cd53Branch {
    Address,
}

public sealed class InlineBillingDetailsAddressX0922cd53DecodingException(
    message: String,
) : SerializationException(message)

public class InlineBillingDetailsAddressX0922cd53NoMatchException(
    message: String,
) : InlineBillingDetailsAddressX0922cd53DecodingException(message)

internal data class InlineBillingDetailsAddressX0922cd53Inspection(
    public val matchesAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesAddress).count { it }
}

/**
 * Billing address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_details/properties/address
 */
@Serializable(with = InlineBillingDetailsAddressX0922cd53.Serializer::class)
public class InlineBillingDetailsAddressX0922cd53 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBillingDetailsAddressX0922cd53Inspection,
) {
    public val address: AddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null
        }

    public val matchedBranches: Set<InlineBillingDetailsAddressX0922cd53Branch>
        get() =
            buildSet {
                if (inspection.matchesAddress) add(InlineBillingDetailsAddressX0922cd53Branch.Address)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineBillingDetailsAddressX0922cd53 {
            val inspection = inspectInlineBillingDetailsAddressX0922cd53(raw)
            if (inspection.matchCount == 0) {
                throw InlineBillingDetailsAddressX0922cd53NoMatchException(
                    "InlineBillingDetailsAddressX0922cd53 matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineBillingDetailsAddressX0922cd53(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBillingDetailsAddressX0922cd53> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBillingDetailsAddressX0922cd53 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBillingDetailsAddressX0922cd53")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingDetailsAddressX0922cd53,
        ) {
            encoder.requireJsonEncoder("InlineBillingDetailsAddressX0922cd53").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBillingDetailsAddressX0922cd53(
    element: JsonElement,
): InlineBillingDetailsAddressX0922cd53Inspection {
    val raw =
        element as? JsonObject ?: return InlineBillingDetailsAddressX0922cd53Inspection(
            matchesAddress = false,
            failures = listOf("Address: expected JSON object"),
        )
    val matchesAddress = true
    return InlineBillingDetailsAddressX0922cd53Inspection(
        matchesAddress = matchesAddress,
        failures =
            buildList {
                if (!matchesAddress) add("Address: required properties  do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

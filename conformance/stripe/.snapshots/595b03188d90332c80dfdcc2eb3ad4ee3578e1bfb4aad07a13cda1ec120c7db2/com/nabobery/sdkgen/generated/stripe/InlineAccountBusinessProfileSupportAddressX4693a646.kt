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

public enum class InlineAccountBusinessProfileSupportAddressX4693a646Branch {
    Address,
}

public sealed class InlineAccountBusinessProfileSupportAddressX4693a646DecodingException(
    message: String,
) : SerializationException(message)

public class InlineAccountBusinessProfileSupportAddressX4693a646NoMatchException(
    message: String,
) : InlineAccountBusinessProfileSupportAddressX4693a646DecodingException(message)

internal data class InlineAccountBusinessProfileSupportAddressX4693a646Inspection(
    public val matchesAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesAddress).count { it }
}

/**
 * A publicly available mailing address for sending support issues to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_business_profile/properties/support_address
 */
@Serializable(with = InlineAccountBusinessProfileSupportAddressX4693a646.Serializer::class)
public class InlineAccountBusinessProfileSupportAddressX4693a646 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineAccountBusinessProfileSupportAddressX4693a646Inspection,
) {
    public val address: AddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null
        }

    public val matchedBranches: Set<InlineAccountBusinessProfileSupportAddressX4693a646Branch>
        get() =
            buildSet {
                if (inspection.matchesAddress) add(InlineAccountBusinessProfileSupportAddressX4693a646Branch.Address)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineAccountBusinessProfileSupportAddressX4693a646 {
            val inspection = inspectInlineAccountBusinessProfileSupportAddressX4693a646(raw)
            if (inspection.matchCount == 0) {
                throw InlineAccountBusinessProfileSupportAddressX4693a646NoMatchException(
                    "InlineAccountBusinessProfileSupportAddressX4693a646 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineAccountBusinessProfileSupportAddressX4693a646(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineAccountBusinessProfileSupportAddressX4693a646> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineAccountBusinessProfileSupportAddressX4693a646 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineAccountBusinessProfileSupportAddressX4693a646")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountBusinessProfileSupportAddressX4693a646,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineAccountBusinessProfileSupportAddressX4693a646",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineAccountBusinessProfileSupportAddressX4693a646(
    element: JsonElement,
): InlineAccountBusinessProfileSupportAddressX4693a646Inspection {
    val raw =
        element as? JsonObject ?: return InlineAccountBusinessProfileSupportAddressX4693a646Inspection(
            matchesAddress = false,
            failures = listOf("Address: expected JSON object"),
        )
    val matchesAddress = true
    return InlineAccountBusinessProfileSupportAddressX4693a646Inspection(
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

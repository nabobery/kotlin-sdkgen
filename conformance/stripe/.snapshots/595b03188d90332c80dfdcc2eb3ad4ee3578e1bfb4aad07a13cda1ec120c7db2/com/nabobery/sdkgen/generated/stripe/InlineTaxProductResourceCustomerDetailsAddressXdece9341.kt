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

public enum class InlineTaxProductResourceCustomerDetailsAddressXdece9341Branch {
    TaxProductResourcePostalAddress,
}

public sealed class InlineTaxProductResourceCustomerDetailsAddressXdece9341DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTaxProductResourceCustomerDetailsAddressXdece9341NoMatchException(
    message: String,
) : InlineTaxProductResourceCustomerDetailsAddressXdece9341DecodingException(message)

internal data class InlineTaxProductResourceCustomerDetailsAddressXdece9341Inspection(
    public val matchesTaxProductResourcePostalAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTaxProductResourcePostalAddress).count { it }
}

/**
 * The customer's postal address (for example, home or business location).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_customer_details/properties/address
 */
@Serializable(with = InlineTaxProductResourceCustomerDetailsAddressXdece9341.Serializer::class)
public class InlineTaxProductResourceCustomerDetailsAddressXdece9341 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTaxProductResourceCustomerDetailsAddressXdece9341Inspection,
) {
    public val taxProductResourcePostalAddress: TaxProductResourcePostalAddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTaxProductResourcePostalAddress) {
                json
                    .decodeFromJsonElement<TaxProductResourcePostalAddressView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineTaxProductResourceCustomerDetailsAddressXdece9341Branch>
        get() =
            buildSet {
                if (inspection.matchesTaxProductResourcePostalAddress) {
                    add(
                        InlineTaxProductResourceCustomerDetailsAddressXdece9341Branch.TaxProductResourcePostalAddress,
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
        ): InlineTaxProductResourceCustomerDetailsAddressXdece9341 {
            val inspection = inspectInlineTaxProductResourceCustomerDetailsAddressXdece9341(raw)
            if (inspection.matchCount == 0) {
                throw InlineTaxProductResourceCustomerDetailsAddressXdece9341NoMatchException(
                    "InlineTaxProductResourceCustomerDetailsAddressXdece9341 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTaxProductResourceCustomerDetailsAddressXdece9341(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTaxProductResourceCustomerDetailsAddressXdece9341> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTaxProductResourceCustomerDetailsAddressXdece9341 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTaxProductResourceCustomerDetailsAddressXdece9341")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductResourceCustomerDetailsAddressXdece9341,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineTaxProductResourceCustomerDetailsAddressXdece9341",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTaxProductResourceCustomerDetailsAddressXdece9341(
    element: JsonElement,
): InlineTaxProductResourceCustomerDetailsAddressXdece9341Inspection {
    val raw =
        element as? JsonObject ?: return InlineTaxProductResourceCustomerDetailsAddressXdece9341Inspection(
            matchesTaxProductResourcePostalAddress = false,
            failures = listOf("TaxProductResourcePostalAddress: expected JSON object"),
        )
    val matchesTaxProductResourcePostalAddress = raw["country"].isString()
    return InlineTaxProductResourceCustomerDetailsAddressXdece9341Inspection(
        matchesTaxProductResourcePostalAddress = matchesTaxProductResourcePostalAddress,
        failures =
            buildList {
                if (!matchesTaxProductResourcePostalAddress) {
                    add(
                        "TaxProductResourcePostalAddress: required properties 'country' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

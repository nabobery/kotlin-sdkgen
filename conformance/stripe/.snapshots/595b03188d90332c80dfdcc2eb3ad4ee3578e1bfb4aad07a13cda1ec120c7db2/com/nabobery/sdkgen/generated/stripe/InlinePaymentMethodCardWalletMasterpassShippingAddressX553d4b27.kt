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

public enum class InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Branch {
    Address,
}

public sealed class InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27NoMatchException(
    message: String,
) : InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27DecodingException(message)

internal data class InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Inspection(
    public val matchesAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesAddress).count { it }
}

/**
 * Owner's verified shipping address. Values are verified or provided by the wallet directly (if supported) at the time
 * of authorization or settlement. They cannot be set or mutated.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_card_wallet_masterpass/properties/shipping_address
 */
@Serializable(with = InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27.Serializer::class)
public class InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Inspection,
) {
    public val address: AddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null
        }

    public val matchedBranches:
        Set<InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Branch>
        get() =
            buildSet {
                if (inspection.matchesAddress) {
                    add(
                        InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Branch.Address,
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
        ): InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27 {
            val inspection = inspectInlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27NoMatchException(
                    "InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27(
    element: JsonElement,
): InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Inspection(
            matchesAddress = false,
            failures = listOf("Address: expected JSON object"),
        )
    val matchesAddress = true
    return InlinePaymentMethodCardWalletMasterpassShippingAddressX553d4b27Inspection(
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

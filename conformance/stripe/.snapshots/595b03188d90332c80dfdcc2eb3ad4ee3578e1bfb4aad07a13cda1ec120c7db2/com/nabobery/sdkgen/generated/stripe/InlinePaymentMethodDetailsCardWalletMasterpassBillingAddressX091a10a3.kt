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

public enum class InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Branch {
    Address,
}

public sealed class InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3NoMatchException(
    message: String,
) : InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3DecodingException(message)

internal data class InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Inspection(
    public val matchesAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesAddress).count { it }
}

/**
 * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the time
 * of authorization or settlement. They cannot be set or mutated.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_wallet_masterpass/properties/billing_add
 * ress
 */
@Serializable(with = InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3.Serializer::class)
public class InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Inspection,
) {
    public val address: AddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null
        }

    public val matchedBranches:
        Set<InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Branch>
        get() =
            buildSet {
                if (inspection.matchesAddress) {
                    add(
                        InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Branch.Address,
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
        ): InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3 {
            val inspection = inspectInlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3NoMatchException(
                    "InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3(
    element: JsonElement,
): InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Inspection {
    val raw =
        element as? JsonObject
            ?: return InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Inspection(
                matchesAddress = false,
                failures = listOf("Address: expected JSON object"),
            )
    val matchesAddress = true
    return InlinePaymentMethodDetailsCardWalletMasterpassBillingAddressX091a10a3Inspection(
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

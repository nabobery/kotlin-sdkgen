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

public enum class InlinePaymentMethodDetailsCardWalletX3d6951c5Branch {
    PaymentMethodDetailsCardWallet,
}

public sealed class InlinePaymentMethodDetailsCardWalletX3d6951c5DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardWalletX3d6951c5NoMatchException(
    message: String,
) : InlinePaymentMethodDetailsCardWalletX3d6951c5DecodingException(message)

internal data class InlinePaymentMethodDetailsCardWalletX3d6951c5Inspection(
    public val matchesPaymentMethodDetailsCardWallet: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentMethodDetailsCardWallet).count { it }
}

/**
 * If this Card is part of a card wallet, this contains the details of the card wallet.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card/properties/wallet
 */
@Serializable(with = InlinePaymentMethodDetailsCardWalletX3d6951c5.Serializer::class)
public class InlinePaymentMethodDetailsCardWalletX3d6951c5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsCardWalletX3d6951c5Inspection,
) {
    public val paymentMethodDetailsCardWallet: PaymentMethodDetailsCardWalletView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodDetailsCardWallet) {
                json
                    .decodeFromJsonElement<PaymentMethodDetailsCardWalletView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentMethodDetailsCardWalletX3d6951c5Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodDetailsCardWallet) {
                    add(
                        InlinePaymentMethodDetailsCardWalletX3d6951c5Branch.PaymentMethodDetailsCardWallet,
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
        ): InlinePaymentMethodDetailsCardWalletX3d6951c5 {
            val inspection = inspectInlinePaymentMethodDetailsCardWalletX3d6951c5(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsCardWalletX3d6951c5NoMatchException(
                    "InlinePaymentMethodDetailsCardWalletX3d6951c5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsCardWalletX3d6951c5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsCardWalletX3d6951c5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardWalletX3d6951c5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardWalletX3d6951c5")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsCardWalletX3d6951c5,
        ) {
            encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardWalletX3d6951c5").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsCardWalletX3d6951c5(
    element: JsonElement,
): InlinePaymentMethodDetailsCardWalletX3d6951c5Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodDetailsCardWalletX3d6951c5Inspection(
            matchesPaymentMethodDetailsCardWallet = false,
            failures = listOf("PaymentMethodDetailsCardWallet: expected JSON object"),
        )
    val matchesPaymentMethodDetailsCardWallet = raw["type"] != null
    return InlinePaymentMethodDetailsCardWalletX3d6951c5Inspection(
        matchesPaymentMethodDetailsCardWallet = matchesPaymentMethodDetailsCardWallet,
        failures =
            buildList {
                if (!matchesPaymentMethodDetailsCardWallet) {
                    add(
                        "PaymentMethodDetailsCardWallet: required properties 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

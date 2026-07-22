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

public enum class InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Branch {
    SetupAttemptPaymentMethodDetailsCardWallet,
}

public sealed class InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209NoMatchException(
    message: String,
) : InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209DecodingException(message)

internal data class InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Inspection(
    public val matchesSetupAttemptPaymentMethodDetailsCardWallet: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSetupAttemptPaymentMethodDetailsCardWallet).count { it }
}

/**
 * If this Card is part of a card wallet, this contains the details of the card wallet.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_card/properties/wallet
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209.Serializer::class)
public class InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Inspection,
) {
    public val setupAttemptPaymentMethodDetailsCardWallet:
        SetupAttemptPaymentMethodDetailsCardWalletView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesSetupAttemptPaymentMethodDetailsCardWallet) {
                json
                    .decodeFromJsonElement<SetupAttemptPaymentMethodDetailsCardWalletView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Branch>
        get() =
            buildSet {
                if (inspection.matchesSetupAttemptPaymentMethodDetailsCardWallet) {
                    add(
                        InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Branch.SetupAttemptPaymentMethodDetailsCardWallet,
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
        ): InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209 {
            val inspection = inspectInlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209NoMatchException(
                    "InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209(
    element: JsonElement,
): InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Inspection {
    val raw =
        element as? JsonObject ?: return InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Inspection(
            matchesSetupAttemptPaymentMethodDetailsCardWallet = false,
            failures = listOf("SetupAttemptPaymentMethodDetailsCardWallet: expected JSON object"),
        )
    val matchesSetupAttemptPaymentMethodDetailsCardWallet = raw["type"] != null
    return InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209Inspection(
        matchesSetupAttemptPaymentMethodDetailsCardWallet = matchesSetupAttemptPaymentMethodDetailsCardWallet,
        failures =
            buildList {
                if (!matchesSetupAttemptPaymentMethodDetailsCardWallet) {
                    add(
                        "SetupAttemptPaymentMethodDetailsCardWallet: required properties 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

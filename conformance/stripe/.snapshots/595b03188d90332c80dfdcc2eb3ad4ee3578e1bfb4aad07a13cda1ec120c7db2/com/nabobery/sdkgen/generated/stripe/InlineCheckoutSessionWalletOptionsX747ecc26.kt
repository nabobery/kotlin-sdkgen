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

public enum class InlineCheckoutSessionWalletOptionsX747ecc26Branch {
    CheckoutSessionWalletOptions,
}

public sealed class InlineCheckoutSessionWalletOptionsX747ecc26DecodingException(
    message: String,
) : SerializationException(message)

public class InlineCheckoutSessionWalletOptionsX747ecc26NoMatchException(
    message: String,
) : InlineCheckoutSessionWalletOptionsX747ecc26DecodingException(message)

internal data class InlineCheckoutSessionWalletOptionsX747ecc26Inspection(
    public val matchesCheckoutSessionWalletOptions: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesCheckoutSessionWalletOptions).count { it }
}

/**
 * Wallet-specific configuration for this Checkout Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/wallet_options
 */
@Serializable(with = InlineCheckoutSessionWalletOptionsX747ecc26.Serializer::class)
public class InlineCheckoutSessionWalletOptionsX747ecc26 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCheckoutSessionWalletOptionsX747ecc26Inspection,
) {
    public val checkoutSessionWalletOptions: CheckoutSessionWalletOptionsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesCheckoutSessionWalletOptions) {
                json
                    .decodeFromJsonElement<CheckoutSessionWalletOptionsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineCheckoutSessionWalletOptionsX747ecc26Branch>
        get() =
            buildSet {
                if (inspection.matchesCheckoutSessionWalletOptions) {
                    add(
                        InlineCheckoutSessionWalletOptionsX747ecc26Branch.CheckoutSessionWalletOptions,
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
        ): InlineCheckoutSessionWalletOptionsX747ecc26 {
            val inspection = inspectInlineCheckoutSessionWalletOptionsX747ecc26(raw)
            if (inspection.matchCount == 0) {
                throw InlineCheckoutSessionWalletOptionsX747ecc26NoMatchException(
                    "InlineCheckoutSessionWalletOptionsX747ecc26 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineCheckoutSessionWalletOptionsX747ecc26(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionWalletOptionsX747ecc26> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionWalletOptionsX747ecc26 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionWalletOptionsX747ecc26")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionWalletOptionsX747ecc26,
        ) {
            encoder.requireJsonEncoder("InlineCheckoutSessionWalletOptionsX747ecc26").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCheckoutSessionWalletOptionsX747ecc26(
    element: JsonElement,
): InlineCheckoutSessionWalletOptionsX747ecc26Inspection {
    val raw =
        element as? JsonObject ?: return InlineCheckoutSessionWalletOptionsX747ecc26Inspection(
            matchesCheckoutSessionWalletOptions = false,
            failures = listOf("CheckoutSessionWalletOptions: expected JSON object"),
        )
    val matchesCheckoutSessionWalletOptions = true
    return InlineCheckoutSessionWalletOptionsX747ecc26Inspection(
        matchesCheckoutSessionWalletOptions = matchesCheckoutSessionWalletOptions,
        failures =
            buildList {
                if (!matchesCheckoutSessionWalletOptions) {
                    add(
                        "CheckoutSessionWalletOptions: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

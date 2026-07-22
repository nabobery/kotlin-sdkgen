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

public enum class InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cBranch {
    PaymentMethodOptionsUpi,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cNoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cInspection(
    public val matchesPaymentMethodOptionsUpi: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentMethodOptionsUpi,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/upi.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/upi
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cInspection,
) {
    public val paymentMethodOptionsUpi: PaymentMethodOptionsUpiView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodOptionsUpi) {
                json.decodeFromJsonElement<PaymentMethodOptionsUpiView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
        PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                json
                    .decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodOptionsUpi) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cBranch.PaymentMethodOptionsUpi,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cNoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cInspection(
            matchesPaymentMethodOptionsUpi = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentMethodOptionsUpi: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentMethodOptionsUpi = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7cInspection(
        matchesPaymentMethodOptionsUpi = matchesPaymentMethodOptionsUpi,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentMethodOptionsUpi) {
                    add(
                        "PaymentMethodOptionsUpi: required properties  do not match their declared types",
                    )
                }
                if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        "PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

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

public enum class InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cBranch {
    PaymentIntentPaymentMethodOptionsSepaDebit,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cNoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cInspection(
    public val matchesPaymentIntentPaymentMethodOptionsSepaDebit: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentIntentPaymentMethodOptionsSepaDebit,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/sepa_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cInspection,
) {
    public val paymentIntentPaymentMethodOptionsSepaDebit:
        PaymentIntentPaymentMethodOptionsSepaDebitView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntentPaymentMethodOptionsSepaDebit) {
                json
                    .decodeFromJsonElement<PaymentIntentPaymentMethodOptionsSepaDebitView>(
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

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentIntentPaymentMethodOptionsSepaDebit) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cBranch.PaymentIntentPaymentMethodOptionsSepaDebit,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cNoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cInspection(
            matchesPaymentIntentPaymentMethodOptionsSepaDebit = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentIntentPaymentMethodOptionsSepaDebit: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentIntentPaymentMethodOptionsSepaDebit = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728cInspection(
        matchesPaymentIntentPaymentMethodOptionsSepaDebit = matchesPaymentIntentPaymentMethodOptionsSepaDebit,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentIntentPaymentMethodOptionsSepaDebit) {
                    add(
                        "PaymentIntentPaymentMethodOptionsSepaDebit: required properties  do not match their declared types",
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

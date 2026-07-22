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

public enum class InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Branch {
    PaymentIntentPaymentMethodOptionsBacsDebit,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956NoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Inspection(
    public val matchesPaymentIntentPaymentMethodOptionsBacsDebit: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentIntentPaymentMethodOptionsBacsDebit,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/bacs_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Inspection,
) {
    public val paymentIntentPaymentMethodOptionsBacsDebit:
        PaymentIntentPaymentMethodOptionsBacsDebitView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntentPaymentMethodOptionsBacsDebit) {
                json
                    .decodeFromJsonElement<PaymentIntentPaymentMethodOptionsBacsDebitView>(
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

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentIntentPaymentMethodOptionsBacsDebit) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Branch.PaymentIntentPaymentMethodOptionsBacsDebit,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956 {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956NoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Inspection(
            matchesPaymentIntentPaymentMethodOptionsBacsDebit = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentIntentPaymentMethodOptionsBacsDebit: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentIntentPaymentMethodOptionsBacsDebit = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956Inspection(
        matchesPaymentIntentPaymentMethodOptionsBacsDebit = matchesPaymentIntentPaymentMethodOptionsBacsDebit,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentIntentPaymentMethodOptionsBacsDebit) {
                    add(
                        "PaymentIntentPaymentMethodOptionsBacsDebit: required properties  do not match their declared types",
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

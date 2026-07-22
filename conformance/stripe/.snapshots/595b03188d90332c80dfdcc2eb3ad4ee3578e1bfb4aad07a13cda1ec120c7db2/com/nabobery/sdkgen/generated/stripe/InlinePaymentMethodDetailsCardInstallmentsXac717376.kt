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

public enum class InlinePaymentMethodDetailsCardInstallmentsXac717376Branch {
    PaymentMethodDetailsCardInstallments,
}

public sealed class InlinePaymentMethodDetailsCardInstallmentsXac717376DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardInstallmentsXac717376NoMatchException(
    message: String,
) : InlinePaymentMethodDetailsCardInstallmentsXac717376DecodingException(message)

internal data class InlinePaymentMethodDetailsCardInstallmentsXac717376Inspection(
    public val matchesPaymentMethodDetailsCardInstallments: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentMethodDetailsCardInstallments).count { it }
}

/**
 * Installment details for this payment.
 *
 * For more information, see the [installments integration guide](https://docs.stripe.com/payments/installments).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card/properties/installments
 */
@Serializable(with = InlinePaymentMethodDetailsCardInstallmentsXac717376.Serializer::class)
public class InlinePaymentMethodDetailsCardInstallmentsXac717376 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsCardInstallmentsXac717376Inspection,
) {
    public val paymentMethodDetailsCardInstallments: PaymentMethodDetailsCardInstallmentsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodDetailsCardInstallments) {
                json
                    .decodeFromJsonElement<PaymentMethodDetailsCardInstallmentsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentMethodDetailsCardInstallmentsXac717376Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodDetailsCardInstallments) {
                    add(
                        InlinePaymentMethodDetailsCardInstallmentsXac717376Branch.PaymentMethodDetailsCardInstallments,
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
        ): InlinePaymentMethodDetailsCardInstallmentsXac717376 {
            val inspection = inspectInlinePaymentMethodDetailsCardInstallmentsXac717376(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsCardInstallmentsXac717376NoMatchException(
                    "InlinePaymentMethodDetailsCardInstallmentsXac717376 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsCardInstallmentsXac717376(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsCardInstallmentsXac717376> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardInstallmentsXac717376 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardInstallmentsXac717376")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsCardInstallmentsXac717376,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentMethodDetailsCardInstallmentsXac717376",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsCardInstallmentsXac717376(
    element: JsonElement,
): InlinePaymentMethodDetailsCardInstallmentsXac717376Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodDetailsCardInstallmentsXac717376Inspection(
            matchesPaymentMethodDetailsCardInstallments = false,
            failures = listOf("PaymentMethodDetailsCardInstallments: expected JSON object"),
        )
    val matchesPaymentMethodDetailsCardInstallments = true
    return InlinePaymentMethodDetailsCardInstallmentsXac717376Inspection(
        matchesPaymentMethodDetailsCardInstallments = matchesPaymentMethodDetailsCardInstallments,
        failures =
            buildList {
                if (!matchesPaymentMethodDetailsCardInstallments) {
                    add(
                        "PaymentMethodDetailsCardInstallments: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

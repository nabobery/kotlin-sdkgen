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

public enum class InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cBranch {
    PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments,
}

public sealed class InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cNoMatchException(
    message: String,
) : InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cDecodingException(message)

internal data class InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cInspection(
    public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments,
            ).count { it }
}

/**
 * Installment details for this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails/properties/installments
 */
@Serializable(with = InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c.Serializer::class)
public class InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cInspection,
) {
    public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments:
        PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments) {
                json
                    .decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments) {
                    add(
                        InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cBranch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments,
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
        ): InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c {
            val inspection = inspectInlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cNoMatchException(
                    "InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c(
    element: JsonElement,
): InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cInspection(
            matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments = false,
            failures =
                listOf(
                    "PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments: expected JSON object",
                ),
        )
    val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments = true
    return InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2cInspection(
        matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments,
        failures =
            buildList {
                if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments) {
                    add(
                        "PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallments: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

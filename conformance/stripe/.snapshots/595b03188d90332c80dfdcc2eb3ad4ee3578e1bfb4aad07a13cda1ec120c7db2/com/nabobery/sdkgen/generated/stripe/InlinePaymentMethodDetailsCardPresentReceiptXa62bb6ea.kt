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

public enum class InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaBranch {
    PaymentMethodDetailsCardPresentReceipt,
}

public sealed class InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaNoMatchException(
    message: String,
) : InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaDecodingException(message)

internal data class InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaInspection(
    public val matchesPaymentMethodDetailsCardPresentReceipt: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentMethodDetailsCardPresentReceipt).count { it }
}

/**
 * A collection of fields required to be displayed on receipts. Only required for EMV transactions.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_present/properties/receipt
 */
@Serializable(with = InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea.Serializer::class)
public class InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaInspection,
) {
    public val paymentMethodDetailsCardPresentReceipt: PaymentMethodDetailsCardPresentReceiptView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodDetailsCardPresentReceipt) {
                json
                    .decodeFromJsonElement<PaymentMethodDetailsCardPresentReceiptView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodDetailsCardPresentReceipt) {
                    add(
                        InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaBranch.PaymentMethodDetailsCardPresentReceipt,
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
        ): InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea {
            val inspection = inspectInlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaNoMatchException(
                    "InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea(
    element: JsonElement,
): InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaInspection(
            matchesPaymentMethodDetailsCardPresentReceipt = false,
            failures = listOf("PaymentMethodDetailsCardPresentReceipt: expected JSON object"),
        )
    val matchesPaymentMethodDetailsCardPresentReceipt = true
    return InlinePaymentMethodDetailsCardPresentReceiptXa62bb6eaInspection(
        matchesPaymentMethodDetailsCardPresentReceipt = matchesPaymentMethodDetailsCardPresentReceipt,
        failures =
            buildList {
                if (!matchesPaymentMethodDetailsCardPresentReceipt) {
                    add(
                        "PaymentMethodDetailsCardPresentReceipt: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

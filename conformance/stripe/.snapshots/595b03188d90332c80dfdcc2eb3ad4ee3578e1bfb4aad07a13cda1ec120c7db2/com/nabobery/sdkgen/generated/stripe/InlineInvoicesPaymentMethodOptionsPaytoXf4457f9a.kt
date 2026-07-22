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

public enum class InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aBranch {
    InvoicePaymentMethodOptionsPayto,
}

public sealed class InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aNoMatchException(
    message: String,
) : InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aDecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aInspection(
    public val matchesInvoicePaymentMethodOptionsPayto: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInvoicePaymentMethodOptionsPayto).count { it }
}

/**
 * If paying by `payto`, this sub-hash contains details about the PayTo payment method options to pass to the invoice’s
 * PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/payto
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aInspection,
) {
    public val invoicePaymentMethodOptionsPayto: InvoicePaymentMethodOptionsPaytoView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInvoicePaymentMethodOptionsPayto) {
                json
                    .decodeFromJsonElement<InvoicePaymentMethodOptionsPaytoView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aBranch>
        get() =
            buildSet {
                if (inspection.matchesInvoicePaymentMethodOptionsPayto) {
                    add(
                        InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aBranch.InvoicePaymentMethodOptionsPayto,
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
        ): InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a {
            val inspection = inspectInlineInvoicesPaymentMethodOptionsPaytoXf4457f9a(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aNoMatchException(
                    "InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a,
        ) {
            encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsPaytoXf4457f9a").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoicesPaymentMethodOptionsPaytoXf4457f9a(
    element: JsonElement,
): InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aInspection {
    val raw =
        element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aInspection(
            matchesInvoicePaymentMethodOptionsPayto = false,
            failures = listOf("InvoicePaymentMethodOptionsPayto: expected JSON object"),
        )
    val matchesInvoicePaymentMethodOptionsPayto = true
    return InlineInvoicesPaymentMethodOptionsPaytoXf4457f9aInspection(
        matchesInvoicePaymentMethodOptionsPayto = matchesInvoicePaymentMethodOptionsPayto,
        failures =
            buildList {
                if (!matchesInvoicePaymentMethodOptionsPayto) {
                    add(
                        "InvoicePaymentMethodOptionsPayto: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

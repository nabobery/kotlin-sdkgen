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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Branch {
    InvoicePaymentMethodOptionsPayto,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1NoMatchException(
    message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1DecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Inspection(
    public val matchesInvoicePaymentMethodOptionsPayto: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInvoicePaymentMethodOptionsPayto).count { it }
}

/**
 * This sub-hash contains details about the PayTo payment method options to pass to invoices created by the
 * subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/payto
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Inspection,
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

    public val matchedBranches:
        Set<InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Branch>
        get() =
            buildSet {
                if (inspection.matchesInvoicePaymentMethodOptionsPayto) {
                    add(
                        InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Branch.InvoicePaymentMethodOptionsPayto,
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
        ): InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1 {
            val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1NoMatchException(
                    "InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1(
    element: JsonElement,
): InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Inspection {
    val raw =
        element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Inspection(
            matchesInvoicePaymentMethodOptionsPayto = false,
            failures = listOf("InvoicePaymentMethodOptionsPayto: expected JSON object"),
        )
    val matchesInvoicePaymentMethodOptionsPayto = true
    return InlineSubscriptionsResourcePaymentMethodOptionsPaytoX542135c1Inspection(
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

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

public enum class InlinePaymentLinkInvoiceCreationX9a83f095Branch {
    PaymentLinksResourceInvoiceCreation,
}

public sealed class InlinePaymentLinkInvoiceCreationX9a83f095DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinkInvoiceCreationX9a83f095NoMatchException(
    message: String,
) : InlinePaymentLinkInvoiceCreationX9a83f095DecodingException(message)

internal data class InlinePaymentLinkInvoiceCreationX9a83f095Inspection(
    public val matchesPaymentLinksResourceInvoiceCreation: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentLinksResourceInvoiceCreation).count { it }
}

/**
 * Configuration for creating invoice for payment mode payment links.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/invoice_creation
 */
@Serializable(with = InlinePaymentLinkInvoiceCreationX9a83f095.Serializer::class)
public class InlinePaymentLinkInvoiceCreationX9a83f095 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinkInvoiceCreationX9a83f095Inspection,
) {
    public val paymentLinksResourceInvoiceCreation: PaymentLinksResourceInvoiceCreationView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentLinksResourceInvoiceCreation) {
                json
                    .decodeFromJsonElement<PaymentLinksResourceInvoiceCreationView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentLinkInvoiceCreationX9a83f095Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentLinksResourceInvoiceCreation) {
                    add(
                        InlinePaymentLinkInvoiceCreationX9a83f095Branch.PaymentLinksResourceInvoiceCreation,
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
        ): InlinePaymentLinkInvoiceCreationX9a83f095 {
            val inspection = inspectInlinePaymentLinkInvoiceCreationX9a83f095(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinkInvoiceCreationX9a83f095NoMatchException(
                    "InlinePaymentLinkInvoiceCreationX9a83f095 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentLinkInvoiceCreationX9a83f095(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinkInvoiceCreationX9a83f095> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinkInvoiceCreationX9a83f095 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkInvoiceCreationX9a83f095")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinkInvoiceCreationX9a83f095,
        ) {
            encoder.requireJsonEncoder("InlinePaymentLinkInvoiceCreationX9a83f095").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinkInvoiceCreationX9a83f095(
    element: JsonElement,
): InlinePaymentLinkInvoiceCreationX9a83f095Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentLinkInvoiceCreationX9a83f095Inspection(
            matchesPaymentLinksResourceInvoiceCreation = false,
            failures = listOf("PaymentLinksResourceInvoiceCreation: expected JSON object"),
        )
    val matchesPaymentLinksResourceInvoiceCreation = raw["enabled"] != null
    return InlinePaymentLinkInvoiceCreationX9a83f095Inspection(
        matchesPaymentLinksResourceInvoiceCreation = matchesPaymentLinksResourceInvoiceCreation,
        failures =
            buildList {
                if (!matchesPaymentLinksResourceInvoiceCreation) {
                    add(
                        "PaymentLinksResourceInvoiceCreation: required properties 'enabled' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

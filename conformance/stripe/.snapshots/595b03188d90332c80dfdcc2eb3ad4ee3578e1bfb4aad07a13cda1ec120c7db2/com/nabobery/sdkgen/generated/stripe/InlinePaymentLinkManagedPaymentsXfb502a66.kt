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

public enum class InlinePaymentLinkManagedPaymentsXfb502a66Branch {
    PaymentPagesCheckoutSessionManagedPayments,
}

public sealed class InlinePaymentLinkManagedPaymentsXfb502a66DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinkManagedPaymentsXfb502a66NoMatchException(
    message: String,
) : InlinePaymentLinkManagedPaymentsXfb502a66DecodingException(message)

internal data class InlinePaymentLinkManagedPaymentsXfb502a66Inspection(
    public val matchesPaymentPagesCheckoutSessionManagedPayments: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentPagesCheckoutSessionManagedPayments).count { it }
}

/**
 * Settings for Managed Payments for this Payment Link and resulting [CheckoutSessions](/api/checkout/sessions/object),
 * [PaymentIntents](/api/payment_intents/object), [Invoices](/api/invoices/object), and
 * [Subscriptions](/api/subscriptions/object).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/managed_payments
 */
@Serializable(with = InlinePaymentLinkManagedPaymentsXfb502a66.Serializer::class)
public class InlinePaymentLinkManagedPaymentsXfb502a66 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinkManagedPaymentsXfb502a66Inspection,
) {
    public val paymentPagesCheckoutSessionManagedPayments:
        PaymentPagesCheckoutSessionManagedPaymentsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentPagesCheckoutSessionManagedPayments) {
                json
                    .decodeFromJsonElement<PaymentPagesCheckoutSessionManagedPaymentsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentLinkManagedPaymentsXfb502a66Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentPagesCheckoutSessionManagedPayments) {
                    add(
                        InlinePaymentLinkManagedPaymentsXfb502a66Branch.PaymentPagesCheckoutSessionManagedPayments,
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
        ): InlinePaymentLinkManagedPaymentsXfb502a66 {
            val inspection = inspectInlinePaymentLinkManagedPaymentsXfb502a66(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinkManagedPaymentsXfb502a66NoMatchException(
                    "InlinePaymentLinkManagedPaymentsXfb502a66 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentLinkManagedPaymentsXfb502a66(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinkManagedPaymentsXfb502a66> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinkManagedPaymentsXfb502a66 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkManagedPaymentsXfb502a66")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinkManagedPaymentsXfb502a66,
        ) {
            encoder.requireJsonEncoder("InlinePaymentLinkManagedPaymentsXfb502a66").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinkManagedPaymentsXfb502a66(
    element: JsonElement,
): InlinePaymentLinkManagedPaymentsXfb502a66Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentLinkManagedPaymentsXfb502a66Inspection(
            matchesPaymentPagesCheckoutSessionManagedPayments = false,
            failures = listOf("PaymentPagesCheckoutSessionManagedPayments: expected JSON object"),
        )
    val matchesPaymentPagesCheckoutSessionManagedPayments = raw["enabled"] != null
    return InlinePaymentLinkManagedPaymentsXfb502a66Inspection(
        matchesPaymentPagesCheckoutSessionManagedPayments = matchesPaymentPagesCheckoutSessionManagedPayments,
        failures =
            buildList {
                if (!matchesPaymentPagesCheckoutSessionManagedPayments) {
                    add(
                        "PaymentPagesCheckoutSessionManagedPayments: required properties 'enabled' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

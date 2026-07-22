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

public enum class InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Branch {
    PaymentPagesCheckoutSessionCheckoutAddressDetails,
}

public sealed class InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5NoMatchException(
    message: String,
) : InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Inspection(
    public val matchesPaymentPagesCheckoutSessionCheckoutAddressDetails: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentPagesCheckoutSessionCheckoutAddressDetails).count { it }
}

/**
 * Shipping information for this Checkout Session.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_collected_information/properties/ship
 * ping_details
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5.Serializer::class)
public class InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Inspection,
) {
    public val paymentPagesCheckoutSessionCheckoutAddressDetails:
        PaymentPagesCheckoutSessionCheckoutAddressDetailsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentPagesCheckoutSessionCheckoutAddressDetails) {
                json
                    .decodeFromJsonElement<PaymentPagesCheckoutSessionCheckoutAddressDetailsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentPagesCheckoutSessionCheckoutAddressDetails) {
                    add(
                        InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Branch.PaymentPagesCheckoutSessionCheckoutAddressDetails,
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
        ): InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5 {
            val inspection = inspectInlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5NoMatchException(
                    "InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5(
    element: JsonElement,
): InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Inspection {
    val raw =
        element as? JsonObject
            ?: return InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Inspection(
                matchesPaymentPagesCheckoutSessionCheckoutAddressDetails = false,
                failures = listOf("PaymentPagesCheckoutSessionCheckoutAddressDetails: expected JSON object"),
            )
    val matchesPaymentPagesCheckoutSessionCheckoutAddressDetails = raw["address"] != null && raw["name"].isString()
    return InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5Inspection(
        matchesPaymentPagesCheckoutSessionCheckoutAddressDetails = matchesPaymentPagesCheckoutSessionCheckoutAddressDetails,
        failures =
            buildList {
                if (!matchesPaymentPagesCheckoutSessionCheckoutAddressDetails) {
                    add(
                        "PaymentPagesCheckoutSessionCheckoutAddressDetails: required properties 'address', 'name' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

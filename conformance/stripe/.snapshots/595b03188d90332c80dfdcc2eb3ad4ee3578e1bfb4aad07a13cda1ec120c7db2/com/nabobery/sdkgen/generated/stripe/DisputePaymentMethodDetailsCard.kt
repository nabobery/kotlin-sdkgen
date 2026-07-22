package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/dispute_payment_method_details_card
 */
@Serializable(with = DisputePaymentMethodDetailsCard.Serializer::class)
public class DisputePaymentMethodDetailsCard(
    /**
     * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
     * `unionpay`, `visa` or `unknown`.
     */
    public val brand: String,
    /**
     * The type of dispute opened. Different case types may have varying fees and financial impact.
     */
    public val caseType: InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061,
    /**
     * The card network's specific dispute reason code, which maps to one of Stripe's primary dispute categories to
     * simplify response guidance. The [Network code map](https://stripe.com/docs/disputes/categories#network-code-map)
     * lists all available dispute reason codes by network.
     */
    public val networkReasonCode: String? = null,
) {
    public class Builder {
        private var brandValue: String? = null

        public var brand: String
            get() = requireNotNull(brandValue) { "brand is required" }
            set(`value`) {
                brandValue = value
            }

        private var caseTypeValue: InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061? = null

        public var caseType: InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061
            get() = requireNotNull(caseTypeValue) { "caseType is required" }
            set(`value`) {
                caseTypeValue = value
            }

        /**
         * The card network's specific dispute reason code, which maps to one of Stripe's primary dispute categories to
         * simplify response guidance. The [Network code map](https://stripe.com/docs/disputes/categories#network-code-map)
         * lists all available dispute reason codes by network.
         */
        public var networkReasonCode: String? = null

        public fun build(): DisputePaymentMethodDetailsCard {
            check(brandValue != null) { "brand is required" }
            check(caseTypeValue != null) { "caseType is required" }
            return DisputePaymentMethodDetailsCard(
                brand = brand,
                caseType = caseType,
                networkReasonCode = networkReasonCode,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DisputePaymentMethodDetailsCard = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DisputePaymentMethodDetailsCard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DisputePaymentMethodDetailsCard {
            val jsonDecoder = decoder.requireJsonDecoder("DisputePaymentMethodDetailsCard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DisputePaymentMethodDetailsCard must be a JSON object")
            val brand = json.decodeRequired<String>(rawObject, "brand")
            val caseType =
                json.decodeRequired<InlineDisputePaymentMethodDetailsCardCaseTypeX14cff061>(
                    rawObject,
                    "case_type",
                )
            return DisputePaymentMethodDetailsCard(
                brand = brand,
                caseType = caseType,
                networkReasonCode =
                    rawObject["network_reason_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DisputePaymentMethodDetailsCard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DisputePaymentMethodDetailsCard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("brand", value.brand)
                    put("case_type", json.encodeToJsonElement(value.caseType))
                    value.networkReasonCode?.let { put("network_reason_code", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun disputePaymentMethodDetailsCard(
    block: DisputePaymentMethodDetailsCard.Builder.() -> Unit,
): DisputePaymentMethodDetailsCard = DisputePaymentMethodDetailsCard.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "DisputePaymentMethodDetailsCard is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

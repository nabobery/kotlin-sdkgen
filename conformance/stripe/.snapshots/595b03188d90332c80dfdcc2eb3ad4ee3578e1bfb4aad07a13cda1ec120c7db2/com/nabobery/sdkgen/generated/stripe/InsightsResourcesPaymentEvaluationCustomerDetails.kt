package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Customer details attached to this payment evaluation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_customer_details
 */
@Serializable(with = InsightsResourcesPaymentEvaluationCustomerDetails.Serializer::class)
public class InsightsResourcesPaymentEvaluationCustomerDetails(
    /**
     * The ID of the customer associated with the payment evaluation.
     */
    public val customer: String? = null,
    /**
     * The ID of the Account representing the customer associated with the payment evaluation.
     */
    public val customerAccount: String? = null,
    /**
     * The customer's email address.
     */
    public val email: String? = null,
    /**
     * The customer's full name or business name.
     */
    public val name: String? = null,
    /**
     * The customer's phone number.
     */
    public val phone: String? = null,
) {
    public class Builder {
        /**
         * The ID of the customer associated with the payment evaluation.
         */
        public var customer: String? = null

        /**
         * The ID of the Account representing the customer associated with the payment evaluation.
         */
        public var customerAccount: String? = null

        /**
         * The customer's email address.
         */
        public var email: String? = null

        /**
         * The customer's full name or business name.
         */
        public var name: String? = null

        /**
         * The customer's phone number.
         */
        public var phone: String? = null

        public fun build(): InsightsResourcesPaymentEvaluationCustomerDetails =
            InsightsResourcesPaymentEvaluationCustomerDetails(
                customer = customer,
                customerAccount = customerAccount,
                email = email,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InsightsResourcesPaymentEvaluationCustomerDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InsightsResourcesPaymentEvaluationCustomerDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InsightsResourcesPaymentEvaluationCustomerDetails {
            val jsonDecoder = decoder.requireJsonDecoder("InsightsResourcesPaymentEvaluationCustomerDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InsightsResourcesPaymentEvaluationCustomerDetails must be a JSON object",
                    )
            return InsightsResourcesPaymentEvaluationCustomerDetails(
                customer =
                    rawObject["customer"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                customerAccount =
                    rawObject["customer_account"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                email =
                    rawObject["email"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                name =
                    rawObject["name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                phone =
                    rawObject["phone"]?.let { element ->
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
            `value`: InsightsResourcesPaymentEvaluationCustomerDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InsightsResourcesPaymentEvaluationCustomerDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customer?.let { put("customer", it) }
                    value.customerAccount?.let { put("customer_account", it) }
                    value.email?.let { put("email", it) }
                    value.name?.let { put("name", it) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun insightsResourcesPaymentEvaluationCustomerDetails(
    block: InsightsResourcesPaymentEvaluationCustomerDetails.Builder.() -> Unit,
): InsightsResourcesPaymentEvaluationCustomerDetails = InsightsResourcesPaymentEvaluationCustomerDetails.build(block)

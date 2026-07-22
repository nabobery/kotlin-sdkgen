package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30(
    public val address: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb? = null,
    public val email: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEmailXd4c94ef5? = null,
    public val name: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a? = null,
    public val phone: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0? = null,
    public val taxId: String? = null,
) {
    public class Builder {
        public var address: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb? =
            null

        public var email: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEmailXd4c94ef5? = null

        public var name: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a? = null

        public var phone: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0? = null

        public var taxId: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30(
                address = address,
                email = email,
                name = name,
                phone = phone,
                taxId = taxId,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30(
                address =
                    rawObject["address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressX54bef4eb>(
                                it,
                            )
                    },
                email =
                    rawObject["email"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEmailXd4c94ef5>(
                                it,
                            )
                    },
                name =
                    rawObject["name"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a>(
                            it,
                        )
                    },
                phone =
                    rawObject["phone"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0>(
                                it,
                            )
                    },
                taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.address?.let { put("address", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", json.encodeToJsonElement(it)) }
                    value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
                    value.taxId?.let { put("tax_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX66645f30.build(block)

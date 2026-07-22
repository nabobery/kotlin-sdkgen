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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e(
    public val address: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988? = null,
    public val email: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEmailXc7ea2322? = null,
    public val name: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f? = null,
    public val phone: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef? = null,
    public val taxId: String? = null,
) {
    public class Builder {
        public var address: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988? =
            null

        public var email: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEmailXc7ea2322? = null

        public var name: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f? = null

        public var phone: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef? = null

        public var taxId: String? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e(
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e(
                address =
                    rawObject["address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988>(
                                it,
                            )
                    },
                email =
                    rawObject["email"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEmailXc7ea2322>(
                                it,
                            )
                    },
                name =
                    rawObject["name"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f>(
                            it,
                        )
                    },
                phone =
                    rawObject["phone"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef>(
                                it,
                            )
                    },
                taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e.build(block)

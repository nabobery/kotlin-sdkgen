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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10(
    public val address: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac? = null,
    public val email: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b? = null,
    public val name: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9? = null,
    public val phone: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46? = null,
    public val taxId: String? = null,
) {
    public class Builder {
        public var address: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac? = null

        public var email:
            InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b? = null

        public var name:
            InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9? = null

        public var phone:
            InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46? = null

        public var taxId: String? = null

        public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10 =
            InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10(
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10 must be a JSON object",
                    )
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10(
                address =
                    rawObject["address"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX1b9588ac>(
                                it,
                            )
                    },
                email =
                    rawObject["email"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b>(
                                it,
                            )
                    },
                name =
                    rawObject["name"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9>(
                                it,
                            )
                    },
                phone =
                    rawObject["phone"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46>(
                                it,
                            )
                    },
                taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10",
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10(
    block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10.Builder.() -> Unit,
): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10 =
    InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX5bed1b10.build(block)

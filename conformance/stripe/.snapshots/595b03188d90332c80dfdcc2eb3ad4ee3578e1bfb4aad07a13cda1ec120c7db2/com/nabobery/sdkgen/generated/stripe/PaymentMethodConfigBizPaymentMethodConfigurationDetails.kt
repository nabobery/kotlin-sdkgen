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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class PaymentMethodConfigBizPaymentMethodConfigurationDetailsView(
    public val id: String,
    public val parent: String? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_config_biz_payment_method_configuration_details
 */
@Serializable(with = PaymentMethodConfigBizPaymentMethodConfigurationDetails.Serializer::class)
public class PaymentMethodConfigBizPaymentMethodConfigurationDetails(
    /**
     * ID of the payment method configuration used.
     */
    public val id: String,
    /**
     * ID of the parent payment method configuration used.
     */
    public val parent: String? = null,
) {
    public class Builder {
        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        /**
         * ID of the parent payment method configuration used.
         */
        public var parent: String? = null

        public fun build(): PaymentMethodConfigBizPaymentMethodConfigurationDetails {
            check(idValue != null) { "id is required" }
            return PaymentMethodConfigBizPaymentMethodConfigurationDetails(
                id = id,
                parent = parent,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodConfigBizPaymentMethodConfigurationDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodConfigBizPaymentMethodConfigurationDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodConfigBizPaymentMethodConfigurationDetails {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodConfigBizPaymentMethodConfigurationDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentMethodConfigBizPaymentMethodConfigurationDetails must be a JSON object",
                    )
            val id = json.decodeRequired<String>(rawObject, "id")
            return PaymentMethodConfigBizPaymentMethodConfigurationDetails(
                id = id,
                parent =
                    rawObject["parent"]?.let { element ->
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
            `value`: PaymentMethodConfigBizPaymentMethodConfigurationDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodConfigBizPaymentMethodConfigurationDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("id", value.id)
                    value.parent?.let { put("parent", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodConfigBizPaymentMethodConfigurationDetails(
    block: PaymentMethodConfigBizPaymentMethodConfigurationDetails.Builder.() -> Unit,
): PaymentMethodConfigBizPaymentMethodConfigurationDetails =
    PaymentMethodConfigBizPaymentMethodConfigurationDetails.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentMethodConfigBizPaymentMethodConfigurationDetails is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

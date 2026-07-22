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
import kotlin.Unit

@Serializable
public data class PaymentMethodUsBankAccountStatusDetailsView(
    public val blocked: PaymentMethodUsBankAccountBlocked? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account_status_details
 */
@Serializable(with = PaymentMethodUsBankAccountStatusDetails.Serializer::class)
public class PaymentMethodUsBankAccountStatusDetails(
    public val blocked: PaymentMethodUsBankAccountBlocked? = null,
) {
    public class Builder {
        public var blocked: PaymentMethodUsBankAccountBlocked? = null

        public fun build(): PaymentMethodUsBankAccountStatusDetails =
            PaymentMethodUsBankAccountStatusDetails(
                blocked = blocked,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodUsBankAccountStatusDetails =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodUsBankAccountStatusDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodUsBankAccountStatusDetails {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodUsBankAccountStatusDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodUsBankAccountStatusDetails must be a JSON object")
            return PaymentMethodUsBankAccountStatusDetails(
                blocked =
                    rawObject["blocked"]?.let {
                        json.decodeFromJsonElement<PaymentMethodUsBankAccountBlocked>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodUsBankAccountStatusDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodUsBankAccountStatusDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.blocked?.let { put("blocked", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodUsBankAccountStatusDetails(
    block: PaymentMethodUsBankAccountStatusDetails.Builder.() -> Unit,
): PaymentMethodUsBankAccountStatusDetails = PaymentMethodUsBankAccountStatusDetails.build(block)

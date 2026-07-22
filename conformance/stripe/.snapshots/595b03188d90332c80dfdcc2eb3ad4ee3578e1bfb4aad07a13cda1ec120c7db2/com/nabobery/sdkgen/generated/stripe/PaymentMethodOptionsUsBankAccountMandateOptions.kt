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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_us_bank_account_mandate_options
 */
@Serializable(with = PaymentMethodOptionsUsBankAccountMandateOptions.Serializer::class)
public class PaymentMethodOptionsUsBankAccountMandateOptions(
    /**
     * Mandate collection method
     */
    public val collectionMethod: InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa? = null,
) {
    public class Builder {
        /**
         * Mandate collection method
         */
        public var collectionMethod:
            InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa? = null

        public fun build(): PaymentMethodOptionsUsBankAccountMandateOptions =
            PaymentMethodOptionsUsBankAccountMandateOptions(
                collectionMethod = collectionMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodOptionsUsBankAccountMandateOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodOptionsUsBankAccountMandateOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodOptionsUsBankAccountMandateOptions {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsUsBankAccountMandateOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "PaymentMethodOptionsUsBankAccountMandateOptions must be a JSON object",
                    )
            return PaymentMethodOptionsUsBankAccountMandateOptions(
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json
                            .decodeFromJsonElement<InlinePaymentMethodOptionsUsBankAccountMandateOptionsCollectionMethodX4cb6faaa>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodOptionsUsBankAccountMandateOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsUsBankAccountMandateOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodOptionsUsBankAccountMandateOptions(
    block: PaymentMethodOptionsUsBankAccountMandateOptions.Builder.() -> Unit,
): PaymentMethodOptionsUsBankAccountMandateOptions = PaymentMethodOptionsUsBankAccountMandateOptions.build(block)

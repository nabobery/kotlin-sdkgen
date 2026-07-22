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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_resource_error
 */
@Serializable(with = PaymentFlowsAmountDetailsResourceError.Serializer::class)
public class PaymentFlowsAmountDetailsResourceError(
    /**
     * The code of the error that occurred when validating the current amount details.
     */
    public val code: InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb? = null,
    /**
     * A message providing more details about the error.
     */
    public val message: String? = null,
) {
    public class Builder {
        /**
         * The code of the error that occurred when validating the current amount details.
         */
        public var code: InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb? = null

        /**
         * A message providing more details about the error.
         */
        public var message: String? = null

        public fun build(): PaymentFlowsAmountDetailsResourceError =
            PaymentFlowsAmountDetailsResourceError(
                code = code,
                message = message,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentFlowsAmountDetailsResourceError =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentFlowsAmountDetailsResourceError> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentFlowsAmountDetailsResourceError {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsAmountDetailsResourceError")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentFlowsAmountDetailsResourceError must be a JSON object")
            return PaymentFlowsAmountDetailsResourceError(
                code =
                    rawObject["code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb?>(
                                element,
                            )
                        }
                    },
                message =
                    rawObject["message"]?.let { element ->
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
            `value`: PaymentFlowsAmountDetailsResourceError,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsAmountDetailsResourceError")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.code?.let { put("code", json.encodeToJsonElement(it)) }
                    value.message?.let { put("message", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentFlowsAmountDetailsResourceError(
    block: PaymentFlowsAmountDetailsResourceError.Builder.() -> Unit,
): PaymentFlowsAmountDetailsResourceError = PaymentFlowsAmountDetailsResourceError.build(block)

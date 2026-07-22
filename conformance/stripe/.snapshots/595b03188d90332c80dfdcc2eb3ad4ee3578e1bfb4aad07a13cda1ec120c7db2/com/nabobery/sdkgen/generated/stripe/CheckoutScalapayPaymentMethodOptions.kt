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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_scalapay_payment_method_options
 */
@Serializable(with = CheckoutScalapayPaymentMethodOptions.Serializer::class)
public class CheckoutScalapayPaymentMethodOptions(
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public val captureMethod: InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d? = null,
) {
    public class Builder {
        /**
         * Controls when the funds will be captured from the customer's account.
         */
        public var captureMethod: InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d? =
            null

        public fun build(): CheckoutScalapayPaymentMethodOptions =
            CheckoutScalapayPaymentMethodOptions(
                captureMethod = captureMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutScalapayPaymentMethodOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutScalapayPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutScalapayPaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutScalapayPaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CheckoutScalapayPaymentMethodOptions must be a JSON object")
            return CheckoutScalapayPaymentMethodOptions(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutScalapayPaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutScalapayPaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutScalapayPaymentMethodOptions(
    block: CheckoutScalapayPaymentMethodOptions.Builder.() -> Unit,
): CheckoutScalapayPaymentMethodOptions = CheckoutScalapayPaymentMethodOptions.build(block)

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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_payco_payment_method_options
 */
@Serializable(with = CheckoutPaycoPaymentMethodOptions.Serializer::class)
public class CheckoutPaycoPaymentMethodOptions(
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public val captureMethod: InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08? = null,
) {
    public class Builder {
        /**
         * Controls when the funds will be captured from the customer's account.
         */
        public var captureMethod: InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08? = null

        public fun build(): CheckoutPaycoPaymentMethodOptions =
            CheckoutPaycoPaymentMethodOptions(
                captureMethod = captureMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutPaycoPaymentMethodOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutPaycoPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutPaycoPaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutPaycoPaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CheckoutPaycoPaymentMethodOptions must be a JSON object")
            return CheckoutPaycoPaymentMethodOptions(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineCheckoutPaycoPaymentMethodOptionsCaptureMethodX7e1ccd08>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutPaycoPaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutPaycoPaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutPaycoPaymentMethodOptions(
    block: CheckoutPaycoPaymentMethodOptions.Builder.() -> Unit,
): CheckoutPaycoPaymentMethodOptions = CheckoutPaycoPaymentMethodOptions.build(block)

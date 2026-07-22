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
import kotlin.Unit

@Serializable
public data class PaymentLinksResourcePaymentMethodOptionsView(
    public val card: InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_payment_method_options
 */
@Serializable(with = PaymentLinksResourcePaymentMethodOptions.Serializer::class)
public class PaymentLinksResourcePaymentMethodOptions(
    /**
     * Configuration for `card` payment methods.
     */
    public val card: InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b? = null,
) {
    public class Builder {
        /**
         * Configuration for `card` payment methods.
         */
        public var card: InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b? = null

        public fun build(): PaymentLinksResourcePaymentMethodOptions =
            PaymentLinksResourcePaymentMethodOptions(
                card = card,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentLinksResourcePaymentMethodOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentLinksResourcePaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentLinksResourcePaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourcePaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentLinksResourcePaymentMethodOptions must be a JSON object")
            return PaymentLinksResourcePaymentMethodOptions(
                card =
                    rawObject["card"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentLinksResourcePaymentMethodOptionsCardX474abf4b?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentLinksResourcePaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourcePaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentLinksResourcePaymentMethodOptions(
    block: PaymentLinksResourcePaymentMethodOptions.Builder.() -> Unit,
): PaymentLinksResourcePaymentMethodOptions = PaymentLinksResourcePaymentMethodOptions.build(block)

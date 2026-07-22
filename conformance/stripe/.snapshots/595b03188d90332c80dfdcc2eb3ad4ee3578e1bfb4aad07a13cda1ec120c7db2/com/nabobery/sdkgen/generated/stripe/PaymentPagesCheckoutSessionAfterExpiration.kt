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
public data class PaymentPagesCheckoutSessionAfterExpirationView(
    public val recovery: InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_after_expiration
 */
@Serializable(with = PaymentPagesCheckoutSessionAfterExpiration.Serializer::class)
public class PaymentPagesCheckoutSessionAfterExpiration(
    /**
     * When set, configuration used to recover the Checkout Session on expiry.
     */
    public val recovery: InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c? = null,
) {
    public class Builder {
        /**
         * When set, configuration used to recover the Checkout Session on expiry.
         */
        public var recovery: InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c? = null

        public fun build(): PaymentPagesCheckoutSessionAfterExpiration =
            PaymentPagesCheckoutSessionAfterExpiration(
                recovery = recovery,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionAfterExpiration =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionAfterExpiration> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionAfterExpiration {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionAfterExpiration")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentPagesCheckoutSessionAfterExpiration must be a JSON object")
            return PaymentPagesCheckoutSessionAfterExpiration(
                recovery =
                    rawObject["recovery"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionAfterExpiration,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionAfterExpiration")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.recovery?.let { put("recovery", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentPagesCheckoutSessionAfterExpiration(
    block: PaymentPagesCheckoutSessionAfterExpiration.Builder.() -> Unit,
): PaymentPagesCheckoutSessionAfterExpiration = PaymentPagesCheckoutSessionAfterExpiration.build(block)

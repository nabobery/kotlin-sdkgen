package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Specify whether Checkout should collect a payment method. When set to `if_required`, Checkout will not collect a
 * payment method when the total due for the session is 0.This may occur if the Checkout Session includes a free trial
 * or a discount.
 *
 * Can only be set in `subscription` mode. Defaults to `always`.
 *
 * If you'd like information on how to collect a payment method outside of Checkout, read the guide on [configuring
 * subscriptions with a free trial](https://docs.stripe.com/payments/checkout/free-trials).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `if_required`.
     */
    public data object IfRequired : InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc() {
        public override val `value`: String = "if_required"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc =
            when (value) {
                Always.value -> Always
                IfRequired.value -> IfRequired
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionX2b3fa1bc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

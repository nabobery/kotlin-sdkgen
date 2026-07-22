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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `if_required`.
     */
    public data object IfRequired : InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6() {
        public override val `value`: String = "if_required"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6 =
            when (value) {
                Always.value -> Always
                IfRequired.value -> IfRequired
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodCollectionXecd22be6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

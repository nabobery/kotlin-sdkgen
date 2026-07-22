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
 * Controls whether the mobile payment element displays the option to remove a saved payment method."
 *
 * Allowing buyers to remove their saved payment methods impacts subscriptions that depend on that payment method.
 * Removing the payment method detaches the [`customer`
 * object](https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer) from that
 * [PaymentMethod](https://docs.stripe.com/api/payment_methods).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * _resource_features/properties/payment_method_remove
 */
@Serializable(with = InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683.Serializer::class)
public sealed class InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683()

    public companion object {
        public fun fromValue(`value`: String): InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683 =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

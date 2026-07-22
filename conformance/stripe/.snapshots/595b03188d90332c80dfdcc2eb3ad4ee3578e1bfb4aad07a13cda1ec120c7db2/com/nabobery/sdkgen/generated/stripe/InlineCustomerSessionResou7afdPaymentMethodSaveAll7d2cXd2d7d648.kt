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
 * Allows overriding the value of allow_override when saving a new payment method when payment_method_save is set to
 * disabled. Use values: "always", "limited", or "unspecified".
 *
 * If not specified, defaults to `nil` (no override value).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * _resource_features/properties/payment_method_save_allow_redisplay_override
 */
@Serializable(with = InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648.Serializer::class)
public sealed class InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `limited`.
     */
    public data object Limited : InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648() {
        public override val `value`: String = "limited"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648()

    public companion object {
        public fun fromValue(`value`: String): InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648 =
            when (value) {
                Always.value -> Always
                Limited.value -> Limited
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

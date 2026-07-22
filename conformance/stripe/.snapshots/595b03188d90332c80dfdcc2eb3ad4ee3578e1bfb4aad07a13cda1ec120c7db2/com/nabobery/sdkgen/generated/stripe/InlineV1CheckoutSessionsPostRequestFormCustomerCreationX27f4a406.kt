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
 * Configure whether a Checkout Session creates a [Customer](https://docs.stripe.com/api/customers) during Session
 * confirmation.
 *
 * When a Customer is not created, you can still retrieve email, address, and other customer data entered in Checkout
 * with
 * [customer_details](https://docs.stripe.com/api/checkout/sessions/object#checkout_session_object-customer_details).
 *
 * Sessions that don't create Customers instead are grouped by [guest
 * customers](https://docs.stripe.com/payments/checkout/guest-customers)
 * in the Dashboard. Promotion codes limited to first time customers will return invalid for these Sessions.
 *
 * Can only be set in `payment` and `setup` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/customer_creation
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `if_required`.
     */
    public data object IfRequired : InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406() {
        public override val `value`: String = "if_required"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406 =
            when (value) {
                Always.value -> Always
                IfRequired.value -> IfRequired
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCustomerCreationX27f4a406,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

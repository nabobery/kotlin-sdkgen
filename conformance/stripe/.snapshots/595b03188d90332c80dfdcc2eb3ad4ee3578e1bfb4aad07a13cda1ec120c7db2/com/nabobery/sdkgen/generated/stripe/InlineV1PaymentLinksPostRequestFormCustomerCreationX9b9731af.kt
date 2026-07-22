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
 * Configures whether [checkout sessions](https://docs.stripe.com/api/checkout/sessions) created by this payment link
 * create a [Customer](https://docs.stripe.com/api/customers).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/customer_creation
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always`.
     */
    public data object Always : InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af() {
        public override val `value`: String = "always"
    }

    /**
     * Documented value. Wire value: `if_required`.
     */
    public data object IfRequired : InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af() {
        public override val `value`: String = "if_required"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af =
            when (value) {
                Always.value -> Always
                IfRequired.value -> IfRequired
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormCustomerCreationX9b9731af,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

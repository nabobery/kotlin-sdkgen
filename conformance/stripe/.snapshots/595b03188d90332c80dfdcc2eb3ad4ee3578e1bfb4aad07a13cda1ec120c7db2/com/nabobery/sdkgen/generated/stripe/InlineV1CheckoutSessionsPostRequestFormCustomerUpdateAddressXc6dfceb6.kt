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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/customer_update/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/customer_update/properties/address
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6 =
            when (value) {
                Auto.value -> Auto
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateAddressXc6dfceb6,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

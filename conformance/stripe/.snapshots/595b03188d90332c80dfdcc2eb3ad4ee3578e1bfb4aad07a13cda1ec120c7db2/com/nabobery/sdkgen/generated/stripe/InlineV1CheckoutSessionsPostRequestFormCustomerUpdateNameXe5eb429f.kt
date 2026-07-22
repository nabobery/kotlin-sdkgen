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
 * ded/schema/properties/customer_update/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/customer_update/properties/name
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f =
            when (value) {
                Auto.value -> Auto
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCustomerUpdateNameXe5eb429f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

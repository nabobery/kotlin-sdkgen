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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_domain/properties/object
 */
@Serializable(with = InlinePaymentMethodDomainObjectValueXd889161a.Serializer::class)
public sealed class InlinePaymentMethodDomainObjectValueXd889161a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `payment_method_domain`.
     */
    public data object PaymentMethodDomain : InlinePaymentMethodDomainObjectValueXd889161a() {
        public override val `value`: String = "payment_method_domain"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodDomainObjectValueXd889161a()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodDomainObjectValueXd889161a =
            when (value) {
                PaymentMethodDomain.value -> PaymentMethodDomain
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDomainObjectValueXd889161a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDomainObjectValueXd889161a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDomainObjectValueXd889161a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDomainObjectValueXd889161a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

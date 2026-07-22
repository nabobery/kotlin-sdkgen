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
 * Source: sdkgen://source/openapi.json#/components/schemas/apple_pay_domain/properties/object
 */
@Serializable(with = InlineApplePayDomainObjectValueX8e34b46a.Serializer::class)
public sealed class InlineApplePayDomainObjectValueX8e34b46a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `apple_pay_domain`.
     */
    public data object ApplePayDomain : InlineApplePayDomainObjectValueX8e34b46a() {
        public override val `value`: String = "apple_pay_domain"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineApplePayDomainObjectValueX8e34b46a()

    public companion object {
        public fun fromValue(`value`: String): InlineApplePayDomainObjectValueX8e34b46a =
            when (value) {
                ApplePayDomain.value -> ApplePayDomain
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineApplePayDomainObjectValueX8e34b46a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineApplePayDomainObjectValueX8e34b46a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineApplePayDomainObjectValueX8e34b46a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineApplePayDomainObjectValueX8e34b46a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

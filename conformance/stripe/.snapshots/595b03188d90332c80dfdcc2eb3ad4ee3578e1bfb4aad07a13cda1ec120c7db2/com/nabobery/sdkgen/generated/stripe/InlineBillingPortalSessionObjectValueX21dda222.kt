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
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.session/properties/object
 */
@Serializable(with = InlineBillingPortalSessionObjectValueX21dda222.Serializer::class)
public sealed class InlineBillingPortalSessionObjectValueX21dda222 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `billing_portal.session`.
     */
    public data object BillingPortalSession : InlineBillingPortalSessionObjectValueX21dda222() {
        public override val `value`: String = "billing_portal.session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingPortalSessionObjectValueX21dda222()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingPortalSessionObjectValueX21dda222 =
            when (value) {
                BillingPortalSession.value -> BillingPortalSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineBillingPortalSessionObjectValueX21dda222> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingPortalSessionObjectValueX21dda222",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingPortalSessionObjectValueX21dda222 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingPortalSessionObjectValueX21dda222,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

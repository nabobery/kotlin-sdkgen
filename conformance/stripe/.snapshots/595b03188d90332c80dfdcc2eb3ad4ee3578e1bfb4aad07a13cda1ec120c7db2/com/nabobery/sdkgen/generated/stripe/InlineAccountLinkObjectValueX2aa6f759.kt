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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_link/properties/object
 */
@Serializable(with = InlineAccountLinkObjectValueX2aa6f759.Serializer::class)
public sealed class InlineAccountLinkObjectValueX2aa6f759 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account_link`.
     */
    public data object AccountLink : InlineAccountLinkObjectValueX2aa6f759() {
        public override val `value`: String = "account_link"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountLinkObjectValueX2aa6f759()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountLinkObjectValueX2aa6f759 =
            when (value) {
                AccountLink.value -> AccountLink
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountLinkObjectValueX2aa6f759> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountLinkObjectValueX2aa6f759",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountLinkObjectValueX2aa6f759 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountLinkObjectValueX2aa6f759,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

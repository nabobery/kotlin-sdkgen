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
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_session/properties/object
 */
@Serializable(with = InlineCustomerSessionObjectValueXa4c482ab.Serializer::class)
public sealed class InlineCustomerSessionObjectValueXa4c482ab {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `customer_session`.
     */
    public data object CustomerSession : InlineCustomerSessionObjectValueXa4c482ab() {
        public override val `value`: String = "customer_session"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCustomerSessionObjectValueXa4c482ab()

    public companion object {
        public fun fromValue(`value`: String): InlineCustomerSessionObjectValueXa4c482ab =
            when (value) {
                CustomerSession.value -> CustomerSession
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCustomerSessionObjectValueXa4c482ab> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionObjectValueXa4c482ab",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCustomerSessionObjectValueXa4c482ab =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerSessionObjectValueXa4c482ab,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

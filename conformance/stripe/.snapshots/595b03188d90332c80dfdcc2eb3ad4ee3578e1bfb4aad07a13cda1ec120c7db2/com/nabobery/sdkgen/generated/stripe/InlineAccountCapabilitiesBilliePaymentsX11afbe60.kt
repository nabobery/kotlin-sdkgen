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
 * The status of the Billie capability of the account, or whether the account can directly process Billie payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/billie_payments
 */
@Serializable(with = InlineAccountCapabilitiesBilliePaymentsX11afbe60.Serializer::class)
public sealed class InlineAccountCapabilitiesBilliePaymentsX11afbe60 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesBilliePaymentsX11afbe60() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesBilliePaymentsX11afbe60() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesBilliePaymentsX11afbe60() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesBilliePaymentsX11afbe60()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesBilliePaymentsX11afbe60 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesBilliePaymentsX11afbe60> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesBilliePaymentsX11afbe60",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesBilliePaymentsX11afbe60 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesBilliePaymentsX11afbe60,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * The status of the FPX payments capability of the account, or whether the account can directly process FPX charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/fpx_payments
 */
@Serializable(with = InlineAccountCapabilitiesFpxPaymentsX8ac2b899.Serializer::class)
public sealed class InlineAccountCapabilitiesFpxPaymentsX8ac2b899 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesFpxPaymentsX8ac2b899() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesFpxPaymentsX8ac2b899() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesFpxPaymentsX8ac2b899() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesFpxPaymentsX8ac2b899()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesFpxPaymentsX8ac2b899 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesFpxPaymentsX8ac2b899> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesFpxPaymentsX8ac2b899",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesFpxPaymentsX8ac2b899 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesFpxPaymentsX8ac2b899,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

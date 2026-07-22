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
 * The status of the Sofort payments capability of the account, or whether the account can directly process Sofort
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/sofort_payments
 */
@Serializable(with = InlineAccountCapabilitiesSofortPaymentsX833a4c46.Serializer::class)
public sealed class InlineAccountCapabilitiesSofortPaymentsX833a4c46 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesSofortPaymentsX833a4c46() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesSofortPaymentsX833a4c46() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesSofortPaymentsX833a4c46() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesSofortPaymentsX833a4c46()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesSofortPaymentsX833a4c46 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesSofortPaymentsX833a4c46> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesSofortPaymentsX833a4c46",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesSofortPaymentsX833a4c46 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesSofortPaymentsX833a4c46,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

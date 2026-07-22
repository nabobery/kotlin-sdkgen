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
 * The status of the Klarna payments capability of the account, or whether the account can directly process Klarna
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/klarna_payments
 */
@Serializable(with = InlineAccountCapabilitiesKlarnaPaymentsX12f964c5.Serializer::class)
public sealed class InlineAccountCapabilitiesKlarnaPaymentsX12f964c5 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesKlarnaPaymentsX12f964c5() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesKlarnaPaymentsX12f964c5() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesKlarnaPaymentsX12f964c5() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesKlarnaPaymentsX12f964c5()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesKlarnaPaymentsX12f964c5 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesKlarnaPaymentsX12f964c5> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesKlarnaPaymentsX12f964c5",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesKlarnaPaymentsX12f964c5 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesKlarnaPaymentsX12f964c5,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

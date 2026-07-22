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
 * The status of the Multibanco payments capability of the account, or whether the account can directly process
 * Multibanco charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/multibanco_payments
 */
@Serializable(with = InlineAccountCapabilitiesMultibancoPaymentsX9247b418.Serializer::class)
public sealed class InlineAccountCapabilitiesMultibancoPaymentsX9247b418 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `active`.
     */
    public data object Active : InlineAccountCapabilitiesMultibancoPaymentsX9247b418() {
        public override val `value`: String = "active"
    }

    /**
     * Documented value. Wire value: `inactive`.
     */
    public data object Inactive : InlineAccountCapabilitiesMultibancoPaymentsX9247b418() {
        public override val `value`: String = "inactive"
    }

    /**
     * Documented value. Wire value: `pending`.
     */
    public data object Pending : InlineAccountCapabilitiesMultibancoPaymentsX9247b418() {
        public override val `value`: String = "pending"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineAccountCapabilitiesMultibancoPaymentsX9247b418()

    public companion object {
        public fun fromValue(`value`: String): InlineAccountCapabilitiesMultibancoPaymentsX9247b418 =
            when (value) {
                Active.value -> Active
                Inactive.value -> Inactive
                Pending.value -> Pending
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineAccountCapabilitiesMultibancoPaymentsX9247b418> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesMultibancoPaymentsX9247b418",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesMultibancoPaymentsX9247b418 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineAccountCapabilitiesMultibancoPaymentsX9247b418,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

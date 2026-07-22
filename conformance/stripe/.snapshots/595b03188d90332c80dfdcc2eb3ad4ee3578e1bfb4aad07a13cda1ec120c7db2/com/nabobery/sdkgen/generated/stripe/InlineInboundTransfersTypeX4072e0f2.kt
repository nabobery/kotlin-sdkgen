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
 * The type of the payment method used in the InboundTransfer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/inbound_transfers/properties/type
 */
@Serializable(with = InlineInboundTransfersTypeX4072e0f2.Serializer::class)
public sealed class InlineInboundTransfersTypeX4072e0f2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `us_bank_account`.
     */
    public data object UsBankAccount : InlineInboundTransfersTypeX4072e0f2() {
        public override val `value`: String = "us_bank_account"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInboundTransfersTypeX4072e0f2()

    public companion object {
        public fun fromValue(`value`: String): InlineInboundTransfersTypeX4072e0f2 =
            when (value) {
                UsBankAccount.value -> UsBankAccount
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInboundTransfersTypeX4072e0f2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInboundTransfersTypeX4072e0f2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineInboundTransfersTypeX4072e0f2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInboundTransfersTypeX4072e0f2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0/properties/netwo
 * rk.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0/properties/netwo
 * rk
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed.Serializer::class)
public sealed class InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ach`.
     */
    public data object Ach : InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed() {
        public override val `value`: String = "ach"
    }

    /**
     * Documented value. Wire value: `us_domestic_wire`.
     */
    public data object UsDomesticWire : InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed() {
        public override val `value`: String = "us_domestic_wire"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed =
            when (value) {
                Ach.value -> Ach
                UsDomesticWire.value -> UsDomesticWire
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundPab148PostRequestFormNetworkXf857f5ed,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

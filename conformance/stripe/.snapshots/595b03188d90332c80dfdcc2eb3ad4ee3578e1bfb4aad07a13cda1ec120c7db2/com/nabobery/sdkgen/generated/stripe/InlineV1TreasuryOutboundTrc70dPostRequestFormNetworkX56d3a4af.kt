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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0/properties/netw
 * ork.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/0/properties/netw
 * ork
 */
@Serializable(with = InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af.Serializer::class)
public sealed class InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ach`.
     */
    public data object Ach : InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af() {
        public override val `value`: String = "ach"
    }

    /**
     * Documented value. Wire value: `us_domestic_wire`.
     */
    public data object UsDomesticWire : InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af() {
        public override val `value`: String = "us_domestic_wire"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af =
            when (value) {
                Ach.value -> Ach
                UsDomesticWire.value -> UsDomesticWire
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryOutboundTrc70dPostRequestFormNetworkX56d3a4af,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/tracking_details/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/tracking_details/properties/type
 */
@Serializable(with = InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4.Serializer::class)
public sealed class InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ach`.
     */
    public data object Ach : InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4() {
        public override val `value`: String = "ach"
    }

    /**
     * Documented value. Wire value: `us_domestic_wire`.
     */
    public data object UsDomesticWire : InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4() {
        public override val `value`: String = "us_domestic_wire"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4 =
            when (value) {
                Ach.value -> Ach
                UsDomesticWire.value -> UsDomesticWire
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsTypeX539facf4,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

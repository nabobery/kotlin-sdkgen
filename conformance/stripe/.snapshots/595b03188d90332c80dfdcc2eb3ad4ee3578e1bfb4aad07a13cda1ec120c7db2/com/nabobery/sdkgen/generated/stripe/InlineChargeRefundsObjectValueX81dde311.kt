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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/refunds/properties/object
 */
@Serializable(with = InlineChargeRefundsObjectValueX81dde311.Serializer::class)
public sealed class InlineChargeRefundsObjectValueX81dde311 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `list`.
     */
    public data object List : InlineChargeRefundsObjectValueX81dde311() {
        public override val `value`: String = "list"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineChargeRefundsObjectValueX81dde311()

    public companion object {
        public fun fromValue(`value`: String): InlineChargeRefundsObjectValueX81dde311 =
            when (value) {
                List.value -> List
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineChargeRefundsObjectValueX81dde311> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineChargeRefundsObjectValueX81dde311",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineChargeRefundsObjectValueX81dde311 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineChargeRefundsObjectValueX81dde311,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

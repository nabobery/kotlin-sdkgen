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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.value_list_item/properties/object
 */
@Serializable(with = InlineRadarValueListItemObjectValueX0f6091f8.Serializer::class)
public sealed class InlineRadarValueListItemObjectValueX0f6091f8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `radar.value_list_item`.
     */
    public data object RadarValueListItem : InlineRadarValueListItemObjectValueX0f6091f8() {
        public override val `value`: String = "radar.value_list_item"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineRadarValueListItemObjectValueX0f6091f8()

    public companion object {
        public fun fromValue(`value`: String): InlineRadarValueListItemObjectValueX0f6091f8 =
            when (value) {
                RadarValueListItem.value -> RadarValueListItem
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineRadarValueListItemObjectValueX0f6091f8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineRadarValueListItemObjectValueX0f6091f8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineRadarValueListItemObjectValueX0f6091f8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineRadarValueListItemObjectValueX0f6091f8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

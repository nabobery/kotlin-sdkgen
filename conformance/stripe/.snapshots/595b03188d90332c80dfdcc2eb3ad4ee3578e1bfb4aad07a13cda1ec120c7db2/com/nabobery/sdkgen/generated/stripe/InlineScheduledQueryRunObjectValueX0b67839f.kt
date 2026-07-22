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
 * Source: sdkgen://source/openapi.json#/components/schemas/scheduled_query_run/properties/object
 */
@Serializable(with = InlineScheduledQueryRunObjectValueX0b67839f.Serializer::class)
public sealed class InlineScheduledQueryRunObjectValueX0b67839f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `scheduled_query_run`.
     */
    public data object ScheduledQueryRun : InlineScheduledQueryRunObjectValueX0b67839f() {
        public override val `value`: String = "scheduled_query_run"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineScheduledQueryRunObjectValueX0b67839f()

    public companion object {
        public fun fromValue(`value`: String): InlineScheduledQueryRunObjectValueX0b67839f =
            when (value) {
                ScheduledQueryRun.value -> ScheduledQueryRun
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineScheduledQueryRunObjectValueX0b67839f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineScheduledQueryRunObjectValueX0b67839f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineScheduledQueryRunObjectValueX0b67839f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineScheduledQueryRunObjectValueX0b67839f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

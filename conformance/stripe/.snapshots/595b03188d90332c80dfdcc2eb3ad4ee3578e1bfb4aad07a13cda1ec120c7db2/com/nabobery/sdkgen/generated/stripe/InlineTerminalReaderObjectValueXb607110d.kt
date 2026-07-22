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
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.reader/properties/object
 */
@Serializable(with = InlineTerminalReaderObjectValueXb607110d.Serializer::class)
public sealed class InlineTerminalReaderObjectValueXb607110d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `terminal.reader`.
     */
    public data object TerminalReader : InlineTerminalReaderObjectValueXb607110d() {
        public override val `value`: String = "terminal.reader"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTerminalReaderObjectValueXb607110d()

    public companion object {
        public fun fromValue(`value`: String): InlineTerminalReaderObjectValueXb607110d =
            when (value) {
                TerminalReader.value -> TerminalReader
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTerminalReaderObjectValueXb607110d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTerminalReaderObjectValueXb607110d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTerminalReaderObjectValueXb607110d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderObjectValueXb607110d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

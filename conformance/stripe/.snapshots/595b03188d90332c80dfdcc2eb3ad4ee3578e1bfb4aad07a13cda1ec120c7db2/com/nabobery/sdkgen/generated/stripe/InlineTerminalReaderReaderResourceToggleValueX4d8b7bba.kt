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
 * The toggle's collected value. Can be `enabled` or `disabled`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_toggle/properties/value
 */
@Serializable(with = InlineTerminalReaderReaderResourceToggleValueX4d8b7bba.Serializer::class)
public sealed class InlineTerminalReaderReaderResourceToggleValueX4d8b7bba {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineTerminalReaderReaderResourceToggleValueX4d8b7bba() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `enabled`.
     */
    public data object Enabled : InlineTerminalReaderReaderResourceToggleValueX4d8b7bba() {
        public override val `value`: String = "enabled"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTerminalReaderReaderResourceToggleValueX4d8b7bba()

    public companion object {
        public fun fromValue(`value`: String): InlineTerminalReaderReaderResourceToggleValueX4d8b7bba =
            when (value) {
                Disabled.value -> Disabled
                Enabled.value -> Enabled
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTerminalReaderReaderResourceToggleValueX4d8b7bba> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourceToggleValueX4d8b7bba",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceToggleValueX4d8b7bba =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderReaderResourceToggleValueX4d8b7bba,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

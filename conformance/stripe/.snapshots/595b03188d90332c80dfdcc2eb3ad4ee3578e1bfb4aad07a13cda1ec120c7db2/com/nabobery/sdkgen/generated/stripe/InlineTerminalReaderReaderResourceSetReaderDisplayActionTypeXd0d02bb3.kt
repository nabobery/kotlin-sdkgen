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
 * Type of information to be displayed by the reader. Only `cart` is currently supported.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_set_reader_display_action/properties
 * /type
 */
@Serializable(with = InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3.Serializer::class)
public sealed class InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cart`.
     */
    public data object Cart : InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3() {
        public override val `value`: String = "cart"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3()

    public companion object {
        public fun fromValue(`value`: String): InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3 =
            when (value) {
                Cart.value -> Cart
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderReaderResourceSetReaderDisplayActionTypeXd0d02bb3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

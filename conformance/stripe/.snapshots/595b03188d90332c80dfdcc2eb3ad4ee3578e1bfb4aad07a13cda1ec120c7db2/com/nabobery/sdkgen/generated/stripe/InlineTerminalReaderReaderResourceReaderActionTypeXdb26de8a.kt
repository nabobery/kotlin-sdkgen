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
 * Type of action performed by the reader.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_reader_action/properties/type
 */
@Serializable(with = InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a.Serializer::class)
public sealed class InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `collect_inputs`.
     */
    public data object CollectInputs : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "collect_inputs"
    }

    /**
     * Documented value. Wire value: `collect_payment_method`.
     */
    public data object CollectPaymentMethod : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "collect_payment_method"
    }

    /**
     * Documented value. Wire value: `confirm_payment_intent`.
     */
    public data object ConfirmPaymentIntent : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "confirm_payment_intent"
    }

    /**
     * Documented value. Wire value: `print_content`.
     */
    public data object PrintContent : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "print_content"
    }

    /**
     * Documented value. Wire value: `process_payment_intent`.
     */
    public data object ProcessPaymentIntent : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "process_payment_intent"
    }

    /**
     * Documented value. Wire value: `process_setup_intent`.
     */
    public data object ProcessSetupIntent : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "process_setup_intent"
    }

    /**
     * Documented value. Wire value: `refund_payment`.
     */
    public data object RefundPayment : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "refund_payment"
    }

    /**
     * Documented value. Wire value: `set_reader_display`.
     */
    public data object SetReaderDisplay : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a() {
        public override val `value`: String = "set_reader_display"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a()

    public companion object {
        public fun fromValue(`value`: String): InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a =
            when (value) {
                CollectInputs.value -> CollectInputs
                CollectPaymentMethod.value -> CollectPaymentMethod
                ConfirmPaymentIntent.value -> ConfirmPaymentIntent
                PrintContent.value -> PrintContent
                ProcessPaymentIntent.value -> ProcessPaymentIntent
                ProcessSetupIntent.value -> ProcessSetupIntent
                RefundPayment.value -> RefundPayment
                SetReaderDisplay.value -> SetReaderDisplay
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

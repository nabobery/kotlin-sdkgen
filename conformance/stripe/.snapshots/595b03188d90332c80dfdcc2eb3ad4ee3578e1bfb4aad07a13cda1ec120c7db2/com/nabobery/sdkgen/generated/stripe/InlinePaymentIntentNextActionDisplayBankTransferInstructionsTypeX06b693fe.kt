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
 * Type of bank transfer
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_display_bank_transfer_instructions/proper
 * ties/type
 */
@Serializable(with = InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe.Serializer::class)
public sealed class InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `eu_bank_transfer`.
     */
    public data object EuBankTransfer : InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe() {
        public override val `value`: String = "eu_bank_transfer"
    }

    /**
     * Documented value. Wire value: `gb_bank_transfer`.
     */
    public data object GbBankTransfer : InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe() {
        public override val `value`: String = "gb_bank_transfer"
    }

    /**
     * Documented value. Wire value: `jp_bank_transfer`.
     */
    public data object JpBankTransfer : InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe() {
        public override val `value`: String = "jp_bank_transfer"
    }

    /**
     * Documented value. Wire value: `mx_bank_transfer`.
     */
    public data object MxBankTransfer : InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe() {
        public override val `value`: String = "mx_bank_transfer"
    }

    /**
     * Documented value. Wire value: `us_bank_transfer`.
     */
    public data object UsBankTransfer : InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe() {
        public override val `value`: String = "us_bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe =
            when (value) {
                EuBankTransfer.value -> EuBankTransfer
                GbBankTransfer.value -> GbBankTransfer
                JpBankTransfer.value -> JpBankTransfer
                MxBankTransfer.value -> MxBankTransfer
                UsBankTransfer.value -> UsBankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentNextActionDisplayBankTransferInstructionsTypeX06b693fe,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

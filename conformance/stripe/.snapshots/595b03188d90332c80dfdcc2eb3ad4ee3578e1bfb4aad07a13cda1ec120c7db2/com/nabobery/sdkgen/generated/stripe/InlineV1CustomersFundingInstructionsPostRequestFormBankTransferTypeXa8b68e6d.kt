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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/bank_transfer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/bank_transfer/properties/type
 */
@Serializable(with = InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d.Serializer::class)
public sealed class InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `eu_bank_transfer`.
     */
    public data object EuBankTransfer : InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d() {
        public override val `value`: String = "eu_bank_transfer"
    }

    /**
     * Documented value. Wire value: `gb_bank_transfer`.
     */
    public data object GbBankTransfer : InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d() {
        public override val `value`: String = "gb_bank_transfer"
    }

    /**
     * Documented value. Wire value: `jp_bank_transfer`.
     */
    public data object JpBankTransfer : InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d() {
        public override val `value`: String = "jp_bank_transfer"
    }

    /**
     * Documented value. Wire value: `mx_bank_transfer`.
     */
    public data object MxBankTransfer : InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d() {
        public override val `value`: String = "mx_bank_transfer"
    }

    /**
     * Documented value. Wire value: `us_bank_transfer`.
     */
    public data object UsBankTransfer : InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d() {
        public override val `value`: String = "us_bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d =
            when (value) {
                EuBankTransfer.value -> EuBankTransfer
                GbBankTransfer.value -> GbBankTransfer
                JpBankTransfer.value -> JpBankTransfer
                MxBankTransfer.value -> MxBankTransfer
                UsBankTransfer.value -> UsBankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersFundingInstructionsPostRequestFormBankTransferTypeXa8b68e6d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

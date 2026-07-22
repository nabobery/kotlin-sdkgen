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
 * The `funding_type` to get the instructions for.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1funding_instructions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/funding_type
 */
@Serializable(with = InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487.Serializer::class)
public sealed class InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `bank_transfer`.
     */
    public data object BankTransfer : InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487() {
        public override val `value`: String = "bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487 =
            when (value) {
                BankTransfer.value -> BankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersFundingInstructionsPostRequestFormFundingTypeXb2d2a487,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

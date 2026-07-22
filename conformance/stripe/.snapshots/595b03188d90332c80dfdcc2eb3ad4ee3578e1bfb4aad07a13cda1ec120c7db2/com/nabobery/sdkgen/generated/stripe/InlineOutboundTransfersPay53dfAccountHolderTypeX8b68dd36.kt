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
 * Account holder type: individual or company.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/outbound_transfers_payment_method_details_us_bank_account/properties
 * /account_holder_type
 */
@Serializable(with = InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36.Serializer::class)
public sealed class InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `company`.
     */
    public data object Company : InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36() {
        public override val `value`: String = "company"
    }

    /**
     * Documented value. Wire value: `individual`.
     */
    public data object Individual : InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36() {
        public override val `value`: String = "individual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36()

    public companion object {
        public fun fromValue(`value`: String): InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36 =
            when (value) {
                Company.value -> Company
                Individual.value -> Individual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineOutboundTransfersPay53dfAccountHolderTypeX8b68dd36,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

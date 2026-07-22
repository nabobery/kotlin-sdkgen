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
 * Bank account verification method. The default value is `automatic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_acss_debit/properties/verification_me
 * thod
 */
@Serializable(with = InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38.Serializer::class)
public sealed class InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `instant`.
     */
    public data object Instant : InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38() {
        public override val `value`: String = "instant"
    }

    /**
     * Documented value. Wire value: `microdeposits`.
     */
    public data object Microdeposits : InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38() {
        public override val `value`: String = "microdeposits"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38()

    public companion object {
        public fun fromValue(`value`: String): InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38 =
            when (value) {
                Automatic.value -> Automatic
                Instant.value -> Instant
                Microdeposits.value -> Microdeposits
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicePaymentMethodOptionsAcssDebitVerificationMethodX087d0e38,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

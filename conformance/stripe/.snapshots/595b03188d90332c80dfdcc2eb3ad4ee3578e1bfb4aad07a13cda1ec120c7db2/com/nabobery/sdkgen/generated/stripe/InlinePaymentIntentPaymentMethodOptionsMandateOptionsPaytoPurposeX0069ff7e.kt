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
 * The purpose for which payments are made. Has a default value based on your merchant category code.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_payto/properti
 * es/purpose
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `dependant_support`.
     */
    public data object DependantSupport : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "dependant_support"
    }

    /**
     * Documented value. Wire value: `government`.
     */
    public data object Government : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "government"
    }

    /**
     * Documented value. Wire value: `loan`.
     */
    public data object Loan : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "loan"
    }

    /**
     * Documented value. Wire value: `mortgage`.
     */
    public data object Mortgage : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "mortgage"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `pension`.
     */
    public data object Pension : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "pension"
    }

    /**
     * Documented value. Wire value: `personal`.
     */
    public data object Personal : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "personal"
    }

    /**
     * Documented value. Wire value: `retail`.
     */
    public data object Retail : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "retail"
    }

    /**
     * Documented value. Wire value: `salary`.
     */
    public data object Salary : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "salary"
    }

    /**
     * Documented value. Wire value: `tax`.
     */
    public data object Tax : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "tax"
    }

    /**
     * Documented value. Wire value: `utility`.
     */
    public data object Utility : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e() {
        public override val `value`: String = "utility"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e =
            when (value) {
                DependantSupport.value -> DependantSupport
                Government.value -> Government
                Loan.value -> Loan
                Mortgage.value -> Mortgage
                Other.value -> Other
                Pension.value -> Pension
                Personal.value -> Personal
                Retail.value -> Retail
                Salary.value -> Salary
                Tax.value -> Tax
                Utility.value -> Utility
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX0069ff7e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

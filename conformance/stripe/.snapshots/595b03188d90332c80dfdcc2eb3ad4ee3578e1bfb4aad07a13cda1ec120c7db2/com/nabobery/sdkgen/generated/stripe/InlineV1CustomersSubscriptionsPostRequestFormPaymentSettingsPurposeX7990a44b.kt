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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/p
 * roperties/mandate_options/properties/purpose.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto/anyOf/0/p
 * roperties/mandate_options/properties/purpose
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `dependant_support`.
     */
    public data object DependantSupport : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "dependant_support"
    }

    /**
     * Documented value. Wire value: `government`.
     */
    public data object Government : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "government"
    }

    /**
     * Documented value. Wire value: `loan`.
     */
    public data object Loan : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "loan"
    }

    /**
     * Documented value. Wire value: `mortgage`.
     */
    public data object Mortgage : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "mortgage"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `pension`.
     */
    public data object Pension : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "pension"
    }

    /**
     * Documented value. Wire value: `personal`.
     */
    public data object Personal : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "personal"
    }

    /**
     * Documented value. Wire value: `retail`.
     */
    public data object Retail : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "retail"
    }

    /**
     * Documented value. Wire value: `salary`.
     */
    public data object Salary : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "salary"
    }

    /**
     * Documented value. Wire value: `tax`.
     */
    public data object Tax : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "tax"
    }

    /**
     * Documented value. Wire value: `utility`.
     */
    public data object Utility : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b() {
        public override val `value`: String = "utility"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b =
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

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPurposeX7990a44b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

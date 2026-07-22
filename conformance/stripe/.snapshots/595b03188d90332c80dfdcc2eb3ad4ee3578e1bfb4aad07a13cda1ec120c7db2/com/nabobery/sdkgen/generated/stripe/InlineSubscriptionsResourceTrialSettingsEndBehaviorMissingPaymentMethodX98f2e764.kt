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
 * Indicates how the subscription should change when the trial ends if the user did not provide a payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_trial_settings_end_behavior/properties/missin
 * g_payment_method
 */
@Serializable(with = InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764.Serializer::class)
public sealed class InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cancel`.
     */
    public data object Cancel : InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764() {
        public override val `value`: String = "cancel"
    }

    /**
     * Documented value. Wire value: `create_invoice`.
     */
    public data object CreateInvoice : InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764() {
        public override val `value`: String = "create_invoice"
    }

    /**
     * Documented value. Wire value: `pause`.
     */
    public data object Pause : InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764() {
        public override val `value`: String = "pause"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764 =
            when (value) {
                Cancel.value -> Cancel
                CreateInvoice.value -> CreateInvoice
                Pause.value -> Pause
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionsResourceTrialSettingsEndBehaviorMissingPaymentMethodX98f2e764,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

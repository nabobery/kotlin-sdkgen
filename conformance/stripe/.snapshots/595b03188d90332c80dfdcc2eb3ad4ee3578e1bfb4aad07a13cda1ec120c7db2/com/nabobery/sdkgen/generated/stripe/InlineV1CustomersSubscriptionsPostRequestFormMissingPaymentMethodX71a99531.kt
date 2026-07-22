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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/trial_settings/properties/end_behavior/properties/
 * missing_payment_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/trial_settings/properties/end_behavior/properties/
 * missing_payment_method
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cancel`.
     */
    public data object Cancel : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531() {
        public override val `value`: String = "cancel"
    }

    /**
     * Documented value. Wire value: `create_invoice`.
     */
    public data object CreateInvoice : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531() {
        public override val `value`: String = "create_invoice"
    }

    /**
     * Documented value. Wire value: `pause`.
     */
    public data object Pause : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531() {
        public override val `value`: String = "pause"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531 =
            when (value) {
                Cancel.value -> Cancel
                CreateInvoice.value -> CreateInvoice
                Pause.value -> Pause
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX71a99531,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

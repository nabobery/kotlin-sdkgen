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
 * sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_mandate_options/properties/default_for/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_mandate_options/properties/default_for/items
 */
@Serializable(with = InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b.Serializer::class)
public sealed class InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `invoice`.
     */
    public data object Invoice : InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b() {
        public override val `value`: String = "invoice"
    }

    /**
     * Documented value. Wire value: `subscription`.
     */
    public data object Subscription : InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b() {
        public override val `value`: String = "subscription"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b =
            when (value) {
                Invoice.value -> Invoice
                Subscription.value -> Subscription
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutAcssDebitMandateOptionsDefaultForItemX933d1c8b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

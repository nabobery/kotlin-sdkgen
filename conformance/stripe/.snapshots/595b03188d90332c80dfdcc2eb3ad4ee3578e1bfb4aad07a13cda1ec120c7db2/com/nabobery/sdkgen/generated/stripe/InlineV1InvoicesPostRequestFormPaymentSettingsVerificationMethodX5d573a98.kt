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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properti
 * es/verification_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properti
 * es/verification_method
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `instant`.
     */
    public data object Instant : InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98() {
        public override val `value`: String = "instant"
    }

    /**
     * Documented value. Wire value: `microdeposits`.
     */
    public data object Microdeposits : InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98() {
        public override val `value`: String = "microdeposits"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98 =
            when (value) {
                Automatic.value -> Automatic
                Instant.value -> Instant
                Microdeposits.value -> Microdeposits
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsVerificationMethodX5d573a98,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_types/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_types/anyOf/1
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesAnyOf2Xf8dee414,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

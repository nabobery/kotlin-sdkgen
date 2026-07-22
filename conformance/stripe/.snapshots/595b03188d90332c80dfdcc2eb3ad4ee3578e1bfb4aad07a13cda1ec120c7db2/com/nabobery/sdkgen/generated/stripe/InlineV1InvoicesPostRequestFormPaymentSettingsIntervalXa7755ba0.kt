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
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installments/proper
 * ties/plan/anyOf/0/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installments/proper
 * ties/plan/anyOf/0/properties/interval
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `month`.
     */
    public data object Month : InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0() {
        public override val `value`: String = "month"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0()

    public companion object {
        public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0 =
            when (value) {
                Month.value -> Month
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsIntervalXa7755ba0,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

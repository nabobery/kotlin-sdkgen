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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/mandate_options/properties/supported_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/mandate_options/properties/supported_types/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `india`.
     */
    public data object India : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d() {
        public override val `value`: String = "india"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d =
            when (value) {
                India.value -> India
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXe5d8b61d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

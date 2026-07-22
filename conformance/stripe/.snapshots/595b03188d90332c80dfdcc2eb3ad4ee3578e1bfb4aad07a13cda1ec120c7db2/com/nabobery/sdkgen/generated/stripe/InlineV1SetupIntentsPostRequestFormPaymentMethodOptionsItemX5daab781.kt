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
 * chema/properties/payment_method_options/properties/us_bank_account/properties/networks/properties/requested/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/networks/properties/requested/items
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ach`.
     */
    public data object Ach : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781() {
        public override val `value`: String = "ach"
    }

    /**
     * Documented value. Wire value: `us_domestic_wire`.
     */
    public data object UsDomesticWire : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781() {
        public override val `value`: String = "us_domestic_wire"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781 =
            when (value) {
                Ach.value -> Ach
                UsDomesticWire.value -> UsDomesticWire
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsItemX5daab781,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

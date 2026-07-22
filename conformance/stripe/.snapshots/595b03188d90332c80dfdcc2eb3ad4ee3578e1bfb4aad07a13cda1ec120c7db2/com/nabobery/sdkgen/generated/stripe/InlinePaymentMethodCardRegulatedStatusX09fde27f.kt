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
 * Status of a card based on the card issuer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card/properties/regulated_status
 */
@Serializable(with = InlinePaymentMethodCardRegulatedStatusX09fde27f.Serializer::class)
public sealed class InlinePaymentMethodCardRegulatedStatusX09fde27f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `regulated`.
     */
    public data object Regulated : InlinePaymentMethodCardRegulatedStatusX09fde27f() {
        public override val `value`: String = "regulated"
    }

    /**
     * Documented value. Wire value: `unregulated`.
     */
    public data object Unregulated : InlinePaymentMethodCardRegulatedStatusX09fde27f() {
        public override val `value`: String = "unregulated"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodCardRegulatedStatusX09fde27f()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodCardRegulatedStatusX09fde27f =
            when (value) {
                Regulated.value -> Regulated
                Unregulated.value -> Unregulated
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodCardRegulatedStatusX09fde27f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodCardRegulatedStatusX09fde27f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodCardRegulatedStatusX09fde27f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodCardRegulatedStatusX09fde27f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

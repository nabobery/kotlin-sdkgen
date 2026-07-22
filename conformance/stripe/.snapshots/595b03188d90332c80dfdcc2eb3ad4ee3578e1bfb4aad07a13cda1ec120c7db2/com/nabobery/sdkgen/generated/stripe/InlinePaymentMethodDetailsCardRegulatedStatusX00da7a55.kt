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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card/properties/regulated_status
 */
@Serializable(with = InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55.Serializer::class)
public sealed class InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `regulated`.
     */
    public data object Regulated : InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55() {
        public override val `value`: String = "regulated"
    }

    /**
     * Documented value. Wire value: `unregulated`.
     */
    public data object Unregulated : InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55() {
        public override val `value`: String = "unregulated"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55 =
            when (value) {
                Regulated.value -> Regulated
                Unregulated.value -> Unregulated
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

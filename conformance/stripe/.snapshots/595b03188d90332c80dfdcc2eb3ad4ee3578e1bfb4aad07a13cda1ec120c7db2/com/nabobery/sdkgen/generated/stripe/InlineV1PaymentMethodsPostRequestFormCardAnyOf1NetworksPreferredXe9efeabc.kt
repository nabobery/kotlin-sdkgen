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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/0/properties/networks/properties/preferred.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/0/properties/networks/properties/preferred
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cartes_bancaires`.
     */
    public data object CartesBancaires : InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc() {
        public override val `value`: String = "cartes_bancaires"
    }

    /**
     * Documented value. Wire value: `mastercard`.
     */
    public data object Mastercard : InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc() {
        public override val `value`: String = "mastercard"
    }

    /**
     * Documented value. Wire value: `visa`.
     */
    public data object Visa : InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc() {
        public override val `value`: String = "visa"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc =
            when (value) {
                CartesBancaires.value -> CartesBancaires
                Mastercard.value -> Mastercard
                Visa.value -> Visa
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksPreferredXe9efeabc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/pa
 * ypal/properties/category.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/pa
 * ypal/properties/category
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `digital_goods`.
     */
    public data object DigitalGoods : InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094() {
        public override val `value`: String = "digital_goods"
    }

    /**
     * Documented value. Wire value: `donation`.
     */
    public data object Donation : InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094() {
        public override val `value`: String = "donation"
    }

    /**
     * Documented value. Wire value: `physical_goods`.
     */
    public data object PhysicalGoods : InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094() {
        public override val `value`: String = "physical_goods"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094 =
            when (value) {
                DigitalGoods.value -> DigitalGoods
                Donation.value -> Donation
                PhysicalGoods.value -> PhysicalGoods
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsCategoryXc75f9094,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options/properties/paypal/properties/category.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options/properties/paypal/properties/category
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088.Serializer::class)
public sealed class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `digital_goods`.
     */
    public data object DigitalGoods : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088() {
        public override val `value`: String = "digital_goods"
    }

    /**
     * Documented value. Wire value: `donation`.
     */
    public data object Donation : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088() {
        public override val `value`: String = "donation"
    }

    /**
     * Documented value. Wire value: `physical_goods`.
     */
    public data object PhysicalGoods : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088() {
        public override val `value`: String = "physical_goods"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088 =
            when (value) {
                DigitalGoods.value -> DigitalGoods
                Donation.value -> Donation
                PhysicalGoods.value -> PhysicalGoods
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCategoryX9df87088,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

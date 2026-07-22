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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options/prope
 * rties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options/prope
 * rties/amount_type
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3 =
            when (value) {
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

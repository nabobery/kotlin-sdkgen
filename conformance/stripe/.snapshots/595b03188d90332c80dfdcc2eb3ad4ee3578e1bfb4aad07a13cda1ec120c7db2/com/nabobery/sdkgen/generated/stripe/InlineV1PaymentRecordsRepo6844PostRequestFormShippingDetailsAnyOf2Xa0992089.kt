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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/shipping_details/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/shipping_details/anyOf/1
 */
@Serializable(with = InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089.Serializer::class)
public sealed class InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

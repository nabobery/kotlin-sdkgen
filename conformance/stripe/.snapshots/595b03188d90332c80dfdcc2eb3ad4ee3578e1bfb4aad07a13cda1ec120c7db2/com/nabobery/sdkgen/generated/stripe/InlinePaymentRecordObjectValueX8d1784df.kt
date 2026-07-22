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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_record/properties/object
 */
@Serializable(with = InlinePaymentRecordObjectValueX8d1784df.Serializer::class)
public sealed class InlinePaymentRecordObjectValueX8d1784df {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `payment_record`.
     */
    public data object PaymentRecord : InlinePaymentRecordObjectValueX8d1784df() {
        public override val `value`: String = "payment_record"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentRecordObjectValueX8d1784df()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentRecordObjectValueX8d1784df =
            when (value) {
                PaymentRecord.value -> PaymentRecord
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentRecordObjectValueX8d1784df> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentRecordObjectValueX8d1784df",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentRecordObjectValueX8d1784df =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentRecordObjectValueX8d1784df,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

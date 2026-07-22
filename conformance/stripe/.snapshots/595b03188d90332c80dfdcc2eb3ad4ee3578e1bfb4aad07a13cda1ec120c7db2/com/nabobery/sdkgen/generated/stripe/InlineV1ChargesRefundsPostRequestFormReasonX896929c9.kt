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
 * String indicating the reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and
 * `requested_by_customer`. If you believe the charge to be fraudulent, specifying `fraudulent` as the reason will add
 * the associated card and email to your [block lists](https://docs.stripe.com/radar/lists), and will also help us
 * improve our fraud detection algorithms.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/reason
 */
@Serializable(with = InlineV1ChargesRefundsPostRequestFormReasonX896929c9.Serializer::class)
public sealed class InlineV1ChargesRefundsPostRequestFormReasonX896929c9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `duplicate`.
     */
    public data object Duplicate : InlineV1ChargesRefundsPostRequestFormReasonX896929c9() {
        public override val `value`: String = "duplicate"
    }

    /**
     * Documented value. Wire value: `fraudulent`.
     */
    public data object Fraudulent : InlineV1ChargesRefundsPostRequestFormReasonX896929c9() {
        public override val `value`: String = "fraudulent"
    }

    /**
     * Documented value. Wire value: `requested_by_customer`.
     */
    public data object RequestedByCustomer : InlineV1ChargesRefundsPostRequestFormReasonX896929c9() {
        public override val `value`: String = "requested_by_customer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1ChargesRefundsPostRequestFormReasonX896929c9()

    public companion object {
        public fun fromValue(`value`: String): InlineV1ChargesRefundsPostRequestFormReasonX896929c9 =
            when (value) {
                Duplicate.value -> Duplicate
                Fraudulent.value -> Fraudulent
                RequestedByCustomer.value -> RequestedByCustomer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1ChargesRefundsPostRequestFormReasonX896929c9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundsPostRequestFormReasonX896929c9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1ChargesRefundsPostRequestFormReasonX896929c9 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesRefundsPostRequestFormReasonX896929c9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

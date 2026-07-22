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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/carrier_text/anyOf/0/properties/header_title/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/carrier_text/anyOf/0/properties/header_title/anyOf/1
 */
@Serializable(with = InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f.Serializer::class)
public sealed class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf1AnyOf2Xea24f45f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

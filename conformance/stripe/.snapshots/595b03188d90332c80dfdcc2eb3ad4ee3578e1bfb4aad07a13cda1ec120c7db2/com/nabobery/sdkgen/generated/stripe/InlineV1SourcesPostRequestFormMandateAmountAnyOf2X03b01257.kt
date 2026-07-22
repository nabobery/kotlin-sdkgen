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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/amount/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/amount/anyOf/1
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257 =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

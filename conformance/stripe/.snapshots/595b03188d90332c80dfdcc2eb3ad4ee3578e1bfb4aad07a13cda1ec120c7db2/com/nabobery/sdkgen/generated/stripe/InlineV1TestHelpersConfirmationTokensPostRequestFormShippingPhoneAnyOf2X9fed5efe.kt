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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/shipping/properties/phone/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/shipping/properties/phone/anyOf/1
 */
@Serializable(with = InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe.Serializer::class)
public sealed class InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneAnyOf2X9fed5efe,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

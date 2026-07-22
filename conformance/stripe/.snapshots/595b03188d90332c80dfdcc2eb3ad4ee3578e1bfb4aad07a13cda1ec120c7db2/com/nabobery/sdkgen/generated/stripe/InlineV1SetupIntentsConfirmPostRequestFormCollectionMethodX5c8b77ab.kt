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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options/prop
 * erties/collection_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options/prop
 * erties/collection_method
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `paper`.
     */
    public data object Paper : InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab() {
        public override val `value`: String = "paper"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab =
            when (value) {
                Value.value -> Value
                Paper.value -> Paper
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormCollectionMethodX5c8b77ab,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

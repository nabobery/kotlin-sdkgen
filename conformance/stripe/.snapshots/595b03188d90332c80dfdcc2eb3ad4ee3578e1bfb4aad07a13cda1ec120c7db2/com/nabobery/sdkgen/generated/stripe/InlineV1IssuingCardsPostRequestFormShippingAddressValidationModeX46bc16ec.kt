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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/shipping/properties/address_validation/properties/mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/shipping/properties/address_validation/properties/mode
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `disabled`.
     */
    public data object Disabled : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec() {
        public override val `value`: String = "disabled"
    }

    /**
     * Documented value. Wire value: `normalization_only`.
     */
    public data object NormalizationOnly : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec() {
        public override val `value`: String = "normalization_only"
    }

    /**
     * Documented value. Wire value: `validation_and_normalization`.
     */
    public data object ValidationAndNormalization : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec() {
        public override val `value`: String = "validation_and_normalization"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec =
            when (value) {
                Disabled.value -> Disabled
                NormalizationOnly.value -> NormalizationOnly
                ValidationAndNormalization.value -> ValidationAndNormalization
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardsPostRequestFormShippingAddressValidationModeX46bc16ec,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

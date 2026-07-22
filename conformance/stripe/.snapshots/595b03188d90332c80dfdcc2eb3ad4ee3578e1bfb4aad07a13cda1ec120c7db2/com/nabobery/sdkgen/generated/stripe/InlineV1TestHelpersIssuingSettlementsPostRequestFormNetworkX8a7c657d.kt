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
 * The card network for this settlement. One of ["visa", "maestro", "mastercard"]
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1settlements/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/network
 */
@Serializable(with = InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d.Serializer::class)
public sealed class InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `maestro`.
     */
    public data object Maestro : InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d() {
        public override val `value`: String = "maestro"
    }

    /**
     * Documented value. Wire value: `visa`.
     */
    public data object Visa : InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d() {
        public override val `value`: String = "visa"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d =
            when (value) {
                Maestro.value -> Maestro
                Visa.value -> Visa
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuingSettlementsPostRequestFormNetworkX8a7c657d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/swish/properties/display_preference/properties/preference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/swish/properties/display_preference/properties/preference
 */
@Serializable(with = InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc.Serializer::class)
public sealed class InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc() {
        public override val `value`: String = "none"
    }

    /**
     * Documented value. Wire value: `off`.
     */
    public data object Off : InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc() {
        public override val `value`: String = "off"
    }

    /**
     * Documented value. Wire value: `on`.
     */
    public data object On : InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc() {
        public override val `value`: String = "on"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc =
            when (value) {
                None.value -> None
                Off.value -> Off
                On.value -> On
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfidc49PostRequestFormSwishPreferenceXa0145dcc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

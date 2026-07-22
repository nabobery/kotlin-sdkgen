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
 * Where the user is coming from. This informs the optimizations that are applied to the session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/origin_context
 */
@Serializable(with = InlineCheckoutSessionOriginContextX589615b9.Serializer::class)
public sealed class InlineCheckoutSessionOriginContextX589615b9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `mobile_app`.
     */
    public data object MobileApp : InlineCheckoutSessionOriginContextX589615b9() {
        public override val `value`: String = "mobile_app"
    }

    /**
     * Documented value. Wire value: `web`.
     */
    public data object Web : InlineCheckoutSessionOriginContextX589615b9() {
        public override val `value`: String = "web"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutSessionOriginContextX589615b9()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutSessionOriginContextX589615b9 =
            when (value) {
                MobileApp.value -> MobileApp
                Web.value -> Web
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionOriginContextX589615b9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionOriginContextX589615b9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionOriginContextX589615b9 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionOriginContextX589615b9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * Source: sdkgen://source/openapi.json#/components/schemas/product_feature/properties/object
 */
@Serializable(with = InlineProductFeatureObjectValueXb9b8427f.Serializer::class)
public sealed class InlineProductFeatureObjectValueXb9b8427f {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `product_feature`.
     */
    public data object ProductFeature : InlineProductFeatureObjectValueXb9b8427f() {
        public override val `value`: String = "product_feature"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineProductFeatureObjectValueXb9b8427f()

    public companion object {
        public fun fromValue(`value`: String): InlineProductFeatureObjectValueXb9b8427f =
            when (value) {
                ProductFeature.value -> ProductFeature
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineProductFeatureObjectValueXb9b8427f> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineProductFeatureObjectValueXb9b8427f",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineProductFeatureObjectValueXb9b8427f =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineProductFeatureObjectValueXb9b8427f,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

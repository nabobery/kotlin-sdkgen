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
 * Source: sdkgen://source/openapi.json#/components/schemas/sigma.sigma_api_query/properties/object
 */
@Serializable(with = InlineSigmaSigmaApiQueryObjectValueXf64176a4.Serializer::class)
public sealed class InlineSigmaSigmaApiQueryObjectValueXf64176a4 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `sigma.sigma_api_query`.
     */
    public data object SigmaSigmaApiQuery : InlineSigmaSigmaApiQueryObjectValueXf64176a4() {
        public override val `value`: String = "sigma.sigma_api_query"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineSigmaSigmaApiQueryObjectValueXf64176a4()

    public companion object {
        public fun fromValue(`value`: String): InlineSigmaSigmaApiQueryObjectValueXf64176a4 =
            when (value) {
                SigmaSigmaApiQuery.value -> SigmaSigmaApiQuery
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineSigmaSigmaApiQueryObjectValueXf64176a4> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineSigmaSigmaApiQueryObjectValueXf64176a4",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineSigmaSigmaApiQueryObjectValueXf64176a4 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSigmaSigmaApiQueryObjectValueXf64176a4,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

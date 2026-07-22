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
 * Configures how the quantity per period should be determined. Can be either `metered` or `licensed`. `licensed`
 * automatically bills the `quantity` set when adding it to a subscription. `metered` aggregates the total usage based
 * on usage records. Defaults to `licensed`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/usage_type
 */
@Serializable(with = InlineV1PlansPostRequestFormUsageTypeXa1c111bc.Serializer::class)
public sealed class InlineV1PlansPostRequestFormUsageTypeXa1c111bc {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `licensed`.
     */
    public data object Licensed : InlineV1PlansPostRequestFormUsageTypeXa1c111bc() {
        public override val `value`: String = "licensed"
    }

    /**
     * Documented value. Wire value: `metered`.
     */
    public data object Metered : InlineV1PlansPostRequestFormUsageTypeXa1c111bc() {
        public override val `value`: String = "metered"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PlansPostRequestFormUsageTypeXa1c111bc()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PlansPostRequestFormUsageTypeXa1c111bc =
            when (value) {
                Licensed.value -> Licensed
                Metered.value -> Metered
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PlansPostRequestFormUsageTypeXa1c111bc> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormUsageTypeXa1c111bc",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormUsageTypeXa1c111bc =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PlansPostRequestFormUsageTypeXa1c111bc,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

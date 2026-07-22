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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/dk/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/dk/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `ioss`.
     */
    public data object Ioss : InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d() {
        public override val `value`: String = "ioss"
    }

    /**
     * Documented value. Wire value: `oss_non_union`.
     */
    public data object OssNonUnion : InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d() {
        public override val `value`: String = "oss_non_union"
    }

    /**
     * Documented value. Wire value: `oss_union`.
     */
    public data object OssUnion : InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d() {
        public override val `value`: String = "oss_union"
    }

    /**
     * Documented value. Wire value: `standard`.
     */
    public data object Standard : InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d() {
        public override val `value`: String = "standard"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d =
            when (value) {
                Ioss.value -> Ioss
                OssNonUnion.value -> OssNonUnion
                OssUnion.value -> OssUnion
                Standard.value -> Standard
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkTypeX07529a3d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

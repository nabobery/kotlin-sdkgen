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
 * ded/schema/properties/country_options/properties/cr/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/cr/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `simplified`.
     */
    public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745() {
        public override val `value`: String = "simplified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745 =
            when (value) {
                Simplified.value -> Simplified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrTypeX8f5f2745,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

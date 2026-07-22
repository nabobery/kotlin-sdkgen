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
 * ded/schema/properties/country_options/properties/ke/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ke/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `simplified`.
     */
    public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a() {
        public override val `value`: String = "simplified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a =
            when (value) {
                Simplified.value -> Simplified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeTypeX0ff1943a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

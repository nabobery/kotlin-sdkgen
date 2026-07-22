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
 * ded/schema/properties/country_options/properties/co/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/co/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `simplified`.
     */
    public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9() {
        public override val `value`: String = "simplified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9 =
            when (value) {
                Simplified.value -> Simplified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoTypeX0c838bb9,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * ded/schema/properties/country_options/properties/tj/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/tj/properties/type
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `simplified`.
     */
    public data object Simplified : InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551() {
        public override val `value`: String = "simplified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551 =
            when (value) {
                Simplified.value -> Simplified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjTypeXbdddb551,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

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
 * Source: sdkgen://source/openapi.json#/components/schemas/country_spec/properties/object
 */
@Serializable(with = InlineCountrySpecObjectValueXd84f508b.Serializer::class)
public sealed class InlineCountrySpecObjectValueXd84f508b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `country_spec`.
     */
    public data object CountrySpec : InlineCountrySpecObjectValueXd84f508b() {
        public override val `value`: String = "country_spec"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCountrySpecObjectValueXd84f508b()

    public companion object {
        public fun fromValue(`value`: String): InlineCountrySpecObjectValueXd84f508b =
            when (value) {
                CountrySpec.value -> CountrySpec
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineCountrySpecObjectValueXd84f508b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCountrySpecObjectValueXd84f508b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCountrySpecObjectValueXd84f508b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCountrySpecObjectValueXd84f508b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

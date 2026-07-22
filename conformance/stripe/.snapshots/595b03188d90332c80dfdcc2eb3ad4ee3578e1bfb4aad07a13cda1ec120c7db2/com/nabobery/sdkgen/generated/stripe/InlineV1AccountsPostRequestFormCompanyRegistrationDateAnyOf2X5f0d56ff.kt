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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/registration_date/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/registration_date/anyOf/1
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff() {
        public override val `value`: String = ""
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff =
            when (value) {
                Value.value -> Value
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X5f0d56ff,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

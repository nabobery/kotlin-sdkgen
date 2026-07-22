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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document/anyOf/0/properties/allowed_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document/anyOf/0/properties/allowed_types/items
 */
@Serializable(with = InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb.Serializer::class)
public sealed class InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `driving_license`.
     */
    public data object DrivingLicense : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb() {
        public override val `value`: String = "driving_license"
    }

    /**
     * Documented value. Wire value: `id_card`.
     */
    public data object IdCard : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb() {
        public override val `value`: String = "id_card"
    }

    /**
     * Documented value. Wire value: `passport`.
     */
    public data object Passport : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb() {
        public override val `value`: String = "passport"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb =
            when (value) {
                DrivingLicense.value -> DrivingLicense
                IdCard.value -> IdCard
                Passport.value -> Passport
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}

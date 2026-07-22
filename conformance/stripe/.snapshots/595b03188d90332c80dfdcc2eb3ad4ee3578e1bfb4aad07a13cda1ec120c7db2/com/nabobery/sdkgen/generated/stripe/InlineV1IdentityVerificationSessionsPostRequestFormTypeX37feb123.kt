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
 * The type of [verification check](https://docs.stripe.com/identity/verification-checks) to be performed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/type
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123.Serializer::class)
public sealed class InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `document`.
     */
    public data object Document : InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123() {
        public override val `value`: String = "document"
    }

    /**
     * Documented value. Wire value: `id_number`.
     */
    public data object IdNumber : InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123() {
        public override val `value`: String = "id_number"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123()

    public companion object {
        public fun fromValue(`value`: String): InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123 =
            when (value) {
                Document.value -> Document
                IdNumber.value -> IdNumber
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IdentityVerificationSessionsPostRequestFormTypeX37feb123,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
